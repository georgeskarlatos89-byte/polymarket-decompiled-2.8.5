package io.intercom.android.sdk.utilities;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.ahh;
import defpackage.dmk;
import defpackage.ix2;
import defpackage.qp7;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class Phrase {
    private static final int EOF = 0;
    private char curChar;
    private int curCharIndex;
    private CharSequence formatted;
    private Token head;
    private final Set<String> keys = new HashSet();
    private final Map<String, CharSequence> keysToValues = new HashMap();
    private final CharSequence pattern;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class KeyToken extends Token {
        private final String key;
        private CharSequence value;

        public KeyToken(Token token, String str) {
            super(token);
            this.key = str;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            this.value = map.get(this.key);
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, g.d(formattedStart, 2, this.key), this.value);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public int getFormattedLength() {
            return this.value.length();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class LeftCurlyBracketToken extends Token {
        public LeftCurlyBracketToken(Token token) {
            super(token);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, formattedStart + 2, "{");
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public int getFormattedLength() {
            return 1;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static abstract class Token {
        Token next;
        private final Token prev;

        public Token(Token token) {
            this.prev = token;
            if (token != null) {
                token.next = this;
            }
        }

        public abstract void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map);

        public abstract int getFormattedLength();

        public final int getFormattedStart() {
            Token token = this.prev;
            if (token == null) {
                return 0;
            }
            return token.getFormattedStart() + this.prev.getFormattedLength();
        }
    }

    private Phrase(CharSequence charSequence) {
        this.curChar = charSequence.length() > 0 ? charSequence.charAt(0) : (char) 0;
        this.pattern = charSequence;
        Token token = null;
        while (true) {
            token = token(token);
            if (token != null) {
                if (this.head == null) {
                    this.head = token;
                }
            } else {
                return;
            }
        }
    }

    private void consume() {
        char charAt;
        int i = this.curCharIndex + 1;
        this.curCharIndex = i;
        if (i == this.pattern.length()) {
            charAt = 0;
        } else {
            charAt = this.pattern.charAt(this.curCharIndex);
        }
        this.curChar = charAt;
    }

    public static Phrase from(Fragment fragment, int i) {
        return from(fragment.getResources(), i);
    }

    private KeyToken key(Token token) {
        char c;
        StringBuilder sb = new StringBuilder();
        consume();
        while (true) {
            c = this.curChar;
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && c != '_' && (c < '0' || c > '9'))) {
                break;
            }
            sb.append(c);
            consume();
        }
        if (c == '}') {
            consume();
            if (sb.length() != 0) {
                String sb2 = sb.toString();
                this.keys.add(sb2);
                return new KeyToken(token, sb2);
            }
            qp7.i(this.pattern, "'", "Empty key: {} in '");
            return null;
        }
        qp7.i(this.pattern, "'", "Missing closing brace: } in '");
        return null;
    }

    private LeftCurlyBracketToken leftCurlyBracket(Token token) {
        consume();
        consume();
        return new LeftCurlyBracketToken(token);
    }

    private char lookahead() {
        if (this.curCharIndex < this.pattern.length() - 1) {
            return this.pattern.charAt(this.curCharIndex + 1);
        }
        return (char) 0;
    }

    private TextToken text(Token token) {
        int i = this.curCharIndex;
        while (true) {
            char c = this.curChar;
            if (c == '{' || c == 0) {
                break;
            }
            consume();
        }
        return new TextToken(token, this.curCharIndex - i);
    }

    private Token token(Token token) {
        char c = this.curChar;
        if (c == 0) {
            return null;
        }
        if (c == '{') {
            char lookahead = lookahead();
            if (lookahead == '{') {
                return leftCurlyBracket(token);
            }
            if (lookahead >= 'a' && lookahead <= 'z') {
                return key(token);
            }
            throw new IllegalArgumentException("Unexpected character '" + lookahead + "'; expected key in '" + ((Object) this.pattern) + "'");
        }
        return text(token);
    }

    public CharSequence format() {
        CharSequence charSequence = this.formatted;
        if (charSequence == null) {
            if (this.keysToValues.keySet().containsAll(this.keys)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.pattern);
                for (Token token = this.head; token != null; token = token.next) {
                    token.expand(spannableStringBuilder, this.keysToValues);
                }
                this.formatted = spannableStringBuilder;
                return spannableStringBuilder;
            }
            HashSet hashSet = new HashSet(this.keys);
            hashSet.removeAll(this.keysToValues.keySet());
            StringBuilder sb = new StringBuilder("Missing keys: ");
            sb.append(hashSet);
            CharSequence charSequence2 = this.pattern;
            sb.append(" in '");
            sb.append((Object) charSequence2);
            sb.append("'");
            throw new IllegalArgumentException(sb.toString());
        }
        return charSequence;
    }

    public void into(TextView textView) {
        if (textView != null) {
            textView.setText(format());
        } else {
            dmk.v("TextView must not be null.");
        }
    }

    public Phrase put(String str, CharSequence charSequence) {
        if (this.keys.contains(str)) {
            if (charSequence != null) {
                this.keysToValues.put(str, charSequence);
                this.formatted = null;
                return this;
            }
            ahh.n(ix2.s("Null value for '", str, "' in '"), this.pattern, "'");
            return null;
        }
        ahh.n(ix2.s("Key '", str, "' not found in '"), this.pattern, "'");
        return null;
    }

    public Phrase putOptional(String str, CharSequence charSequence) {
        if (this.keys.contains(str)) {
            return put(str, charSequence);
        }
        return this;
    }

    public String toString() {
        return this.pattern.toString();
    }

    public static Phrase from(View view, int i) {
        return from(view.getResources(), i);
    }

    public static Phrase from(Context context, int i) {
        return from(context.getResources(), i);
    }

    public static Phrase from(Resources resources, int i) {
        return from(resources.getText(i));
    }

    public static Phrase from(CharSequence charSequence) {
        return new Phrase(charSequence);
    }

    public Phrase putOptional(String str, int i) {
        return this.keys.contains(str) ? put(str, i) : this;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class TextToken extends Token {
        private final int textLength;

        public TextToken(Token token, int i) {
            super(token);
            this.textLength = i;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public int getFormattedLength() {
            return this.textLength;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
        }
    }

    public Phrase put(String str, int i) {
        return put(str, Integer.toString(i));
    }
}

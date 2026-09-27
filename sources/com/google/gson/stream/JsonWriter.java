package com.google.gson.stream;

import com.appsflyer.internal.l;
import com.google.gson.FormattingStyle;
import com.google.gson.Strictness;
import defpackage.ahh;
import defpackage.dmk;
import defpackage.fi9;
import defpackage.omf;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private String deferredName;
    private String formattedColon;
    private String formattedComma;
    private FormattingStyle formattingStyle;
    private boolean htmlSafe;
    private final Writer out;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;
    private Strictness strictness;
    private boolean usesEmptyNewlineAndIndent;
    private static final Pattern VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] REPLACEMENT_CHARS = new String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        push(6);
        this.strictness = Strictness.LEGACY_STRICT;
        this.serializeNulls = true;
        Objects.requireNonNull(writer, "out == null");
        this.out = writer;
        setFormattingStyle(FormattingStyle.COMPACT);
    }

    private static boolean alwaysCreatesValidJsonNumber(Class<? extends Number> cls) {
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            return false;
        }
        return true;
    }

    private void beforeName() {
        int peek = peek();
        if (peek == 5) {
            this.out.write(this.formattedComma);
        } else if (peek != 3) {
            dmk.n("Nesting problem.");
            return;
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() {
        int peek = peek();
        if (peek != 1) {
            if (peek != 2) {
                if (peek != 4) {
                    if (peek != 6) {
                        if (peek == 7) {
                            if (this.strictness != Strictness.LENIENT) {
                                dmk.n("JSON must have only one top-level value.");
                                return;
                            }
                        } else {
                            dmk.n("Nesting problem.");
                            return;
                        }
                    }
                    replaceTop(7);
                    return;
                }
                this.out.append((CharSequence) this.formattedColon);
                replaceTop(5);
                return;
            }
            this.out.append((CharSequence) this.formattedComma);
            newline();
            return;
        }
        replaceTop(2);
        newline();
    }

    private JsonWriter closeScope(int i, int i2, char c) {
        int peek = peek();
        if (peek != i2 && peek != i) {
            dmk.n("Nesting problem.");
            return null;
        }
        if (this.deferredName == null) {
            this.stackSize--;
            if (peek == i2) {
                newline();
            }
            this.out.write(c);
            return this;
        }
        omf.q(this.deferredName, "Dangling name: ");
        return null;
    }

    private void newline() {
        if (!this.usesEmptyNewlineAndIndent) {
            this.out.write(this.formattingStyle.getNewline());
            int i = this.stackSize;
            for (int i2 = 1; i2 < i; i2++) {
                this.out.write(this.formattingStyle.getIndent());
            }
        }
    }

    private JsonWriter openScope(int i, char c) {
        beforeValue();
        push(i);
        this.out.write(c);
        return this;
    }

    private int peek() {
        int i = this.stackSize;
        if (i != 0) {
            return this.stack[i - 1];
        }
        dmk.n("JsonWriter is closed.");
        return 0;
    }

    private void push(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            iArr = Arrays.copyOf(iArr, i2 * 2);
            this.stack = iArr;
        }
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr[i3] = i;
    }

    private void replaceTop(int i) {
        this.stack[this.stackSize - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void string(String str) {
        String[] strArr;
        String str2;
        if (this.htmlSafe) {
            strArr = HTML_SAFE_REPLACEMENT_CHARS;
        } else {
            strArr = REPLACEMENT_CHARS;
        }
        this.out.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i < i2) {
                    this.out.write(str, i, i2 - i);
                }
                this.out.write(str2);
                i = i2 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                this.out.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.out.write(str, i, length - i);
        }
        this.out.write(34);
    }

    private void writeDeferredName() {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public JsonWriter beginArray() {
        writeDeferredName();
        return openScope(1, '[');
    }

    public JsonWriter beginObject() {
        writeDeferredName();
        return openScope(3, '{');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
        int i = this.stackSize;
        if (i <= 1 && (i != 1 || this.stack[i - 1] == 7)) {
            this.stackSize = 0;
        } else {
            dmk.x("Incomplete document");
        }
    }

    public JsonWriter endArray() {
        return closeScope(1, 2, ']');
    }

    public JsonWriter endObject() {
        return closeScope(3, 5, '}');
    }

    public void flush() {
        if (this.stackSize != 0) {
            this.out.flush();
        } else {
            dmk.n("JsonWriter is closed.");
        }
    }

    public final FormattingStyle getFormattingStyle() {
        return this.formattingStyle;
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final Strictness getStrictness() {
        return this.strictness;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        if (this.strictness == Strictness.LENIENT) {
            return true;
        }
        return false;
    }

    public JsonWriter jsonValue(String str) {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((CharSequence) str);
        return this;
    }

    public JsonWriter name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.deferredName == null) {
            int peek = peek();
            if (peek != 3 && peek != 5) {
                dmk.n("Please begin an object before writing a name.");
                return null;
            }
            this.deferredName = str;
            return this;
        }
        dmk.n("Already wrote a name, expecting a value.");
        return null;
    }

    public JsonWriter nullValue() {
        if (this.deferredName != null) {
            if (this.serializeNulls) {
                writeDeferredName();
            } else {
                this.deferredName = null;
                return this;
            }
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public final void setFormattingStyle(FormattingStyle formattingStyle) {
        boolean z;
        Objects.requireNonNull(formattingStyle);
        this.formattingStyle = formattingStyle;
        this.formattedComma = ",";
        if (formattingStyle.usesSpaceAfterSeparators()) {
            this.formattedColon = ": ";
            if (this.formattingStyle.getNewline().isEmpty()) {
                this.formattedComma = ", ";
            }
        } else {
            this.formattedColon = ":";
        }
        if (this.formattingStyle.getNewline().isEmpty() && this.formattingStyle.getIndent().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.usesEmptyNewlineAndIndent = z;
    }

    public final void setHtmlSafe(boolean z) {
        this.htmlSafe = z;
    }

    public final void setIndent(String str) {
        if (str.isEmpty()) {
            setFormattingStyle(FormattingStyle.COMPACT);
        } else {
            setFormattingStyle(FormattingStyle.PRETTY.withIndent(str));
        }
    }

    @Deprecated
    public final void setLenient(boolean z) {
        Strictness strictness;
        if (z) {
            strictness = Strictness.LENIENT;
        } else {
            strictness = Strictness.LEGACY_STRICT;
        }
        setStrictness(strictness);
    }

    public final void setSerializeNulls(boolean z) {
        this.serializeNulls = z;
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.strictness = strictness;
    }

    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (!alwaysCreatesValidJsonNumber(cls)) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !VALID_JSON_NUMBER_PATTERN.matcher(obj).matches()) {
                    ahh.j("String created by ", cls, " is not a valid JSON number: ", obj);
                    return null;
                }
            } else if (this.strictness != Strictness.LENIENT) {
                dmk.v("Numeric values must be finite, but was ".concat(obj));
                return null;
            }
        }
        beforeValue();
        this.out.append((CharSequence) obj);
        return this;
    }

    public JsonWriter value(boolean z) {
        writeDeferredName();
        beforeValue();
        this.out.write(z ? "true" : "false");
        return this;
    }

    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public JsonWriter value(float f) {
        writeDeferredName();
        if (this.strictness != Strictness.LENIENT && (Float.isNaN(f) || Float.isInfinite(f))) {
            fi9.h("Numeric values must be finite, but was ", f);
            return null;
        }
        beforeValue();
        this.out.append((CharSequence) Float.toString(f));
        return this;
    }

    public JsonWriter value(double d) {
        writeDeferredName();
        if (this.strictness != Strictness.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            l.h(d, "Numeric values must be finite, but was ");
            return null;
        }
        beforeValue();
        this.out.append((CharSequence) Double.toString(d));
        return this;
    }

    public JsonWriter value(long j) {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j));
        return this;
    }

    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }
}

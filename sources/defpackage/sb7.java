package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sb7 implements InputFilter {
    public final TextView a;
    public rb7 b;

    public sb7(TextView textView) {
        this.a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (!textView.isInEditMode()) {
            int c = jb7.a().c();
            if (c != 0) {
                if (c == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return jb7.a().g(0, charSequence.length(), 0, charSequence);
                    }
                }
            }
            jb7 a = jb7.a();
            rb7 rb7Var = this.b;
            if (rb7Var == null) {
                rb7Var = new rb7(textView, this);
                this.b = rb7Var;
            }
            a.h(rb7Var);
            return charSequence;
        }
        return charSequence;
    }
}

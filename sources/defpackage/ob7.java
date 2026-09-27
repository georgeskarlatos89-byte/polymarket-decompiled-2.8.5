package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ob7 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile ob7 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new yfh(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}

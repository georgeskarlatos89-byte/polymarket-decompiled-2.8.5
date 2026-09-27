package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a9k extends wzb {
    public final /* synthetic */ int e;

    public a9k(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.wzb
    public final Object c(View view) {
        switch (this.e) {
            case 0:
                return h9k.a(view);
            case 1:
                return j9k.b(view);
            default:
                return Boolean.valueOf(h9k.b(view));
        }
    }

    @Override // defpackage.wzb
    public final void d(View view, Object obj) {
        switch (this.e) {
            case 0:
                h9k.e(view, (CharSequence) obj);
                return;
            case 1:
                j9k.c(view, (CharSequence) obj);
                return;
            default:
                h9k.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // defpackage.wzb
    public final boolean g(Object obj, Object obj2) {
        boolean equals;
        boolean z;
        boolean z2;
        switch (this.e) {
            case 0:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 1:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z3 = false;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2) {
                    z3 = true;
                }
                return !z3;
        }
        return !equals;
    }
}

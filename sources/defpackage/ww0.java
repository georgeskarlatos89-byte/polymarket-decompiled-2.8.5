package defpackage;

import com.fingerprintjs.android.fpjs_pro.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ww0 extends cu7 {
    public final Integer a;

    public ww0(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cu7)) {
            return false;
        }
        Integer num = this.a;
        ww0 ww0Var = (ww0) ((cu7) obj);
        if (num == null) {
            if (ww0Var.a == null) {
                return true;
            }
            return false;
        }
        return num.equals(ww0Var.a);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return g.p(new StringBuilder("ExternalPRequestContext{originAssociatedProductId="), this.a, "}");
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p73 {
    public final yx9 a;
    public final pwi b;
    public final vp9 c;
    public final u25 d;
    public final uu9 e;

    static {
        int i = pwi.e;
        int i2 = yx9.g;
    }

    public p73(yx9 yx9Var, pwi pwiVar, vp9 vp9Var, u25 u25Var, uu9 uu9Var) {
        this.a = yx9Var;
        this.b = pwiVar;
        this.c = vp9Var;
        this.d = u25Var;
        this.e = uu9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p73) {
                p73 p73Var = (p73) obj;
                if (!Intrinsics.areEqual(this.a, p73Var.a) || !Intrinsics.areEqual(this.b, p73Var.b) || !Intrinsics.areEqual(this.c, p73Var.c) || !Intrinsics.areEqual(this.d, p73Var.d) || !Intrinsics.areEqual(this.e, p73Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CardNumberComponentStyle(inputStyle=" + this.a + ", infoTextStyle=" + this.b + ", infoImageStyle=" + this.c + ", containerStyle=" + this.d + ", infoBottomSheetStyle=" + this.e + ")";
    }
}

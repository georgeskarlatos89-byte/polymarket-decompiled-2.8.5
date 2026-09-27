package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ot4 extends pt4 {
    public final et4 a;
    public final kh9 b;

    public ot4(et4 et4Var, kh9 kh9Var) {
        this.a = et4Var;
        this.b = kh9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ot4) {
                ot4 ot4Var = (ot4) obj;
                if (!Intrinsics.areEqual(this.a, ot4Var.a) || !Intrinsics.areEqual(this.b, ot4Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        kh9 kh9Var = this.b;
        if (kh9Var == null) {
            hashCode = 0;
        } else {
            hashCode = kh9Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Success(configuration=" + this.a + ", timing=" + this.b + ")";
    }
}

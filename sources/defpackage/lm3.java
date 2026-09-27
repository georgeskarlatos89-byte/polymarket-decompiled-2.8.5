package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class lm3 implements mm3 {
    public final String a;
    public final vm3 b;

    public lm3(String str, vm3 vm3Var) {
        this.a = str;
        this.b = vm3Var;
    }

    @Override // defpackage.mm3
    public final Function0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lm3) {
                lm3 lm3Var = (lm3) obj;
                if (!Intrinsics.areEqual(this.a, lm3Var.a) || !Intrinsics.areEqual(this.b, lm3Var.b)) {
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
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "Team(logoUrl=" + this.a + ", onClick=" + this.b + ")";
    }
}

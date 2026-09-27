package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rk4 {
    public static final rk4 c = new rk4(null, null, 511);
    public final Function2 a;
    public final Function2 b;

    public rk4(b93 b93Var, d93 d93Var, int i) {
        b93Var = (i & 16) != 0 ? null : b93Var;
        d93Var = (i & 32) != 0 ? null : d93Var;
        this.a = b93Var;
        this.b = d93Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rk4) {
                rk4 rk4Var = (rk4) obj;
                if (!Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.a, rk4Var.a) || !Intrinsics.areEqual(this.b, rk4Var.b) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null)) {
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
        int i = 0;
        Function2 function2 = this.a;
        if (function2 == null) {
            hashCode = 0;
        } else {
            hashCode = function2.hashCode();
        }
        int i2 = hashCode * 31;
        Function2 function22 = this.b;
        if (function22 != null) {
            i = function22.hashCode();
        }
        return (i2 + i) * 29791;
    }

    public final String toString() {
        return "ComponentCallback(onReady=null, onChange=null, onSubmit=null, onSuccess=null, onError=" + this.a + ", onTokenized=" + this.b + ", onCardBinChanged=null, handleSubmit=null, handleTap=null)";
    }
}

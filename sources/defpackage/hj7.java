package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hj7 implements rp9 {
    public final km9 a;
    public final gp9 b;
    public final Throwable c;

    public hj7(km9 km9Var, gp9 gp9Var, Throwable th) {
        this.a = km9Var;
        this.b = gp9Var;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hj7) {
                hj7 hj7Var = (hj7) obj;
                if (!Intrinsics.areEqual(this.a, hj7Var.a) || !Intrinsics.areEqual(this.b, hj7Var.b) || !Intrinsics.areEqual(this.c, hj7Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.rp9
    public final gp9 getRequest() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode;
        km9 km9Var = this.a;
        if (km9Var == null) {
            hashCode = 0;
        } else {
            hashCode = km9Var.hashCode();
        }
        int hashCode2 = this.b.hashCode();
        return this.c.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    @Override // defpackage.rp9
    public final km9 n() {
        return this.a;
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }
}

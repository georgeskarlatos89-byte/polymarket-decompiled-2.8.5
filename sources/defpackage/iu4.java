package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class iu4 implements ku4 {
    public final Throwable a;
    public final d3g b;
    public final bv4 c;

    public iu4(Throwable th, d3g d3gVar, bv4 bv4Var) {
        this.a = th;
        this.b = d3gVar;
        this.c = bv4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iu4) {
                iu4 iu4Var = (iu4) obj;
                if (!Intrinsics.areEqual(this.a, iu4Var.a) || !Intrinsics.areEqual(this.b, iu4Var.b) || !Intrinsics.areEqual(this.c, iu4Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Fail(cause=" + this.a + ", message=" + this.b + ", errorType=" + this.c + ")";
    }
}

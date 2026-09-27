package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class cv4 implements ev4 {
    public final Throwable a;
    public final d3g b;
    public final bv4 c;

    public cv4(Throwable th, d3g d3gVar, bv4 bv4Var) {
        th.getClass();
        this.a = th;
        this.b = d3gVar;
        this.c = bv4Var;
    }

    @Override // defpackage.ev4
    public final void a(trb trbVar) {
        trbVar.getClass();
        trbVar.d("ConfirmationHandler.Result.Failed", this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cv4) {
                cv4 cv4Var = (cv4) obj;
                if (!Intrinsics.areEqual(this.a, cv4Var.a) || !Intrinsics.areEqual(this.b, cv4Var.b) || !Intrinsics.areEqual(this.c, cv4Var.c)) {
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
        return "Failed(cause=" + this.a + ", message=" + this.b + ", type=" + this.c + ")";
    }
}

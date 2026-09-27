package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class dv4 implements ev4 {
    public final c8i a;
    public final toc b;
    public final boolean c;

    public dv4(c8i c8iVar, toc tocVar, boolean z) {
        c8iVar.getClass();
        tocVar.getClass();
        this.a = c8iVar;
        this.b = tocVar;
        this.c = z;
    }

    @Override // defpackage.ev4
    public final void a(trb trbVar) {
        trbVar.getClass();
        trbVar.f("ConfirmationHandler.Result.Succeeded");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dv4) {
                dv4 dv4Var = (dv4) obj;
                if (!Intrinsics.areEqual(this.a, dv4Var.a) || !Intrinsics.areEqual(this.b, dv4Var.b) || this.c != dv4Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Succeeded(intent=");
        sb.append(this.a);
        sb.append(", metadata=");
        sb.append(this.b);
        sb.append(", completedFullPaymentFlow=");
        return ix2.r(sb, this.c, ")");
    }
}

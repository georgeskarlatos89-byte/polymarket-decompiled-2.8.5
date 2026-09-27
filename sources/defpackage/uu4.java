package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class uu4 implements ev4 {
    public final tu4 a;

    public uu4(tu4 tu4Var) {
        tu4Var.getClass();
        this.a = tu4Var;
    }

    @Override // defpackage.ev4
    public final void a(trb trbVar) {
        trbVar.getClass();
        trbVar.f("ConfirmationHandler.Result.Canceled: " + this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof uu4) && this.a == ((uu4) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Canceled(action=" + this.a + ")";
    }
}

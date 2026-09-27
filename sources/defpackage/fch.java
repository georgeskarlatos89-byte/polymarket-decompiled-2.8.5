package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fch implements e47 {
    public final int a;

    public fch(int i) {
        this.a = i;
    }

    @Override // defpackage.e47, defpackage.la0
    public final e5k a(tfj tfjVar) {
        return new dm0(this.a, 12);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fch) && ((fch) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // defpackage.la0
    public final /* bridge */ /* synthetic */ c5k a(tfj tfjVar) {
        return a(tfjVar);
    }
}

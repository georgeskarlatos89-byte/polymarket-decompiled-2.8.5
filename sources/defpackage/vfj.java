package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class vfj extends wfj {
    public final /* synthetic */ wfj a;

    public vfj(wfj wfjVar) {
        this.a = wfjVar;
    }

    @Override // defpackage.wfj
    public final Object b(ufa ufaVar) {
        if (ufaVar.R() == ega.NULL) {
            ufaVar.G();
            return null;
        }
        return this.a.b(ufaVar);
    }

    @Override // defpackage.wfj
    public final void c(xga xgaVar, Object obj) {
        if (obj == null) {
            xgaVar.y();
        } else {
            this.a.c(xgaVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a + "]";
    }
}

package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class thd extends j0d {
    public final uhd h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thd(uhd uhdVar, m0d m0dVar) {
        super(m0dVar, uhdVar.isEnabled(), 0);
        m0dVar.getClass();
        this.h = uhdVar;
        this.i = true;
    }

    @Override // defpackage.j0d
    public final void a() {
        this.h.handleOnBackCancelled();
    }

    @Override // defpackage.j0d
    public final void b() {
        this.h.handleOnBackPressed();
    }

    @Override // defpackage.j0d
    public final void c(g0d g0dVar) {
        this.h.handleOnBackProgressed(new m21(g0dVar));
    }

    @Override // defpackage.j0d
    public final void d(g0d g0dVar) {
        g0dVar.getClass();
        this.h.handleOnBackStarted(new m21(g0dVar));
    }

    public final void h(boolean z) {
        boolean z2;
        this.i = z;
        if (z && this.h.isEnabled()) {
            z2 = true;
        } else {
            z2 = false;
        }
        g(z2);
    }
}

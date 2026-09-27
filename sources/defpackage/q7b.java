package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q7b implements k7b {
    public final /* synthetic */ p6b a;
    public final /* synthetic */ gw8 b;

    public q7b(gw8 gw8Var, p6b p6bVar) {
        this.b = gw8Var;
        this.a = p6bVar;
    }

    @Override // defpackage.k7b
    public final void onDestroy() {
        this.b.a.remove(this.a);
    }

    @Override // defpackage.k7b
    public final void onStart() {
    }

    @Override // defpackage.k7b
    public final void onStop() {
    }
}

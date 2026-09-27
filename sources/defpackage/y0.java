package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class y0 extends a1 {
    @Override // defpackage.a1
    public final Object i(Object obj, Throwable th) {
        ym0 ym0Var = (ym0) obj;
        ujb apply = ym0Var.apply(th);
        brn.l(apply, ym0Var, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
        return apply;
    }

    @Override // defpackage.a1
    public final void j(Object obj) {
        setFuture((ujb) obj);
    }
}

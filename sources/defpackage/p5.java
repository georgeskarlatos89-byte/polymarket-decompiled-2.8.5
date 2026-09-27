package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class p5 extends r5 {
    @Override // defpackage.r5
    public final Object k(Object obj, Object obj2) {
        ym0 ym0Var = (ym0) obj;
        ujb apply = ym0Var.apply(obj2);
        brn.l(apply, ym0Var, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
        return apply;
    }

    @Override // defpackage.r5
    public final void l(Object obj) {
        setFuture((ujb) obj);
    }
}

package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class unf extends q55 {
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vnf m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unf(vnf vnfVar, q55 q55Var) {
        super(q55Var);
        this.m = vnfVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(0, this);
    }
}

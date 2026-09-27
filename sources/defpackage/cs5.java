package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class cs5 extends q55 {
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ es5 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs5(es5 es5Var, q55 q55Var) {
        super(q55Var);
        this.m = es5Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.selectReactionById(0, this);
    }
}

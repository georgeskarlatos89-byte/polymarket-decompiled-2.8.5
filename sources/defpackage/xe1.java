package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xe1 extends q55 {
    public Object k;
    public vug l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ze1 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe1(ze1 ze1Var, q55 q55Var) {
        super(q55Var);
        this.n = ze1Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.decode(this);
    }
}

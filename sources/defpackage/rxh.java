package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rxh extends q55 {
    public vug k;
    public /* synthetic */ Object l;
    public final /* synthetic */ sxh m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxh(sxh sxhVar, q55 q55Var) {
        super(q55Var);
        this.m = sxhVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.decode(this);
    }
}

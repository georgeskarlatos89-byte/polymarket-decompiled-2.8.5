package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p3h extends q55 {
    public /* synthetic */ Object k;
    public final /* synthetic */ q3h l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3h(q3h q3hVar, q55 q55Var) {
        super(q55Var);
        this.l = q3hVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.shouldMigrate(null, this);
    }
}

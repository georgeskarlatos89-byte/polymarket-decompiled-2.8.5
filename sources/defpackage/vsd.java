package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vsd extends q55 {
    public /* synthetic */ Object k;
    public final /* synthetic */ wsd l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsd(wsd wsdVar, q55 q55Var) {
        super(q55Var);
        this.l = wsdVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, 0.0f, this);
    }
}

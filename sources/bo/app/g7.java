package bo.app;

import defpackage.q55;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g7 extends q55 {
    public /* synthetic */ Object a;
    public final /* synthetic */ i7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(i7 i7Var, q55 q55Var) {
        super(q55Var);
        this.b = i7Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}

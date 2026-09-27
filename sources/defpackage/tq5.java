package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tq5 extends q55 {
    public Map k;
    public /* synthetic */ Object l;
    public final /* synthetic */ uq5 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq5(uq5 uq5Var, q55 q55Var) {
        super(q55Var);
        this.m = uq5Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.A(this);
    }
}

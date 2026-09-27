package defpackage;

import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wz4 extends q55 {
    public Ref.ObjectRef k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xz4 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz4(xz4 xz4Var, q55 q55Var) {
        super(q55Var);
        this.m = xz4Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(this);
    }
}

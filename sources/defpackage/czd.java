package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class czd extends Lambda implements Function2 {
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ kjc j;
    public final /* synthetic */ cs1 k;
    public final /* synthetic */ es1 l;
    public final /* synthetic */ float m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czd(Function0 function0, String str, kjc kjcVar, cs1 cs1Var, es1 es1Var, float f, boolean z, int i) {
        super(2);
        this.h = function0;
        this.i = str;
        this.j = kjcVar;
        this.k = cs1Var;
        this.l = es1Var;
        this.m = f;
        this.n = z;
        this.o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        bmn.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, (pq4) obj, rtn.a(this.o | 1));
        return Unit.INSTANCE;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class y10 extends Lambda implements Function0 {
    public final /* synthetic */ ns6 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ js6 j;
    public final /* synthetic */ owa k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y10(ns6 ns6Var, Function0 function0, js6 js6Var, owa owaVar) {
        super(0);
        this.h = ns6Var;
        this.i = function0;
        this.j = js6Var;
        this.k = owaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.h.e(this.i, this.j, this.k);
        return Unit.INSTANCE;
    }
}

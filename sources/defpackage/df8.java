package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class df8 extends jjc implements gf8 {
    public Function1 o;
    public ng8 p;

    @Override // defpackage.gf8
    public final void v0(ng8 ng8Var) {
        if (!Intrinsics.areEqual(this.p, ng8Var)) {
            this.p = ng8Var;
            this.o.invoke(ng8Var);
        }
    }
}

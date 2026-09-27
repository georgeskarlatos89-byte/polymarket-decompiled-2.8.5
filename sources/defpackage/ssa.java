package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ssa extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ bv2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ssa(bv2 bv2Var, int i) {
        super(1);
        this.h = i;
        this.i = bv2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        bv2 bv2Var = this.i;
        switch (i) {
            case 0:
                bv2Var.cancel();
                return Unit.INSTANCE;
            case 1:
                bv2Var.cancel();
                return Unit.INSTANCE;
            default:
                bv2Var.cancel();
                return Unit.INSTANCE;
        }
    }
}

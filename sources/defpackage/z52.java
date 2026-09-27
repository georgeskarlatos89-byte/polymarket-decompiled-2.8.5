package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class z52 implements eb8 {
    public final /* synthetic */ Ref.b a;
    public final /* synthetic */ ca2 b;
    public final /* synthetic */ qqc c;
    public final /* synthetic */ qqc d;

    public z52(Ref.b bVar, ca2 ca2Var, qqc qqcVar, qqc qqcVar2) {
        this.a = bVar;
        this.b = ca2Var;
        this.c = qqcVar;
        this.d = qqcVar2;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        DesignTokens.Haptic haptic;
        boolean z;
        boolean z2;
        int intValue = ((Number) obj).intValue();
        Integer num = (Integer) this.c.getValue();
        Ref.b bVar = this.a;
        boolean z3 = false;
        if (num != null) {
            if (bVar.a <= num.intValue()) {
                z = true;
            } else {
                z = false;
            }
            if (intValue <= num.intValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                z3 = true;
            }
        }
        bVar.a = intValue;
        if (z3) {
            haptic = DesignTokens.Haptic.medium;
        } else {
            haptic = DesignTokens.Haptic.selection;
        }
        this.b.a(haptic);
        Function1 function1 = (Function1) this.d.getValue();
        if (function1 != null) {
            function1.invoke(new Integer(intValue));
        }
        return Unit.INSTANCE;
    }
}

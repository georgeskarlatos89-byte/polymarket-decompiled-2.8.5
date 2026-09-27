package defpackage;

import com.polymarket.designtokens.DesignTokens;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ya implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca2 b;
    public final /* synthetic */ qqc c;

    public /* synthetic */ ya(ca2 ca2Var, qqc qqcVar, int i) {
        this.a = i;
        this.b = ca2Var;
        this.c = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object b;
        Object b2;
        int i = this.a;
        qqc qqcVar = this.c;
        ca2 ca2Var = this.b;
        Integer num = (Integer) obj;
        num.getClass();
        switch (i) {
            case 0:
                ca2Var.a(DesignTokens.Haptic.selection);
                if (((Set) qqcVar.getValue()).contains(num)) {
                    b = fd7.a;
                } else {
                    b = vzg.b(num);
                }
                qqcVar.setValue(b);
                return Unit.INSTANCE;
            default:
                ca2Var.a(DesignTokens.Haptic.selection);
                if (((Set) qqcVar.getValue()).contains(num)) {
                    b2 = fd7.a;
                } else {
                    b2 = vzg.b(num);
                }
                qqcVar.setValue(b2);
                return Unit.INSTANCE;
        }
    }
}

package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f52 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca2 b;
    public final /* synthetic */ qqc c;

    public /* synthetic */ f52(ca2 ca2Var, qqc qqcVar, int i) {
        this.a = i;
        this.b = ca2Var;
        this.c = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        qqc qqcVar = this.c;
        ca2 ca2Var = this.b;
        switch (i) {
            case 0:
                ca2Var.a(DesignTokens.Haptic.selection);
                qqcVar.setValue(Boolean.valueOf(!((Boolean) qqcVar.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 1:
                ca2Var.a(DesignTokens.Haptic.selection);
                qqcVar.setValue(Boolean.valueOf(!((Boolean) qqcVar.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 2:
                ca2Var.a(DesignTokens.Haptic.selection);
                qqcVar.setValue(Boolean.valueOf(!((Boolean) qqcVar.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 3:
                ca2Var.a(DesignTokens.Haptic.selection);
                qqcVar.setValue(Boolean.valueOf(!((Boolean) qqcVar.getValue()).booleanValue()));
                return Unit.INSTANCE;
            default:
                ca2Var.a(DesignTokens.Haptic.light);
                qqcVar.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
        }
    }
}

package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class yb2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ca2 c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ yb2(boolean z, ca2 ca2Var, Function0 function0, int i) {
        this.a = i;
        this.b = z;
        this.c = ca2Var;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                if (this.b) {
                    this.c.a(DesignTokens.Haptic.selection);
                    this.d.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                if (this.b) {
                    this.c.a(DesignTokens.Haptic.selection);
                    this.d.invoke();
                }
                return Unit.INSTANCE;
            default:
                if (!this.b) {
                    this.c.a(DesignTokens.Haptic.selection);
                    this.d.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}

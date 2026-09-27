package defpackage;

import com.polymarket.data.APIEventTag;
import com.polymarket.designtokens.DesignTokens;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class mmb implements Function0 {
    public final /* synthetic */ ca2 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ APIEventTag c;

    public mmb(ca2 ca2Var, Function1 function1, APIEventTag aPIEventTag) {
        this.a = ca2Var;
        this.b = function1;
        this.c = aPIEventTag;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.a(DesignTokens.Haptic.selection);
        this.b.invoke(this.c.getSlug());
        return Unit.INSTANCE;
    }
}

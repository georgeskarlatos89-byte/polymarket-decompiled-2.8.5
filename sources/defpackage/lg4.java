package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class lg4 implements eb8 {
    public final /* synthetic */ ca2 a;

    public lg4(ca2 ca2Var) {
        this.a = ca2Var;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        this.a.a(DesignTokens.Haptic.light);
        return Unit.INSTANCE;
    }
}

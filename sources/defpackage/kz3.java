package defpackage;

import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.google.mlkit.common.MlKitException;
import com.polymarket.data.EFeatureFlagKey;
import com.polymarket.data.EUser;
import com.polymarket.usviewmodels.ActionsBridge;
import com.polymarket.usviewmodels.ComboDetailViewModel;
import com.polymarket.usviewmodels.EFeatureFlagBridge;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class kz3 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ kz3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return CheckoutKMPRememberMe.g();
            case 1:
                return CheckoutKMPRememberMe.e();
            case 2:
                return CheckoutRememberMe.b();
            case 3:
                kvd kvdVar = ss.a;
                qs.a();
                return Unit.INSTANCE;
            case 4:
                return Unit.INSTANCE;
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Boolean.valueOf(EFeatureFlagBridge.INSTANCE.bool(EFeatureFlagKey.auth0HTTPSCallbackEnabled));
            case 7:
                return Boolean.valueOf(EFeatureFlagBridge.INSTANCE.bool(EFeatureFlagKey.androidDocvStableActivity));
            case 8:
                return Boolean.valueOf(EFeatureFlagBridge.INSTANCE.bool(EFeatureFlagKey.googlePay));
            case 9:
                return Boolean.valueOf(EFeatureFlagBridge.INSTANCE.bool(EFeatureFlagKey.creditCards));
            case 10:
                return Boolean.valueOf(EFeatureFlagBridge.INSTANCE.bool(EFeatureFlagKey.intercomSupport));
            case 11:
                EUser user = ActionsBridge.INSTANCE.getUser();
                if (user != null) {
                    return user.getUserId();
                }
                return null;
            case 12:
                return yb4.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
            case 13:
                return ic4.d(0L, 0L, 0L, 0L, 4095);
            case 14:
                return ComboDetailViewModel.Callbacks.d();
            case 15:
                return ComboDetailViewModel.Callbacks.a();
            case 16:
                return Unit.INSTANCE;
            case 17:
                return Boolean.FALSE;
            case MlKitException.UNSUPPORTED /* 18 */:
                return Unit.INSTANCE;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                return Unit.INSTANCE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                return new so4(0);
            default:
                throw new IllegalStateException("No local ImageTransformer");
        }
    }
}

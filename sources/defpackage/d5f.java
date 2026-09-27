package defpackage;

import com.google.mlkit.common.MlKitException;
import com.polymarket.usviewmodels.ProfileSettingsTradingLimitsViewModel;
import com.polymarket.usviewmodels.ProfileSettingsViewModel;
import com.polymarket.usviewmodels.PromoBannerViewModel;
import com.polymarket.usviewmodels.SettingsPrivacyViewModel;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.PrivacyPolicyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class d5f implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ d5f(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j;
        long j2;
        long j3;
        long j4;
        switch (this.a) {
            case 0:
                if ((31 & 1) != 0) {
                    j = ib4.m;
                } else {
                    j = 0;
                }
                if ((31 & 2) != 0) {
                    j2 = ib4.m;
                } else {
                    j2 = 0;
                }
                if ((31 & 4) != 0) {
                    j3 = ib4.m;
                } else {
                    j3 = 0;
                }
                if ((31 & 8) != 0) {
                    j4 = ib4.m;
                } else {
                    j4 = 0;
                }
                return new k4f(j, j2, j3, j4, ib4.m);
            case 1:
                return new a5f(Float.NaN, Float.NaN, Float.NaN);
            case 2:
                return new g5f(null, cyi.c);
            case 3:
                return PrivacyPolicyKt.a();
            case 4:
                return new Object();
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return new SettingsPrivacyViewModel();
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return ProfileSettingsTradingLimitsViewModel.Callbacks.a();
            case 17:
                return ProfileSettingsViewModel.Callbacks.k();
            case MlKitException.UNSUPPORTED /* 18 */:
                return ProfileSettingsViewModel.Callbacks.f();
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return ProfileSettingsViewModel.Callbacks.c();
            case 20:
                return ProfileSettingsViewModel.Callbacks.l();
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ProfileSettingsViewModel.Callbacks.d();
            case 22:
                return ProfileSettingsViewModel.Callbacks.n();
            case 23:
                return ProfileSettingsViewModel.Callbacks.g();
            case 24:
                return ProfileSettingsViewModel.Callbacks.e();
            case 25:
                return ProfileSettingsViewModel.Callbacks.j();
            case 26:
                return ProfileSettingsViewModel.Callbacks.a();
            case 27:
                return ProfileSettingsViewModel.Callbacks.i();
            case 28:
                return ProfileSettingsViewModel.Callbacks.m();
            default:
                return PromoBannerViewModel.Callbacks.a();
        }
    }
}

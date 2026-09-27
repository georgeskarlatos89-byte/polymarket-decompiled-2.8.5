package defpackage;

import com.braze.push.NotificationTrampolineActivity;
import com.google.mlkit.common.MlKitException;
import com.polymarket.appwebview.PackageSupportKt;
import com.polymarket.usviewmodels.NotificationsFeedViewModel;
import com.polymarket.usviewmodels.OddsFormatViewModel;
import com.polymarket.usviewmodels.OnboardingProfileViewModel;
import com.polymarket.usviewmodels.OnboardingReferralCodeViewModel;
import com.polymarket.usviewmodels.OnboardingViewModel;
import com.stripe.android.financialconnections.model.OwnershipRefresh$Status;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class u2d implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ u2d(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vtj.a;
            case 1:
                return ikl.c(new c6d(false, 0.4f));
            case 2:
                return ikl.c(Boolean.FALSE);
            case 3:
                return Boolean.TRUE;
            case 4:
                return NotificationTrampolineActivity.d();
            case 5:
                return NotificationTrampolineActivity.a();
            case 6:
                return NotificationTrampolineActivity.b();
            case 7:
                return NotificationTrampolineActivity.g();
            case 8:
                return NotificationTrampolineActivity.e();
            case 9:
                return NotificationTrampolineActivity.f();
            case 10:
                return NotificationsFeedViewModel.Callbacks.b();
            case 11:
                return NotificationsFeedViewModel.Callbacks.a();
            case 12:
                return new bh7("com.stripe.android.ui.core.elements.OTPSpec", ved.INSTANCE, new Annotation[0]);
            case 13:
                return CollectionsKt.listOf(ji7.OTP_MAX_RETRIES_REACHED, ji7.OTP_EXPIRED);
            case 14:
                return OddsFormatViewModel.Callbacks.a();
            case 15:
                return new OkHttpClient.Builder().build();
            case 16:
                return new hv2(new OkHttpClient());
            case 17:
                return OnboardingProfileViewModel.Callbacks.a();
            case MlKitException.UNSUPPORTED /* 18 */:
                return OnboardingReferralCodeViewModel.Callbacks.a();
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new OnboardingViewModel(new OnboardingViewModel.Callbacks(null, new u2d(20), new ajd(3), 1, null), null, 2, null);
            case 20:
                return Unit.INSTANCE;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return OnboardingViewModel.Callbacks.b();
            case 22:
                return OnboardingViewModel.Callbacks.c();
            case 23:
                return ikl.c(Boolean.FALSE);
            case 24:
                return Unit.INSTANCE;
            case 25:
                return new yod();
            case 26:
                return OwnershipRefresh$Status.Companion.serializer();
            case 27:
                return OwnershipRefresh$Status.a();
            case 28:
                return PackageSupportKt.a();
            default:
                return com.polymarket.chartlogic.PackageSupportKt.a();
        }
    }
}

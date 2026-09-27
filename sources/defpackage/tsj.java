package defpackage;

import android.os.StatFs;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.ViewUtils;
import com.checkout.components.wallet.WalletComponentFactory;
import com.google.mlkit.common.MlKitException;
import com.polymarket.usviewmodels.USUserProfileViewModel;
import com.polymarket.usviewmodels.WaitlistEntryViewModel;
import com.polymarket.usviewmodels.WaitlistFlywheelViewModel;
import io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt;
import java.io.File;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class tsj implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ tsj(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return USUserProfileViewModel.e();
            case 1:
                return USUserProfileViewModel.d();
            case 2:
                return USUserProfileViewModel.h();
            case 3:
                return USUserProfileViewModel.Companion.c();
            case 4:
                return USUserProfileViewModel.Companion.e();
            case 5:
                return USUserProfileViewModel.Companion.f();
            case 6:
                return USUserProfileViewModel.Companion.g();
            case 7:
                return ikl.c(Boolean.FALSE);
            case 8:
                return UploadSizeLimitDialogKt.d();
            case 9:
                return UriAction.c();
            case 10:
                return UriAction.l();
            case 11:
                return UriAction.k();
            case 12:
                return UriAction.i();
            case 13:
                return UserJavascriptInterfaceBase.K();
            case 14:
                return UserJavascriptInterfaceBase.J();
            case 15:
                s08 s08Var = s08.SYSTEM;
                g gVar = g.a;
                kxd e = s08.SYSTEM_TEMPORARY_DIRECTORY.e("coil3_disk_cache");
                long j = 10485760;
                try {
                    File file = e.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j = lnf.f((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                } catch (Exception unused) {
                }
                return new kpf(j, e, s08Var, gVar);
            case 16:
                return "The productId is empty, not logging in-app purchase to Braze.";
            case 17:
                return "The custom event name cannot be null or contain only whitespaces. Invalid custom event.";
            case MlKitException.UNSUPPORTED /* 18 */:
                return "Push story page ID cannot be null or blank";
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return "Campaign ID cannot be null or blank";
            case 20:
                return "The currencyCode is empty. Expected one of " + f3k.b;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ViewUtils.a();
            case 22:
                return ViewUtils.d();
            case 23:
                return ViewUtils.h();
            case 24:
                return ViewUtils.b();
            case 25:
                return ViewUtils.g();
            case 26:
                return WaitlistEntryViewModel.Callbacks.b();
            case 27:
                return WaitlistEntryViewModel.Callbacks.a();
            case 28:
                return WaitlistFlywheelViewModel.Callbacks.c();
            default:
                return WalletComponentFactory.b();
        }
    }
}

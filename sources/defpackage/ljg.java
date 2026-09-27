package defpackage;

import bo.app.r;
import com.checkout.address.ui.navigation.Screen;
import com.google.mlkit.common.MlKitException;
import com.polymarket.usviewmodels.SellLimitOrderViewModel;
import com.polymarket.usviewmodels.SellMarketOrderViewModel;
import com.polymarket.usviewmodels.SettingsEditProfileViewModel;
import io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ljg implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ljg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        switch (this.a) {
            case 0:
                return Screen.c();
            case 1:
                return Screen.AddressEdit.d();
            case 2:
                return Screen.CountryPicker.d();
            case 3:
                return Screen.StatePicker.d();
            case 4:
                return Unit.INSTANCE;
            case 5:
                return Unit.INSTANCE;
            case 6:
                return r.a(fq5.SDK_METADATA, new StringBuilder("Starting migration for key: "));
            case 7:
                return "Key: " + fq5.SDK_METADATA.b() + " already exists in DataStore. Not performing migration.";
            case 8:
                return "Failed to migrate SDK metadata to DataStore.";
            case 9:
                return Unit.INSTANCE;
            case 10:
                return null;
            case 11:
                return Integer.valueOf(wpg.a().size());
            case 12:
                return Unit.INSTANCE;
            case 13:
                return SellLimitOrderViewModel.Callbacks.a();
            case 14:
                return SellLimitOrderViewModel.Callbacks.c();
            case 15:
                return Unit.INSTANCE;
            case 16:
                return SellMarketOrderViewModel.Callbacks.c();
            case 17:
                return SendMediaUseCase.a();
            case MlKitException.UNSUPPORTED /* 18 */:
                ykc ykcVar = oxg.a;
                ykcVar.getClass();
                return new blc(ykcVar);
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return Long.valueOf(System.currentTimeMillis());
            case 20:
                return "Starting migration for blocklisted lists";
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return "Migration for blocklisted lists completed successfully";
            case 22:
                return "Failed to migrate blocklisted lists to DataStore";
            case 23:
                return "Blocklisted lists already migrated, skipping";
            case 24:
                try {
                    return epn.a(pwg.q(lwg.b(Arrays.asList(new jhd()).iterator())));
                } finally {
                }
            case 25:
                try {
                    return epn.a(pwg.q(lwg.b(Arrays.asList(new iv8()).iterator())));
                } finally {
                }
            case 26:
                return r.a(fq5.SESSION_STORAGE_MAP, new StringBuilder("Starting migration for key: "));
            case 27:
                return "Failed to migrate sealed sessions map to DataStore.";
            case 28:
                return SettingsEditProfileViewModel.Callbacks.b();
            default:
                return SettingsEditProfileViewModel.Callbacks.a();
        }
    }
}

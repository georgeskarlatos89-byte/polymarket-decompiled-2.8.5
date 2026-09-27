package defpackage;

import android.os.Build;
import bo.app.q0;
import com.google.mlkit.common.MlKitException;
import com.polymarket.clients.PackageSupportKt;
import com.polymarket.usviewmodels.PaymentMethodsViewModel;
import com.stripe.android.view.PaymentAuthWebView;
import io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ypd implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ypd(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return PackageSupportKt.a();
            case 1:
                return com.polymarket.data.PackageSupportKt.a();
            case 2:
                return com.polymarket.designtokens.PackageSupportKt.a();
            case 3:
                return com.polymarket.usdependencies.PackageSupportKt.a();
            case 4:
                return com.polymarket.uslive.PackageSupportKt.a();
            case 5:
                return com.polymarket.usviewmodels.PackageSupportKt.a();
            case 6:
                return com.polymarket.apputil.PackageSupportKt.a();
            case 7:
                int i = PaymentAuthWebView.b;
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return UUID.randomUUID().toString();
            case 10:
                return ikl.c(Boolean.FALSE);
            case 11:
                return null;
            case 12:
                Set set = h8e.a;
                int a = c1c.a(CollectionsKt.w(set));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (Object obj : set) {
                    linkedHashMap.put(((d7e) obj).getType().code, obj);
                }
                return linkedHashMap;
            case 13:
                return UUID.randomUUID().toString();
            case 14:
                return Boolean.FALSE;
            case 15:
                return PaymentMethodsViewModel.Callbacks.a();
            case 16:
                return Unit.INSTANCE;
            case 17:
                return Unit.INSTANCE;
            case MlKitException.UNSUPPORTED /* 18 */:
                return ikl.c("");
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return Unit.INSTANCE;
            case 22:
                return PermissionDeniedDialogKt.d();
            case 23:
                return PermissionDeniedDialogKt.a();
            case 24:
                return "Cannot request push permission with null Activity.";
            case 25:
                return "Permission prompt would not display, not attempting to request push permission prompt.";
            case 26:
                return q0.a("Incremented permission request counter for ", "android.permission.POST_NOTIFICATIONS", '.');
            case 27:
                return ix2.i(Build.VERSION.SDK_INT, " is too low to display push permission prompt.", new StringBuilder("Device API version of "));
            case 28:
                return "Notification permission already granted, doing nothing.";
            default:
                return "Push Prompt can be shown on this device, within a reasonable confidence.";
        }
    }
}

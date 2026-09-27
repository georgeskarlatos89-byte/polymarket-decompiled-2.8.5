package defpackage;

import com.google.mlkit.common.MlKitException;
import com.polymarket.usdependencies.USRoute;
import com.polymarket.usviewmodels.KYCStatusViewModel;
import com.polymarket.usviewmodels.KYCViewModel;
import com.polymarket.usviewmodels.LinkBankMFAViewModel;
import com.polymarket.usviewmodels.LinkBankSelectionViewModel;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.models.AttributeType;
import java.lang.annotation.Annotation;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class mma implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ mma(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return KYCStatusViewModel.Callbacks.a();
            case 1:
                return KYCStatusViewModel.Callbacks.c();
            case 2:
                return KYCStatusViewModel.Callbacks.d();
            case 3:
                return KYCViewModel.Callbacks.a();
            case 4:
                return KYCViewModel.Callbacks.b();
            case 5:
                return go5.f("com.stripe.android.ui.core.elements.KeyboardType", qoa.values(), new String[]{"text", "ascii", AttributeType.NUMBER, AttributeType.PHONE, "uri", "email", "password", "number_password"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 6:
                return LazyMessageListKt.c();
            case 7:
                return LazyMessageListKt.a();
            case 8:
                return new o4b(new int[]{0}, new int[]{0});
            case 9:
                acb[] values = acb.values();
                values.getClass();
                return new bh7("com.stripe.android.model.LinkAuthIntent.Status", (Enum[]) values);
            case 10:
                return LinkBankMFAViewModel.Callbacks.a();
            case 11:
                return LinkBankSelectionViewModel.Callbacks.b();
            case 12:
                return null;
            case 13:
                return UUID.randomUUID().toString();
            case 14:
                return ikl.c(Boolean.FALSE);
            case 15:
                return null;
            case 16:
                return ikl.c(Boolean.FALSE);
            case 17:
                return Unit.INSTANCE;
            case MlKitException.UNSUPPORTED /* 18 */:
                eq1 eq1Var = gy5.a;
                gy5.a(USRoute.INSTANCE.getProfileActivity());
                return Unit.INSTANCE;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return null;
            case 20:
                return fn0.a;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return qn0.a;
            case 22:
                rn6 rn6Var = new rn6(new jw8(6));
                kv5.c(rn6Var);
                fun.a(rn6Var, '-');
                kv5.g(rn6Var);
                fun.a(rn6Var, '-');
                rn6.A(rn6Var);
                return new qob(rn6Var.build(), 0);
            case 23:
                rn6 rn6Var2 = new rn6(new jw8(6));
                kv5.c(rn6Var2);
                kv5.g(rn6Var2);
                rn6.A(rn6Var2);
                return new qob(rn6Var2.build(), 0);
            case 24:
                throw new IllegalStateException("No ImageOptimizer provided");
            case 25:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 26:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay.");
            case 27:
                return null;
            case 28:
                return new mma(29);
            default:
                return Unit.INSTANCE;
        }
    }
}

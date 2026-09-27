package defpackage;

import com.checkout.components.card.CardComponent;
import com.google.mlkit.common.MlKitException;
import com.polymarket.usviewmodels.BuyMarketOrderViewModel;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.CardNumberEditText;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class us1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ us1(CardMultilineWidget cardMultilineWidget) {
        this.a = 27;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return BuyMarketOrderViewModel.Callbacks.b();
            case 2:
                return ikl.c(Boolean.FALSE);
            case 3:
                return null;
            case 4:
                throw new IllegalStateException("Haptics has not been initialized. Make sure to provide it in the root of your app (CompositionLocalProvider).");
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Float.valueOf(0.0f);
            case 7:
                return null;
            case 8:
                return new us1(9);
            case 9:
                return Boolean.TRUE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return ikl.c(Boolean.FALSE);
            case 15:
                return Float.valueOf(0.0f);
            case 16:
                return "Caught exception retrieving resource value";
            case 17:
                return "Resetting cached configuration";
            case MlKitException.UNSUPPORTED /* 18 */:
                return CameraInputButtonKt.d();
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return CameraInputButtonKt.a();
            case 20:
                return go5.f("com.stripe.android.ui.core.elements.Capitalization", y23.values(), new String[]{"none", "characters", "words", "sentences"}, new Annotation[][]{null, null, null, null});
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return "Failed to mark card indicator as highlighted.";
            case 22:
                return "Card ID cannot be null";
            case 23:
                return "Cannot dismiss a card more than once. Doing nothing.";
            case 24:
                return "Failed to log card as dismissed.";
            case 25:
                b57 b57Var = a53.a;
                return oc7.a;
            case 26:
                return CardComponent.b();
            case 27:
                return null;
            case 28:
                b57 b57Var2 = o73.a;
                return pc7.a;
            default:
                int i = CardNumberEditText.L;
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ us1(int i) {
        this.a = i;
    }
}

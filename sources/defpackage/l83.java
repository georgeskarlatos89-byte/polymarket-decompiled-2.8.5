package defpackage;

import com.checkout.components.interfaces.model.CardSchemeName;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.google.mlkit.common.MlKitException;
import com.polymarket.usviewmodels.ChatUserProfileViewModel;
import io.getstream.chat.android.models.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class l83 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ l83(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                b57 b57Var = m83.a;
                return qc7.a;
            case 2:
                return new Object();
            case 3:
                return Class.forName("com.stripe.android.stripecardscan.cardscan.CardScanActivity");
            case 4:
                return ikl.c(Boolean.FALSE);
            case 5:
                return CardSchemeName.Companion.b();
            case 6:
                return CardTypeName.Companion.b();
            case 7:
                return new r49(b2i.a, k1a.a, 1);
            case 8:
                return Unit.INSTANCE;
            case 9:
                return new User("!anon", null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554430, null);
            case 10:
                boolean z = xl3.J;
                return gnn.b().p();
            case 11:
                return Long.valueOf(System.currentTimeMillis());
            case 12:
                return ikl.c(null);
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case 17:
                return z7d.a;
            case MlKitException.UNSUPPORTED /* 18 */:
                return Boolean.TRUE;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new OkHttpClient();
            case 20:
                return null;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                return null;
            case 25:
                return Unit.INSTANCE;
            case 26:
                return ChatUserProfileViewModel.Callbacks.a();
            case 27:
                return ikl.c(cz3.a);
            case 28:
                return CheckoutKMPRememberMe.c();
            default:
                return CheckoutKMPRememberMe.h();
        }
    }

    public /* synthetic */ l83(Object obj, int i) {
        this.a = i;
    }
}

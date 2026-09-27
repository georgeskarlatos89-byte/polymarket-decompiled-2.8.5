package defpackage;

import android.os.Handler;
import android.os.Looper;
import bo.app.r;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.google.mlkit.common.MlKitException;
import com.polymarket.usviewmodels.EmailPasswordLoginViewModel;
import com.stripe.android.view.ExpiryDateEditText;
import io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase;
import io.intercom.android.sdk.survey.ui.components.ErrorComponentKt;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class gz6 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ gz6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return Boolean.TRUE;
            case 2:
                return new i17("drawable:cko_ic_check", vzg.b(new w3g(fd7.a, "composeResources/com.checkout.components.kmp.rememberme.generated.resources/drawable/cko_ic_check.xml", -1L, -1L)));
            case 3:
                return new i17("drawable:cko_ic_cross", vzg.b(new w3g(fd7.a, "composeResources/com.checkout.components.kmp.rememberme.generated.resources/drawable/cko_ic_cross.xml", -1L, -1L)));
            case 4:
                return new i17("drawable:cko_ic_info", vzg.b(new w3g(fd7.a, "composeResources/com.checkout.components.kmp.rememberme.generated.resources/drawable/cko_ic_info.xml", -1L, -1L)));
            case 5:
                return new i17("drawable:cko_ic_phone", vzg.b(new w3g(fd7.a, "composeResources/com.checkout.components.kmp.rememberme.generated.resources/drawable/cko_ic_phone.xml", -1L, -1L)));
            case 6:
                return new i17("drawable:cko_ic_shield", vzg.b(new w3g(fd7.a, "composeResources/com.checkout.components.kmp.rememberme.generated.resources/drawable/cko_ic_shield.xml", -1L, -1L)));
            case 7:
                return new i17("drawable:cko_ic_thunder", vzg.b(new w3g(fd7.a, "composeResources/com.checkout.components.kmp.rememberme.generated.resources/drawable/cko_ic_thunder.xml", -1L, -1L)));
            case 8:
                return new i17("drawable:cko_ic_whatsapp", vzg.b(new w3g(fd7.a, "composeResources/com.checkout.components.kmp.rememberme.generated.resources/drawable/cko_ic_whatsapp.xml", -1L, -1L)));
            case 9:
                return new i17("drawable:cko_logo", vzg.b(new w3g(fd7.a, "composeResources/com.checkout.components.kmp.rememberme.generated.resources/drawable/cko_logo.xml", -1L, -1L)));
            case 10:
                return new i17("drawable:cko_secured_text", vzg.b(new w3g(fd7.a, "composeResources/com.checkout.components.kmp.rememberme.generated.resources/drawable/cko_secured_text.xml", -1L, -1L)));
            case 11:
                return new i17("drawable:cko_where_the_world_checks_out", vzg.b(new w3g(fd7.a, "composeResources/com.checkout.components.kmp.rememberme.generated.resources/drawable/cko_where_the_world_checks_out.xml", -1L, -1L)));
            case 12:
                return new Handler(Looper.getMainLooper());
            case 13:
                return cdj.Companion.serializer();
            case 14:
                return new yk0(g37.a, 0);
            case 15:
                return Long.valueOf(System.currentTimeMillis());
            case 16:
                b57 b57Var = u87.a;
                return r26.a;
            case 17:
                return new hy6(0.0f);
            case MlKitException.UNSUPPORTED /* 18 */:
                return EmailPasswordLoginViewModel.Callbacks.a();
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new bh7("com.stripe.android.ui.core.elements.EmptyFormSpec", vc7.INSTANCE, new Annotation[0]);
            case 20:
                return ikl.c(bi7.a);
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ErrorComponentKt.d();
            case 22:
                return ikl.c(Boolean.FALSE);
            case 23:
                return ikl.c(Boolean.FALSE);
            case 24:
                return r.a(fq5.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP, new StringBuilder("Starting migration for key: "));
            case 25:
                return "Failed to migrate event duplication map to DataStore.";
            case 26:
                vka[] vkaVarArr = ExpiryDateEditText.z;
                return Unit.INSTANCE;
            case 27:
                ug7 entries = PaymentMethodName.getEntries();
                int a = c1c.a(CollectionsKt.w(entries));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (Object obj : entries) {
                    linkedHashMap.put(((PaymentMethodName) obj).getValue(), obj);
                }
                return linkedHashMap;
            case 28:
                return FallbackPollingUseCase.a();
            default:
                return "Caught exception creating FeatureFlag Json.";
        }
    }
}

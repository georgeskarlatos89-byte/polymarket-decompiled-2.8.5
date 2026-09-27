package com.checkout.components.interfaces.component;

import android.content.Context;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bv\u0018\u00002\u00020\u0001:\u0001\u001cR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R4\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u0012j\u0004\u0018\u0001`\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0001\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/component/CheckoutComponentConfiguration;", "", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "getPublicKey", "()Ljava/lang/String;", "publicKey", "Lcom/checkout/components/interfaces/Environment;", "getEnvironment", "()Lcom/checkout/components/interfaces/Environment;", ConstantsKt.ENV_FACING_MODE, "Lcom/checkout/components/interfaces/localisation/Locale;", "getLocale", "()Lcom/checkout/components/interfaces/localisation/Locale;", "locale", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translations;", "getTranslations", "()Ljava/util/Map;", "translations", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "getAppearance", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "appearance", "hz3", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CheckoutComponentConfiguration {
    DesignTokens getAppearance();

    Context getContext();

    Environment getEnvironment();

    Locale getLocale();

    String getPublicKey();

    Map<Locale, Map<ComponentTranslationKey, String>> getTranslations();
}

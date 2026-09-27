package com.checkout.components.interfaces.localisation;

import android.content.Context;
import android.content.res.Configuration;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"toConfigContext", "Landroid/content/Context;", "locale", "Ljava/util/Locale;", "interfaces_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextExtensionsKt {
    public static final Context toConfigContext(Context context, java.util.Locale locale) {
        context.getClass();
        locale.getClass();
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        createConfigurationContext.getClass();
        return createConfigurationContext;
    }
}

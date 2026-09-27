package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.identity.AppConfig;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"canStartNewConversation", "", "Lio/intercom/android/sdk/identity/AppConfig;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppConfigExtensionsKt {
    public static final boolean canStartNewConversation(AppConfig appConfig) {
        appConfig.getClass();
        boolean isInboundMessages = appConfig.isInboundMessages();
        if (appConfig.isPreventMultipleInboundConversationsEnabled()) {
            if (isInboundMessages && !appConfig.getHasOpenConversations()) {
                return true;
            }
            return false;
        }
        return isInboundMessages;
    }
}

package com.polymarket.clients;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/clients/AppsFlyerLink;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppsFlyerLink {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ AppsFlyerLink[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final String brandedDomain;
    private static final String inviteCampaign;
    private static final String inviteChannel;
    private static final String originalLinkKey;
    private static final String promoCodeKey;
    private static final String referrerAttributionKey;
    private static final String referrerKey;

    private static final /* synthetic */ AppsFlyerLink[] $values() {
        return new AppsFlyerLink[0];
    }

    static {
        AppsFlyerLink[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
        promoCodeKey = "deep_link_sub1";
        referrerKey = "deep_link_sub2";
        referrerAttributionKey = "af_sub1";
        brandedDomain = "app.polymarket.us";
        inviteCampaign = "user_referral";
        inviteChannel = "in_app_share";
        originalLinkKey = ActionType.LINK;
    }

    private AppsFlyerLink(String str, int i) {
    }

    public static final /* synthetic */ String access$getBrandedDomain$cp() {
        return brandedDomain;
    }

    public static final /* synthetic */ String access$getInviteCampaign$cp() {
        return inviteCampaign;
    }

    public static final /* synthetic */ String access$getInviteChannel$cp() {
        return inviteChannel;
    }

    public static final /* synthetic */ String access$getOriginalLinkKey$cp() {
        return originalLinkKey;
    }

    public static final /* synthetic */ String access$getPromoCodeKey$cp() {
        return promoCodeKey;
    }

    public static final /* synthetic */ String access$getReferrerAttributionKey$cp() {
        return referrerAttributionKey;
    }

    public static final /* synthetic */ String access$getReferrerKey$cp() {
        return referrerKey;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static AppsFlyerLink valueOf(String str) {
        return (AppsFlyerLink) Enum.valueOf(AppsFlyerLink.class, str);
    }

    public static AppsFlyerLink[] values() {
        return (AppsFlyerLink[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0082 J8\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001eJ;\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001eH\u0082 J0\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001eJ3\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001eH\u0082 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0005J\u0015\u0010$\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0082 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/polymarket/clients/AppsFlyerLink$Companion;", "", "<init>", "()V", "promoCodeKey", "", "getPromoCodeKey", "()Ljava/lang/String;", "referrerKey", "getReferrerKey", "referrerAttributionKey", "getReferrerAttributionKey", "brandedDomain", "getBrandedDomain", "inviteCampaign", "getInviteCampaign", "inviteChannel", "getInviteChannel", "originalLinkKey", "getOriginalLinkKey", "campaignQueryKeys", "", "getCampaignQueryKeys", "()Ljava/util/List;", "Swift_Companion_campaignQueryKeys", "routedURLString", "deepLinkValue", "baseURL", "originalLink", "clickEventValues", "", "Swift_Companion_routedURLString_0", "campaignParameters", "Swift_Companion_campaignParameters_1", "normalizedUserId", "userId", "Swift_Companion_normalizedUserId_2", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Map<String, String> Swift_Companion_campaignParameters_1(String originalLink, Map<String, String> clickEventValues);

        private final native List<String> Swift_Companion_campaignQueryKeys();

        private final native String Swift_Companion_normalizedUserId_2(String userId);

        private final native String Swift_Companion_routedURLString_0(String deepLinkValue, String baseURL, String originalLink, Map<String, String> clickEventValues);

        public final Map<String, String> campaignParameters(String originalLink, Map<String, String> clickEventValues) {
            clickEventValues.getClass();
            return Swift_Companion_campaignParameters_1(originalLink, clickEventValues);
        }

        public final String getBrandedDomain() {
            return AppsFlyerLink.access$getBrandedDomain$cp();
        }

        public final List<String> getCampaignQueryKeys() {
            return Swift_Companion_campaignQueryKeys();
        }

        public final String getInviteCampaign() {
            return AppsFlyerLink.access$getInviteCampaign$cp();
        }

        public final String getInviteChannel() {
            return AppsFlyerLink.access$getInviteChannel$cp();
        }

        public final String getOriginalLinkKey() {
            return AppsFlyerLink.access$getOriginalLinkKey$cp();
        }

        public final String getPromoCodeKey() {
            return AppsFlyerLink.access$getPromoCodeKey$cp();
        }

        public final String getReferrerAttributionKey() {
            return AppsFlyerLink.access$getReferrerAttributionKey$cp();
        }

        public final String getReferrerKey() {
            return AppsFlyerLink.access$getReferrerKey$cp();
        }

        public final String normalizedUserId(String userId) {
            return Swift_Companion_normalizedUserId_2(userId);
        }

        public final String routedURLString(String deepLinkValue, String baseURL, String originalLink, Map<String, String> clickEventValues) {
            baseURL.getClass();
            clickEventValues.getClass();
            return Swift_Companion_routedURLString_0(deepLinkValue, baseURL, originalLink, clickEventValues);
        }

        private Companion() {
        }
    }
}

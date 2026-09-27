package io.intercom.android.sdk.identity;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.hdi;
import defpackage.hm6;
import defpackage.sv6;
import defpackage.woa;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.Space;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b)\b\u0081\b\u0018\u00002\u00020\u0001B«\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\t\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020\t\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\b-\u0010.J\u000e\u0010Q\u001a\u00020\t2\u0006\u0010R\u001a\u00020\u0003J\u0006\u0010S\u001a\u00020\tJ\u000e\u0010T\u001a\u00020\t2\u0006\u0010U\u001a\u00020VJ\u0010\u0010W\u001a\u0004\u0018\u00010\u00032\u0006\u0010U\u001a\u00020VJ\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\tHÆ\u0003J\t\u0010]\u001a\u00020\tHÆ\u0003J\t\u0010^\u001a\u00020\tHÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u000eHÆ\u0003J\t\u0010a\u001a\u00020\u000eHÆ\u0003J\t\u0010b\u001a\u00020\u000eHÆ\u0003J\t\u0010c\u001a\u00020\u000eHÆ\u0003J\t\u0010d\u001a\u00020\tHÆ\u0003J\t\u0010e\u001a\u00020\tHÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\tHÆ\u0003J\t\u0010i\u001a\u00020\tHÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\tHÆ\u0003J\t\u0010p\u001a\u00020\tHÆ\u0003J\t\u0010q\u001a\u00020\tHÆ\u0003J\t\u0010r\u001a\u00020\tHÆ\u0003J\t\u0010s\u001a\u00020\tHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010u\u001a\u00020&HÆ\u0003J\t\u0010v\u001a\u00020(HÆ\u0003J\t\u0010w\u001a\u00020\tHÆ\u0003J\t\u0010x\u001a\u00020+HÆ\u0003J\t\u0010y\u001a\u00020\tHÆ\u0003Jë\u0002\u0010z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\tHÇ\u0001J\u0013\u0010{\u001a\u00020\t2\b\u0010|\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010}\u001a\u00020\u0005H×\u0001J\t\u0010~\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u00107R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u00107R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u00107R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00107R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u00107R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00107R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u00107R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00100R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00100R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00100R\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u00107R\u0011\u0010\u001f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u00107R\u0011\u0010 \u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u00107R\u0011\u0010!\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u00107R\u0011\u0010\"\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bF\u00107R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010)\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bM\u00107R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010,\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bP\u00107¨\u0006\u007f"}, d2 = {"Lio/intercom/android/sdk/identity/AppConfig;", "", Keys.KEY_NAME, "", "primaryColor", "", "secondaryColor", "secondaryColorDark", "isPrimaryColorRenderDarkText", "", "isSecondaryColorRenderDarkText", "isInboundMessages", "rateLimitCount", "rateLimitPeriodMs", "", "userUpdateCacheMaxAgeMs", "newSessionThresholdMs", "softResetTimeoutMs", "isMetricsEnabled", "isAudioEnabled", "locale", "helpCenterLocale", "isReceivedFromServer", "isBackgroundRequestsEnabled", "helpCenterUrl", "helpCenterUrls", "", "features", "launcherLogoUrl", "teamGreeting", "isIdentityVerificationEnabled", "isAccessToTeammateEnabled", "isHelpCenterRequireSearchEnabled", "isPreventMultipleInboundConversationsEnabled", "hasOpenConversations", "configModules", "Lio/intercom/android/sdk/models/ConfigModules;", "realTimeConfig", "Lio/intercom/android/nexus/NexusConfig;", "attachmentSettings", "Lio/intercom/android/sdk/models/AttachmentSettings;", "articleAutoReactionEnabled", "conversationStateSyncSettings", "Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "askUsersToAllowNotifications", "<init>", "(Ljava/lang/String;IIIZZZIJJJJZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ZZZZZLio/intercom/android/sdk/models/ConfigModules;Lio/intercom/android/nexus/NexusConfig;Lio/intercom/android/sdk/models/AttachmentSettings;ZLio/intercom/android/sdk/models/ConversationStateSyncSettings;Z)V", "getName", "()Ljava/lang/String;", "getPrimaryColor$annotations", "()V", "getPrimaryColor", "()I", "getSecondaryColor", "getSecondaryColorDark", "()Z", "getRateLimitCount", "getRateLimitPeriodMs", "()J", "getUserUpdateCacheMaxAgeMs", "getNewSessionThresholdMs", "getSoftResetTimeoutMs", "getLocale", "getHelpCenterLocale", "getHelpCenterUrl", "getHelpCenterUrls", "()Ljava/util/Set;", "getFeatures", "getLauncherLogoUrl", "getTeamGreeting", "getHasOpenConversations", "getConfigModules", "()Lio/intercom/android/sdk/models/ConfigModules;", "getRealTimeConfig", "()Lio/intercom/android/nexus/NexusConfig;", "getAttachmentSettings", "()Lio/intercom/android/sdk/models/AttachmentSettings;", "getArticleAutoReactionEnabled", "getConversationStateSyncSettings", "()Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "getAskUsersToAllowNotifications", "hasFeature", "feature", "isBackgroundRequestsDisabled", "isSpaceEnabled", "space", "Lio/intercom/android/sdk/models/Space$Type;", "getSpaceLabelIfExists", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "equals", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AppConfig {
    public static final int $stable = 8;
    private final boolean articleAutoReactionEnabled;
    private final boolean askUsersToAllowNotifications;
    private final AttachmentSettings attachmentSettings;
    private final ConfigModules configModules;
    private final ConversationStateSyncSettings conversationStateSyncSettings;
    private final Set<String> features;
    private final boolean hasOpenConversations;
    private final String helpCenterLocale;
    private final String helpCenterUrl;
    private final Set<String> helpCenterUrls;
    private final boolean isAccessToTeammateEnabled;
    private final boolean isAudioEnabled;
    private final boolean isBackgroundRequestsEnabled;
    private final boolean isHelpCenterRequireSearchEnabled;
    private final boolean isIdentityVerificationEnabled;
    private final boolean isInboundMessages;
    private final boolean isMetricsEnabled;
    private final boolean isPreventMultipleInboundConversationsEnabled;
    private final boolean isPrimaryColorRenderDarkText;
    private final boolean isReceivedFromServer;
    private final boolean isSecondaryColorRenderDarkText;
    private final String launcherLogoUrl;
    private final String locale;
    private final String name;
    private final long newSessionThresholdMs;
    private final int primaryColor;
    private final int rateLimitCount;
    private final long rateLimitPeriodMs;
    private final NexusConfig realTimeConfig;
    private final int secondaryColor;
    private final int secondaryColorDark;
    private final long softResetTimeoutMs;
    private final String teamGreeting;
    private final long userUpdateCacheMaxAgeMs;

    public AppConfig(String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, long j, long j2, long j3, long j4, boolean z4, boolean z5, String str2, String str3, boolean z6, boolean z7, String str4, Set<String> set, Set<String> set2, String str5, String str6, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, NexusConfig nexusConfig, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        set.getClass();
        set2.getClass();
        str5.getClass();
        str6.getClass();
        nexusConfig.getClass();
        attachmentSettings.getClass();
        conversationStateSyncSettings.getClass();
        this.name = str;
        this.primaryColor = i;
        this.secondaryColor = i2;
        this.secondaryColorDark = i3;
        this.isPrimaryColorRenderDarkText = z;
        this.isSecondaryColorRenderDarkText = z2;
        this.isInboundMessages = z3;
        this.rateLimitCount = i4;
        this.rateLimitPeriodMs = j;
        this.userUpdateCacheMaxAgeMs = j2;
        this.newSessionThresholdMs = j3;
        this.softResetTimeoutMs = j4;
        this.isMetricsEnabled = z4;
        this.isAudioEnabled = z5;
        this.locale = str2;
        this.helpCenterLocale = str3;
        this.isReceivedFromServer = z6;
        this.isBackgroundRequestsEnabled = z7;
        this.helpCenterUrl = str4;
        this.helpCenterUrls = set;
        this.features = set2;
        this.launcherLogoUrl = str5;
        this.teamGreeting = str6;
        this.isIdentityVerificationEnabled = z8;
        this.isAccessToTeammateEnabled = z9;
        this.isHelpCenterRequireSearchEnabled = z10;
        this.isPreventMultipleInboundConversationsEnabled = z11;
        this.hasOpenConversations = z12;
        this.configModules = configModules;
        this.realTimeConfig = nexusConfig;
        this.attachmentSettings = attachmentSettings;
        this.articleAutoReactionEnabled = z13;
        this.conversationStateSyncSettings = conversationStateSyncSettings;
        this.askUsersToAllowNotifications = z14;
    }

    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, long j, long j2, long j3, long j4, boolean z4, boolean z5, String str2, String str3, boolean z6, boolean z7, String str4, Set set, Set set2, String str5, String str6, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, NexusConfig nexusConfig, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14, int i5, int i6, Object obj) {
        boolean z15;
        ConversationStateSyncSettings conversationStateSyncSettings2;
        boolean z16;
        String str7;
        Set set3;
        Set set4;
        String str8;
        String str9;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        ConfigModules configModules2;
        NexusConfig nexusConfig2;
        AttachmentSettings attachmentSettings2;
        boolean z22;
        String str10;
        boolean z23;
        boolean z24;
        int i7;
        long j5;
        long j6;
        long j7;
        long j8;
        boolean z25;
        String str11;
        boolean z26;
        int i8;
        int i9;
        boolean z27;
        boolean z28;
        String str12 = (i5 & 1) != 0 ? appConfig.name : str;
        int i10 = (i5 & 2) != 0 ? appConfig.primaryColor : i;
        int i11 = (i5 & 4) != 0 ? appConfig.secondaryColor : i2;
        int i12 = (i5 & 8) != 0 ? appConfig.secondaryColorDark : i3;
        boolean z29 = (i5 & 16) != 0 ? appConfig.isPrimaryColorRenderDarkText : z;
        boolean z30 = (i5 & 32) != 0 ? appConfig.isSecondaryColorRenderDarkText : z2;
        boolean z31 = (i5 & 64) != 0 ? appConfig.isInboundMessages : z3;
        int i13 = (i5 & 128) != 0 ? appConfig.rateLimitCount : i4;
        long j9 = (i5 & 256) != 0 ? appConfig.rateLimitPeriodMs : j;
        long j10 = (i5 & Barcode.FORMAT_UPC_A) != 0 ? appConfig.userUpdateCacheMaxAgeMs : j2;
        long j11 = (i5 & Barcode.FORMAT_UPC_E) != 0 ? appConfig.newSessionThresholdMs : j3;
        String str13 = str12;
        int i14 = i10;
        long j12 = (i5 & 2048) != 0 ? appConfig.softResetTimeoutMs : j4;
        boolean z32 = (i5 & 4096) != 0 ? appConfig.isMetricsEnabled : z4;
        boolean z33 = (i5 & 8192) != 0 ? appConfig.isAudioEnabled : z5;
        boolean z34 = z32;
        String str14 = (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appConfig.locale : str2;
        String str15 = (i5 & 32768) != 0 ? appConfig.helpCenterLocale : str3;
        boolean z35 = (i5 & 65536) != 0 ? appConfig.isReceivedFromServer : z6;
        boolean z36 = (i5 & 131072) != 0 ? appConfig.isBackgroundRequestsEnabled : z7;
        String str16 = (i5 & 262144) != 0 ? appConfig.helpCenterUrl : str4;
        Set set5 = (i5 & 524288) != 0 ? appConfig.helpCenterUrls : set;
        Set set6 = (i5 & 1048576) != 0 ? appConfig.features : set2;
        String str17 = (i5 & 2097152) != 0 ? appConfig.launcherLogoUrl : str5;
        String str18 = (i5 & 4194304) != 0 ? appConfig.teamGreeting : str6;
        boolean z37 = (i5 & 8388608) != 0 ? appConfig.isIdentityVerificationEnabled : z8;
        boolean z38 = (i5 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? appConfig.isAccessToTeammateEnabled : z9;
        boolean z39 = (i5 & 33554432) != 0 ? appConfig.isHelpCenterRequireSearchEnabled : z10;
        boolean z40 = (i5 & 67108864) != 0 ? appConfig.isPreventMultipleInboundConversationsEnabled : z11;
        boolean z41 = (i5 & 134217728) != 0 ? appConfig.hasOpenConversations : z12;
        ConfigModules configModules3 = (i5 & 268435456) != 0 ? appConfig.configModules : configModules;
        NexusConfig nexusConfig3 = (i5 & 536870912) != 0 ? appConfig.realTimeConfig : nexusConfig;
        AttachmentSettings attachmentSettings3 = (i5 & 1073741824) != 0 ? appConfig.attachmentSettings : attachmentSettings;
        boolean z42 = (i5 & Integer.MIN_VALUE) != 0 ? appConfig.articleAutoReactionEnabled : z13;
        ConversationStateSyncSettings conversationStateSyncSettings3 = (i6 & 1) != 0 ? appConfig.conversationStateSyncSettings : conversationStateSyncSettings;
        if ((i6 & 2) != 0) {
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
            z15 = appConfig.askUsersToAllowNotifications;
            str7 = str16;
            set3 = set5;
            set4 = set6;
            str8 = str17;
            str9 = str18;
            z17 = z37;
            z18 = z38;
            z19 = z39;
            z20 = z40;
            z21 = z41;
            configModules2 = configModules3;
            nexusConfig2 = nexusConfig3;
            attachmentSettings2 = attachmentSettings3;
            z22 = z42;
            str10 = str14;
            z23 = z33;
            i7 = i13;
            j5 = j9;
            j6 = j10;
            j7 = j11;
            j8 = j12;
            z25 = z34;
            str11 = str15;
            z26 = z35;
            z16 = z36;
            i8 = i11;
            i9 = i12;
            z27 = z29;
            z28 = z30;
            z24 = z31;
        } else {
            z15 = z14;
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
            z16 = z36;
            str7 = str16;
            set3 = set5;
            set4 = set6;
            str8 = str17;
            str9 = str18;
            z17 = z37;
            z18 = z38;
            z19 = z39;
            z20 = z40;
            z21 = z41;
            configModules2 = configModules3;
            nexusConfig2 = nexusConfig3;
            attachmentSettings2 = attachmentSettings3;
            z22 = z42;
            str10 = str14;
            z23 = z33;
            z24 = z31;
            i7 = i13;
            j5 = j9;
            j6 = j10;
            j7 = j11;
            j8 = j12;
            z25 = z34;
            str11 = str15;
            z26 = z35;
            i8 = i11;
            i9 = i12;
            z27 = z29;
            z28 = z30;
        }
        return appConfig.copy(str13, i14, i8, i9, z27, z28, z24, i7, j5, j6, j7, j8, z25, z23, str10, str11, z26, z16, str7, set3, set4, str8, str9, z17, z18, z19, z20, z21, configModules2, nexusConfig2, attachmentSettings2, z22, conversationStateSyncSettings2, z15);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final long getUserUpdateCacheMaxAgeMs() {
        return this.userUpdateCacheMaxAgeMs;
    }

    /* renamed from: component11, reason: from getter */
    public final long getNewSessionThresholdMs() {
        return this.newSessionThresholdMs;
    }

    /* renamed from: component12, reason: from getter */
    public final long getSoftResetTimeoutMs() {
        return this.softResetTimeoutMs;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsAudioEnabled() {
        return this.isAudioEnabled;
    }

    /* renamed from: component15, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component16, reason: from getter */
    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsReceivedFromServer() {
        return this.isReceivedFromServer;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    /* renamed from: component19, reason: from getter */
    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final Set<String> component20() {
        return this.helpCenterUrls;
    }

    public final Set<String> component21() {
        return this.features;
    }

    /* renamed from: component22, reason: from getter */
    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    /* renamed from: component23, reason: from getter */
    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsIdentityVerificationEnabled() {
        return this.isIdentityVerificationEnabled;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsAccessToTeammateEnabled() {
        return this.isAccessToTeammateEnabled;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsHelpCenterRequireSearchEnabled() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsPreventMultipleInboundConversationsEnabled() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    /* renamed from: component29, reason: from getter */
    public final ConfigModules getConfigModules() {
        return this.configModules;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    /* renamed from: component30, reason: from getter */
    public final NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    /* renamed from: component31, reason: from getter */
    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getArticleAutoReactionEnabled() {
        return this.articleAutoReactionEnabled;
    }

    /* renamed from: component33, reason: from getter */
    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    /* renamed from: component34, reason: from getter */
    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSecondaryColorDark() {
        return this.secondaryColorDark;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInboundMessages() {
        return this.isInboundMessages;
    }

    /* renamed from: component8, reason: from getter */
    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    /* renamed from: component9, reason: from getter */
    public final long getRateLimitPeriodMs() {
        return this.rateLimitPeriodMs;
    }

    public final AppConfig copy(String name, int primaryColor, int secondaryColor, int secondaryColorDark, boolean isPrimaryColorRenderDarkText, boolean isSecondaryColorRenderDarkText, boolean isInboundMessages, int rateLimitCount, long rateLimitPeriodMs, long userUpdateCacheMaxAgeMs, long newSessionThresholdMs, long softResetTimeoutMs, boolean isMetricsEnabled, boolean isAudioEnabled, String locale, String helpCenterLocale, boolean isReceivedFromServer, boolean isBackgroundRequestsEnabled, String helpCenterUrl, Set<String> helpCenterUrls, Set<String> features, String launcherLogoUrl, String teamGreeting, boolean isIdentityVerificationEnabled, boolean isAccessToTeammateEnabled, boolean isHelpCenterRequireSearchEnabled, boolean isPreventMultipleInboundConversationsEnabled, boolean hasOpenConversations, ConfigModules configModules, NexusConfig realTimeConfig, AttachmentSettings attachmentSettings, boolean articleAutoReactionEnabled, ConversationStateSyncSettings conversationStateSyncSettings, boolean askUsersToAllowNotifications) {
        name.getClass();
        locale.getClass();
        helpCenterLocale.getClass();
        helpCenterUrl.getClass();
        helpCenterUrls.getClass();
        features.getClass();
        launcherLogoUrl.getClass();
        teamGreeting.getClass();
        realTimeConfig.getClass();
        attachmentSettings.getClass();
        conversationStateSyncSettings.getClass();
        return new AppConfig(name, primaryColor, secondaryColor, secondaryColorDark, isPrimaryColorRenderDarkText, isSecondaryColorRenderDarkText, isInboundMessages, rateLimitCount, rateLimitPeriodMs, userUpdateCacheMaxAgeMs, newSessionThresholdMs, softResetTimeoutMs, isMetricsEnabled, isAudioEnabled, locale, helpCenterLocale, isReceivedFromServer, isBackgroundRequestsEnabled, helpCenterUrl, helpCenterUrls, features, launcherLogoUrl, teamGreeting, isIdentityVerificationEnabled, isAccessToTeammateEnabled, isHelpCenterRequireSearchEnabled, isPreventMultipleInboundConversationsEnabled, hasOpenConversations, configModules, realTimeConfig, attachmentSettings, articleAutoReactionEnabled, conversationStateSyncSettings, askUsersToAllowNotifications);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) other;
        if (Intrinsics.areEqual(this.name, appConfig.name) && this.primaryColor == appConfig.primaryColor && this.secondaryColor == appConfig.secondaryColor && this.secondaryColorDark == appConfig.secondaryColorDark && this.isPrimaryColorRenderDarkText == appConfig.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == appConfig.isSecondaryColorRenderDarkText && this.isInboundMessages == appConfig.isInboundMessages && this.rateLimitCount == appConfig.rateLimitCount && this.rateLimitPeriodMs == appConfig.rateLimitPeriodMs && this.userUpdateCacheMaxAgeMs == appConfig.userUpdateCacheMaxAgeMs && this.newSessionThresholdMs == appConfig.newSessionThresholdMs && this.softResetTimeoutMs == appConfig.softResetTimeoutMs && this.isMetricsEnabled == appConfig.isMetricsEnabled && this.isAudioEnabled == appConfig.isAudioEnabled && Intrinsics.areEqual(this.locale, appConfig.locale) && Intrinsics.areEqual(this.helpCenterLocale, appConfig.helpCenterLocale) && this.isReceivedFromServer == appConfig.isReceivedFromServer && this.isBackgroundRequestsEnabled == appConfig.isBackgroundRequestsEnabled && Intrinsics.areEqual(this.helpCenterUrl, appConfig.helpCenterUrl) && Intrinsics.areEqual(this.helpCenterUrls, appConfig.helpCenterUrls) && Intrinsics.areEqual(this.features, appConfig.features) && Intrinsics.areEqual(this.launcherLogoUrl, appConfig.launcherLogoUrl) && Intrinsics.areEqual(this.teamGreeting, appConfig.teamGreeting) && this.isIdentityVerificationEnabled == appConfig.isIdentityVerificationEnabled && this.isAccessToTeammateEnabled == appConfig.isAccessToTeammateEnabled && this.isHelpCenterRequireSearchEnabled == appConfig.isHelpCenterRequireSearchEnabled && this.isPreventMultipleInboundConversationsEnabled == appConfig.isPreventMultipleInboundConversationsEnabled && this.hasOpenConversations == appConfig.hasOpenConversations && Intrinsics.areEqual(this.configModules, appConfig.configModules) && Intrinsics.areEqual(this.realTimeConfig, appConfig.realTimeConfig) && Intrinsics.areEqual(this.attachmentSettings, appConfig.attachmentSettings) && this.articleAutoReactionEnabled == appConfig.articleAutoReactionEnabled && Intrinsics.areEqual(this.conversationStateSyncSettings, appConfig.conversationStateSyncSettings) && this.askUsersToAllowNotifications == appConfig.askUsersToAllowNotifications) {
            return true;
        }
        return false;
    }

    public final boolean getArticleAutoReactionEnabled() {
        return this.articleAutoReactionEnabled;
    }

    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public final ConfigModules getConfigModules() {
        return this.configModules;
    }

    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    public final Set<String> getFeatures() {
        return this.features;
    }

    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNewSessionThresholdMs() {
        return this.newSessionThresholdMs;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriodMs() {
        return this.rateLimitPeriodMs;
    }

    public final NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final int getSecondaryColorDark() {
        return this.secondaryColorDark;
    }

    public final long getSoftResetTimeoutMs() {
        return this.softResetTimeoutMs;
    }

    public final String getSpaceLabelIfExists(Space.Type space) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        Object obj;
        space.getClass();
        ConfigModules configModules = this.configModules;
        if (configModules != null && (home = configModules.getHome()) != null && (openConfig = home.getOpenConfig()) != null && (spaces = openConfig.getSpaces()) != null) {
            Iterator<T> it = spaces.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Space) obj).getType() == space) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Space space2 = (Space) obj;
            if (space2 != null) {
                return space2.getLabel();
            }
        }
        return null;
    }

    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final long getUserUpdateCacheMaxAgeMs() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final boolean hasFeature(String feature) {
        feature.getClass();
        return this.features.contains(feature);
    }

    public int hashCode() {
        int hashCode;
        int g = hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.e(hdi.e(sv6.d(this.features, sv6.d(this.helpCenterUrls, hdi.e(hdi.g(hdi.g(hdi.e(hdi.e(hdi.g(hdi.g(woa.d(woa.d(woa.d(woa.d(woa.b(this.rateLimitCount, hdi.g(hdi.g(hdi.g(woa.b(this.secondaryColorDark, woa.b(this.secondaryColor, woa.b(this.primaryColor, this.name.hashCode() * 31, 31), 31), 31), 31, this.isPrimaryColorRenderDarkText), 31, this.isSecondaryColorRenderDarkText), 31, this.isInboundMessages), 31), 31, this.rateLimitPeriodMs), 31, this.userUpdateCacheMaxAgeMs), 31, this.newSessionThresholdMs), 31, this.softResetTimeoutMs), 31, this.isMetricsEnabled), 31, this.isAudioEnabled), 31, this.locale), 31, this.helpCenterLocale), 31, this.isReceivedFromServer), 31, this.isBackgroundRequestsEnabled), 31, this.helpCenterUrl), 31), 31), 31, this.launcherLogoUrl), 31, this.teamGreeting), 31, this.isIdentityVerificationEnabled), 31, this.isAccessToTeammateEnabled), 31, this.isHelpCenterRequireSearchEnabled), 31, this.isPreventMultipleInboundConversationsEnabled), 31, this.hasOpenConversations);
        ConfigModules configModules = this.configModules;
        if (configModules == null) {
            hashCode = 0;
        } else {
            hashCode = configModules.hashCode();
        }
        return Boolean.hashCode(this.askUsersToAllowNotifications) + ((this.conversationStateSyncSettings.hashCode() + hdi.g((this.attachmentSettings.hashCode() + ((this.realTimeConfig.hashCode() + ((g + hashCode) * 31)) * 31)) * 31, 31, this.articleAutoReactionEnabled)) * 31);
    }

    public final boolean isAccessToTeammateEnabled() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isBackgroundRequestsDisabled() {
        return !this.isBackgroundRequestsEnabled;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isHelpCenterRequireSearchEnabled() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean isIdentityVerificationEnabled() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isPreventMultipleInboundConversationsEnabled() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isReceivedFromServer() {
        return this.isReceivedFromServer;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean isSpaceEnabled(Space.Type space) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        space.getClass();
        ConfigModules configModules = this.configModules;
        if (configModules != null && (home = configModules.getHome()) != null && (openConfig = home.getOpenConfig()) != null && (spaces = openConfig.getSpaces()) != null) {
            List<Space> list = spaces;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Space) it.next()).getType() == space) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppConfig(name=");
        sb.append(this.name);
        sb.append(", primaryColor=");
        sb.append(this.primaryColor);
        sb.append(", secondaryColor=");
        sb.append(this.secondaryColor);
        sb.append(", secondaryColorDark=");
        sb.append(this.secondaryColorDark);
        sb.append(", isPrimaryColorRenderDarkText=");
        sb.append(this.isPrimaryColorRenderDarkText);
        sb.append(", isSecondaryColorRenderDarkText=");
        sb.append(this.isSecondaryColorRenderDarkText);
        sb.append(", isInboundMessages=");
        sb.append(this.isInboundMessages);
        sb.append(", rateLimitCount=");
        sb.append(this.rateLimitCount);
        sb.append(", rateLimitPeriodMs=");
        sb.append(this.rateLimitPeriodMs);
        sb.append(", userUpdateCacheMaxAgeMs=");
        sb.append(this.userUpdateCacheMaxAgeMs);
        sb.append(", newSessionThresholdMs=");
        sb.append(this.newSessionThresholdMs);
        sb.append(", softResetTimeoutMs=");
        sb.append(this.softResetTimeoutMs);
        sb.append(", isMetricsEnabled=");
        sb.append(this.isMetricsEnabled);
        sb.append(", isAudioEnabled=");
        sb.append(this.isAudioEnabled);
        sb.append(", locale=");
        sb.append(this.locale);
        sb.append(", helpCenterLocale=");
        sb.append(this.helpCenterLocale);
        sb.append(", isReceivedFromServer=");
        sb.append(this.isReceivedFromServer);
        sb.append(", isBackgroundRequestsEnabled=");
        sb.append(this.isBackgroundRequestsEnabled);
        sb.append(", helpCenterUrl=");
        sb.append(this.helpCenterUrl);
        sb.append(", helpCenterUrls=");
        sb.append(this.helpCenterUrls);
        sb.append(", features=");
        sb.append(this.features);
        sb.append(", launcherLogoUrl=");
        sb.append(this.launcherLogoUrl);
        sb.append(", teamGreeting=");
        sb.append(this.teamGreeting);
        sb.append(", isIdentityVerificationEnabled=");
        sb.append(this.isIdentityVerificationEnabled);
        sb.append(", isAccessToTeammateEnabled=");
        sb.append(this.isAccessToTeammateEnabled);
        sb.append(", isHelpCenterRequireSearchEnabled=");
        sb.append(this.isHelpCenterRequireSearchEnabled);
        sb.append(", isPreventMultipleInboundConversationsEnabled=");
        sb.append(this.isPreventMultipleInboundConversationsEnabled);
        sb.append(", hasOpenConversations=");
        sb.append(this.hasOpenConversations);
        sb.append(", configModules=");
        sb.append(this.configModules);
        sb.append(", realTimeConfig=");
        sb.append(this.realTimeConfig);
        sb.append(", attachmentSettings=");
        sb.append(this.attachmentSettings);
        sb.append(", articleAutoReactionEnabled=");
        sb.append(this.articleAutoReactionEnabled);
        sb.append(", conversationStateSyncSettings=");
        sb.append(this.conversationStateSyncSettings);
        sb.append(", askUsersToAllowNotifications=");
        return hdi.t(sb, this.askUsersToAllowNotifications, ')');
    }

    @hm6
    public static /* synthetic */ void getPrimaryColor$annotations() {
    }
}

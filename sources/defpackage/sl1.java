package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import bo.app.a8;
import bo.app.o1;
import bo.app.q1;
import bo.app.r1;
import bo.app.v3;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class sl1 extends vt2 {
    public static final q1 Companion = new q1();
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = 15000;
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl1(Context context) {
        super(context);
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.context = applicationContext;
    }

    public final EnumSet a(Class cls, r1 r1Var) {
        String str = r1Var.a;
        if (getConfigurationCache().containsKey(str)) {
            Object obj = getConfigurationCache().get(str);
            obj.getClass();
            return (EnumSet) obj;
        }
        Set<String> stringSetValue = getStringSetValue(r1Var.a, new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet<>();
        }
        EnumSet noneOf = EnumSet.noneOf(cls);
        for (String str2 : stringSetValue) {
            try {
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = str2.toUpperCase(locale);
                upperCase.getClass();
                noneOf.add(Enum.valueOf(cls, upperCase));
            } catch (Exception e) {
                b69.h(f0o.t, pm1.E, e, false, new evk(str2, 6), 4);
            }
        }
        noneOf.getClass();
        getConfigurationCache().put(str, noneOf);
        return noneOf;
    }

    public final int getApplicationIconResourceId() {
        sl1 sl1Var;
        ApplicationInfo applicationInfo;
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            obj.getClass();
            return ((Integer) obj).intValue();
        }
        String packageName = this.context.getPackageName();
        int i = 0;
        try {
            int i2 = Build.VERSION.SDK_INT;
            Context context = this.context;
            if (i2 >= 33) {
                applicationInfo = w6.c(context.getPackageManager(), packageName, w6.d());
            } else {
                applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 0);
            }
            applicationInfo.getClass();
            i = applicationInfo.icon;
            sl1Var = this;
        } catch (Exception e) {
            sl1Var = this;
            b69.h(sl1Var, pm1.E, e, false, new sz(packageName, 25), 4);
        }
        sl1Var.getConfigurationCache().put("application_icon", Integer.valueOf(i));
        return i;
    }

    public final String getBaseUrlForRequests() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String str = "PROD";
        String stringValue = getStringValue("com_braze_server_target", "PROD");
        if (stringValue != null) {
            str = stringValue;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        if (Intrinsics.areEqual("STAGING", upperCase)) {
            return "https://sondheim.braze.com/api/v3/";
        }
        return "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final o1 getBrazeApiKey() {
        sl1 sl1Var;
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String str = (String) getConfigurationCache().get("com_braze_api_key");
        if (str == null) {
            str = getRuntimeAppConfigurationProvider().a("com_braze_api_key", null);
            if (str != null) {
                b69.h(this, pm1.I, null, false, new pl1(9), 6);
                sl1Var = this;
            } else {
                sl1Var = this;
                str = sl1Var.getStringValue("com_braze_api_key", null);
            }
            if (str != null) {
                sl1Var.getConfigurationCache().put("com_braze_api_key", str);
            }
        } else {
            sl1Var = this;
        }
        if (str != null) {
            return new o1(str);
        }
        pm1 pm1Var = pm1.W;
        b69.h(sl1Var, pm1Var, null, false, new pl1(10), 6);
        b69.h(sl1Var, pm1Var, null, false, new pl1(11), 6);
        b69.h(sl1Var, pm1Var, null, false, new pl1(12), 6);
        b69.h(sl1Var, pm1Var, null, false, new pl1(13), 6);
        b69.h(sl1Var, pm1Var, null, false, new pl1(14), 6);
        b69.h(sl1Var, pm1Var, null, false, new pl1(15), 6);
        b69.h(sl1Var, pm1Var, null, false, new pl1(16), 6);
        b69.h(sl1Var, pm1Var, null, false, new pl1(3), 6);
        b69.h(sl1Var, pm1Var, null, false, new pl1(4), 6);
        qp7.p("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
        return null;
    }

    public final String getCustomEndpoint() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_custom_endpoint", null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_custom_html_webview_activity_class_name", "");
    }

    public final EnumSet<zpb> getCustomLocationProviderNames() {
        return a(zpb.class, r1.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    public final int getDefaultNotificationAccentColor() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        Integer colorValue = getColorValue("com_braze_default_notification_accent_color");
        if (colorValue != null) {
            b69.h(this, null, null, false, new pl1(6), 7);
            return colorValue.intValue();
        }
        return 0;
    }

    public final String getDefaultNotificationChannelDescription() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_default_notification_channel_description", "");
        if (stringValue == null) {
            return "";
        }
        return stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_default_notification_channel_name", "General");
        if (stringValue == null) {
            return "General";
        }
        return stringValue;
    }

    public final kj6 getDelayedInitializationAnalyticsBehavior() {
        jj6 jj6Var = kj6.Companion;
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        kj6 kj6Var = kj6.QUEUE;
        String stringValue = getStringValue("com_braze_delayed_initialization_analytics_behavior", kj6Var.b());
        if (stringValue == null) {
            stringValue = kj6Var.b();
        }
        return jj6Var.a(stringValue);
    }

    public final EnumSet<jq6> getDeviceObjectAllowlist() {
        return a(jq6.class, r1.DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_handle_push_deep_links_automatically", false);
    }

    public final boolean getDoesPushStoryDismissOnClick() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_does_push_story_dismiss_on_click", true);
    }

    public final Set<String> getEphemeralEventKeys() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        Set<String> set = fd7.a;
        Set<String> stringSetValue = getStringSetValue("com_braze_ephemeral_events_keys", set);
        if (stringSetValue != null) {
            set = stringSetValue;
        }
        if (set.size() > 12) {
            b69.h(this, pm1.W, null, false, new pl1(7), 6);
        }
        return CollectionsKt.Q0(CollectionsKt.D0(12, set));
    }

    public final String getFallbackFirebaseMessagingServiceClasspath() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_fallback_firebase_cloud_messaging_service_classpath", null);
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_firebase_cloud_messaging_sender_id", null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms", DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getDrawableValue("com_braze_push_large_notification_icon", 0);
    }

    public final int getLoggerInitialLogLevel() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_logger_initial_log_level", 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_push_deep_link_back_stack_activity_class_name", "");
    }

    public final ilg getSdkFlavor() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_sdk_flavor", null);
        if (stringValue != null && !StringsKt.T(stringValue)) {
            try {
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = stringValue.toUpperCase(locale);
                upperCase.getClass();
                return ilg.valueOf(upperCase);
            } catch (Exception e) {
                b69.h(this, pm1.E, e, false, new pl1(8), 4);
            }
        }
        return null;
    }

    public final EnumSet<jn1> getSdkMetadata() {
        String upperCase;
        int i;
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        v3 v3Var = v3.STRING_ARRAY;
        Object resourceConfigurationValue = getResourceConfigurationValue(v3Var, "com_braze_internal_sdk_metadata", new HashSet());
        resourceConfigurationValue.getClass();
        Set<String> d = hhj.d(resourceConfigurationValue);
        Object resourceConfigurationValue2 = getResourceConfigurationValue(v3Var, "com_braze_sdk_metadata", new HashSet());
        resourceConfigurationValue2.getClass();
        Object runtimeConfigurationValue = getRuntimeConfigurationValue(v3Var, "com_braze_sdk_metadata", new HashSet());
        runtimeConfigurationValue.getClass();
        d.addAll((Set) resourceConfigurationValue2);
        d.addAll((Set) runtimeConfigurationValue);
        EnumSet<jn1> noneOf = EnumSet.noneOf(jn1.class);
        for (String str : d) {
            try {
                Locale locale = Locale.US;
                locale.getClass();
                upperCase = str.toUpperCase(locale);
                upperCase.getClass();
            } catch (Exception e) {
                b69.h(f0o.t, pm1.E, e, false, new a8(str), 4);
            }
            for (jn1 jn1Var : jn1.values()) {
                if (Intrinsics.areEqual(jn1Var.name(), upperCase)) {
                    noneOf.add(jn1Var);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        noneOf.getClass();
        return noneOf;
    }

    public final int getSessionTimeoutSeconds() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_session_timeout", 10);
    }

    public final boolean getShouldAddStatusBarPaddingToInAppMessages() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_in_app_message_add_status_bar_padding", false);
    }

    public final boolean getShouldOptInWhenPushAuthorized() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_optin_when_push_authorized", true);
    }

    public final boolean getShouldPersistWebViewWhenBackgroundingApp() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_persist_webview_when_backgrounding_app", true);
    }

    public final boolean getShouldUseWindowFlagSecureInActivities() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_use_activity_window_flag_secure", false);
    }

    public final int getSmallNotificationIconResourceId() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getDrawableValue("com_braze_push_small_notification_icon", 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_trigger_action_minimum_time_interval_seconds", 30);
    }

    public final int getVersionCode() {
        sl1 sl1Var;
        int i;
        if (getConfigurationCache().containsKey("version_code")) {
            Object obj = getConfigurationCache().get("version_code");
            obj.getClass();
            return ((Integer) obj).intValue();
        }
        try {
            Context context = this.context;
            context.getClass();
            String str = jln.a;
            if (str == null) {
                str = context.getPackageName();
                jln.a = str;
                if (str == null) {
                    str = "unknown.package";
                }
            }
            i = this.context.getPackageManager().getPackageInfo(str, 0).versionCode;
            sl1Var = this;
        } catch (Exception e) {
            sl1Var = this;
            b69.h(sl1Var, pm1.E, e, false, new pl1(5), 4);
            i = -1;
        }
        sl1Var.getConfigurationCache().put("version_code", Integer.valueOf(i));
        return i;
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_adm_messaging_registration_enabled", false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_automatic_geofence_requests_enabled", true);
    }

    public final boolean isAutomaticLocationCollectionEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_enable_location_collection", false);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_content_cards_unread_visual_indicator_enabled", true);
    }

    public final boolean isDelayedInitializationEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_enable_delayed_initialization", false);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_device_object_whitelisting_enabled", false);
    }

    public final boolean isEphemeralEventsEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_ephemeral_events_enabled", false);
    }

    public final boolean isFallbackFirebaseMessagingServiceEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_fallback_firebase_cloud_messaging_service_enabled", false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_firebase_cloud_messaging_registration_enabled", false);
    }

    public final boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_firebase_messaging_service_automatically_register_on_new_token", isFirebaseCloudMessagingRegistrationEnabled());
    }

    public final boolean isGeofencesEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_geofences_enabled", isAutomaticLocationCollectionEnabled());
    }

    public final boolean isHtmlInAppMessageApplyWindowInsetsEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_html_in_app_message_apply_insets", true);
    }

    public final boolean isHtmlInAppMessageHtmlLinkTargetEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_html_in_app_message_enable_html_link_target", true);
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled", false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_in_app_message_push_test_eager_display_enabled", true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_deep_link_back_stack_activity_enabled", true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_notification_html_rendering_enabled", false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_wake_screen_for_notification_enabled", true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_sdk_authentication_enabled", false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_session_start_based_timeout_enabled", false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_require_touch_mode_for_html_in_app_messages", true);
    }
}

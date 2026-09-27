package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class mik {
    public static final sd0 a;
    public static final sd0 b;
    public static final sd0 c;
    public static final sd0 d;
    public static final sd0 e;
    public static final sd0 f;
    public static final sd0 g;
    public static final sd0 h;
    public static final sd0 i;

    static {
        new sd0("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", 0);
        new sd0("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", 0);
        a = new sd0("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", 4);
        new sd0("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", 1);
        new sd0("START_SAFE_BROWSING", "START_SAFE_BROWSING", 5);
        new sd0("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", 5);
        new sd0("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", 5);
        new sd0("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", 5);
        new sd0("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", 5);
        new sd0("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", 5);
        new sd0("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", 1);
        new sd0("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", 1);
        new sd0("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", 1);
        new sd0("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", 1);
        new sd0("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", 1);
        new sd0("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", 1);
        new sd0("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", 0);
        new sd0("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", 0);
        new sd0("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", 1);
        new sd0("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", 5);
        new sd0("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", 1);
        new sd0("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", 0);
        new sd0("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", 0);
        new sd0("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", 5);
        new sd0("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", 5);
        new sd0("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", 5);
        new sd0("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", 0);
        new sd0("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", 0);
        b = new sd0("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER", 2);
        new sd0("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", 0);
        new sd0("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", 0);
        new sd0("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", 0);
        new sd0("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", 0);
        new sd0("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", 4);
        new sd0("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", 4);
        new sd0("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", 7);
        new sd0("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", 7);
        new sd0("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", 6);
        new cwh();
        new cwh();
        new cwh();
        new sd0("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", 7);
        sd0 sd0Var = new sd0("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING", 8);
        Pattern.compile("\\A\\d+");
        c = sd0Var;
        new sd0("PROXY_OVERRIDE", "PROXY_OVERRIDE:3", 2);
        d = new sd0("MULTI_PROCESS", "MULTI_PROCESS_QUERY", 2);
        e = new sd0("FORCE_DARK", "FORCE_DARK", 7);
        f = new sd0("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR", 2);
        g = new sd0("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER", 2);
        h = new sd0("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1", 2);
        new sd0("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS", 2);
        new sd0("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER", 2);
        new sd0("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", 2);
        new sd0("GET_COOKIE_INFO", "GET_COOKIE_INFO", 2);
        new sd0("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST", 2);
        new sd0("USER_AGENT_METADATA", "USER_AGENT_METADATA", 2);
        new lik("USER_AGENT_METADATA_FORM_FACTORS", "USER_AGENT_METADATA", 0);
        new lik("MULTI_PROFILE", "MULTI_PROFILE", 1);
        new sd0("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR", 2);
        new sd0("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS", 2);
        new sd0("MUTE_AUDIO", "MUTE_AUDIO", 2);
        new sd0("WEB_AUTHENTICATION", "WEB_AUTHENTICATION", 2);
        new sd0("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING", 2);
        new sd0("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE", 2);
        new sd0("BACK_FORWARD_CACHE_SETTINGS", "BACK_FORWARD_CACHE_SETTINGS", 2);
        new sd0("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V3", "BACK_FORWARD_CACHE_SETTINGS_V3", 2);
        new sd0("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V4", "BACK_FORWARD_CACHE_SETTINGS_V4", 2);
        new sd0("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA", 2);
        new lik("PREFETCH_URL_V5", "PREFETCH_URL_V5", 2);
        new sd0("ASYNC_WEBVIEW_STARTUP_V2");
        new sd0("ASYNC_WEBVIEW_STARTUP");
        new sd0("ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS");
        new sd0("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING", 2);
        new sd0("PRERENDER_URL_V2", "PRERENDER_URL_V3", 2);
        new sd0("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2", 2);
        new sd0("PREFETCH_CACHE_V1", "PREFETCH_CACHE_V1", 2);
        new sd0("SET_MAX_PRERENDERS_V1", "SET_MAX_PRERENDERS_V1", 2);
        new sd0("SAVE_STATE", "SAVE_STATE", 2);
        new sd0("NAVIGATION_GET_WEB_RESOURCE_ERROR", "NAVIGATION_GET_WEB_RESOURCE_ERROR", 2);
        new sd0("NAVIGATION_LISTENER", "PAGE_GET_URL", 2);
        i = new sd0("PROVIDER_WEAKLY_REF_WEBVIEW", "PROVIDER_WEAKLY_REF_WEBVIEW", 2);
        new sd0("PAYMENT_REQUEST", "PAYMENT_REQUEST", 2);
        new sd0("WEBVIEW_BUILDER_EXPERIMENTAL_V1", "WEBVIEW_BUILDER_V1", 2);
        new sd0("WEBVIEW_BUILDER_EXPERIMENTAL_V2", "WEBVIEW_BUILDER_V2", 2);
        new sd0("COOKIE_INTERCEPT", "COOKIE_INTERCEPT", 2);
        new sd0("WARM_UP_RENDERER_PROCESS", "WARM_UP_RENDERER_PROCESS", 2);
        new sd0("ORIGIN_MATCHED_HEADERS", "EXTRA_HEADER_FOR_ORIGINS", 2);
        new sd0("CUSTOM_REQUEST_HEADERS", "CUSTOM_REQUEST_HEADERS", 2);
        new cwh();
        new cwh();
        new cwh();
        new sd0("PRECONNECT", "PRECONNECT", 2);
        new sd0("ADD_QUIC_HINTS", "ADD_QUIC_HINTS_V1", 2);
        new sd0("HYPERLINK_CONTEXT_MENU_ITEMS", "HYPERLINK_CONTEXT_MENU_ITEMS", 2);
        new sd0("JS_INJECTION_IN_FRAME_AND_WORLD", "JS_INJECTION_IN_FRAME_AND_WORLD", 2);
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L17;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0041. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str) {
        boolean z;
        Set<sd0> unmodifiableSet = Collections.unmodifiableSet(sd0.d);
        HashSet hashSet = new HashSet();
        for (sd0 sd0Var : unmodifiableSet) {
            if (sd0Var.a.equals(str)) {
                hashSet.add(sd0Var);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                sd0 sd0Var2 = (sd0) it.next();
                switch (sd0Var2.c) {
                    case 0:
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        z = true;
                        break;
                    case 2:
                    case 3:
                        z = false;
                        break;
                }
                if (z || sd0Var2.a()) {
                    return true;
                }
            }
            return false;
        }
        qp7.p("Unknown feature ".concat(str));
        return false;
    }
}

package io.ably.lib.transport;

import com.socure.docv.capturesdk.common.utils.Scanner;
import defpackage.sl1;
import defpackage.sv6;
import io.ably.lib.transport.ITransport;
import io.ably.lib.transport.WebSocketTransport;
import io.ably.lib.types.ClientOptions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class Defaults {
    public static final String ABLY_AGENT_HEADER = "Ably-Agent";
    public static final String ABLY_AGENT_PARAM = "agent";
    public static final String ABLY_AGENT_VERSION = "ably-java/1.7.1";
    public static final String ABLY_CLIENT_ID_HEADER = "X-Ably-ClientId";
    public static final String ABLY_PROTOCOL_VERSION = "6";
    public static final String ABLY_PROTOCOL_VERSION_HEADER = "X-Ably-Version";
    public static final String ABLY_PROTOCOL_VERSION_PARAM = "v";
    public static final String HOST_REALTIME = "realtime.ably.io";
    public static final String HOST_REST = "rest.ably.io";
    public static final int HTTP_ASYNC_THREADPOOL_SIZE = 64;
    public static final int HTTP_MAX_RETRY_COUNT = 3;
    public static final int PORT = 80;
    public static final int TLS_PORT = 443;
    public static final String[] HOST_FALLBACKS = {"A.ably-realtime.com", "B.ably-realtime.com", "C.ably-realtime.com", "D.ably-realtime.com", "E.ably-realtime.com"};
    public static int TIMEOUT_CONNECT = sl1.DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS;
    public static int TIMEOUT_DISCONNECT = sl1.DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS;
    public static int TIMEOUT_CHANNEL_RETRY = sl1.DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS;
    public static int TIMEOUT_HTTP_OPEN = 4000;
    public static int TIMEOUT_HTTP_REQUEST = 10000;
    public static int httpMaxRetryDuration = sl1.DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS;
    public static long realtimeRequestTimeout = 10000;
    public static long suspendedRetryTimeout = 30000;
    public static long fallbackRetryTimeout = 600000;
    public static long maxIdleInterval = Scanner.MANUAL_BUTTON_DISPLAY_DELAY_MS;
    public static int maxMessageSize = 65536;
    public static long connectionStateTtl = 120000;
    public static final ITransport.Factory TRANSPORT = new WebSocketTransport.Factory();

    public static String[] getEnvironmentFallbackHosts(String str) {
        return new String[]{sv6.m(str, "-a-fallback.ably-realtime.com"), sv6.m(str, "-b-fallback.ably-realtime.com"), sv6.m(str, "-c-fallback.ably-realtime.com"), sv6.m(str, "-d-fallback.ably-realtime.com"), sv6.m(str, "-e-fallback.ably-realtime.com")};
    }

    public static int getPort(ClientOptions clientOptions) {
        if (clientOptions.tls) {
            int i = clientOptions.tlsPort;
            if (i != 0) {
                return i;
            }
            return TLS_PORT;
        }
        int i2 = clientOptions.port;
        if (i2 != 0) {
            return i2;
        }
        return 80;
    }
}

package io.ably.lib.network;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class OkHttpWebSocketEngine implements WebSocketEngine {
    private final WebSocketEngineConfig config;

    public OkHttpWebSocketEngine(WebSocketEngineConfig webSocketEngineConfig) {
        this.config = webSocketEngineConfig;
    }

    @Override // io.ably.lib.network.WebSocketEngine
    public WebSocketClient create(String str, WebSocketListener webSocketListener) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        Request.Builder url = new Request.Builder().url(str);
        OkHttpUtils.injectProxySetting(this.config.getProxy(), builder);
        if (this.config.getSslSocketFactory() != null) {
            builder.sslSocketFactory(this.config.getSslSocketFactory());
        }
        return new OkHttpWebSocketClient(builder.build(), url.build(), webSocketListener);
    }

    @Override // io.ably.lib.network.WebSocketEngine
    public boolean isPingListenerSupported() {
        return false;
    }
}

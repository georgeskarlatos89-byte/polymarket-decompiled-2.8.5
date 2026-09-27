package io.ably.lib.network;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class OkHttpWebSocketEngineFactory implements WebSocketEngineFactory {
    @Override // io.ably.lib.network.WebSocketEngineFactory
    public WebSocketEngine create(WebSocketEngineConfig webSocketEngineConfig) {
        return new OkHttpWebSocketEngine(webSocketEngineConfig);
    }

    @Override // io.ably.lib.network.WebSocketEngineFactory
    public EngineType getEngineType() {
        return EngineType.OKHTTP;
    }
}

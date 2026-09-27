package io.ably.lib.network;

import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class OkHttpEngineFactory implements HttpEngineFactory {
    @Override // io.ably.lib.network.HttpEngineFactory
    public HttpEngine create(HttpEngineConfig httpEngineConfig) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpUtils.injectProxySetting(httpEngineConfig.getProxy(), builder);
        return new OkHttpEngine(builder.build(), httpEngineConfig);
    }

    @Override // io.ably.lib.network.HttpEngineFactory
    public EngineType getEngineType() {
        return EngineType.OKHTTP;
    }
}

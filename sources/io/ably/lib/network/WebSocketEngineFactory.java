package io.ably.lib.network;

import defpackage.dmk;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface WebSocketEngineFactory {
    static WebSocketEngineFactory getFirstAvailable() {
        WebSocketEngineFactory tryGetOkWebSocketFactory = tryGetOkWebSocketFactory();
        if (tryGetOkWebSocketFactory != null) {
            return tryGetOkWebSocketFactory;
        }
        WebSocketEngineFactory tryGetDefaultFactory = tryGetDefaultFactory();
        if (tryGetDefaultFactory != null) {
            return tryGetDefaultFactory;
        }
        dmk.n("No engines are available");
        return null;
    }

    static WebSocketEngineFactory tryGetDefaultFactory() {
        try {
            return (WebSocketEngineFactory) Class.forName("io.ably.lib.network.DefaultWebSocketEngineFactory").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    static WebSocketEngineFactory tryGetOkWebSocketFactory() {
        try {
            return (WebSocketEngineFactory) OkHttpWebSocketEngineFactory.class.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    WebSocketEngine create(WebSocketEngineConfig webSocketEngineConfig);

    EngineType getEngineType();
}

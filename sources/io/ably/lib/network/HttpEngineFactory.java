package io.ably.lib.network;

import defpackage.dmk;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface HttpEngineFactory {
    static HttpEngineFactory getFirstAvailable() {
        HttpEngineFactory tryGetOkHttpFactory = tryGetOkHttpFactory();
        if (tryGetOkHttpFactory != null) {
            return tryGetOkHttpFactory;
        }
        HttpEngineFactory tryGetDefaultFactory = tryGetDefaultFactory();
        if (tryGetDefaultFactory != null) {
            return tryGetDefaultFactory;
        }
        dmk.n("No engines are available");
        return null;
    }

    static HttpEngineFactory tryGetDefaultFactory() {
        try {
            return (HttpEngineFactory) Class.forName("io.ably.lib.network.DefaultHttpEngineFactory").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    static HttpEngineFactory tryGetOkHttpFactory() {
        try {
            return (HttpEngineFactory) OkHttpEngineFactory.class.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    HttpEngine create(HttpEngineConfig httpEngineConfig);

    EngineType getEngineType();
}

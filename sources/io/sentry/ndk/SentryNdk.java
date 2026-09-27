package io.sentry.ndk;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class SentryNdk {
    private static volatile boolean nativeLibrariesLoaded;

    private SentryNdk() {
    }

    public static void close() {
        loadNativeLibraries();
        shutdown();
    }

    public static void init(NdkOptions ndkOptions) {
        loadNativeLibraries();
        int initSentryNative = initSentryNative(ndkOptions);
        if (initSentryNative <= 0) {
            if (initSentryNative >= 0) {
                return;
            }
            dmk.n("A sentry-native setup failure occurred");
            return;
        }
        dmk.n("A sentry-native internal init error occurred, please check the logs for more details.");
    }

    private static native int initSentryNative(NdkOptions ndkOptions);

    public static synchronized void loadNativeLibraries() {
        synchronized (SentryNdk.class) {
            if (!nativeLibrariesLoaded) {
                System.loadLibrary("log");
                System.loadLibrary("sentry");
                System.loadLibrary("sentry-android");
                nativeLibrariesLoaded = true;
            }
        }
    }

    public static void preload() {
        loadNativeLibraries();
        preloadSentryNative();
    }

    private static native void preloadSentryNative();

    private static native void shutdown();
}

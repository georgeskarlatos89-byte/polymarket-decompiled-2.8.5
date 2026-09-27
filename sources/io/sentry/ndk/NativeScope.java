package io.sentry.ndk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class NativeScope {
    public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativeClearAttachments();

    public static native void nativeRemoveUser();

    public static native void nativeSetTrace(String str, String str2);

    public static native void nativeSetUser(String str, String str2, String str3, String str4);
}

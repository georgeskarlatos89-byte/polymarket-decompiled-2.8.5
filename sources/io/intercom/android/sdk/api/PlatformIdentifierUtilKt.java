package io.intercom.android.sdk.api;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\b\u0010\n\u001a\u00020\u000bH\u0002\u001a\b\u0010\f\u001a\u00020\u000bH\u0002\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"ANDROID_HEADER", "", "CORDOVA_HEADER", "REACT_NATIVE_HEADER", "FLUTTER_HEADER", "NATIVE_SDK", "getPlatform", "Lio/intercom/android/sdk/api/Platform;", "context", "Landroid/content/Context;", "isFlutterApp", "", "isReactNativeApp", "getPlatformIdentifier", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformIdentifierUtilKt {
    public static final String ANDROID_HEADER = "intercom-android-sdk";
    public static final String CORDOVA_HEADER = "intercom-sdk-cordova";
    public static final String FLUTTER_HEADER = "intercom-sdk-flutter";
    public static final String NATIVE_SDK = "intercom-sdk-native";
    public static final String REACT_NATIVE_HEADER = "intercom-sdk-react-native";

    private static final Platform getPlatform(Context context) {
        String str;
        String str2;
        String cordovaVersion = WrapperPrefsStore.INSTANCE.create(context).getCordovaVersion();
        if (!isReactNativeApp()) {
            str = "";
        } else {
            str = REACT_NATIVE_HEADER;
        }
        if (!isFlutterApp()) {
            str2 = "";
        } else {
            str2 = FLUTTER_HEADER;
        }
        if (!Intrinsics.areEqual(cordovaVersion, "")) {
            return Platform.Cordova;
        }
        if (!Intrinsics.areEqual(str, "")) {
            return Platform.ReactNative;
        }
        if (!Intrinsics.areEqual(str2, "")) {
            return Platform.Flutter;
        }
        return Platform.Native;
    }

    public static final String getPlatformIdentifier(Context context) {
        context.getClass();
        return getPlatform(context).getIdentifier();
    }

    private static final boolean isFlutterApp() {
        try {
            Class.forName("io.maido.intercom.IntercomFlutterPlugin");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final boolean isReactNativeApp() {
        try {
            Class.forName("com.intercom.reactnative.IntercomModule");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

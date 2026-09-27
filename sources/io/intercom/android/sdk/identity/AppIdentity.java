package io.intercom.android.sdk.identity;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class AppIdentity {
    public static AppIdentity create(String str, String str2) {
        return new AutoValue_AppIdentity(str, str2);
    }

    public abstract String apiKey();

    public abstract String appId();
}

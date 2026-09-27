package com.google.android.play.core.integrity;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class IntegrityTokenRequest {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j);

        public abstract Builder setNonce(String str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.play.core.integrity.IntegrityTokenRequest$Builder, java.lang.Object] */
    public static Builder builder() {
        return new Object();
    }

    public abstract Long a();

    public abstract String b();
}

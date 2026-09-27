package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ConsumerAlert implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract ConsumerAlert build();

        public abstract Builder setDetails(ConsumerAlertDetails consumerAlertDetails);

        public abstract Builder setLanguageCode(String str);

        public abstract Builder setOverview(String str);
    }

    public static Builder builder() {
        return new zzaa();
    }

    public abstract ConsumerAlertDetails getDetails();

    public abstract String getLanguageCode();

    public abstract String getOverview();
}

package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class Area implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract Area build();

        public abstract Builder setContainment(Containment containment);

        public abstract Builder setDisplayName(String str);

        public abstract Builder setDisplayNameLanguageCode(String str);

        public abstract Builder setId(String str);

        public abstract Builder setResourceName(String str);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum Containment {
        CONTAINMENT_UNSPECIFIED,
        WITHIN,
        OUTSKIRTS,
        NEAR
    }

    public static Builder builder() {
        return new zzh();
    }

    public abstract Containment getContainment();

    public abstract String getDisplayName();

    public abstract String getDisplayNameLanguageCode();

    public abstract String getId();

    public abstract String getResourceName();
}

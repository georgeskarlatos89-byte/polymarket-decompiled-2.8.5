package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class RouteModifiers implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract RouteModifiers build();

        public abstract boolean isFerryAvoided();

        public abstract boolean isHighwayAvoided();

        public abstract boolean isIndoorAvoided();

        public abstract boolean isTollAvoided();

        public abstract Builder setFerryAvoided(boolean z);

        public abstract Builder setHighwayAvoided(boolean z);

        public abstract Builder setIndoorAvoided(boolean z);

        public abstract Builder setTollAvoided(boolean z);
    }

    public static Builder builder() {
        zzcn zzcnVar = new zzcn();
        zzcnVar.setTollAvoided(false);
        zzcnVar.setHighwayAvoided(false);
        zzcnVar.setFerryAvoided(false);
        zzcnVar.setIndoorAvoided(false);
        return zzcnVar;
    }

    public abstract boolean isFerryAvoided();

    public abstract boolean isHighwayAvoided();

    public abstract boolean isIndoorAvoided();

    public abstract boolean isTollAvoided();
}

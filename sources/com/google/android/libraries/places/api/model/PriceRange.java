package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class PriceRange implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract PriceRange build();

        public abstract Builder setEndPrice(Money money);

        public abstract Builder setStartPrice(Money money);
    }

    public static Builder builder() {
        return new zzcb();
    }

    public abstract Money getEndPrice();

    public abstract Money getStartPrice();
}

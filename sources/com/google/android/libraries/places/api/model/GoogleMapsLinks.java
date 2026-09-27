package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class GoogleMapsLinks implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract GoogleMapsLinks build();

        public abstract Builder setDirectionsUri(Uri uri);

        public abstract Builder setPhotosUri(Uri uri);

        public abstract Builder setPlaceUri(Uri uri);

        public abstract Builder setReviewsUri(Uri uri);

        public abstract Builder setWriteAReviewUri(Uri uri);
    }

    public static Builder builder() {
        return new zzav();
    }

    public abstract Uri getDirectionsUri();

    public abstract Uri getPhotosUri();

    public abstract Uri getPlaceUri();

    public abstract Uri getReviewsUri();

    public abstract Uri getWriteAReviewUri();
}

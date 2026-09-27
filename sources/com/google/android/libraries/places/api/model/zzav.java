package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.libraries.places.api.model.GoogleMapsLinks;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzav extends GoogleMapsLinks.Builder {
    private Uri zza;
    private Uri zzb;
    private Uri zzc;
    private Uri zzd;
    private Uri zze;

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final GoogleMapsLinks build() {
        return new zzfi(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final GoogleMapsLinks.Builder setDirectionsUri(Uri uri) {
        this.zza = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final GoogleMapsLinks.Builder setPhotosUri(Uri uri) {
        this.zze = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final GoogleMapsLinks.Builder setPlaceUri(Uri uri) {
        this.zzb = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final GoogleMapsLinks.Builder setReviewsUri(Uri uri) {
        this.zzd = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder
    public final GoogleMapsLinks.Builder setWriteAReviewUri(Uri uri) {
        this.zzc = uri;
        return this;
    }
}

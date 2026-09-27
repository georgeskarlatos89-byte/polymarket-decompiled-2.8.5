package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import defpackage.dmk;
import defpackage.p23;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzg extends FetchResolvedPhotoUriRequest.Builder {
    private Integer zza;
    private Integer zzb;
    private PhotoMetadata zzc;
    private p23 zzd;

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final p23 getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final FetchResolvedPhotoUriRequest.Builder setCancellationToken(p23 p23Var) {
        this.zzd = p23Var;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final FetchResolvedPhotoUriRequest.Builder setMaxHeight(Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final FetchResolvedPhotoUriRequest.Builder setMaxWidth(Integer num) {
        this.zza = num;
        return this;
    }

    public final FetchResolvedPhotoUriRequest.Builder zza(PhotoMetadata photoMetadata) {
        if (photoMetadata != null) {
            this.zzc = photoMetadata;
            return this;
        }
        dmk.s("Null photoMetadata");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final PhotoMetadata zzb() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return photoMetadata;
        }
        dmk.n("Property \"photoMetadata\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final FetchResolvedPhotoUriRequest zzc() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return new zzh(this.zza, this.zzb, photoMetadata, this.zzd, null);
        }
        dmk.n("Missing required properties: photoMetadata");
        return null;
    }
}

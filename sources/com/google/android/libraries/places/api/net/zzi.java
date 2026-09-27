package com.google.android.libraries.places.api.net;

import android.net.Uri;
import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzi extends FetchResolvedPhotoUriResponse {
    private final Uri zza;

    public zzi(Uri uri) {
        this.zza = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FetchResolvedPhotoUriResponse)) {
            return false;
        }
        FetchResolvedPhotoUriResponse fetchResolvedPhotoUriResponse = (FetchResolvedPhotoUriResponse) obj;
        Uri uri = this.zza;
        if (uri == null) {
            if (fetchResolvedPhotoUriResponse.getUri() == null) {
                return true;
            }
            return false;
        }
        return uri.equals(fetchResolvedPhotoUriResponse.getUri());
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse
    public final Uri getUri() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode;
        Uri uri = this.zza;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return ix2.p(new StringBuilder(valueOf.length() + 35), "FetchResolvedPhotoUriResponse{uri=", valueOf, "}");
    }
}

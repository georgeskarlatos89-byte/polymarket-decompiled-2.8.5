package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;
import defpackage.dmk;
import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzc extends FetchPhotoResponse {
    private final Bitmap zza;

    public zzc(Bitmap bitmap) {
        if (bitmap != null) {
            this.zza = bitmap;
        } else {
            dmk.s("Null bitmap");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPhotoResponse) {
            return this.zza.equals(((FetchPhotoResponse) obj).getBitmap());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoResponse
    public final Bitmap getBitmap() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return ix2.p(new StringBuilder(obj.length() + 27), "FetchPhotoResponse{bitmap=", obj, "}");
    }
}

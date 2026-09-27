package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zzqk;
import defpackage.brn;
import defpackage.dmk;
import defpackage.p23;
import defpackage.wql;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class FetchResolvedPhotoUriRequest implements zzqk {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public FetchResolvedPhotoUriRequest build() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            PhotoMetadata zzb = zzb();
            Integer maxWidth = getMaxWidth();
            Integer maxHeight = getMaxHeight();
            boolean z6 = false;
            if (zzb.zzb() != null) {
                z = true;
            } else {
                z = false;
            }
            brn.g("To construct the FetchResolvedPhotoUriRequest, the provided PhotoMetadata must be fetched from Places API (New). You must first call initializeWithNewPlacesApiEnabled to initialize the PlaceClient and retrieve the PhotoMetadata. Once you have the PhotoMetadata, you must pass it into the FetchResolvedPhotoUriRequest.", z);
            if (maxWidth != null) {
                if (maxWidth.intValue() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                brn.e(maxWidth, "Max width must not be < 1, but was: %s.", z4);
                if (maxWidth.intValue() <= 4800) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    dmk.v(wql.a("Max width must not be > %s, but was: %s.", 4800, maxWidth));
                    return null;
                }
            }
            if (maxHeight != null) {
                if (maxHeight.intValue() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                brn.e(maxHeight, "Max height must not be < 1, but was: %s.", z2);
                if (maxHeight.intValue() <= 4800) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    dmk.v(wql.a("Max height must not be > %s, but was: %s.", 4800, maxHeight));
                    return null;
                }
            }
            if (maxWidth == null && maxHeight == null) {
                int width = zzb.getWidth();
                if (width > 0) {
                    setMaxWidth(Integer.valueOf(Math.min(4800, width)));
                }
                int height = zzb.getHeight();
                if (height > 0) {
                    setMaxHeight(Integer.valueOf(Math.min(4800, height)));
                }
            }
            if (getMaxWidth() != null || getMaxHeight() != null) {
                z6 = true;
            }
            brn.r("Must include max width or max height in the request.", z6);
            return zzc();
        }

        public abstract p23 getCancellationToken();

        public abstract Integer getMaxHeight();

        public abstract Integer getMaxWidth();

        public abstract Builder setCancellationToken(p23 p23Var);

        public abstract Builder setMaxHeight(Integer num);

        public abstract Builder setMaxWidth(Integer num);

        public abstract PhotoMetadata zzb();

        public abstract FetchResolvedPhotoUriRequest zzc();
    }

    public static Builder builder(PhotoMetadata photoMetadata) {
        zzg zzgVar = new zzg();
        zzgVar.zza(photoMetadata);
        return zzgVar;
    }

    public static FetchResolvedPhotoUriRequest newInstance(PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }

    @Override // com.google.android.libraries.places.internal.zzqk
    public abstract p23 getCancellationToken();

    public abstract Integer getMaxHeight();

    public abstract Integer getMaxWidth();

    public abstract PhotoMetadata getPhotoMetadata();
}

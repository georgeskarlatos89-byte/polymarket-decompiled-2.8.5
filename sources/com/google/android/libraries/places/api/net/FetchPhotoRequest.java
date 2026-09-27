package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zzqk;
import defpackage.p23;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes3.dex */
public abstract class FetchPhotoRequest implements zzqk {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Deprecated
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public FetchPhotoRequest build() {
            PhotoMetadata zzb = zzb();
            if (getMaxWidth() == null && getMaxHeight() == null) {
                int width = zzb.getWidth();
                if (width > 0) {
                    setMaxWidth(Integer.valueOf(width));
                }
                int height = zzb.getHeight();
                if (height > 0) {
                    setMaxHeight(Integer.valueOf(height));
                }
            }
            return zzc();
        }

        public abstract p23 getCancellationToken();

        public abstract Integer getMaxHeight();

        public abstract Integer getMaxWidth();

        public abstract Builder setCancellationToken(p23 p23Var);

        public abstract Builder setMaxHeight(Integer num);

        public abstract Builder setMaxWidth(Integer num);

        public abstract PhotoMetadata zzb();

        public abstract FetchPhotoRequest zzc();
    }

    public static Builder builder(PhotoMetadata photoMetadata) {
        zza zzaVar = new zza();
        zzaVar.zza(photoMetadata);
        return zzaVar;
    }

    public static FetchPhotoRequest newInstance(PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }

    @Override // com.google.android.libraries.places.internal.zzqk
    public abstract p23 getCancellationToken();

    public abstract Integer getMaxHeight();

    public abstract Integer getMaxWidth();

    public abstract PhotoMetadata getPhotoMetadata();
}

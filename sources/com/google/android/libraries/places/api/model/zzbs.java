package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbs extends PhotoMetadata.Builder {
    private String zza;
    private int zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private AuthorAttributions zzf;
    private Uri zzg;
    private Uri zzh;
    private byte zzi;

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final String getAttributions() {
        String str = this.zza;
        if (str != null) {
            return str;
        }
        dmk.n("Property \"attributions\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final AuthorAttributions getAuthorAttributions() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final Uri getFlagContentUri() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getHeight() {
        if ((this.zzi & 1) != 0) {
            return this.zzb;
        }
        dmk.n("Property \"height\" has not been set");
        return 0;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getWidth() {
        if ((this.zzi & 2) != 0) {
            return this.zzc;
        }
        dmk.n("Property \"width\" has not been set");
        return 0;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setAttributions(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null attributions");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setAuthorAttributions(AuthorAttributions authorAttributions) {
        this.zzf = authorAttributions;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setFlagContentUri(Uri uri) {
        this.zzg = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setHeight(int i) {
        this.zzb = i;
        this.zzi = (byte) (this.zzi | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setWidth(int i) {
        this.zzc = i;
        this.zzi = (byte) (this.zzi | 2);
        return this;
    }

    public final PhotoMetadata.Builder zza(String str) {
        if (str != null) {
            this.zzd = str;
            return this;
        }
        dmk.s("Null photoReference");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder zzb(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder zzc(Uri uri) {
        this.zzh = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata zzd() {
        String str;
        String str2;
        if (this.zzi == 3 && (str = this.zza) != null && (str2 = this.zzd) != null) {
            return new zzgg(str, this.zzb, this.zzc, str2, this.zze, this.zzf, this.zzg, this.zzh);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" attributions");
        }
        if ((this.zzi & 1) == 0) {
            sb.append(" height");
        }
        if ((this.zzi & 2) == 0) {
            sb.append(" width");
        }
        if (this.zzd == null) {
            sb.append(" photoReference");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}

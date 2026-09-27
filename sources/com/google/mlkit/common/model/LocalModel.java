package com.google.mlkit.common.model;

import android.net.Uri;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
import defpackage.arn;
import defpackage.dkn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class LocalModel {
    private final String zza;
    private final String zzb;
    private final Uri zzc;
    private final boolean zzd;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class Builder {
        private String zza = null;
        private String zzb = null;
        private Uri zzc = null;
        private boolean zzd = false;

        public LocalModel build() {
            String str = this.zza;
            boolean z = true;
            if ((str == null || this.zzb != null || this.zzc != null) && ((str != null || this.zzb == null || this.zzc != null) && (str != null || this.zzb != null || this.zzc == null))) {
                z = false;
            }
            arn.a("Set one of filePath, assetFilePath and URI.", z);
            return new LocalModel(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        public Builder setAbsoluteFilePath(String str) {
            arn.f(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.zzb == null && this.zzc == null && !this.zzd) {
                z = true;
            }
            arn.a("A local model source is from absolute file path, asset file path or URI, you can only set one of them.", z);
            this.zza = str;
            return this;
        }

        public Builder setAbsoluteManifestFilePath(String str) {
            arn.f(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.zzb == null && this.zzc == null && (this.zza == null || this.zzd)) {
                z = true;
            }
            arn.a("A local model source is from absolute file path, asset file path or URI, you can only set one of them.", z);
            this.zza = str;
            this.zzd = true;
            return this;
        }

        public Builder setAssetFilePath(String str) {
            arn.f(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.zza == null && this.zzc == null && !this.zzd) {
                z = true;
            }
            arn.a("A local model source is from absolute file path, asset file path or URI, you can only set one of them.", z);
            this.zzb = str;
            return this;
        }

        public Builder setAssetManifestFilePath(String str) {
            arn.f(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.zza == null && this.zzc == null && (this.zzb == null || this.zzd)) {
                z = true;
            }
            arn.a("A local model source is from absolute file path, asset file path or URI, you can only set one of them.", z);
            this.zzb = str;
            this.zzd = true;
            return this;
        }

        public Builder setUri(Uri uri) {
            boolean z = false;
            if (this.zza == null && this.zzb == null) {
                z = true;
            }
            arn.a("A local model source is from absolute file path, asset file path or URI, you can only set one of them.", z);
            this.zzc = uri;
            return this;
        }
    }

    public /* synthetic */ LocalModel(String str, String str2, Uri uri, boolean z, zzc zzcVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzd = z;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalModel)) {
            return false;
        }
        LocalModel localModel = (LocalModel) obj;
        if (!dkn.b(this.zza, localModel.zza) || !dkn.b(this.zzb, localModel.zzb) || !dkn.b(this.zzc, localModel.zzc) || this.zzd != localModel.zzd) {
            return false;
        }
        return true;
    }

    public String getAbsoluteFilePath() {
        return this.zza;
    }

    public String getAssetFilePath() {
        return this.zzb;
    }

    public Uri getUri() {
        return this.zzc;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, Boolean.valueOf(this.zzd)});
    }

    public boolean isManifestFile() {
        return this.zzd;
    }

    public String toString() {
        zzq zza = zzr.zza(this);
        zza.zza("absoluteFilePath", this.zza);
        zza.zza("assetFilePath", this.zzb);
        zza.zza("uri", this.zzc);
        zza.zzb("isManifestFile", this.zzd);
        return zza.toString();
    }
}

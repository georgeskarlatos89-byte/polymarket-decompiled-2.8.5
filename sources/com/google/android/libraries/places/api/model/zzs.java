package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import defpackage.dmk;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzs extends AutocompletePrediction.Builder {
    private String zza;
    private Integer zzb;
    private List zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private List zzg;
    private List zzh;
    private List zzi;

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final Integer getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final String getFullText() {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        dmk.n("Property \"fullText\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final String getPrimaryText() {
        String str = this.zze;
        if (str != null) {
            return str;
        }
        dmk.n("Property \"primaryText\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final String getSecondaryText() {
        String str = this.zzf;
        if (str != null) {
            return str;
        }
        dmk.n("Property \"secondaryText\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final List<String> getTypes() {
        List<String> list = this.zzc;
        if (list != null) {
            return list;
        }
        dmk.n("Property \"types\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setDistanceMeters(Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setFullText(String str) {
        if (str != null) {
            this.zzd = str;
            return this;
        }
        dmk.s("Null fullText");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setPrimaryText(String str) {
        if (str != null) {
            this.zze = str;
            return this;
        }
        dmk.s("Null primaryText");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setSecondaryText(String str) {
        if (str != null) {
            this.zzf = str;
            return this;
        }
        dmk.s("Null secondaryText");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setTypes(List<String> list) {
        if (list != null) {
            this.zzc = list;
            return this;
        }
        dmk.s("Null types");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null placeId");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zzb(List list) {
        if (list != null) {
            this.zzg = list;
            return this;
        }
        dmk.s("Null fullTextMatchedSubstrings");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zzc(List list) {
        if (list != null) {
            this.zzh = list;
            return this;
        }
        dmk.s("Null primaryTextMatchedSubstrings");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zzd(List list) {
        if (list != null) {
            this.zzi = list;
            return this;
        }
        dmk.s("Null secondaryTextMatchedSubstrings");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction zze() {
        List list;
        String str;
        String str2;
        String str3;
        List list2;
        List list3;
        List list4;
        String str4 = this.zza;
        if (str4 != null && (list = this.zzc) != null && (str = this.zzd) != null && (str2 = this.zze) != null && (str3 = this.zzf) != null && (list2 = this.zzg) != null && (list3 = this.zzh) != null && (list4 = this.zzi) != null) {
            return new zzec(str4, this.zzb, list, str, str2, str3, list2, list3, list4);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" placeId");
        }
        if (this.zzc == null) {
            sb.append(" types");
        }
        if (this.zzd == null) {
            sb.append(" fullText");
        }
        if (this.zze == null) {
            sb.append(" primaryText");
        }
        if (this.zzf == null) {
            sb.append(" secondaryText");
        }
        if (this.zzg == null) {
            sb.append(" fullTextMatchedSubstrings");
        }
        if (this.zzh == null) {
            sb.append(" primaryTextMatchedSubstrings");
        }
        if (this.zzi == null) {
            sb.append(" secondaryTextMatchedSubstrings");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}

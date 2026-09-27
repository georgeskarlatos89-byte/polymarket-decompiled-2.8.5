package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.libraries.places.api.model.EvChargeAmenitySummary;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzan extends EvChargeAmenitySummary.Builder {
    private ContentBlock zza;
    private ContentBlock zzb;
    private ContentBlock zzc;
    private ContentBlock zzd;
    private Uri zze;
    private String zzf;
    private String zzg;

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final EvChargeAmenitySummary build() {
        ContentBlock contentBlock = this.zza;
        if (contentBlock != null) {
            return new zzfa(contentBlock, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }
        dmk.n("Missing required properties: overview");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final EvChargeAmenitySummary.Builder setCoffee(ContentBlock contentBlock) {
        this.zzb = contentBlock;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final EvChargeAmenitySummary.Builder setDisclosureText(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final EvChargeAmenitySummary.Builder setDisclosureTextLanguageCode(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final EvChargeAmenitySummary.Builder setFlagContentUri(Uri uri) {
        this.zze = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final EvChargeAmenitySummary.Builder setRestaurant(ContentBlock contentBlock) {
        this.zzc = contentBlock;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final EvChargeAmenitySummary.Builder setStore(ContentBlock contentBlock) {
        this.zzd = contentBlock;
        return this;
    }

    public final EvChargeAmenitySummary.Builder zza(ContentBlock contentBlock) {
        if (contentBlock != null) {
            this.zza = contentBlock;
            return this;
        }
        dmk.s("Null overview");
        return null;
    }
}

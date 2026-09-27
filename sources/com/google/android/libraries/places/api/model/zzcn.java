package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.RouteModifiers;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcn extends RouteModifiers.Builder {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private byte zze;

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final RouteModifiers build() {
        if (this.zze != 15) {
            StringBuilder sb = new StringBuilder();
            if ((this.zze & 1) == 0) {
                sb.append(" tollAvoided");
            }
            if ((this.zze & 2) == 0) {
                sb.append(" highwayAvoided");
            }
            if ((this.zze & 4) == 0) {
                sb.append(" ferryAvoided");
            }
            if ((this.zze & 8) == 0) {
                sb.append(" indoorAvoided");
            }
            dmk.n("Missing required properties:".concat(sb.toString()));
            return null;
        }
        return new zzhc(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isFerryAvoided() {
        if ((this.zze & 4) != 0) {
            return this.zzc;
        }
        dmk.n("Property \"ferryAvoided\" has not been set");
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isHighwayAvoided() {
        if ((this.zze & 2) != 0) {
            return this.zzb;
        }
        dmk.n("Property \"highwayAvoided\" has not been set");
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isIndoorAvoided() {
        if ((this.zze & 8) != 0) {
            return this.zzd;
        }
        dmk.n("Property \"indoorAvoided\" has not been set");
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final boolean isTollAvoided() {
        if ((this.zze & 1) != 0) {
            return this.zza;
        }
        dmk.n("Property \"tollAvoided\" has not been set");
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final RouteModifiers.Builder setFerryAvoided(boolean z) {
        this.zzc = z;
        this.zze = (byte) (this.zze | 4);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final RouteModifiers.Builder setHighwayAvoided(boolean z) {
        this.zzb = z;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final RouteModifiers.Builder setIndoorAvoided(boolean z) {
        this.zzd = z;
        this.zze = (byte) (this.zze | 8);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers.Builder
    public final RouteModifiers.Builder setTollAvoided(boolean z) {
        this.zza = z;
        this.zze = (byte) (this.zze | 1);
        return this;
    }
}

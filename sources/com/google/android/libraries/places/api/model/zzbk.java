package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.OpeningHours;
import defpackage.dmk;
import java.time.Instant;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbk extends OpeningHours.Builder {
    private OpeningHours.HoursType zza;
    private List zzb;
    private List zzc;
    private List zzd;
    private Boolean zze;
    private Instant zzf;
    private Instant zzg;

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.HoursType getHoursType() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<Period> getPeriods() {
        List<Period> list = this.zzb;
        if (list != null) {
            return list;
        }
        dmk.n("Property \"periods\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<SpecialDay> getSpecialDays() {
        List<SpecialDay> list = this.zzc;
        if (list != null) {
            return list;
        }
        dmk.n("Property \"specialDays\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<String> getWeekdayText() {
        List<String> list = this.zzd;
        if (list != null) {
            return list;
        }
        dmk.n("Property \"weekdayText\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setHoursType(OpeningHours.HoursType hoursType) {
        this.zza = hoursType;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setPeriods(List<Period> list) {
        if (list != null) {
            this.zzb = list;
            return this;
        }
        dmk.s("Null periods");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setSpecialDays(List<SpecialDay> list) {
        if (list != null) {
            this.zzc = list;
            return this;
        }
        dmk.s("Null specialDays");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setWeekdayText(List<String> list) {
        if (list != null) {
            this.zzd = list;
            return this;
        }
        dmk.s("Null weekdayText");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder zza(Boolean bool) {
        this.zze = bool;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder zzb(Instant instant) {
        this.zzf = instant;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder zzc(Instant instant) {
        this.zzg = instant;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours zzd() {
        List list;
        List list2;
        List list3 = this.zzb;
        if (list3 != null && (list = this.zzc) != null && (list2 = this.zzd) != null) {
            return new zzfy(this.zza, list3, list, list2, this.zze, this.zzf, this.zzg);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zzb == null) {
            sb.append(" periods");
        }
        if (this.zzc == null) {
            sb.append(" specialDays");
        }
        if (this.zzd == null) {
            sb.append(" weekdayText");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}

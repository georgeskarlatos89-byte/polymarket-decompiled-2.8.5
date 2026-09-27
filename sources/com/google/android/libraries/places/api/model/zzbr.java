package com.google.android.libraries.places.api.model;

import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzbr extends Period {
    private final TimeOfWeek zza;
    private final TimeOfWeek zzb;

    public zzbr(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        this.zza = timeOfWeek;
        this.zzb = timeOfWeek2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            TimeOfWeek timeOfWeek = this.zza;
            if (timeOfWeek != null ? timeOfWeek.equals(period.getOpen()) : period.getOpen() == null) {
                TimeOfWeek timeOfWeek2 = this.zzb;
                if (timeOfWeek2 != null ? timeOfWeek2.equals(period.getClose()) : period.getClose() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Period
    public final TimeOfWeek getClose() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Period
    public final TimeOfWeek getOpen() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode;
        TimeOfWeek timeOfWeek = this.zza;
        int i = 0;
        if (timeOfWeek == null) {
            hashCode = 0;
        } else {
            hashCode = timeOfWeek.hashCode();
        }
        TimeOfWeek timeOfWeek2 = this.zzb;
        if (timeOfWeek2 != null) {
            i = timeOfWeek2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        TimeOfWeek timeOfWeek = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(timeOfWeek);
        StringBuilder sb = new StringBuilder(valueOf.length() + 20 + valueOf2.length() + 1);
        k84.q(sb, "Period{open=", valueOf, ", close=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

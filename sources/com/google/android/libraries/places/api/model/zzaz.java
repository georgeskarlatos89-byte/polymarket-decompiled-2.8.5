package com.google.android.libraries.places.api.model;

import defpackage.dmk;
import java.time.Duration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzaz extends Leg {
    private final Duration zza;
    private final int zzb;

    public zzaz(Duration duration, int i) {
        if (duration != null) {
            this.zza = duration;
            this.zzb = i;
        } else {
            dmk.s("Null duration");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Leg) {
            Leg leg = (Leg) obj;
            if (this.zza.equals(leg.getDuration()) && this.zzb == leg.getDistanceMeters()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Leg
    public final int getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Leg
    public final Duration getDuration() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zzb ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 30 + String.valueOf(i).length() + 1);
        sb.append("Leg{duration=");
        sb.append(obj);
        sb.append(", distanceMeters=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

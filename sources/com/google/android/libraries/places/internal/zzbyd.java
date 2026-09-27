package com.google.android.libraries.places.internal;

import defpackage.k84;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import skip.lib.Duration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbyd implements Comparable {
    public static final /* synthetic */ int zza = 0;
    private static final zzbyc zzb = new zzbyb(null);
    private static final long zzc = 3153600000000000000L;
    private static final long zzd = -3153600000000000000L;
    private static final long zze = Duration.ATTOSECONDS_PER_NANOSECOND;
    private final zzbyc zzf;
    private final long zzg;
    private volatile boolean zzh;

    private zzbyd(zzbyc zzbycVar, long j, long j2, boolean z) {
        boolean z2;
        this.zzf = zzbycVar;
        long min = Math.min(zzc, Math.max(zzd, j2));
        this.zzg = j + min;
        if (min <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzh = z2;
    }

    public static zzbyd zza(long j, TimeUnit timeUnit) {
        zzbyc zzbycVar = zzb;
        Objects.requireNonNull(timeUnit, "units");
        return new zzbyd(zzbycVar, System.nanoTime(), timeUnit.toNanos(j), true);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return zzd((zzbyd) obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbyd)) {
            return false;
        }
        zzbyd zzbydVar = (zzbyd) obj;
        if (this.zzf == zzbydVar.zzf && this.zzg == zzbydVar.zzg) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zzf, Long.valueOf(this.zzg));
    }

    public final String toString() {
        long zzc2 = zzc(TimeUnit.NANOSECONDS);
        long abs = Math.abs(zzc2);
        long j = zze;
        long j2 = abs / j;
        long abs2 = Math.abs(zzc2) % j;
        StringBuilder sb = new StringBuilder();
        if (zzc2 < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        zzbyc zzbycVar = this.zzf;
        if (zzbycVar != zzb) {
            String obj = zzbycVar.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 10);
            sb2.append(" (ticker=");
            sb2.append(obj);
            sb2.append(")");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    public final boolean zzb() {
        if (!this.zzh) {
            if (this.zzg - System.nanoTime() <= 0) {
                this.zzh = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public final long zzc(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.zzh && this.zzg - nanoTime <= 0) {
            this.zzh = true;
        }
        return timeUnit.convert(this.zzg - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final int zzd(zzbyd zzbydVar) {
        zzbyc zzbycVar = this.zzf;
        zzbyc zzbycVar2 = zzbydVar.zzf;
        if (zzbycVar == zzbycVar2) {
            return Long.compare(this.zzg, zzbydVar.zzg);
        }
        String obj = zzbycVar.toString();
        String obj2 = zzbycVar2.toString();
        StringBuilder sb = new StringBuilder(obj2.length() + obj.length() + 14 + 58);
        k84.q(sb, "Tickers (", obj, " and ", obj2);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb.toString());
    }
}

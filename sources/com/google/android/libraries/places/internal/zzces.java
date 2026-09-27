package com.google.android.libraries.places.internal;

import java.util.Locale;
import java.util.Objects;
import skip.lib.Duration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzces implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb = "CallOptions";
    final /* synthetic */ zzcfg zzc;

    public zzces(zzcfg zzcfgVar, long j, String str) {
        this.zza = j;
        Objects.requireNonNull(zzcfgVar);
        this.zzc = zzcfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.zza;
        long abs = Math.abs(j) / Duration.ATTOSECONDS_PER_NANOSECOND;
        long abs2 = Math.abs(j) % Duration.ATTOSECONDS_PER_NANOSECOND;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append("ClientCall started after ");
            sb.append(this.zzb);
            sb.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb.append("Deadline ");
            sb.append(this.zzb);
            sb.append(" was exceeded after ");
        }
        sb.append(abs);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb.append("s");
        this.zzc.zzi(zzccd.zzd.zze(sb.toString()), true);
    }
}

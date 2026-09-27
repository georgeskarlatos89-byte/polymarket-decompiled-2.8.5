package com.google.android.libraries.places.internal;

import android.content.Context;
import defpackage.dmk;
import defpackage.op8;
import defpackage.pql;
import defpackage.pt6;
import defpackage.r5;
import defpackage.ujb;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzlb {
    final zzcai zza;
    final ScheduledExecutorService zzb = Executors.newSingleThreadScheduledExecutor();
    int zzc = 0;
    Long zzd;
    zzbtw zze;
    String zzf;
    private final Context zzg;
    private final zzbuw zzh;

    public zzlb(Context context, zzcai zzcaiVar) {
        this.zzg = context;
        this.zza = zzcaiVar;
        this.zzh = zzbux.zzc(zzcaiVar);
    }

    public final ujb zza() {
        zzbtw zzbtwVar = this.zze;
        if (zzbtwVar != null && zzbtwVar.zzc() >= Instant.now().getEpochSecond()) {
            String str = this.zzf;
            if (str != null) {
                return pql.d(str);
            }
            dmk.n("Signature not generated.");
            return null;
        }
        return r5.i(zzb(), new op8() { // from class: com.google.android.libraries.places.internal.zzla
            @Override // defpackage.op8
            public final /* synthetic */ Object apply(Object obj) {
                String str2 = zzlb.this.zzf;
                if (str2 != null) {
                    return str2;
                }
                dmk.n("Signature not generated.");
                return null;
            }
        }, pt6.INSTANCE);
    }

    public final ujb zzb() {
        this.zzc++;
        Context context = this.zzg;
        zzbuy zzc = zzbuz.zzc();
        zzc.zza(context.getPackageName());
        zzbuz zzbuzVar = (zzbuz) zzc.zzD();
        zzbuw zzbuwVar = this.zzh;
        ujb zzb = zzcsv.zzb(zzbuwVar.zzc().zza(zzbux.zza(), zzbuwVar.zzd()), zzbuzVar);
        pql.a(zzb, new zzky(this), pt6.INSTANCE);
        return zzb;
    }

    public final String zzc(long j) {
        String packageName = this.zzg.getPackageName();
        int length = packageName.length() + 1;
        long[] jArr = new long[length];
        jArr[0] = j;
        int i = 0;
        while (i < packageName.length()) {
            int i2 = i + 1;
            jArr[i2] = packageName.codePointAt(i) & 4294967295L;
            i = i2;
        }
        long j2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            j2 = ((j2 * 1729) + jArr[i3]) % 131071;
        }
        String valueOf = String.valueOf(j2);
        this.zzf = valueOf;
        return valueOf;
    }
}

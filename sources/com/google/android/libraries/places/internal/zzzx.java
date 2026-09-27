package com.google.android.libraries.places.internal;

import android.os.Trace;
import defpackage.cxf;
import defpackage.tr9;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzzx {
    static final zzzd zza;
    public static final /* synthetic */ int zzb = 0;
    private static final AtomicReference zzc;
    private static final WeakHashMap zzd;
    private static final zzzw zze;

    static {
        tr9.r("androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl", "com.google.apps.tiktok.tracing.contrib.mdd.MddTraceFlush", new String[0]);
        zzc = new AtomicReference(cxf.j);
        zza = new zzzd("tiktok_systrace");
        zzd = new WeakHashMap();
        zze = new zzzw();
        new ArrayDeque();
        new ArrayDeque();
    }

    public static tr9 zza() {
        return (tr9) zzc.get();
    }

    public static zzaal zzb(boolean z) {
        zzaaj zzd2 = zzd();
        zzaal zzaalVar = zzd2.zzb;
        if (zzaalVar != null && zzaalVar != zzaab.zza) {
            return zzaalVar;
        }
        return zzaaa.zzh(zzd2);
    }

    public static zzaal zzc(zzaaj zzaajVar, zzaal zzaalVar) {
        zzaal zzaalVar2;
        zzaau zzaauVar = zzaajVar.zzc;
        zzaal zzaalVar3 = zzaajVar.zzb;
        if (zzaalVar3 != zzaalVar) {
            if (zzaalVar3 == null) {
                zzaajVar.zza = Trace.isEnabled();
            }
            if (zzaajVar.zza) {
                if (zzaalVar3 != null) {
                    if (zzaalVar != null) {
                        zzaalVar2 = zzaalVar;
                    } else {
                        zzaalVar2 = null;
                    }
                    zzaak.zzb(zzaalVar3);
                } else {
                    zzaalVar2 = zzaalVar;
                }
                if (zzaalVar2 != null) {
                    zzaak.zza(zzaalVar2);
                }
            }
            if (zzaalVar3 != zzaalVar) {
                if (zzaalVar == null) {
                    zzaalVar = null;
                }
                zzaajVar.zzb = zzaalVar;
                return zzaalVar3;
            }
        }
        return zzaalVar;
    }

    public static zzaaj zzd() {
        return (zzaaj) zze.get();
    }

    public static boolean zze() {
        zzaal zzaalVar = zzd().zzb;
        if (zzaalVar != null && zzaalVar != zzaab.zza) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ WeakHashMap zzf() {
        return zzd;
    }
}

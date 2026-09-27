package com.google.android.libraries.places.internal;

import defpackage.ix2;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzckl extends WeakReference {
    private static final boolean zza = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException zzb;
    private final ReferenceQueue zzc;
    private final ConcurrentMap zzd;
    private final String zze;
    private final Reference zzf;
    private final AtomicBoolean zzg;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        zzb = runtimeException;
    }

    public zzckl(zzckm zzckmVar, zzcai zzcaiVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(zzckmVar, referenceQueue);
        RuntimeException runtimeException;
        this.zzg = new AtomicBoolean();
        if (zza) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = zzb;
        }
        this.zzf = new SoftReference(runtimeException);
        this.zze = zzcaiVar.toString();
        this.zzc = referenceQueue;
        this.zzd = concurrentMap;
        concurrentMap.put(this, this);
        zza(referenceQueue);
    }

    public static int zza(ReferenceQueue referenceQueue) {
        int i = 0;
        while (true) {
            zzckl zzcklVar = (zzckl) referenceQueue.poll();
            if (zzcklVar != null) {
                RuntimeException runtimeException = (RuntimeException) zzcklVar.zzf.get();
                boolean z = zzcklVar.zzg.get();
                zzcklVar.zzc();
                if (!z) {
                    i++;
                    Level level = Level.SEVERE;
                    if (zzckm.zzc().isLoggable(level)) {
                        String property = System.getProperty("line.separator");
                        LogRecord logRecord = new LogRecord(level, ix2.p(new StringBuilder(String.valueOf(property).length() + 127), "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*", property, "    Make sure to call shutdown()/shutdownNow()"));
                        logRecord.setLoggerName(zzckm.zzc().getName());
                        logRecord.setParameters(new Object[]{zzcklVar.zze});
                        logRecord.setThrown(runtimeException);
                        zzckm.zzc().log(logRecord);
                    }
                }
            } else {
                return i;
            }
        }
    }

    private final void zzc() {
        super.clear();
        this.zzd.remove(this);
        this.zzf.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        zzc();
        zza(this.zzc);
    }

    public final /* synthetic */ void zzb() {
        if (!this.zzg.getAndSet(true)) {
            clear();
        }
    }
}

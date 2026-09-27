package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzctm {
    public static final /* synthetic */ int zza = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    static {
        Object obj;
        Class<?> cls;
        zzctk zzctkVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                zzctkVar = (zzctk) cls.asSubclass(zzctk.class).getConstructor(zzctn.class).newInstance(zzctk.zza);
            } catch (Throwable th2) {
                obj = th2;
            }
            if (zzctkVar == null) {
                new zzctk(zzctk.zza);
            }
            if (obj == null) {
                try {
                    if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                        Class<?> cls2 = Class.forName("java.util.logging.Logger");
                        Object invoke = cls2.getMethod("getLogger", String.class).invoke(null, zzctm.class.getName());
                        Class<?> cls3 = Class.forName("java.util.logging.Level");
                        cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(invoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        zzctkVar = null;
        if (zzctkVar == null) {
        }
        if (obj == null) {
        }
    }

    private zzctm() {
    }

    public static zzctn zza(String str) {
        return zzctk.zza;
    }

    public static zzctl zzb() {
        return zzctk.zzb;
    }
}

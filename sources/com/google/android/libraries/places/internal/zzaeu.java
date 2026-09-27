package com.google.android.libraries.places.internal;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzaeu extends zzaeo {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzaen zzc;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    final class zza {
        public static boolean zza() {
            return zzaeu.zzp();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z = true;
        if (str != null && !"robolectric".equals(str)) {
            z = false;
        }
        zzb = z;
        zzc = new zzaen() { // from class: com.google.android.libraries.places.internal.zzaeu.1
            @Override // com.google.android.libraries.places.internal.zzaen
            public String zza(Class<? extends zzabt<?>> cls) {
                StackTraceElement zza2;
                if (zzaeu.zzs()) {
                    try {
                        if (cls.equals(zzaeu.zzr())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (zzaeu.zzt() && (zza2 = zzagb.zza(cls, 1)) != null) {
                    return zza2.getClassName();
                }
                return null;
            }

            @Override // com.google.android.libraries.places.internal.zzaen
            public zzacn zzb(Class<?> cls, int i) {
                return zzacn.zza;
            }
        };
    }

    public static boolean zzp() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> zzr() {
        return VMStack.getStackClass2();
    }

    public static /* synthetic */ boolean zzs() {
        return zza;
    }

    public static /* synthetic */ boolean zzt() {
        return zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzaeo
    public zzaen zzc() {
        return zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzaeo
    public zzadq zze(String str) {
        return zzaez.zze(str);
    }

    @Override // com.google.android.libraries.places.internal.zzaeo
    public zzafe zzg() {
        return zzafa.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzaeo
    public String zzn() {
        return "platform: Android";
    }
}

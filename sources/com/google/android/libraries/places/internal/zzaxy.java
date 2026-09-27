package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzaxy extends zzbrw implements zzbta {
    private static final zzaxy zzf;
    private static volatile zzbth zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzaxy zzaxyVar = new zzaxy();
        zzf = zzaxyVar;
        zzbrw.zzbG(zzaxy.class, zzaxyVar);
    }

    private zzaxy() {
    }

    public static zzaxy zza(byte[] bArr) {
        return (zzaxy) zzbrw.zzbP(zzf, bArr);
    }

    public static zzaxr zzc() {
        return (zzaxr) zzf.zzbC();
    }

    public static /* synthetic */ zzaxy zzg() {
        return zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzbrw
    public final Object zzb(int i, Object obj, Object obj2) {
        zzbth zzbthVar;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 6) {
                                zzbth zzbthVar2 = zzg;
                                if (zzbthVar2 == null) {
                                    synchronized (zzaxy.class) {
                                        try {
                                            zzbthVar = zzg;
                                            if (zzbthVar == null) {
                                                zzbthVar = new zzbrr(zzf);
                                                zzg = zzbthVar;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return zzbthVar;
                                }
                                return zzbthVar2;
                            }
                            throw null;
                        }
                        return zzf;
                    }
                    return new zzaxr(null);
                }
                return new zzaxy();
            }
            return zzbrw.zzbH(zzf, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zze", "zzb", zzaxx.class, zzaxv.class, zzaxt.class});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void zzd(zzaxx zzaxxVar) {
        zzaxxVar.getClass();
        this.zze = zzaxxVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void zze(zzaxv zzaxvVar) {
        zzaxvVar.getClass();
        this.zze = zzaxvVar;
        this.zzb = 2;
    }

    public final /* synthetic */ void zzf(zzaxt zzaxtVar) {
        zzaxtVar.getClass();
        this.zze = zzaxtVar;
        this.zzb = 3;
    }
}

package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbvh extends zzbrw implements zzbta {
    private static final zzbvh zzf;
    private static volatile zzbth zzg;
    private int zzb;
    private String zze = "";

    static {
        zzbvh zzbvhVar = new zzbvh();
        zzf = zzbvhVar;
        zzbrw.zzbG(zzbvh.class, zzbvhVar);
    }

    private zzbvh() {
    }

    public static zzbvh zze() {
        return zzf;
    }

    public static /* synthetic */ zzbvh zzf() {
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
                                    synchronized (zzbvh.class) {
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
                    return new zzbvg(null);
                }
                return new zzbvh();
            }
            return zzbrw.zzbH(zzf, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final String zzc() {
        return this.zze;
    }
}

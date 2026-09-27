package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbvb extends zzbrw implements zzbta {
    private static final zzbvb zzg;
    private static volatile zzbth zzh;
    private int zzb;
    private int zze;
    private zzbtw zzf;

    static {
        zzbvb zzbvbVar = new zzbvb();
        zzg = zzbvbVar;
        zzbrw.zzbG(zzbvb.class, zzbvbVar);
    }

    private zzbvb() {
    }

    public static zzbvb zzf() {
        return zzg;
    }

    public static /* synthetic */ zzbvb zzg() {
        return zzg;
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
                                zzbth zzbthVar2 = zzh;
                                if (zzbthVar2 == null) {
                                    synchronized (zzbvb.class) {
                                        try {
                                            zzbthVar = zzh;
                                            if (zzbthVar == null) {
                                                zzbthVar = new zzbrr(zzg);
                                                zzh = zzbthVar;
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
                        return zzg;
                    }
                    return new zzbva(null);
                }
                return new zzbvb();
            }
            return zzbrw.zzbH(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }

    public final zzbtw zze() {
        zzbtw zzbtwVar = this.zzf;
        if (zzbtwVar == null) {
            return zzbtw.zzg();
        }
        return zzbtwVar;
    }
}

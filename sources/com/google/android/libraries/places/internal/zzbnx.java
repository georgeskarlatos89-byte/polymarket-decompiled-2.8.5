package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbnx extends zzbrw implements zzbta {
    private static final zzbnx zzg;
    private static volatile zzbth zzh;
    private int zzb;
    private zzbre zze;
    private int zzf;

    static {
        zzbnx zzbnxVar = new zzbnx();
        zzg = zzbnxVar;
        zzbrw.zzbG(zzbnx.class, zzbnxVar);
    }

    private zzbnx() {
    }

    public static /* synthetic */ zzbnx zzd() {
        return zzg;
    }

    public final zzbre zza() {
        zzbre zzbreVar = this.zze;
        if (zzbreVar == null) {
            return zzbre.zzf();
        }
        return zzbreVar;
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
                                    synchronized (zzbnx.class) {
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
                    return new zzbnw(null);
                }
                return new zzbnx();
            }
            return zzbrw.zzbH(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zzf;
    }
}

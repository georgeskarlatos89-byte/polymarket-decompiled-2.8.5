package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbis extends zzbrw implements zzbta {
    private static final zzbis zzf;
    private static volatile zzbth zzg;
    private int zzb;
    private int zze;

    static {
        zzbis zzbisVar = new zzbis();
        zzf = zzbisVar;
        zzbrw.zzbG(zzbis.class, zzbisVar);
    }

    private zzbis() {
    }

    public static /* synthetic */ zzbis zzd() {
        return zzf;
    }

    public final int zza() {
        return this.zzb;
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
                                    synchronized (zzbis.class) {
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
                    return new zzbir(null);
                }
                return new zzbis();
            }
            return zzbrw.zzbH(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }
}

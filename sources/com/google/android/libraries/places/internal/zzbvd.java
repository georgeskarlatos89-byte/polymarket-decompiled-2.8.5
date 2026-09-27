package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbvd extends zzbrw implements zzbta {
    private static final zzbvd zzg;
    private static volatile zzbth zzh;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzbvd zzbvdVar = new zzbvd();
        zzg = zzbvdVar;
        zzbrw.zzbG(zzbvd.class, zzbvdVar);
    }

    private zzbvd() {
    }

    public static zzbvd zze() {
        return zzg;
    }

    public static /* synthetic */ zzbvd zzf() {
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
                                    synchronized (zzbvd.class) {
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
                    return new zzbvc(null);
                }
                return new zzbvd();
            }
            return zzbrw.zzbH(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String zzc() {
        return this.zzb;
    }
}

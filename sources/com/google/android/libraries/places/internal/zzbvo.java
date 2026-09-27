package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzbvo extends zzbrt implements zzbta {
    private static final zzbvo zzf;
    private static volatile zzbth zzg;
    private byte zze = 2;

    static {
        zzbvo zzbvoVar = new zzbvo();
        zzf = zzbvoVar;
        zzbrw.zzbG(zzbvo.class, zzbvoVar);
    }

    private zzbvo() {
    }

    public static zzbvo zze() {
        return zzf;
    }

    public static /* synthetic */ zzbvo zzf() {
        return zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzbrw
    public final Object zzb(int i, Object obj, Object obj2) {
        zzbth zzbthVar;
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (obj == null) {
                                    b = 0;
                                } else {
                                    b = 1;
                                }
                                this.zze = b;
                                return null;
                            }
                            zzbth zzbthVar2 = zzg;
                            if (zzbthVar2 == null) {
                                synchronized (zzbvo.class) {
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
                        return zzf;
                    }
                    return new zzbvn(null);
                }
                return new zzbvo();
            }
            return zzbrw.zzbH(zzf, "\u0003\u0000", null);
        }
        return Byte.valueOf(this.zze);
    }
}

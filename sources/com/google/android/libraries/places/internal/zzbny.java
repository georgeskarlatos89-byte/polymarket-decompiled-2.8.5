package com.google.android.libraries.places.internal;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbny extends zzbrw implements zzbta {
    private static final zzbny zzf;
    private static volatile zzbth zzg;
    private zzbsg zzb = zzbrw.zzbN();
    private String zze = "";

    static {
        zzbny zzbnyVar = new zzbny();
        zzf = zzbnyVar;
        zzbrw.zzbG(zzbny.class, zzbnyVar);
    }

    private zzbny() {
    }

    public static /* synthetic */ zzbny zzd() {
        return zzf;
    }

    public final List zza() {
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
                                    synchronized (zzbny.class) {
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
                    return new zzbnv(null);
                }
                return new zzbny();
            }
            return zzbrw.zzbH(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"zzb", zzbnx.class, "zze"});
        }
        return (byte) 1;
    }

    public final String zzc() {
        return this.zze;
    }
}

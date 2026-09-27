package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbtw extends zzbrw implements zzbta {
    private static final zzbtw zzf;
    private static volatile zzbth zzg;
    private long zzb;
    private int zze;

    static {
        zzbtw zzbtwVar = new zzbtw();
        zzf = zzbtwVar;
        zzbrw.zzbG(zzbtw.class, zzbtwVar);
    }

    private zzbtw() {
    }

    public static zzbtv zzf() {
        return (zzbtv) zzf.zzbC();
    }

    public static zzbtw zzg() {
        return zzf;
    }

    public static /* synthetic */ zzbtw zzj() {
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
                                    synchronized (zzbtw.class) {
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
                    return new zzbtv(null);
                }
                return new zzbtw();
            }
            return new zzbtl(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final int zze() {
        return this.zze;
    }

    public final /* synthetic */ void zzh(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void zzi(int i) {
        this.zze = i;
    }
}

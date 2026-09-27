package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzazy extends zzbrw implements zzbta {
    private static final zzazy zzj;
    private static volatile zzbth zzk;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzazy zzazyVar = new zzazy();
        zzj = zzazyVar;
        zzbrw.zzbG(zzazy.class, zzazyVar);
    }

    private zzazy() {
    }

    public static zzazx zzg() {
        return (zzazx) zzj.zzbC();
    }

    public static /* synthetic */ zzazy zzm() {
        return zzj;
    }

    public final boolean zza() {
        return this.zze;
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
                                zzbth zzbthVar2 = zzk;
                                if (zzbthVar2 == null) {
                                    synchronized (zzazy.class) {
                                        try {
                                            zzbthVar = zzk;
                                            if (zzbthVar == null) {
                                                zzbthVar = new zzbrr(zzj);
                                                zzk = zzbthVar;
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
                        return zzj;
                    }
                    return new zzazx(null);
                }
                return new zzazy();
            }
            return zzbrw.zzbH(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final boolean zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final /* synthetic */ void zzh(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    public final /* synthetic */ void zzi(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    public final /* synthetic */ void zzj(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    public final /* synthetic */ void zzk(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final /* synthetic */ void zzl(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }
}

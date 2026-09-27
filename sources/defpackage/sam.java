package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class sam extends usm {
    private static final sam zzb;
    private static volatile g1n zzd;
    private int zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private long zzk;
    private byte zzl = 2;

    static {
        sam samVar = new sam();
        zzb = samVar;
        usm.e(sam.class, samVar);
    }

    public static g1n r() {
        return (g1n) zzb.j(7, null);
    }

    @Override // defpackage.usm
    public final Object j(int i, usm usmVar) {
        g1n g1nVar;
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (usmVar == null) {
                                    b = 0;
                                } else {
                                    b = 1;
                                }
                                this.zzl = b;
                                return null;
                            }
                            g1n g1nVar2 = zzd;
                            if (g1nVar2 == null) {
                                synchronized (sam.class) {
                                    try {
                                        g1nVar = zzd;
                                        if (g1nVar == null) {
                                            g1nVar = new urm(zzb);
                                            zzd = g1nVar;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return g1nVar;
                            }
                            return g1nVar2;
                        }
                        return zzb;
                    }
                    return new orm(zzb);
                }
                return new sam();
            }
            return new z1n(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003\u0005ခ\u0004\u0006ဂ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }

    public final float n() {
        return this.zzh;
    }

    public final float o() {
        return this.zzi;
    }

    public final float p() {
        return this.zzf;
    }

    public final float q() {
        return this.zzg;
    }
}

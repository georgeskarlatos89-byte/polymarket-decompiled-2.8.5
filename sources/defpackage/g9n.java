package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class g9n extends usm {
    private static final g9n zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private myl zzg;
    private byte zzh = 2;

    static {
        g9n g9nVar = new g9n();
        zzb = g9nVar;
        usm.e(g9n.class, g9nVar);
    }

    @Override // defpackage.usm
    public final Object j(int i, usm usmVar) {
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (usmVar == null) {
                                b = 0;
                            } else {
                                b = 1;
                            }
                            this.zzh = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new orm(zzb);
                }
                return new g9n();
            }
            return new z1n(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}

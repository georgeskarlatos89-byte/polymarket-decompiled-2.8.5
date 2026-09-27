package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class x7m extends csm {
    private static final x7m zzd;
    private int zze;
    private byte zzg = 2;
    private boolean zzf = true;

    static {
        x7m x7mVar = new x7m();
        zzd = x7mVar;
        usm.e(x7m.class, x7mVar);
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
                            this.zzg = b;
                            return null;
                        }
                        return zzd;
                    }
                    return new orm(zzd);
                }
                return new x7m();
            }
            return new z1n(zzd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}

package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class z3m extends usm {
    private static final z3m zzb;
    private int zzd;
    private s5m zzg;
    private byte zzh = 2;
    private String zze = "";
    private String zzf = "";

    static {
        z3m z3mVar = new z3m();
        zzb = z3mVar;
        usm.e(z3m.class, z3mVar);
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
                return new z3m();
            }
            return new z1n(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003ᐉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}

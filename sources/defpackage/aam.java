package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class aam extends usm {
    private static final aam zzb;
    private int zzd;
    private s5m zzg;
    private byte zzh = 2;
    private String zze = "InOrderOutputStreamHandler";
    private dum zzf = t1n.d;

    static {
        aam aamVar = new aam();
        zzb = aamVar;
        usm.e(aam.class, aamVar);
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
                return new aam();
            }
            return new z1n(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}

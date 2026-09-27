package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class o9m extends usm {
    private static final o9m zzb;
    private int zzd;
    private s5m zzf;
    private byte zzg = 2;
    private String zze = "DefaultInputStreamHandler";

    static {
        o9m o9mVar = new o9m();
        zzb = o9mVar;
        usm.e(o9m.class, o9mVar);
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
                        return zzb;
                    }
                    return new orm(zzb);
                }
                return new o9m();
            }
            return new z1n(zzb, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}

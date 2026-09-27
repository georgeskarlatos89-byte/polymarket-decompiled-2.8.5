package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class s5m extends csm {
    private static final s5m zzd;
    private byte zze = 2;

    static {
        s5m s5mVar = new s5m();
        zzd = s5mVar;
        usm.e(s5m.class, s5mVar);
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
                            this.zze = b;
                            return null;
                        }
                        return zzd;
                    }
                    return new orm(zzd);
                }
                return new s5m();
            }
            return new z1n(zzd, "\u0001\u0000", null);
        }
        return Byte.valueOf(this.zze);
    }
}

package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class myl extends usm {
    private static final myl zzb;
    private byte zze = 2;
    private dum zzd = t1n.d;

    static {
        myl mylVar = new myl();
        zzb = mylVar;
        usm.e(myl.class, mylVar);
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
                        return zzb;
                    }
                    return new orm(zzb);
                }
                return new myl();
            }
            return new z1n(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", hyl.class});
        }
        return Byte.valueOf(this.zze);
    }
}

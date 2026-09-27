package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class i6m extends usm {
    private static final i6m zzb;
    private int zzd;
    private u6m zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        i6m i6mVar = new i6m();
        zzb = i6mVar;
        usm.e(i6m.class, i6mVar);
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
                            this.zzi = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new orm(zzb);
                }
                return new i6m();
            }
            return new z1n(zzb, "\u0001\u0004\u0000\u0001\u0001Ϫ\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0003Ϫဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzh", "zzg"});
        }
        return Byte.valueOf(this.zzi);
    }
}

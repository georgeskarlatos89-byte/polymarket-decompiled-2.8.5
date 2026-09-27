package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rvl extends usm {
    private static final rvl zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        rvl rvlVar = new rvl();
        zzb = rvlVar;
        usm.e(rvl.class, rvlVar);
    }

    public static lvl n() {
        return (lvl) ((orm) zzb.j(5, null));
    }

    public static /* synthetic */ void o(rvl rvlVar, String str) {
        str.getClass();
        rvlVar.zzd |= 1;
        rvlVar.zze = str;
    }

    public static /* synthetic */ void p(rvl rvlVar, String str) {
        str.getClass();
        rvlVar.zzd |= 2;
        rvlVar.zzf = str;
    }

    @Override // defpackage.usm
    public final Object j(int i, usm usmVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new orm(zzb);
                }
                return new rvl();
            }
            return new z1n(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}

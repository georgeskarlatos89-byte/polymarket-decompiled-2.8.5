package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class g2m extends usm {
    private static final g2m zzb;
    private int zzd;
    private long zze;
    private long zzf = 1000000;
    private long zzg = 1;
    private ytm zzh = dxm.d;

    static {
        g2m g2mVar = new g2m();
        zzb = g2mVar;
        usm.e(g2m.class, g2mVar);
    }

    public static g2m r() {
        return zzb;
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
                return new g2m();
            }
            return new z1n(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zzh.size();
    }

    public final long o() {
        return ((dxm) this.zzh).b(0);
    }

    public final long p() {
        return this.zzg;
    }

    public final long q() {
        return this.zze;
    }
}

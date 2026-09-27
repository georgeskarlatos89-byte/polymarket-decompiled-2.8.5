package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jzl extends usm {
    private static final jzl zzb;
    private dum zzd = t1n.d;

    static {
        jzl jzlVar = new jzl();
        zzb = jzlVar;
        usm.e(jzl.class, jzlVar);
    }

    public static jzl n(byte[] bArr) {
        jzl jzlVar = zzb;
        int length = bArr.length;
        cqm cqmVar = cqm.a;
        m1n m1nVar = m1n.c;
        usm k = usm.k(jzlVar, bArr, length, cqm.a);
        if (k != null && !usm.g(k, true)) {
            dmk.B(new q4n().getMessage());
            return null;
        }
        return (jzl) k;
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
                return new jzl();
            }
            return new z1n(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zyl.class});
        }
        return (byte) 1;
    }

    public final dum o() {
        return this.zzd;
    }
}

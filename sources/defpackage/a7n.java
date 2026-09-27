package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class a7n extends d8l {
    private static final a7n zzf;
    private static volatile k9l zzg;
    private int zzb;
    private boolean zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [d8l, a7n] */
    static {
        ?? d8lVar = new d8l();
        zzf = d8lVar;
        d8l.n(a7n.class, d8lVar);
    }

    public static a7n t() {
        return zzf;
    }

    @Override // defpackage.d8l
    public final Object r(int i) {
        k9l k9lVar;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 6) {
                                k9l k9lVar2 = zzg;
                                if (k9lVar2 == null) {
                                    synchronized (a7n.class) {
                                        try {
                                            k9lVar = zzg;
                                            if (k9lVar == null) {
                                                k9lVar = new c8l(zzf);
                                                zzg = k9lVar;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return k9lVar;
                                }
                                return k9lVar2;
                            }
                            throw null;
                        }
                        return zzf;
                    }
                    return new b8l(zzf);
                }
                return new d8l();
            }
            return new o9l(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final boolean s() {
        return this.zze;
    }
}

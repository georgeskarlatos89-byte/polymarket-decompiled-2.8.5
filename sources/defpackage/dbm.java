package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dbm extends d8l {
    private static final dbm zzg;
    private static volatile k9l zzh;
    private int zzb;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [d8l, dbm] */
    static {
        ?? d8lVar = new d8l();
        zzg = d8lVar;
        d8l.n(dbm.class, d8lVar);
    }

    public static wam s() {
        return (wam) zzg.i();
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
                                k9l k9lVar2 = zzh;
                                if (k9lVar2 == null) {
                                    synchronized (dbm.class) {
                                        try {
                                            k9lVar = zzh;
                                            if (k9lVar == null) {
                                                k9lVar = new c8l(zzg);
                                                zzh = k9lVar;
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
                        return zzg;
                    }
                    return new b8l(zzg);
                }
                return new d8l();
            }
            return new o9l(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", v6l.i, "zzf", v6l.j});
        }
        return (byte) 1;
    }

    public final int t() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            i = 0;
                        } else {
                            i = 5;
                        }
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int u() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 0;
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void v(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void w(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }
}

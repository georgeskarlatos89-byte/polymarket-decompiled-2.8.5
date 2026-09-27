package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pim extends d8l {
    private static final pim zzh;
    private static volatile k9l zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [pim, d8l] */
    static {
        ?? d8lVar = new d8l();
        zzh = d8lVar;
        d8l.n(pim.class, d8lVar);
    }

    public static hhm t() {
        return (hhm) zzh.i();
    }

    public static pim u() {
        return zzh;
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
                                k9l k9lVar2 = zzi;
                                if (k9lVar2 == null) {
                                    synchronized (pim.class) {
                                        try {
                                            k9lVar = zzi;
                                            if (k9lVar == null) {
                                                k9lVar = new c8l(zzh);
                                                zzi = k9lVar;
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
                        return zzh;
                    }
                    return new b8l(zzh);
                }
                return new d8l();
            }
            return new o9l(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", v6l.o, "zzf", v6l.m, "zzg", v6l.n});
        }
        return (byte) 1;
    }

    public final rhm s() {
        rhm a = rhm.a(this.zzf);
        if (a == null) {
            return rhm.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
        }
        return a;
    }

    public final /* synthetic */ void v(rhm rhmVar) {
        this.zzf = rhmVar.zza();
        this.zzb |= 2;
    }

    public final int w() {
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

    public final int x() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            if (i2 != 5) {
                                i = 0;
                            } else {
                                i = 6;
                            }
                        }
                    }
                }
                i = i3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void y(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void z(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }
}

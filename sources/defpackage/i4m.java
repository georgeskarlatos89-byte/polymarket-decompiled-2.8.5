package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class i4m extends d8l {
    private static final i4m zzi;
    private static volatile k9l zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        i4m i4mVar = new i4m();
        zzi = i4mVar;
        d8l.n(i4m.class, i4mVar);
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
                                k9l k9lVar2 = zzj;
                                if (k9lVar2 == null) {
                                    synchronized (i4m.class) {
                                        try {
                                            k9lVar = zzj;
                                            if (k9lVar == null) {
                                                k9lVar = new c8l(zzi);
                                                zzj = k9lVar;
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
                        return zzi;
                    }
                    return new b8l(zzi);
                }
                return new i4m();
            }
            return new o9l(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int y() {
        return this.zzh;
    }

    public final /* synthetic */ void z(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}

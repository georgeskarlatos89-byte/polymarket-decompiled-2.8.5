package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class k9m extends d8l {
    private static final k9m zzl;
    private static volatile k9l zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* JADX WARN: Type inference failed for: r0v0, types: [d8l, k9m] */
    static {
        ?? d8lVar = new d8l();
        zzl = d8lVar;
        d8l.n(k9m.class, d8lVar);
    }

    public static k9m A() {
        return zzl;
    }

    public static j9m z() {
        return (j9m) zzl.i();
    }

    public final /* synthetic */ void B(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    public final /* synthetic */ void C(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final /* synthetic */ void F(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    public final /* synthetic */ void G(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }

    public final /* synthetic */ void H(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
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
                                k9l k9lVar2 = zzm;
                                if (k9lVar2 == null) {
                                    synchronized (k9m.class) {
                                        try {
                                            k9lVar = zzm;
                                            if (k9lVar == null) {
                                                k9lVar = new c8l(zzl);
                                                zzm = k9lVar;
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
                        return zzl;
                    }
                    return new b8l(zzl);
                }
                return new d8l();
            }
            return new o9l(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final boolean s() {
        return this.zze;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzj;
    }

    public final boolean y() {
        return this.zzk;
    }
}

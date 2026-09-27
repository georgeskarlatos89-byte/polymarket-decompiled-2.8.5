package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rcm extends d8l {
    private static final rcm zzm;
    private static volatile k9l zzn;
    private int zzb;
    private n8l zze = n9l.e;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        rcm rcmVar = new rcm();
        zzm = rcmVar;
        d8l.n(rcm.class, rcmVar);
    }

    public static lcm I() {
        return (lcm) zzm.i();
    }

    public final boolean A() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final long B() {
        return this.zzh;
    }

    public final boolean C() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int D() {
        return this.zzi;
    }

    public final boolean E() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final long F() {
        return this.zzk;
    }

    public final boolean G() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final long H() {
        return this.zzl;
    }

    public final /* synthetic */ void J(int i, pdm pdmVar) {
        t();
        this.zze.set(i, pdmVar);
    }

    public final /* synthetic */ void K(pdm pdmVar) {
        pdmVar.getClass();
        t();
        this.zze.add(pdmVar);
    }

    public final void L(Iterable iterable) {
        t();
        b8l.b(iterable, this.zze);
    }

    public final void M() {
        this.zze = n9l.e;
    }

    public final /* synthetic */ void N(int i) {
        t();
        this.zze.remove(i);
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void P(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void S(long j) {
        this.zzb |= 32;
        this.zzk = j;
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
                                k9l k9lVar2 = zzn;
                                if (k9lVar2 == null) {
                                    synchronized (rcm.class) {
                                        try {
                                            k9lVar = zzn;
                                            if (k9lVar == null) {
                                                k9lVar = new c8l(zzm);
                                                zzn = k9lVar;
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
                        return zzm;
                    }
                    return new b8l(zzm);
                }
                return new rcm();
            }
            return new o9l(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", pdm.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void s(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void t() {
        n8l n8lVar = this.zze;
        if (!((c7l) n8lVar).a) {
            this.zze = pxl.h(n8lVar);
        }
    }

    public final List u() {
        return this.zze;
    }

    public final int v() {
        return this.zze.size();
    }

    public final pdm w(int i) {
        return (pdm) this.zze.get(i);
    }

    public final String x() {
        return this.zzf;
    }

    public final boolean y() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final long z() {
        return this.zzg;
    }
}

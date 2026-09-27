package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dfm extends d8l {
    private static final dfm zzi;
    private static volatile k9l zzj;
    private int zzb;
    private n8l zze = n9l.e;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        dfm dfmVar = new dfm();
        zzi = dfmVar;
        d8l.n(dfm.class, dfmVar);
    }

    public static mem A(dfm dfmVar) {
        b8l i = zzi.i();
        i.f(dfmVar);
        return (mem) i;
    }

    public static mem z() {
        return (mem) zzi.i();
    }

    public final /* synthetic */ void B(int i, qfm qfmVar) {
        H();
        this.zze.set(i, qfmVar);
    }

    public final /* synthetic */ void C(qfm qfmVar) {
        H();
        this.zze.add(qfmVar);
    }

    public final void D(ArrayList arrayList) {
        H();
        b8l.b(arrayList, this.zze);
    }

    public final void E() {
        this.zze = n9l.e;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void H() {
        n8l n8lVar = this.zze;
        if (!((c7l) n8lVar).a) {
            this.zze = pxl.h(n8lVar);
        }
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
                                    synchronized (dfm.class) {
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
                return new dfm();
            }
            return new o9l(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", qfm.class, "zzf", "zzg", "zzh", v6l.k});
        }
        return (byte) 1;
    }

    public final List s() {
        return this.zze;
    }

    public final int t() {
        return this.zze.size();
    }

    public final qfm u(int i) {
        return (qfm) this.zze.get(i);
    }

    public final boolean v() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String y() {
        return this.zzg;
    }
}

package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class i2n extends d8l {
    private static final i2n zzh;
    private static volatile k9l zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        i2n i2nVar = new i2n();
        zzh = i2nVar;
        d8l.n(i2n.class, i2nVar);
    }

    public static c2n y() {
        return (c2n) zzh.i();
    }

    public static i2n z() {
        return zzh;
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void B(long j) {
        this.zze = 1;
        this.zzf = Long.valueOf(j);
    }

    public final /* synthetic */ void C(boolean z) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void D(double d) {
        this.zze = 3;
        this.zzf = Double.valueOf(d);
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final /* synthetic */ void F(h7l h7lVar) {
        h7lVar.getClass();
        this.zze = 5;
        this.zzf = h7lVar;
    }

    public final int G() {
        int i = this.zze;
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            i2 = 5;
                            if (i != 5) {
                                return 0;
                            }
                        }
                    }
                }
            }
            return i2;
        }
        return 6;
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
                                    synchronized (i2n.class) {
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
                return new i2n();
            }
            return new o9l(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        return (byte) 1;
    }

    public final String s() {
        return this.zzg;
    }

    public final long t() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean u() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double v() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return ConstantsKt.UNSET;
    }

    public final String w() {
        if (this.zze == 4) {
            return (String) this.zzf;
        }
        return "";
    }

    public final i7l x() {
        if (this.zze == 5) {
            return (i7l) this.zzf;
        }
        return i7l.b;
    }
}

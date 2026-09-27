package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n9g implements zci, yci {
    public static final TreeMap i = new TreeMap();
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] g;
    public int h;

    public n9g(int i2) {
        this.a = i2;
        int i3 = i2 + 1;
        this.g = new int[i3];
        this.c = new long[i3];
        this.d = new double[i3];
        this.e = new String[i3];
        this.f = new byte[i3];
    }

    public static final n9g e(int i2, String str) {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                n9g n9gVar = (n9g) ceilingEntry.getValue();
                n9gVar.b = str;
                n9gVar.h = i2;
                return n9gVar;
            }
            n9g n9gVar2 = new n9g(i2);
            n9gVar2.b = str;
            n9gVar2.h = i2;
            return n9gVar2;
        }
    }

    @Override // defpackage.yci
    public final void G0(int i2, byte[] bArr) {
        bArr.getClass();
        this.g[i2] = 5;
        this.f[i2] = bArr;
    }

    @Override // defpackage.yci
    public final void T0(double d, int i2) {
        this.g[i2] = 3;
        this.d[i2] = d;
    }

    public final void g() {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    @Override // defpackage.yci
    public final void l(int i2, long j) {
        this.g[i2] = 2;
        this.c[i2] = j;
    }

    @Override // defpackage.yci
    public final void l0(int i2, String str) {
        str.getClass();
        this.g[i2] = 4;
        this.e[i2] = str;
    }

    @Override // defpackage.yci
    public final void m(int i2) {
        this.g[i2] = 1;
    }

    @Override // defpackage.zci
    public final String y() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        dmk.n("Required value was null.");
        return null;
    }

    @Override // defpackage.zci
    public final void z(yci yciVar) {
        int i2 = this.h;
        if (1 <= i2) {
            int i3 = 1;
            while (true) {
                int i4 = this.g[i3];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    byte[] bArr = this.f[i3];
                                    if (bArr != null) {
                                        yciVar.G0(i3, bArr);
                                    } else {
                                        dmk.v("Required value was null.");
                                        return;
                                    }
                                }
                            } else {
                                String str = this.e[i3];
                                if (str != null) {
                                    yciVar.l0(i3, str);
                                } else {
                                    dmk.v("Required value was null.");
                                    return;
                                }
                            }
                        } else {
                            yciVar.T0(this.d[i3], i3);
                        }
                    } else {
                        yciVar.l(i3, this.c[i3]);
                    }
                } else {
                    yciVar.m(i3);
                }
                if (i3 != i2) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

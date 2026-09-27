package defpackage;

import com.appsflyer.internal.l;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ouj {
    public static final ouj f = new ouj(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public ouj(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static ouj c() {
        return new ouj(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final int b() {
        int h;
        int j;
        int d;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                ((Integer) this.c[i3]).getClass();
                                d = b94.c(i5);
                            } else {
                                xbc.m(z7a.c());
                                return 0;
                            }
                        } else {
                            h = b94.h(i5) * 2;
                            j = ((ouj) this.c[i3]).b();
                        }
                    } else {
                        d = b94.a(i5, (fw1) this.c[i3]);
                    }
                } else {
                    ((Long) this.c[i3]).getClass();
                    d = b94.d(i5);
                }
                i2 = d + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                h = b94.h(i5);
                j = b94.j(longValue);
            }
            i2 = j + h + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (this.e) {
            a(this.a + 1);
            int[] iArr = this.b;
            int i2 = this.a;
            iArr[i2] = i;
            this.c[i2] = obj;
            this.a = i2 + 1;
            return;
        }
        l.g();
    }

    public final void e(x71 x71Var) {
        if (this.a != 0) {
            x71Var.getClass();
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 5) {
                                    x71Var.v(i3, ((Integer) obj).intValue());
                                } else {
                                    qp7.n(z7a.c());
                                    return;
                                }
                            } else {
                                b94 b94Var = (b94) x71Var.b;
                                b94Var.p(i3, 3);
                                ((ouj) obj).e(x71Var);
                                b94Var.p(i3, 4);
                            }
                        } else {
                            x71Var.s(i3, (fw1) obj);
                        }
                    } else {
                        x71Var.w(i3, ((Long) obj).longValue());
                    }
                } else {
                    x71Var.A(i3, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ouj)) {
            return false;
        }
        ouj oujVar = (ouj) obj;
        int i = this.a;
        if (i == oujVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = oujVar.b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.c;
                    Object[] objArr2 = oujVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}

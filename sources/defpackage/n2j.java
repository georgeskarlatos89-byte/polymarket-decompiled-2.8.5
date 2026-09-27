package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n2j {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public hb g = hb.c;

    static {
        ix2.v(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i2) {
        gb a = this.g.a(i);
        if (a.a != -1) {
            return a.e[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        gb a;
        int i;
        hb hbVar = this.g;
        long j2 = this.d;
        int i2 = hbVar.a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                hbVar.a(i3).getClass();
                hbVar.a(i3).getClass();
                if (0 > j && ((i = (a = hbVar.a(i3)).a) == -1 || a.a(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                return i3;
            }
        }
        return -1;
    }

    public final int c(long j) {
        hb hbVar = this.g;
        int i = hbVar.a - 1;
        hbVar.b(i);
        while (i >= 0 && j != Long.MIN_VALUE) {
            hbVar.a(i).getClass();
            if (j >= 0) {
                break;
            }
            i--;
        }
        if (i >= 0) {
            gb a = hbVar.a(i);
            int i2 = a.a;
            if (i2 != -1) {
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = a.d[i3];
                    if (i4 != 0 && i4 != 1) {
                    }
                }
            }
            return i;
        }
        return -1;
    }

    public final long d(int i) {
        this.g.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return this.g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n2j.class.equals(obj.getClass())) {
                n2j n2jVar = (n2j) obj;
                if (Objects.equals(this.a, n2jVar.a) && Objects.equals(this.b, n2jVar.b) && this.c == n2jVar.c && this.d == n2jVar.d && this.e == n2jVar.e && this.f == n2jVar.f && Objects.equals(this.g, n2jVar.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean f(int i) {
        hb hbVar = this.g;
        if (i == hbVar.a - 1) {
            hbVar.b(i);
            return false;
        }
        return false;
    }

    public final boolean g(int i) {
        this.g.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, hb hbVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = hbVar;
        this.f = z;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (217 + hashCode) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        int i3 = (((i2 + i) * 31) + this.c) * 31;
        long j = this.d;
        int i4 = (i3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return this.g.hashCode() + ((((i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}

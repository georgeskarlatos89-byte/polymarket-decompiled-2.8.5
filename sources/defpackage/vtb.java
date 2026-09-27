package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class vtb implements Iterable, xja {
    public static final utb d = new utb(null);
    public final long a;
    public final long b;
    public final long c;

    public vtb(long j, long j2, long j3) {
        if (j3 != 0) {
            if (j3 != Long.MIN_VALUE) {
                this.a = j;
                if (j3 > 0) {
                    if (j < j2) {
                        long j4 = j2 % j3;
                        long j5 = j % j3;
                        long j6 = ((j4 < 0 ? j4 + j3 : j4) - (j5 < 0 ? j5 + j3 : j5)) % j3;
                        j2 -= j6 < 0 ? j6 + j3 : j6;
                    }
                } else if (j3 < 0) {
                    if (j > j2) {
                        long j7 = -j3;
                        long j8 = j % j7;
                        long j9 = j2 % j7;
                        long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
                        j2 += j10 < 0 ? j10 + j7 : j10;
                    }
                } else {
                    dmk.v("Step is zero.");
                    throw null;
                }
                this.b = j2;
                this.c = j3;
                return;
            }
            dmk.v("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        dmk.v("Step must be non-zero.");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof vtb) {
            if (!isEmpty() || !((vtb) obj).isEmpty()) {
                vtb vtbVar = (vtb) obj;
                if (this.a == vtbVar.a && this.b == vtbVar.b && this.c == vtbVar.c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.c) + woa.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public boolean isEmpty() {
        long j = this.c;
        long j2 = this.b;
        long j3 = this.a;
        if (j > 0) {
            if (j3 <= j2) {
                return false;
            }
            return true;
        }
        if (j3 >= j2) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new wtb(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.c;
        long j2 = this.b;
        long j3 = this.a;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append("..");
            sb.append(j2);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(" downTo ");
            sb.append(j2);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}

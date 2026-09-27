package kotlin.ranges;

import defpackage.dmk;
import defpackage.dsn;
import defpackage.f1a;
import defpackage.g1a;
import defpackage.xja;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class a implements Iterable, xja {
    public static final f1a d = new f1a(null);
    public final int a;
    public final int b;
    public final int c;

    public a(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i;
                this.b = dsn.c(i, i2, i3);
                this.c = i3;
                return;
            }
            dmk.v("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        dmk.v("Step must be non-zero.");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
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
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            if (i3 <= i) {
                return false;
            }
            return true;
        }
        if (i3 >= i) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g1a(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}

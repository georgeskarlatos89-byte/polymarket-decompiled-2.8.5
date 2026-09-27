package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class wq9 {
    public Object[] a;
    public int b;
    public boolean c;

    public wq9(int i) {
        yon.c(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public static int f(int i, int i2) {
        if (i2 >= 0) {
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return bd0.API_PRIORITY_OTHER;
            }
            return i3;
        }
        dmk.v("cannot store more than MAX_VALUE elements");
        return 0;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public abstract wq9 b(Object obj);

    public final void c(int i, Object[] objArr) {
        akn.b(i, objArr);
        e(i);
        System.arraycopy(objArr, 0, this.a, this.b, i);
        this.b += i;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof xq9) {
                this.b = ((xq9) collection).b(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int f = f(objArr.length, this.b + i);
        if (f <= objArr.length && !this.c) {
            return;
        }
        this.a = Arrays.copyOf(this.a, f);
        this.c = false;
    }
}

package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class tzi {
    public static final /* synthetic */ long b = oo4.a.objectFieldOffset(tzi.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public rn7[] a;

    public final void a(rn7 rn7Var) {
        rn7Var.c((sn7) this);
        rn7[] rn7VarArr = this.a;
        if (rn7VarArr == null) {
            rn7VarArr = new rn7[4];
            this.a = rn7VarArr;
        } else if (b() >= rn7VarArr.length) {
            rn7VarArr = (rn7[]) Arrays.copyOf(rn7VarArr, b() * 2);
            this.a = rn7VarArr;
        }
        int b2 = b();
        oo4.a.putIntVolatile(this, b, b2 + 1);
        rn7VarArr[b2] = rn7Var;
        rn7Var.b = b2;
        d(b2);
    }

    public final int b() {
        return oo4.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r5.compareTo(r6) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rn7 c(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        oo4.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                rn7 rn7Var = objArr[i];
                rn7Var.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (rn7Var.compareTo(obj) < 0) {
                    e(i, i2);
                    d(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= b()) {
                    break;
                }
                Object[] objArr2 = this.a;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < b()) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                e(i, i5);
                i = i5;
            }
        }
        rn7 rn7Var2 = objArr[b()];
        rn7Var2.getClass();
        rn7Var2.c(null);
        rn7Var2.b = -1;
        objArr[b()] = null;
        return rn7Var2;
    }

    public final void d(int i) {
        while (i > 0) {
            rn7[] rn7VarArr = this.a;
            rn7VarArr.getClass();
            int i2 = (i - 1) / 2;
            rn7 rn7Var = rn7VarArr[i2];
            rn7Var.getClass();
            rn7 rn7Var2 = rn7VarArr[i];
            rn7Var2.getClass();
            if (rn7Var.compareTo(rn7Var2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        rn7[] rn7VarArr = this.a;
        rn7VarArr.getClass();
        rn7 rn7Var = rn7VarArr[i2];
        rn7Var.getClass();
        rn7 rn7Var2 = rn7VarArr[i];
        rn7Var2.getClass();
        rn7VarArr[i] = rn7Var;
        rn7VarArr[i2] = rn7Var2;
        rn7Var.b = i;
        rn7Var2.b = i2;
    }
}

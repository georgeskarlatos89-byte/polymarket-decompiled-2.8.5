package defpackage;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class gw1 implements Iterable {
    public static final skb a = new skb(new byte[0]);

    public static gw1 a(int i, Iterator it) {
        if (i == 1) {
            return (gw1) it.next();
        }
        int i2 = i >>> 1;
        return a(i2, it).b(a(i - i2, it));
    }

    public static ew1 j() {
        return new ew1();
    }

    public final gw1 b(gw1 gw1Var) {
        hag hagVar;
        int size = size();
        int size2 = gw1Var.size();
        if (size + size2 < 2147483647L) {
            int[] iArr = hag.h;
            if (this instanceof hag) {
                hagVar = (hag) this;
            } else {
                hagVar = null;
            }
            if (gw1Var.size() == 0) {
                return this;
            }
            if (size() == 0) {
                return gw1Var;
            }
            int size3 = gw1Var.size() + size();
            if (size3 < 128) {
                int size4 = size();
                int size5 = gw1Var.size();
                byte[] bArr = new byte[size4 + size5];
                c(0, 0, size4, bArr);
                gw1Var.c(0, size4, size5, bArr);
                return new skb(bArr);
            }
            if (hagVar != null) {
                gw1 gw1Var2 = hagVar.d;
                if (gw1Var.size() + gw1Var2.size() < 128) {
                    int size6 = gw1Var2.size();
                    int size7 = gw1Var.size();
                    byte[] bArr2 = new byte[size6 + size7];
                    gw1Var2.c(0, 0, size6, bArr2);
                    gw1Var.c(0, size6, size7, bArr2);
                    return new hag(hagVar.c, new skb(bArr2));
                }
            }
            if (hagVar != null) {
                gw1 gw1Var3 = hagVar.d;
                gw1 gw1Var4 = hagVar.c;
                if (gw1Var4.f() > gw1Var3.f() && hagVar.f > gw1Var.f()) {
                    return new hag(gw1Var4, new hag(gw1Var3, gw1Var));
                }
            }
            if (size3 >= hag.h[Math.max(f(), gw1Var.f()) + 1]) {
                return new hag(this, gw1Var);
            }
            me7 me7Var = new me7(24);
            me7Var.k(this);
            me7Var.k(gw1Var);
            Stack stack = (Stack) me7Var.a;
            gw1 gw1Var5 = (gw1) stack.pop();
            while (!stack.isEmpty()) {
                gw1Var5 = new hag((gw1) stack.pop(), gw1Var5);
            }
            return gw1Var5;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void c(int i, int i2, int i3, byte[] bArr) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i3 >= 0) {
                    int i4 = i + i3;
                    if (i4 <= size()) {
                        int i5 = i2 + i3;
                        if (i5 <= bArr.length) {
                            if (i3 > 0) {
                                d(i, i2, i3, bArr);
                                return;
                            }
                            return;
                        }
                        f27.h(34, i5, "Target end offset < 0: ");
                        return;
                    }
                    f27.h(34, i4, "Source end offset < 0: ");
                    return;
                }
                f27.h(23, i3, "Length < 0: ");
                return;
            }
            f27.h(30, i2, "Target offset < 0: ");
            return;
        }
        f27.h(30, i, "Source offset < 0: ");
    }

    public abstract void d(int i, int i2, int i3, byte[] bArr);

    public abstract int f();

    public abstract boolean h();

    public abstract boolean i();

    public abstract int k(int i, int i2, int i3);

    public abstract int l(int i, int i2, int i3);

    public abstract int m();

    public final byte[] n() {
        int size = size();
        if (size == 0) {
            return e5a.a;
        }
        byte[] bArr = new byte[size];
        d(0, 0, size, bArr);
        return bArr;
    }

    public abstract String q();

    public final String r() {
        try {
            return q();
        } catch (UnsupportedEncodingException e) {
            omf.m("UTF-8 not supported?", e);
            return null;
        }
    }

    public abstract void s(OutputStream outputStream, int i, int i2);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}

package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ew1 extends OutputStream {
    public static final byte[] e = new byte[0];
    public int b;
    public int d;
    public final ArrayList a = new ArrayList();
    public byte[] c = new byte[128];

    public final void e(int i) {
        this.a.add(new skb(this.c));
        int length = this.b + this.c.length;
        this.b = length;
        this.c = new byte[Math.max(128, Math.max(i, length >>> 1))];
        this.d = 0;
    }

    public final void g() {
        int i = this.d;
        byte[] bArr = this.c;
        int length = bArr.length;
        ArrayList arrayList = this.a;
        if (i < length) {
            if (i > 0) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                arrayList.add(new skb(bArr2));
            }
        } else {
            arrayList.add(new skb(bArr));
            this.c = e;
        }
        this.b += this.d;
        this.d = 0;
    }

    public final synchronized gw1 o() {
        gw1 a;
        g();
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            a = gw1.a;
        } else {
            a = gw1.a(arrayList.size(), arrayList.iterator());
        }
        return a;
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.b + this.d;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.c;
            int length = bArr2.length;
            int i3 = this.d;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.d += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                e(i4);
                System.arraycopy(bArr, i + length2, this.c, 0, i4);
                this.d = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.d == this.c.length) {
                e(1);
            }
            byte[] bArr = this.c;
            int i2 = this.d;
            this.d = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}

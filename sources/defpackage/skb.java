package defpackage;

import java.io.OutputStream;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class skb extends gw1 {
    public final byte[] b;
    public int c = 0;

    public skb(byte[] bArr) {
        this.b = bArr;
    }

    @Override // defpackage.gw1
    public void d(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.b, i, bArr, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gw1) || size() != ((gw1) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof skb) {
            return t((skb) obj, 0, size());
        }
        if (obj instanceof hag) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        dmk.v(woa.r(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
        return false;
    }

    @Override // defpackage.gw1
    public final int f() {
        return 0;
    }

    @Override // defpackage.gw1
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int size = size();
            i = k(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    @Override // defpackage.gw1
    public final boolean i() {
        byte[] bArr = this.b;
        if (l1n.c(bArr, 0, bArr.length) != 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new xv1(this);
    }

    @Override // defpackage.gw1
    public final int k(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.b[i4];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        if (r6[r7] > (-65)) goto L59;
     */
    @Override // defpackage.gw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(int i, int i2, int i3) {
        byte b;
        int i4;
        int i5;
        int i6 = i3 + i2;
        byte[] bArr = this.b;
        if (i != 0) {
            if (i2 >= i6) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i7 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i7 >= i6) {
                        return l1n.a(b2, b4);
                    }
                    i2 = i7;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i5 = i2 + 1;
                }
            } else {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i2 + 1;
                    b5 = bArr[i2];
                    if (i4 >= i6) {
                        return l1n.a(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i8 = i4 + 1;
                    byte b6 = bArr[i4];
                    if (i8 >= i6) {
                        if (b2 > -12 || b5 > -65 || b6 > -65) {
                            return -1;
                        }
                        return ((b5 << 8) ^ b2) ^ (b6 << 16);
                    }
                    b = b6;
                    i4 = i8;
                }
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && b <= -65) {
                        i2 = i4 + 1;
                    }
                }
            }
            return -1;
        }
        return l1n.c(bArr, i2, i6);
    }

    @Override // defpackage.gw1
    public final int m() {
        return this.c;
    }

    @Override // defpackage.gw1
    public final String q() {
        byte[] bArr = this.b;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // defpackage.gw1
    public final void s(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.b, i, i2);
    }

    @Override // defpackage.gw1
    public int size() {
        return this.b.length;
    }

    public final boolean t(skb skbVar, int i, int i2) {
        byte[] bArr = skbVar.b;
        int length = bArr.length;
        byte[] bArr2 = this.b;
        if (i2 <= length) {
            if (i + i2 <= bArr.length) {
                int i3 = 0;
                while (i3 < i2) {
                    if (bArr2[i3] != bArr[i]) {
                        return false;
                    }
                    i3++;
                    i++;
                }
                return true;
            }
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            dmk.v(hdi.l(length2, ", ", sb));
            return false;
        }
        int length3 = bArr2.length;
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i2);
        sb2.append(length3);
        throw new IllegalArgumentException(sb2.toString());
    }
}

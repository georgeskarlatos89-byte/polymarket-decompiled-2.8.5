package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class pmd {
    public long[] a;
    public Object[] b;
    public long[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        int i;
        int i2;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.f;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                if (Intrinsics.areEqual(this.b[i2], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pmd)) {
            return false;
        }
        pmd pmdVar = (pmd) obj;
        if (pmdVar.g != this.g) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !pmdVar.a(objArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f * 31) + this.g;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i3 << 3) + i5];
                            if (!Intrinsics.areEqual(obj, this)) {
                                if (obj != null) {
                                    i = obj.hashCode();
                                } else {
                                    i = 0;
                                }
                                i2 += i;
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i2;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public final String toString() {
        b6c b6cVar = new b6c(this, 3);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (true) {
            if (i != Integer.MAX_VALUE) {
                int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
                Object obj = objArr[i];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) b6cVar.invoke(obj));
                i2++;
                i = i3;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }
}

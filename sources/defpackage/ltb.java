package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ltb {
    public long[] a = eig.a;
    public long[] b = eub.a;
    public Object[] c = apl.c;
    public int d;
    public int e;

    public ltb(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            return this.c[i];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ltb)) {
            return false;
        }
        ltb ltbVar = (ltb) obj;
        if (ltbVar.e != this.e) {
            return false;
        }
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            long j2 = jArr[i4];
                            Object obj2 = objArr[i4];
                            if (obj2 == null) {
                                if (ltbVar.b(j2) != null || !ltbVar.a(j2)) {
                                    break loop0;
                                }
                            } else if (!Intrinsics.areEqual(obj2, ltbVar.b(j2))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr2[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        long j2 = jArr[i6];
                        Object obj = objArr[i6];
                        int hashCode = Long.hashCode(j2);
                        if (obj != null) {
                            i = obj.hashCode();
                        } else {
                            i = 0;
                        }
                        i3 += i ^ hashCode;
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return i3;
                }
            }
            if (i2 != length) {
                i2++;
            } else {
                return i3;
            }
        }
    }

    public final String toString() {
        int i;
        int i2;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

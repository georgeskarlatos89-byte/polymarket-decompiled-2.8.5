package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qpc extends ffd {
    public int f;

    public qpc(int i) {
        super(null);
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d(eig.e(i));
        } else {
            dmk.v("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int c(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void d(int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            i2 = Math.max(7, eig.d(i));
        } else {
            i2 = 0;
        }
        this.d = i2;
        if (i2 == 0) {
            jArr = eig.a;
        } else {
            int i3 = ((i2 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i3];
            Arrays.fill(jArr2, 0, i3, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        this.f = eig.a(this.d) - this.e;
        this.b = new Object[i2];
        this.c = new float[i2];
    }

    public final void e(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        r2 = c(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (r37.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (((r37.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        r2 = r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r2 <= 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        r19 = 128;
        r5 = r37.e;
        r3 = defpackage.hkj.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
    
        if (java.lang.Long.compareUnsigned(r5 * 32, r2 * 25) > 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        r2 = r37.a;
        r3 = r37.d;
        r5 = r37.b;
        r6 = r37.c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        if (r7 >= r13) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f2, code lost:
    
        r27 = r9;
        r25 = r11;
        r12 = 7;
        r7 = kotlin.collections.ArraysKt.y(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0111, code lost:
    
        if (r7 == r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0120, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
    
        if (r9 == 254) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012a, code lost:
    
        r9 = r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012c, code lost:
    
        if (r9 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012e, code lost:
    
        r9 = r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0134, code lost:
    
        r9 = r9 * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = c(r10);
        r10 = r10 & r3;
        r29 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014f, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0176, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0188, code lost:
    
        if (((r14 >> r12) & r25) != 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018a, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r25 << r12)) & r14) | ((r9 & 127) << r12);
        r2[r8] = (r2[r8] & (~(r25 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = null;
        r34[r13] = r34[r7];
        r34[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d7, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r29;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b6, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((r9 & 127) << r12) | ((~(r25 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0151, code lost:
    
        r32 = r15;
        r2[r8] = ((r9 & 127) << r11) | (r2[r8] & (~(r25 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r29;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0133, code lost:
    
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f0, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.f = defpackage.eig.a(r37.d) - r37.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0285, code lost:
    
        r2 = c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0289, code lost:
    
        r37.e++;
        r1 = r37.f;
        r3 = r37.a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a1, code lost:
    
        if (((r5 >> r7) & r25) != r19) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a3, code lost:
    
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a5, code lost:
    
        r37.f = r1 - r32;
        r1 = r37.d;
        r5 = (r5 & (~(r25 << r7))) | (r27 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0203, code lost:
    
        r27 = r9;
        r25 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0211, code lost:
    
        r2 = defpackage.eig.c(r37.d);
        r3 = r37.a;
        r5 = r37.b;
        r6 = r37.c;
        r7 = r37.d;
        d(r2);
        r2 = r37.a;
        r8 = r37.b;
        r9 = r37.c;
        r10 = r37.d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022c, code lost:
    
        if (r11 >= r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023b, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x023d, code lost:
    
        r12 = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x023f, code lost:
    
        if (r12 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0241, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0248, code lost:
    
        r13 = r13 * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = c(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x027f, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0246, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x027e, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x020e, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009d, code lost:
    
        r27 = r9;
        r25 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Serializable serializable, float f) {
        int i;
        int i2;
        Serializable serializable2 = serializable;
        int i3 = -862048943;
        int hashCode = serializable2.hashCode() * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            int i13 = i9;
            int i14 = 0;
            long j = (((-i11) >> 63) & (jArr[i10 + 1] << (64 - i11))) | (jArr[i10] >>> i11);
            long j2 = i6;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j4) >> 3) + i8) & i7;
                int i15 = i3;
                if (Intrinsics.areEqual(this.b[i2], serializable2)) {
                    break loop0;
                }
                j4 &= j4 - 1;
                i3 = i15;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            serializable2 = serializable;
            i3 = i;
        }
        if (i2 < 0) {
            i2 = ~i2;
        }
        this.b[i2] = serializable;
        this.c[i2] = f;
    }

    public /* synthetic */ qpc(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public qpc() {
        this(0, 1, null);
    }
}

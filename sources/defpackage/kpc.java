package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kpc extends dub {
    public int e;

    public kpc(int i) {
        super(null);
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c(eig.e(i));
        } else {
            dmk.v("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int b(int i) {
        int i2 = this.c;
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

    public final void c(int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            i2 = Math.max(7, eig.d(i));
        } else {
            i2 = 0;
        }
        this.c = i2;
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
        this.e = eig.a(this.c) - this.d;
        this.b = new long[i2];
    }

    public kpc() {
        this(0, 1, null);
    }

    public /* synthetic */ kpc(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }
}

package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uoc extends m88 {
    public uoc(int i) {
        super(null);
        int i2;
        long[] jArr;
        if (i >= 0) {
            int e = eig.e(i);
            if (e > 0) {
                i2 = Math.max(7, eig.d(e));
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
            this.b = new float[i2];
            return;
        }
        dmk.v("Capacity must be a positive value.");
        throw null;
    }

    public uoc() {
        this(0, 1, null);
    }

    public /* synthetic */ uoc(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }
}

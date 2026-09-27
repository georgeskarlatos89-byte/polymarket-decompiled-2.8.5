package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ipc extends jtb {
    public ipc(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        super((i2 & 1) != 0 ? 16 : i, null);
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            jArr = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            this.a = jArr;
        }
        int i2 = this.b;
        jArr[i2] = j;
        this.b = i2 + 1;
    }

    public ipc() {
        this(0, 1, null);
    }
}

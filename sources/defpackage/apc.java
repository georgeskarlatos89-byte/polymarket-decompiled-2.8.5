package defpackage;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class apc extends z0a {
    public apc(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        super((i2 & 1) != 0 ? 16 : i, null);
    }

    public final void c(int i) {
        d(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void d(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final void e(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            int[] iArr = this.a;
            int i3 = iArr[i];
            if (i != i2 - 1) {
                ArraysKt.k(i, i + 1, i2, iArr, iArr);
            }
            this.b--;
            return;
        }
        f27.m("Index must be between 0 and size");
    }

    public final void f(int i, int i2) {
        if (i >= 0 && i < this.b) {
            int[] iArr = this.a;
            int i3 = iArr[i];
            iArr[i] = i2;
            return;
        }
        f27.m("Index must be between 0 and size");
    }

    public apc() {
        this(0, 1, null);
    }
}

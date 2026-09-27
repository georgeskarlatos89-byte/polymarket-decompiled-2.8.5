package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class oe1 implements Cloneable {
    public int a;
    public int b;
    public int c;
    public int[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oe1] */
    public final Object clone() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int[] iArr = (int[]) this.d.clone();
        ?? obj = new Object();
        obj.a = i;
        obj.b = i2;
        obj.c = i3;
        obj.d = iArr;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oe1)) {
            return false;
        }
        oe1 oe1Var = (oe1) obj;
        if (this.a != oe1Var.a || this.b != oe1Var.b || this.c != oe1Var.c || !Arrays.equals(this.d, oe1Var.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.d) + (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        String str;
        int i = this.b;
        int i2 = this.a;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (((this.d[(i4 / 32) + (this.c * i3)] >>> (i4 & 31)) & 1) != 0) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb.append(str);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

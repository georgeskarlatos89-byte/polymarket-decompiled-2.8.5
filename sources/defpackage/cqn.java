package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class cqn {
    public static final float a = 50.0f;
    public static final float b = 74.0f;

    public static wh4 a(wh4 wh4Var, int i, char c, boolean z, int i2) {
        int[] iArr = wh4Var.a;
        int length = iArr.length;
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(iArr, i3);
        char[] copyOf2 = Arrays.copyOf(wh4Var.b, i3);
        boolean[] copyOf3 = Arrays.copyOf(wh4Var.c, i3);
        copyOf[length] = wh4Var.g() + i;
        copyOf2[length] = c;
        copyOf3[length] = z;
        return wh4Var.d(copyOf, copyOf2, copyOf3, i2);
    }
}

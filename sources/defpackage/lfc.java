package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lfc extends le1 {
    public static final lfc g;
    public static final lfc h;
    public final boolean f;

    static {
        lfc lfcVar;
        lfc lfcVar2 = new lfc(new int[]{2, 3, 0}, false);
        g = lfcVar2;
        int i = lfcVar2.c;
        int i2 = lfcVar2.b;
        if (i2 == 1 && i == 9) {
            lfcVar = new lfc(new int[]{2, 0, 0}, false);
        } else {
            lfcVar = new lfc(new int[]{i2, i + 1, 0}, false);
        }
        h = lfcVar;
        new lfc(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfc(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f = z;
    }
}

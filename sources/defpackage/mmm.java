package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class mmm {
    public static final w97 a = new w97(20);

    public static final void a(eb0 eb0Var, String str, String str2) {
        if (str2.length() <= 0) {
            nw9.a("alternateText can't be an empty string.");
        }
        eb0Var.h("androidx.compose.foundation.text.inlineContent", str);
        eb0Var.d(str2);
        eb0Var.e();
    }

    public static long b(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }
}

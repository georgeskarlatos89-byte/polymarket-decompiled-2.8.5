package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class js2 {
    public static ls2 a(boolean z) {
        ns2 a = ms2.a(DesignTokens.Typography.largeNumber);
        ns2 a2 = ms2.a(DesignTokens.Typography.smallNumber);
        if (z) {
            float f = a.a * 0.55f;
            float f2 = a.b * 0.55f;
            float f3 = a.c;
            int i = a.d;
            oh8 oh8Var = a.e;
            String str = a.f;
            oh8Var.getClass();
            a = new ns2(f, f2, f3, i, oh8Var, str);
        }
        if (z) {
            float f4 = a2.a * 0.75f;
            float f5 = a2.b * 0.75f;
            float f6 = a2.c;
            int i2 = a2.d;
            oh8 oh8Var2 = a2.e;
            String str2 = a2.f;
            oh8Var2.getClass();
            a2 = new ns2(f4, f5, f6, i2, oh8Var2, str2);
        }
        return new ls2(a, a2);
    }
}

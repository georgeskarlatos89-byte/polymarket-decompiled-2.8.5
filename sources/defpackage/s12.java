package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class s12 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ s12[] $VALUES;
    public static final s12 Large;
    public static final s12 Medium;
    public static final s12 Small;
    public static final s12 Tiny;
    private final float cornerRadius;
    private final float height;
    private final float horizontalPadding;
    private final float iconSize;
    private final DesignTokens.Typography mainTypography;
    private final DesignTokens.Typography prefixTypography;

    static {
        float e = ufh.e(DesignTokens.Size.xl);
        DesignTokens.Padding padding = DesignTokens.Padding.fourXS;
        float c = ufh.c(padding);
        float c2 = ufh.c(DesignTokens.Padding.threeXS);
        float e2 = ufh.e(DesignTokens.Size.medium);
        DesignTokens.Typography typography = DesignTokens.Typography.body2Strong;
        DesignTokens.Typography typography2 = DesignTokens.Typography.body2;
        s12 s12Var = new s12("Tiny", 0, e, c, c2, e2, typography, typography2);
        Tiny = s12Var;
        float c3 = ufh.c(padding) + ufh.e(DesignTokens.Size.twoXL);
        float c4 = ufh.c(DesignTokens.Padding.xs);
        float d = ufh.d(DesignTokens.Radius.small);
        DesignTokens.Size size = DesignTokens.Size.large;
        s12 s12Var2 = new s12("Small", 1, c3, c4, d, ufh.e(size), typography, typography2);
        Small = s12Var2;
        float c5 = ufh.c(padding) + ufh.e(DesignTokens.Size.threeXL);
        DesignTokens.Padding padding2 = DesignTokens.Padding.small;
        s12 s12Var3 = new s12("Medium", 2, c5, ufh.c(padding2), ufh.c(DesignTokens.Padding.fiveXS) + ufh.c(padding2), ufh.e(size), typography, typography2);
        Medium = s12Var3;
        s12 s12Var4 = new s12("Large", 3, ufh.c(padding) + ufh.e(DesignTokens.Size.fourXL), ufh.c(DesignTokens.Padding.medium), ufh.d(DesignTokens.Radius.medium), ufh.e(size), DesignTokens.Typography.body1Strong, typography2);
        Large = s12Var4;
        s12[] s12VarArr = {s12Var, s12Var2, s12Var3, s12Var4};
        $VALUES = s12VarArr;
        $ENTRIES = new wg7(s12VarArr);
    }

    public s12(String str, int i, float f, float f2, float f3, float f4, DesignTokens.Typography typography, DesignTokens.Typography typography2) {
        this.height = f;
        this.horizontalPadding = f2;
        this.cornerRadius = f3;
        this.iconSize = f4;
        this.mainTypography = typography;
        this.prefixTypography = typography2;
    }

    public static s12 valueOf(String str) {
        return (s12) Enum.valueOf(s12.class, str);
    }

    public static s12[] values() {
        return (s12[]) $VALUES.clone();
    }

    public final float a() {
        return this.cornerRadius;
    }

    public final float b() {
        return this.height;
    }

    public final float c() {
        return this.horizontalPadding;
    }

    public final float d() {
        return this.iconSize;
    }

    public final DesignTokens.Typography e() {
        return this.mainTypography;
    }

    public final DesignTokens.Typography f() {
        return this.prefixTypography;
    }
}

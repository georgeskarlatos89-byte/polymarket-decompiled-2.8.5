package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class bj2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ bj2[] $VALUES;
    public static final bj2 Compact;
    public static final bj2 Hero;
    private final kj2 badgeStyle;
    private final DesignTokens.SemanticColor borderColor;
    private final float bottomPadding;
    private final float buttonsHorizontalPadding;
    private final float cornerRadius;
    private final float headerHeight;
    private final float jerseySize;
    private final float marketBottomPadding;
    private final float marketToButtonsSpacing;
    private final float marketTopPadding;
    private final DesignTokens.Typography nameTypography;
    private final DesignTokens.SemanticColor statColor;

    static {
        DesignTokens.Typography typography = DesignTokens.Typography.title4Condensed;
        kj2 kj2Var = kj2.Filled;
        DesignTokens.SemanticColor.Companion companion = DesignTokens.SemanticColor.INSTANCE;
        bj2 bj2Var = new bj2("Hero", 0, 24.0f, 80.0f, 8.0f, 8.0f, 12.0f, 12.0f, 12.0f, 100.0f, typography, kj2Var, companion.getBorderPrimary(), companion.getContentPrimary());
        Hero = bj2Var;
        bj2 bj2Var2 = new bj2("Compact", 1, 20.0f, 40.0f, 16.0f, 16.0f, 0.0f, 10.0f, 10.0f, 20.0f, DesignTokens.Typography.body2Strong, kj2.Outlined, companion.getBorderAlpha(), companion.getContentSecondary());
        Compact = bj2Var2;
        bj2[] bj2VarArr = {bj2Var, bj2Var2};
        $VALUES = bj2VarArr;
        $ENTRIES = new wg7(bj2VarArr);
    }

    public bj2(String str, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, DesignTokens.Typography typography, kj2 kj2Var, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2) {
        this.cornerRadius = f;
        this.headerHeight = f2;
        this.marketTopPadding = f3;
        this.marketBottomPadding = f4;
        this.marketToButtonsSpacing = f5;
        this.buttonsHorizontalPadding = f6;
        this.bottomPadding = f7;
        this.jerseySize = f8;
        this.nameTypography = typography;
        this.badgeStyle = kj2Var;
        this.borderColor = semanticColor;
        this.statColor = semanticColor2;
    }

    public static bj2 valueOf(String str) {
        return (bj2) Enum.valueOf(bj2.class, str);
    }

    public static bj2[] values() {
        return (bj2[]) $VALUES.clone();
    }

    public final kj2 a() {
        return this.badgeStyle;
    }

    public final DesignTokens.SemanticColor b() {
        return this.borderColor;
    }

    public final float c() {
        return this.buttonsHorizontalPadding;
    }

    public final float d() {
        return this.cornerRadius;
    }

    public final float e() {
        return this.headerHeight;
    }

    public final float f() {
        float f = vi2.a;
        float f2 = this.marketTopPadding + 22.0f + this.marketBottomPadding + this.marketToButtonsSpacing + vi2.a + this.bottomPadding;
        int i = aj2.a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.headerHeight + f2;
            }
            dmk.a();
            return 0.0f;
        }
        return this.headerHeight + 12.0f + 22.0f + 4.0f + f2;
    }

    public final float g() {
        return this.jerseySize;
    }

    public final float h() {
        return this.marketBottomPadding;
    }

    public final float i() {
        return this.marketToButtonsSpacing;
    }

    public final float j() {
        return this.marketTopPadding;
    }

    public final DesignTokens.Typography k() {
        return this.nameTypography;
    }

    public final DesignTokens.SemanticColor m() {
        return this.statColor;
    }
}

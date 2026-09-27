package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class sc2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sc2[] $VALUES;
    public static final sc2 Medium;
    public static final sc2 Small;
    private final float dotSize;
    private final float dotSpacing;
    private final DesignTokens.Typography typography;
    private final DesignTokens.Typography typographyStrong;

    static {
        sc2 sc2Var = new sc2(4.0f, 7.0f, 0, DesignTokens.Typography.body2, DesignTokens.Typography.body2Strong, "Medium");
        Medium = sc2Var;
        sc2 sc2Var2 = new sc2(2.0f, 5.0f, 1, DesignTokens.Typography.body4, DesignTokens.Typography.body4Strong, "Small");
        Small = sc2Var2;
        sc2[] sc2VarArr = {sc2Var, sc2Var2};
        $VALUES = sc2VarArr;
        $ENTRIES = new wg7(sc2VarArr);
    }

    public sc2(float f, float f2, int i, DesignTokens.Typography typography, DesignTokens.Typography typography2, String str) {
        this.typography = typography;
        this.typographyStrong = typography2;
        this.dotSize = f;
        this.dotSpacing = f2;
    }

    public static sc2 valueOf(String str) {
        return (sc2) Enum.valueOf(sc2.class, str);
    }

    public static sc2[] values() {
        return (sc2[]) $VALUES.clone();
    }

    public final float a() {
        return this.dotSize;
    }

    public final float b() {
        return this.dotSpacing;
    }

    public final DesignTokens.Typography c() {
        return this.typography;
    }

    public final DesignTokens.Typography d() {
        return this.typographyStrong;
    }
}

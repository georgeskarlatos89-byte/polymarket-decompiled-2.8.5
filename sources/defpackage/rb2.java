package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class rb2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rb2[] $VALUES;
    public static final rb2 ExtraLarge;
    public static final rb2 Large;
    public static final rb2 Medium;
    public static final rb2 Small;
    private final float height;
    private final float horizontalPadding;
    private final float iconSize;
    private final float iconSpacing;
    private final DesignTokens.Typography typography;

    static {
        rb2 rb2Var = new rb2("Small", 0, 36.0f, 10.0f, 16.0f, 6.0f, DesignTokens.Typography.body2Strong);
        Small = rb2Var;
        rb2 rb2Var2 = new rb2("Medium", 1, 48.0f, 14.0f, 20.0f, 8.0f, DesignTokens.Typography.body1);
        Medium = rb2Var2;
        rb2 rb2Var3 = new rb2("Large", 2, 52.0f, 16.0f, 20.0f, 8.0f, DesignTokens.Typography.body1Strong);
        Large = rb2Var3;
        rb2 rb2Var4 = new rb2("ExtraLarge", 3, 64.0f, 18.0f, 24.0f, 10.0f, DesignTokens.Typography.title1);
        ExtraLarge = rb2Var4;
        rb2[] rb2VarArr = {rb2Var, rb2Var2, rb2Var3, rb2Var4};
        $VALUES = rb2VarArr;
        $ENTRIES = new wg7(rb2VarArr);
    }

    public rb2(String str, int i, float f, float f2, float f3, float f4, DesignTokens.Typography typography) {
        this.height = f;
        this.horizontalPadding = f2;
        this.iconSize = f3;
        this.iconSpacing = f4;
        this.typography = typography;
    }

    public static rb2 valueOf(String str) {
        return (rb2) Enum.valueOf(rb2.class, str);
    }

    public static rb2[] values() {
        return (rb2[]) $VALUES.clone();
    }

    public final float a() {
        return this.height;
    }

    public final float b() {
        return this.horizontalPadding;
    }

    public final float c() {
        return this.iconSize;
    }

    public final float d() {
        return this.iconSpacing;
    }

    public final DesignTokens.Typography e() {
        return this.typography;
    }
}

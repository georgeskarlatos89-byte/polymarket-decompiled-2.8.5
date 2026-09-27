package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class in2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ in2[] $VALUES;
    public static final in2 Small;
    private final DesignTokens.Typography typography;
    private final float height = 28.0f;
    private final float horizontalPadding = 10.0f;
    private final float iconSpacing = 6.0f;
    private final float iconSize = 12.0f;

    static {
        in2 in2Var = new in2(DesignTokens.Typography.body3);
        Small = in2Var;
        in2[] in2VarArr = {in2Var};
        $VALUES = in2VarArr;
        $ENTRIES = new wg7(in2VarArr);
    }

    public in2(DesignTokens.Typography typography) {
        this.typography = typography;
    }

    public static in2 valueOf(String str) {
        return (in2) Enum.valueOf(in2.class, str);
    }

    public static in2[] values() {
        return (in2[]) $VALUES.clone();
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

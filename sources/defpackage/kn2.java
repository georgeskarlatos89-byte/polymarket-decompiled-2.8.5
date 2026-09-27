package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kn2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kn2[] $VALUES;
    public static final kn2 Alert;
    public static final kn2 Neutral;
    public static final kn2 Success;
    private final DesignTokens.SemanticColor backgroundColor;
    private final DesignTokens.SemanticColor foregroundColor;

    static {
        DesignTokens.SemanticColor.Companion companion = DesignTokens.SemanticColor.INSTANCE;
        kn2 kn2Var = new kn2("Neutral", 0, companion.getBackgroundGrouped(), companion.getContentPrimary());
        Neutral = kn2Var;
        kn2 kn2Var2 = new kn2("Success", 1, companion.getBackgroundPositiveLight(), companion.getContentAccentGreen());
        Success = kn2Var2;
        kn2 kn2Var3 = new kn2("Alert", 2, companion.getBackgroundCriticalLight(), companion.getContentCritical());
        Alert = kn2Var3;
        kn2[] kn2VarArr = {kn2Var, kn2Var2, kn2Var3};
        $VALUES = kn2VarArr;
        $ENTRIES = new wg7(kn2VarArr);
    }

    public kn2(String str, int i, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2) {
        this.backgroundColor = semanticColor;
        this.foregroundColor = semanticColor2;
    }

    public static kn2 valueOf(String str) {
        return (kn2) Enum.valueOf(kn2.class, str);
    }

    public static kn2[] values() {
        return (kn2[]) $VALUES.clone();
    }

    public final DesignTokens.SemanticColor a() {
        return this.backgroundColor;
    }

    public final DesignTokens.SemanticColor b() {
        return this.foregroundColor;
    }
}

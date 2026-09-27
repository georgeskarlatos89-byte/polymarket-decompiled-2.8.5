package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vx1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vx1[] $VALUES;
    public static final vx1 Default;
    public static final vx1 Error;
    private final DesignTokens.SemanticColor labelColor;

    static {
        DesignTokens.SemanticColor.Companion companion = DesignTokens.SemanticColor.INSTANCE;
        vx1 vx1Var = new vx1(0, companion.getContentAccentBrand(), "Default");
        Default = vx1Var;
        vx1 vx1Var2 = new vx1(1, companion.getContentAccentRed(), "Error");
        Error = vx1Var2;
        vx1[] vx1VarArr = {vx1Var, vx1Var2};
        $VALUES = vx1VarArr;
        $ENTRIES = new wg7(vx1VarArr);
    }

    public vx1(int i, DesignTokens.SemanticColor semanticColor, String str) {
        this.labelColor = semanticColor;
    }

    public static vx1 valueOf(String str) {
        return (vx1) Enum.valueOf(vx1.class, str);
    }

    public static vx1[] values() {
        return (vx1[]) $VALUES.clone();
    }

    public final DesignTokens.SemanticColor a() {
        return this.labelColor;
    }
}

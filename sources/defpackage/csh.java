package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class csh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ csh[] $VALUES;
    public static final csh Destructive;
    public static final csh Placeholder;
    public static final csh Primary;
    public static final csh Secondary;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, csh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, csh] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, csh] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, csh] */
    static {
        ?? r0 = new Enum("Primary", 0);
        Primary = r0;
        ?? r1 = new Enum("Secondary", 1);
        Secondary = r1;
        ?? r2 = new Enum("Placeholder", 2);
        Placeholder = r2;
        ?? r3 = new Enum("Destructive", 3);
        Destructive = r3;
        csh[] cshVarArr = {r0, r1, r2, r3};
        $VALUES = cshVarArr;
        $ENTRIES = new wg7(cshVarArr);
    }

    public static csh valueOf(String str) {
        return (csh) Enum.valueOf(csh.class, str);
    }

    public static csh[] values() {
        return (csh[]) $VALUES.clone();
    }

    public final DesignTokens.SemanticColor a() {
        int i = bsh.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return DesignTokens.SemanticColor.INSTANCE.getContentAccentRed();
                    }
                    dmk.a();
                    return null;
                }
                return DesignTokens.SemanticColor.INSTANCE.getContentTertiary();
            }
            return DesignTokens.SemanticColor.INSTANCE.getContentSecondary();
        }
        return DesignTokens.SemanticColor.INSTANCE.getContentPrimary();
    }

    public final DesignTokens.Typography b() {
        int i = bsh.a[ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    dmk.a();
                    return null;
                }
            } else {
                return DesignTokens.Typography.body2;
            }
        }
        return DesignTokens.Typography.body2Strong;
    }
}

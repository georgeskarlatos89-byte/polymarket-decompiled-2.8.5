package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kve {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kve[] $VALUES;
    public static final kve Compact;
    public static final kve Wide;
    private final float cornerRadius;
    private final float height;
    private final DesignTokens.Typography labelTypography;
    private final DesignTokens.Typography oddsTypography;

    static {
        kve kveVar = new kve(40.0f, 10.0f, 0, DesignTokens.Typography.body3, DesignTokens.Typography.body3Strong, "Compact");
        Compact = kveVar;
        kve kveVar2 = new kve(48.0f, 14.0f, 1, DesignTokens.Typography.body2, DesignTokens.Typography.body2Strong, "Wide");
        Wide = kveVar2;
        kve[] kveVarArr = {kveVar, kveVar2};
        $VALUES = kveVarArr;
        $ENTRIES = new wg7(kveVarArr);
    }

    public kve(float f, float f2, int i, DesignTokens.Typography typography, DesignTokens.Typography typography2, String str) {
        this.height = f;
        this.cornerRadius = f2;
        this.labelTypography = typography;
        this.oddsTypography = typography2;
    }

    public static kve valueOf(String str) {
        return (kve) Enum.valueOf(kve.class, str);
    }

    public static kve[] values() {
        return (kve[]) $VALUES.clone();
    }

    public final float a() {
        return this.cornerRadius;
    }

    public final float b() {
        return this.height;
    }

    public final DesignTokens.Typography c() {
        return this.labelTypography;
    }

    public final DesignTokens.Typography d() {
        return this.oddsTypography;
    }
}

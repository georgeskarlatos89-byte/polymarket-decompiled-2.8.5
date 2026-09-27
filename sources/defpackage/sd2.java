package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class sd2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sd2[] $VALUES;
    public static final sd2 Chip;
    public static final sd2 Compact;
    public static final sd2 Hero;
    public static final sd2 Large;
    public static final sd2 Medium;
    public static final sd2 Mini;
    public static final sd2 Prominent;
    public static final sd2 Small;
    private final float containerSize;
    private final float cornerRadius;
    private final float imageSize;

    static {
        sd2 sd2Var = new sd2("Chip", 0, 20.0f, 14.0f, 6.0f);
        Chip = sd2Var;
        sd2 sd2Var2 = new sd2("Mini", 1, 20.0f, 16.0f, 4.0f);
        Mini = sd2Var2;
        sd2 sd2Var3 = new sd2("Small", 2, 24.0f, 20.0f, 4.0f);
        Small = sd2Var3;
        sd2 sd2Var4 = new sd2("Compact", 3, 28.0f, 24.0f, 8.0f);
        Compact = sd2Var4;
        sd2 sd2Var5 = new sd2("Medium", 4, 44.0f, 32.0f, 14.0f);
        Medium = sd2Var5;
        sd2 sd2Var6 = new sd2("Large", 5, 48.0f, 34.0f, 14.0f);
        Large = sd2Var6;
        sd2 sd2Var7 = new sd2("Prominent", 6, 56.0f, 32.0f, 12.0f);
        Prominent = sd2Var7;
        sd2 sd2Var8 = new sd2("Hero", 7, 62.0f, 46.0f, 16.0f);
        Hero = sd2Var8;
        sd2[] sd2VarArr = {sd2Var, sd2Var2, sd2Var3, sd2Var4, sd2Var5, sd2Var6, sd2Var7, sd2Var8};
        $VALUES = sd2VarArr;
        $ENTRIES = new wg7(sd2VarArr);
    }

    public sd2(String str, int i, float f, float f2, float f3) {
        this.containerSize = f;
        this.imageSize = f2;
        this.cornerRadius = f3;
    }

    public static sd2 valueOf(String str) {
        return (sd2) Enum.valueOf(sd2.class, str);
    }

    public static sd2[] values() {
        return (sd2[]) $VALUES.clone();
    }

    public final float a() {
        if (this == Large) {
            return 12.0f;
        }
        return this.cornerRadius;
    }

    public final float b() {
        if (this == Prominent) {
            return 55.0f;
        }
        return this.containerSize;
    }

    public final float c() {
        return this.containerSize;
    }

    public final float d() {
        return this.cornerRadius;
    }

    public final float e() {
        return this.imageSize;
    }
}

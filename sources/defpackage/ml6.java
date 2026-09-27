package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ml6 implements yif {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ml6[] $VALUES;
    public static final ll6 Companion;
    public static final ml6 HDPI;
    public static final ml6 LDPI;
    public static final ml6 MDPI;
    public static final ml6 XHDPI;
    public static final ml6 XXHDPI;
    public static final ml6 XXXHDPI;
    private final int dpi;

    /* JADX WARN: Type inference failed for: r0v2, types: [ll6, java.lang.Object] */
    static {
        ml6 ml6Var = new ml6("LDPI", 0, 120);
        LDPI = ml6Var;
        ml6 ml6Var2 = new ml6("MDPI", 1, 160);
        MDPI = ml6Var2;
        ml6 ml6Var3 = new ml6("HDPI", 2, 240);
        HDPI = ml6Var3;
        ml6 ml6Var4 = new ml6("XHDPI", 3, 320);
        XHDPI = ml6Var4;
        ml6 ml6Var5 = new ml6("XXHDPI", 4, 480);
        XXHDPI = ml6Var5;
        ml6 ml6Var6 = new ml6("XXXHDPI", 5, 640);
        XXXHDPI = ml6Var6;
        ml6[] ml6VarArr = {ml6Var, ml6Var2, ml6Var3, ml6Var4, ml6Var5, ml6Var6};
        $VALUES = ml6VarArr;
        $ENTRIES = new wg7(ml6VarArr);
        Companion = new Object();
    }

    public ml6(String str, int i, int i2) {
        this.dpi = i2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static ml6 valueOf(String str) {
        return (ml6) Enum.valueOf(ml6.class, str);
    }

    public static ml6[] values() {
        return (ml6[]) $VALUES.clone();
    }

    public final int a() {
        return this.dpi;
    }
}

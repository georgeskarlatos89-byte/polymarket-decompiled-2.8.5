package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ee8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ee8[] $VALUES;
    public static final ee8 Clip;
    public static final ee8 ExpandIndicator;
    public static final ee8 ExpandOrCollapseIndicator;
    public static final ee8 Visible;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ee8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ee8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ee8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ee8] */
    static {
        ?? r0 = new Enum("Visible", 0);
        Visible = r0;
        ?? r1 = new Enum("Clip", 1);
        Clip = r1;
        ?? r2 = new Enum("ExpandIndicator", 2);
        ExpandIndicator = r2;
        ?? r3 = new Enum("ExpandOrCollapseIndicator", 3);
        ExpandOrCollapseIndicator = r3;
        ee8[] ee8VarArr = {r0, r1, r2, r3};
        $VALUES = ee8VarArr;
        $ENTRIES = new wg7(ee8VarArr);
    }

    public static ee8 valueOf(String str) {
        return (ee8) Enum.valueOf(ee8.class, str);
    }

    public static ee8[] values() {
        return (ee8[]) $VALUES.clone();
    }
}

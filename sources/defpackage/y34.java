package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class y34 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ y34[] $VALUES;
    public static final y34 ALL_JSON_OBJECTS;
    public static final y34 NONE;
    public static final y34 POLYMORPHIC;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y34] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y34] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y34] */
    static {
        ?? r0 = new Enum("NONE", 0);
        NONE = r0;
        ?? r1 = new Enum("ALL_JSON_OBJECTS", 1);
        ALL_JSON_OBJECTS = r1;
        ?? r2 = new Enum("POLYMORPHIC", 2);
        POLYMORPHIC = r2;
        y34[] y34VarArr = {r0, r1, r2};
        $VALUES = y34VarArr;
        $ENTRIES = new wg7(y34VarArr);
    }

    public static y34 valueOf(String str) {
        return (y34) Enum.valueOf(y34.class, str);
    }

    public static y34[] values() {
        return (y34[]) $VALUES.clone();
    }
}

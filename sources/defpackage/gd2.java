package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gd2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ gd2[] $VALUES;
    public static final gd2 Glass;
    public static final gd2 Solid;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gd2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gd2] */
    static {
        ?? r0 = new Enum("Solid", 0);
        Solid = r0;
        ?? r1 = new Enum("Glass", 1);
        Glass = r1;
        gd2[] gd2VarArr = {r0, r1};
        $VALUES = gd2VarArr;
        $ENTRIES = new wg7(gd2VarArr);
    }

    public static gd2 valueOf(String str) {
        return (gd2) Enum.valueOf(gd2.class, str);
    }

    public static gd2[] values() {
        return (gd2[]) $VALUES.clone();
    }
}

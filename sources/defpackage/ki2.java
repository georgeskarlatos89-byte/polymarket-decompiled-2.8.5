package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ki2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ki2[] $VALUES;
    public static final ki2 Brand;
    public static final ki2 Destructive;
    public static final ki2 Outlined;
    public static final ki2 Primary;
    public static final ki2 Secondary;
    public static final ki2 Tertiary;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ki2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ki2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ki2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ki2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ki2] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ki2] */
    static {
        ?? r0 = new Enum("Primary", 0);
        Primary = r0;
        ?? r1 = new Enum("Brand", 1);
        Brand = r1;
        ?? r2 = new Enum("Secondary", 2);
        Secondary = r2;
        ?? r3 = new Enum("Tertiary", 3);
        Tertiary = r3;
        ?? r4 = new Enum("Outlined", 4);
        Outlined = r4;
        ?? r5 = new Enum("Destructive", 5);
        Destructive = r5;
        ki2[] ki2VarArr = {r0, r1, r2, r3, r4, r5};
        $VALUES = ki2VarArr;
        $ENTRIES = new wg7(ki2VarArr);
    }

    public static ki2 valueOf(String str) {
        return (ki2) Enum.valueOf(ki2.class, str);
    }

    public static ki2[] values() {
        return (ki2[]) $VALUES.clone();
    }
}

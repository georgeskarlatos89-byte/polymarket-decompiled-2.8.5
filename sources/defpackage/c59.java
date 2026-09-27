package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class c59 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c59[] $VALUES;
    public static final c59 Category;
    public static final b59 Companion;
    public static final c59 None;
    public static final c59 Polymarket;
    public static final c59 Ufc;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c59] */
    /* JADX WARN: Type inference failed for: r0v2, types: [b59, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c59] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c59] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, c59] */
    static {
        ?? r0 = new Enum("Polymarket", 0);
        Polymarket = r0;
        ?? r1 = new Enum("Category", 1);
        Category = r1;
        ?? r2 = new Enum("Ufc", 2);
        Ufc = r2;
        ?? r3 = new Enum("None", 3);
        None = r3;
        c59[] c59VarArr = {r0, r1, r2, r3};
        $VALUES = c59VarArr;
        $ENTRIES = new wg7(c59VarArr);
        Companion = new Object();
    }

    public static c59 valueOf(String str) {
        return (c59) Enum.valueOf(c59.class, str);
    }

    public static c59[] values() {
        return (c59[]) $VALUES.clone();
    }
}

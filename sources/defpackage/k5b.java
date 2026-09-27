package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class k5b {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ k5b[] $VALUES;
    public static final j5b Companion;
    public static final k5b First;
    public static final k5b Last;
    public static final k5b Middle;
    public static final k5b Single;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k5b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j5b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k5b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, k5b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, k5b] */
    static {
        ?? r0 = new Enum("Single", 0);
        Single = r0;
        ?? r1 = new Enum("First", 1);
        First = r1;
        ?? r2 = new Enum("Middle", 2);
        Middle = r2;
        ?? r3 = new Enum("Last", 3);
        Last = r3;
        k5b[] k5bVarArr = {r0, r1, r2, r3};
        $VALUES = k5bVarArr;
        $ENTRIES = new wg7(k5bVarArr);
        Companion = new Object();
    }

    public static k5b valueOf(String str) {
        return (k5b) Enum.valueOf(k5b.class, str);
    }

    public static k5b[] values() {
        return (k5b[]) $VALUES.clone();
    }
}

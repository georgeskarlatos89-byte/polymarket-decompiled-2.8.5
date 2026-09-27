package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class w4b {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ w4b[] $VALUES;
    public static final w4b NONE;
    public static final w4b PUBLICATION;
    public static final w4b SYNCHRONIZED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, w4b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, w4b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, w4b] */
    static {
        ?? r0 = new Enum("SYNCHRONIZED", 0);
        SYNCHRONIZED = r0;
        ?? r1 = new Enum("PUBLICATION", 1);
        PUBLICATION = r1;
        ?? r2 = new Enum("NONE", 2);
        NONE = r2;
        w4b[] w4bVarArr = {r0, r1, r2};
        $VALUES = w4bVarArr;
        $ENTRIES = new wg7(w4bVarArr);
    }

    public static w4b valueOf(String str) {
        return (w4b) Enum.valueOf(w4b.class, str);
    }

    public static w4b[] values() {
        return (w4b[]) $VALUES.clone();
    }
}

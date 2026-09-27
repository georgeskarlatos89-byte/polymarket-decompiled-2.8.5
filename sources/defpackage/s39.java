package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s39 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ s39[] $VALUES;
    public static final s39 Cursor;
    public static final s39 None;
    public static final s39 Selection;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, s39] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, s39] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, s39] */
    static {
        ?? r0 = new Enum("None", 0);
        None = r0;
        ?? r1 = new Enum("Selection", 1);
        Selection = r1;
        ?? r2 = new Enum("Cursor", 2);
        Cursor = r2;
        s39[] s39VarArr = {r0, r1, r2};
        $VALUES = s39VarArr;
        $ENTRIES = new wg7(s39VarArr);
    }

    public static s39 valueOf(String str) {
        return (s39) Enum.valueOf(s39.class, str);
    }

    public static s39[] values() {
        return (s39[]) $VALUES.clone();
    }
}

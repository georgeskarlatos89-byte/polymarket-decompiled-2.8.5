package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q39 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ q39[] $VALUES;
    public static final q39 Cursor;
    public static final q39 SelectionEnd;
    public static final q39 SelectionStart;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q39] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q39] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, q39] */
    static {
        ?? r0 = new Enum("Cursor", 0);
        Cursor = r0;
        ?? r1 = new Enum("SelectionStart", 1);
        SelectionStart = r1;
        ?? r2 = new Enum("SelectionEnd", 2);
        SelectionEnd = r2;
        q39[] q39VarArr = {r0, r1, r2};
        $VALUES = q39VarArr;
        $ENTRIES = new wg7(q39VarArr);
    }

    public static q39 valueOf(String str) {
        return (q39) Enum.valueOf(q39.class, str);
    }

    public static q39[] values() {
        return (q39[]) $VALUES.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class cj5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ cj5[] $VALUES;
    public static final cj5 Add;
    public static final cj5 Edit;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cj5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cj5] */
    static {
        ?? r0 = new Enum("Add", 0);
        Add = r0;
        ?? r1 = new Enum("Edit", 1);
        Edit = r1;
        cj5[] cj5VarArr = {r0, r1};
        $VALUES = cj5VarArr;
        $ENTRIES = new wg7(cj5VarArr);
    }

    public static cj5 valueOf(String str) {
        return (cj5) Enum.valueOf(cj5.class, str);
    }

    public static cj5[] values() {
        return (cj5[]) $VALUES.clone();
    }
}

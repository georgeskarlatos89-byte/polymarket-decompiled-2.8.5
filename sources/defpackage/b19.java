package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class b19 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ b19[] $VALUES;
    public static final b19 Binary;
    public static final b19 Group;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b19] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b19] */
    static {
        ?? r0 = new Enum("Binary", 0);
        Binary = r0;
        ?? r1 = new Enum("Group", 1);
        Group = r1;
        b19[] b19VarArr = {r0, r1};
        $VALUES = b19VarArr;
        $ENTRIES = new wg7(b19VarArr);
    }

    public static b19 valueOf(String str) {
        return (b19) Enum.valueOf(b19.class, str);
    }

    public static b19[] values() {
        return (b19[]) $VALUES.clone();
    }
}

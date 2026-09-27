package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class x8e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ x8e[] $VALUES;
    public static final x8e MANAGE_ALL;
    public static final x8e MANAGE_ONE;
    public static final x8e NONE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x8e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x8e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, x8e] */
    static {
        ?? r0 = new Enum("NONE", 0);
        NONE = r0;
        ?? r1 = new Enum("MANAGE_ONE", 1);
        MANAGE_ONE = r1;
        ?? r2 = new Enum("MANAGE_ALL", 2);
        MANAGE_ALL = r2;
        x8e[] x8eVarArr = {r0, r1, r2};
        $VALUES = x8eVarArr;
        $ENTRIES = new wg7(x8eVarArr);
    }

    public static x8e valueOf(String str) {
        return (x8e) Enum.valueOf(x8e.class, str);
    }

    public static x8e[] values() {
        return (x8e[]) $VALUES.clone();
    }
}

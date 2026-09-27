package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class z7b {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ z7b[] $VALUES;
    public static final z7b BINARY;
    public static final z7b SOURCE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z7b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z7b] */
    static {
        ?? r0 = new Enum("SOURCE", 0);
        SOURCE = r0;
        ?? r1 = new Enum("BINARY", 1);
        BINARY = r1;
        z7b[] z7bVarArr = {r0, r1};
        $VALUES = z7bVarArr;
        $ENTRIES = new wg7(z7bVarArr);
    }

    public static z7b valueOf(String str) {
        return (z7b) Enum.valueOf(z7b.class, str);
    }

    public static z7b[] values() {
        return (z7b[]) $VALUES.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ibc {
    private static final /* synthetic */ ibc[] $VALUES;
    public static final ibc ADD;
    public static final ibc EXCLUDE_INTERSECTIONS;
    public static final ibc INTERSECT;
    public static final ibc MERGE;
    public static final ibc SUBTRACT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ibc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ibc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ibc] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ibc] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ibc] */
    static {
        ?? r0 = new Enum("MERGE", 0);
        MERGE = r0;
        ?? r1 = new Enum("ADD", 1);
        ADD = r1;
        ?? r2 = new Enum("SUBTRACT", 2);
        SUBTRACT = r2;
        ?? r3 = new Enum("INTERSECT", 3);
        INTERSECT = r3;
        ?? r4 = new Enum("EXCLUDE_INTERSECTIONS", 4);
        EXCLUDE_INTERSECTIONS = r4;
        $VALUES = new ibc[]{r0, r1, r2, r3, r4};
    }

    public static ibc valueOf(String str) {
        return (ibc) Enum.valueOf(ibc.class, str);
    }

    public static ibc[] values() {
        return (ibc[]) $VALUES.clone();
    }
}

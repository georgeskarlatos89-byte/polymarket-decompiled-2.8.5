package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class q1a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ q1a[] $VALUES;
    public static final q1a COMMON_SUPER_TYPE;
    public static final q1a INTERSECTION_TYPE;

    /* JADX WARN: Type inference failed for: r0v0, types: [q1a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q1a, java.lang.Enum] */
    static {
        ?? r0 = new Enum("COMMON_SUPER_TYPE", 0);
        COMMON_SUPER_TYPE = r0;
        ?? r1 = new Enum("INTERSECTION_TYPE", 1);
        INTERSECTION_TYPE = r1;
        q1a[] q1aVarArr = {r0, r1};
        $VALUES = q1aVarArr;
        $ENTRIES = new wg7(q1aVarArr);
    }

    public static q1a valueOf(String str) {
        return (q1a) Enum.valueOf(q1a.class, str);
    }

    public static q1a[] values() {
        return (q1a[]) $VALUES.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class w6g {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ w6g[] $VALUES;
    public static final w6g EXPLICITLY_IGNORABLE;
    public static final w6g MUST_USE;
    public static final w6g UNSPECIFIED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, w6g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, w6g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, w6g] */
    static {
        ?? r0 = new Enum("UNSPECIFIED", 0);
        UNSPECIFIED = r0;
        ?? r1 = new Enum("MUST_USE", 1);
        MUST_USE = r1;
        ?? r2 = new Enum("EXPLICITLY_IGNORABLE", 2);
        EXPLICITLY_IGNORABLE = r2;
        w6g[] w6gVarArr = {r0, r1, r2};
        $VALUES = w6gVarArr;
        $ENTRIES = new wg7(w6gVarArr);
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static w6g valueOf(String str) {
        return (w6g) Enum.valueOf(w6g.class, str);
    }

    public static w6g[] values() {
        return (w6g[]) $VALUES.clone();
    }
}

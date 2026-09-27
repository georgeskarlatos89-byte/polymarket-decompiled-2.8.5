package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v6g {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ v6g[] $VALUES;
    public static final u6g Companion;
    public static final v6g ExplicitlyIgnorable;
    public static final v6g MustUse;
    public static final v6g Unspecified;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v6g] */
    /* JADX WARN: Type inference failed for: r0v2, types: [u6g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v6g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v6g] */
    static {
        ?? r0 = new Enum("MustUse", 0);
        MustUse = r0;
        ?? r1 = new Enum("ExplicitlyIgnorable", 1);
        ExplicitlyIgnorable = r1;
        ?? r2 = new Enum("Unspecified", 2);
        Unspecified = r2;
        v6g[] v6gVarArr = {r0, r1, r2};
        $VALUES = v6gVarArr;
        $ENTRIES = new wg7(v6gVarArr);
        Companion = new Object();
    }

    public static v6g valueOf(String str) {
        return (v6g) Enum.valueOf(v6g.class, str);
    }

    public static v6g[] values() {
        return (v6g[]) $VALUES.clone();
    }
}

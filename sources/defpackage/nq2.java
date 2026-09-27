package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class nq2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nq2[] $VALUES;
    public static final nq2 Action;
    public static final nq2 Expired;
    public static final nq2 Programmatic;
    public static final nq2 Replaced;
    public static final nq2 UserDismissed;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nq2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nq2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, nq2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, nq2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, nq2] */
    static {
        ?? r0 = new Enum("Expired", 0);
        Expired = r0;
        ?? r1 = new Enum("UserDismissed", 1);
        UserDismissed = r1;
        ?? r2 = new Enum("Action", 2);
        Action = r2;
        ?? r3 = new Enum("Replaced", 3);
        Replaced = r3;
        ?? r4 = new Enum("Programmatic", 4);
        Programmatic = r4;
        nq2[] nq2VarArr = {r0, r1, r2, r3, r4};
        $VALUES = nq2VarArr;
        $ENTRIES = new wg7(nq2VarArr);
    }

    public static nq2 valueOf(String str) {
        return (nq2) Enum.valueOf(nq2.class, str);
    }

    public static nq2[] values() {
        return (nq2[]) $VALUES.clone();
    }
}

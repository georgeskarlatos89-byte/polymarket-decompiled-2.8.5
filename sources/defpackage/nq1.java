package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nq1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nq1[] $VALUES;
    public static final nq1 Real;
    public static final nq1 Virtual;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nq1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nq1] */
    static {
        ?? r0 = new Enum("Real", 0);
        Real = r0;
        ?? r1 = new Enum("Virtual", 1);
        Virtual = r1;
        nq1[] nq1VarArr = {r0, r1};
        $VALUES = nq1VarArr;
        $ENTRIES = new wg7(nq1VarArr);
    }

    public static nq1 valueOf(String str) {
        return (nq1) Enum.valueOf(nq1.class, str);
    }

    public static nq1[] values() {
        return (nq1[]) $VALUES.clone();
    }
}

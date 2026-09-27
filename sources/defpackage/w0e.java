package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class w0e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ w0e[] $VALUES;
    public static final w0e INSTALLMENT;
    public static final w0e RECURRING;
    public static final w0e SUBSCRIPTION;
    public static final w0e UNSCHEDULED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, w0e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, w0e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, w0e] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, w0e] */
    static {
        ?? r0 = new Enum("RECURRING", 0);
        RECURRING = r0;
        ?? r1 = new Enum("INSTALLMENT", 1);
        INSTALLMENT = r1;
        ?? r2 = new Enum("UNSCHEDULED", 2);
        UNSCHEDULED = r2;
        ?? r3 = new Enum("SUBSCRIPTION", 3);
        SUBSCRIPTION = r3;
        w0e[] w0eVarArr = {r0, r1, r2, r3};
        $VALUES = w0eVarArr;
        $ENTRIES = new wg7(w0eVarArr);
    }

    public static w0e valueOf(String str) {
        return (w0e) Enum.valueOf(w0e.class, str);
    }

    public static w0e[] values() {
        return (w0e[]) $VALUES.clone();
    }
}

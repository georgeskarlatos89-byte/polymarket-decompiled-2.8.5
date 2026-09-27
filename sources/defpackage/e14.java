package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class e14 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ e14[] $VALUES;
    public static final e14 PAYMENT;
    public static final e14 SETUP;
    public static final e14 UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e14] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e14] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e14] */
    static {
        ?? r0 = new Enum("PAYMENT", 0);
        PAYMENT = r0;
        ?? r1 = new Enum("SETUP", 1);
        SETUP = r1;
        ?? r2 = new Enum("UNKNOWN", 2);
        UNKNOWN = r2;
        e14[] e14VarArr = {r0, r1, r2};
        $VALUES = e14VarArr;
        $ENTRIES = new wg7(e14VarArr);
    }

    public static e14 valueOf(String str) {
        return (e14) Enum.valueOf(e14.class, str);
    }

    public static e14[] values() {
        return (e14[]) $VALUES.clone();
    }
}

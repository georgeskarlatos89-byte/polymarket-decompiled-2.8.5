package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r85 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ r85[] $VALUES;
    public static final r85 BLOCKING;
    public static final r85 CPU_ACQUIRED;
    public static final r85 DORMANT;
    public static final r85 PARKING;
    public static final r85 TERMINATED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r85] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r85] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r85] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, r85] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, r85] */
    static {
        ?? r0 = new Enum("CPU_ACQUIRED", 0);
        CPU_ACQUIRED = r0;
        ?? r1 = new Enum("BLOCKING", 1);
        BLOCKING = r1;
        ?? r2 = new Enum("PARKING", 2);
        PARKING = r2;
        ?? r3 = new Enum("DORMANT", 3);
        DORMANT = r3;
        ?? r4 = new Enum("TERMINATED", 4);
        TERMINATED = r4;
        r85[] r85VarArr = {r0, r1, r2, r3, r4};
        $VALUES = r85VarArr;
        $ENTRIES = new wg7(r85VarArr);
    }

    public static r85 valueOf(String str) {
        return (r85) Enum.valueOf(r85.class, str);
    }

    public static r85[] values() {
        return (r85[]) $VALUES.clone();
    }
}

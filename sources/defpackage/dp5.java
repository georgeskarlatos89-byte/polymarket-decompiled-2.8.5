package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dp5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dp5[] $VALUES;
    public static final dp5 DISK;
    public static final dp5 MEMORY;
    public static final dp5 MEMORY_CACHE;
    public static final dp5 NETWORK;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dp5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dp5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, dp5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, dp5] */
    static {
        ?? r0 = new Enum("MEMORY_CACHE", 0);
        MEMORY_CACHE = r0;
        ?? r1 = new Enum("MEMORY", 1);
        MEMORY = r1;
        ?? r2 = new Enum("DISK", 2);
        DISK = r2;
        ?? r3 = new Enum("NETWORK", 3);
        NETWORK = r3;
        dp5[] dp5VarArr = {r0, r1, r2, r3};
        $VALUES = dp5VarArr;
        $ENTRIES = new wg7(dp5VarArr);
    }

    public static dp5 valueOf(String str) {
        return (dp5) Enum.valueOf(dp5.class, str);
    }

    public static dp5[] values() {
        return (dp5[]) $VALUES.clone();
    }
}

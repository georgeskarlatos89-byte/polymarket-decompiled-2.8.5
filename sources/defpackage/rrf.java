package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rrf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rrf[] $VALUES;
    public static final rrf Idle;
    public static final rrf Inactive;
    public static final rrf InactivePendingWork;
    public static final rrf PendingWork;
    public static final rrf ShutDown;
    public static final rrf ShuttingDown;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rrf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, rrf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, rrf] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, rrf] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, rrf] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, rrf] */
    static {
        ?? r0 = new Enum("ShutDown", 0);
        ShutDown = r0;
        ?? r1 = new Enum("ShuttingDown", 1);
        ShuttingDown = r1;
        ?? r2 = new Enum("Inactive", 2);
        Inactive = r2;
        ?? r3 = new Enum("InactivePendingWork", 3);
        InactivePendingWork = r3;
        ?? r4 = new Enum("Idle", 4);
        Idle = r4;
        ?? r5 = new Enum("PendingWork", 5);
        PendingWork = r5;
        rrf[] rrfVarArr = {r0, r1, r2, r3, r4, r5};
        $VALUES = rrfVarArr;
        $ENTRIES = new wg7(rrfVarArr);
    }

    public static rrf valueOf(String str) {
        return (rrf) Enum.valueOf(rrf.class, str);
    }

    public static rrf[] values() {
        return (rrf[]) $VALUES.clone();
    }
}

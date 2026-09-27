package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xp8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xp8[] $VALUES;
    public static final wp8 Companion;
    public static final xp8 Function;
    public static final xp8 KFunction;
    public static final xp8 KSuspendFunction;
    public static final xp8 SuspendFunction;
    public static final xp8 UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [xp8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wp8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xp8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xp8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [xp8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [xp8, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Function", 0);
        Function = r0;
        ?? r1 = new Enum("SuspendFunction", 1);
        SuspendFunction = r1;
        ?? r2 = new Enum("KFunction", 2);
        KFunction = r2;
        ?? r3 = new Enum("KSuspendFunction", 3);
        KSuspendFunction = r3;
        ?? r4 = new Enum("UNKNOWN", 4);
        UNKNOWN = r4;
        xp8[] xp8VarArr = {r0, r1, r2, r3, r4};
        $VALUES = xp8VarArr;
        $ENTRIES = new wg7(xp8VarArr);
        Companion = new Object();
    }

    public static xp8 valueOf(String str) {
        return (xp8) Enum.valueOf(xp8.class, str);
    }

    public static xp8[] values() {
        return (xp8[]) $VALUES.clone();
    }
}

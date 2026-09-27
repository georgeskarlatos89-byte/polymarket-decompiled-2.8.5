package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ l9[] $VALUES;
    public static final l9 Created;
    public static final l9 Destroyed;
    public static final l9 Paused;
    public static final l9 Resumed;
    public static final l9 Started;
    public static final l9 Stopped;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l9] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, l9] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, l9] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, l9] */
    static {
        ?? r0 = new Enum("Created", 0);
        Created = r0;
        ?? r1 = new Enum("Started", 1);
        Started = r1;
        ?? r2 = new Enum("Resumed", 2);
        Resumed = r2;
        ?? r3 = new Enum("Paused", 3);
        Paused = r3;
        ?? r4 = new Enum("Stopped", 4);
        Stopped = r4;
        ?? r5 = new Enum("Destroyed", 5);
        Destroyed = r5;
        l9[] l9VarArr = {r0, r1, r2, r3, r4, r5};
        $VALUES = l9VarArr;
        $ENTRIES = new wg7(l9VarArr);
    }

    public static l9 valueOf(String str) {
        return (l9) Enum.valueOf(l9.class, str);
    }

    public static l9[] values() {
        return (l9[]) $VALUES.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class r98 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ r98[] $VALUES;
    public static final r98 Failed;
    public static final r98 Idle;
    public static final r98 Loading;
    public static final r98 Paused;
    public static final r98 Playing;
    public static final r98 Ready;

    /* JADX WARN: Type inference failed for: r0v0, types: [r98, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r98, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r98, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [r98, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [r98, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [r98, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Idle", 0);
        Idle = r0;
        ?? r1 = new Enum("Loading", 1);
        Loading = r1;
        ?? r2 = new Enum("Ready", 2);
        Ready = r2;
        ?? r3 = new Enum("Playing", 3);
        Playing = r3;
        ?? r4 = new Enum("Paused", 4);
        Paused = r4;
        ?? r5 = new Enum("Failed", 5);
        Failed = r5;
        r98[] r98VarArr = {r0, r1, r2, r3, r4, r5};
        $VALUES = r98VarArr;
        $ENTRIES = new wg7(r98VarArr);
    }

    public static r98 valueOf(String str) {
        return (r98) Enum.valueOf(r98.class, str);
    }

    public static r98[] values() {
        return (r98[]) $VALUES.clone();
    }
}

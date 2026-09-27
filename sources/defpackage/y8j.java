package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class y8j {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ y8j[] $VALUES;
    public static final y8j Fill;
    public static final y8j Pill;
    public static final y8j Start;
    public static final y8j Target;
    public static final y8j Track;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y8j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y8j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y8j] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, y8j] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, y8j] */
    static {
        ?? r0 = new Enum("Track", 0);
        Track = r0;
        ?? r1 = new Enum("Fill", 1);
        Fill = r1;
        ?? r2 = new Enum("Start", 2);
        Start = r2;
        ?? r3 = new Enum("Target", 3);
        Target = r3;
        ?? r4 = new Enum("Pill", 4);
        Pill = r4;
        y8j[] y8jVarArr = {r0, r1, r2, r3, r4};
        $VALUES = y8jVarArr;
        $ENTRIES = new wg7(y8jVarArr);
    }

    public static y8j valueOf(String str) {
        return (y8j) Enum.valueOf(y8j.class, str);
    }

    public static y8j[] values() {
        return (y8j[]) $VALUES.clone();
    }
}

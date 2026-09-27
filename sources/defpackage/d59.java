package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class d59 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ d59[] $VALUES;
    public static final d59 Finished;
    public static final d59 Live;
    public static final d59 Postponed;
    public static final d59 StartingSoon;
    public static final d59 Upcoming;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d59] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d59] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, d59] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, d59] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, d59] */
    static {
        ?? r0 = new Enum("Upcoming", 0);
        Upcoming = r0;
        ?? r1 = new Enum("StartingSoon", 1);
        StartingSoon = r1;
        ?? r2 = new Enum("Live", 2);
        Live = r2;
        ?? r3 = new Enum("Finished", 3);
        Finished = r3;
        ?? r4 = new Enum("Postponed", 4);
        Postponed = r4;
        d59[] d59VarArr = {r0, r1, r2, r3, r4};
        $VALUES = d59VarArr;
        $ENTRIES = new wg7(d59VarArr);
    }

    public static d59 valueOf(String str) {
        return (d59) Enum.valueOf(d59.class, str);
    }

    public static d59[] values() {
        return (d59[]) $VALUES.clone();
    }
}

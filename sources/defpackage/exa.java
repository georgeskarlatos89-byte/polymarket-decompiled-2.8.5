package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class exa {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ exa[] $VALUES;
    public static final exa Idle;
    public static final exa LayingOut;
    public static final exa LookaheadLayingOut;
    public static final exa LookaheadMeasuring;
    public static final exa Measuring;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, exa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, exa] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, exa] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, exa] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, exa] */
    static {
        ?? r0 = new Enum("Measuring", 0);
        Measuring = r0;
        ?? r1 = new Enum("LookaheadMeasuring", 1);
        LookaheadMeasuring = r1;
        ?? r2 = new Enum("LayingOut", 2);
        LayingOut = r2;
        ?? r3 = new Enum("LookaheadLayingOut", 3);
        LookaheadLayingOut = r3;
        ?? r4 = new Enum("Idle", 4);
        Idle = r4;
        exa[] exaVarArr = {r0, r1, r2, r3, r4};
        $VALUES = exaVarArr;
        $ENTRIES = new wg7(exaVarArr);
    }

    public static exa valueOf(String str) {
        return (exa) Enum.valueOf(exa.class, str);
    }

    public static exa[] values() {
        return (exa[]) $VALUES.clone();
    }
}

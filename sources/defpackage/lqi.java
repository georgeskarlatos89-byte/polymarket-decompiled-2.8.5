package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lqi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ lqi[] $VALUES;
    public static final lqi Center;
    public static final lqi End;
    public static final lqi Start;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lqi] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lqi] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, lqi] */
    static {
        ?? r0 = new Enum("Start", 0);
        Start = r0;
        ?? r1 = new Enum("Center", 1);
        Center = r1;
        ?? r2 = new Enum("End", 2);
        End = r2;
        lqi[] lqiVarArr = {r0, r1, r2};
        $VALUES = lqiVarArr;
        $ENTRIES = new wg7(lqiVarArr);
    }

    public static lqi valueOf(String str) {
        return (lqi) Enum.valueOf(lqi.class, str);
    }

    public static lqi[] values() {
        return (lqi[]) $VALUES.clone();
    }
}

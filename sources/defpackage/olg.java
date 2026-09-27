package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class olg {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ olg[] $VALUES;
    public static final olg Empty;
    public static final olg Loading;
    public static final olg Results;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, olg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, olg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, olg] */
    static {
        ?? r0 = new Enum("Loading", 0);
        Loading = r0;
        ?? r1 = new Enum("Empty", 1);
        Empty = r1;
        ?? r2 = new Enum("Results", 2);
        Results = r2;
        olg[] olgVarArr = {r0, r1, r2};
        $VALUES = olgVarArr;
        $ENTRIES = new wg7(olgVarArr);
    }

    public static olg valueOf(String str) {
        return (olg) Enum.valueOf(olg.class, str);
    }

    public static olg[] values() {
        return (olg[]) $VALUES.clone();
    }
}

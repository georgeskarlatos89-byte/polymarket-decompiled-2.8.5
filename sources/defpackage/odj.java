package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class odj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ odj[] $VALUES;
    public static final odj CancelTraversal;
    public static final odj ContinueTraversal;
    public static final odj SkipSubtreeAndContinueTraversal;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, odj] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, odj] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, odj] */
    static {
        ?? r0 = new Enum("ContinueTraversal", 0);
        ContinueTraversal = r0;
        ?? r1 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        SkipSubtreeAndContinueTraversal = r1;
        ?? r2 = new Enum("CancelTraversal", 2);
        CancelTraversal = r2;
        odj[] odjVarArr = {r0, r1, r2};
        $VALUES = odjVarArr;
        $ENTRIES = new wg7(odjVarArr);
    }

    public static odj valueOf(String str) {
        return (odj) Enum.valueOf(odj.class, str);
    }

    public static odj[] values() {
        return (odj[]) $VALUES.clone();
    }
}

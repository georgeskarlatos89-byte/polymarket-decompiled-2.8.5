package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y0h {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ y0h[] $VALUES;
    public static final y0h Circle;
    public static final y0h CutCorner;
    public static final y0h None;
    public static final y0h Rectangle;
    public static final y0h RoundCorner;

    /* JADX WARN: Type inference failed for: r0v0, types: [y0h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [y0h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [y0h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [y0h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [y0h, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Rectangle", 0);
        Rectangle = r0;
        ?? r1 = new Enum("Circle", 1);
        Circle = r1;
        ?? r2 = new Enum("RoundCorner", 2);
        RoundCorner = r2;
        ?? r3 = new Enum("CutCorner", 3);
        CutCorner = r3;
        ?? r4 = new Enum("None", 4);
        None = r4;
        y0h[] y0hVarArr = {r0, r1, r2, r3, r4};
        $VALUES = y0hVarArr;
        $ENTRIES = new wg7(y0hVarArr);
    }

    public static y0h valueOf(String str) {
        return (y0h) Enum.valueOf(y0h.class, str);
    }

    public static y0h[] values() {
        return (y0h[]) $VALUES.clone();
    }
}

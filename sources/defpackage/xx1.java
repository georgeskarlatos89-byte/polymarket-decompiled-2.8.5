package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xx1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xx1[] $VALUES;
    public static final xx1 Morph;
    public static final xx1 Numeric;
    public static final xx1 Replace;

    /* JADX WARN: Type inference failed for: r0v0, types: [xx1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xx1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xx1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Morph", 0);
        Morph = r0;
        ?? r1 = new Enum("Replace", 1);
        Replace = r1;
        ?? r2 = new Enum("Numeric", 2);
        Numeric = r2;
        xx1[] xx1VarArr = {r0, r1, r2};
        $VALUES = xx1VarArr;
        $ENTRIES = new wg7(xx1VarArr);
    }

    public static xx1 valueOf(String str) {
        return (xx1) Enum.valueOf(xx1.class, str);
    }

    public static xx1[] values() {
        return (xx1[]) $VALUES.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class nx5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nx5[] $VALUES;
    public static final nx5 ARRAY_WRAPPED;
    public static final nx5 AUTO_DETECT;
    public static final nx5 WHITESPACE_SEPARATED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nx5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nx5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, nx5] */
    static {
        ?? r0 = new Enum("WHITESPACE_SEPARATED", 0);
        WHITESPACE_SEPARATED = r0;
        ?? r1 = new Enum("ARRAY_WRAPPED", 1);
        ARRAY_WRAPPED = r1;
        ?? r2 = new Enum("AUTO_DETECT", 2);
        AUTO_DETECT = r2;
        nx5[] nx5VarArr = {r0, r1, r2};
        $VALUES = nx5VarArr;
        $ENTRIES = new wg7(nx5VarArr);
    }

    public static nx5 valueOf(String str) {
        return (nx5) Enum.valueOf(nx5.class, str);
    }

    public static nx5[] values() {
        return (nx5[]) $VALUES.clone();
    }
}

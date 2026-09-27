package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qkc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qkc[] $VALUES;
    public static final qkc FULL;
    public static final qkc NUMERIC;
    public static final qkc SHORT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qkc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qkc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qkc] */
    static {
        ?? r0 = new Enum("FULL", 0);
        FULL = r0;
        ?? r1 = new Enum("SHORT", 1);
        SHORT = r1;
        ?? r2 = new Enum("NUMERIC", 2);
        NUMERIC = r2;
        qkc[] qkcVarArr = {r0, r1, r2};
        $VALUES = qkcVarArr;
        $ENTRIES = new wg7(qkcVarArr);
    }

    public static qkc valueOf(String str) {
        return (qkc) Enum.valueOf(qkc.class, str);
    }

    public static qkc[] values() {
        return (qkc[]) $VALUES.clone();
    }
}

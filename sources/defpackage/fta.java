package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fta {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ fta[] $VALUES;
    public static final fta BINARY;
    public static final fta RUNTIME;
    public static final fta SOURCE;

    /* JADX WARN: Type inference failed for: r0v0, types: [fta, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fta, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [fta, java.lang.Enum] */
    static {
        ?? r0 = new Enum("RUNTIME", 0);
        RUNTIME = r0;
        ?? r1 = new Enum("BINARY", 1);
        BINARY = r1;
        ?? r2 = new Enum("SOURCE", 2);
        SOURCE = r2;
        fta[] ftaVarArr = {r0, r1, r2};
        $VALUES = ftaVarArr;
        $ENTRIES = new wg7(ftaVarArr);
    }

    public static fta valueOf(String str) {
        return (fta) Enum.valueOf(fta.class, str);
    }

    public static fta[] values() {
        return (fta[]) $VALUES.clone();
    }
}

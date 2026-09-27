package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class u0e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ u0e[] $VALUES;
    public static final u0e AUTO_RELOAD;
    public static final u0e FIXED;
    public static final u0e VARIABLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u0e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u0e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u0e] */
    static {
        ?? r0 = new Enum("FIXED", 0);
        FIXED = r0;
        ?? r1 = new Enum("VARIABLE", 1);
        VARIABLE = r1;
        ?? r2 = new Enum("AUTO_RELOAD", 2);
        AUTO_RELOAD = r2;
        u0e[] u0eVarArr = {r0, r1, r2};
        $VALUES = u0eVarArr;
        $ENTRIES = new wg7(u0eVarArr);
    }

    public static u0e valueOf(String str) {
        return (u0e) Enum.valueOf(u0e.class, str);
    }

    public static u0e[] values() {
        return (u0e[]) $VALUES.clone();
    }
}

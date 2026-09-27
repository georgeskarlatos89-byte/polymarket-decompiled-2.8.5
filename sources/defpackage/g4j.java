package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g4j {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ g4j[] $VALUES;
    public static final g4j Indeterminate;
    public static final g4j Off;
    public static final g4j On;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g4j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g4j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g4j] */
    static {
        ?? r0 = new Enum("On", 0);
        On = r0;
        ?? r1 = new Enum("Off", 1);
        Off = r1;
        ?? r2 = new Enum("Indeterminate", 2);
        Indeterminate = r2;
        g4j[] g4jVarArr = {r0, r1, r2};
        $VALUES = g4jVarArr;
        $ENTRIES = new wg7(g4jVarArr);
    }

    public static g4j valueOf(String str) {
        return (g4j) Enum.valueOf(g4j.class, str);
    }

    public static g4j[] values() {
        return (g4j[]) $VALUES.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pec {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pec[] $VALUES;
    public static final pec CONTROL;
    public static final pec FULL;
    public static final pec HTML;
    public static final pec HTML_FULL;
    public static final pec MODAL;
    public static final pec SLIDEUP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pec] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pec] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pec] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, pec] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, pec] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, pec] */
    static {
        ?? r0 = new Enum("SLIDEUP", 0);
        SLIDEUP = r0;
        ?? r1 = new Enum("MODAL", 1);
        MODAL = r1;
        ?? r2 = new Enum("FULL", 2);
        FULL = r2;
        ?? r3 = new Enum("HTML_FULL", 3);
        HTML_FULL = r3;
        ?? r4 = new Enum("HTML", 4);
        HTML = r4;
        ?? r5 = new Enum("CONTROL", 5);
        CONTROL = r5;
        pec[] pecVarArr = {r0, r1, r2, r3, r4, r5};
        $VALUES = pecVarArr;
        $ENTRIES = new wg7(pecVarArr);
    }

    public static pec valueOf(String str) {
        return (pec) Enum.valueOf(pec.class, str);
    }

    public static pec[] values() {
        return (pec[]) $VALUES.clone();
    }
}

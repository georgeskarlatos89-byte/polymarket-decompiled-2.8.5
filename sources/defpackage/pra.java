package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class pra {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pra[] $VALUES;
    public static final pra ERROR;
    public static final pra HIDDEN;
    public static final pra WARNING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pra] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pra] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pra] */
    static {
        ?? r0 = new Enum("WARNING", 0);
        WARNING = r0;
        ?? r1 = new Enum("ERROR", 1);
        ERROR = r1;
        ?? r2 = new Enum("HIDDEN", 2);
        HIDDEN = r2;
        pra[] praVarArr = {r0, r1, r2};
        $VALUES = praVarArr;
        $ENTRIES = new wg7(praVarArr);
    }

    public static pra valueOf(String str) {
        return (pra) Enum.valueOf(pra.class, str);
    }

    public static pra[] values() {
        return (pra[]) $VALUES.clone();
    }
}

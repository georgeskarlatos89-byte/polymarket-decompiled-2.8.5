package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class km6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ km6[] $VALUES;
    public static final km6 ERROR;
    public static final km6 HIDDEN;
    public static final km6 WARNING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, km6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, km6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, km6] */
    static {
        ?? r0 = new Enum("WARNING", 0);
        WARNING = r0;
        ?? r1 = new Enum("ERROR", 1);
        ERROR = r1;
        ?? r2 = new Enum("HIDDEN", 2);
        HIDDEN = r2;
        km6[] km6VarArr = {r0, r1, r2};
        $VALUES = km6VarArr;
        $ENTRIES = new wg7(km6VarArr);
    }

    public static km6 valueOf(String str) {
        return (km6) Enum.valueOf(km6.class, str);
    }

    public static km6[] values() {
        return (km6[]) $VALUES.clone();
    }
}

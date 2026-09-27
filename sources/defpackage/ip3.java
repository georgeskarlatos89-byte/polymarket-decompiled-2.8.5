package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ip3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ip3[] $VALUES;
    public static final ip3 ALL;
    public static final ip3 DEBUG;
    public static final ip3 ERROR;
    public static final ip3 NOTHING;
    public static final ip3 WARN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ip3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ip3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ip3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ip3] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ip3] */
    static {
        ?? r0 = new Enum("ALL", 0);
        ALL = r0;
        ?? r1 = new Enum("DEBUG", 1);
        DEBUG = r1;
        ?? r2 = new Enum("WARN", 2);
        WARN = r2;
        ?? r3 = new Enum("ERROR", 3);
        ERROR = r3;
        ?? r4 = new Enum("NOTHING", 4);
        NOTHING = r4;
        ip3[] ip3VarArr = {r0, r1, r2, r3, r4};
        $VALUES = ip3VarArr;
        $ENTRIES = new wg7(ip3VarArr);
    }

    public static ip3 valueOf(String str) {
        return (ip3) Enum.valueOf(ip3.class, str);
    }

    public static ip3[] values() {
        return (ip3[]) $VALUES.clone();
    }
}

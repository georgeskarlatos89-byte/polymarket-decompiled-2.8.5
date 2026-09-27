package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vo8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vo8[] $VALUES;
    public static final vo8 ON_CONFIGURE;
    public static final vo8 ON_CREATE;
    public static final vo8 ON_DOWNGRADE;
    public static final vo8 ON_OPEN;
    public static final vo8 ON_UPGRADE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vo8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vo8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vo8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, vo8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, vo8] */
    static {
        ?? r0 = new Enum("ON_CONFIGURE", 0);
        ON_CONFIGURE = r0;
        ?? r1 = new Enum("ON_CREATE", 1);
        ON_CREATE = r1;
        ?? r2 = new Enum("ON_UPGRADE", 2);
        ON_UPGRADE = r2;
        ?? r3 = new Enum("ON_DOWNGRADE", 3);
        ON_DOWNGRADE = r3;
        ?? r4 = new Enum("ON_OPEN", 4);
        ON_OPEN = r4;
        vo8[] vo8VarArr = {r0, r1, r2, r3, r4};
        $VALUES = vo8VarArr;
        $ENTRIES = new wg7(vo8VarArr);
    }

    public static vo8 valueOf(String str) {
        return (vo8) Enum.valueOf(vo8.class, str);
    }

    public static vo8[] values() {
        return (vo8[]) $VALUES.clone();
    }
}

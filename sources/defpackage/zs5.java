package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zs5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zs5[] $VALUES;
    public static final zs5 DAY;
    public static final zs5 MONTH;
    public static final zs5 YEAR;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zs5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zs5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zs5] */
    static {
        ?? r0 = new Enum("DAY", 0);
        DAY = r0;
        ?? r1 = new Enum("MONTH", 1);
        MONTH = r1;
        ?? r2 = new Enum("YEAR", 2);
        YEAR = r2;
        zs5[] zs5VarArr = {r0, r1, r2};
        $VALUES = zs5VarArr;
        $ENTRIES = new wg7(zs5VarArr);
    }

    public static zs5 valueOf(String str) {
        return (zs5) Enum.valueOf(zs5.class, str);
    }

    public static zs5[] values() {
        return (zs5[]) $VALUES.clone();
    }
}

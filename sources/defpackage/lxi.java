package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class lxi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ lxi[] $VALUES;
    public static final lxi Icon;
    public static final lxi Market;
    public static final lxi Odds;
    public static final lxi Selection;
    public static final lxi Side;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lxi] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lxi] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, lxi] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, lxi] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, lxi] */
    static {
        ?? r0 = new Enum("Icon", 0);
        Icon = r0;
        ?? r1 = new Enum("Side", 1);
        Side = r1;
        ?? r2 = new Enum("Selection", 2);
        Selection = r2;
        ?? r3 = new Enum("Market", 3);
        Market = r3;
        ?? r4 = new Enum("Odds", 4);
        Odds = r4;
        lxi[] lxiVarArr = {r0, r1, r2, r3, r4};
        $VALUES = lxiVarArr;
        $ENTRIES = new wg7(lxiVarArr);
    }

    public static lxi valueOf(String str) {
        return (lxi) Enum.valueOf(lxi.class, str);
    }

    public static lxi[] values() {
        return (lxi[]) $VALUES.clone();
    }
}

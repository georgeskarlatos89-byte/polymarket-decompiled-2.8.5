package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class nx8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nx8[] $VALUES;
    public static final nx8 Book;
    public static final nx8 Buy;
    public static final nx8 Checkout;
    public static final nx8 Donate;
    public static final nx8 Order;
    public static final nx8 Pay;
    public static final nx8 Plain;
    public static final nx8 Subscribe;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nx8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nx8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, nx8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, nx8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, nx8] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, nx8] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, nx8] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, nx8] */
    static {
        ?? r0 = new Enum("Buy", 0);
        Buy = r0;
        ?? r1 = new Enum("Book", 1);
        Book = r1;
        ?? r2 = new Enum("Checkout", 2);
        Checkout = r2;
        ?? r3 = new Enum("Donate", 3);
        Donate = r3;
        ?? r4 = new Enum("Order", 4);
        Order = r4;
        ?? r5 = new Enum("Pay", 5);
        Pay = r5;
        ?? r6 = new Enum("Subscribe", 6);
        Subscribe = r6;
        ?? r7 = new Enum("Plain", 7);
        Plain = r7;
        nx8[] nx8VarArr = {r0, r1, r2, r3, r4, r5, r6, r7};
        $VALUES = nx8VarArr;
        $ENTRIES = new wg7(nx8VarArr);
    }

    public static nx8 valueOf(String str) {
        return (nx8) Enum.valueOf(nx8.class, str);
    }

    public static nx8[] values() {
        return (nx8[]) $VALUES.clone();
    }
}

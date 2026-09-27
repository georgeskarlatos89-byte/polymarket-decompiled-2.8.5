package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class prg {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ prg[] $VALUES;
    public static final prg Bought;
    public static final prg Lost;
    public static final prg Payout;
    public static final prg Won;
    public static final prg Worth;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, prg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, prg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, prg] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, prg] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, prg] */
    static {
        ?? r0 = new Enum("Bought", 0);
        Bought = r0;
        ?? r1 = new Enum("Payout", 1);
        Payout = r1;
        ?? r2 = new Enum("Worth", 2);
        Worth = r2;
        ?? r3 = new Enum("Won", 3);
        Won = r3;
        ?? r4 = new Enum("Lost", 4);
        Lost = r4;
        prg[] prgVarArr = {r0, r1, r2, r3, r4};
        $VALUES = prgVarArr;
        $ENTRIES = new wg7(prgVarArr);
    }

    public static prg valueOf(String str) {
        return (prg) Enum.valueOf(prg.class, str);
    }

    public static prg[] values() {
        return (prg[]) $VALUES.clone();
    }

    public final String a() {
        int i = org.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "Lost";
                        }
                        dmk.a();
                        return null;
                    }
                    return "Won";
                }
                return "Worth";
            }
            return "Payout";
        }
        return "Bought";
    }
}

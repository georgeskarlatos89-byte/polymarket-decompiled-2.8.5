package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class y5k {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ y5k[] $VALUES;
    public static final y5k CREDIT;
    public static final y5k DEBIT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y5k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y5k] */
    static {
        ?? r0 = new Enum("CREDIT", 0);
        CREDIT = r0;
        ?? r1 = new Enum("DEBIT", 1);
        DEBIT = r1;
        y5k[] y5kVarArr = {r0, r1};
        $VALUES = y5kVarArr;
        $ENTRIES = new wg7(y5kVarArr);
    }

    public static y5k valueOf(String str) {
        return (y5k) Enum.valueOf(y5k.class, str);
    }

    public static y5k[] values() {
        return (y5k[]) $VALUES.clone();
    }
}

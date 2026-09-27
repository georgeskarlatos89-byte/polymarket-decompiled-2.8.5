package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g0e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ g0e[] $VALUES;
    public static final g0e UPC_TYPE_2;
    public static final g0e UPC_TYPE_5;
    public static final g0e UPC_TYPE_A;
    public static final g0e UPC_TYPE_B;
    public static final g0e UPC_TYPE_C;
    public static final g0e UPC_TYPE_D;
    public static final g0e UPC_TYPE_E;
    private final String stringValue;

    static {
        g0e g0eVar = new g0e("UPC_TYPE_A", 0, "UPC-A");
        UPC_TYPE_A = g0eVar;
        g0e g0eVar2 = new g0e("UPC_TYPE_B", 1, "UPC-B");
        UPC_TYPE_B = g0eVar2;
        g0e g0eVar3 = new g0e("UPC_TYPE_C", 2, "UPC-C");
        UPC_TYPE_C = g0eVar3;
        g0e g0eVar4 = new g0e("UPC_TYPE_D", 3, "UPC-D");
        UPC_TYPE_D = g0eVar4;
        g0e g0eVar5 = new g0e("UPC_TYPE_E", 4, "UPC-E");
        UPC_TYPE_E = g0eVar5;
        g0e g0eVar6 = new g0e("UPC_TYPE_2", 5, "UPC-2");
        UPC_TYPE_2 = g0eVar6;
        g0e g0eVar7 = new g0e("UPC_TYPE_5", 6, "UPC-5");
        UPC_TYPE_5 = g0eVar7;
        g0e[] g0eVarArr = {g0eVar, g0eVar2, g0eVar3, g0eVar4, g0eVar5, g0eVar6, g0eVar7};
        $VALUES = g0eVarArr;
        $ENTRIES = new wg7(g0eVarArr);
    }

    public g0e(String str, int i, String str2) {
        this.stringValue = str2;
    }

    public static g0e valueOf(String str) {
        return (g0e) Enum.valueOf(g0e.class, str);
    }

    public static g0e[] values() {
        return (g0e[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringValue;
    }
}

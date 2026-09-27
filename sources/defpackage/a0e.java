package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a0e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ a0e[] $VALUES;
    public static final a0e CREDIT;
    public static final a0e PAYPAL;
    public static final a0e PAY_LATER;
    private final String value;

    static {
        a0e a0eVar = new a0e("PAYPAL", 0, "paypal");
        PAYPAL = a0eVar;
        a0e a0eVar2 = new a0e("PAY_LATER", 1, "paylater");
        PAY_LATER = a0eVar2;
        a0e a0eVar3 = new a0e("CREDIT", 2, "credit");
        CREDIT = a0eVar3;
        a0e[] a0eVarArr = {a0eVar, a0eVar2, a0eVar3};
        $VALUES = a0eVarArr;
        $ENTRIES = new wg7(a0eVarArr);
    }

    public a0e(String str, int i, String str2) {
        this.value = str2;
    }

    public static a0e valueOf(String str) {
        return (a0e) Enum.valueOf(a0e.class, str);
    }

    public static a0e[] values() {
        return (a0e[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}

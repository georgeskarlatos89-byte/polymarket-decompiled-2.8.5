package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o0e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ o0e[] $VALUES;
    public static final o0e AUTHORIZE;
    public static final n0e Companion;
    public static final o0e ORDER;
    public static final o0e SALE;
    private final String stringValue;

    /* JADX WARN: Type inference failed for: r0v2, types: [n0e, java.lang.Object] */
    static {
        o0e o0eVar = new o0e("ORDER", 0, "order");
        ORDER = o0eVar;
        o0e o0eVar2 = new o0e("SALE", 1, "sale");
        SALE = o0eVar2;
        o0e o0eVar3 = new o0e("AUTHORIZE", 2, "authorize");
        AUTHORIZE = o0eVar3;
        o0e[] o0eVarArr = {o0eVar, o0eVar2, o0eVar3};
        $VALUES = o0eVarArr;
        $ENTRIES = new wg7(o0eVarArr);
        Companion = new Object();
    }

    public o0e(String str, int i, String str2) {
        this.stringValue = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static o0e valueOf(String str) {
        return (o0e) Enum.valueOf(o0e.class, str);
    }

    public static o0e[] values() {
        return (o0e[]) $VALUES.clone();
    }

    public final String b() {
        return this.stringValue;
    }
}

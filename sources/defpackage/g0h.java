package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g0h {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ g0h[] $VALUES;
    public static final g0h Abandoned;
    public static final f0h Companion;
    public static final g0h Duplicate;
    public static final g0h RequestedByCustomer;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, f0h] */
    static {
        g0h g0hVar = new g0h("Duplicate", 0, "duplicate");
        Duplicate = g0hVar;
        g0h g0hVar2 = new g0h("RequestedByCustomer", 1, "requested_by_customer");
        RequestedByCustomer = g0hVar2;
        g0h g0hVar3 = new g0h("Abandoned", 2, "abandoned");
        Abandoned = g0hVar3;
        g0h[] g0hVarArr = {g0hVar, g0hVar2, g0hVar3};
        $VALUES = g0hVarArr;
        $ENTRIES = new wg7(g0hVarArr);
        Companion = new Object();
    }

    public g0h(String str, int i, String str2) {
        this.code = str2;
    }

    public static final /* synthetic */ String a(g0h g0hVar) {
        return g0hVar.code;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static g0h valueOf(String str) {
        return (g0h) Enum.valueOf(g0h.class, str);
    }

    public static g0h[] values() {
        return (g0h[]) $VALUES.clone();
    }
}

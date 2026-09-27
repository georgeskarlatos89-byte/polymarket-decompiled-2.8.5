package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d0e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ d0e[] $VALUES;
    public static final d0e LANDING_PAGE_TYPE_BILLING;
    public static final d0e LANDING_PAGE_TYPE_LOGIN;
    private final String stringValue;

    static {
        d0e d0eVar = new d0e("LANDING_PAGE_TYPE_BILLING", 0, "billing");
        LANDING_PAGE_TYPE_BILLING = d0eVar;
        d0e d0eVar2 = new d0e("LANDING_PAGE_TYPE_LOGIN", 1, "login");
        LANDING_PAGE_TYPE_LOGIN = d0eVar2;
        d0e[] d0eVarArr = {d0eVar, d0eVar2};
        $VALUES = d0eVarArr;
        $ENTRIES = new wg7(d0eVarArr);
    }

    public d0e(String str, int i, String str2) {
        this.stringValue = str2;
    }

    public static d0e valueOf(String str) {
        return (d0e) Enum.valueOf(d0e.class, str);
    }

    public static d0e[] values() {
        return (d0e[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringValue;
    }
}

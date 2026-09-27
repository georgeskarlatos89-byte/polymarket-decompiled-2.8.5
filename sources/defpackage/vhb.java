package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vhb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vhb[] $VALUES;
    public static final vhb APP_LINK;
    public static final vhb DEEP_LINK;
    private final String stringValue;

    static {
        vhb vhbVar = new vhb("APP_LINK", 0, "applink");
        APP_LINK = vhbVar;
        vhb vhbVar2 = new vhb("DEEP_LINK", 1, "deeplink");
        DEEP_LINK = vhbVar2;
        vhb[] vhbVarArr = {vhbVar, vhbVar2};
        $VALUES = vhbVarArr;
        $ENTRIES = new wg7(vhbVarArr);
    }

    public vhb(String str, int i, String str2) {
        this.stringValue = str2;
    }

    public static vhb valueOf(String str) {
        return (vhb) Enum.valueOf(vhb.class, str);
    }

    public static vhb[] values() {
        return (vhb[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringValue;
    }
}

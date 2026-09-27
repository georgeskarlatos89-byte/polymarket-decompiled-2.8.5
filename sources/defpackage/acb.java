package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class acb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ acb[] $VALUES;
    public static final acb Authenticated;
    public static final acb Consented;
    public static final acb Created;
    public static final acb Expired;
    public static final acb Rejected;
    private final String value;

    static {
        acb acbVar = new acb("Created", 0, "created");
        Created = acbVar;
        acb acbVar2 = new acb("Authenticated", 1, "authenticated");
        Authenticated = acbVar2;
        acb acbVar3 = new acb("Consented", 2, "consented");
        Consented = acbVar3;
        acb acbVar4 = new acb("Rejected", 3, "rejected");
        Rejected = acbVar4;
        acb acbVar5 = new acb("Expired", 4, "expired");
        Expired = acbVar5;
        acb[] acbVarArr = {acbVar, acbVar2, acbVar3, acbVar4, acbVar5};
        $VALUES = acbVarArr;
        $ENTRIES = new wg7(acbVarArr);
    }

    public acb(String str, int i, String str2) {
        this.value = str2;
    }

    public static acb valueOf(String str) {
        return (acb) Enum.valueOf(acb.class, str);
    }

    public static acb[] values() {
        return (acb[]) $VALUES.clone();
    }
}

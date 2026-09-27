package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class dsc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dsc[] $VALUES;
    public static final dsc Disabled;
    public static final dsc InBillingDetailsForm;
    public static final dsc OutsideBillingDetailsForm;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dsc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dsc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, dsc] */
    static {
        ?? r0 = new Enum("Disabled", 0);
        Disabled = r0;
        ?? r1 = new Enum("InBillingDetailsForm", 1);
        InBillingDetailsForm = r1;
        ?? r2 = new Enum("OutsideBillingDetailsForm", 2);
        OutsideBillingDetailsForm = r2;
        dsc[] dscVarArr = {r0, r1, r2};
        $VALUES = dscVarArr;
        $ENTRIES = new wg7(dscVarArr);
    }

    public static dsc valueOf(String str) {
        return (dsc) Enum.valueOf(dsc.class, str);
    }

    public static dsc[] values() {
        return (dsc[]) $VALUES.clone();
    }
}

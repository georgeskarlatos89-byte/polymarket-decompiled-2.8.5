package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xsd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xsd[] $VALUES;
    public static final xsd AROUND_ID;
    public static final xsd GREATER_THAN;
    public static final xsd GREATER_THAN_OR_EQUAL;
    public static final xsd LESS_THAN;
    public static final xsd LESS_THAN_OR_EQUAL;
    private final String value;

    static {
        xsd xsdVar = new xsd("GREATER_THAN", 0, "id_gt");
        GREATER_THAN = xsdVar;
        xsd xsdVar2 = new xsd("GREATER_THAN_OR_EQUAL", 1, "id_gte");
        GREATER_THAN_OR_EQUAL = xsdVar2;
        xsd xsdVar3 = new xsd("LESS_THAN", 2, "id_lt");
        LESS_THAN = xsdVar3;
        xsd xsdVar4 = new xsd("LESS_THAN_OR_EQUAL", 3, "id_lte");
        LESS_THAN_OR_EQUAL = xsdVar4;
        xsd xsdVar5 = new xsd("AROUND_ID", 4, "id_around");
        AROUND_ID = xsdVar5;
        xsd[] xsdVarArr = {xsdVar, xsdVar2, xsdVar3, xsdVar4, xsdVar5};
        $VALUES = xsdVarArr;
        $ENTRIES = new wg7(xsdVarArr);
    }

    public xsd(String str, int i, String str2) {
        this.value = str2;
    }

    public static xsd valueOf(String str) {
        return (xsd) Enum.valueOf(xsd.class, str);
    }

    public static xsd[] values() {
        return (xsd[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}

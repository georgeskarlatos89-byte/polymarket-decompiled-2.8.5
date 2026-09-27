package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sgh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sgh[] $VALUES;
    public static final sgh OBJECT_PARAMETER_GENERIC;
    public static final sgh OBJECT_PARAMETER_NON_GENERIC;
    public static final sgh ONE_COLLECTION_PARAMETER;
    private final boolean isObjectReplacedWithTypeParameter;
    private final String valueParametersSignature;

    static {
        sgh sghVar = new sgh(0, "ONE_COLLECTION_PARAMETER", false, "Ljava/util/Collection<+Ljava/lang/Object;>;");
        ONE_COLLECTION_PARAMETER = sghVar;
        sgh sghVar2 = new sgh(1, "OBJECT_PARAMETER_NON_GENERIC", true, null);
        OBJECT_PARAMETER_NON_GENERIC = sghVar2;
        sgh sghVar3 = new sgh(2, "OBJECT_PARAMETER_GENERIC", true, "Ljava/lang/Object;");
        OBJECT_PARAMETER_GENERIC = sghVar3;
        sgh[] sghVarArr = {sghVar, sghVar2, sghVar3};
        $VALUES = sghVarArr;
        $ENTRIES = new wg7(sghVarArr);
    }

    public sgh(int i, String str, boolean z, String str2) {
        this.valueParametersSignature = str2;
        this.isObjectReplacedWithTypeParameter = z;
    }

    public static sgh valueOf(String str) {
        return (sgh) Enum.valueOf(sgh.class, str);
    }

    public static sgh[] values() {
        return (sgh[]) $VALUES.clone();
    }
}

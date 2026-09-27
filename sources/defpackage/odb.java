package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class odb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ odb[] $VALUES;
    public static final odb AutomaticTaxBillingAddress;
    public static final odb BillingDetailsCollection;
    public static final odb CardBrandFiltering;
    public static final odb LinkConfiguration;
    public static final odb NotSupportedInElementsSession;
    private final String value;

    static {
        odb odbVar = new odb("NotSupportedInElementsSession", 0, "not_supported_in_elements_session");
        NotSupportedInElementsSession = odbVar;
        odb odbVar2 = new odb("LinkConfiguration", 1, "link_configuration");
        LinkConfiguration = odbVar2;
        odb odbVar3 = new odb("CardBrandFiltering", 2, "card_brand_filtering");
        CardBrandFiltering = odbVar3;
        odb odbVar4 = new odb("BillingDetailsCollection", 3, "billing_details_collection");
        BillingDetailsCollection = odbVar4;
        odb odbVar5 = new odb("AutomaticTaxBillingAddress", 4, "automatic_tax_billing_address");
        AutomaticTaxBillingAddress = odbVar5;
        odb[] odbVarArr = {odbVar, odbVar2, odbVar3, odbVar4, odbVar5};
        $VALUES = odbVarArr;
        $ENTRIES = new wg7(odbVarArr);
    }

    public odb(String str, int i, String str2) {
        this.value = str2;
    }

    public static odb valueOf(String str) {
        return (odb) Enum.valueOf(odb.class, str);
    }

    public static odb[] values() {
        return (odb[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}

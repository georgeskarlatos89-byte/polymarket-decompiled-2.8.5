package defpackage;

import com.socure.docv.capturesdk.api.Keys;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class qne {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qne[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;

    @dxg("billing_address")
    public static final qne BillingAddress;

    @dxg("billing_address_without_country")
    public static final qne BillingAddressWithoutCountry;
    public static final pne Companion;

    @dxg("email")
    public static final qne Email;

    @dxg(Keys.KEY_NAME)
    public static final qne Name;

    @dxg(AttributeType.PHONE)
    public static final qne Phone;

    @dxg("sepa_mandate")
    public static final qne SepaMandate;

    @dxg("unknown")
    public static final qne Unknown;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qne] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pne, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qne] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qne] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, qne] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, qne] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, qne] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, qne] */
    static {
        ?? r0 = new Enum("Name", 0);
        Name = r0;
        ?? r1 = new Enum("Email", 1);
        Email = r1;
        ?? r2 = new Enum("Phone", 2);
        Phone = r2;
        ?? r3 = new Enum("BillingAddress", 3);
        BillingAddress = r3;
        ?? r4 = new Enum("BillingAddressWithoutCountry", 4);
        BillingAddressWithoutCountry = r4;
        ?? r5 = new Enum("SepaMandate", 5);
        SepaMandate = r5;
        ?? r6 = new Enum("Unknown", 6);
        Unknown = r6;
        qne[] qneVarArr = {r0, r1, r2, r3, r4, r5, r6};
        $VALUES = qneVarArr;
        $ENTRIES = new wg7(qneVarArr);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new nje(6));
    }

    public static final /* synthetic */ Lazy a() {
        return $cachedSerializer$delegate;
    }

    public static qne valueOf(String str) {
        return (qne) Enum.valueOf(qne.class, str);
    }

    public static qne[] values() {
        return (qne[]) $VALUES.clone();
    }
}

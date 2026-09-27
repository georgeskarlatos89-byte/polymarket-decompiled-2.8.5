package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import io.ably.lib.http.HttpConstants;
import io.intercom.android.sdk.models.carousel.ActionType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c6e implements Parcelable {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c6e[] $VALUES;
    public static final c6e Affirm;
    public static final c6e AfterpayClearpay;
    public static final c6e Alipay;
    public static final c6e Alma;
    public static final c6e AmazonPay;
    public static final c6e AuBecsDebit;
    public static final c6e BacsDebit;
    public static final c6e Bancontact;
    public static final c6e Billie;
    public static final c6e Blik;
    public static final c6e Boleto;
    public static final Parcelable.Creator<c6e> CREATOR;
    public static final c6e Card;
    public static final c6e CardPresent;
    public static final c6e CashAppPay;
    public static final b6e Companion;
    public static final c6e Crypto;
    public static final c6e Eps;
    public static final c6e Fpx;
    public static final c6e GrabPay;
    public static final c6e Ideal;
    public static final c6e Klarna;
    public static final c6e Konbini;
    public static final c6e Link;
    public static final c6e MobilePay;
    public static final c6e Multibanco;
    public static final c6e Netbanking;
    public static final c6e Oxxo;
    public static final c6e P24;
    public static final c6e PayByBank;
    public static final c6e PayNow;
    public static final c6e PayPal;
    public static final c6e PayPay;
    public static final c6e PromptPay;
    public static final c6e RevolutPay;
    public static final c6e Satispay;
    public static final c6e SepaDebit;
    public static final c6e Sunbit;
    public static final c6e Swish;
    public static final c6e Twint;
    public static final c6e USBankAccount;
    public static final c6e WeChatPay;
    public static final c6e Wero;
    public static final c6e Zip;
    private final k5e afterRedirectAction;
    public final String code;
    private final boolean hasDelayedSettlement;
    public final boolean isReusable;
    public final boolean isVoucher;
    public final boolean requiresMandate;
    private final boolean requiresMandateForPaymentIntent;

    /* JADX WARN: Type inference failed for: r0v5, types: [b6e, java.lang.Object] */
    static {
        c6e c6eVar = new c6e(HttpConstants.Headers.LINK, 0, ActionType.LINK, false, false, true, true, false, new h5e(5000L));
        Link = c6eVar;
        c6e c6eVar2 = new c6e("Card", 1, "card", true, false, false, false, false);
        Card = c6eVar2;
        c6e c6eVar3 = new c6e("CardPresent", 2, "card_present", false, false, false, false, false);
        CardPresent = c6eVar3;
        c6e c6eVar4 = new c6e("Fpx", 3, "fpx", false, false, false, false, false);
        Fpx = c6eVar4;
        c6e c6eVar5 = new c6e("Ideal", 4, "ideal", false, false, true, false, false);
        Ideal = c6eVar5;
        c6e c6eVar6 = new c6e("SepaDebit", 5, "sepa_debit", false, false, true, true, true);
        SepaDebit = c6eVar6;
        c6e c6eVar7 = new c6e("AuBecsDebit", 6, "au_becs_debit", true, false, true, true, true);
        AuBecsDebit = c6eVar7;
        c6e c6eVar8 = new c6e("BacsDebit", 7, "bacs_debit", true, false, true, true, true);
        BacsDebit = c6eVar8;
        c6e c6eVar9 = new c6e("P24", 8, "p24", false, false, false, false, false, new h5e(5000L));
        P24 = c6eVar9;
        c6e c6eVar10 = new c6e("Bancontact", 9, "bancontact", false, false, true, true, false);
        Bancontact = c6eVar10;
        c6e c6eVar11 = new c6e("Eps", 10, "eps", false, false, false, false, false);
        Eps = c6eVar11;
        c6e c6eVar12 = new c6e("Oxxo", 11, "oxxo", false, true, false, false, true);
        Oxxo = c6eVar12;
        c6e c6eVar13 = new c6e("Alipay", 12, "alipay", false, false, false, false, false);
        Alipay = c6eVar13;
        c6e c6eVar14 = new c6e("GrabPay", 13, "grabpay", false, false, false, false, false);
        GrabPay = c6eVar14;
        c6e c6eVar15 = new c6e("PayPal", 14, "paypal", false, false, true, false, false);
        PayPal = c6eVar15;
        c6e c6eVar16 = new c6e("AfterpayClearpay", 15, "afterpay_clearpay", false, false, false, false, false);
        AfterpayClearpay = c6eVar16;
        c6e c6eVar17 = new c6e("Netbanking", 16, "netbanking", false, false, false, false, false);
        Netbanking = c6eVar17;
        c6e c6eVar18 = new c6e("Blik", 17, "blik", false, false, false, false, false);
        Blik = c6eVar18;
        c6e c6eVar19 = new c6e("WeChatPay", 18, "wechat_pay", false, false, false, false, false, new h5e(15000L));
        WeChatPay = c6eVar19;
        j5e j5eVar = j5e.a;
        c6e c6eVar20 = new c6e("Klarna", 19, "klarna", false, false, true, false, false, j5eVar);
        Klarna = c6eVar20;
        c6e c6eVar21 = new c6e("Affirm", 20, "affirm", false, false, false, false, false);
        Affirm = c6eVar21;
        c6e c6eVar22 = new c6e("RevolutPay", 21, "revolut_pay", false, false, true, false, false, new h5e(5000L));
        RevolutPay = c6eVar22;
        c6e c6eVar23 = new c6e("Sunbit", 22, "sunbit", false, false, false, false, false);
        Sunbit = c6eVar23;
        c6e c6eVar24 = new c6e("Billie", 23, "billie", false, false, false, false, false);
        Billie = c6eVar24;
        c6e c6eVar25 = new c6e("Satispay", 24, "satispay", false, false, true, false, false);
        Satispay = c6eVar25;
        c6e c6eVar26 = new c6e("Crypto", 25, "crypto", false, false, false, false, false);
        Crypto = c6eVar26;
        c6e c6eVar27 = new c6e("AmazonPay", 26, "amazon_pay", false, false, true, false, false, new h5e(5000L));
        AmazonPay = c6eVar27;
        c6e c6eVar28 = new c6e("Alma", 27, "alma", false, false, false, false, false);
        Alma = c6eVar28;
        c6e c6eVar29 = new c6e("MobilePay", 28, "mobilepay", false, false, false, false, false);
        MobilePay = c6eVar29;
        c6e c6eVar30 = new c6e("Multibanco", 29, "multibanco", false, true, false, false, true);
        Multibanco = c6eVar30;
        c6e c6eVar31 = new c6e("Zip", 30, "zip", false, false, false, false, false);
        Zip = c6eVar31;
        c6e c6eVar32 = new c6e("USBankAccount", 31, "us_bank_account", true, false, true, true, true);
        USBankAccount = c6eVar32;
        c6e c6eVar33 = new c6e("CashAppPay", 32, "cashapp", false, false, true, false, false, j5eVar);
        CashAppPay = c6eVar33;
        c6e c6eVar34 = new c6e("Boleto", 33, "boleto", false, true, false, false, true);
        Boleto = c6eVar34;
        c6e c6eVar35 = new c6e("Konbini", 34, "konbini", false, true, false, false, true);
        Konbini = c6eVar35;
        c6e c6eVar36 = new c6e("Swish", 35, "swish", false, false, false, false, false, new h5e(5000L));
        Swish = c6eVar36;
        c6e c6eVar37 = new c6e("Twint", 36, "twint", false, false, true, false, false, new h5e(5000L));
        Twint = c6eVar37;
        c6e c6eVar38 = new c6e("PayNow", 37, "paynow", false, true, false, false, false);
        PayNow = c6eVar38;
        c6e c6eVar39 = new c6e("PayPay", 38, "paypay", false, false, false, false, false, new h5e(5000L));
        PayPay = c6eVar39;
        c6e c6eVar40 = new c6e("PromptPay", 39, "promptpay", false, true, false, false, false);
        PromptPay = c6eVar40;
        c6e c6eVar41 = new c6e("Wero", 40, "wero", false, false, false, false, false);
        Wero = c6eVar41;
        c6e c6eVar42 = new c6e("PayByBank", 41, "pay_by_bank", false, false, false, false, false);
        PayByBank = c6eVar42;
        c6e[] c6eVarArr = {c6eVar, c6eVar2, c6eVar3, c6eVar4, c6eVar5, c6eVar6, c6eVar7, c6eVar8, c6eVar9, c6eVar10, c6eVar11, c6eVar12, c6eVar13, c6eVar14, c6eVar15, c6eVar16, c6eVar17, c6eVar18, c6eVar19, c6eVar20, c6eVar21, c6eVar22, c6eVar23, c6eVar24, c6eVar25, c6eVar26, c6eVar27, c6eVar28, c6eVar29, c6eVar30, c6eVar31, c6eVar32, c6eVar33, c6eVar34, c6eVar35, c6eVar36, c6eVar37, c6eVar38, c6eVar39, c6eVar40, c6eVar41, c6eVar42};
        $VALUES = c6eVarArr;
        $ENTRIES = new wg7(c6eVarArr);
        Companion = new Object();
        CREATOR = new i5e(17);
    }

    public c6e(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, k5e k5eVar) {
        this.code = str2;
        this.isReusable = z;
        this.isVoucher = z2;
        this.requiresMandate = z3;
        this.requiresMandateForPaymentIntent = z4;
        this.hasDelayedSettlement = z5;
        this.afterRedirectAction = k5eVar;
    }

    public static ug7 g() {
        return $ENTRIES;
    }

    public static c6e valueOf(String str) {
        return (c6e) Enum.valueOf(c6e.class, str);
    }

    public static c6e[] values() {
        return (c6e[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final k5e e() {
        return this.afterRedirectAction;
    }

    public final boolean o() {
        return this.requiresMandateForPaymentIntent;
    }

    public final boolean p() {
        return this.hasDelayedSettlement;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.code;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }

    public /* synthetic */ c6e(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(str, i, str2, z, z2, z3, z4, z5, g5e.a);
    }
}

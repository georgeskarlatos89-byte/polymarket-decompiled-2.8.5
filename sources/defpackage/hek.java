package defpackage;

import io.ably.lib.http.HttpConstants;
import io.intercom.android.sdk.models.carousel.ActionType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class hek {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ hek[] $VALUES;
    public static final hek AmexExpressCheckout;
    public static final hek ApplePay;
    public static final gek Companion;
    public static final hek GooglePay;
    public static final hek Link;
    public static final hek Masterpass;
    public static final hek SamsungPay;
    public static final hek VisaCheckout;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, gek] */
    static {
        hek hekVar = new hek("AmexExpressCheckout", 0, "amex_express_checkout");
        AmexExpressCheckout = hekVar;
        hek hekVar2 = new hek("ApplePay", 1, "apple_pay");
        ApplePay = hekVar2;
        hek hekVar3 = new hek("GooglePay", 2, "google_pay");
        GooglePay = hekVar3;
        hek hekVar4 = new hek("Masterpass", 3, "master_pass");
        Masterpass = hekVar4;
        hek hekVar5 = new hek("SamsungPay", 4, "samsung_pay");
        SamsungPay = hekVar5;
        hek hekVar6 = new hek("VisaCheckout", 5, "visa_checkout");
        VisaCheckout = hekVar6;
        hek hekVar7 = new hek(HttpConstants.Headers.LINK, 6, ActionType.LINK);
        Link = hekVar7;
        hek[] hekVarArr = {hekVar, hekVar2, hekVar3, hekVar4, hekVar5, hekVar6, hekVar7};
        $VALUES = hekVarArr;
        $ENTRIES = new wg7(hekVarArr);
        Companion = new Object();
    }

    public hek(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static hek valueOf(String str) {
        return (hek) Enum.valueOf(hek.class, str);
    }

    public static hek[] values() {
        return (hek[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}

package com.stripe.android.networking;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.r1e;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType", "", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "", "toString", "()Ljava/lang/String;", ApiConstant.KEY_CODE, "Ljava/lang/String;", "typeName", "Companion", "r1e", "None", "Text", "SingleSelect", "MultiSelect", "Oob", "Html", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentAnalyticsRequestFactory$ThreeDS2UiType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ PaymentAnalyticsRequestFactory$ThreeDS2UiType[] $VALUES;
    public static final r1e Companion;
    public static final PaymentAnalyticsRequestFactory$ThreeDS2UiType Html;
    public static final PaymentAnalyticsRequestFactory$ThreeDS2UiType MultiSelect;
    public static final PaymentAnalyticsRequestFactory$ThreeDS2UiType None;
    public static final PaymentAnalyticsRequestFactory$ThreeDS2UiType Oob;
    public static final PaymentAnalyticsRequestFactory$ThreeDS2UiType SingleSelect;
    public static final PaymentAnalyticsRequestFactory$ThreeDS2UiType Text;
    private final String code;
    private final String typeName;

    /* JADX WARN: Type inference failed for: r0v2, types: [r1e, java.lang.Object] */
    static {
        PaymentAnalyticsRequestFactory$ThreeDS2UiType paymentAnalyticsRequestFactory$ThreeDS2UiType = new PaymentAnalyticsRequestFactory$ThreeDS2UiType("None", 0, null, "none");
        None = paymentAnalyticsRequestFactory$ThreeDS2UiType;
        PaymentAnalyticsRequestFactory$ThreeDS2UiType paymentAnalyticsRequestFactory$ThreeDS2UiType2 = new PaymentAnalyticsRequestFactory$ThreeDS2UiType("Text", 1, "01", "text");
        Text = paymentAnalyticsRequestFactory$ThreeDS2UiType2;
        PaymentAnalyticsRequestFactory$ThreeDS2UiType paymentAnalyticsRequestFactory$ThreeDS2UiType3 = new PaymentAnalyticsRequestFactory$ThreeDS2UiType("SingleSelect", 2, "02", "single_select");
        SingleSelect = paymentAnalyticsRequestFactory$ThreeDS2UiType3;
        PaymentAnalyticsRequestFactory$ThreeDS2UiType paymentAnalyticsRequestFactory$ThreeDS2UiType4 = new PaymentAnalyticsRequestFactory$ThreeDS2UiType("MultiSelect", 3, "03", "multi_select");
        MultiSelect = paymentAnalyticsRequestFactory$ThreeDS2UiType4;
        PaymentAnalyticsRequestFactory$ThreeDS2UiType paymentAnalyticsRequestFactory$ThreeDS2UiType5 = new PaymentAnalyticsRequestFactory$ThreeDS2UiType("Oob", 4, "04", "oob");
        Oob = paymentAnalyticsRequestFactory$ThreeDS2UiType5;
        PaymentAnalyticsRequestFactory$ThreeDS2UiType paymentAnalyticsRequestFactory$ThreeDS2UiType6 = new PaymentAnalyticsRequestFactory$ThreeDS2UiType("Html", 5, "05", "html");
        Html = paymentAnalyticsRequestFactory$ThreeDS2UiType6;
        PaymentAnalyticsRequestFactory$ThreeDS2UiType[] paymentAnalyticsRequestFactory$ThreeDS2UiTypeArr = {paymentAnalyticsRequestFactory$ThreeDS2UiType, paymentAnalyticsRequestFactory$ThreeDS2UiType2, paymentAnalyticsRequestFactory$ThreeDS2UiType3, paymentAnalyticsRequestFactory$ThreeDS2UiType4, paymentAnalyticsRequestFactory$ThreeDS2UiType5, paymentAnalyticsRequestFactory$ThreeDS2UiType6};
        $VALUES = paymentAnalyticsRequestFactory$ThreeDS2UiTypeArr;
        $ENTRIES = new wg7(paymentAnalyticsRequestFactory$ThreeDS2UiTypeArr);
        Companion = new Object();
    }

    public PaymentAnalyticsRequestFactory$ThreeDS2UiType(String str, int i, String str2, String str3) {
        this.code = str2;
        this.typeName = str3;
    }

    public static final /* synthetic */ String a(PaymentAnalyticsRequestFactory$ThreeDS2UiType paymentAnalyticsRequestFactory$ThreeDS2UiType) {
        return paymentAnalyticsRequestFactory$ThreeDS2UiType.code;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static PaymentAnalyticsRequestFactory$ThreeDS2UiType valueOf(String str) {
        return (PaymentAnalyticsRequestFactory$ThreeDS2UiType) Enum.valueOf(PaymentAnalyticsRequestFactory$ThreeDS2UiType.class, str);
    }

    public static PaymentAnalyticsRequestFactory$ThreeDS2UiType[] values() {
        return (PaymentAnalyticsRequestFactory$ThreeDS2UiType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeName;
    }
}

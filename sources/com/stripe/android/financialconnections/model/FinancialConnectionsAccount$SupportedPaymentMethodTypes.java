package com.stripe.android.financialconnections.model;

import defpackage.dxg;
import defpackage.exg;
import defpackage.j28;
import defpackage.k28;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.carousel.ActionType;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = k28.class)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "k28", "j28", "LINK", "US_BANK_ACCOUNT", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsAccount$SupportedPaymentMethodTypes {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ FinancialConnectionsAccount$SupportedPaymentMethodTypes[] $VALUES;
    public static final j28 Companion;
    private final String value;

    @dxg(ActionType.LINK)
    public static final FinancialConnectionsAccount$SupportedPaymentMethodTypes LINK = new FinancialConnectionsAccount$SupportedPaymentMethodTypes("LINK", 0, ActionType.LINK);

    @dxg("us_bank_account")
    public static final FinancialConnectionsAccount$SupportedPaymentMethodTypes US_BANK_ACCOUNT = new FinancialConnectionsAccount$SupportedPaymentMethodTypes("US_BANK_ACCOUNT", 1, "us_bank_account");
    public static final FinancialConnectionsAccount$SupportedPaymentMethodTypes UNKNOWN = new FinancialConnectionsAccount$SupportedPaymentMethodTypes("UNKNOWN", 2, "unknown");

    private static final /* synthetic */ FinancialConnectionsAccount$SupportedPaymentMethodTypes[] $values() {
        return new FinancialConnectionsAccount$SupportedPaymentMethodTypes[]{LINK, US_BANK_ACCOUNT, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [j28, java.lang.Object] */
    static {
        FinancialConnectionsAccount$SupportedPaymentMethodTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
    }

    private FinancialConnectionsAccount$SupportedPaymentMethodTypes(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static FinancialConnectionsAccount$SupportedPaymentMethodTypes valueOf(String str) {
        return (FinancialConnectionsAccount$SupportedPaymentMethodTypes) Enum.valueOf(FinancialConnectionsAccount$SupportedPaymentMethodTypes.class, str);
    }

    public static FinancialConnectionsAccount$SupportedPaymentMethodTypes[] values() {
        return (FinancialConnectionsAccount$SupportedPaymentMethodTypes[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

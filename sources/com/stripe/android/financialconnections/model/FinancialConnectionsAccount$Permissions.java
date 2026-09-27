package com.stripe.android.financialconnections.model;

import defpackage.d28;
import defpackage.dxg;
import defpackage.e28;
import defpackage.exg;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = e28.class)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "e28", "d28", "BALANCES", "OWNERSHIP", "PAYMENT_METHOD", "TRANSACTIONS", "ACCOUNT_NUMBERS", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsAccount$Permissions {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ FinancialConnectionsAccount$Permissions[] $VALUES;
    public static final d28 Companion;
    private final String value;

    @dxg("balances")
    public static final FinancialConnectionsAccount$Permissions BALANCES = new FinancialConnectionsAccount$Permissions("BALANCES", 0, "balances");

    @dxg("ownership")
    public static final FinancialConnectionsAccount$Permissions OWNERSHIP = new FinancialConnectionsAccount$Permissions("OWNERSHIP", 1, "ownership");

    @dxg("payment_method")
    public static final FinancialConnectionsAccount$Permissions PAYMENT_METHOD = new FinancialConnectionsAccount$Permissions("PAYMENT_METHOD", 2, "payment_method");

    @dxg("transactions")
    public static final FinancialConnectionsAccount$Permissions TRANSACTIONS = new FinancialConnectionsAccount$Permissions("TRANSACTIONS", 3, "transactions");

    @dxg("account_numbers")
    public static final FinancialConnectionsAccount$Permissions ACCOUNT_NUMBERS = new FinancialConnectionsAccount$Permissions("ACCOUNT_NUMBERS", 4, "account_numbers");
    public static final FinancialConnectionsAccount$Permissions UNKNOWN = new FinancialConnectionsAccount$Permissions("UNKNOWN", 5, "unknown");

    private static final /* synthetic */ FinancialConnectionsAccount$Permissions[] $values() {
        return new FinancialConnectionsAccount$Permissions[]{BALANCES, OWNERSHIP, PAYMENT_METHOD, TRANSACTIONS, ACCOUNT_NUMBERS, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, d28] */
    static {
        FinancialConnectionsAccount$Permissions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
    }

    private FinancialConnectionsAccount$Permissions(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static FinancialConnectionsAccount$Permissions valueOf(String str) {
        return (FinancialConnectionsAccount$Permissions) Enum.valueOf(FinancialConnectionsAccount$Permissions.class, str);
    }

    public static FinancialConnectionsAccount$Permissions[] values() {
        return (FinancialConnectionsAccount$Permissions[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

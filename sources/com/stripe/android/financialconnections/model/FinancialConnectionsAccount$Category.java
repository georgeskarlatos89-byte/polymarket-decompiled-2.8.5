package com.stripe.android.financialconnections.model;

import defpackage.a28;
import defpackage.b28;
import defpackage.dxg;
import defpackage.exg;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = b28.class)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b28", "a28", "CASH", "CREDIT", "INVESTMENT", "OTHER", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsAccount$Category {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ FinancialConnectionsAccount$Category[] $VALUES;
    public static final a28 Companion;
    private final String value;

    @dxg("cash")
    public static final FinancialConnectionsAccount$Category CASH = new FinancialConnectionsAccount$Category("CASH", 0, "cash");

    @dxg("credit")
    public static final FinancialConnectionsAccount$Category CREDIT = new FinancialConnectionsAccount$Category("CREDIT", 1, "credit");

    @dxg("investment")
    public static final FinancialConnectionsAccount$Category INVESTMENT = new FinancialConnectionsAccount$Category("INVESTMENT", 2, "investment");

    @dxg("other")
    public static final FinancialConnectionsAccount$Category OTHER = new FinancialConnectionsAccount$Category("OTHER", 3, "other");
    public static final FinancialConnectionsAccount$Category UNKNOWN = new FinancialConnectionsAccount$Category("UNKNOWN", 4, "unknown");

    private static final /* synthetic */ FinancialConnectionsAccount$Category[] $values() {
        return new FinancialConnectionsAccount$Category[]{CASH, CREDIT, INVESTMENT, OTHER, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [a28, java.lang.Object] */
    static {
        FinancialConnectionsAccount$Category[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
    }

    private FinancialConnectionsAccount$Category(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static FinancialConnectionsAccount$Category valueOf(String str) {
        return (FinancialConnectionsAccount$Category) Enum.valueOf(FinancialConnectionsAccount$Category.class, str);
    }

    public static FinancialConnectionsAccount$Category[] values() {
        return (FinancialConnectionsAccount$Category[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

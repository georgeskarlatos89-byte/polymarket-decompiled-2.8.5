package com.stripe.android.financialconnections.model;

import defpackage.dxg;
import defpackage.exg;
import defpackage.h28;
import defpackage.i28;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = i28.class)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "i28", "h28", "CHECKING", "CREDIT_CARD", "LINE_OF_CREDIT", "MORTGAGE", "OTHER", "SAVINGS", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsAccount$Subcategory {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ FinancialConnectionsAccount$Subcategory[] $VALUES;
    public static final h28 Companion;
    private final String value;

    @dxg("checking")
    public static final FinancialConnectionsAccount$Subcategory CHECKING = new FinancialConnectionsAccount$Subcategory("CHECKING", 0, "checking");

    @dxg("credit_card")
    public static final FinancialConnectionsAccount$Subcategory CREDIT_CARD = new FinancialConnectionsAccount$Subcategory("CREDIT_CARD", 1, "credit_card");

    @dxg("line_of_credit")
    public static final FinancialConnectionsAccount$Subcategory LINE_OF_CREDIT = new FinancialConnectionsAccount$Subcategory("LINE_OF_CREDIT", 2, "line_of_credit");

    @dxg("mortgage")
    public static final FinancialConnectionsAccount$Subcategory MORTGAGE = new FinancialConnectionsAccount$Subcategory("MORTGAGE", 3, "mortgage");

    @dxg("other")
    public static final FinancialConnectionsAccount$Subcategory OTHER = new FinancialConnectionsAccount$Subcategory("OTHER", 4, "other");

    @dxg("savings")
    public static final FinancialConnectionsAccount$Subcategory SAVINGS = new FinancialConnectionsAccount$Subcategory("SAVINGS", 5, "savings");
    public static final FinancialConnectionsAccount$Subcategory UNKNOWN = new FinancialConnectionsAccount$Subcategory("UNKNOWN", 6, "unknown");

    private static final /* synthetic */ FinancialConnectionsAccount$Subcategory[] $values() {
        return new FinancialConnectionsAccount$Subcategory[]{CHECKING, CREDIT_CARD, LINE_OF_CREDIT, MORTGAGE, OTHER, SAVINGS, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, h28] */
    static {
        FinancialConnectionsAccount$Subcategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
    }

    private FinancialConnectionsAccount$Subcategory(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static FinancialConnectionsAccount$Subcategory valueOf(String str) {
        return (FinancialConnectionsAccount$Subcategory) Enum.valueOf(FinancialConnectionsAccount$Subcategory.class, str);
    }

    public static FinancialConnectionsAccount$Subcategory[] values() {
        return (FinancialConnectionsAccount$Subcategory[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

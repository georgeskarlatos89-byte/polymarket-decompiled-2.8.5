package com.stripe.android.financialconnections.model;

import defpackage.dxg;
import defpackage.exg;
import defpackage.n38;
import defpackage.o38;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = o38.class)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "o38", "n38", "CUSTOM_MANUAL_ENTRY", "OTHER", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSession$StatusDetails$Cancelled$Reason {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ FinancialConnectionsSession$StatusDetails$Cancelled$Reason[] $VALUES;
    public static final n38 Companion;
    private final String value;

    @dxg("custom_manual_entry")
    public static final FinancialConnectionsSession$StatusDetails$Cancelled$Reason CUSTOM_MANUAL_ENTRY = new FinancialConnectionsSession$StatusDetails$Cancelled$Reason("CUSTOM_MANUAL_ENTRY", 0, "custom_manual_entry");

    @dxg("other")
    public static final FinancialConnectionsSession$StatusDetails$Cancelled$Reason OTHER = new FinancialConnectionsSession$StatusDetails$Cancelled$Reason("OTHER", 1, "other");

    @dxg("unknown")
    public static final FinancialConnectionsSession$StatusDetails$Cancelled$Reason UNKNOWN = new FinancialConnectionsSession$StatusDetails$Cancelled$Reason("UNKNOWN", 2, "unknown");

    private static final /* synthetic */ FinancialConnectionsSession$StatusDetails$Cancelled$Reason[] $values() {
        return new FinancialConnectionsSession$StatusDetails$Cancelled$Reason[]{CUSTOM_MANUAL_ENTRY, OTHER, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [n38, java.lang.Object] */
    static {
        FinancialConnectionsSession$StatusDetails$Cancelled$Reason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
    }

    private FinancialConnectionsSession$StatusDetails$Cancelled$Reason(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static FinancialConnectionsSession$StatusDetails$Cancelled$Reason valueOf(String str) {
        return (FinancialConnectionsSession$StatusDetails$Cancelled$Reason) Enum.valueOf(FinancialConnectionsSession$StatusDetails$Cancelled$Reason.class, str);
    }

    public static FinancialConnectionsSession$StatusDetails$Cancelled$Reason[] values() {
        return (FinancialConnectionsSession$StatusDetails$Cancelled$Reason[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

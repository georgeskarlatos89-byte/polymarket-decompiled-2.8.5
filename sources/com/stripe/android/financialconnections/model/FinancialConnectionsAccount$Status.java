package com.stripe.android.financialconnections.model;

import defpackage.dxg;
import defpackage.exg;
import defpackage.f28;
import defpackage.g28;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = g28.class)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "g28", "f28", "ACTIVE", "DISCONNECTED", "INACTIVE", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsAccount$Status {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ FinancialConnectionsAccount$Status[] $VALUES;
    public static final f28 Companion;
    private final String value;

    @dxg("active")
    public static final FinancialConnectionsAccount$Status ACTIVE = new FinancialConnectionsAccount$Status("ACTIVE", 0, "active");

    @dxg("disconnected")
    public static final FinancialConnectionsAccount$Status DISCONNECTED = new FinancialConnectionsAccount$Status("DISCONNECTED", 1, "disconnected");

    @dxg("inactive")
    public static final FinancialConnectionsAccount$Status INACTIVE = new FinancialConnectionsAccount$Status("INACTIVE", 2, "inactive");
    public static final FinancialConnectionsAccount$Status UNKNOWN = new FinancialConnectionsAccount$Status("UNKNOWN", 3, "unknown");

    private static final /* synthetic */ FinancialConnectionsAccount$Status[] $values() {
        return new FinancialConnectionsAccount$Status[]{ACTIVE, DISCONNECTED, INACTIVE, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, f28] */
    static {
        FinancialConnectionsAccount$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
    }

    private FinancialConnectionsAccount$Status(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static FinancialConnectionsAccount$Status valueOf(String str) {
        return (FinancialConnectionsAccount$Status) Enum.valueOf(FinancialConnectionsAccount$Status.class, str);
    }

    public static FinancialConnectionsAccount$Status[] values() {
        return (FinancialConnectionsAccount$Status[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

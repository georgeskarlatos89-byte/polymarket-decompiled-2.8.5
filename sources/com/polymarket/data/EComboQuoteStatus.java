package com.polymarket.data;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001cB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u001d"}, d2 = {"Lcom/polymarket/data/EComboQuoteStatus;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "pending", "accepted", "deleted", "expired", "passed", "doneAway", "pendingRisk", "rejected", "pendingEndTrade", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EComboQuoteStatus implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EComboQuoteStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final EComboQuoteStatus pending = new EComboQuoteStatus("pending", 0, "QUOTE_STATUS_PENDING", null, 2, null);
    public static final EComboQuoteStatus accepted = new EComboQuoteStatus("accepted", 1, "QUOTE_STATUS_ACCEPTED", null, 2, null);
    public static final EComboQuoteStatus deleted = new EComboQuoteStatus("deleted", 2, "QUOTE_STATUS_DELETED", null, 2, null);
    public static final EComboQuoteStatus expired = new EComboQuoteStatus("expired", 3, "QUOTE_STATUS_EXPIRED", null, 2, null);
    public static final EComboQuoteStatus passed = new EComboQuoteStatus("passed", 4, "QUOTE_STATUS_PASSED", null, 2, null);
    public static final EComboQuoteStatus doneAway = new EComboQuoteStatus("doneAway", 5, "QUOTE_STATUS_DONE_AWAY", null, 2, null);
    public static final EComboQuoteStatus pendingRisk = new EComboQuoteStatus("pendingRisk", 6, "QUOTE_STATUS_PENDING_RISK", null, 2, null);
    public static final EComboQuoteStatus rejected = new EComboQuoteStatus("rejected", 7, "QUOTE_STATUS_REJECTED", null, 2, null);
    public static final EComboQuoteStatus pendingEndTrade = new EComboQuoteStatus("pendingEndTrade", 8, "QUOTE_STATUS_PENDING_END_TRADE", null, 2, null);
    public static final EComboQuoteStatus unknown = new EComboQuoteStatus("unknown", 9, "QUOTE_STATUS_UNSPECIFIED", null, 2, null);

    private static final /* synthetic */ EComboQuoteStatus[] $values() {
        return new EComboQuoteStatus[]{pending, accepted, deleted, expired, passed, doneAway, pendingRisk, rejected, pendingEndTrade, unknown};
    }

    static {
        EComboQuoteStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EComboQuoteStatus(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static EComboQuoteStatus valueOf(String str) {
        return (EComboQuoteStatus) Enum.valueOf(EComboQuoteStatus.class, str);
    }

    public static EComboQuoteStatus[] values() {
        return (EComboQuoteStatus[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EComboQuoteStatus$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EComboQuoteStatus;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EComboQuoteStatus init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1185151647:
                    if (!rawValue.equals("QUOTE_STATUS_PENDING_RISK")) {
                        return null;
                    }
                    return EComboQuoteStatus.pendingRisk;
                case -1103712261:
                    if (rawValue.equals("QUOTE_STATUS_EXPIRED")) {
                        return EComboQuoteStatus.expired;
                    }
                    return null;
                case -477064595:
                    if (rawValue.equals("QUOTE_STATUS_PENDING")) {
                        return EComboQuoteStatus.pending;
                    }
                    return null;
                case -70274703:
                    if (rawValue.equals("QUOTE_STATUS_ACCEPTED")) {
                        return EComboQuoteStatus.accepted;
                    }
                    return null;
                case 130494733:
                    if (rawValue.equals("QUOTE_STATUS_UNSPECIFIED")) {
                        return EComboQuoteStatus.unknown;
                    }
                    return null;
                case 812363962:
                    if (rawValue.equals("QUOTE_STATUS_PASSED")) {
                        return EComboQuoteStatus.passed;
                    }
                    return null;
                case 1467754056:
                    if (rawValue.equals("QUOTE_STATUS_REJECTED")) {
                        return EComboQuoteStatus.rejected;
                    }
                    return null;
                case 1613852929:
                    if (rawValue.equals("QUOTE_STATUS_DONE_AWAY")) {
                        return EComboQuoteStatus.doneAway;
                    }
                    return null;
                case 1755986159:
                    if (rawValue.equals("QUOTE_STATUS_DELETED")) {
                        return EComboQuoteStatus.deleted;
                    }
                    return null;
                case 2067454318:
                    if (rawValue.equals("QUOTE_STATUS_PENDING_END_TRADE")) {
                        return EComboQuoteStatus.pendingEndTrade;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    private EComboQuoteStatus(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}

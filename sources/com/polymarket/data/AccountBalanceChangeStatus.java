package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001cB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0082 J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001d"}, d2 = {"Lcom/polymarket/data/AccountBalanceChangeStatus;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "pending", "processing", MetricTracker.Action.COMPLETED, "partiallyRefunded", "rejected", "unknown", "displayText", "getDisplayText", "Swift_displayText", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccountBalanceChangeStatus implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ AccountBalanceChangeStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final AccountBalanceChangeStatus pending = new AccountBalanceChangeStatus("pending", 0, "ACCOUNT_BALANCE_CHANGE_STATUS_PENDING", null, 2, null);
    public static final AccountBalanceChangeStatus processing = new AccountBalanceChangeStatus("processing", 1, "ACCOUNT_BALANCE_CHANGE_STATUS_PROCESSING", null, 2, null);
    public static final AccountBalanceChangeStatus completed = new AccountBalanceChangeStatus(MetricTracker.Action.COMPLETED, 2, "ACCOUNT_BALANCE_CHANGE_STATUS_COMPLETED", null, 2, null);
    public static final AccountBalanceChangeStatus partiallyRefunded = new AccountBalanceChangeStatus("partiallyRefunded", 3, "ACCOUNT_BALANCE_CHANGE_STATUS_PARTIALLY_REFUNDED", null, 2, null);
    public static final AccountBalanceChangeStatus rejected = new AccountBalanceChangeStatus("rejected", 4, "ACCOUNT_BALANCE_CHANGE_STATUS_REJECTED", null, 2, null);
    public static final AccountBalanceChangeStatus unknown = new AccountBalanceChangeStatus("unknown", 5, "UNKNOWN", null, 2, null);

    private static final /* synthetic */ AccountBalanceChangeStatus[] $values() {
        return new AccountBalanceChangeStatus[]{pending, processing, completed, partiallyRefunded, rejected, unknown};
    }

    static {
        AccountBalanceChangeStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ AccountBalanceChangeStatus(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native String Swift_displayText(String name);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static AccountBalanceChangeStatus valueOf(String str) {
        return (AccountBalanceChangeStatus) Enum.valueOf(AccountBalanceChangeStatus.class, str);
    }

    public static AccountBalanceChangeStatus[] values() {
        return (AccountBalanceChangeStatus[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getDisplayText() {
        return Swift_displayText(name());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/AccountBalanceChangeStatus$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/AccountBalanceChangeStatus;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccountBalanceChangeStatus init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1504245519:
                    if (!rawValue.equals("ACCOUNT_BALANCE_CHANGE_STATUS_REJECTED")) {
                        return null;
                    }
                    return AccountBalanceChangeStatus.rejected;
                case -1399140666:
                    if (rawValue.equals("ACCOUNT_BALANCE_CHANGE_STATUS_PROCESSING")) {
                        return AccountBalanceChangeStatus.processing;
                    }
                    return null;
                case 433141802:
                    if (rawValue.equals("UNKNOWN")) {
                        return AccountBalanceChangeStatus.unknown;
                    }
                    return null;
                case 535443108:
                    if (rawValue.equals("ACCOUNT_BALANCE_CHANGE_STATUS_PENDING")) {
                        return AccountBalanceChangeStatus.pending;
                    }
                    return null;
                case 653523259:
                    if (rawValue.equals("ACCOUNT_BALANCE_CHANGE_STATUS_PARTIALLY_REFUNDED")) {
                        return AccountBalanceChangeStatus.partiallyRefunded;
                    }
                    return null;
                case 893620248:
                    if (rawValue.equals("ACCOUNT_BALANCE_CHANGE_STATUS_COMPLETED")) {
                        return AccountBalanceChangeStatus.completed;
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

    private AccountBalanceChangeStatus(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}

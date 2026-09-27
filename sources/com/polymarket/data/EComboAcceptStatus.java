package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001bB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0082 J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001c"}, d2 = {"Lcom/polymarket/data/EComboAcceptStatus;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "filled", "pendingConfirmation", "rejected", "expired", "unknown", "analyticsOutcome", "getAnalyticsOutcome", "Swift_analyticsOutcome", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EComboAcceptStatus implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EComboAcceptStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final EComboAcceptStatus filled = new EComboAcceptStatus("filled", 0, "ACCEPT_STATUS_FILLED", null, 2, null);
    public static final EComboAcceptStatus pendingConfirmation = new EComboAcceptStatus("pendingConfirmation", 1, "ACCEPT_STATUS_PENDING_CONFIRMATION", null, 2, null);
    public static final EComboAcceptStatus rejected = new EComboAcceptStatus("rejected", 2, "ACCEPT_STATUS_REJECTED", null, 2, null);
    public static final EComboAcceptStatus expired = new EComboAcceptStatus("expired", 3, "ACCEPT_STATUS_EXPIRED", null, 2, null);
    public static final EComboAcceptStatus unknown = new EComboAcceptStatus("unknown", 4, "ACCEPT_STATUS_UNSPECIFIED", null, 2, null);

    private static final /* synthetic */ EComboAcceptStatus[] $values() {
        return new EComboAcceptStatus[]{filled, pendingConfirmation, rejected, expired, unknown};
    }

    static {
        EComboAcceptStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EComboAcceptStatus(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native String Swift_analyticsOutcome(String name);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static EComboAcceptStatus valueOf(String str) {
        return (EComboAcceptStatus) Enum.valueOf(EComboAcceptStatus.class, str);
    }

    public static EComboAcceptStatus[] values() {
        return (EComboAcceptStatus[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getAnalyticsOutcome() {
        return Swift_analyticsOutcome(name());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EComboAcceptStatus$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EComboAcceptStatus;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EComboAcceptStatus init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1219062047:
                    if (!rawValue.equals("ACCEPT_STATUS_UNSPECIFIED")) {
                        return null;
                    }
                    return EComboAcceptStatus.unknown;
                case 392830927:
                    if (rawValue.equals("ACCEPT_STATUS_EXPIRED")) {
                        return EComboAcceptStatus.expired;
                    }
                    return null;
                case 615952628:
                    if (rawValue.equals("ACCEPT_STATUS_REJECTED")) {
                        return EComboAcceptStatus.rejected;
                    }
                    return null;
                case 1081888115:
                    if (rawValue.equals("ACCEPT_STATUS_PENDING_CONFIRMATION")) {
                        return EComboAcceptStatus.pendingConfirmation;
                    }
                    return null;
                case 1966994264:
                    if (rawValue.equals("ACCEPT_STATUS_FILLED")) {
                        return EComboAcceptStatus.filled;
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

    private EComboAcceptStatus(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}

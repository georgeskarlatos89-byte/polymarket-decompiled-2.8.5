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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001eB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0002H\u0082 J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001f"}, d2 = {"Lcom/polymarket/data/APIMarketStatus;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "marketOpen", MetricTracker.Action.CLOSED, "resolving", "resolved", "halted", "unknown", "allowsBuying", "", "getAllowsBuying", "()Z", "Swift_allowsBuying", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class APIMarketStatus implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ APIMarketStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final APIMarketStatus marketOpen = new APIMarketStatus("marketOpen", 0, "MARKET_STATUS_OPEN", null, 2, null);
    public static final APIMarketStatus closed = new APIMarketStatus(MetricTracker.Action.CLOSED, 1, "MARKET_STATUS_CLOSED", null, 2, null);
    public static final APIMarketStatus resolving = new APIMarketStatus("resolving", 2, "MARKET_STATUS_RESOLVING", null, 2, null);
    public static final APIMarketStatus resolved = new APIMarketStatus("resolved", 3, "MARKET_STATUS_RESOLVED", null, 2, null);
    public static final APIMarketStatus halted = new APIMarketStatus("halted", 4, "MARKET_STATUS_HALTED", null, 2, null);
    public static final APIMarketStatus unknown = new APIMarketStatus("unknown", 5, "unknown", null, 2, null);

    private static final /* synthetic */ APIMarketStatus[] $values() {
        return new APIMarketStatus[]{marketOpen, closed, resolving, resolved, halted, unknown};
    }

    static {
        APIMarketStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ APIMarketStatus(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native boolean Swift_allowsBuying(String name);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static APIMarketStatus valueOf(String str) {
        return (APIMarketStatus) Enum.valueOf(APIMarketStatus.class, str);
    }

    public static APIMarketStatus[] values() {
        return (APIMarketStatus[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getAllowsBuying() {
        return Swift_allowsBuying(name());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/APIMarketStatus$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/APIMarketStatus;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final APIMarketStatus init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -284840886:
                    if (!rawValue.equals("unknown")) {
                        return null;
                    }
                    return APIMarketStatus.unknown;
                case 561952031:
                    if (rawValue.equals("MARKET_STATUS_RESOLVING")) {
                        return APIMarketStatus.resolving;
                    }
                    return null;
                case 1542148002:
                    if (rawValue.equals("MARKET_STATUS_RESOLVED")) {
                        return APIMarketStatus.resolved;
                    }
                    return null;
                case 1741642646:
                    if (rawValue.equals("MARKET_STATUS_CLOSED")) {
                        return APIMarketStatus.closed;
                    }
                    return null;
                case 1874541258:
                    if (rawValue.equals("MARKET_STATUS_HALTED")) {
                        return APIMarketStatus.halted;
                    }
                    return null;
                case 2058036980:
                    if (rawValue.equals("MARKET_STATUS_OPEN")) {
                        return APIMarketStatus.marketOpen;
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

    private APIMarketStatus(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}

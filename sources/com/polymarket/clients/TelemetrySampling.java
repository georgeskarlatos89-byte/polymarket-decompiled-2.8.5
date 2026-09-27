package com.polymarket.clients;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/clients/TelemetrySampling;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TelemetrySampling {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ TelemetrySampling[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ TelemetrySampling[] $values() {
        return new TelemetrySampling[0];
    }

    static {
        TelemetrySampling[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private TelemetrySampling(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static TelemetrySampling valueOf(String str) {
        return (TelemetrySampling) Enum.valueOf(TelemetrySampling.class, str);
    }

    public static TelemetrySampling[] values() {
        return (TelemetrySampling[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u0006\u0010\u000b\u001a\u00020\u0005J\t\u0010\f\u001a\u00020\u0005H\u0082 J\u0006\u0010\r\u001a\u00020\u0005J\t\u0010\u000e\u001a\u00020\u0005H\u0082 ¨\u0006\u000f"}, d2 = {"Lcom/polymarket/clients/TelemetrySampling$Companion;", "", "<init>", "()V", "tracesSampleRate", "", "telemetryEnvironment", "", "Swift_Companion_tracesSampleRate_0", "networkSpanTraceKeepRate", "Swift_Companion_networkSpanTraceKeepRate_1", "profilingSessionSampleRate", "Swift_Companion_profilingSessionSampleRate_2", "socketPingSampleRate", "Swift_Companion_socketPingSampleRate_3", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native double Swift_Companion_networkSpanTraceKeepRate_1(String telemetryEnvironment);

        private final native double Swift_Companion_profilingSessionSampleRate_2();

        private final native double Swift_Companion_socketPingSampleRate_3();

        private final native double Swift_Companion_tracesSampleRate_0(String telemetryEnvironment);

        public final double networkSpanTraceKeepRate(String telemetryEnvironment) {
            telemetryEnvironment.getClass();
            return Swift_Companion_networkSpanTraceKeepRate_1(telemetryEnvironment);
        }

        public final double profilingSessionSampleRate() {
            return Swift_Companion_profilingSessionSampleRate_2();
        }

        public final double socketPingSampleRate() {
            return Swift_Companion_socketPingSampleRate_3();
        }

        public final double tracesSampleRate(String telemetryEnvironment) {
            telemetryEnvironment.getClass();
            return Swift_Companion_tracesSampleRate_0(telemetryEnvironment);
        }

        private Companion() {
        }
    }
}

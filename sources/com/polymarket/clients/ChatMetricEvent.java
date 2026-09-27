package com.polymarket.clients;

import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/clients/ChatMetricEvent;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "TimingCase", "ConnectionStateChangeCase", "MessageSendFailedCase", "Companion", "Lcom/polymarket/clients/ChatMetricEvent$ConnectionStateChangeCase;", "Lcom/polymarket/clients/ChatMetricEvent$MessageSendFailedCase;", "Lcom/polymarket/clients/ChatMetricEvent$TimingCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ChatMetricEvent implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ChatMetricEvent$ConnectionStateChangeCase;", "Lcom/polymarket/clients/ChatMetricEvent;", "associated0", "Lcom/polymarket/clients/ChatConnectionState;", "associated1", "<init>", "(Lcom/polymarket/clients/ChatConnectionState;Lcom/polymarket/clients/ChatConnectionState;)V", "getAssociated0", "()Lcom/polymarket/clients/ChatConnectionState;", "getAssociated1", TicketDetailDestinationKt.LAUNCHED_FROM, "getFrom", "to", "getTo", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ConnectionStateChangeCase extends ChatMetricEvent {
        private final ChatConnectionState associated0;
        private final ChatConnectionState associated1;
        private final ChatConnectionState from;
        private final ChatConnectionState to;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectionStateChangeCase(ChatConnectionState chatConnectionState, ChatConnectionState chatConnectionState2) {
            super(null);
            chatConnectionState.getClass();
            chatConnectionState2.getClass();
            this.associated0 = chatConnectionState;
            this.associated1 = chatConnectionState2;
            this.from = chatConnectionState;
            this.to = chatConnectionState2;
        }

        public final ChatConnectionState getAssociated0() {
            return this.associated0;
        }

        public final ChatConnectionState getAssociated1() {
            return this.associated1;
        }

        public final ChatConnectionState getFrom() {
            return this.from;
        }

        public final ChatConnectionState getTo() {
            return this.to;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ChatMetricEvent$MessageSendFailedCase;", "Lcom/polymarket/clients/ChatMetricEvent;", "associated0", "", "associated1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "channelId", "getChannelId", "messageId", "getMessageId", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MessageSendFailedCase extends ChatMetricEvent {
        private final String associated0;
        private final String associated1;
        private final String channelId;
        private final String messageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageSendFailedCase(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.associated0 = str;
            this.associated1 = str2;
            this.channelId = str;
            this.messageId = str2;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getAssociated1() {
            return this.associated1;
        }

        public final String getChannelId() {
            return this.channelId;
        }

        public final String getMessageId() {
            return this.messageId;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/polymarket/clients/ChatMetricEvent$TimingCase;", "Lcom/polymarket/clients/ChatMetricEvent;", "associated0", "", "associated1", "", "associated2", "", "associated3", "", "<init>", "(Ljava/lang/String;DZLjava/util/Map;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()D", "getAssociated2", "()Z", "getAssociated3", "()Ljava/util/Map;", "op", "getOp", "durationMs", "getDurationMs", "success", "getSuccess", "attributes", "getAttributes", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TimingCase extends ChatMetricEvent {
        private final String associated0;
        private final double associated1;
        private final boolean associated2;
        private final Map<String, String> associated3;
        private final Map<String, String> attributes;
        private final double durationMs;
        private final String op;
        private final boolean success;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimingCase(String str, double d, boolean z, Map<String, String> map) {
            super(null);
            str.getClass();
            map.getClass();
            this.associated0 = str;
            this.associated1 = d;
            this.associated2 = z;
            this.associated3 = map;
            this.op = str;
            this.durationMs = d;
            this.success = z;
            this.attributes = map;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final double getAssociated1() {
            return this.associated1;
        }

        public final boolean getAssociated2() {
            return this.associated2;
        }

        public final Map<String, String> getAssociated3() {
            return this.associated3;
        }

        public final Map<String, String> getAttributes() {
            return this.attributes;
        }

        public final double getDurationMs() {
            return this.durationMs;
        }

        public final String getOp() {
            return this.op;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }

    public /* synthetic */ ChatMetricEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\rJ\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007¨\u0006\u0015"}, d2 = {"Lcom/polymarket/clients/ChatMetricEvent$Companion;", "", "<init>", "()V", OpsMetricTracker.TIMING_TYPE, "Lcom/polymarket/clients/ChatMetricEvent;", "op", "", "durationMs", "", "success", "", "attributes", "", "connectionStateChange", TicketDetailDestinationKt.LAUNCHED_FROM, "Lcom/polymarket/clients/ChatConnectionState;", "to", "messageSendFailed", "channelId", "messageId", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChatMetricEvent connectionStateChange(ChatConnectionState from, ChatConnectionState to) {
            from.getClass();
            to.getClass();
            return new ConnectionStateChangeCase(from, to);
        }

        public final ChatMetricEvent messageSendFailed(String channelId, String messageId) {
            channelId.getClass();
            messageId.getClass();
            return new MessageSendFailedCase(channelId, messageId);
        }

        public final ChatMetricEvent timing(String op, double durationMs, boolean success, Map<String, String> attributes) {
            op.getClass();
            attributes.getClass();
            return new TimingCase(op, durationMs, success, attributes);
        }

        private Companion() {
        }
    }

    private ChatMetricEvent() {
    }
}

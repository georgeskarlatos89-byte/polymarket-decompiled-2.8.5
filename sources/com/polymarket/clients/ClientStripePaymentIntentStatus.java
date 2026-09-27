package com.polymarket.clients;

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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001aB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001b"}, d2 = {"Lcom/polymarket/clients/ClientStripePaymentIntentStatus;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "succeeded", "processing", "requiresCapture", "requiresAction", "requiresConfirmation", "requiresPaymentMethod", "canceled", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientStripePaymentIntentStatus implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ClientStripePaymentIntentStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ClientStripePaymentIntentStatus succeeded = new ClientStripePaymentIntentStatus("succeeded", 0, "succeeded", null, 2, null);
    public static final ClientStripePaymentIntentStatus processing = new ClientStripePaymentIntentStatus("processing", 1, "processing", null, 2, null);
    public static final ClientStripePaymentIntentStatus requiresCapture = new ClientStripePaymentIntentStatus("requiresCapture", 2, "requiresCapture", null, 2, null);
    public static final ClientStripePaymentIntentStatus requiresAction = new ClientStripePaymentIntentStatus("requiresAction", 3, "requiresAction", null, 2, null);
    public static final ClientStripePaymentIntentStatus requiresConfirmation = new ClientStripePaymentIntentStatus("requiresConfirmation", 4, "requiresConfirmation", null, 2, null);
    public static final ClientStripePaymentIntentStatus requiresPaymentMethod = new ClientStripePaymentIntentStatus("requiresPaymentMethod", 5, "requiresPaymentMethod", null, 2, null);
    public static final ClientStripePaymentIntentStatus canceled = new ClientStripePaymentIntentStatus("canceled", 6, "canceled", null, 2, null);
    public static final ClientStripePaymentIntentStatus unknown = new ClientStripePaymentIntentStatus("unknown", 7, "unknown", null, 2, null);

    private static final /* synthetic */ ClientStripePaymentIntentStatus[] $values() {
        return new ClientStripePaymentIntentStatus[]{succeeded, processing, requiresCapture, requiresAction, requiresConfirmation, requiresPaymentMethod, canceled, unknown};
    }

    static {
        ClientStripePaymentIntentStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ClientStripePaymentIntentStatus(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ClientStripePaymentIntentStatus valueOf(String str) {
        return (ClientStripePaymentIntentStatus) Enum.valueOf(ClientStripePaymentIntentStatus.class, str);
    }

    public static ClientStripePaymentIntentStatus[] values() {
        return (ClientStripePaymentIntentStatus[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientStripePaymentIntentStatus$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/clients/ClientStripePaymentIntentStatus;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientStripePaymentIntentStatus init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1970683527:
                    if (!rawValue.equals("requiresPaymentMethod")) {
                        return null;
                    }
                    return ClientStripePaymentIntentStatus.requiresPaymentMethod;
                case -1932158076:
                    if (rawValue.equals("requiresAction")) {
                        return ClientStripePaymentIntentStatus.requiresAction;
                    }
                    return null;
                case -284840886:
                    if (rawValue.equals("unknown")) {
                        return ClientStripePaymentIntentStatus.unknown;
                    }
                    return null;
                case -123173735:
                    if (rawValue.equals("canceled")) {
                        return ClientStripePaymentIntentStatus.canceled;
                    }
                    return null;
                case 422194963:
                    if (rawValue.equals("processing")) {
                        return ClientStripePaymentIntentStatus.processing;
                    }
                    return null;
                case 945734241:
                    if (rawValue.equals("succeeded")) {
                        return ClientStripePaymentIntentStatus.succeeded;
                    }
                    return null;
                case 1025570563:
                    if (rawValue.equals("requiresConfirmation")) {
                        return ClientStripePaymentIntentStatus.requiresConfirmation;
                    }
                    return null;
                case 1947030456:
                    if (rawValue.equals("requiresCapture")) {
                        return ClientStripePaymentIntentStatus.requiresCapture;
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

    private ClientStripePaymentIntentStatus(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}

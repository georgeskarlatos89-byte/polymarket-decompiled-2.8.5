package com.polymarket.clients;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/polymarket/clients/ClientBankLinkingError;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "CancelledCase", "InvalidTokenCase", "SdkErrorCase", "NetworkErrorCase", "UnknownCase", "Companion", "Lcom/polymarket/clients/ClientBankLinkingError$CancelledCase;", "Lcom/polymarket/clients/ClientBankLinkingError$InvalidTokenCase;", "Lcom/polymarket/clients/ClientBankLinkingError$NetworkErrorCase;", "Lcom/polymarket/clients/ClientBankLinkingError$SdkErrorCase;", "Lcom/polymarket/clients/ClientBankLinkingError$UnknownCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClientBankLinkingError implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ClientBankLinkingError cancelled = new CancelledCase();
    private static final ClientBankLinkingError invalidToken = new InvalidTokenCase();
    private static final ClientBankLinkingError networkError = new NetworkErrorCase();
    private static final ClientBankLinkingError unknown = new UnknownCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientBankLinkingError$CancelledCase;", "Lcom/polymarket/clients/ClientBankLinkingError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CancelledCase extends ClientBankLinkingError {
        public CancelledCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientBankLinkingError$InvalidTokenCase;", "Lcom/polymarket/clients/ClientBankLinkingError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InvalidTokenCase extends ClientBankLinkingError {
        public InvalidTokenCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientBankLinkingError$NetworkErrorCase;", "Lcom/polymarket/clients/ClientBankLinkingError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class NetworkErrorCase extends ClientBankLinkingError {
        public NetworkErrorCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientBankLinkingError$SdkErrorCase;", "Lcom/polymarket/clients/ClientBankLinkingError;", "associated0", "Lcom/polymarket/clients/ClientBankLinkingSDKError;", "<init>", "(Lcom/polymarket/clients/ClientBankLinkingSDKError;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientBankLinkingSDKError;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SdkErrorCase extends ClientBankLinkingError {
        private final ClientBankLinkingSDKError associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkErrorCase(ClientBankLinkingSDKError clientBankLinkingSDKError) {
            super(null);
            clientBankLinkingSDKError.getClass();
            this.associated0 = clientBankLinkingSDKError;
        }

        public final ClientBankLinkingSDKError getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientBankLinkingError$UnknownCase;", "Lcom/polymarket/clients/ClientBankLinkingError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnknownCase extends ClientBankLinkingError {
        public UnknownCase() {
            super(null);
        }
    }

    public /* synthetic */ ClientBankLinkingError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ClientBankLinkingError access$getCancelled$cp() {
        return cancelled;
    }

    public static final /* synthetic */ ClientBankLinkingError access$getInvalidToken$cp() {
        return invalidToken;
    }

    public static final /* synthetic */ ClientBankLinkingError access$getNetworkError$cp() {
        return networkError;
    }

    public static final /* synthetic */ ClientBankLinkingError access$getUnknown$cp() {
        return unknown;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/polymarket/clients/ClientBankLinkingError$Companion;", "", "<init>", "()V", "cancelled", "Lcom/polymarket/clients/ClientBankLinkingError;", "getCancelled", "()Lcom/polymarket/clients/ClientBankLinkingError;", "invalidToken", "getInvalidToken", "sdkError", "associated0", "Lcom/polymarket/clients/ClientBankLinkingSDKError;", "networkError", "getNetworkError", "unknown", "getUnknown", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientBankLinkingError getCancelled() {
            return ClientBankLinkingError.access$getCancelled$cp();
        }

        public final ClientBankLinkingError getInvalidToken() {
            return ClientBankLinkingError.access$getInvalidToken$cp();
        }

        public final ClientBankLinkingError getNetworkError() {
            return ClientBankLinkingError.access$getNetworkError$cp();
        }

        public final ClientBankLinkingError getUnknown() {
            return ClientBankLinkingError.access$getUnknown$cp();
        }

        public final ClientBankLinkingError sdkError(ClientBankLinkingSDKError associated0) {
            associated0.getClass();
            return new SdkErrorCase(associated0);
        }

        private Companion() {
        }
    }

    private ClientBankLinkingError() {
    }
}

package com.polymarket.clients;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/polymarket/clients/ClientStripeError;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "CancelledCase", "CardFundingNotSupportedCase", "PublishableKeyMissingCase", "PresenterMissingCase", "SdkErrorCase", "UnsupportedOnPlatformCase", "UnknownCase", "Companion", "Lcom/polymarket/clients/ClientStripeError$CancelledCase;", "Lcom/polymarket/clients/ClientStripeError$CardFundingNotSupportedCase;", "Lcom/polymarket/clients/ClientStripeError$PresenterMissingCase;", "Lcom/polymarket/clients/ClientStripeError$PublishableKeyMissingCase;", "Lcom/polymarket/clients/ClientStripeError$SdkErrorCase;", "Lcom/polymarket/clients/ClientStripeError$UnknownCase;", "Lcom/polymarket/clients/ClientStripeError$UnsupportedOnPlatformCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClientStripeError implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ClientStripeError cancelled = new CancelledCase();
    private static final ClientStripeError publishableKeyMissing = new PublishableKeyMissingCase();
    private static final ClientStripeError presenterMissing = new PresenterMissingCase();
    private static final ClientStripeError unsupportedOnPlatform = new UnsupportedOnPlatformCase();
    private static final ClientStripeError unknown = new UnknownCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientStripeError$CancelledCase;", "Lcom/polymarket/clients/ClientStripeError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CancelledCase extends ClientStripeError {
        public CancelledCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ClientStripeError$CardFundingNotSupportedCase;", "Lcom/polymarket/clients/ClientStripeError;", "associated0", "Lcom/polymarket/clients/ClientStripeCardFunding;", "associated1", "", "<init>", "(Lcom/polymarket/clients/ClientStripeCardFunding;Ljava/lang/String;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientStripeCardFunding;", "getAssociated1", "()Ljava/lang/String;", "message", "getMessage", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CardFundingNotSupportedCase extends ClientStripeError {
        private final ClientStripeCardFunding associated0;
        private final String associated1;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardFundingNotSupportedCase(ClientStripeCardFunding clientStripeCardFunding, String str) {
            super(null);
            clientStripeCardFunding.getClass();
            str.getClass();
            this.associated0 = clientStripeCardFunding;
            this.associated1 = str;
            this.message = str;
        }

        public final ClientStripeCardFunding getAssociated0() {
            return this.associated0;
        }

        public final String getAssociated1() {
            return this.associated1;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientStripeError$PresenterMissingCase;", "Lcom/polymarket/clients/ClientStripeError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PresenterMissingCase extends ClientStripeError {
        public PresenterMissingCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientStripeError$PublishableKeyMissingCase;", "Lcom/polymarket/clients/ClientStripeError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PublishableKeyMissingCase extends ClientStripeError {
        public PublishableKeyMissingCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/clients/ClientStripeError$SdkErrorCase;", "Lcom/polymarket/clients/ClientStripeError;", "associated0", "Lcom/polymarket/clients/ClientSDKErrorInfo;", "associated1", "Lcom/polymarket/clients/ClientStripeSDKError;", "<init>", "(Lcom/polymarket/clients/ClientSDKErrorInfo;Lcom/polymarket/clients/ClientStripeSDKError;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientSDKErrorInfo;", "getAssociated1", "()Lcom/polymarket/clients/ClientStripeSDKError;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SdkErrorCase extends ClientStripeError {
        private final ClientSDKErrorInfo associated0;
        private final ClientStripeSDKError associated1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkErrorCase(ClientSDKErrorInfo clientSDKErrorInfo, ClientStripeSDKError clientStripeSDKError) {
            super(null);
            clientSDKErrorInfo.getClass();
            clientStripeSDKError.getClass();
            this.associated0 = clientSDKErrorInfo;
            this.associated1 = clientStripeSDKError;
        }

        public final ClientSDKErrorInfo getAssociated0() {
            return this.associated0;
        }

        public final ClientStripeSDKError getAssociated1() {
            return this.associated1;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientStripeError$UnknownCase;", "Lcom/polymarket/clients/ClientStripeError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnknownCase extends ClientStripeError {
        public UnknownCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientStripeError$UnsupportedOnPlatformCase;", "Lcom/polymarket/clients/ClientStripeError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnsupportedOnPlatformCase extends ClientStripeError {
        public UnsupportedOnPlatformCase() {
            super(null);
        }
    }

    public /* synthetic */ ClientStripeError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ClientStripeError access$getCancelled$cp() {
        return cancelled;
    }

    public static final /* synthetic */ ClientStripeError access$getPresenterMissing$cp() {
        return presenterMissing;
    }

    public static final /* synthetic */ ClientStripeError access$getPublishableKeyMissing$cp() {
        return publishableKeyMissing;
    }

    public static final /* synthetic */ ClientStripeError access$getUnknown$cp() {
        return unknown;
    }

    public static final /* synthetic */ ClientStripeError access$getUnsupportedOnPlatform$cp() {
        return unsupportedOnPlatform;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/polymarket/clients/ClientStripeError$Companion;", "", "<init>", "()V", "cancelled", "Lcom/polymarket/clients/ClientStripeError;", "getCancelled", "()Lcom/polymarket/clients/ClientStripeError;", "cardFundingNotSupported", "associated0", "Lcom/polymarket/clients/ClientStripeCardFunding;", "message", "", "publishableKeyMissing", "getPublishableKeyMissing", "presenterMissing", "getPresenterMissing", "sdkError", "Lcom/polymarket/clients/ClientSDKErrorInfo;", "associated1", "Lcom/polymarket/clients/ClientStripeSDKError;", "unsupportedOnPlatform", "getUnsupportedOnPlatform", "unknown", "getUnknown", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientStripeError cardFundingNotSupported(ClientStripeCardFunding associated0, String message) {
            associated0.getClass();
            message.getClass();
            return new CardFundingNotSupportedCase(associated0, message);
        }

        public final ClientStripeError getCancelled() {
            return ClientStripeError.access$getCancelled$cp();
        }

        public final ClientStripeError getPresenterMissing() {
            return ClientStripeError.access$getPresenterMissing$cp();
        }

        public final ClientStripeError getPublishableKeyMissing() {
            return ClientStripeError.access$getPublishableKeyMissing$cp();
        }

        public final ClientStripeError getUnknown() {
            return ClientStripeError.access$getUnknown$cp();
        }

        public final ClientStripeError getUnsupportedOnPlatform() {
            return ClientStripeError.access$getUnsupportedOnPlatform$cp();
        }

        public final ClientStripeError sdkError(ClientSDKErrorInfo associated0, ClientStripeSDKError associated1) {
            associated0.getClass();
            associated1.getClass();
            return new SdkErrorCase(associated0, associated1);
        }

        private Companion() {
        }
    }

    private ClientStripeError() {
    }
}

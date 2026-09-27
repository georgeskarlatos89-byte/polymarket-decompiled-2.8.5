package com.polymarket.clients;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\t\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/polymarket/clients/ClientCardTokenizationError;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "CancelledCase", "InvalidCardDetailsCase", "AuthenticationFailedCase", "DeclinedCase", "ConnectionErrorCase", "MethodUnavailableCase", "SetupErrorCase", "SdkFailureCase", "ComponentNotAvailableCase", "Companion", "Lcom/polymarket/clients/ClientCardTokenizationError$AuthenticationFailedCase;", "Lcom/polymarket/clients/ClientCardTokenizationError$CancelledCase;", "Lcom/polymarket/clients/ClientCardTokenizationError$ComponentNotAvailableCase;", "Lcom/polymarket/clients/ClientCardTokenizationError$ConnectionErrorCase;", "Lcom/polymarket/clients/ClientCardTokenizationError$DeclinedCase;", "Lcom/polymarket/clients/ClientCardTokenizationError$InvalidCardDetailsCase;", "Lcom/polymarket/clients/ClientCardTokenizationError$MethodUnavailableCase;", "Lcom/polymarket/clients/ClientCardTokenizationError$SdkFailureCase;", "Lcom/polymarket/clients/ClientCardTokenizationError$SetupErrorCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClientCardTokenizationError implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ClientCardTokenizationError cancelled = new CancelledCase();
    private static final ClientCardTokenizationError componentNotAvailable = new ComponentNotAvailableCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientCardTokenizationError$AuthenticationFailedCase;", "Lcom/polymarket/clients/ClientCardTokenizationError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AuthenticationFailedCase extends ClientCardTokenizationError {
        private final String associated0;

        public AuthenticationFailedCase(String str) {
            super(null);
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientCardTokenizationError$CancelledCase;", "Lcom/polymarket/clients/ClientCardTokenizationError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CancelledCase extends ClientCardTokenizationError {
        public CancelledCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientCardTokenizationError$ComponentNotAvailableCase;", "Lcom/polymarket/clients/ClientCardTokenizationError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ComponentNotAvailableCase extends ClientCardTokenizationError {
        public ComponentNotAvailableCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientCardTokenizationError$ConnectionErrorCase;", "Lcom/polymarket/clients/ClientCardTokenizationError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ConnectionErrorCase extends ClientCardTokenizationError {
        private final String associated0;

        public ConnectionErrorCase(String str) {
            super(null);
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientCardTokenizationError$DeclinedCase;", "Lcom/polymarket/clients/ClientCardTokenizationError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DeclinedCase extends ClientCardTokenizationError {
        private final String associated0;

        public DeclinedCase(String str) {
            super(null);
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientCardTokenizationError$InvalidCardDetailsCase;", "Lcom/polymarket/clients/ClientCardTokenizationError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InvalidCardDetailsCase extends ClientCardTokenizationError {
        private final String associated0;

        public InvalidCardDetailsCase(String str) {
            super(null);
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientCardTokenizationError$MethodUnavailableCase;", "Lcom/polymarket/clients/ClientCardTokenizationError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MethodUnavailableCase extends ClientCardTokenizationError {
        private final String associated0;

        public MethodUnavailableCase(String str) {
            super(null);
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientCardTokenizationError$SdkFailureCase;", "Lcom/polymarket/clients/ClientCardTokenizationError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SdkFailureCase extends ClientCardTokenizationError {
        private final String associated0;

        public SdkFailureCase(String str) {
            super(null);
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientCardTokenizationError$SetupErrorCase;", "Lcom/polymarket/clients/ClientCardTokenizationError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SetupErrorCase extends ClientCardTokenizationError {
        private final String associated0;

        public SetupErrorCase(String str) {
            super(null);
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ ClientCardTokenizationError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ClientCardTokenizationError access$getCancelled$cp() {
        return cancelled;
    }

    public static final /* synthetic */ ClientCardTokenizationError access$getComponentNotAvailable$cp() {
        return componentNotAvailable;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\r\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000e\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000f\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nJ\u001b\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0082 J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\nJ\u0011\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\nH\u0082 J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nJ\u0011\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0082 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/polymarket/clients/ClientCardTokenizationError$Companion;", "", "<init>", "()V", "cancelled", "Lcom/polymarket/clients/ClientCardTokenizationError;", "getCancelled", "()Lcom/polymarket/clients/ClientCardTokenizationError;", "invalidCardDetails", "associated0", "", "authenticationFailed", "declined", "connectionError", "methodUnavailable", "setupError", "sdkFailure", "componentNotAvailable", "getComponentNotAvailable", "fromCheckout", ApiConstant.KEY_CODE, "detail", "Swift_Companion_fromCheckout_0", "checkoutIsRecoverable", "", "Swift_Companion_checkoutIsRecoverable_1", "checkoutToastDescription", "Swift_Companion_checkoutToastDescription_2", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native boolean Swift_Companion_checkoutIsRecoverable_1(String code);

        private final native String Swift_Companion_checkoutToastDescription_2(String code);

        private final native ClientCardTokenizationError Swift_Companion_fromCheckout_0(String code, String detail);

        public final ClientCardTokenizationError authenticationFailed(String associated0) {
            return new AuthenticationFailedCase(associated0);
        }

        public final boolean checkoutIsRecoverable(String code) {
            code.getClass();
            return Swift_Companion_checkoutIsRecoverable_1(code);
        }

        public final String checkoutToastDescription(String code) {
            code.getClass();
            return Swift_Companion_checkoutToastDescription_2(code);
        }

        public final ClientCardTokenizationError connectionError(String associated0) {
            return new ConnectionErrorCase(associated0);
        }

        public final ClientCardTokenizationError declined(String associated0) {
            return new DeclinedCase(associated0);
        }

        public final ClientCardTokenizationError fromCheckout(String code, String detail) {
            code.getClass();
            return Swift_Companion_fromCheckout_0(code, detail);
        }

        public final ClientCardTokenizationError getCancelled() {
            return ClientCardTokenizationError.access$getCancelled$cp();
        }

        public final ClientCardTokenizationError getComponentNotAvailable() {
            return ClientCardTokenizationError.access$getComponentNotAvailable$cp();
        }

        public final ClientCardTokenizationError invalidCardDetails(String associated0) {
            return new InvalidCardDetailsCase(associated0);
        }

        public final ClientCardTokenizationError methodUnavailable(String associated0) {
            return new MethodUnavailableCase(associated0);
        }

        public final ClientCardTokenizationError sdkFailure(String associated0) {
            return new SdkFailureCase(associated0);
        }

        public final ClientCardTokenizationError setupError(String associated0) {
            return new SetupErrorCase(associated0);
        }

        private Companion() {
        }
    }

    private ClientCardTokenizationError() {
    }
}

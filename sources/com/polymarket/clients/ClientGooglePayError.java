package com.polymarket.clients;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/polymarket/clients/ClientGooglePayError;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "NotAvailableCase", "AuthorizationFailedCase", "TokenDecodingFailedCase", "SdkFailureCase", "UserCancelledCase", "Companion", "Lcom/polymarket/clients/ClientGooglePayError$AuthorizationFailedCase;", "Lcom/polymarket/clients/ClientGooglePayError$NotAvailableCase;", "Lcom/polymarket/clients/ClientGooglePayError$SdkFailureCase;", "Lcom/polymarket/clients/ClientGooglePayError$TokenDecodingFailedCase;", "Lcom/polymarket/clients/ClientGooglePayError$UserCancelledCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClientGooglePayError implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ClientGooglePayError notAvailable = new NotAvailableCase();
    private static final ClientGooglePayError userCancelled = new UserCancelledCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientGooglePayError$AuthorizationFailedCase;", "Lcom/polymarket/clients/ClientGooglePayError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AuthorizationFailedCase extends ClientGooglePayError {
        private final String associated0;

        public AuthorizationFailedCase(String str) {
            super(null);
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientGooglePayError$NotAvailableCase;", "Lcom/polymarket/clients/ClientGooglePayError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class NotAvailableCase extends ClientGooglePayError {
        public NotAvailableCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientGooglePayError$SdkFailureCase;", "Lcom/polymarket/clients/ClientGooglePayError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SdkFailureCase extends ClientGooglePayError {
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
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientGooglePayError$TokenDecodingFailedCase;", "Lcom/polymarket/clients/ClientGooglePayError;", "associated0", "", "<init>", "(Ljava/lang/Throwable;)V", "getAssociated0", "()Ljava/lang/Throwable;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TokenDecodingFailedCase extends ClientGooglePayError {
        private final Throwable associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenDecodingFailedCase(Throwable th) {
            super(null);
            th.getClass();
            this.associated0 = th;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientGooglePayError$UserCancelledCase;", "Lcom/polymarket/clients/ClientGooglePayError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UserCancelledCase extends ClientGooglePayError {
        public UserCancelledCase() {
            super(null);
        }
    }

    public /* synthetic */ ClientGooglePayError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ClientGooglePayError access$getNotAvailable$cp() {
        return notAvailable;
    }

    public static final /* synthetic */ ClientGooglePayError access$getUserCancelled$cp() {
        return userCancelled;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/polymarket/clients/ClientGooglePayError$Companion;", "", "<init>", "()V", "notAvailable", "Lcom/polymarket/clients/ClientGooglePayError;", "getNotAvailable", "()Lcom/polymarket/clients/ClientGooglePayError;", "authorizationFailed", "associated0", "", "tokenDecodingFailed", "", "sdkFailure", "userCancelled", "getUserCancelled", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientGooglePayError authorizationFailed(String associated0) {
            return new AuthorizationFailedCase(associated0);
        }

        public final ClientGooglePayError getNotAvailable() {
            return ClientGooglePayError.access$getNotAvailable$cp();
        }

        public final ClientGooglePayError getUserCancelled() {
            return ClientGooglePayError.access$getUserCancelled$cp();
        }

        public final ClientGooglePayError sdkFailure(String associated0) {
            return new SdkFailureCase(associated0);
        }

        public final ClientGooglePayError tokenDecodingFailed(Throwable associated0) {
            associated0.getClass();
            return new TokenDecodingFailedCase(associated0);
        }

        private Companion() {
        }
    }

    private ClientGooglePayError() {
    }
}

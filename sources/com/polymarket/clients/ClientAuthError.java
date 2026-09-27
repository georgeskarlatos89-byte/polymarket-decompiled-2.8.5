package com.polymarket.clients;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/polymarket/clients/ClientAuthError;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "UserCancelledAuthCase", "IncorrectCredentialsCase", "MissingAppleTokenCase", "Auth0ErrorCase", "TokenExchangeErrorCase", "RefreshTokenErrorCase", "MissingAccessTokenCase", "Companion", "Lcom/polymarket/clients/ClientAuthError$Auth0ErrorCase;", "Lcom/polymarket/clients/ClientAuthError$IncorrectCredentialsCase;", "Lcom/polymarket/clients/ClientAuthError$MissingAccessTokenCase;", "Lcom/polymarket/clients/ClientAuthError$MissingAppleTokenCase;", "Lcom/polymarket/clients/ClientAuthError$RefreshTokenErrorCase;", "Lcom/polymarket/clients/ClientAuthError$TokenExchangeErrorCase;", "Lcom/polymarket/clients/ClientAuthError$UserCancelledAuthCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClientAuthError implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ClientAuthError userCancelledAuth = new UserCancelledAuthCase();
    private static final ClientAuthError incorrectCredentials = new IncorrectCredentialsCase();
    private static final ClientAuthError missingAppleToken = new MissingAppleTokenCase();
    private static final ClientAuthError tokenExchangeError = new TokenExchangeErrorCase();
    private static final ClientAuthError refreshTokenError = new RefreshTokenErrorCase();
    private static final ClientAuthError missingAccessToken = new MissingAccessTokenCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientAuthError$Auth0ErrorCase;", "Lcom/polymarket/clients/ClientAuthError;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Auth0ErrorCase extends ClientAuthError {
        private final String associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Auth0ErrorCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientAuthError$IncorrectCredentialsCase;", "Lcom/polymarket/clients/ClientAuthError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class IncorrectCredentialsCase extends ClientAuthError {
        public IncorrectCredentialsCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientAuthError$MissingAccessTokenCase;", "Lcom/polymarket/clients/ClientAuthError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MissingAccessTokenCase extends ClientAuthError {
        public MissingAccessTokenCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientAuthError$MissingAppleTokenCase;", "Lcom/polymarket/clients/ClientAuthError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MissingAppleTokenCase extends ClientAuthError {
        public MissingAppleTokenCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientAuthError$RefreshTokenErrorCase;", "Lcom/polymarket/clients/ClientAuthError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RefreshTokenErrorCase extends ClientAuthError {
        public RefreshTokenErrorCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientAuthError$TokenExchangeErrorCase;", "Lcom/polymarket/clients/ClientAuthError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TokenExchangeErrorCase extends ClientAuthError {
        public TokenExchangeErrorCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientAuthError$UserCancelledAuthCase;", "Lcom/polymarket/clients/ClientAuthError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UserCancelledAuthCase extends ClientAuthError {
        public UserCancelledAuthCase() {
            super(null);
        }
    }

    public /* synthetic */ ClientAuthError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ClientAuthError access$getIncorrectCredentials$cp() {
        return incorrectCredentials;
    }

    public static final /* synthetic */ ClientAuthError access$getMissingAccessToken$cp() {
        return missingAccessToken;
    }

    public static final /* synthetic */ ClientAuthError access$getMissingAppleToken$cp() {
        return missingAppleToken;
    }

    public static final /* synthetic */ ClientAuthError access$getRefreshTokenError$cp() {
        return refreshTokenError;
    }

    public static final /* synthetic */ ClientAuthError access$getTokenExchangeError$cp() {
        return tokenExchangeError;
    }

    public static final /* synthetic */ ClientAuthError access$getUserCancelledAuth$cp() {
        return userCancelledAuth;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/polymarket/clients/ClientAuthError$Companion;", "", "<init>", "()V", "userCancelledAuth", "Lcom/polymarket/clients/ClientAuthError;", "getUserCancelledAuth", "()Lcom/polymarket/clients/ClientAuthError;", "incorrectCredentials", "getIncorrectCredentials", "missingAppleToken", "getMissingAppleToken", "auth0Error", "associated0", "", "tokenExchangeError", "getTokenExchangeError", "refreshTokenError", "getRefreshTokenError", "missingAccessToken", "getMissingAccessToken", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientAuthError auth0Error(String associated0) {
            associated0.getClass();
            return new Auth0ErrorCase(associated0);
        }

        public final ClientAuthError getIncorrectCredentials() {
            return ClientAuthError.access$getIncorrectCredentials$cp();
        }

        public final ClientAuthError getMissingAccessToken() {
            return ClientAuthError.access$getMissingAccessToken$cp();
        }

        public final ClientAuthError getMissingAppleToken() {
            return ClientAuthError.access$getMissingAppleToken$cp();
        }

        public final ClientAuthError getRefreshTokenError() {
            return ClientAuthError.access$getRefreshTokenError$cp();
        }

        public final ClientAuthError getTokenExchangeError() {
            return ClientAuthError.access$getTokenExchangeError$cp();
        }

        public final ClientAuthError getUserCancelledAuth() {
            return ClientAuthError.access$getUserCancelledAuth$cp();
        }

        private Companion() {
        }
    }

    private ClientAuthError() {
    }
}

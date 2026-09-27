package com.polymarket.clients;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u000b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/polymarket/clients/ChatClientError;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "AnonymousConnectFailedCase", "UserConnectFailedCase", "RequiresAuthCase", "ChannelNotJoinedCase", "ChannelNotFoundCase", "MessageNotFoundCase", "MessageSendFailedCase", "PermissionDeniedCase", "PinMessageFailedCase", "UnpinMessageFailedCase", "LoadPinnedMessagesFailedCase", "Companion", "Lcom/polymarket/clients/ChatClientError$AnonymousConnectFailedCase;", "Lcom/polymarket/clients/ChatClientError$ChannelNotFoundCase;", "Lcom/polymarket/clients/ChatClientError$ChannelNotJoinedCase;", "Lcom/polymarket/clients/ChatClientError$LoadPinnedMessagesFailedCase;", "Lcom/polymarket/clients/ChatClientError$MessageNotFoundCase;", "Lcom/polymarket/clients/ChatClientError$MessageSendFailedCase;", "Lcom/polymarket/clients/ChatClientError$PermissionDeniedCase;", "Lcom/polymarket/clients/ChatClientError$PinMessageFailedCase;", "Lcom/polymarket/clients/ChatClientError$RequiresAuthCase;", "Lcom/polymarket/clients/ChatClientError$UnpinMessageFailedCase;", "Lcom/polymarket/clients/ChatClientError$UserConnectFailedCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ChatClientError implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ChatClientError requiresAuth = new RequiresAuthCase();
    private static final ChatClientError channelNotJoined = new ChannelNotJoinedCase();
    private static final ChatClientError channelNotFound = new ChannelNotFoundCase();
    private static final ChatClientError messageNotFound = new MessageNotFoundCase();
    private static final ChatClientError messageSendFailed = new MessageSendFailedCase();
    private static final ChatClientError permissionDenied = new PermissionDeniedCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/clients/ChatClientError$AnonymousConnectFailedCase;", "Lcom/polymarket/clients/ChatClientError;", "associated0", "", "<init>", "(Ljava/lang/Throwable;)V", "getAssociated0", "()Ljava/lang/Throwable;", "underlying", "getUnderlying", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AnonymousConnectFailedCase extends ChatClientError {
        private final Throwable associated0;
        private final Throwable underlying;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousConnectFailedCase(Throwable th) {
            super(null);
            th.getClass();
            this.associated0 = th;
            this.underlying = th;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }

        public final Throwable getUnderlying() {
            return this.underlying;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ChatClientError$ChannelNotFoundCase;", "Lcom/polymarket/clients/ChatClientError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ChannelNotFoundCase extends ChatClientError {
        public ChannelNotFoundCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ChatClientError$ChannelNotJoinedCase;", "Lcom/polymarket/clients/ChatClientError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ChannelNotJoinedCase extends ChatClientError {
        public ChannelNotJoinedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/polymarket/clients/ChatClientError$LoadPinnedMessagesFailedCase;", "Lcom/polymarket/clients/ChatClientError;", "associated0", "", "associated1", "", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Integer;)V", "getAssociated0", "()Ljava/lang/Throwable;", "getAssociated1", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "underlying", "getUnderlying", "statusCode", "getStatusCode", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LoadPinnedMessagesFailedCase extends ChatClientError {
        private final Throwable associated0;
        private final Integer associated1;
        private final Integer statusCode;
        private final Throwable underlying;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadPinnedMessagesFailedCase(Throwable th, Integer num) {
            super(null);
            th.getClass();
            this.associated0 = th;
            this.associated1 = num;
            this.underlying = th;
            this.statusCode = num;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }

        public final Integer getAssociated1() {
            return this.associated1;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public final Throwable getUnderlying() {
            return this.underlying;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ChatClientError$MessageNotFoundCase;", "Lcom/polymarket/clients/ChatClientError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MessageNotFoundCase extends ChatClientError {
        public MessageNotFoundCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ChatClientError$MessageSendFailedCase;", "Lcom/polymarket/clients/ChatClientError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MessageSendFailedCase extends ChatClientError {
        public MessageSendFailedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ChatClientError$PermissionDeniedCase;", "Lcom/polymarket/clients/ChatClientError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PermissionDeniedCase extends ChatClientError {
        public PermissionDeniedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/polymarket/clients/ChatClientError$PinMessageFailedCase;", "Lcom/polymarket/clients/ChatClientError;", "associated0", "", "associated1", "", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Integer;)V", "getAssociated0", "()Ljava/lang/Throwable;", "getAssociated1", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "underlying", "getUnderlying", "statusCode", "getStatusCode", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PinMessageFailedCase extends ChatClientError {
        private final Throwable associated0;
        private final Integer associated1;
        private final Integer statusCode;
        private final Throwable underlying;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PinMessageFailedCase(Throwable th, Integer num) {
            super(null);
            th.getClass();
            this.associated0 = th;
            this.associated1 = num;
            this.underlying = th;
            this.statusCode = num;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }

        public final Integer getAssociated1() {
            return this.associated1;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public final Throwable getUnderlying() {
            return this.underlying;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ChatClientError$RequiresAuthCase;", "Lcom/polymarket/clients/ChatClientError;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RequiresAuthCase extends ChatClientError {
        public RequiresAuthCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/polymarket/clients/ChatClientError$UnpinMessageFailedCase;", "Lcom/polymarket/clients/ChatClientError;", "associated0", "", "associated1", "", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Integer;)V", "getAssociated0", "()Ljava/lang/Throwable;", "getAssociated1", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "underlying", "getUnderlying", "statusCode", "getStatusCode", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnpinMessageFailedCase extends ChatClientError {
        private final Throwable associated0;
        private final Integer associated1;
        private final Integer statusCode;
        private final Throwable underlying;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnpinMessageFailedCase(Throwable th, Integer num) {
            super(null);
            th.getClass();
            this.associated0 = th;
            this.associated1 = num;
            this.underlying = th;
            this.statusCode = num;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }

        public final Integer getAssociated1() {
            return this.associated1;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public final Throwable getUnderlying() {
            return this.underlying;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/clients/ChatClientError$UserConnectFailedCase;", "Lcom/polymarket/clients/ChatClientError;", "associated0", "", "<init>", "(Ljava/lang/Throwable;)V", "getAssociated0", "()Ljava/lang/Throwable;", "underlying", "getUnderlying", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UserConnectFailedCase extends ChatClientError {
        private final Throwable associated0;
        private final Throwable underlying;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserConnectFailedCase(Throwable th) {
            super(null);
            th.getClass();
            this.associated0 = th;
            this.underlying = th;
        }

        public final Throwable getAssociated0() {
            return this.associated0;
        }

        public final Throwable getUnderlying() {
            return this.underlying;
        }
    }

    public /* synthetic */ ChatClientError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ChatClientError access$getChannelNotFound$cp() {
        return channelNotFound;
    }

    public static final /* synthetic */ ChatClientError access$getChannelNotJoined$cp() {
        return channelNotJoined;
    }

    public static final /* synthetic */ ChatClientError access$getMessageNotFound$cp() {
        return messageNotFound;
    }

    public static final /* synthetic */ ChatClientError access$getMessageSendFailed$cp() {
        return messageSendFailed;
    }

    public static final /* synthetic */ ChatClientError access$getPermissionDenied$cp() {
        return permissionDenied;
    }

    public static final /* synthetic */ ChatClientError access$getRequiresAuth$cp() {
        return requiresAuth;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001d\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/polymarket/clients/ChatClientError$Companion;", "", "<init>", "()V", "anonymousConnectFailed", "Lcom/polymarket/clients/ChatClientError;", "underlying", "", "userConnectFailed", "requiresAuth", "getRequiresAuth", "()Lcom/polymarket/clients/ChatClientError;", "channelNotJoined", "getChannelNotJoined", "channelNotFound", "getChannelNotFound", "messageNotFound", "getMessageNotFound", "messageSendFailed", "getMessageSendFailed", "permissionDenied", "getPermissionDenied", "pinMessageFailed", "statusCode", "", "(Ljava/lang/Throwable;Ljava/lang/Integer;)Lcom/polymarket/clients/ChatClientError;", "unpinMessageFailed", "loadPinnedMessagesFailed", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChatClientError anonymousConnectFailed(Throwable underlying) {
            underlying.getClass();
            return new AnonymousConnectFailedCase(underlying);
        }

        public final ChatClientError getChannelNotFound() {
            return ChatClientError.access$getChannelNotFound$cp();
        }

        public final ChatClientError getChannelNotJoined() {
            return ChatClientError.access$getChannelNotJoined$cp();
        }

        public final ChatClientError getMessageNotFound() {
            return ChatClientError.access$getMessageNotFound$cp();
        }

        public final ChatClientError getMessageSendFailed() {
            return ChatClientError.access$getMessageSendFailed$cp();
        }

        public final ChatClientError getPermissionDenied() {
            return ChatClientError.access$getPermissionDenied$cp();
        }

        public final ChatClientError getRequiresAuth() {
            return ChatClientError.access$getRequiresAuth$cp();
        }

        public final ChatClientError loadPinnedMessagesFailed(Throwable underlying, Integer statusCode) {
            underlying.getClass();
            return new LoadPinnedMessagesFailedCase(underlying, statusCode);
        }

        public final ChatClientError pinMessageFailed(Throwable underlying, Integer statusCode) {
            underlying.getClass();
            return new PinMessageFailedCase(underlying, statusCode);
        }

        public final ChatClientError unpinMessageFailed(Throwable underlying, Integer statusCode) {
            underlying.getClass();
            return new UnpinMessageFailedCase(underlying, statusCode);
        }

        public final ChatClientError userConnectFailed(Throwable underlying) {
            underlying.getClass();
            return new UserConnectFailedCase(underlying);
        }

        private Companion() {
        }
    }

    private ChatClientError() {
    }
}

package com.polymarket.clients;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002\"#B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001a\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u0015\u0010\u001d\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/polymarket/clients/ClientNotificationsSettings;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "authorizationStatus", "Lcom/polymarket/clients/ClientNotificationsSettings$AuthorizationStatus;", "(Lcom/polymarket/clients/ClientNotificationsSettings$AuthorizationStatus;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_constructor_0", "getAuthorizationStatus", "()Lcom/polymarket/clients/ClientNotificationsSettings$AuthorizationStatus;", "Swift_authorizationStatus", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "AuthorizationStatus", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientNotificationsSettings implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public ClientNotificationsSettings(AuthorizationStatus authorizationStatus) {
        authorizationStatus.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(authorizationStatus);
    }

    private final native AuthorizationStatus Swift_authorizationStatus(long Swift_peer);

    private final native long Swift_constructor_0(AuthorizationStatus authorizationStatus);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public boolean equals(Object other) {
        if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final AuthorizationStatus getAuthorizationStatus() {
        return Swift_authorizationStatus(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0017"}, d2 = {"Lcom/polymarket/clients/ClientNotificationsSettings$AuthorizationStatus;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "notDetermined", "denied", "authorized", "provisional", "ephemeral", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AuthorizationStatus implements RawRepresentable<Integer>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ AuthorizationStatus[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int rawValue;
        public static final AuthorizationStatus notDetermined = new AuthorizationStatus("notDetermined", 0, 0, null, 2, null);
        public static final AuthorizationStatus denied = new AuthorizationStatus("denied", 1, 1, null, 2, null);
        public static final AuthorizationStatus authorized = new AuthorizationStatus("authorized", 2, 2, null, 2, null);
        public static final AuthorizationStatus provisional = new AuthorizationStatus("provisional", 3, 3, null, 2, null);
        public static final AuthorizationStatus ephemeral = new AuthorizationStatus("ephemeral", 4, 4, null, 2, null);

        private static final /* synthetic */ AuthorizationStatus[] $values() {
            return new AuthorizationStatus[]{notDetermined, denied, authorized, provisional, ephemeral};
        }

        static {
            AuthorizationStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ AuthorizationStatus(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static AuthorizationStatus valueOf(String str) {
            return (AuthorizationStatus) Enum.valueOf(AuthorizationStatus.class, str);
        }

        public static AuthorizationStatus[] values() {
            return (AuthorizationStatus[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // skip.lib.RawRepresentable
        public Integer getRawValue() {
            return Integer.valueOf(this.rawValue);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientNotificationsSettings$AuthorizationStatus$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/clients/ClientNotificationsSettings$AuthorizationStatus;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AuthorizationStatus init(int rawValue) {
                if (rawValue != 0) {
                    if (rawValue != 1) {
                        if (rawValue != 2) {
                            if (rawValue != 3) {
                                if (rawValue != 4) {
                                    return null;
                                }
                                return AuthorizationStatus.ephemeral;
                            }
                            return AuthorizationStatus.provisional;
                        }
                        return AuthorizationStatus.authorized;
                    }
                    return AuthorizationStatus.denied;
                }
                return AuthorizationStatus.notDetermined;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ Integer getRawValue() {
            return getRawValue();
        }

        private AuthorizationStatus(String str, int i, int i2, Void r4) {
            this.rawValue = i2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientNotificationsSettings$Companion;", "", "<init>", "()V", "AuthorizationStatus", "Lcom/polymarket/clients/ClientNotificationsSettings$AuthorizationStatus;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AuthorizationStatus AuthorizationStatus(int rawValue) {
            return AuthorizationStatus.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    public ClientNotificationsSettings(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

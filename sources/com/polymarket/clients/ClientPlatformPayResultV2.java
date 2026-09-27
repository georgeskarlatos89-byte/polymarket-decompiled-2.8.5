package com.polymarket.clients;

import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010!\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010%\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010*\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J9\u0010+\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0-2\u0006\u0010.\u001a\u00020\u001eH\u0016J\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0-2\u0006\u0010.\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u00061"}, d2 = {"Lcom/polymarket/clients/ClientPlatformPayResultV2;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "protocolVersion", "", "signature", "signedMessage", "displayName", "billingContact", "Lcom/polymarket/clients/ClientPlatformPayBillingContact;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/clients/ClientPlatformPayBillingContact;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getProtocolVersion", "()Ljava/lang/String;", "Swift_protocolVersion", "getSignature", "Swift_signature", "getSignedMessage", "Swift_signedMessage", "getDisplayName", "Swift_displayName", "getBillingContact", "()Lcom/polymarket/clients/ClientPlatformPayBillingContact;", "Swift_billingContact", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientPlatformPayResultV2 implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ClientPlatformPayResultV2(String str, String str2, String str3, String str4, ClientPlatformPayBillingContact clientPlatformPayBillingContact) {
        g.x(str, str2, str3);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, clientPlatformPayBillingContact);
    }

    private final native ClientPlatformPayBillingContact Swift_billingContact(long Swift_peer);

    private final native long Swift_constructor_0(String protocolVersion, String signature, String signedMessage, String displayName, ClientPlatformPayBillingContact billingContact);

    private final native String Swift_displayName(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_protocolVersion(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_signature(long Swift_peer);

    private final native String Swift_signedMessage(long Swift_peer);

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

    public final ClientPlatformPayBillingContact getBillingContact() {
        return Swift_billingContact(this.Swift_peer);
    }

    public final String getDisplayName() {
        return Swift_displayName(this.Swift_peer);
    }

    public final String getProtocolVersion() {
        return Swift_protocolVersion(this.Swift_peer);
    }

    public final String getSignature() {
        return Swift_signature(this.Swift_peer);
    }

    public final String getSignedMessage() {
        return Swift_signedMessage(this.Swift_peer);
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

    public ClientPlatformPayResultV2(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ClientPlatformPayResultV2(String str, String str2, String str3, String str4, ClientPlatformPayBillingContact clientPlatformPayBillingContact, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : clientPlatformPayBillingContact);
    }
}

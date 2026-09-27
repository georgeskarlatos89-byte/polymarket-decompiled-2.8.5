package com.polymarket.clients;

import com.socure.docv.capturesdk.api.Keys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0015\u0010\u0012\u001a\u00020\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\r\u0010\u0019\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\u0015\u0010\u001b\u001a\u00020\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J$\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00160 H\u0016J1\u0010!\u001a\u00020\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00160 H\u0082 J\u0012\u0010\"\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0016J\u001f\u0010$\u001a\u00020\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0082 J\u001a\u0010%\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010\u001e2\u0006\u0010'\u001a\u00020\u001eH\u0016J'\u0010(\u001a\u00020\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010&\u001a\u0004\u0018\u00010\u001e2\u0006\u0010)\u001a\u00020\u001eH\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010,\u001a\u00020\u0018H\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010,\u001a\u00020\u0018H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006/"}, d2 = {"Lcom/polymarket/clients/ClientFirebaseMock;", "Lcom/polymarket/clients/ClientFirebase;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "()V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_constructor_0", "configure", "Swift_configure_1", "track", "event", "", "parameters", "", "Swift_track_2", "setUserId", "userId", "Swift_setUserId_3", "setUserProperty", "value", "forName", "Swift_setUserProperty_4", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientFirebaseMock implements ClientFirebase, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ClientFirebaseMock() {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0();
    }

    private final native void Swift_configure_1(long Swift_peer);

    private final native long Swift_constructor_0();

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native void Swift_setUserId_3(long Swift_peer, String userId);

    private final native void Swift_setUserProperty_4(long Swift_peer, String value, String name);

    private final native void Swift_track_2(long Swift_peer, String event, Map<String, ? extends Object> parameters);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // com.polymarket.clients.ClientFirebase
    public void configure() {
        Swift_configure_1(this.Swift_peer);
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

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    @Override // com.polymarket.clients.ClientFirebase
    public void setUserId(String userId) {
        Swift_setUserId_3(this.Swift_peer, userId);
    }

    @Override // com.polymarket.clients.ClientFirebase
    public void setUserProperty(String value, String forName) {
        forName.getClass();
        Swift_setUserProperty_4(this.Swift_peer, value, forName);
    }

    @Override // com.polymarket.clients.ClientFirebase
    public void track(String event, Map<String, ? extends Object> parameters) {
        event.getClass();
        parameters.getClass();
        Swift_track_2(this.Swift_peer, event, parameters);
    }

    public ClientFirebaseMock(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

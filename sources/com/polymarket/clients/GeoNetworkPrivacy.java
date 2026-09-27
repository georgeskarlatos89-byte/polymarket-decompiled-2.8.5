package com.polymarket.clients;

import com.polymarket.data.GeoPrivacySignal;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBE\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010 \u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010!J\u001c\u0010#\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010!J\u001c\u0010%\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010!J\u001c\u0010'\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010!J\u001c\u0010)\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010!J\u001c\u0010+\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010!JN\u0010,\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0002\u0010-J\u0014\u0010.\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100J#\u00102\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0082 J\u001b\u00108\u001a\b\u0012\u0004\u0012\u000205042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u001b0:2\u0006\u0010;\u001a\u00020\u001dH\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001b0:2\u0006\u0010;\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001fR\u0017\u00103\u001a\b\u0012\u0004\u0012\u000205048F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006>"}, d2 = {"Lcom/polymarket/clients/GeoNetworkPrivacy;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "vpn", "", "proxy", "tor", "relay", "hosting", "residentialProxy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "getVpn", "()Ljava/lang/Boolean;", "Swift_vpn", "(J)Ljava/lang/Boolean;", "getProxy", "Swift_proxy", "getTor", "Swift_tor", "getRelay", "Swift_relay", "getHosting", "Swift_hosting", "getResidentialProxy", "Swift_residentialProxy", "Swift_constructor_0", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)J", "isAnonymized", "blocking", "", "Lcom/polymarket/data/GeoPrivacySignal;", "Swift_isAnonymized_1", "activeSignals", "", "", "getActiveSignals", "()Ljava/util/List;", "Swift_activeSignals", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoNetworkPrivacy implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public GeoNetworkPrivacy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(bool, bool2, bool3, bool4, bool5, bool6);
    }

    private final native List<String> Swift_activeSignals(long Swift_peer);

    private final native long Swift_constructor_0(Boolean vpn, Boolean proxy, Boolean tor, Boolean relay, Boolean hosting, Boolean residentialProxy);

    private final native Boolean Swift_hosting(long Swift_peer);

    private final native boolean Swift_isAnonymized_1(long Swift_peer, Set<? extends GeoPrivacySignal> blocking);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native Boolean Swift_proxy(long Swift_peer);

    private final native Boolean Swift_relay(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native Boolean Swift_residentialProxy(long Swift_peer);

    private final native Boolean Swift_tor(long Swift_peer);

    private final native Boolean Swift_vpn(long Swift_peer);

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

    public final List<String> getActiveSignals() {
        return Swift_activeSignals(this.Swift_peer);
    }

    public final Boolean getHosting() {
        return Swift_hosting(this.Swift_peer);
    }

    public final Boolean getProxy() {
        return Swift_proxy(this.Swift_peer);
    }

    public final Boolean getRelay() {
        return Swift_relay(this.Swift_peer);
    }

    public final Boolean getResidentialProxy() {
        return Swift_residentialProxy(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final Boolean getTor() {
        return Swift_tor(this.Swift_peer);
    }

    public final Boolean getVpn() {
        return Swift_vpn(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isAnonymized(Set<? extends GeoPrivacySignal> blocking) {
        blocking.getClass();
        return Swift_isAnonymized_1(this.Swift_peer, blocking);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public GeoNetworkPrivacy(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

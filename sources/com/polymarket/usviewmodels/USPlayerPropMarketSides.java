package com.polymarket.usviewmodels;

import com.polymarket.data.EMarket;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010%\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 J\u0010\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010'\u001a\u00020\u0018J\u001f\u0010(\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010'\u001a\u00020\u0018H\u0082 J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0*2\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001a0*2\u0006\u0010+\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006."}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropMarketSides;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "market", "Lcom/polymarket/data/EMarket;", "longSide", "Lcom/polymarket/data/EMarket$MarketSide;", "shortSide", "(Lcom/polymarket/data/EMarket;Lcom/polymarket/data/EMarket$MarketSide;Lcom/polymarket/data/EMarket$MarketSide;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getMarket", "()Lcom/polymarket/data/EMarket;", "Swift_market", "getLongSide", "()Lcom/polymarket/data/EMarket$MarketSide;", "Swift_longSide", "getShortSide", "Swift_shortSide", "Swift_constructor_0", "side", "isLong", "Swift_side_1", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USPlayerPropMarketSides implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public USPlayerPropMarketSides(EMarket eMarket, EMarket.MarketSide marketSide, EMarket.MarketSide marketSide2) {
        eMarket.getClass();
        marketSide.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eMarket, marketSide, marketSide2);
    }

    private final native long Swift_constructor_0(EMarket market, EMarket.MarketSide longSide, EMarket.MarketSide shortSide);

    private final native EMarket.MarketSide Swift_longSide(long Swift_peer);

    private final native EMarket Swift_market(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native EMarket.MarketSide Swift_shortSide(long Swift_peer);

    private final native EMarket.MarketSide Swift_side_1(long Swift_peer, boolean isLong);

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

    public final EMarket.MarketSide getLongSide() {
        return Swift_longSide(this.Swift_peer);
    }

    public final EMarket getMarket() {
        return Swift_market(this.Swift_peer);
    }

    public final EMarket.MarketSide getShortSide() {
        return Swift_shortSide(this.Swift_peer);
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

    public final EMarket.MarketSide side(boolean isLong) {
        return Swift_side_1(this.Swift_peer, isLong);
    }

    public USPlayerPropMarketSides(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

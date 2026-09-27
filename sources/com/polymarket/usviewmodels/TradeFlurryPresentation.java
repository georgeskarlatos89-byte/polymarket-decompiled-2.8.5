package com.polymarket.usviewmodels;

import com.polymarket.designtokens.DesignTokens;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010#\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J5\u0010$\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0082 J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0019\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0082 J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020(0-2\u0006\u0010.\u001a\u00020\u0019H\u0016J\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020(0-2\u0006\u0010.\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001e¨\u00061"}, d2 = {"Lcom/polymarket/usviewmodels/TradeFlurryPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "longTeamID", "", "longTeamColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "shortTeamID", "shortTeamColor", "(Ljava/lang/String;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Ljava/lang/String;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getLongTeamID", "()Ljava/lang/String;", "Swift_longTeamID", "getLongTeamColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_longTeamColor", "getShortTeamID", "Swift_shortTeamID", "getShortTeamColor", "Swift_shortTeamColor", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TradeFlurryPresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public TradeFlurryPresentation(String str, DesignTokens.SemanticColor semanticColor, String str2, DesignTokens.SemanticColor semanticColor2) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, semanticColor, str2, semanticColor2);
    }

    private final native long Swift_constructor_0(String longTeamID, DesignTokens.SemanticColor longTeamColor, String shortTeamID, DesignTokens.SemanticColor shortTeamColor);

    private final native boolean Swift_isequal(TradeFlurryPresentation lhs, TradeFlurryPresentation rhs);

    private final native DesignTokens.SemanticColor Swift_longTeamColor(long Swift_peer);

    private final native String Swift_longTeamID(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_shortTeamColor(long Swift_peer);

    private final native String Swift_shortTeamID(long Swift_peer);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof TradeFlurryPresentation)) {
            return false;
        }
        return Swift_isequal(this, (TradeFlurryPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final DesignTokens.SemanticColor getLongTeamColor() {
        return Swift_longTeamColor(this.Swift_peer);
    }

    public final String getLongTeamID() {
        return Swift_longTeamID(this.Swift_peer);
    }

    public final DesignTokens.SemanticColor getShortTeamColor() {
        return Swift_shortTeamColor(this.Swift_peer);
    }

    public final String getShortTeamID() {
        return Swift_shortTeamID(this.Swift_peer);
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

    public TradeFlurryPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

package com.polymarket.data;

import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010 \u001a\u0004\u0018\u00010\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u000201002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u0014062\u0006\u00107\u001a\u00020\u0016H\u0016J\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u0014062\u0006\u00107\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\"8F¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\"8F¢\u0006\u0006\u001a\u0004\b-\u0010%R\u001d\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u000201008F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006:"}, d2 = {"Lcom/polymarket/data/ESportStatsFootball;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "eventSlug", "", "getEventSlug", "()Ljava/lang/String;", "Swift_eventSlug", "generatedAt", "Ljava/util/Date;", "getGeneratedAt", "()Ljava/util/Date;", "Swift_generatedAt", "teams", "", "Lcom/polymarket/data/ESportStatsFootballTeam;", "getTeams", "()Ljava/util/List;", "Swift_teams", "metrics", "Lcom/polymarket/data/ESportStatsFootballMetric;", "getMetrics", "Swift_metrics", "playerGroups", "Lcom/polymarket/data/ESportStatsFootballPlayerGroup;", "getPlayerGroups", "Swift_playerGroups", "fantasyPointsByPlayerId", "", "", "getFantasyPointsByPlayerId", "()Ljava/util/Map;", "Swift_fantasyPointsByPlayerId", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportStatsFootball implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ESportStatsFootball(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private final native String Swift_eventSlug(long Swift_peer);

    private final native Map<String, Double> Swift_fantasyPointsByPlayerId(long Swift_peer);

    private final native Date Swift_generatedAt(long Swift_peer);

    private final native List<ESportStatsFootballMetric> Swift_metrics(long Swift_peer);

    private final native List<ESportStatsFootballPlayerGroup> Swift_playerGroups(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native List<ESportStatsFootballTeam> Swift_teams(long Swift_peer);

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

    public final String getEventSlug() {
        return Swift_eventSlug(this.Swift_peer);
    }

    public final Map<String, Double> getFantasyPointsByPlayerId() {
        return Swift_fantasyPointsByPlayerId(this.Swift_peer);
    }

    public final Date getGeneratedAt() {
        return Swift_generatedAt(this.Swift_peer);
    }

    public final List<ESportStatsFootballMetric> getMetrics() {
        return Swift_metrics(this.Swift_peer);
    }

    public final List<ESportStatsFootballPlayerGroup> getPlayerGroups() {
        return Swift_playerGroups(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final List<ESportStatsFootballTeam> getTeams() {
        return Swift_teams(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }
}

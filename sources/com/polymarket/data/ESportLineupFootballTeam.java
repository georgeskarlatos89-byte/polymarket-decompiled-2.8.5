package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020.0(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00104\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00107\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u0014092\u0006\u0010:\u001a\u00020\u0016H\u0016J\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0014092\u0006\u0010:\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010$\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b%\u0010\u001aR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020.0(8F¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0011\u00101\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00105\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b6\u00103¨\u0006="}, d2 = {"Lcom/polymarket/data/ESportLineupFootballTeam;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", Keys.KEY_NAME, "getName", "Swift_name", "qualifier", "Lcom/polymarket/data/ESportLineupSoccerQualifier;", "getQualifier", "()Lcom/polymarket/data/ESportLineupSoccerQualifier;", "Swift_qualifier", "logo", "getLogo", "Swift_logo", "groups", "", "Lcom/polymarket/data/ESportLineupFootballGroup;", "getGroups", "()Ljava/util/List;", "Swift_groups", "players", "Lcom/polymarket/data/ESportLineupFootballPlayer;", "getPlayers", "Swift_players", "depthChartAvailable", "getDepthChartAvailable", "()Z", "Swift_depthChartAvailable", "injuryReportAvailable", "getInjuryReportAvailable", "Swift_injuryReportAvailable", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportLineupFootballTeam implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ESportLineupFootballTeam(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private final native boolean Swift_depthChartAvailable(long Swift_peer);

    private final native List<ESportLineupFootballGroup> Swift_groups(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_injuryReportAvailable(long Swift_peer);

    private final native String Swift_logo(long Swift_peer);

    private final native String Swift_name(long Swift_peer);

    private final native List<ESportLineupFootballPlayer> Swift_players(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native ESportLineupSoccerQualifier Swift_qualifier(long Swift_peer);

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

    public final boolean getDepthChartAvailable() {
        return Swift_depthChartAvailable(this.Swift_peer);
    }

    public final List<ESportLineupFootballGroup> getGroups() {
        return Swift_groups(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final boolean getInjuryReportAvailable() {
        return Swift_injuryReportAvailable(this.Swift_peer);
    }

    public final String getLogo() {
        return Swift_logo(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final List<ESportLineupFootballPlayer> getPlayers() {
        return Swift_players(this.Swift_peer);
    }

    public final ESportLineupSoccerQualifier getQualifier() {
        return Swift_qualifier(this.Swift_peer);
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
}

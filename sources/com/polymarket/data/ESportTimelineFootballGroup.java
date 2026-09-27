package com.polymarket.data;

import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB]\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\u000fH\u0016J\u0015\u0010#\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00100\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00102\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00105\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00108\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JS\u00109\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0082 J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001f0;2\u0006\u0010<\u001a\u00020\u000fH\u0016J\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0;2\u0006\u0010<\u001a\u00020\u000fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010\"R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b/\u0010)R\u0011\u0010\u0013\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b1\u0010)R\u0011\u00103\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b4\u0010\"R\u0011\u00106\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006?"}, d2 = {"Lcom/polymarket/data/ESportTimelineFootballGroup;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "key", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "possessionTeamId", "playCount", "", "netYards", "timeOfPossessionLabel", "homeScore", "awayScore", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;II)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "getKey", "()Ljava/lang/String;", "Swift_key", "getTitle", "Swift_title", "getPossessionTeamId", "Swift_possessionTeamId", "getPlayCount", "()I", "Swift_playCount", "getNetYards", "Swift_netYards", "getTimeOfPossessionLabel", "Swift_timeOfPossessionLabel", "getHomeScore", "Swift_homeScore", "getAwayScore", "Swift_awayScore", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", "isConcluded", "()Z", "Swift_isConcluded", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportTimelineFootballGroup implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public /* synthetic */ ESportTimelineFootballGroup(String str, String str2, String str3, int i, int i2, String str4, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? null : str2, (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? null : str4, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? 0 : i4);
    }

    private final native int Swift_awayScore(long Swift_peer);

    private final native long Swift_constructor_0(String key, String title, String possessionTeamId, int playCount, int netYards, String timeOfPossessionLabel, int homeScore, int awayScore);

    private final native int Swift_homeScore(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isConcluded(long Swift_peer);

    private final native String Swift_key(long Swift_peer);

    private final native int Swift_netYards(long Swift_peer);

    private final native int Swift_playCount(long Swift_peer);

    private final native String Swift_possessionTeamId(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_timeOfPossessionLabel(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

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

    public final int getAwayScore() {
        return Swift_awayScore(this.Swift_peer);
    }

    public final int getHomeScore() {
        return Swift_homeScore(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getKey() {
        return Swift_key(this.Swift_peer);
    }

    public final int getNetYards() {
        return Swift_netYards(this.Swift_peer);
    }

    public final int getPlayCount() {
        return Swift_playCount(this.Swift_peer);
    }

    public final String getPossessionTeamId() {
        return Swift_possessionTeamId(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTimeOfPossessionLabel() {
        return Swift_timeOfPossessionLabel(this.Swift_peer);
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isConcluded() {
        return Swift_isConcluded(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public ESportTimelineFootballGroup(String str, String str2, String str3, int i, int i2, String str4, int i3, int i4) {
        str.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, i, i2, str4, i3, i4);
    }

    public ESportTimelineFootballGroup(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

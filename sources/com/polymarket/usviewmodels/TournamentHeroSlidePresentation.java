package com.polymarket.usviewmodels;

import com.polymarket.data.ESportsTeam;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001a\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010&2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010&2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010/\u001a\u0004\u0018\u00010!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00105\u001a\u0004\u0018\u00010!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00108\u001a\u0004\u0018\u00010!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010;\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010>\u001a\u0004\u0018\u00010!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010A\u001a\u00020!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00140C2\u0006\u0010D\u001a\u00020\u0016H\u0016J\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00140C2\u0006\u0010D\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010*\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b+\u0010(R\u0013\u0010-\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b.\u0010#R\u0013\u00100\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0013\u00103\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b4\u0010#R\u0013\u00106\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b7\u0010#R\u0011\u00109\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010<\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b=\u0010#R\u0011\u0010?\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b@\u0010#¨\u0006G"}, d2 = {"Lcom/polymarket/usviewmodels/TournamentHeroSlidePresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "gameId", "getGameId", "()I", "Swift_gameId", "startTime", "Ljava/util/Date;", "getStartTime", "()Ljava/util/Date;", "Swift_startTime", "kickoffText", "", "getKickoffText", "()Ljava/lang/String;", "Swift_kickoffText", "teamA", "Lcom/polymarket/data/ESportsTeam;", "getTeamA", "()Lcom/polymarket/data/ESportsTeam;", "Swift_teamA", "teamB", "getTeamB", "Swift_teamB", "probabilityA", "getProbabilityA", "Swift_probabilityA", "probabilityB", "getProbabilityB", "Swift_probabilityB", "recordA", "getRecordA", "Swift_recordA", "recordB", "getRecordB", "Swift_recordB", "isLive", "()Z", "Swift_isLive", "liveStatusText", "getLiveStatusText", "Swift_liveStatusText", "ctaTitle", "getCtaTitle", "Swift_ctaTitle", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TournamentHeroSlidePresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public TournamentHeroSlidePresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private final native String Swift_ctaTitle(long Swift_peer);

    private final native int Swift_gameId(long Swift_peer);

    private final native boolean Swift_isLive(long Swift_peer);

    private final native String Swift_kickoffText(long Swift_peer);

    private final native String Swift_liveStatusText(long Swift_peer);

    private final native String Swift_probabilityA(long Swift_peer);

    private final native String Swift_probabilityB(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_recordA(long Swift_peer);

    private final native String Swift_recordB(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native Date Swift_startTime(long Swift_peer);

    private final native ESportsTeam Swift_teamA(long Swift_peer);

    private final native ESportsTeam Swift_teamB(long Swift_peer);

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

    public final String getCtaTitle() {
        return Swift_ctaTitle(this.Swift_peer);
    }

    public final int getGameId() {
        return Swift_gameId(this.Swift_peer);
    }

    public final String getKickoffText() {
        return Swift_kickoffText(this.Swift_peer);
    }

    public final String getLiveStatusText() {
        return Swift_liveStatusText(this.Swift_peer);
    }

    public final String getProbabilityA() {
        return Swift_probabilityA(this.Swift_peer);
    }

    public final String getProbabilityB() {
        return Swift_probabilityB(this.Swift_peer);
    }

    public final String getRecordA() {
        return Swift_recordA(this.Swift_peer);
    }

    public final String getRecordB() {
        return Swift_recordB(this.Swift_peer);
    }

    public final Date getStartTime() {
        return Swift_startTime(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final ESportsTeam getTeamA() {
        return Swift_teamA(this.Swift_peer);
    }

    public final ESportsTeam getTeamB() {
        return Swift_teamB(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isLive() {
        return Swift_isLive(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }
}

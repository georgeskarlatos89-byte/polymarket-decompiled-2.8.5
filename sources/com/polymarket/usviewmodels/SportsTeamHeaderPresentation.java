package com.polymarket.usviewmodels;

import com.polymarket.data.ESportsTeam;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001c\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010+\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\u0019\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0000H\u0082 J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020-022\u0006\u00103\u001a\u00020\u0012H\u0016J\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020-022\u0006\u00103\u001a\u00020\u0012H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010%\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b&\u0010\u001bR\u0011\u0010(\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b)\u0010#¨\u00066"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamHeaderPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "team", "Lcom/polymarket/data/ESportsTeam;", "getTeam", "()Lcom/polymarket/data/ESportsTeam;", "Swift_team", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", "fansText", "getFansText", "Swift_fansText", "reservesFansText", "", "getReservesFansText", "()Z", "Swift_reservesFansText", "inviteRewardBadge", "getInviteRewardBadge", "Swift_inviteRewardBadge", "showsInvite", "getShowsInvite", "Swift_showsInvite", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SportsTeamHeaderPresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public SportsTeamHeaderPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private final native String Swift_fansText(long Swift_peer);

    private final native String Swift_inviteRewardBadge(long Swift_peer);

    private final native boolean Swift_isequal(SportsTeamHeaderPresentation lhs, SportsTeamHeaderPresentation rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native boolean Swift_reservesFansText(long Swift_peer);

    private final native boolean Swift_showsInvite(long Swift_peer);

    private final native ESportsTeam Swift_team(long Swift_peer);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof SportsTeamHeaderPresentation)) {
            return false;
        }
        return Swift_isequal(this, (SportsTeamHeaderPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getFansText() {
        return Swift_fansText(this.Swift_peer);
    }

    public final String getInviteRewardBadge() {
        return Swift_inviteRewardBadge(this.Swift_peer);
    }

    public final boolean getReservesFansText() {
        return Swift_reservesFansText(this.Swift_peer);
    }

    public final boolean getShowsInvite() {
        return Swift_showsInvite(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final ESportsTeam getTeam() {
        return Swift_team(this.Swift_peer);
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }
}

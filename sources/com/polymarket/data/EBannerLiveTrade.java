package com.polymarket.data;

import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00016B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0015\u0010\u0012\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010\u0016\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\"\u001a\u00020 2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0013\u0010)\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\u0019\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0082 J\b\u0010/\u001a\u000200H\u0016J\u0015\u00101\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020+032\u0006\u00104\u001a\u000200H\u0016J\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020+032\u0006\u00104\u001a\u000200H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u0013\u0010#\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0013\u0010&\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015¨\u00067"}, d2 = {"Lcom/polymarket/data/EBannerLiveTrade;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", "eventSlug", "getEventSlug", "Swift_eventSlug", "leagueTagSlugs", "", "getLeagueTagSlugs", "()Ljava/util/List;", "Swift_leagueTagSlugs", "isLive", "", "()Z", "Swift_isLive", "longTeamColorDarkHex", "getLongTeamColorDarkHex", "Swift_longTeamColorDarkHex", "shortTeamColorDarkHex", "getShortTeamColorDarkHex", "Swift_shortTeamColorDarkHex", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EBannerLiveTrade implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public EBannerLiveTrade(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private final native String Swift_eventSlug(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isLive(long Swift_peer);

    private final native boolean Swift_isequal(EBannerLiveTrade lhs, EBannerLiveTrade rhs);

    private final native List<String> Swift_leagueTagSlugs(long Swift_peer);

    private final native String Swift_longTeamColorDarkHex(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_shortTeamColorDarkHex(long Swift_peer);

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
        if (!(other instanceof EBannerLiveTrade)) {
            return false;
        }
        return Swift_isequal(this, (EBannerLiveTrade) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getEventSlug() {
        return Swift_eventSlug(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final List<String> getLeagueTagSlugs() {
        return Swift_leagueTagSlugs(this.Swift_peer);
    }

    public final String getLongTeamColorDarkHex() {
        return Swift_longTeamColorDarkHex(this.Swift_peer);
    }

    public final String getShortTeamColorDarkHex() {
        return Swift_shortTeamColorDarkHex(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final boolean isLive() {
        return Swift_isLive(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }
}

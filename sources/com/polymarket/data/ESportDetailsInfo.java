package com.polymarket.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0015\u0010$\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J9\u00101\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f032\u0006\u00104\u001a\u00020!H\u0016J\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u001f032\u0006\u00104\u001a\u00020!H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00067"}, d2 = {"Lcom/polymarket/data/ESportDetailsInfo;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "eventSlug", "", "stats", "Lcom/polymarket/data/ESportStats;", "lineup", "Lcom/polymarket/data/ESportLineup;", "timeline", "Lcom/polymarket/data/ESportTimeline;", "pregame", "Lcom/polymarket/data/ESportPregameDetails;", "(Ljava/lang/String;Lcom/polymarket/data/ESportStats;Lcom/polymarket/data/ESportLineup;Lcom/polymarket/data/ESportTimeline;Lcom/polymarket/data/ESportPregameDetails;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getEventSlug", "()Ljava/lang/String;", "Swift_eventSlug", "getStats", "()Lcom/polymarket/data/ESportStats;", "Swift_stats", "getLineup", "()Lcom/polymarket/data/ESportLineup;", "Swift_lineup", "getTimeline", "()Lcom/polymarket/data/ESportTimeline;", "Swift_timeline", "getPregame", "()Lcom/polymarket/data/ESportPregameDetails;", "Swift_pregame", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportDetailsInfo implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ESportDetailsInfo(String str, ESportStats eSportStats, ESportLineup eSportLineup, ESportTimeline eSportTimeline, ESportPregameDetails eSportPregameDetails) {
        str.getClass();
        eSportStats.getClass();
        eSportLineup.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, eSportStats, eSportLineup, eSportTimeline, eSportPregameDetails);
    }

    private final native long Swift_constructor_0(String eventSlug, ESportStats stats, ESportLineup lineup, ESportTimeline timeline, ESportPregameDetails pregame);

    private final native String Swift_eventSlug(long Swift_peer);

    private final native ESportLineup Swift_lineup(long Swift_peer);

    private final native ESportPregameDetails Swift_pregame(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native ESportStats Swift_stats(long Swift_peer);

    private final native ESportTimeline Swift_timeline(long Swift_peer);

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

    public final ESportLineup getLineup() {
        return Swift_lineup(this.Swift_peer);
    }

    public final ESportPregameDetails getPregame() {
        return Swift_pregame(this.Swift_peer);
    }

    public final ESportStats getStats() {
        return Swift_stats(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final ESportTimeline getTimeline() {
        return Swift_timeline(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public ESportDetailsInfo(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ESportDetailsInfo(String str, ESportStats eSportStats, ESportLineup eSportLineup, ESportTimeline eSportTimeline, ESportPregameDetails eSportPregameDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eSportStats, eSportLineup, (i & 8) != 0 ? null : eSportTimeline, (i & 16) != 0 ? null : eSportPregameDetails);
    }
}

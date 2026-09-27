package com.polymarket.data;

import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010!\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010'\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010(\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020*0)2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u00101\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020*0)H\u0082 J\u001b\u00106\u001a\b\u0012\u0004\u0012\u0002020)2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u00107\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u0002020)H\u0082 J\u0015\u0010=\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010>\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u0015H\u0082 J\u0017\u0010B\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010C\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0015\u0010E\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010F\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010R\u001a\u00020\u0001H\u0016J\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00170T2\u0006\u0010U\u001a\u00020\u0019H\u0016J\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00170T2\u0006\u0010U\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R0\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020*0)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R0\u00103\u001a\b\u0012\u0004\u0012\u0002020)2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R$\u00108\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010?\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 R\u0011\u0010D\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bD\u0010:R(\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010HX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006X"}, d2 = {"Lcom/polymarket/data/ETournamentGroupUS;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "setTitle", "Swift_title", "Swift_title_set", "", "Lcom/polymarket/data/ETournamentGroupStanding;", "standings", "getStandings", "()Ljava/util/List;", "setStandings", "(Ljava/util/List;)V", "Swift_standings", "Swift_standings_set", "Lcom/polymarket/data/ETournamentGameUS;", "games", "getGames", "setGames", "Swift_games", "Swift_games_set", "live", "getLive", "()Z", "setLive", "(Z)V", "Swift_live", "Swift_live_set", "eventSlug", "getEventSlug", "setEventSlug", "Swift_eventSlug", "Swift_eventSlug_set", "isResolved", "Swift_isResolved", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ETournamentGroupUS implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ETournamentGroupUS(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native String Swift_eventSlug(long Swift_peer);

    private final native void Swift_eventSlug_set(long Swift_peer, String value);

    private final native List<ETournamentGameUS> Swift_games(long Swift_peer);

    private final native void Swift_games_set(long Swift_peer, List<ETournamentGameUS> value);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native boolean Swift_isResolved(long Swift_peer);

    private final native boolean Swift_live(long Swift_peer);

    private final native void Swift_live_set(long Swift_peer, boolean value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native List<ETournamentGroupStanding> Swift_standings(long Swift_peer);

    private final native void Swift_standings_set(long Swift_peer, List<ETournamentGroupStanding> value);

    private final native String Swift_title(long Swift_peer);

    private final native void Swift_title_set(long Swift_peer, String value);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
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

    public final List<ETournamentGameUS> getGames() {
        return Swift_games(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final boolean getLive() {
        return Swift_live(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final List<ETournamentGroupStanding> getStandings() {
        return Swift_standings(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isResolved() {
        return Swift_isResolved(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ETournamentGroupUS(this);
    }

    public final void setEventSlug(String str) {
        willmutate();
        try {
            Swift_eventSlug_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setGames(List<ETournamentGameUS> list) {
        list.getClass();
        List<ETournamentGameUS> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_games_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setId(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_id_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setLive(boolean z) {
        willmutate();
        try {
            Swift_live_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setStandings(List<ETournamentGroupStanding> list) {
        list.getClass();
        List<ETournamentGroupStanding> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_standings_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final void setTitle(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_title_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    public ETournamentGroupUS(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

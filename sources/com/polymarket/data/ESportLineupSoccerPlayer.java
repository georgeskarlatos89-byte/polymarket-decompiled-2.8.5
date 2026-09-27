package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBg\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\b\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001f\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020\u000eH\u0016J\u0015\u0010%\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010*\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010+J\u0015\u0010.\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00100\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u00102\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010+J\u0017\u00104\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00109\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jb\u0010:\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0082 ¢\u0006\u0002\u0010;J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020!0=2\u0006\u0010>\u001a\u00020\u000eH\u0016J\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020!0=2\u0006\u0010>\u001a\u00020\u000eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b3\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010$R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006A"}, d2 = {"Lcom/polymarket/data/ESportLineupSoccerPlayer;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "jerseyNumber", "", "starter", "", "played", "order", "imageUrl", "darkImageUrl", "position", "Lcom/polymarket/data/ESportLineupSoccerPosition;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportLineupSoccerPosition;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getName", "Swift_name", "getJerseyNumber", "()Ljava/lang/Integer;", "Swift_jerseyNumber", "(J)Ljava/lang/Integer;", "getStarter", "()Z", "Swift_starter", "getPlayed", "Swift_played", "getOrder", "Swift_order", "getImageUrl", "Swift_imageUrl", "getDarkImageUrl", "Swift_darkImageUrl", "getPosition", "()Lcom/polymarket/data/ESportLineupSoccerPosition;", "Swift_position", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportLineupSoccerPosition;)J", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportLineupSoccerPlayer implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public /* synthetic */ ESportLineupSoccerPlayer(String str, String str2, Integer num, boolean z, boolean z2, Integer num2, String str3, String str4, ESportLineupSoccerPosition eSportLineupSoccerPosition, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? ESportLineupSoccerPosition.unknown : eSportLineupSoccerPosition);
    }

    private final native long Swift_constructor_0(String id, String name, Integer jerseyNumber, boolean starter, boolean played, Integer order, String imageUrl, String darkImageUrl, ESportLineupSoccerPosition position);

    private final native String Swift_darkImageUrl(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native String Swift_imageUrl(long Swift_peer);

    private final native Integer Swift_jerseyNumber(long Swift_peer);

    private final native String Swift_name(long Swift_peer);

    private final native Integer Swift_order(long Swift_peer);

    private final native boolean Swift_played(long Swift_peer);

    private final native ESportLineupSoccerPosition Swift_position(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native boolean Swift_starter(long Swift_peer);

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

    public final String getDarkImageUrl() {
        return Swift_darkImageUrl(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getImageUrl() {
        return Swift_imageUrl(this.Swift_peer);
    }

    public final Integer getJerseyNumber() {
        return Swift_jerseyNumber(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final Integer getOrder() {
        return Swift_order(this.Swift_peer);
    }

    public final boolean getPlayed() {
        return Swift_played(this.Swift_peer);
    }

    public final ESportLineupSoccerPosition getPosition() {
        return Swift_position(this.Swift_peer);
    }

    public final boolean getStarter() {
        return Swift_starter(this.Swift_peer);
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

    public ESportLineupSoccerPlayer(String str, String str2, Integer num, boolean z, boolean z2, Integer num2, String str3, String str4, ESportLineupSoccerPosition eSportLineupSoccerPosition) {
        str.getClass();
        str2.getClass();
        eSportLineupSoccerPosition.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, num, z, z2, num2, str3, str4, eSportLineupSoccerPosition);
    }

    public ESportLineupSoccerPlayer(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

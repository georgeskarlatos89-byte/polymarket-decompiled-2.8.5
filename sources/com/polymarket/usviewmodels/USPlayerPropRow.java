package com.polymarket.usviewmodels;

import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00018B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB;\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\u0015\u0010 \u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010#\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010)\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010+\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J;\u0010,\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0082 J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\u0019\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0082 J\u0016\u00104\u001a\b\u0012\u0004\u0012\u000200052\u0006\u00106\u001a\u00020\u0013H\u0016J\u0017\u00107\u001a\b\u0012\u0004\u0012\u000200052\u0006\u00106\u001a\u00020\u0013H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010\u001f¨\u00069"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropRow;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "player", "Lcom/polymarket/usviewmodels/USPlayerPropPlayer;", "markers", "", "Lcom/polymarket/usviewmodels/USPlayerPropMarker;", "defaultMarkerIndex", "", "statLabel", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/USPlayerPropPlayer;Ljava/util/List;ILjava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getPlayer", "()Lcom/polymarket/usviewmodels/USPlayerPropPlayer;", "Swift_player", "getMarkers", "()Ljava/util/List;", "Swift_markers", "getDefaultMarkerIndex", "()I", "Swift_defaultMarkerIndex", "getStatLabel", "Swift_statLabel", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class USPlayerPropRow implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public USPlayerPropRow(String str, USPlayerPropPlayer uSPlayerPropPlayer, List<USPlayerPropMarker> list, int i, String str2) {
        str.getClass();
        uSPlayerPropPlayer.getClass();
        list.getClass();
        str2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, uSPlayerPropPlayer, list, i, str2);
    }

    private final native long Swift_constructor_0(String id, USPlayerPropPlayer player, List<USPlayerPropMarker> markers, int defaultMarkerIndex, String statLabel);

    private final native int Swift_defaultMarkerIndex(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isequal(USPlayerPropRow lhs, USPlayerPropRow rhs);

    private final native List<USPlayerPropMarker> Swift_markers(long Swift_peer);

    private final native USPlayerPropPlayer Swift_player(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_statLabel(long Swift_peer);

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
        if (!(other instanceof USPlayerPropRow)) {
            return false;
        }
        return Swift_isequal(this, (USPlayerPropRow) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final int getDefaultMarkerIndex() {
        return Swift_defaultMarkerIndex(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final List<USPlayerPropMarker> getMarkers() {
        return Swift_markers(this.Swift_peer);
    }

    public final USPlayerPropPlayer getPlayer() {
        return Swift_player(this.Swift_peer);
    }

    public final String getStatLabel() {
        return Swift_statLabel(this.Swift_peer);
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

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public USPlayerPropRow(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ USPlayerPropRow(String str, USPlayerPropPlayer uSPlayerPropPlayer, List list, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uSPlayerPropPlayer, list, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str2);
    }
}

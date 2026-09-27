package com.polymarket.usviewmodels;

import java.net.URI;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBk\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0019¢\u0006\u0004\b\b\u0010\u001aJ\u0006\u0010\u001f\u001a\u00020 J\u0015\u0010!\u001a\u00020 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0016J\u0015\u0010%\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010*\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00102\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u00104\u001a\u0004\u0018\u00010\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u00105J\u001c\u00106\u001a\u0004\u0018\u00010\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u00105J\u001b\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jn\u0010:\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00162\b\u0010=\u001a\u0004\u0018\u00010>H\u0096\u0002J\u0019\u0010?\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0000H\u0082 J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020>0C2\u0006\u0010D\u001a\u00020\u0014H\u0016J\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020>0C2\u0006\u0010D\u001a\u00020\u0014H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u00103R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00198F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006G"}, d2 = {"Lcom/polymarket/usviewmodels/PlayerPropRowPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "rowID", "", "playerName", "playerImageURL", "Ljava/net/URI;", "statLabel", "markers", "", "Lcom/polymarket/usviewmodels/USPlayerPropMarker;", "selectedMarkerIndex", "", "isSelected", "", "isShortSelected", "selectedMarkerIDs", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Ljava/lang/String;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Set;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getRowID", "()Ljava/lang/String;", "Swift_rowID", "getPlayerName", "Swift_playerName", "getPlayerImageURL", "()Ljava/net/URI;", "Swift_playerImageURL", "getStatLabel", "Swift_statLabel", "getMarkers", "()Ljava/util/List;", "Swift_markers", "getSelectedMarkerIndex", "()I", "Swift_selectedMarkerIndex", "()Ljava/lang/Boolean;", "Swift_isSelected", "(J)Ljava/lang/Boolean;", "Swift_isShortSelected", "getSelectedMarkerIDs", "()Ljava/util/Set;", "Swift_selectedMarkerIDs", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Ljava/lang/String;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Set;)J", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlayerPropRowPresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public PlayerPropRowPresentation(String str, String str2, URI uri, String str3, List<USPlayerPropMarker> list, int i, Boolean bool, Boolean bool2, Set<String> set) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, uri, str3, list, i, bool, bool2, set);
    }

    private final native long Swift_constructor_0(String rowID, String playerName, URI playerImageURL, String statLabel, List<USPlayerPropMarker> markers, int selectedMarkerIndex, Boolean isSelected, Boolean isShortSelected, Set<String> selectedMarkerIDs);

    private final native Boolean Swift_isSelected(long Swift_peer);

    private final native Boolean Swift_isShortSelected(long Swift_peer);

    private final native boolean Swift_isequal(PlayerPropRowPresentation lhs, PlayerPropRowPresentation rhs);

    private final native List<USPlayerPropMarker> Swift_markers(long Swift_peer);

    private final native URI Swift_playerImageURL(long Swift_peer);

    private final native String Swift_playerName(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_rowID(long Swift_peer);

    private final native Set<String> Swift_selectedMarkerIDs(long Swift_peer);

    private final native int Swift_selectedMarkerIndex(long Swift_peer);

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
        if (!(other instanceof PlayerPropRowPresentation)) {
            return false;
        }
        return Swift_isequal(this, (PlayerPropRowPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final List<USPlayerPropMarker> getMarkers() {
        return Swift_markers(this.Swift_peer);
    }

    public final URI getPlayerImageURL() {
        return Swift_playerImageURL(this.Swift_peer);
    }

    public final String getPlayerName() {
        return Swift_playerName(this.Swift_peer);
    }

    public final String getRowID() {
        return Swift_rowID(this.Swift_peer);
    }

    public final Set<String> getSelectedMarkerIDs() {
        return Swift_selectedMarkerIDs(this.Swift_peer);
    }

    public final int getSelectedMarkerIndex() {
        return Swift_selectedMarkerIndex(this.Swift_peer);
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

    public final Boolean isSelected() {
        return Swift_isSelected(this.Swift_peer);
    }

    public final Boolean isShortSelected() {
        return Swift_isShortSelected(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public PlayerPropRowPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ PlayerPropRowPresentation(String str, String str2, URI uri, String str3, List list, int i, Boolean bool, Boolean bool2, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, uri, str3, list, i, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : set);
    }
}

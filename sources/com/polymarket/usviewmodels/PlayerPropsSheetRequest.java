package com.polymarket.usviewmodels;

import com.polymarket.data.EComboPopularPlayer;
import com.polymarket.data.EEvent;
import com.polymarket.data.ESportsTeam;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB7\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J9\u0010-\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 J\u0013\u0010.\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\u0019\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0082 J\u0016\u00104\u001a\b\u0012\u0004\u0012\u000200052\u0006\u00106\u001a\u00020\u001dH\u0016J\u0017\u00107\u001a\b\u0012\u0004\u0012\u000200052\u0006\u00106\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00069"}, d2 = {"Lcom/polymarket/usviewmodels/PlayerPropsSheetRequest;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "event", "Lcom/polymarket/data/EEvent;", "player", "Lcom/polymarket/data/EComboPopularPlayer;", "team", "Lcom/polymarket/data/ESportsTeam;", "preferredMarketSlug", "", "expandsPreferredLine", "", "(Lcom/polymarket/data/EEvent;Lcom/polymarket/data/EComboPopularPlayer;Lcom/polymarket/data/ESportsTeam;Ljava/lang/String;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getEvent", "()Lcom/polymarket/data/EEvent;", "Swift_event", "getPlayer", "()Lcom/polymarket/data/EComboPopularPlayer;", "Swift_player", "getTeam", "()Lcom/polymarket/data/ESportsTeam;", "Swift_team", "getPreferredMarketSlug", "()Ljava/lang/String;", "Swift_preferredMarketSlug", "getExpandsPreferredLine", "()Z", "Swift_expandsPreferredLine", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlayerPropsSheetRequest implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public PlayerPropsSheetRequest(EEvent eEvent, EComboPopularPlayer eComboPopularPlayer, ESportsTeam eSportsTeam, String str, boolean z) {
        eEvent.getClass();
        eComboPopularPlayer.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eEvent, eComboPopularPlayer, eSportsTeam, str, z);
    }

    private final native long Swift_constructor_0(EEvent event, EComboPopularPlayer player, ESportsTeam team, String preferredMarketSlug, boolean expandsPreferredLine);

    private final native EEvent Swift_event(long Swift_peer);

    private final native boolean Swift_expandsPreferredLine(long Swift_peer);

    private final native boolean Swift_isequal(PlayerPropsSheetRequest lhs, PlayerPropsSheetRequest rhs);

    private final native EComboPopularPlayer Swift_player(long Swift_peer);

    private final native String Swift_preferredMarketSlug(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native ESportsTeam Swift_team(long Swift_peer);

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
        if (!(other instanceof PlayerPropsSheetRequest)) {
            return false;
        }
        return Swift_isequal(this, (PlayerPropsSheetRequest) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final EEvent getEvent() {
        return Swift_event(this.Swift_peer);
    }

    public final boolean getExpandsPreferredLine() {
        return Swift_expandsPreferredLine(this.Swift_peer);
    }

    public final EComboPopularPlayer getPlayer() {
        return Swift_player(this.Swift_peer);
    }

    public final String getPreferredMarketSlug() {
        return Swift_preferredMarketSlug(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final ESportsTeam getTeam() {
        return Swift_team(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public PlayerPropsSheetRequest(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ PlayerPropsSheetRequest(EEvent eEvent, EComboPopularPlayer eComboPopularPlayer, ESportsTeam eSportsTeam, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eEvent, eComboPopularPlayer, eSportsTeam, str, (i & 16) != 0 ? false : z);
    }
}

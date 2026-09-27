package com.polymarket.usviewmodels;

import defpackage.k84;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBc\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0015\u0010\"\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00105\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jg\u00106\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0096\u0002J\u0019\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0000H\u0082 J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020:0?2\u0006\u0010@\u001a\u00020\u001fH\u0016J\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020:0?2\u0006\u0010@\u001a\u00020\u001fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b2\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b4\u0010!¨\u0006C"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPopularEventPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "sportSlug", "", "sportTitle", "leagueText", "leftTeamName", "rightTeamName", "leftTeamColorHex", "rightTeamColorHex", "leftTeamLogoUrl", "Ljava/net/URI;", "rightTeamLogoUrl", "startTimeText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Ljava/net/URI;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getSportSlug", "()Ljava/lang/String;", "Swift_sportSlug", "getSportTitle", "Swift_sportTitle", "getLeagueText", "Swift_leagueText", "getLeftTeamName", "Swift_leftTeamName", "getRightTeamName", "Swift_rightTeamName", "getLeftTeamColorHex", "Swift_leftTeamColorHex", "getRightTeamColorHex", "Swift_rightTeamColorHex", "getLeftTeamLogoUrl", "()Ljava/net/URI;", "Swift_leftTeamLogoUrl", "getRightTeamLogoUrl", "Swift_rightTeamLogoUrl", "getStartTimeText", "Swift_startTimeText", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsPopularEventPresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public SquadsPopularEventPresentation(String str, String str2, String str3, String str4, String str5, String str6, String str7, URI uri, URI uri2, String str8) {
        k84.p(str, str2, str3, str4, str5);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, str5, str6, str7, uri, uri2, str8);
    }

    private final native long Swift_constructor_0(String sportSlug, String sportTitle, String leagueText, String leftTeamName, String rightTeamName, String leftTeamColorHex, String rightTeamColorHex, URI leftTeamLogoUrl, URI rightTeamLogoUrl, String startTimeText);

    private final native boolean Swift_isequal(SquadsPopularEventPresentation lhs, SquadsPopularEventPresentation rhs);

    private final native String Swift_leagueText(long Swift_peer);

    private final native String Swift_leftTeamColorHex(long Swift_peer);

    private final native URI Swift_leftTeamLogoUrl(long Swift_peer);

    private final native String Swift_leftTeamName(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_rightTeamColorHex(long Swift_peer);

    private final native URI Swift_rightTeamLogoUrl(long Swift_peer);

    private final native String Swift_rightTeamName(long Swift_peer);

    private final native String Swift_sportSlug(long Swift_peer);

    private final native String Swift_sportTitle(long Swift_peer);

    private final native String Swift_startTimeText(long Swift_peer);

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
        if (!(other instanceof SquadsPopularEventPresentation)) {
            return false;
        }
        return Swift_isequal(this, (SquadsPopularEventPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getLeagueText() {
        return Swift_leagueText(this.Swift_peer);
    }

    public final String getLeftTeamColorHex() {
        return Swift_leftTeamColorHex(this.Swift_peer);
    }

    public final URI getLeftTeamLogoUrl() {
        return Swift_leftTeamLogoUrl(this.Swift_peer);
    }

    public final String getLeftTeamName() {
        return Swift_leftTeamName(this.Swift_peer);
    }

    public final String getRightTeamColorHex() {
        return Swift_rightTeamColorHex(this.Swift_peer);
    }

    public final URI getRightTeamLogoUrl() {
        return Swift_rightTeamLogoUrl(this.Swift_peer);
    }

    public final String getRightTeamName() {
        return Swift_rightTeamName(this.Swift_peer);
    }

    public final String getSportSlug() {
        return Swift_sportSlug(this.Swift_peer);
    }

    public final String getSportTitle() {
        return Swift_sportTitle(this.Swift_peer);
    }

    public final String getStartTimeText() {
        return Swift_startTimeText(this.Swift_peer);
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

    public SquadsPopularEventPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

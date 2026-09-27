package com.polymarket.usviewmodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBo\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\b\u0010\u001bJ\u0006\u0010 \u001a\u00020!J\u0015\u0010\"\u001a\u00020!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0015\u0010'\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00100\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00102\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00104\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00107\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00109\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010>\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jq\u0010?\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 J\u0013\u0010@\u001a\u00020\u001a2\b\u0010A\u001a\u0004\u0018\u00010BH\u0096\u0002J\u0019\u0010C\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0000H\u0082 J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020B0G2\u0006\u0010H\u001a\u00020$H\u0016J\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020B0G2\u0006\u0010H\u001a\u00020$H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b3\u0010&R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b8\u0010&R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010=¨\u0006K"}, d2 = {"Lcom/polymarket/usviewmodels/ComboReceiptCardPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "titleText", "", "marketsText", "sideTagText", "wonCountText", "state", "Lcom/polymarket/usviewmodels/SquadsPositionCardState;", "costTitle", "costText", "details", "Lcom/polymarket/usviewmodels/SquadsPositionDetailsPresentation;", "multiplierText", "legGroups", "", "Lcom/polymarket/usviewmodels/ComboLegGroupPresentation;", "isLegsReady", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/SquadsPositionCardState;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/SquadsPositionDetailsPresentation;Ljava/lang/String;Ljava/util/List;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getTitleText", "()Ljava/lang/String;", "Swift_titleText", "getMarketsText", "Swift_marketsText", "getSideTagText", "Swift_sideTagText", "getWonCountText", "Swift_wonCountText", "getState", "()Lcom/polymarket/usviewmodels/SquadsPositionCardState;", "Swift_state", "getCostTitle", "Swift_costTitle", "getCostText", "Swift_costText", "getDetails", "()Lcom/polymarket/usviewmodels/SquadsPositionDetailsPresentation;", "Swift_details", "getMultiplierText", "Swift_multiplierText", "getLegGroups", "()Ljava/util/List;", "Swift_legGroups", "()Z", "Swift_isLegsReady", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComboReceiptCardPresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ComboReceiptCardPresentation(String str, String str2, String str3, String str4, SquadsPositionCardState squadsPositionCardState, String str5, String str6, SquadsPositionDetailsPresentation squadsPositionDetailsPresentation, String str7, List<ComboLegGroupPresentation> list, boolean z) {
        str.getClass();
        str2.getClass();
        squadsPositionCardState.getClass();
        str5.getClass();
        str6.getClass();
        squadsPositionDetailsPresentation.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, squadsPositionCardState, str5, str6, squadsPositionDetailsPresentation, str7, list, z);
    }

    private final native long Swift_constructor_0(String titleText, String marketsText, String sideTagText, String wonCountText, SquadsPositionCardState state, String costTitle, String costText, SquadsPositionDetailsPresentation details, String multiplierText, List<ComboLegGroupPresentation> legGroups, boolean isLegsReady);

    private final native String Swift_costText(long Swift_peer);

    private final native String Swift_costTitle(long Swift_peer);

    private final native SquadsPositionDetailsPresentation Swift_details(long Swift_peer);

    private final native boolean Swift_isLegsReady(long Swift_peer);

    private final native boolean Swift_isequal(ComboReceiptCardPresentation lhs, ComboReceiptCardPresentation rhs);

    private final native List<ComboLegGroupPresentation> Swift_legGroups(long Swift_peer);

    private final native String Swift_marketsText(long Swift_peer);

    private final native String Swift_multiplierText(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_sideTagText(long Swift_peer);

    private final native SquadsPositionCardState Swift_state(long Swift_peer);

    private final native String Swift_titleText(long Swift_peer);

    private final native String Swift_wonCountText(long Swift_peer);

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
        if (!(other instanceof ComboReceiptCardPresentation)) {
            return false;
        }
        return Swift_isequal(this, (ComboReceiptCardPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getCostText() {
        return Swift_costText(this.Swift_peer);
    }

    public final String getCostTitle() {
        return Swift_costTitle(this.Swift_peer);
    }

    public final SquadsPositionDetailsPresentation getDetails() {
        return Swift_details(this.Swift_peer);
    }

    public final List<ComboLegGroupPresentation> getLegGroups() {
        return Swift_legGroups(this.Swift_peer);
    }

    public final String getMarketsText() {
        return Swift_marketsText(this.Swift_peer);
    }

    public final String getMultiplierText() {
        return Swift_multiplierText(this.Swift_peer);
    }

    public final String getSideTagText() {
        return Swift_sideTagText(this.Swift_peer);
    }

    public final SquadsPositionCardState getState() {
        return Swift_state(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTitleText() {
        return Swift_titleText(this.Swift_peer);
    }

    public final String getWonCountText() {
        return Swift_wonCountText(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isLegsReady() {
        return Swift_isLegsReady(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public ComboReceiptCardPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ComboReceiptCardPresentation(String str, String str2, String str3, String str4, SquadsPositionCardState squadsPositionCardState, String str5, String str6, SquadsPositionDetailsPresentation squadsPositionDetailsPresentation, String str7, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, squadsPositionCardState, str5, str6, squadsPositionDetailsPresentation, str7, list, z);
    }
}

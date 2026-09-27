package com.polymarket.usviewmodels;

import com.polymarket.designtokens.DesignTokens;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0004VWXYB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001a\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001d\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010 \u001a\u0004\u0018\u00010\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020.0%2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00104\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00109\u001a\u0004\u0018\u0001062\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010=\u001a\u00020;2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010?\u001a\u00020;2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010B\u001a\u0004\u0018\u00010\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010D\u001a\u00020;2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010H\u001a\u0004\u0018\u00010\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010IJ\u0015\u0010K\u001a\u00020;2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010L\u001a\u00020;2\b\u0010M\u001a\u0004\u0018\u00010NH\u0096\u0002J\u0019\u0010O\u001a\u00020;2\u0006\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0000H\u0082 J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020N0S2\u0006\u0010T\u001a\u00020\u0012H\u0016J\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020N0S2\u0006\u0010T\u001a\u00020\u0012H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010!\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0016R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010*\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020.0%8F¢\u0006\u0006\u001a\u0004\b/\u0010(R\u0011\u00101\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00105\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010:\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b:\u0010<R\u0011\u0010>\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0013\u0010@\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bA\u0010\u0016R\u0011\u0010C\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bC\u0010<R\u0013\u0010E\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010J\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bJ\u0010<¨\u0006Z"}, d2 = {"Lcom/polymarket/usviewmodels/GameLineSectionPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "subtitlePrefix", "getSubtitlePrefix", "Swift_subtitlePrefix", "subtitleTeamName", "getSubtitleTeamName", "Swift_subtitleTeamName", "subtitleSuffix", "getSubtitleSuffix", "Swift_subtitleSuffix", "subBuckets", "", "Lcom/polymarket/usviewmodels/GameLineSectionPresentation$SubBucketPill;", "getSubBuckets", "()Ljava/util/List;", "Swift_subBuckets", "selectedSubBucketID", "getSelectedSubBucketID", "Swift_selectedSubBucketID", "lineOptions", "Lcom/polymarket/usviewmodels/GameLineSectionPresentation$DialOption;", "getLineOptions", "Swift_lineOptions", "selectedLineIndex", "getSelectedLineIndex", "()I", "Swift_selectedLineIndex", "dial", "Lcom/polymarket/usviewmodels/GameLineSectionPresentation$DialPresentation;", "getDial", "()Lcom/polymarket/usviewmodels/GameLineSectionPresentation$DialPresentation;", "Swift_dial", "isSectionExpanded", "", "()Z", "Swift_isSectionExpanded", "isLineDialExpanded", "Swift_isLineDialExpanded", "selectedLineLabel", "getSelectedLineLabel", "Swift_selectedLineLabel", "isExpandable", "Swift_isExpandable", "collapsedRowLimit", "getCollapsedRowLimit", "()Ljava/lang/Integer;", "Swift_collapsedRowLimit", "(J)Ljava/lang/Integer;", "isRowsExpanded", "Swift_isRowsExpanded", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "SubBucketPill", "DialPresentation", "DialOption", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GameLineSectionPresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001a\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001f\u001a\u00020\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010&2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010+\u001a\u00020!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010/\u001a\u00020!2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\u0019\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0000H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u000201062\u0006\u00107\u001a\u00020\u0012H\u0016J\u0017\u00108\u001a\b\u0012\u0004\u0012\u000201062\u0006\u00107\u001a\u00020\u0012H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b*\u0010#R\u0011\u0010,\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b-\u0010#¨\u0006:"}, d2 = {"Lcom/polymarket/usviewmodels/GameLineSectionPresentation$DialOption;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", "label", "getLabel", "Swift_label", "value", "", "getValue", "()D", "Swift_value", "hasPosition", "", "getHasPosition", "()Z", "Swift_hasPosition", "teamColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "getTeamColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_teamColor", "isResolved", "Swift_isResolved", "hasSelection", "getHasSelection", "Swift_hasSelection", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DialOption implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public DialOption(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native boolean Swift_hasPosition(long Swift_peer);

        private final native boolean Swift_hasSelection(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isResolved(long Swift_peer);

        private final native boolean Swift_isequal(DialOption lhs, DialOption rhs);

        private final native String Swift_label(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native DesignTokens.SemanticColor Swift_teamColor(long Swift_peer);

        private final native double Swift_value(long Swift_peer);

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
            if (!(other instanceof DialOption)) {
                return false;
            }
            return Swift_isequal(this, (DialOption) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final boolean getHasPosition() {
            return Swift_hasPosition(this.Swift_peer);
        }

        public final boolean getHasSelection() {
            return Swift_hasSelection(this.Swift_peer);
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
        }

        public final String getLabel() {
            return Swift_label(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final DesignTokens.SemanticColor getTeamColor() {
            return Swift_teamColor(this.Swift_peer);
        }

        public final double getValue() {
            return Swift_value(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isResolved() {
            return Swift_isResolved(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001c\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0019\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0000H\u0082 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020 0%2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020 0%2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/polymarket/usviewmodels/GameLineSectionPresentation$DialPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "options", "", "Lcom/polymarket/usviewmodels/GameLineSectionPresentation$DialOption;", "getOptions", "()Ljava/util/List;", "Swift_options", "selectedIndex", "getSelectedIndex", "()I", "Swift_selectedIndex", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DialPresentation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public DialPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native boolean Swift_isequal(DialPresentation lhs, DialPresentation rhs);

        private final native List<DialOption> Swift_options(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native int Swift_selectedIndex(long Swift_peer);

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
            if (!(other instanceof DialPresentation)) {
                return false;
            }
            return Swift_isequal(this, (DialPresentation) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final List<DialOption> getOptions() {
            return Swift_options(this.Swift_peer);
        }

        public final int getSelectedIndex() {
            return Swift_selectedIndex(this.Swift_peer);
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
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001a\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001f\u001a\u00020\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0019\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0012H\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0012H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/polymarket/usviewmodels/GameLineSectionPresentation$SubBucketPill;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", "label", "getLabel", "Swift_label", "hasSelection", "", "getHasSelection", "()Z", "Swift_hasSelection", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SubBucketPill implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public SubBucketPill(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native boolean Swift_hasSelection(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(SubBucketPill lhs, SubBucketPill rhs);

        private final native String Swift_label(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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
            if (!(other instanceof SubBucketPill)) {
                return false;
            }
            return Swift_isequal(this, (SubBucketPill) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final boolean getHasSelection() {
            return Swift_hasSelection(this.Swift_peer);
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
        }

        public final String getLabel() {
            return Swift_label(this.Swift_peer);
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
    }

    public GameLineSectionPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private final native Integer Swift_collapsedRowLimit(long Swift_peer);

    private final native DialPresentation Swift_dial(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isExpandable(long Swift_peer);

    private final native boolean Swift_isLineDialExpanded(long Swift_peer);

    private final native boolean Swift_isRowsExpanded(long Swift_peer);

    private final native boolean Swift_isSectionExpanded(long Swift_peer);

    private final native boolean Swift_isequal(GameLineSectionPresentation lhs, GameLineSectionPresentation rhs);

    private final native List<DialOption> Swift_lineOptions(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native int Swift_selectedLineIndex(long Swift_peer);

    private final native String Swift_selectedLineLabel(long Swift_peer);

    private final native String Swift_selectedSubBucketID(long Swift_peer);

    private final native List<SubBucketPill> Swift_subBuckets(long Swift_peer);

    private final native String Swift_subtitlePrefix(long Swift_peer);

    private final native String Swift_subtitleSuffix(long Swift_peer);

    private final native String Swift_subtitleTeamName(long Swift_peer);

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
        if (!(other instanceof GameLineSectionPresentation)) {
            return false;
        }
        return Swift_isequal(this, (GameLineSectionPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final Integer getCollapsedRowLimit() {
        return Swift_collapsedRowLimit(this.Swift_peer);
    }

    public final DialPresentation getDial() {
        return Swift_dial(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final List<DialOption> getLineOptions() {
        return Swift_lineOptions(this.Swift_peer);
    }

    public final int getSelectedLineIndex() {
        return Swift_selectedLineIndex(this.Swift_peer);
    }

    public final String getSelectedLineLabel() {
        return Swift_selectedLineLabel(this.Swift_peer);
    }

    public final String getSelectedSubBucketID() {
        return Swift_selectedSubBucketID(this.Swift_peer);
    }

    public final List<SubBucketPill> getSubBuckets() {
        return Swift_subBuckets(this.Swift_peer);
    }

    public final String getSubtitlePrefix() {
        return Swift_subtitlePrefix(this.Swift_peer);
    }

    public final String getSubtitleSuffix() {
        return Swift_subtitleSuffix(this.Swift_peer);
    }

    public final String getSubtitleTeamName() {
        return Swift_subtitleTeamName(this.Swift_peer);
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

    public final boolean isExpandable() {
        return Swift_isExpandable(this.Swift_peer);
    }

    public final boolean isLineDialExpanded() {
        return Swift_isLineDialExpanded(this.Swift_peer);
    }

    public final boolean isRowsExpanded() {
        return Swift_isRowsExpanded(this.Swift_peer);
    }

    public final boolean isSectionExpanded() {
        return Swift_isSectionExpanded(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }
}

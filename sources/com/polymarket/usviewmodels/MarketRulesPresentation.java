package com.polymarket.usviewmodels;

import com.fingerprintjs.android.fpjs_pro.g;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u000289B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J=\u0010)\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010.\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\u0019\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0082 J\u0016\u00104\u001a\b\u0012\u0004\u0012\u000200052\u0006\u00106\u001a\u00020\u001cH\u0016J\u0017\u00107\u001a\b\u0012\u0004\u0012\u000200052\u0006\u00106\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010&R\u0013\u0010*\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006:"}, d2 = {"Lcom/polymarket/usviewmodels/MarketRulesPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "sectionTitle", "", "items", "", "Lcom/polymarket/usviewmodels/MarketRulesPresentation$RuleItem;", "selectedItemID", "showsPicker", "", "isExpanded", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZ)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getSectionTitle", "()Ljava/lang/String;", "Swift_sectionTitle", "getItems", "()Ljava/util/List;", "Swift_items", "getSelectedItemID", "Swift_selectedItemID", "getShowsPicker", "()Z", "Swift_showsPicker", "Swift_isExpanded", "Swift_constructor_0", "selectedItem", "getSelectedItem", "()Lcom/polymarket/usviewmodels/MarketRulesPresentation$RuleItem;", "Swift_selectedItem", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "RuleItem", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MarketRulesPresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public MarketRulesPresentation(String str, List<RuleItem> list, String str2, boolean z, boolean z2) {
        str.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, list, str2, z, z2);
    }

    private final native long Swift_constructor_0(String sectionTitle, List<RuleItem> items, String selectedItemID, boolean showsPicker, boolean isExpanded);

    private final native boolean Swift_isExpanded(long Swift_peer);

    private final native boolean Swift_isequal(MarketRulesPresentation lhs, MarketRulesPresentation rhs);

    private final native List<RuleItem> Swift_items(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_sectionTitle(long Swift_peer);

    private final native RuleItem Swift_selectedItem(long Swift_peer);

    private final native String Swift_selectedItemID(long Swift_peer);

    private final native boolean Swift_showsPicker(long Swift_peer);

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
        if (!(other instanceof MarketRulesPresentation)) {
            return false;
        }
        return Swift_isequal(this, (MarketRulesPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final List<RuleItem> getItems() {
        return Swift_items(this.Swift_peer);
    }

    public final String getSectionTitle() {
        return Swift_sectionTitle(this.Swift_peer);
    }

    public final RuleItem getSelectedItem() {
        return Swift_selectedItem(this.Swift_peer);
    }

    public final String getSelectedItemID() {
        return Swift_selectedItemID(this.Swift_peer);
    }

    public final boolean getShowsPicker() {
        return Swift_showsPicker(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isExpanded() {
        return Swift_isExpanded(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J/\u0010 \u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0082 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\u0019\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0082 J\b\u0010(\u001a\u00020)H\u0016J\u0015\u0010*\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020$0,2\u0006\u0010-\u001a\u00020)H\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020$0,2\u0006\u0010-\u001a\u00020)H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/MarketRulesPresentation$RuleItem;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "category", "bodyMarkdown", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getCategory", "Swift_category", "getBodyMarkdown", "Swift_bodyMarkdown", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class RuleItem implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public RuleItem(String str, String str2, String str3, String str4) {
            g.x(str, str2, str4);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4);
        }

        private final native String Swift_bodyMarkdown(long Swift_peer);

        private final native String Swift_category(long Swift_peer);

        private final native long Swift_constructor_0(String id, String title, String category, String bodyMarkdown);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(RuleItem lhs, RuleItem rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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
            if (!(other instanceof RuleItem)) {
                return false;
            }
            return Swift_isequal(this, (RuleItem) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getBodyMarkdown() {
            return Swift_bodyMarkdown(this.Swift_peer);
        }

        public final String getCategory() {
            return Swift_category(this.Swift_peer);
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public RuleItem(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public MarketRulesPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

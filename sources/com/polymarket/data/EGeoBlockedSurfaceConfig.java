package com.polymarket.data;

import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBu\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010#\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010*\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Ji\u0010/\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000fH\u0082 J\u0012\u00100\u001a\u0004\u0018\u00010\u000b2\b\u00101\u001a\u0004\u0018\u00010\u000bJ!\u00102\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u00101\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0012\u00103\u001a\u0004\u0018\u00010\u000b2\b\u00101\u001a\u0004\u0018\u00010\u000bJ!\u00104\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u00101\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0012\u00105\u001a\u0004\u0018\u00010\u000b2\b\u00101\u001a\u0004\u0018\u00010\u000bJ!\u00106\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u00101\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0017\u0010;\u001a\u0004\u0018\u0001082\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010@\u001a\u00020=2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0010\u0010A\u001a\u00020=2\b\u0010B\u001a\u0004\u0018\u00010\u000bJ\u001f\u0010C\u001a\u00020=2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u0010D\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0013\u0010E\u001a\u00020=2\b\u0010F\u001a\u0004\u0018\u00010GH\u0096\u0002J\u0019\u0010H\u001a\u00020=2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0082 J\b\u0010K\u001a\u00020LH\u0016J\u0015\u0010M\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020G0O2\u0006\u0010P\u001a\u00020LH\u0016J\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020G0O2\u0006\u0010P\u001a\u00020LH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001eR\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0013\u00107\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006S"}, d2 = {"Lcom/polymarket/data/EGeoBlockedSurfaceConfig;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "body", "primaryButtonTitle", "actionBlockedInState", "", "imageUrl", "accent", "dismissal", "buttons", "Lcom/polymarket/data/EGeoBlockedButtonConfig;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getTitle", "()Ljava/lang/String;", "Swift_title", "getBody", "Swift_body", "getPrimaryButtonTitle", "Swift_primaryButtonTitle", "getActionBlockedInState", "()Ljava/util/List;", "Swift_actionBlockedInState", "getImageUrl", "Swift_imageUrl", "getAccent", "Swift_accent", "getDismissal", "Swift_dismissal", "getButtons", "Swift_buttons", "Swift_constructor_0", "resolvedTitle", "stateName", "Swift_resolvedTitle_1", "resolvedBody", "Swift_resolvedBody_2", "resolvedPrimaryButtonTitle", "Swift_resolvedPrimaryButtonTitle_3", "resolvedImageURL", "Ljava/net/URI;", "getResolvedImageURL", "()Ljava/net/URI;", "Swift_resolvedImageURL", "hasStateBlockList", "", "getHasStateBlockList", "()Z", "Swift_hasStateBlockList", "isActionBlocked", "inState", "Swift_isActionBlocked_4", "stateCode", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EGeoBlockedSurfaceConfig implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public /* synthetic */ EGeoBlockedSurfaceConfig(String str, String str2, String str3, List list, String str4, String str5, String str6, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : list2);
    }

    private final native String Swift_accent(long Swift_peer);

    private final native List<String> Swift_actionBlockedInState(long Swift_peer);

    private final native String Swift_body(long Swift_peer);

    private final native List<EGeoBlockedButtonConfig> Swift_buttons(long Swift_peer);

    private final native long Swift_constructor_0(String title, String body, String primaryButtonTitle, List<String> actionBlockedInState, String imageUrl, String accent, String dismissal, List<EGeoBlockedButtonConfig> buttons);

    private final native String Swift_dismissal(long Swift_peer);

    private final native boolean Swift_hasStateBlockList(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_imageUrl(long Swift_peer);

    private final native boolean Swift_isActionBlocked_4(long Swift_peer, String stateCode);

    private final native boolean Swift_isequal(EGeoBlockedSurfaceConfig lhs, EGeoBlockedSurfaceConfig rhs);

    private final native String Swift_primaryButtonTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_resolvedBody_2(long Swift_peer, String stateName);

    private final native URI Swift_resolvedImageURL(long Swift_peer);

    private final native String Swift_resolvedPrimaryButtonTitle_3(long Swift_peer, String stateName);

    private final native String Swift_resolvedTitle_1(long Swift_peer, String stateName);

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
        if (!(other instanceof EGeoBlockedSurfaceConfig)) {
            return false;
        }
        return Swift_isequal(this, (EGeoBlockedSurfaceConfig) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getAccent() {
        return Swift_accent(this.Swift_peer);
    }

    public final List<String> getActionBlockedInState() {
        return Swift_actionBlockedInState(this.Swift_peer);
    }

    public final String getBody() {
        return Swift_body(this.Swift_peer);
    }

    public final List<EGeoBlockedButtonConfig> getButtons() {
        return Swift_buttons(this.Swift_peer);
    }

    public final String getDismissal() {
        return Swift_dismissal(this.Swift_peer);
    }

    public final boolean getHasStateBlockList() {
        return Swift_hasStateBlockList(this.Swift_peer);
    }

    public final String getImageUrl() {
        return Swift_imageUrl(this.Swift_peer);
    }

    public final String getPrimaryButtonTitle() {
        return Swift_primaryButtonTitle(this.Swift_peer);
    }

    public final URI getResolvedImageURL() {
        return Swift_resolvedImageURL(this.Swift_peer);
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

    public final boolean isActionBlocked(String inState) {
        return Swift_isActionBlocked_4(this.Swift_peer, inState);
    }

    public final String resolvedBody(String stateName) {
        return Swift_resolvedBody_2(this.Swift_peer, stateName);
    }

    public final String resolvedPrimaryButtonTitle(String stateName) {
        return Swift_resolvedPrimaryButtonTitle_3(this.Swift_peer, stateName);
    }

    public final String resolvedTitle(String stateName) {
        return Swift_resolvedTitle_1(this.Swift_peer, stateName);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public EGeoBlockedSurfaceConfig(String str, String str2, String str3, List<String> list, String str4, String str5, String str6, List<EGeoBlockedButtonConfig> list2) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, list, str4, str5, str6, list2);
    }

    public EGeoBlockedSurfaceConfig(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

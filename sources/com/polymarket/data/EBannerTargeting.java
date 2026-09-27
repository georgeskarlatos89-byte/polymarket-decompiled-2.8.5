package com.polymarket.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBK\b\u0016\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001d\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010!\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\"J\u001d\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JL\u0010%\u001a\u00060\u0004j\u0002`\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bH\u0082 ¢\u0006\u0002\u0010&J\u000e\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)J\u001d\u0010*\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010(\u001a\u00020)H\u0082 J\u0013\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\u0019\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0000H\u0082 J\b\u00101\u001a\u00020\fH\u0016J\u0015\u00102\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020-042\u0006\u00105\u001a\u00020\fH\u0016J\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020-042\u0006\u00105\u001a\u00020\fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001b¨\u00068"}, d2 = {"Lcom/polymarket/data/EBannerTargeting;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "tabs", "", "", "tabIds", "", "rootNavOnly", "", "scenes", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getTabs", "()Ljava/util/List;", "Swift_tabs", "getTabIds", "Swift_tabIds", "getRootNavOnly", "()Ljava/lang/Boolean;", "Swift_rootNavOnly", "(J)Ljava/lang/Boolean;", "getScenes", "Swift_scenes", "Swift_constructor_0", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;)J", "matches", "context", "Lcom/polymarket/data/EBannerContext;", "Swift_matches_1", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EBannerTargeting implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public /* synthetic */ EBannerTargeting(List list, List list2, Boolean bool, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list3);
    }

    private final native long Swift_constructor_0(List<Integer> tabs, List<String> tabIds, Boolean rootNavOnly, List<String> scenes);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isequal(EBannerTargeting lhs, EBannerTargeting rhs);

    private final native boolean Swift_matches_1(long Swift_peer, EBannerContext context);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native Boolean Swift_rootNavOnly(long Swift_peer);

    private final native List<String> Swift_scenes(long Swift_peer);

    private final native List<String> Swift_tabIds(long Swift_peer);

    private final native List<Integer> Swift_tabs(long Swift_peer);

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
        if (!(other instanceof EBannerTargeting)) {
            return false;
        }
        return Swift_isequal(this, (EBannerTargeting) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final Boolean getRootNavOnly() {
        return Swift_rootNavOnly(this.Swift_peer);
    }

    public final List<String> getScenes() {
        return Swift_scenes(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final List<String> getTabIds() {
        return Swift_tabIds(this.Swift_peer);
    }

    public final List<Integer> getTabs() {
        return Swift_tabs(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final boolean matches(EBannerContext context) {
        context.getClass();
        return Swift_matches_1(this.Swift_peer, context);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public EBannerTargeting(List<Integer> list, List<String> list2, Boolean bool, List<String> list3) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(list, list2, bool, list3);
    }

    public EBannerTargeting(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

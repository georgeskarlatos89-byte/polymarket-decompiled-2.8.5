package com.polymarket.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001d\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001eJ\u001c\u0010 \u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001eJ0\u0010!\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0002\u0010\"J\u0015\u0010&\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010-\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\u0019\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0000H\u0082 J\b\u00105\u001a\u00020\u000bH\u0016J\u0015\u00106\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000201082\u0006\u00109\u001a\u00020\u000bH\u0016J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u000201082\u0006\u00109\u001a\u00020\u000bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010#\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b,\u0010)¨\u0006<"}, d2 = {"Lcom/polymarket/data/EChatRateLimitConfig;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "max", "", "ttlSeconds", "", "blockedSeconds", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getMax", "()Ljava/lang/Integer;", "Swift_max", "(J)Ljava/lang/Integer;", "getTtlSeconds", "()Ljava/lang/Double;", "Swift_ttlSeconds", "(J)Ljava/lang/Double;", "getBlockedSeconds", "Swift_blockedSeconds", "Swift_constructor_0", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)J", "resolvedMax", "getResolvedMax", "()I", "Swift_resolvedMax", "resolvedTtlSeconds", "getResolvedTtlSeconds", "()D", "Swift_resolvedTtlSeconds", "resolvedBlockedSeconds", "getResolvedBlockedSeconds", "Swift_resolvedBlockedSeconds", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EChatRateLimitConfig implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public /* synthetic */ EChatRateLimitConfig(Integer num, Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2);
    }

    private final native Double Swift_blockedSeconds(long Swift_peer);

    private final native long Swift_constructor_0(Integer max, Double ttlSeconds, Double blockedSeconds);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isequal(EChatRateLimitConfig lhs, EChatRateLimitConfig rhs);

    private final native Integer Swift_max(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native double Swift_resolvedBlockedSeconds(long Swift_peer);

    private final native int Swift_resolvedMax(long Swift_peer);

    private final native double Swift_resolvedTtlSeconds(long Swift_peer);

    private final native Double Swift_ttlSeconds(long Swift_peer);

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
        if (!(other instanceof EChatRateLimitConfig)) {
            return false;
        }
        return Swift_isequal(this, (EChatRateLimitConfig) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final Double getBlockedSeconds() {
        return Swift_blockedSeconds(this.Swift_peer);
    }

    public final Integer getMax() {
        return Swift_max(this.Swift_peer);
    }

    public final double getResolvedBlockedSeconds() {
        return Swift_resolvedBlockedSeconds(this.Swift_peer);
    }

    public final int getResolvedMax() {
        return Swift_resolvedMax(this.Swift_peer);
    }

    public final double getResolvedTtlSeconds() {
        return Swift_resolvedTtlSeconds(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final Double getTtlSeconds() {
        return Swift_ttlSeconds(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public EChatRateLimitConfig(Integer num, Double d, Double d2) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(num, d, d2);
    }

    public EChatRateLimitConfig(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

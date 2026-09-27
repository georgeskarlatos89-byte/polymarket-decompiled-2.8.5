package com.polymarket.data;

import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBo\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\b\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\"J\u001c\u0010$\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\"J\u001c\u0010'\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010(J\u001c\u0010*\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010(J\u001d\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u00103\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00108\u001a\u0004\u0018\u00010\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010:\u001a\u0004\u0018\u00010\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jh\u0010;\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0082 ¢\u0006\u0002\u0010<J\u001b\u0010?\u001a\b\u0012\u0004\u0012\u0002000/2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010C\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010D\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010FH\u0096\u0002J\u0019\u0010G\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0000H\u0082 J\b\u0010J\u001a\u00020\u000eH\u0016J\u0015\u0010K\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020F0M2\u0006\u0010N\u001a\u00020\u000eH\u0016J\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020F0M2\u0006\u0010N\u001a\u00020\u000eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b7\u00105R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b9\u00105R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u0002000/8F¢\u0006\u0006\u001a\u0004\b>\u00102R\u0011\u0010@\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006Q"}, d2 = {"Lcom/polymarket/data/EGeoBlockedConfig;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "radarEnabled", "", "failClosedWithoutGrace", "failClosedGraceMinutes", "", "blockedCacheMinutes", "blockingPrivacySignals", "", "", "trade", "Lcom/polymarket/data/EGeoBlockedSurfaceConfig;", "deposit", "vpn", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/polymarket/data/EGeoBlockedSurfaceConfig;Lcom/polymarket/data/EGeoBlockedSurfaceConfig;Lcom/polymarket/data/EGeoBlockedSurfaceConfig;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getRadarEnabled", "()Ljava/lang/Boolean;", "Swift_radarEnabled", "(J)Ljava/lang/Boolean;", "getFailClosedWithoutGrace", "Swift_failClosedWithoutGrace", "getFailClosedGraceMinutes", "()Ljava/lang/Integer;", "Swift_failClosedGraceMinutes", "(J)Ljava/lang/Integer;", "getBlockedCacheMinutes", "Swift_blockedCacheMinutes", "getBlockingPrivacySignals", "()Ljava/util/List;", "Swift_blockingPrivacySignals", "resolvedBlockingPrivacySignals", "", "Lcom/polymarket/data/GeoPrivacySignal;", "getResolvedBlockingPrivacySignals", "()Ljava/util/Set;", "Swift_resolvedBlockingPrivacySignals", "getTrade", "()Lcom/polymarket/data/EGeoBlockedSurfaceConfig;", "Swift_trade", "getDeposit", "Swift_deposit", "getVpn", "Swift_vpn", "Swift_constructor_0", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/polymarket/data/EGeoBlockedSurfaceConfig;Lcom/polymarket/data/EGeoBlockedSurfaceConfig;Lcom/polymarket/data/EGeoBlockedSurfaceConfig;)J", "effectiveBlockingPrivacySignals", "getEffectiveBlockingPrivacySignals", "Swift_effectiveBlockingPrivacySignals", "hasRejectedBlockingPrivacySignals", "getHasRejectedBlockingPrivacySignals", "()Z", "Swift_hasRejectedBlockingPrivacySignals", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EGeoBlockedConfig implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public /* synthetic */ EGeoBlockedConfig(Boolean bool, Boolean bool2, Integer num, Integer num2, List list, EGeoBlockedSurfaceConfig eGeoBlockedSurfaceConfig, EGeoBlockedSurfaceConfig eGeoBlockedSurfaceConfig2, EGeoBlockedSurfaceConfig eGeoBlockedSurfaceConfig3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : eGeoBlockedSurfaceConfig, (i & 64) != 0 ? null : eGeoBlockedSurfaceConfig2, (i & 128) != 0 ? null : eGeoBlockedSurfaceConfig3);
    }

    private final native Integer Swift_blockedCacheMinutes(long Swift_peer);

    private final native List<String> Swift_blockingPrivacySignals(long Swift_peer);

    private final native long Swift_constructor_0(Boolean radarEnabled, Boolean failClosedWithoutGrace, Integer failClosedGraceMinutes, Integer blockedCacheMinutes, List<String> blockingPrivacySignals, EGeoBlockedSurfaceConfig trade, EGeoBlockedSurfaceConfig deposit, EGeoBlockedSurfaceConfig vpn);

    private final native EGeoBlockedSurfaceConfig Swift_deposit(long Swift_peer);

    private final native Set<GeoPrivacySignal> Swift_effectiveBlockingPrivacySignals(long Swift_peer);

    private final native Integer Swift_failClosedGraceMinutes(long Swift_peer);

    private final native Boolean Swift_failClosedWithoutGrace(long Swift_peer);

    private final native boolean Swift_hasRejectedBlockingPrivacySignals(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isequal(EGeoBlockedConfig lhs, EGeoBlockedConfig rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native Boolean Swift_radarEnabled(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native Set<GeoPrivacySignal> Swift_resolvedBlockingPrivacySignals(long Swift_peer);

    private final native EGeoBlockedSurfaceConfig Swift_trade(long Swift_peer);

    private final native EGeoBlockedSurfaceConfig Swift_vpn(long Swift_peer);

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
        if (!(other instanceof EGeoBlockedConfig)) {
            return false;
        }
        return Swift_isequal(this, (EGeoBlockedConfig) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final Integer getBlockedCacheMinutes() {
        return Swift_blockedCacheMinutes(this.Swift_peer);
    }

    public final List<String> getBlockingPrivacySignals() {
        return Swift_blockingPrivacySignals(this.Swift_peer);
    }

    public final EGeoBlockedSurfaceConfig getDeposit() {
        return Swift_deposit(this.Swift_peer);
    }

    public final Set<GeoPrivacySignal> getEffectiveBlockingPrivacySignals() {
        return Swift_effectiveBlockingPrivacySignals(this.Swift_peer);
    }

    public final Integer getFailClosedGraceMinutes() {
        return Swift_failClosedGraceMinutes(this.Swift_peer);
    }

    public final Boolean getFailClosedWithoutGrace() {
        return Swift_failClosedWithoutGrace(this.Swift_peer);
    }

    public final boolean getHasRejectedBlockingPrivacySignals() {
        return Swift_hasRejectedBlockingPrivacySignals(this.Swift_peer);
    }

    public final Boolean getRadarEnabled() {
        return Swift_radarEnabled(this.Swift_peer);
    }

    public final Set<GeoPrivacySignal> getResolvedBlockingPrivacySignals() {
        return Swift_resolvedBlockingPrivacySignals(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final EGeoBlockedSurfaceConfig getTrade() {
        return Swift_trade(this.Swift_peer);
    }

    public final EGeoBlockedSurfaceConfig getVpn() {
        return Swift_vpn(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/polymarket/data/EGeoBlockedConfig$Companion;", "", "<init>", "()V", TicketDetailDestinationKt.LAUNCHED_FROM, "Lcom/polymarket/data/EGeoBlockedConfig;", "featureFlags", "", "Lcom/polymarket/data/EFeatureFlagKey;", "Lcom/polymarket/data/EFeatureFlagValue;", "Swift_Companion_from_1", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native EGeoBlockedConfig Swift_Companion_from_1(Map<EFeatureFlagKey, ? extends EFeatureFlagValue> featureFlags);

        public final EGeoBlockedConfig from(Map<EFeatureFlagKey, ? extends EFeatureFlagValue> featureFlags) {
            featureFlags.getClass();
            return Swift_Companion_from_1(featureFlags);
        }

        private Companion() {
        }
    }

    public EGeoBlockedConfig(Boolean bool, Boolean bool2, Integer num, Integer num2, List<String> list, EGeoBlockedSurfaceConfig eGeoBlockedSurfaceConfig, EGeoBlockedSurfaceConfig eGeoBlockedSurfaceConfig2, EGeoBlockedSurfaceConfig eGeoBlockedSurfaceConfig3) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(bool, bool2, num, num2, list, eGeoBlockedSurfaceConfig, eGeoBlockedSurfaceConfig2, eGeoBlockedSurfaceConfig3);
    }

    public EGeoBlockedConfig(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

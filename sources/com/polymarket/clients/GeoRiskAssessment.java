package com.polymarket.clients;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0002>?B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBO\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\b\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020\u0016H\u0016J\u0015\u0010%\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010.\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010/J\u001c\u00101\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010/J\u0017\u00104\u001a\u0004\u0018\u00010\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00107\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JX\u00108\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0082 ¢\u0006\u0002\u00109J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020!0;2\u0006\u0010<\u001a\u00020\u0016H\u0016J\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020!0;2\u0006\u0010<\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006@"}, d2 = {"Lcom/polymarket/clients/GeoRiskAssessment;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "riskLevel", "Lcom/polymarket/clients/GeoRiskAssessment$RiskLevel;", "riskReasons", "", "", "stateCode", "stateAllowed", "", "countryAllowed", "privacy", "Lcom/polymarket/clients/GeoNetworkPrivacy;", "expiresIn", "", "(Lcom/polymarket/clients/GeoRiskAssessment$RiskLevel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/polymarket/clients/GeoNetworkPrivacy;I)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "getRiskLevel", "()Lcom/polymarket/clients/GeoRiskAssessment$RiskLevel;", "Swift_riskLevel", "getRiskReasons", "()Ljava/util/List;", "Swift_riskReasons", "getStateCode", "()Ljava/lang/String;", "Swift_stateCode", "getStateAllowed", "()Ljava/lang/Boolean;", "Swift_stateAllowed", "(J)Ljava/lang/Boolean;", "getCountryAllowed", "Swift_countryAllowed", "getPrivacy", "()Lcom/polymarket/clients/GeoNetworkPrivacy;", "Swift_privacy", "getExpiresIn", "()I", "Swift_expiresIn", "Swift_constructor_0", "(Lcom/polymarket/clients/GeoRiskAssessment$RiskLevel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/polymarket/clients/GeoNetworkPrivacy;I)J", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "RiskLevel", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoRiskAssessment implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0018"}, d2 = {"Lcom/polymarket/clients/GeoRiskAssessment$RiskLevel;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "none", RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW_STR, RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR, "unknown", "escalates", "", "getEscalates", "()Z", "Swift_escalates", Keys.KEY_NAME, "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RiskLevel implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RiskLevel[] $VALUES;
        public static final RiskLevel none = new RiskLevel("none", 0);
        public static final RiskLevel low = new RiskLevel(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW_STR, 1);
        public static final RiskLevel medium = new RiskLevel(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, 2);
        public static final RiskLevel high = new RiskLevel(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR, 3);
        public static final RiskLevel unknown = new RiskLevel("unknown", 4);

        private static final /* synthetic */ RiskLevel[] $values() {
            return new RiskLevel[]{none, low, medium, high, unknown};
        }

        static {
            RiskLevel[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private RiskLevel(String str, int i) {
        }

        private final native boolean Swift_escalates(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RiskLevel valueOf(String str) {
            return (RiskLevel) Enum.valueOf(RiskLevel.class, str);
        }

        public static RiskLevel[] values() {
            return (RiskLevel[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final boolean getEscalates() {
            return Swift_escalates(name());
        }
    }

    public GeoRiskAssessment(RiskLevel riskLevel, List<String> list, String str, Boolean bool, Boolean bool2, GeoNetworkPrivacy geoNetworkPrivacy, int i) {
        riskLevel.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(riskLevel, list, str, bool, bool2, geoNetworkPrivacy, i);
    }

    private final native long Swift_constructor_0(RiskLevel riskLevel, List<String> riskReasons, String stateCode, Boolean stateAllowed, Boolean countryAllowed, GeoNetworkPrivacy privacy, int expiresIn);

    private final native Boolean Swift_countryAllowed(long Swift_peer);

    private final native int Swift_expiresIn(long Swift_peer);

    private final native GeoNetworkPrivacy Swift_privacy(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native RiskLevel Swift_riskLevel(long Swift_peer);

    private final native List<String> Swift_riskReasons(long Swift_peer);

    private final native Boolean Swift_stateAllowed(long Swift_peer);

    private final native String Swift_stateCode(long Swift_peer);

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
        if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final Boolean getCountryAllowed() {
        return Swift_countryAllowed(this.Swift_peer);
    }

    public final int getExpiresIn() {
        return Swift_expiresIn(this.Swift_peer);
    }

    public final GeoNetworkPrivacy getPrivacy() {
        return Swift_privacy(this.Swift_peer);
    }

    public final RiskLevel getRiskLevel() {
        return Swift_riskLevel(this.Swift_peer);
    }

    public final List<String> getRiskReasons() {
        return Swift_riskReasons(this.Swift_peer);
    }

    public final Boolean getStateAllowed() {
        return Swift_stateAllowed(this.Swift_peer);
    }

    public final String getStateCode() {
        return Swift_stateCode(this.Swift_peer);
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

    public GeoRiskAssessment(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

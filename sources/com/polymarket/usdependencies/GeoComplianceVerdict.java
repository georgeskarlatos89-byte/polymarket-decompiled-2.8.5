package com.polymarket.usdependencies;

import com.polymarket.clients.GeoFailureCode;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u00029:B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001c\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010#\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0082 J\u0015\u0010&\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010+\u001a\u00020(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010/\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\u0019\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0000H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u000201062\u0006\u00107\u001a\u00020\u0019H\u0016J\u0017\u00108\u001a\b\u0012\u0004\u0012\u000201062\u0006\u00107\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001eR\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b-\u0010*¨\u0006;"}, d2 = {"Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "kind", "Lcom/polymarket/usdependencies/GeoComplianceVerdict$Kind;", ApiConstant.KEY_CODE, "Lcom/polymarket/clients/GeoFailureCode;", "stateCode", "", "(Lcom/polymarket/usdependencies/GeoComplianceVerdict$Kind;Lcom/polymarket/clients/GeoFailureCode;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getKind", "()Lcom/polymarket/usdependencies/GeoComplianceVerdict$Kind;", "Swift_kind", "getCode", "()Lcom/polymarket/clients/GeoFailureCode;", "Swift_code", "getStateCode", "()Ljava/lang/String;", "Swift_stateCode", "Swift_constructor_0", "resolvedCode", "getResolvedCode", "Swift_resolvedCode", "rendersStateSheet", "", "getRendersStateSheet", "()Z", "Swift_rendersStateSheet", "rendersBlockedSheet", "getRendersBlockedSheet", "Swift_rendersBlockedSheet", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Kind", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoComplianceVerdict implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usdependencies/GeoComplianceVerdict$Kind;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "skipped", "passed", "blocked", "unavailable", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Kind implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind skipped = new Kind("skipped", 0);
        public static final Kind passed = new Kind("passed", 1);
        public static final Kind blocked = new Kind("blocked", 2);
        public static final Kind unavailable = new Kind("unavailable", 3);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{skipped, passed, blocked, unavailable};
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Kind(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public GeoComplianceVerdict(Kind kind, GeoFailureCode geoFailureCode, String str) {
        kind.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(kind, geoFailureCode, str);
    }

    private final native GeoFailureCode Swift_code(long Swift_peer);

    private final native long Swift_constructor_0(Kind kind, GeoFailureCode code, String stateCode);

    private final native boolean Swift_isequal(GeoComplianceVerdict lhs, GeoComplianceVerdict rhs);

    private final native Kind Swift_kind(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native boolean Swift_rendersBlockedSheet(long Swift_peer);

    private final native boolean Swift_rendersStateSheet(long Swift_peer);

    private final native GeoFailureCode Swift_resolvedCode(long Swift_peer);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof GeoComplianceVerdict)) {
            return false;
        }
        return Swift_isequal(this, (GeoComplianceVerdict) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final GeoFailureCode getCode() {
        return Swift_code(this.Swift_peer);
    }

    public final Kind getKind() {
        return Swift_kind(this.Swift_peer);
    }

    public final boolean getRendersBlockedSheet() {
        return Swift_rendersBlockedSheet(this.Swift_peer);
    }

    public final boolean getRendersStateSheet() {
        return Swift_rendersStateSheet(this.Swift_peer);
    }

    public final GeoFailureCode getResolvedCode() {
        return Swift_resolvedCode(this.Swift_peer);
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

    public GeoComplianceVerdict(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ GeoComplianceVerdict(Kind kind, GeoFailureCode geoFailureCode, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kind, geoFailureCode, (i & 4) != 0 ? null : str);
    }
}

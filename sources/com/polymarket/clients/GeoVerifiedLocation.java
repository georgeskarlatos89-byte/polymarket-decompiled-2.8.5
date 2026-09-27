package com.polymarket.clients;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBA\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\b\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010*\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010+J\u001c\u0010-\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010+JF\u0010.\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0082 ¢\u0006\u0002\u0010/J\u0015\u00102\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00104\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u001d062\u0006\u00107\u001a\u00020\u000fH\u0016J\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u001d062\u0006\u00107\u001a\u00020\u000fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b,\u0010)R\u0011\u00100\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00103\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b3\u00101¨\u0006:"}, d2 = {"Lcom/polymarket/clients/GeoVerifiedLocation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "failureReasons", "", "", "stateCode", "expiresIn", "", "stateAllowed", "", "countryAllowed", "(Ljava/util/List;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "getFailureReasons", "()Ljava/util/List;", "Swift_failureReasons", "getStateCode", "()Ljava/lang/String;", "Swift_stateCode", "getExpiresIn", "()I", "Swift_expiresIn", "getStateAllowed", "()Ljava/lang/Boolean;", "Swift_stateAllowed", "(J)Ljava/lang/Boolean;", "getCountryAllowed", "Swift_countryAllowed", "Swift_constructor_0", "(Ljava/util/List;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)J", "isStateRestricted", "()Z", "Swift_isStateRestricted", "isJurisdictionOnly", "Swift_isJurisdictionOnly", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoVerifiedLocation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public GeoVerifiedLocation(List<String> list, String str, int i, Boolean bool, Boolean bool2) {
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(list, str, i, bool, bool2);
    }

    private final native long Swift_constructor_0(List<String> failureReasons, String stateCode, int expiresIn, Boolean stateAllowed, Boolean countryAllowed);

    private final native Boolean Swift_countryAllowed(long Swift_peer);

    private final native int Swift_expiresIn(long Swift_peer);

    private final native List<String> Swift_failureReasons(long Swift_peer);

    private final native boolean Swift_isJurisdictionOnly(long Swift_peer);

    private final native boolean Swift_isStateRestricted(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

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

    public final List<String> getFailureReasons() {
        return Swift_failureReasons(this.Swift_peer);
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

    public final boolean isJurisdictionOnly() {
        return Swift_isJurisdictionOnly(this.Swift_peer);
    }

    public final boolean isStateRestricted() {
        return Swift_isStateRestricted(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public GeoVerifiedLocation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ GeoVerifiedLocation(List list, String str, int i, Boolean bool, Boolean bool2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, i, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2);
    }
}

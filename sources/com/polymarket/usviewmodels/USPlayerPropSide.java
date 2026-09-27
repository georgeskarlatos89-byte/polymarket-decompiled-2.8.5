package com.polymarket.usviewmodels;

import com.polymarket.data.EMarket;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBG\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\b\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010!\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010-\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010/\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JE\u00100\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 J\u0013\u00101\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\u0019\u00104\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0000H\u0082 J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000203082\u0006\u00109\u001a\u00020\u001eH\u0016J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u000203082\u0006\u00109\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010'R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010'R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010'R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010'¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropSide;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "formattedOdds", "probability", "", "isTradable", "", "isOffered", "isBlockedByNoLiquidity", "resolvedResult", "Lcom/polymarket/data/EMarket$SideResult;", "(Ljava/lang/String;Ljava/lang/String;DZZZLcom/polymarket/data/EMarket$SideResult;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getTitle", "()Ljava/lang/String;", "Swift_title", "getFormattedOdds", "Swift_formattedOdds", "getProbability", "()D", "Swift_probability", "()Z", "Swift_isTradable", "Swift_isOffered", "Swift_isBlockedByNoLiquidity", "getResolvedResult", "()Lcom/polymarket/data/EMarket$SideResult;", "Swift_resolvedResult", "isButtonEnabled", "Swift_isButtonEnabled", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USPlayerPropSide implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ USPlayerPropSide(String str, String str2, double d, boolean z, boolean z2, boolean z3, EMarket.SideResult sideResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, z, r7, r8, r9);
        boolean z4;
        boolean z5;
        EMarket.SideResult sideResult2;
        if ((i & 16) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        if ((i & 32) != 0) {
            z5 = false;
        } else {
            z5 = z3;
        }
        if ((i & 64) != 0) {
            sideResult2 = EMarket.SideResult.open;
        } else {
            sideResult2 = sideResult;
        }
    }

    private final native long Swift_constructor_0(String title, String formattedOdds, double probability, boolean isTradable, boolean isOffered, boolean isBlockedByNoLiquidity, EMarket.SideResult resolvedResult);

    private final native String Swift_formattedOdds(long Swift_peer);

    private final native boolean Swift_isBlockedByNoLiquidity(long Swift_peer);

    private final native boolean Swift_isButtonEnabled(long Swift_peer);

    private final native boolean Swift_isOffered(long Swift_peer);

    private final native boolean Swift_isTradable(long Swift_peer);

    private final native boolean Swift_isequal(USPlayerPropSide lhs, USPlayerPropSide rhs);

    private final native double Swift_probability(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native EMarket.SideResult Swift_resolvedResult(long Swift_peer);

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
        if (!(other instanceof USPlayerPropSide)) {
            return false;
        }
        return Swift_isequal(this, (USPlayerPropSide) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getFormattedOdds() {
        return Swift_formattedOdds(this.Swift_peer);
    }

    public final double getProbability() {
        return Swift_probability(this.Swift_peer);
    }

    public final EMarket.SideResult getResolvedResult() {
        return Swift_resolvedResult(this.Swift_peer);
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

    public final boolean isBlockedByNoLiquidity() {
        return Swift_isBlockedByNoLiquidity(this.Swift_peer);
    }

    public final boolean isButtonEnabled() {
        return Swift_isButtonEnabled(this.Swift_peer);
    }

    public final boolean isOffered() {
        return Swift_isOffered(this.Swift_peer);
    }

    public final boolean isTradable() {
        return Swift_isTradable(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public USPlayerPropSide(String str, String str2, double d, boolean z, boolean z2, boolean z3, EMarket.SideResult sideResult) {
        str.getClass();
        str2.getClass();
        sideResult.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, d, z, z2, z3, sideResult);
    }

    public USPlayerPropSide(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

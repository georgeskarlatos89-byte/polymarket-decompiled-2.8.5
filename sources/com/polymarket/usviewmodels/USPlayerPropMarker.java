package com.polymarket.usviewmodels;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.data.EMarket;
import com.polymarket.designtokens.DesignTokens;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 V2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001VB\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0083\u0001\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\n\u0010\u001eJ\u0006\u0010#\u001a\u00020$J\u0015\u0010%\u001a\u00020$2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0015\u0010*\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010,\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010/\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00101\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00103\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00105\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00108\u001a\u00020\u00142\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00109\u001a\u00020\u00142\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010:\u001a\u00020\u00142\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010=\u001a\u00020\u00182\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010@\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010B\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010E\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010H\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010J\u001a\u00020\u00142\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 Jy\u0010K\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0082 J\u0013\u0010L\u001a\u00020\u00142\b\u0010M\u001a\u0004\u0018\u00010NH\u0096\u0002J\u0019\u0010O\u001a\u00020\u00142\u0006\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0000H\u0082 J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020N0S2\u0006\u0010T\u001a\u00020'H\u0016J\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020N0S2\u0006\u0010T\u001a\u00020'H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0011\u0010\u0012\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b4\u0010)R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u00107R\u0011\u0010\u0016\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u00107R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bA\u0010)R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010F\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010)R\u0011\u0010I\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bI\u00107¨\u0006W"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropMarker;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "label", "threshold", "", "payoutMultiplier", "probability", "formattedOdds", "hasPosition", "", "isTradable", "isBlockedByNoLiquidity", "resolvedResult", "Lcom/polymarket/data/EMarket$SideResult;", "teamColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "longTitle", "shortSide", "Lcom/polymarket/usviewmodels/USPlayerPropSide;", "(Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/String;ZZZLcom/polymarket/data/EMarket$SideResult;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Ljava/lang/String;Lcom/polymarket/usviewmodels/USPlayerPropSide;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getLabel", "Swift_label", "getThreshold", "()D", "Swift_threshold", "getPayoutMultiplier", "Swift_payoutMultiplier", "getProbability", "Swift_probability", "getFormattedOdds", "Swift_formattedOdds", "getHasPosition", "()Z", "Swift_hasPosition", "Swift_isTradable", "Swift_isBlockedByNoLiquidity", "getResolvedResult", "()Lcom/polymarket/data/EMarket$SideResult;", "Swift_resolvedResult", "getTeamColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_teamColor", "getLongTitle", "Swift_longTitle", "getShortSide", "()Lcom/polymarket/usviewmodels/USPlayerPropSide;", "Swift_shortSide", "formattedPayoutMultiplier", "getFormattedPayoutMultiplier", "Swift_formattedPayoutMultiplier", "isButtonEnabled", "Swift_isButtonEnabled", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USPlayerPropMarker implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ USPlayerPropMarker(String str, String str2, double d, double d2, double d3, String str3, boolean z, boolean z2, boolean z3, EMarket.SideResult sideResult, DesignTokens.SemanticColor semanticColor, String str4, USPlayerPropSide uSPlayerPropSide, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, d2, d3, str3, r13, r14, r15, r16, r17, r18, r19);
        boolean z4;
        boolean z5;
        boolean z6;
        EMarket.SideResult sideResult2;
        DesignTokens.SemanticColor semanticColor2;
        String str5;
        USPlayerPropSide uSPlayerPropSide2;
        if ((i & 64) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 128) != 0) {
            z5 = true;
        } else {
            z5 = z2;
        }
        if ((i & 256) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            sideResult2 = EMarket.SideResult.open;
        } else {
            sideResult2 = sideResult;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            semanticColor2 = null;
        } else {
            semanticColor2 = semanticColor;
        }
        if ((i & 2048) != 0) {
            str5 = "";
        } else {
            str5 = str4;
        }
        if ((i & 4096) != 0) {
            uSPlayerPropSide2 = null;
        } else {
            uSPlayerPropSide2 = uSPlayerPropSide;
        }
    }

    private final native long Swift_constructor_0(String id, String label, double threshold, double payoutMultiplier, double probability, String formattedOdds, boolean hasPosition, boolean isTradable, boolean isBlockedByNoLiquidity, EMarket.SideResult resolvedResult, DesignTokens.SemanticColor teamColor, String longTitle, USPlayerPropSide shortSide);

    private final native String Swift_formattedOdds(long Swift_peer);

    private final native String Swift_formattedPayoutMultiplier(long Swift_peer);

    private final native boolean Swift_hasPosition(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isBlockedByNoLiquidity(long Swift_peer);

    private final native boolean Swift_isButtonEnabled(long Swift_peer);

    private final native boolean Swift_isTradable(long Swift_peer);

    private final native boolean Swift_isequal(USPlayerPropMarker lhs, USPlayerPropMarker rhs);

    private final native String Swift_label(long Swift_peer);

    private final native String Swift_longTitle(long Swift_peer);

    private final native double Swift_payoutMultiplier(long Swift_peer);

    private final native double Swift_probability(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native EMarket.SideResult Swift_resolvedResult(long Swift_peer);

    private final native USPlayerPropSide Swift_shortSide(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_teamColor(long Swift_peer);

    private final native double Swift_threshold(long Swift_peer);

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
        if (!(other instanceof USPlayerPropMarker)) {
            return false;
        }
        return Swift_isequal(this, (USPlayerPropMarker) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getFormattedOdds() {
        return Swift_formattedOdds(this.Swift_peer);
    }

    public final String getFormattedPayoutMultiplier() {
        return Swift_formattedPayoutMultiplier(this.Swift_peer);
    }

    public final boolean getHasPosition() {
        return Swift_hasPosition(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final String getLabel() {
        return Swift_label(this.Swift_peer);
    }

    public final String getLongTitle() {
        return Swift_longTitle(this.Swift_peer);
    }

    public final double getPayoutMultiplier() {
        return Swift_payoutMultiplier(this.Swift_peer);
    }

    public final double getProbability() {
        return Swift_probability(this.Swift_peer);
    }

    public final EMarket.SideResult getResolvedResult() {
        return Swift_resolvedResult(this.Swift_peer);
    }

    public final USPlayerPropSide getShortSide() {
        return Swift_shortSide(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final DesignTokens.SemanticColor getTeamColor() {
        return Swift_teamColor(this.Swift_peer);
    }

    public final double getThreshold() {
        return Swift_threshold(this.Swift_peer);
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

    public final boolean isTradable() {
        return Swift_isTradable(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public USPlayerPropMarker(String str, String str2, double d, double d2, double d3, String str3, boolean z, boolean z2, boolean z3, EMarket.SideResult sideResult, DesignTokens.SemanticColor semanticColor, String str4, USPlayerPropSide uSPlayerPropSide) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        sideResult.getClass();
        str4.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, d, d2, d3, str3, z, z2, z3, sideResult, semanticColor, str4, uSPlayerPropSide);
    }

    public USPlayerPropMarker(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

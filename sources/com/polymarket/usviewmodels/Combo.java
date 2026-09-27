package com.polymarket.usviewmodels;

import com.polymarket.data.EComboConfig;
import com.polymarket.data.EComboLeg;
import com.polymarket.data.EComboLegDetail;
import com.polymarket.data.EComboQuote;
import com.polymarket.data.EQuantity;
import io.radar.sdk.RadarTripOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBC\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\b\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JC\u00102\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0082 J\u001b\u00106\u001a\b\u0012\u0004\u0012\u0002040\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010:\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020 0<2\u0006\u0010=\u001a\u00020\"H\u0016J\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020 0<2\u0006\u0010=\u001a\u00020\"H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002040\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010$R\u0011\u00107\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006@"}, d2 = {"Lcom/polymarket/usviewmodels/Combo;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTripOptions.KEY_LEGS, "", "Lcom/polymarket/data/EComboLegDetail;", "config", "Lcom/polymarket/data/EComboConfig;", "quote", "Lcom/polymarket/data/EComboQuote;", "placeholderPayoutMultiplier", "Lcom/polymarket/data/EQuantity;", "premadeComboId", "", "(Ljava/util/List;Lcom/polymarket/data/EComboConfig;Lcom/polymarket/data/EComboQuote;Lcom/polymarket/data/EQuantity;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getLegs", "()Ljava/util/List;", "Swift_legs", "getConfig", "()Lcom/polymarket/data/EComboConfig;", "Swift_config", "getQuote", "()Lcom/polymarket/data/EComboQuote;", "Swift_quote", "getPlaceholderPayoutMultiplier", "()Lcom/polymarket/data/EQuantity;", "Swift_placeholderPayoutMultiplier", "getPremadeComboId", "()Ljava/lang/String;", "Swift_premadeComboId", "Swift_constructor_0", "legInputs", "Lcom/polymarket/data/EComboLeg;", "getLegInputs", "Swift_legInputs", "marketCount", "getMarketCount", "()I", "Swift_marketCount", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Combo implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public Combo(List<EComboLegDetail> list, EComboConfig eComboConfig, EComboQuote eComboQuote, EQuantity eQuantity, String str) {
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(list, eComboConfig, eComboQuote, eQuantity, str);
    }

    private final native EComboConfig Swift_config(long Swift_peer);

    private final native long Swift_constructor_0(List<EComboLegDetail> legs, EComboConfig config, EComboQuote quote, EQuantity placeholderPayoutMultiplier, String premadeComboId);

    private final native List<EComboLeg> Swift_legInputs(long Swift_peer);

    private final native List<EComboLegDetail> Swift_legs(long Swift_peer);

    private final native int Swift_marketCount(long Swift_peer);

    private final native EQuantity Swift_placeholderPayoutMultiplier(long Swift_peer);

    private final native String Swift_premadeComboId(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native EComboQuote Swift_quote(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

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

    public final EComboConfig getConfig() {
        return Swift_config(this.Swift_peer);
    }

    public final List<EComboLeg> getLegInputs() {
        return Swift_legInputs(this.Swift_peer);
    }

    public final List<EComboLegDetail> getLegs() {
        return Swift_legs(this.Swift_peer);
    }

    public final int getMarketCount() {
        return Swift_marketCount(this.Swift_peer);
    }

    public final EQuantity getPlaceholderPayoutMultiplier() {
        return Swift_placeholderPayoutMultiplier(this.Swift_peer);
    }

    public final String getPremadeComboId() {
        return Swift_premadeComboId(this.Swift_peer);
    }

    public final EComboQuote getQuote() {
        return Swift_quote(this.Swift_peer);
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

    public Combo(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ Combo(List list, EComboConfig eComboConfig, EComboQuote eComboQuote, EQuantity eQuantity, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, eComboConfig, eComboQuote, (i & 8) != 0 ? null : eQuantity, (i & 16) != 0 ? null : str);
    }
}

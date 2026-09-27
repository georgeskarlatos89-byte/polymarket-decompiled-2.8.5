package com.polymarket.data;

import com.polymarket.data.EMarket;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001XB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010#\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010(\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010.\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00104\u001a\u0004\u0018\u00010%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00105\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00106\u001a\u0004\u0018\u00010%H\u0082 J\u0015\u0010:\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010=\u001a\u0004\u0018\u00010%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001b\u0010C\u001a\b\u0012\u0004\u0012\u00020@0?2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010F\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010G\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010S\u001a\u00020\u0001H\u0016J\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00170U2\u0006\u0010V\u001a\u00020\u0019H\u0016J\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00170U2\u0006\u0010V\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010)\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b*\u0010'R\u0011\u0010,\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b-\u0010'R(\u00100\u001a\u0004\u0018\u00010%2\b\u0010/\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010'\"\u0004\b2\u00103R\u0011\u00107\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010;\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b<\u0010'R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bE\u0010'R(\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010IX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006Y"}, d2 = {"Lcom/polymarket/data/EOrderReceipt;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "order", "Lcom/polymarket/data/EOrder;", "getOrder", "()Lcom/polymarket/data/EOrder;", "Swift_order", "marketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "getMarketSide", "()Lcom/polymarket/data/EMarket$MarketSide;", "Swift_marketSide", "avgPrice", "Lcom/polymarket/data/EAmount;", "getAvgPrice", "()Lcom/polymarket/data/EAmount;", "Swift_avgPrice", "originalInputAmount", "getOriginalInputAmount", "Swift_originalInputAmount", "totalExecutionAmount", "getTotalExecutionAmount", "Swift_totalExecutionAmount", "newValue", "tradePnl", "getTradePnl", "setTradePnl", "(Lcom/polymarket/data/EAmount;)V", "Swift_tradePnl", "Swift_tradePnl_set", "value", "wasSlippageProtected", "getWasSlippageProtected", "()Z", "Swift_wasSlippageProtected", "originalPrice", "getOriginalPrice", "Swift_originalPrice", "tradeIds", "", "", "getTradeIds", "()Ljava/util/List;", "Swift_tradeIds", "projectedPayout", "getProjectedPayout", "Swift_projectedPayout", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EOrderReceipt implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private EOrderReceipt(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native EAmount Swift_avgPrice(long Swift_peer);

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native EMarket.MarketSide Swift_marketSide(long Swift_peer);

    private final native EOrder Swift_order(long Swift_peer);

    private final native EAmount Swift_originalInputAmount(long Swift_peer);

    private final native EAmount Swift_originalPrice(long Swift_peer);

    private final native EAmount Swift_projectedPayout(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native EAmount Swift_totalExecutionAmount(long Swift_peer);

    private final native List<String> Swift_tradeIds(long Swift_peer);

    private final native EAmount Swift_tradePnl(long Swift_peer);

    private final native void Swift_tradePnl_set(long Swift_peer, EAmount value);

    private final native boolean Swift_wasSlippageProtected(long Swift_peer);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
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

    public final EAmount getAvgPrice() {
        return Swift_avgPrice(this.Swift_peer);
    }

    public final EMarket.MarketSide getMarketSide() {
        return Swift_marketSide(this.Swift_peer);
    }

    public final EOrder getOrder() {
        return Swift_order(this.Swift_peer);
    }

    public final EAmount getOriginalInputAmount() {
        return Swift_originalInputAmount(this.Swift_peer);
    }

    public final EAmount getOriginalPrice() {
        return Swift_originalPrice(this.Swift_peer);
    }

    public final EAmount getProjectedPayout() {
        return Swift_projectedPayout(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final EAmount getTotalExecutionAmount() {
        return Swift_totalExecutionAmount(this.Swift_peer);
    }

    public final List<String> getTradeIds() {
        return Swift_tradeIds(this.Swift_peer);
    }

    public final EAmount getTradePnl() {
        return Swift_tradePnl(this.Swift_peer);
    }

    public final boolean getWasSlippageProtected() {
        return Swift_wasSlippageProtected(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EOrderReceipt(this);
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final void setTradePnl(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_tradePnl_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    public EOrderReceipt(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

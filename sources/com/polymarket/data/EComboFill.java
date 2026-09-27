package com.polymarket.data;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBG\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0015\u0010$\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010+\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J?\u00102\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f042\u0006\u00105\u001a\u00020!H\u0016J\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f042\u0006\u00105\u001a\u00020!H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00068"}, d2 = {"Lcom/polymarket/data/EComboFill;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "comboOrderId", "", "cost", "Lcom/polymarket/data/EAmount;", "commission", "payout", "odds", "Lcom/polymarket/data/EQuantity;", "transactTime", "Ljava/util/Date;", "(Ljava/lang/String;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EQuantity;Ljava/util/Date;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getComboOrderId", "()Ljava/lang/String;", "Swift_comboOrderId", "getCost", "()Lcom/polymarket/data/EAmount;", "Swift_cost", "getCommission", "Swift_commission", "getPayout", "Swift_payout", "getOdds", "()Lcom/polymarket/data/EQuantity;", "Swift_odds", "getTransactTime", "()Ljava/util/Date;", "Swift_transactTime", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EComboFill implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public /* synthetic */ EComboFill(String str, EAmount eAmount, EAmount eAmount2, EAmount eAmount3, EQuantity eQuantity, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EAmount.INSTANCE.getZeroUSD() : eAmount, (i & 4) != 0 ? EAmount.INSTANCE.getZeroUSD() : eAmount2, (i & 8) != 0 ? EAmount.INSTANCE.getZeroUSD() : eAmount3, (i & 16) != 0 ? EQuantity.INSTANCE.getZeroValue() : eQuantity, (i & 32) != 0 ? null : date);
    }

    private final native String Swift_comboOrderId(long Swift_peer);

    private final native EAmount Swift_commission(long Swift_peer);

    private final native long Swift_constructor_0(String comboOrderId, EAmount cost, EAmount commission, EAmount payout, EQuantity odds, Date transactTime);

    private final native EAmount Swift_cost(long Swift_peer);

    private final native EQuantity Swift_odds(long Swift_peer);

    private final native EAmount Swift_payout(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native Date Swift_transactTime(long Swift_peer);

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

    public final String getComboOrderId() {
        return Swift_comboOrderId(this.Swift_peer);
    }

    public final EAmount getCommission() {
        return Swift_commission(this.Swift_peer);
    }

    public final EAmount getCost() {
        return Swift_cost(this.Swift_peer);
    }

    public final EQuantity getOdds() {
        return Swift_odds(this.Swift_peer);
    }

    public final EAmount getPayout() {
        return Swift_payout(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final Date getTransactTime() {
        return Swift_transactTime(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public EComboFill(String str, EAmount eAmount, EAmount eAmount2, EAmount eAmount3, EQuantity eQuantity, Date date) {
        str.getClass();
        eAmount.getClass();
        eAmount2.getClass();
        eAmount3.getClass();
        eQuantity.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, eAmount, eAmount2, eAmount3, eQuantity, date);
    }

    public EComboFill(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

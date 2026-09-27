package com.polymarket.data;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001IB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBq\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\b\u0010\u001aJ\u0006\u0010\u001f\u001a\u00020 J\u0015\u0010!\u001a\u00020 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0015\u0010*\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010-\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00100\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00102\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00104\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00106\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00108\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010;\u001a\u0004\u0018\u00010\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010>\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010A\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010BJf\u0010C\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020%0F2\u0006\u0010G\u001a\u00020'H\u0016J\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020%0F2\u0006\u0010G\u001a\u00020'H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b5\u0010,R\u0011\u0010\u0013\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006J"}, d2 = {"Lcom/polymarket/data/EComboQuote;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "quoteId", "", "orderQty", "Lcom/polymarket/data/EQuantity;", "cost", "Lcom/polymarket/data/EAmount;", "commission", "payout", "multiplier", "odds", "expirationTime", "Ljava/util/Date;", "status", "Lcom/polymarket/data/EComboQuoteStatus;", "refreshInterval", "", "(Ljava/lang/String;Lcom/polymarket/data/EQuantity;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EQuantity;Lcom/polymarket/data/EQuantity;Ljava/util/Date;Lcom/polymarket/data/EComboQuoteStatus;Ljava/lang/Double;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getQuoteId", "()Ljava/lang/String;", "Swift_quoteId", "getOrderQty", "()Lcom/polymarket/data/EQuantity;", "Swift_orderQty", "getCost", "()Lcom/polymarket/data/EAmount;", "Swift_cost", "getCommission", "Swift_commission", "getPayout", "Swift_payout", "getMultiplier", "Swift_multiplier", "getOdds", "Swift_odds", "getExpirationTime", "()Ljava/util/Date;", "Swift_expirationTime", "getStatus", "()Lcom/polymarket/data/EComboQuoteStatus;", "Swift_status", "getRefreshInterval", "()Ljava/lang/Double;", "Swift_refreshInterval", "(J)Ljava/lang/Double;", "Swift_constructor_0", "(Ljava/lang/String;Lcom/polymarket/data/EQuantity;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EQuantity;Lcom/polymarket/data/EQuantity;Ljava/util/Date;Lcom/polymarket/data/EComboQuoteStatus;Ljava/lang/Double;)J", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EComboQuote implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EComboQuote(java.lang.String r2, com.polymarket.data.EQuantity r3, com.polymarket.data.EAmount r4, com.polymarket.data.EAmount r5, com.polymarket.data.EAmount r6, com.polymarket.data.EQuantity r7, com.polymarket.data.EQuantity r8, java.util.Date r9, com.polymarket.data.EComboQuoteStatus r10, java.lang.Double r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r13 = r12 & 2
            if (r13 == 0) goto L10
            com.polymarket.data.EQuantity$Companion r3 = com.polymarket.data.EQuantity.INSTANCE
            com.polymarket.data.EQuantity r3 = r3.getZeroValue()
        L10:
            r13 = r12 & 4
            if (r13 == 0) goto L1a
            com.polymarket.data.EAmount$Companion r4 = com.polymarket.data.EAmount.INSTANCE
            com.polymarket.data.EAmount r4 = r4.getZeroUSD()
        L1a:
            r13 = r12 & 8
            if (r13 == 0) goto L24
            com.polymarket.data.EAmount$Companion r5 = com.polymarket.data.EAmount.INSTANCE
            com.polymarket.data.EAmount r5 = r5.getZeroUSD()
        L24:
            r13 = r12 & 16
            if (r13 == 0) goto L2e
            com.polymarket.data.EAmount$Companion r6 = com.polymarket.data.EAmount.INSTANCE
            com.polymarket.data.EAmount r6 = r6.getZeroUSD()
        L2e:
            r13 = r12 & 32
            if (r13 == 0) goto L38
            com.polymarket.data.EQuantity$Companion r7 = com.polymarket.data.EQuantity.INSTANCE
            com.polymarket.data.EQuantity r7 = r7.getZeroValue()
        L38:
            r13 = r12 & 64
            if (r13 == 0) goto L42
            com.polymarket.data.EQuantity$Companion r8 = com.polymarket.data.EQuantity.INSTANCE
            com.polymarket.data.EQuantity r8 = r8.getZeroValue()
        L42:
            r13 = r12 & 128(0x80, float:1.794E-43)
            r0 = 0
            if (r13 == 0) goto L48
            r9 = r0
        L48:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L4e
            com.polymarket.data.EComboQuoteStatus r10 = com.polymarket.data.EComboQuoteStatus.unknown
        L4e:
            r12 = r12 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L5e
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L69
        L5e:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L69:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.polymarket.data.EComboQuote.<init>(java.lang.String, com.polymarket.data.EQuantity, com.polymarket.data.EAmount, com.polymarket.data.EAmount, com.polymarket.data.EAmount, com.polymarket.data.EQuantity, com.polymarket.data.EQuantity, java.util.Date, com.polymarket.data.EComboQuoteStatus, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final native EAmount Swift_commission(long Swift_peer);

    private final native long Swift_constructor_0(String quoteId, EQuantity orderQty, EAmount cost, EAmount commission, EAmount payout, EQuantity multiplier, EQuantity odds, Date expirationTime, EComboQuoteStatus status, Double refreshInterval);

    private final native EAmount Swift_cost(long Swift_peer);

    private final native Date Swift_expirationTime(long Swift_peer);

    private final native EQuantity Swift_multiplier(long Swift_peer);

    private final native EQuantity Swift_odds(long Swift_peer);

    private final native EQuantity Swift_orderQty(long Swift_peer);

    private final native EAmount Swift_payout(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_quoteId(long Swift_peer);

    private final native Double Swift_refreshInterval(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native EComboQuoteStatus Swift_status(long Swift_peer);

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

    public final EAmount getCommission() {
        return Swift_commission(this.Swift_peer);
    }

    public final EAmount getCost() {
        return Swift_cost(this.Swift_peer);
    }

    public final Date getExpirationTime() {
        return Swift_expirationTime(this.Swift_peer);
    }

    public final EQuantity getMultiplier() {
        return Swift_multiplier(this.Swift_peer);
    }

    public final EQuantity getOdds() {
        return Swift_odds(this.Swift_peer);
    }

    public final EQuantity getOrderQty() {
        return Swift_orderQty(this.Swift_peer);
    }

    public final EAmount getPayout() {
        return Swift_payout(this.Swift_peer);
    }

    public final String getQuoteId() {
        return Swift_quoteId(this.Swift_peer);
    }

    public final Double getRefreshInterval() {
        return Swift_refreshInterval(this.Swift_peer);
    }

    public final EComboQuoteStatus getStatus() {
        return Swift_status(this.Swift_peer);
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

    public EComboQuote(String str, EQuantity eQuantity, EAmount eAmount, EAmount eAmount2, EAmount eAmount3, EQuantity eQuantity2, EQuantity eQuantity3, Date date, EComboQuoteStatus eComboQuoteStatus, Double d) {
        str.getClass();
        eQuantity.getClass();
        eAmount.getClass();
        eAmount2.getClass();
        eAmount3.getClass();
        eQuantity2.getClass();
        eQuantity3.getClass();
        eComboQuoteStatus.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, eQuantity, eAmount, eAmount2, eAmount3, eQuantity2, eQuantity3, date, eComboQuoteStatus, d);
    }

    public EComboQuote(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

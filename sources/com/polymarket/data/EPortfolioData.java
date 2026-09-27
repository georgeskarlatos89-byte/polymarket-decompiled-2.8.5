package com.polymarket.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/polymarket/data/EPortfolioData;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "portfolioValueAmount", "Lcom/polymarket/data/EAmount;", "getPortfolioValueAmount", "()Lcom/polymarket/data/EAmount;", "Swift_portfolioValueAmount", "className", "", "cashBalanceAmount", "getCashBalanceAmount", "Swift_cashBalanceAmount", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "GlobalCase", "UsCase", "FundingGate", "Companion", "Lcom/polymarket/data/EPortfolioData$GlobalCase;", "Lcom/polymarket/data/EPortfolioData$UsCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EPortfolioData implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EPortfolioData$GlobalCase;", "Lcom/polymarket/data/EPortfolioData;", "associated0", "Lcom/polymarket/data/EAmount;", "associated1", "<init>", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "getAssociated1", "portfolioValue", "getPortfolioValue", "cashBalance", "getCashBalance", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GlobalCase extends EPortfolioData {
        private final EAmount associated0;
        private final EAmount associated1;
        private final EAmount cashBalance;
        private final EAmount portfolioValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GlobalCase(EAmount eAmount, EAmount eAmount2) {
            super(null);
            eAmount.getClass();
            eAmount2.getClass();
            this.associated0 = eAmount;
            this.associated1 = eAmount2;
            this.portfolioValue = eAmount;
            this.cashBalance = eAmount2;
        }

        public final EAmount getAssociated0() {
            return this.associated0;
        }

        public final EAmount getAssociated1() {
            return this.associated1;
        }

        public final EAmount getCashBalance() {
            return this.cashBalance;
        }

        public final EAmount getPortfolioValue() {
            return this.portfolioValue;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPortfolioData$UsCase;", "Lcom/polymarket/data/EPortfolioData;", "associated0", "Lcom/polymarket/data/APIUserBalanceUS;", "<init>", "(Lcom/polymarket/data/APIUserBalanceUS;)V", "getAssociated0", "()Lcom/polymarket/data/APIUserBalanceUS;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UsCase extends EPortfolioData {
        private final APIUserBalanceUS associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UsCase(APIUserBalanceUS aPIUserBalanceUS) {
            super(null);
            aPIUserBalanceUS.getClass();
            this.associated0 = aPIUserBalanceUS;
        }

        public final APIUserBalanceUS getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ EPortfolioData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native EAmount Swift_cashBalanceAmount(String className);

    private final native EAmount Swift_portfolioValueAmount(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final EAmount getCashBalanceAmount() {
        return Swift_cashBalanceAmount(getClass().getName());
    }

    public final EAmount getPortfolioValueAmount() {
        return Swift_portfolioValueAmount(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/data/EPortfolioData$Companion;", "", "<init>", "()V", "global", "Lcom/polymarket/data/EPortfolioData;", "portfolioValue", "Lcom/polymarket/data/EAmount;", "cashBalance", "us", "associated0", "Lcom/polymarket/data/APIUserBalanceUS;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EPortfolioData global(EAmount portfolioValue, EAmount cashBalance) {
            portfolioValue.getClass();
            cashBalance.getClass();
            return new GlobalCase(portfolioValue, cashBalance);
        }

        public final EPortfolioData us(APIUserBalanceUS associated0) {
            associated0.getClass();
            return new UsCase(associated0);
        }

        private Companion() {
        }
    }

    private EPortfolioData() {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001c\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0082 J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170!2\u0006\u0010\"\u001a\u00020\u0019H\u0016J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170!2\u0006\u0010\"\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006%"}, d2 = {"Lcom/polymarket/data/EPortfolioData$FundingGate;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "coveredByPendingCredit", "", "nothingCoveredByCash", "(ZZ)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "getCoveredByPendingCredit", "()Z", "Swift_coveredByPendingCredit", "getNothingCoveredByCash", "Swift_nothingCoveredByCash", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FundingGate implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public FundingGate(boolean z, boolean z2) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(z, z2);
        }

        private final native long Swift_constructor_0(boolean coveredByPendingCredit, boolean nothingCoveredByCash);

        private final native boolean Swift_coveredByPendingCredit(long Swift_peer);

        private final native boolean Swift_nothingCoveredByCash(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

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

        public final boolean getCoveredByPendingCredit() {
            return Swift_coveredByPendingCredit(this.Swift_peer);
        }

        public final boolean getNothingCoveredByCash() {
            return Swift_nothingCoveredByCash(this.Swift_peer);
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

        public FundingGate(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}

package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u008b\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008a\u0001\u008b\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010!\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010'\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010(\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010-\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00102\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00107\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010;\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010<\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010@\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010A\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010E\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010F\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010J\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010K\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0015\u0010O\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010P\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010T\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010U\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010Y\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010Z\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010^\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010_\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010c\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010d\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010h\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010i\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u001d\u0010o\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010k2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010t\u001a\u0004\u0018\u00010q2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0010\u0010u\u001a\u00020\u00002\b\u0010v\u001a\u0004\u0018\u00010\u0000J\u001f\u0010w\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010x\u001a\u0004\u0018\u00010\u0000H\u0082 J\u0015\u0010y\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\t\u0010\u0085\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u0019H\u0016J\u001a\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R(\u0010)\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R(\u0010.\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R(\u00103\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R(\u00108\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010 R(\u0010=\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010 R(\u0010B\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010 R(\u0010G\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010 R$\u0010L\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010\u001e\"\u0004\bN\u0010 R$\u0010Q\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010\u001e\"\u0004\bS\u0010 R$\u0010V\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010\u001e\"\u0004\bX\u0010 R$\u0010[\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010\u001e\"\u0004\b]\u0010 R$\u0010`\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010\u001e\"\u0004\bb\u0010 R$\u0010e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010\u001e\"\u0004\bg\u0010 R\u0019\u0010j\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010p\u001a\u0004\u0018\u00010q8F¢\u0006\u0006\u001a\u0004\br\u0010sR(\u0010z\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010{X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u001f\u0010\u0080\u0001\u001a\u00020\u0019X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u008c\u0001"}, d2 = {"Lcom/polymarket/data/APIUserBalanceUS;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "Lcom/polymarket/data/EAmount;", "currentBalance", "getCurrentBalance", "()Lcom/polymarket/data/EAmount;", "setCurrentBalance", "(Lcom/polymarket/data/EAmount;)V", "Swift_currentBalance", "Swift_currentBalance_set", "value", "buyingPower", "getBuyingPower", "setBuyingPower", "Swift_buyingPower", "Swift_buyingPower_set", "balanceReservation", "getBalanceReservation", "setBalanceReservation", "Swift_balanceReservation", "Swift_balanceReservation_set", "depositReservation", "getDepositReservation", "setDepositReservation", "Swift_depositReservation", "Swift_depositReservation_set", "bonusReservation", "getBonusReservation", "setBonusReservation", "Swift_bonusReservation", "Swift_bonusReservation_set", "displayedBonus", "getDisplayedBonus", "setDisplayedBonus", "Swift_displayedBonus", "Swift_displayedBonus_set", "displayedAvailableSoon", "getDisplayedAvailableSoon", "setDisplayedAvailableSoon", "Swift_displayedAvailableSoon", "Swift_displayedAvailableSoon_set", "displayedCash", "getDisplayedCash", "setDisplayedCash", "Swift_displayedCash", "Swift_displayedCash_set", "availableToWithdraw", "getAvailableToWithdraw", "setAvailableToWithdraw", "Swift_availableToWithdraw", "Swift_availableToWithdraw_set", "assetNotional", "getAssetNotional", "setAssetNotional", "Swift_assetNotional", "Swift_assetNotional_set", "assetAvailable", "getAssetAvailable", "setAssetAvailable", "Swift_assetAvailable", "Swift_assetAvailable_set", "pendingCredit", "getPendingCredit", "setPendingCredit", "Swift_pendingCredit", "Swift_pendingCredit_set", "openOrders", "getOpenOrders", "setOpenOrders", "Swift_openOrders", "Swift_openOrders_set", "unsettledFunds", "getUnsettledFunds", "setUnsettledFunds", "Swift_unsettledFunds", "Swift_unsettledFunds_set", "marginRequirement", "getMarginRequirement", "setMarginRequirement", "Swift_marginRequirement", "Swift_marginRequirement_set", "pendingWithdrawals", "", "Lcom/polymarket/data/APIUserBalanceUS$PendingWithdrawal;", "getPendingWithdrawals", "()Ljava/util/List;", "Swift_pendingWithdrawals", "lastUpdated", "Ljava/util/Date;", "getLastUpdated", "()Ljava/util/Date;", "Swift_lastUpdated", "preservingReservations", TicketDetailDestinationKt.LAUNCHED_FROM, "Swift_preservingReservations_0", "previous", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "PendingWithdrawal", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class APIUserBalanceUS implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private APIUserBalanceUS(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }

    private final native EAmount Swift_assetAvailable(long Swift_peer);

    private final native void Swift_assetAvailable_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_assetNotional(long Swift_peer);

    private final native void Swift_assetNotional_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_availableToWithdraw(long Swift_peer);

    private final native void Swift_availableToWithdraw_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_balanceReservation(long Swift_peer);

    private final native void Swift_balanceReservation_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_bonusReservation(long Swift_peer);

    private final native void Swift_bonusReservation_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_buyingPower(long Swift_peer);

    private final native void Swift_buyingPower_set(long Swift_peer, EAmount value);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native EAmount Swift_currentBalance(long Swift_peer);

    private final native void Swift_currentBalance_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_depositReservation(long Swift_peer);

    private final native void Swift_depositReservation_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_displayedAvailableSoon(long Swift_peer);

    private final native void Swift_displayedAvailableSoon_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_displayedBonus(long Swift_peer);

    private final native void Swift_displayedBonus_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_displayedCash(long Swift_peer);

    private final native void Swift_displayedCash_set(long Swift_peer, EAmount value);

    private final native Date Swift_lastUpdated(long Swift_peer);

    private final native EAmount Swift_marginRequirement(long Swift_peer);

    private final native void Swift_marginRequirement_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_openOrders(long Swift_peer);

    private final native void Swift_openOrders_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_pendingCredit(long Swift_peer);

    private final native void Swift_pendingCredit_set(long Swift_peer, EAmount value);

    private final native List<PendingWithdrawal> Swift_pendingWithdrawals(long Swift_peer);

    private final native APIUserBalanceUS Swift_preservingReservations_0(long Swift_peer, APIUserBalanceUS previous);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native EAmount Swift_unsettledFunds(long Swift_peer);

    private final native void Swift_unsettledFunds_set(long Swift_peer, EAmount value);

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

    public final EAmount getAssetAvailable() {
        return Swift_assetAvailable(this.Swift_peer);
    }

    public final EAmount getAssetNotional() {
        return Swift_assetNotional(this.Swift_peer);
    }

    public final EAmount getAvailableToWithdraw() {
        return Swift_availableToWithdraw(this.Swift_peer);
    }

    public final EAmount getBalanceReservation() {
        return Swift_balanceReservation(this.Swift_peer);
    }

    public final EAmount getBonusReservation() {
        return Swift_bonusReservation(this.Swift_peer);
    }

    public final EAmount getBuyingPower() {
        return Swift_buyingPower(this.Swift_peer);
    }

    public final EAmount getCurrentBalance() {
        return Swift_currentBalance(this.Swift_peer);
    }

    public final EAmount getDepositReservation() {
        return Swift_depositReservation(this.Swift_peer);
    }

    public final EAmount getDisplayedAvailableSoon() {
        return Swift_displayedAvailableSoon(this.Swift_peer);
    }

    public final EAmount getDisplayedBonus() {
        return Swift_displayedBonus(this.Swift_peer);
    }

    public final EAmount getDisplayedCash() {
        return Swift_displayedCash(this.Swift_peer);
    }

    public final Date getLastUpdated() {
        return Swift_lastUpdated(this.Swift_peer);
    }

    public final EAmount getMarginRequirement() {
        return Swift_marginRequirement(this.Swift_peer);
    }

    public final EAmount getOpenOrders() {
        return Swift_openOrders(this.Swift_peer);
    }

    public final EAmount getPendingCredit() {
        return Swift_pendingCredit(this.Swift_peer);
    }

    public final List<PendingWithdrawal> getPendingWithdrawals() {
        return Swift_pendingWithdrawals(this.Swift_peer);
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

    public final EAmount getUnsettledFunds() {
        return Swift_unsettledFunds(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final APIUserBalanceUS preservingReservations(APIUserBalanceUS from) {
        return Swift_preservingReservations_0(this.Swift_peer, from);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new APIUserBalanceUS(this);
    }

    public final void setAssetAvailable(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_assetAvailable_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setAssetNotional(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_assetNotional_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setAvailableToWithdraw(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_availableToWithdraw_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setBalanceReservation(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_balanceReservation_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setBonusReservation(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_bonusReservation_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setBuyingPower(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_buyingPower_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setCurrentBalance(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_currentBalance_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setDepositReservation(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_depositReservation_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setDisplayedAvailableSoon(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_displayedAvailableSoon_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setDisplayedBonus(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_displayedBonus_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setDisplayedCash(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_displayedCash_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setMarginRequirement(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_marginRequirement_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setOpenOrders(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_openOrders_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setPendingCredit(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_pendingCredit_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
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

    public final void setUnsettledFunds(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_unsettledFunds_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001OB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010!\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010)\u001a\u00020#2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010*\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010+\u001a\u00020#H\u0082 J\u0015\u0010.\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u00102\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u00105\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010:\u001a\u0002072\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010=\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010>\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010J\u001a\u00020\u0001H\u0016J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00170L2\u0006\u0010M\u001a\u00020\u0019H\u0016J\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00170L2\u0006\u0010M\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001dR$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010,\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001dR\u0011\u0010/\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00103\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001dR\u0011\u00106\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010;\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b<\u0010\u001dR(\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010@X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006P"}, d2 = {"Lcom/polymarket/data/APIUserBalanceUS$PendingWithdrawal;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", Keys.KEY_NAME, "getName", "Swift_name", "newValue", "Lcom/polymarket/data/EAmount;", "balance", "getBalance", "()Lcom/polymarket/data/EAmount;", "setBalance", "(Lcom/polymarket/data/EAmount;)V", "Swift_balance", "Swift_balance_set", "value", "description", "getDescription", "Swift_description", "acknowledged", "getAcknowledged", "()Z", "Swift_acknowledged", "bankId", "getBankId", "Swift_bankId", "creationTime", "Ljava/util/Date;", "getCreationTime", "()Ljava/util/Date;", "Swift_creationTime", "destinationAccountName", "getDestinationAccountName", "Swift_destinationAccountName", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PendingWithdrawal implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private PendingWithdrawal(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native boolean Swift_acknowledged(long Swift_peer);

        private final native EAmount Swift_balance(long Swift_peer);

        private final native void Swift_balance_set(long Swift_peer, EAmount value);

        private final native String Swift_bankId(long Swift_peer);

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native Date Swift_creationTime(long Swift_peer);

        private final native String Swift_description(long Swift_peer);

        private final native String Swift_destinationAccountName(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native String Swift_name(long Swift_peer);

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

        public final boolean getAcknowledged() {
            return Swift_acknowledged(this.Swift_peer);
        }

        public final EAmount getBalance() {
            return Swift_balance(this.Swift_peer);
        }

        public final String getBankId() {
            return Swift_bankId(this.Swift_peer);
        }

        public final Date getCreationTime() {
            return Swift_creationTime(this.Swift_peer);
        }

        public final String getDescription() {
            return Swift_description(this.Swift_peer);
        }

        public final String getDestinationAccountName() {
            return Swift_destinationAccountName(this.Swift_peer);
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
        }

        public final String getName() {
            return Swift_name(this.Swift_peer);
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

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new PendingWithdrawal(this);
        }

        public final void setBalance(EAmount eAmount) {
            eAmount.getClass();
            EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
            willmutate();
            try {
                Swift_balance_set(this.Swift_peer, eAmount2);
            } finally {
                didmutate();
            }
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

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public PendingWithdrawal(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public APIUserBalanceUS(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

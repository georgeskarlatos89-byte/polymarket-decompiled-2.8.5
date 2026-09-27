package com.polymarket.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002+,B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010#\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J5\u0010&\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0(2\u0006\u0010)\u001a\u00020\u001cH\u0016J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0(2\u0006\u0010)\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001e¨\u0006-"}, d2 = {"Lcom/polymarket/data/EDefaultDepositLimits;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "bankLimits", "Lcom/polymarket/data/EDefaultDepositLimits$Limits;", "cardLimits", "paypalLimits", "venmoLimits", "(Lcom/polymarket/data/EDefaultDepositLimits$Limits;Lcom/polymarket/data/EDefaultDepositLimits$Limits;Lcom/polymarket/data/EDefaultDepositLimits$Limits;Lcom/polymarket/data/EDefaultDepositLimits$Limits;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getBankLimits", "()Lcom/polymarket/data/EDefaultDepositLimits$Limits;", "Swift_bankLimits", "getCardLimits", "Swift_cardLimits", "getPaypalLimits", "Swift_paypalLimits", "getVenmoLimits", "Swift_venmoLimits", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Limits", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EDefaultDepositLimits implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public /* synthetic */ EDefaultDepositLimits(Limits limits, Limits limits2, Limits limits3, Limits limits4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : limits, (i & 2) != 0 ? null : limits2, (i & 4) != 0 ? null : limits3, (i & 8) != 0 ? null : limits4);
    }

    private final native Limits Swift_bankLimits(long Swift_peer);

    private final native Limits Swift_cardLimits(long Swift_peer);

    private final native long Swift_constructor_0(Limits bankLimits, Limits cardLimits, Limits paypalLimits, Limits venmoLimits);

    private final native Limits Swift_paypalLimits(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native Limits Swift_venmoLimits(long Swift_peer);

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

    public final Limits getBankLimits() {
        return Swift_bankLimits(this.Swift_peer);
    }

    public final Limits getCardLimits() {
        return Swift_cardLimits(this.Swift_peer);
    }

    public final Limits getPaypalLimits() {
        return Swift_paypalLimits(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final Limits getVenmoLimits() {
        return Swift_venmoLimits(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eB\u0011\b\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0017\u0010#\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010$\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010%\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010)\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010%\u001a\u0004\u0018\u00010\fH\u0082 J!\u0010*\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010+\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000f\u001a\u00020\u0001H\u0082 J\b\u00107\u001a\u00020\u0001H\u0016J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u001b092\u0006\u0010:\u001a\u00020\u001dH\u0016J\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b092\u0006\u0010:\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"R(\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0016\u0018\u00010-X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u001dX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006="}, d2 = {"Lcom/polymarket/data/EDefaultDepositLimits$Limits;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "singleTransactionLimit", "Lcom/polymarket/data/EAmount;", "dailyLimit", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getSingleTransactionLimit", "()Lcom/polymarket/data/EAmount;", "setSingleTransactionLimit", "(Lcom/polymarket/data/EAmount;)V", "Swift_singleTransactionLimit", "Swift_singleTransactionLimit_set", "value", "getDailyLimit", "setDailyLimit", "Swift_dailyLimit", "Swift_dailyLimit_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Limits implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public Limits(EAmount eAmount, EAmount eAmount2) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(eAmount, eAmount2);
        }

        private final native long Swift_constructor_0(EAmount singleTransactionLimit, EAmount dailyLimit);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native EAmount Swift_dailyLimit(long Swift_peer);

        private final native void Swift_dailyLimit_set(long Swift_peer, EAmount value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native EAmount Swift_singleTransactionLimit(long Swift_peer);

        private final native void Swift_singleTransactionLimit_set(long Swift_peer, EAmount value);

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

        public final EAmount getDailyLimit() {
            return Swift_dailyLimit(this.Swift_peer);
        }

        public final EAmount getSingleTransactionLimit() {
            return Swift_singleTransactionLimit(this.Swift_peer);
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
            return new Limits(this);
        }

        public final void setDailyLimit(EAmount eAmount) {
            EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
            willmutate();
            try {
                Swift_dailyLimit_set(this.Swift_peer, eAmount2);
            } finally {
                didmutate();
            }
        }

        public final void setSingleTransactionLimit(EAmount eAmount) {
            EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
            willmutate();
            try {
                Swift_singleTransactionLimit_set(this.Swift_peer, eAmount2);
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

        public Limits(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Limits(EAmount eAmount, EAmount eAmount2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : eAmount, (i & 2) != 0 ? null : eAmount2);
        }

        private Limits(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    public EDefaultDepositLimits(Limits limits, Limits limits2, Limits limits3, Limits limits4) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(limits, limits2, limits3, limits4);
    }

    public EDefaultDepositLimits(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

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
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB'\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\t\u0010\u0011B\u0011\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0015\u0010&\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010'\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\fH\u0082 J\u0015\u0010-\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010.\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\u000eH\u0082 J\u0015\u00103\u001a\u00020\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00104\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\u0010H\u0082 J\u0015\u00108\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J%\u00109\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0015\u0010:\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0012\u001a\u00020\u0001H\u0082 J\b\u0010F\u001a\u00020\u0001H\u0016J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001e0H2\u0006\u0010I\u001a\u00020 H\u0016J\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001e0H2\u0006\u0010I\u001a\u00020 H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u00105\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b6\u00107R(\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0019\u0018\u00010<X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006L"}, d2 = {"Lcom/polymarket/data/ESquadInviteRedemption;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "state", "Lcom/polymarket/data/ESquadInviteTokenState;", "outcome", "Lcom/polymarket/data/ESquadJoinOutcome;", "squadId", "", "(Lcom/polymarket/data/ESquadInviteTokenState;Lcom/polymarket/data/ESquadJoinOutcome;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getState", "()Lcom/polymarket/data/ESquadInviteTokenState;", "setState", "(Lcom/polymarket/data/ESquadInviteTokenState;)V", "Swift_state", "Swift_state_set", "value", "getOutcome", "()Lcom/polymarket/data/ESquadJoinOutcome;", "setOutcome", "(Lcom/polymarket/data/ESquadJoinOutcome;)V", "Swift_outcome", "Swift_outcome_set", "getSquadId", "()Ljava/lang/String;", "setSquadId", "(Ljava/lang/String;)V", "Swift_squadId", "Swift_squadId_set", "didJoin", "getDidJoin", "()Z", "Swift_didJoin", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquadInviteRedemption implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public ESquadInviteRedemption(ESquadInviteTokenState eSquadInviteTokenState, ESquadJoinOutcome eSquadJoinOutcome, String str) {
        eSquadInviteTokenState.getClass();
        eSquadJoinOutcome.getClass();
        str.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eSquadInviteTokenState, eSquadJoinOutcome, str);
    }

    private final native long Swift_constructor_0(ESquadInviteTokenState state, ESquadJoinOutcome outcome, String squadId);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native boolean Swift_didJoin(long Swift_peer);

    private final native ESquadJoinOutcome Swift_outcome(long Swift_peer);

    private final native void Swift_outcome_set(long Swift_peer, ESquadJoinOutcome value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_squadId(long Swift_peer);

    private final native void Swift_squadId_set(long Swift_peer, String value);

    private final native ESquadInviteTokenState Swift_state(long Swift_peer);

    private final native void Swift_state_set(long Swift_peer, ESquadInviteTokenState value);

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

    public final boolean getDidJoin() {
        return Swift_didJoin(this.Swift_peer);
    }

    public final ESquadJoinOutcome getOutcome() {
        return Swift_outcome(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final String getSquadId() {
        return Swift_squadId(this.Swift_peer);
    }

    public final ESquadInviteTokenState getState() {
        return Swift_state(this.Swift_peer);
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
        return new ESquadInviteRedemption(this);
    }

    public final void setOutcome(ESquadJoinOutcome eSquadJoinOutcome) {
        eSquadJoinOutcome.getClass();
        willmutate();
        try {
            Swift_outcome_set(this.Swift_peer, eSquadJoinOutcome);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setSquadId(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_squadId_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setState(ESquadInviteTokenState eSquadInviteTokenState) {
        eSquadInviteTokenState.getClass();
        willmutate();
        try {
            Swift_state_set(this.Swift_peer, eSquadInviteTokenState);
        } finally {
            didmutate();
        }
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

    public ESquadInviteRedemption(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ESquadInviteRedemption(ESquadInviteTokenState eSquadInviteTokenState, ESquadJoinOutcome eSquadJoinOutcome, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ESquadInviteTokenState.unresolvable : eSquadInviteTokenState, (i & 2) != 0 ? ESquadJoinOutcome.unknown : eSquadJoinOutcome, (i & 4) != 0 ? "" : str);
    }

    private ESquadInviteRedemption(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}

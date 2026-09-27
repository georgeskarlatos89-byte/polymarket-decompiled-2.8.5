package com.polymarket.data;

import io.radar.sdk.RadarTripOptions;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001?B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u000fB\u0011\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010$\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010%\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010&\u001a\u00020\fH\u0082 J\u0015\u0010+\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010,\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010&\u001a\u00020\u000eH\u0082 J\u001d\u0010-\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0015\u0010.\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0010\u001a\u00020\u0001H\u0082 J\b\u0010:\u001a\u00020\u0001H\u0016J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001c0<2\u0006\u0010=\u001a\u00020\u001eH\u0016J\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001c0<2\u0006\u0010=\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0017\u0018\u000100X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u001eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006@"}, d2 = {"Lcom/polymarket/data/ESquadSetMuteRequest;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "squadId", "", RadarTripOptions.KEY_MODE, "Lcom/polymarket/data/ESquadMuteMode;", "(Ljava/lang/String;Lcom/polymarket/data/ESquadMuteMode;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getSquadId", "()Ljava/lang/String;", "setSquadId", "(Ljava/lang/String;)V", "Swift_squadId", "Swift_squadId_set", "value", "getMode", "()Lcom/polymarket/data/ESquadMuteMode;", "setMode", "(Lcom/polymarket/data/ESquadMuteMode;)V", "Swift_mode", "Swift_mode_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquadSetMuteRequest implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public ESquadSetMuteRequest(String str, ESquadMuteMode eSquadMuteMode) {
        str.getClass();
        eSquadMuteMode.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, eSquadMuteMode);
    }

    private final native long Swift_constructor_0(String squadId, ESquadMuteMode mode);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native ESquadMuteMode Swift_mode(long Swift_peer);

    private final native void Swift_mode_set(long Swift_peer, ESquadMuteMode value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_squadId(long Swift_peer);

    private final native void Swift_squadId_set(long Swift_peer, String value);

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

    public final ESquadMuteMode getMode() {
        return Swift_mode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final String getSquadId() {
        return Swift_squadId(this.Swift_peer);
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
        return new ESquadSetMuteRequest(this);
    }

    public final void setMode(ESquadMuteMode eSquadMuteMode) {
        eSquadMuteMode.getClass();
        willmutate();
        try {
            Swift_mode_set(this.Swift_peer, eSquadMuteMode);
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

    public ESquadSetMuteRequest(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ESquadSetMuteRequest(String str, ESquadMuteMode eSquadMuteMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ESquadMuteMode.INSTANCE.getUnmute() : eSquadMuteMode);
    }

    private ESquadSetMuteRequest(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}

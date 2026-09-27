package com.polymarket.clients;

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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000eB\u0011\b\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001e\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\u001f\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010 \u001a\u00020\fH\u0082 J\u0015\u0010\"\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010#\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010 \u001a\u00020\fH\u0082 J\u001d\u0010$\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0082 J\u0015\u0010%\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000f\u001a\u00020\u0001H\u0082 J\b\u00102\u001a\u00020\u0001H\u0016J\u0013\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0019\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0000H\u0082 J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020(092\u0006\u0010:\u001a\u00020\u0019H\u0016J\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020(092\u0006\u0010:\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u001b\"\u0004\b!\u0010\u001dR(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0016\u0018\u00010'X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006="}, d2 = {"Lcom/polymarket/clients/ClientNetworkMonitorConnection;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "isConnected", "", "isExpensive", "(ZZ)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "newValue", "()Z", "setConnected", "(Z)V", "Swift_isConnected", "Swift_isConnected_set", "value", "setExpensive", "Swift_isExpensive", "Swift_isExpensive_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "other", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientNetworkMonitorConnection implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public ClientNetworkMonitorConnection(boolean z, boolean z2) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(z, z2);
    }

    private final native long Swift_constructor_0(boolean isConnected, boolean isExpensive);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native boolean Swift_isConnected(long Swift_peer);

    private final native void Swift_isConnected_set(long Swift_peer, boolean value);

    private final native boolean Swift_isExpensive(long Swift_peer);

    private final native void Swift_isExpensive_set(long Swift_peer, boolean value);

    private final native boolean Swift_isequal(ClientNetworkMonitorConnection lhs, ClientNetworkMonitorConnection rhs);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientNetworkMonitorConnection)) {
            return false;
        }
        return Swift_isequal(this, (ClientNetworkMonitorConnection) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
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

    public final boolean isConnected() {
        return Swift_isConnected(this.Swift_peer);
    }

    public final boolean isExpensive() {
        return Swift_isExpensive(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ClientNetworkMonitorConnection(this);
    }

    public final void setConnected(boolean z) {
        willmutate();
        try {
            Swift_isConnected_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setExpensive(boolean z) {
        willmutate();
        try {
            Swift_isExpensive_set(this.Swift_peer, z);
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

    public ClientNetworkMonitorConnection(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ClientNetworkMonitorConnection(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2);
    }

    private ClientNetworkMonitorConnection(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}

package com.polymarket.designtokens;

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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0015\b\u0016\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\rB\u0011\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\u001c\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010\u001e\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010\u001f\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020\u0001H\u0082 J\b\u0010-\u001a\u00020\u0001H\u0016J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0019\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0082 J\b\u00104\u001a\u00020(H\u0016J\u0015\u00105\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\"072\u0006\u00108\u001a\u00020(H\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\"072\u0006\u00108\u001a\u00020(H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\rR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0015\u0018\u00010!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006;"}, d2 = {"Lcom/polymarket/designtokens/CodableHexColorPair;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "wrappedValue", "Lcom/polymarket/designtokens/HexColorPair;", "(Lcom/polymarket/designtokens/HexColorPair;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getWrappedValue", "()Lcom/polymarket/designtokens/HexColorPair;", "setWrappedValue", "Swift_wrappedValue", "Swift_wrappedValue_set", "value", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CodableHexColorPair implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public CodableHexColorPair(HexColorPair hexColorPair) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(hexColorPair);
    }

    private final native long Swift_constructor_0(HexColorPair wrappedValue);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isequal(CodableHexColorPair lhs, CodableHexColorPair rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native HexColorPair Swift_wrappedValue(long Swift_peer);

    private final native void Swift_wrappedValue_set(long Swift_peer, HexColorPair value);

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
        if (!(other instanceof CodableHexColorPair)) {
            return false;
        }
        return Swift_isequal(this, (CodableHexColorPair) other);
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

    public final HexColorPair getWrappedValue() {
        return Swift_wrappedValue(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new CodableHexColorPair(this);
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

    public final void setWrappedValue(HexColorPair hexColorPair) {
        willmutate();
        try {
            Swift_wrappedValue_set(this.Swift_peer, hexColorPair);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    public CodableHexColorPair(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ CodableHexColorPair(HexColorPair hexColorPair, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hexColorPair);
    }

    private CodableHexColorPair(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}

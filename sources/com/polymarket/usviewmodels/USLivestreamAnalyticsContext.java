package com.polymarket.usviewmodels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001JB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\t\u0010\u0011B\u0011\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010\"\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010#\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010$\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010)\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010*\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010$\u001a\u00020\u000eH\u0082 J\u0015\u0010/\u001a\u00020\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00100\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010$\u001a\u00020\u0010H\u0082 J'\u00101\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0015\u00102\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0012\u001a\u00020\u0001H\u0082 J\b\u0010?\u001a\u00020\u0001H\u0016J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u000105H\u0096\u0002J\u0019\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0000H\u0082 J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u0002050G2\u0006\u0010H\u001a\u00020\u001cH\u0016J\u0017\u0010I\u001a\b\u0012\u0004\u0012\u0002050G2\u0006\u0010H\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u00103\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0019\u0018\u000104X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u001cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006K"}, d2 = {"Lcom/polymarket/usviewmodels/USLivestreamAnalyticsContext;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "provider", "", "streamKind", "Lcom/polymarket/usviewmodels/USLivestreamStreamKind;", "phase", "Lcom/polymarket/usviewmodels/USLivestreamPhase;", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/USLivestreamStreamKind;Lcom/polymarket/usviewmodels/USLivestreamPhase;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "newValue", "getProvider", "()Ljava/lang/String;", "setProvider", "(Ljava/lang/String;)V", "Swift_provider", "Swift_provider_set", "value", "getStreamKind", "()Lcom/polymarket/usviewmodels/USLivestreamStreamKind;", "setStreamKind", "(Lcom/polymarket/usviewmodels/USLivestreamStreamKind;)V", "Swift_streamKind", "Swift_streamKind_set", "getPhase", "()Lcom/polymarket/usviewmodels/USLivestreamPhase;", "setPhase", "(Lcom/polymarket/usviewmodels/USLivestreamPhase;)V", "Swift_phase", "Swift_phase_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USLivestreamAnalyticsContext implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public USLivestreamAnalyticsContext(String str, USLivestreamStreamKind uSLivestreamStreamKind, USLivestreamPhase uSLivestreamPhase) {
        uSLivestreamStreamKind.getClass();
        uSLivestreamPhase.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, uSLivestreamStreamKind, uSLivestreamPhase);
    }

    private final native long Swift_constructor_0(String provider, USLivestreamStreamKind streamKind, USLivestreamPhase phase);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native boolean Swift_isequal(USLivestreamAnalyticsContext lhs, USLivestreamAnalyticsContext rhs);

    private final native USLivestreamPhase Swift_phase(long Swift_peer);

    private final native void Swift_phase_set(long Swift_peer, USLivestreamPhase value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_provider(long Swift_peer);

    private final native void Swift_provider_set(long Swift_peer, String value);

    private final native void Swift_release(long Swift_peer);

    private final native USLivestreamStreamKind Swift_streamKind(long Swift_peer);

    private final native void Swift_streamKind_set(long Swift_peer, USLivestreamStreamKind value);

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
        if (!(other instanceof USLivestreamAnalyticsContext)) {
            return false;
        }
        return Swift_isequal(this, (USLivestreamAnalyticsContext) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final USLivestreamPhase getPhase() {
        return Swift_phase(this.Swift_peer);
    }

    public final String getProvider() {
        return Swift_provider(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final USLivestreamStreamKind getStreamKind() {
        return Swift_streamKind(this.Swift_peer);
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
        return new USLivestreamAnalyticsContext(this);
    }

    public final void setPhase(USLivestreamPhase uSLivestreamPhase) {
        uSLivestreamPhase.getClass();
        willmutate();
        try {
            Swift_phase_set(this.Swift_peer, uSLivestreamPhase);
        } finally {
            didmutate();
        }
    }

    public final void setProvider(String str) {
        willmutate();
        try {
            Swift_provider_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setStreamKind(USLivestreamStreamKind uSLivestreamStreamKind) {
        uSLivestreamStreamKind.getClass();
        willmutate();
        try {
            Swift_streamKind_set(this.Swift_peer, uSLivestreamStreamKind);
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

    public USLivestreamAnalyticsContext(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private USLivestreamAnalyticsContext(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}

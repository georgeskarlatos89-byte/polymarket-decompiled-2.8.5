package com.polymarket.data;

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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001=B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB%\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\t\u0010\u000fB\u0011\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010%\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010*\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 J)\u0010+\u001a\u00060\u0005j\u0002`\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 J\u0015\u0010,\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0010\u001a\u00020\u0001H\u0082 J\b\u00108\u001a\u00020\u0001H\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u001c0:2\u0006\u0010;\u001a\u00020\u001eH\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0:2\u0006\u0010;\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R(\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0017\u0018\u00010.X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u001eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006>"}, d2 = {"Lcom/polymarket/data/ESquadPositionJoiners;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "buys", "", "Lcom/polymarket/data/ESquadUser;", "fades", "(Ljava/util/List;Ljava/util/List;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getBuys", "()Ljava/util/List;", "setBuys", "(Ljava/util/List;)V", "Swift_buys", "Swift_buys_set", "value", "getFades", "setFades", "Swift_fades", "Swift_fades_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquadPositionJoiners implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public ESquadPositionJoiners(List<ESquadUser> list, List<ESquadUser> list2) {
        list.getClass();
        list2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(list, list2);
    }

    private final native List<ESquadUser> Swift_buys(long Swift_peer);

    private final native void Swift_buys_set(long Swift_peer, List<ESquadUser> value);

    private final native long Swift_constructor_0(List<ESquadUser> buys, List<ESquadUser> fades);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native List<ESquadUser> Swift_fades(long Swift_peer);

    private final native void Swift_fades_set(long Swift_peer, List<ESquadUser> value);

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

    public final List<ESquadUser> getBuys() {
        return Swift_buys(this.Swift_peer);
    }

    public final List<ESquadUser> getFades() {
        return Swift_fades(this.Swift_peer);
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
        return new ESquadPositionJoiners(this);
    }

    public final void setBuys(List<ESquadUser> list) {
        list.getClass();
        List<ESquadUser> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_buys_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setFades(List<ESquadUser> list) {
        list.getClass();
        List<ESquadUser> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_fades_set(this.Swift_peer, list2);
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

    public ESquadPositionJoiners(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private ESquadPositionJoiners(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}

package com.polymarket.usviewmodels;

import com.polymarket.data.ESquad;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rB\u0011\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010&\u001a\u0004\u0018\u00010\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010'J$\u0010(\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0018H\u0082 ¢\u0006\u0002\u0010*J\u0015\u0010/\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00100\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010)\u001a\u00020\u0018H\u0082 J\u0017\u00107\u001a\u0004\u0018\u0001012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00108\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010)\u001a\u0004\u0018\u000101H\u0082 J\u0015\u00109\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0015\u0010:\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020\u0001H\u0082 J\b\u0010F\u001a\u00020\u0001H\u0016J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001a0H2\u0006\u0010I\u001a\u00020\u001cH\u0016J\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001a0H2\u0006\u0010I\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0004\u0018\u00010\u00182\b\u0010 \u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010+\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u00102\u001a\u0004\u0018\u0001012\b\u0010 \u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0015\u0018\u00010<X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\u001cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006L"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsChatViewModelPreamble;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "group", "Lcom/polymarket/data/ESquad;", "(Lcom/polymarket/data/ESquad;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getGroup", "()Lcom/polymarket/data/ESquad;", "Swift_group", "newValue", "knownHasChatMessages", "getKnownHasChatMessages", "()Ljava/lang/Boolean;", "setKnownHasChatMessages", "(Ljava/lang/Boolean;)V", "Swift_knownHasChatMessages", "(J)Ljava/lang/Boolean;", "Swift_knownHasChatMessages_set", "value", "(JLjava/lang/Boolean;)V", "isNewlyCreated", "()Z", "setNewlyCreated", "(Z)V", "Swift_isNewlyCreated", "Swift_isNewlyCreated_set", "", "pendingPositionMessageId", "getPendingPositionMessageId", "()Ljava/lang/String;", "setPendingPositionMessageId", "(Ljava/lang/String;)V", "Swift_pendingPositionMessageId", "Swift_pendingPositionMessageId_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsChatViewModelPreamble implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public SquadsChatViewModelPreamble(ESquad eSquad) {
        eSquad.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eSquad);
    }

    private final native long Swift_constructor_0(ESquad group);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native ESquad Swift_group(long Swift_peer);

    private final native boolean Swift_isNewlyCreated(long Swift_peer);

    private final native void Swift_isNewlyCreated_set(long Swift_peer, boolean value);

    private final native Boolean Swift_knownHasChatMessages(long Swift_peer);

    private final native void Swift_knownHasChatMessages_set(long Swift_peer, Boolean value);

    private final native String Swift_pendingPositionMessageId(long Swift_peer);

    private final native void Swift_pendingPositionMessageId_set(long Swift_peer, String value);

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

    public final ESquad getGroup() {
        return Swift_group(this.Swift_peer);
    }

    public final Boolean getKnownHasChatMessages() {
        return Swift_knownHasChatMessages(this.Swift_peer);
    }

    public final String getPendingPositionMessageId() {
        return Swift_pendingPositionMessageId(this.Swift_peer);
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

    public final boolean isNewlyCreated() {
        return Swift_isNewlyCreated(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new SquadsChatViewModelPreamble(this);
    }

    public final void setKnownHasChatMessages(Boolean bool) {
        willmutate();
        try {
            Swift_knownHasChatMessages_set(this.Swift_peer, bool);
        } finally {
            didmutate();
        }
    }

    public final void setNewlyCreated(boolean z) {
        willmutate();
        try {
            Swift_isNewlyCreated_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setPendingPositionMessageId(String str) {
        willmutate();
        try {
            Swift_pendingPositionMessageId_set(this.Swift_peer, str);
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

    public SquadsChatViewModelPreamble(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private SquadsChatViewModelPreamble(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}

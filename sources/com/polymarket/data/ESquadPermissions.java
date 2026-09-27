package com.polymarket.data;

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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001f\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010 \u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010!\u001a\u00020\u0015H\u0082 J\u0015\u0010%\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010&\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010!\u001a\u00020\u0015H\u0082 J\u0015\u0010*\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010+\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010!\u001a\u00020\u0015H\u0082 J\u000e\u0010'\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015J\u001d\u0010-\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010.\u001a\u00020\u0015H\u0082 J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015J\u001d\u0010/\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010.\u001a\u00020\u0015H\u0082 J\u0015\u00100\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010<\u001a\u00020\u0001H\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00170>2\u0006\u0010?\u001a\u00020\u0019H\u0016J\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00170>2\u0006\u0010?\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR$\u0010'\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR(\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u000102X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006B"}, d2 = {"Lcom/polymarket/data/ESquadPermissions;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "isPublic", "()Z", "setPublic", "(Z)V", "Swift_isPublic", "Swift_isPublic_set", "value", "allowsCustomization", "getAllowsCustomization", "setAllowsCustomization", "Swift_allowsCustomization", "Swift_allowsCustomization_set", "allowsMessaging", "getAllowsMessaging", "setAllowsMessaging", "Swift_allowsMessaging", "Swift_allowsMessaging_set", "forAdmin", "Swift_allowsMessaging_0", "isAdmin", "Swift_allowsCustomization_1", "Swift_constructor_2", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquadPermissions implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ESquadPermissions(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(mutableStruct);
    }

    private final native boolean Swift_allowsCustomization(long Swift_peer);

    private final native boolean Swift_allowsCustomization_1(long Swift_peer, boolean isAdmin);

    private final native void Swift_allowsCustomization_set(long Swift_peer, boolean value);

    private final native boolean Swift_allowsMessaging(long Swift_peer);

    private final native boolean Swift_allowsMessaging_0(long Swift_peer, boolean isAdmin);

    private final native void Swift_allowsMessaging_set(long Swift_peer, boolean value);

    private final native long Swift_constructor_2(MutableStruct copy);

    private final native boolean Swift_isPublic(long Swift_peer);

    private final native void Swift_isPublic_set(long Swift_peer, boolean value);

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

    public final boolean allowsCustomization(boolean forAdmin) {
        return Swift_allowsCustomization_1(this.Swift_peer, forAdmin);
    }

    public final boolean allowsMessaging(boolean forAdmin) {
        return Swift_allowsMessaging_0(this.Swift_peer, forAdmin);
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

    public final boolean getAllowsCustomization() {
        return Swift_allowsCustomization(this.Swift_peer);
    }

    public final boolean getAllowsMessaging() {
        return Swift_allowsMessaging(this.Swift_peer);
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

    public final boolean isPublic() {
        return Swift_isPublic(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ESquadPermissions(this);
    }

    public final void setAllowsCustomization(boolean z) {
        willmutate();
        try {
            Swift_allowsCustomization_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setAllowsMessaging(boolean z) {
        willmutate();
        try {
            Swift_allowsMessaging_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setPublic(boolean z) {
        willmutate();
        try {
            Swift_isPublic_set(this.Swift_peer, z);
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

    public ESquadPermissions(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

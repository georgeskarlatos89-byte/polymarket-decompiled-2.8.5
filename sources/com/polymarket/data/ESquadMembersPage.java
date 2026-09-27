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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001GB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010#\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082 J\u0015\u0010*\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010+\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010$\u001a\u00020\u0019H\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010,2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00103\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010$\u001a\u0004\u0018\u00010,H\u0082 J\u0015\u00107\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u00108\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010B\u001a\u00020\u0001H\u0016J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170D2\u0006\u0010E\u001a\u00020\u0019H\u0016J\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00170D2\u0006\u0010E\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010%\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u001a\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b5\u00106R(\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010:X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010'\"\u0004\bA\u0010)¨\u0006H"}, d2 = {"Lcom/polymarket/data/ESquadMembersPage;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", "Lcom/polymarket/data/ESquadMember;", "members", "getMembers", "()Ljava/util/List;", "setMembers", "(Ljava/util/List;)V", "Swift_members", "Swift_members_set", "value", "memberCount", "getMemberCount", "()I", "setMemberCount", "(I)V", "Swift_memberCount", "Swift_memberCount_set", "", "nextCursor", "getNextCursor", "()[B", "setNextCursor", "([B)V", "Swift_nextCursor", "Swift_nextCursor_set", "hasMore", "getHasMore", "()Z", "Swift_hasMore", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquadMembersPage implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ESquadMembersPage(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native boolean Swift_hasMore(long Swift_peer);

    private final native int Swift_memberCount(long Swift_peer);

    private final native void Swift_memberCount_set(long Swift_peer, int value);

    private final native List<ESquadMember> Swift_members(long Swift_peer);

    private final native void Swift_members_set(long Swift_peer, List<ESquadMember> value);

    private final native byte[] Swift_nextCursor(long Swift_peer);

    private final native void Swift_nextCursor_set(long Swift_peer, byte[] value);

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

    public final boolean getHasMore() {
        return Swift_hasMore(this.Swift_peer);
    }

    public final int getMemberCount() {
        return Swift_memberCount(this.Swift_peer);
    }

    public final List<ESquadMember> getMembers() {
        return Swift_members(this.Swift_peer);
    }

    public final byte[] getNextCursor() {
        return Swift_nextCursor(this.Swift_peer);
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
        return new ESquadMembersPage(this);
    }

    public final void setMemberCount(int i) {
        willmutate();
        try {
            Swift_memberCount_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setMembers(List<ESquadMember> list) {
        list.getClass();
        List<ESquadMember> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_members_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setNextCursor(byte[] bArr) {
        byte[] bArr2 = (byte[]) StructKt.sref$default(bArr, null, 1, null);
        willmutate();
        try {
            Swift_nextCursor_set(this.Swift_peer, bArr2);
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

    public ESquadMembersPage(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

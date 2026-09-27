package com.polymarket.usviewmodels;

import com.polymarket.data.EUserPosition;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\b\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J#\u0010 \u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0082 J\u0015\u0010!\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0082 J\u0014\u0010\"\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ#\u0010#\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0082 J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u001d\u0010(\u001a\u00020%2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010&\u001a\u00020'H\u0082 J\u0013\u0010)\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\u0019\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0082 J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\u0019H\u0016J\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00064"}, d2 = {"Lcom/polymarket/usviewmodels/ChatPositionScope;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "teamId", "", "eventSlugs", "", "(Ljava/lang/String;Ljava/util/Set;)V", "eventSlug", "(Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getTeamId", "()Ljava/lang/String;", "Swift_teamId", "getEventSlugs", "()Ljava/util/Set;", "Swift_eventSlugs", "Swift_constructor_0", "Swift_constructor_1", "withEventSlugs", "Swift_withEventSlugs_2", "includes", "", "position", "Lcom/polymarket/data/EUserPosition;", "Swift_includes_3", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChatPositionScope implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ChatPositionScope(String str, Set<String> set) {
        str.getClass();
        set.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, set);
    }

    private final native long Swift_constructor_0(String teamId, Set<String> eventSlugs);

    private final native long Swift_constructor_1(String eventSlug);

    private final native Set<String> Swift_eventSlugs(long Swift_peer);

    private final native boolean Swift_includes_3(long Swift_peer, EUserPosition position);

    private final native boolean Swift_isequal(ChatPositionScope lhs, ChatPositionScope rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_teamId(long Swift_peer);

    private final native ChatPositionScope Swift_withEventSlugs_2(long Swift_peer, Set<String> eventSlugs);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChatPositionScope)) {
            return false;
        }
        return Swift_isequal(this, (ChatPositionScope) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final Set<String> getEventSlugs() {
        return Swift_eventSlugs(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTeamId() {
        return Swift_teamId(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean includes(EUserPosition position) {
        position.getClass();
        return Swift_includes_3(this.Swift_peer, position);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final ChatPositionScope withEventSlugs(Set<String> eventSlugs) {
        eventSlugs.getClass();
        return Swift_withEventSlugs_2(this.Swift_peer, eventSlugs);
    }

    public ChatPositionScope(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public ChatPositionScope(String str) {
        str.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(str);
    }
}

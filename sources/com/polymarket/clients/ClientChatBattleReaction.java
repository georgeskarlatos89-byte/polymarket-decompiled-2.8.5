package com.polymarket.clients;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u0010$\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0019\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0082 J\b\u0010,\u001a\u00020\u0010H\u0016J\u0015\u0010-\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020(0/2\u0006\u00100\u001a\u00020\u0010H\u0016J\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020(0/2\u0006\u00100\u001a\u00020\u0010H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/polymarket/clients/ClientChatBattleReaction;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "emoji", "", "side", "Lcom/polymarket/clients/ClientChatBattleSide;", "messageId", "count", "", "(Ljava/lang/String;Lcom/polymarket/clients/ClientChatBattleSide;Ljava/lang/String;I)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getEmoji", "()Ljava/lang/String;", "Swift_emoji", "getSide", "()Lcom/polymarket/clients/ClientChatBattleSide;", "Swift_side", "getMessageId", "Swift_messageId", "getCount", "()I", "Swift_count", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientChatBattleReaction implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ClientChatBattleReaction(String str, ClientChatBattleSide clientChatBattleSide, String str2, int i) {
        str.getClass();
        clientChatBattleSide.getClass();
        str2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, clientChatBattleSide, str2, i);
    }

    private final native long Swift_constructor_0(String emoji, ClientChatBattleSide side, String messageId, int count);

    private final native int Swift_count(long Swift_peer);

    private final native String Swift_emoji(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isequal(ClientChatBattleReaction lhs, ClientChatBattleReaction rhs);

    private final native String Swift_messageId(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native ClientChatBattleSide Swift_side(long Swift_peer);

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
        if (!(other instanceof ClientChatBattleReaction)) {
            return false;
        }
        return Swift_isequal(this, (ClientChatBattleReaction) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final int getCount() {
        return Swift_count(this.Swift_peer);
    }

    public final String getEmoji() {
        return Swift_emoji(this.Swift_peer);
    }

    public final String getMessageId() {
        return Swift_messageId(this.Swift_peer);
    }

    public final ClientChatBattleSide getSide() {
        return Swift_side(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public ClientChatBattleReaction(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ClientChatBattleReaction(String str, ClientChatBattleSide clientChatBattleSide, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, clientChatBattleSide, str2, (i2 & 8) != 0 ? 1 : i);
    }
}

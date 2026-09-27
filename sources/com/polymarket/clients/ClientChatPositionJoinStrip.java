package com.polymarket.clients;

import com.polymarket.clients.ClientChatSquadPositionCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\t\u0010\u0011B\u0011\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0015\u0010 \u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010!\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\fH\u0082 J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010(\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010.\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0010H\u0082 J-\u0010/\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0015\u00100\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0012\u001a\u00020\u0001H\u0082 J\b\u0010>\u001a\u00020\u0001H\u0016J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u000103H\u0096\u0002J\u0019\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0000H\u0082 J\b\u0010E\u001a\u000209H\u0016J\u0015\u0010F\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u0002030H2\u0006\u0010I\u001a\u000209H\u0016J\u0017\u0010J\u001a\b\u0012\u0004\u0012\u0002030H2\u0006\u0010I\u001a\u000209H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u00101\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0019\u0018\u000102X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000209X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006L"}, d2 = {"Lcom/polymarket/clients/ClientChatPositionJoinStrip;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "owner", "Lcom/polymarket/clients/ClientChatSquadPositionCard$Participant;", "joiners", "", "joinersCaptionText", "", "(Lcom/polymarket/clients/ClientChatSquadPositionCard$Participant;Ljava/util/List;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getOwner", "()Lcom/polymarket/clients/ClientChatSquadPositionCard$Participant;", "setOwner", "(Lcom/polymarket/clients/ClientChatSquadPositionCard$Participant;)V", "Swift_owner", "Swift_owner_set", "value", "getJoiners", "()Ljava/util/List;", "setJoiners", "(Ljava/util/List;)V", "Swift_joiners", "Swift_joiners_set", "getJoinersCaptionText", "()Ljava/lang/String;", "setJoinersCaptionText", "(Ljava/lang/String;)V", "Swift_joinersCaptionText", "Swift_joinersCaptionText_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientChatPositionJoinStrip implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public ClientChatPositionJoinStrip(ClientChatSquadPositionCard.Participant participant, List<ClientChatSquadPositionCard.Participant> list, String str) {
        participant.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(participant, list, str);
    }

    private final native long Swift_constructor_0(ClientChatSquadPositionCard.Participant owner, List<ClientChatSquadPositionCard.Participant> joiners, String joinersCaptionText);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isequal(ClientChatPositionJoinStrip lhs, ClientChatPositionJoinStrip rhs);

    private final native List<ClientChatSquadPositionCard.Participant> Swift_joiners(long Swift_peer);

    private final native String Swift_joinersCaptionText(long Swift_peer);

    private final native void Swift_joinersCaptionText_set(long Swift_peer, String value);

    private final native void Swift_joiners_set(long Swift_peer, List<ClientChatSquadPositionCard.Participant> value);

    private final native ClientChatSquadPositionCard.Participant Swift_owner(long Swift_peer);

    private final native void Swift_owner_set(long Swift_peer, ClientChatSquadPositionCard.Participant value);

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
        if (!(other instanceof ClientChatPositionJoinStrip)) {
            return false;
        }
        return Swift_isequal(this, (ClientChatPositionJoinStrip) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final List<ClientChatSquadPositionCard.Participant> getJoiners() {
        return Swift_joiners(this.Swift_peer);
    }

    public final String getJoinersCaptionText() {
        return Swift_joinersCaptionText(this.Swift_peer);
    }

    public final ClientChatSquadPositionCard.Participant getOwner() {
        return Swift_owner(this.Swift_peer);
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
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ClientChatPositionJoinStrip(this);
    }

    public final void setJoiners(List<ClientChatSquadPositionCard.Participant> list) {
        list.getClass();
        List<ClientChatSquadPositionCard.Participant> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_joiners_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setJoinersCaptionText(String str) {
        willmutate();
        try {
            Swift_joinersCaptionText_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setOwner(ClientChatSquadPositionCard.Participant participant) {
        participant.getClass();
        ClientChatSquadPositionCard.Participant participant2 = (ClientChatSquadPositionCard.Participant) StructKt.sref$default(participant, null, 1, null);
        willmutate();
        try {
            Swift_owner_set(this.Swift_peer, participant2);
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

    public ClientChatPositionJoinStrip(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ClientChatPositionJoinStrip(ClientChatSquadPositionCard.Participant participant, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(participant, list, (i & 4) != 0 ? null : str);
    }

    private ClientChatPositionJoinStrip(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}

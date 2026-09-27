package com.polymarket.clients;

import com.polymarket.data.EColorScheme;
import com.polymarket.data.ESquadPositionMessage;
import com.polymarket.data.EUserPosition;
import java.net.URI;
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
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002]^B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB5\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\t\u0010\u0012B\u0011\b\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0015\u0010!\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\"\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\fH\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010)\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010/\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00103\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0015\u00107\u001a\u0002052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u000e\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:J\u001d\u0010;\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010<\u001a\u00020:H\u0082 J3\u0010=\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 J\u000e\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AJ\u001d\u0010B\u001a\u00020?2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010@\u001a\u00020AH\u0082 J\u0015\u0010C\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0013\u001a\u00020\u0001H\u0082 J\b\u0010Q\u001a\u00020\u0001H\u0016J\u0013\u0010R\u001a\u0002052\b\u0010S\u001a\u0004\u0018\u00010FH\u0096\u0002J\u0019\u0010T\u001a\u0002052\u0006\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0000H\u0082 J\b\u0010W\u001a\u00020LH\u0016J\u0015\u0010X\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020F0Z2\u0006\u0010[\u001a\u00020LH\u0016J\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020F0Z2\u0006\u0010[\u001a\u00020LH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\u0011\u00104\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b4\u00106R(\u0010D\u001a\u0010\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u001a\u0018\u00010EX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020LX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006_"}, d2 = {"Lcom/polymarket/clients/ClientChatSquadPositionCard;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "message", "Lcom/polymarket/data/ESquadPositionMessage;", "attachment", "Lcom/polymarket/clients/ClientChatPositionAttachment;", "starter", "Lcom/polymarket/clients/ClientChatSquadPositionCard$Participant;", "joiner", "(Lcom/polymarket/data/ESquadPositionMessage;Lcom/polymarket/clients/ClientChatPositionAttachment;Lcom/polymarket/clients/ClientChatSquadPositionCard$Participant;Lcom/polymarket/clients/ClientChatSquadPositionCard$Participant;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getMessage", "()Lcom/polymarket/data/ESquadPositionMessage;", "setMessage", "(Lcom/polymarket/data/ESquadPositionMessage;)V", "Swift_message", "Swift_message_set", "value", "getAttachment", "()Lcom/polymarket/clients/ClientChatPositionAttachment;", "setAttachment", "(Lcom/polymarket/clients/ClientChatPositionAttachment;)V", "Swift_attachment", "Swift_attachment_set", "getStarter", "()Lcom/polymarket/clients/ClientChatSquadPositionCard$Participant;", "setStarter", "(Lcom/polymarket/clients/ClientChatSquadPositionCard$Participant;)V", "Swift_starter", "Swift_starter_set", "getJoiner", "setJoiner", "Swift_joiner", "Swift_joiner_set", "isHydrated", "", "()Z", "Swift_isHydrated", "hydrated", "with", "Lcom/polymarket/data/EUserPosition;", "Swift_hydrated_0", "position", "Swift_constructor_1", "makePillSnapshot", "Lcom/polymarket/clients/ClientChatPositionSnapshot;", "colorScheme", "Lcom/polymarket/data/EColorScheme;", "Swift_makePillSnapshot_2", "Swift_constructor_3", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Participant", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientChatSquadPositionCard implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public /* synthetic */ ClientChatSquadPositionCard(ESquadPositionMessage eSquadPositionMessage, ClientChatPositionAttachment clientChatPositionAttachment, Participant participant, Participant participant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eSquadPositionMessage, (i & 2) != 0 ? null : clientChatPositionAttachment, (i & 4) != 0 ? null : participant, (i & 8) != 0 ? null : participant2);
    }

    private final native ClientChatPositionAttachment Swift_attachment(long Swift_peer);

    private final native void Swift_attachment_set(long Swift_peer, ClientChatPositionAttachment value);

    private final native long Swift_constructor_1(ESquadPositionMessage message, ClientChatPositionAttachment attachment, Participant starter, Participant joiner);

    private final native long Swift_constructor_3(MutableStruct copy);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native ClientChatSquadPositionCard Swift_hydrated_0(long Swift_peer, EUserPosition position);

    private final native boolean Swift_isHydrated(long Swift_peer);

    private final native boolean Swift_isequal(ClientChatSquadPositionCard lhs, ClientChatSquadPositionCard rhs);

    private final native Participant Swift_joiner(long Swift_peer);

    private final native void Swift_joiner_set(long Swift_peer, Participant value);

    private final native ClientChatPositionSnapshot Swift_makePillSnapshot_2(long Swift_peer, EColorScheme colorScheme);

    private final native ESquadPositionMessage Swift_message(long Swift_peer);

    private final native void Swift_message_set(long Swift_peer, ESquadPositionMessage value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native Participant Swift_starter(long Swift_peer);

    private final native void Swift_starter_set(long Swift_peer, Participant value);

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
        if (!(other instanceof ClientChatSquadPositionCard)) {
            return false;
        }
        return Swift_isequal(this, (ClientChatSquadPositionCard) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final ClientChatPositionAttachment getAttachment() {
        return Swift_attachment(this.Swift_peer);
    }

    public final Participant getJoiner() {
        return Swift_joiner(this.Swift_peer);
    }

    public final ESquadPositionMessage getMessage() {
        return Swift_message(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final Participant getStarter() {
        return Swift_starter(this.Swift_peer);
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

    public final ClientChatSquadPositionCard hydrated(EUserPosition with) {
        with.getClass();
        return Swift_hydrated_0(this.Swift_peer, with);
    }

    public final boolean isHydrated() {
        return Swift_isHydrated(this.Swift_peer);
    }

    public final ClientChatPositionSnapshot makePillSnapshot(EColorScheme colorScheme) {
        colorScheme.getClass();
        return Swift_makePillSnapshot_2(this.Swift_peer, colorScheme);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ClientChatSquadPositionCard(this);
    }

    public final void setAttachment(ClientChatPositionAttachment clientChatPositionAttachment) {
        willmutate();
        try {
            Swift_attachment_set(this.Swift_peer, clientChatPositionAttachment);
        } finally {
            didmutate();
        }
    }

    public final void setJoiner(Participant participant) {
        Participant participant2 = (Participant) StructKt.sref$default(participant, null, 1, null);
        willmutate();
        try {
            Swift_joiner_set(this.Swift_peer, participant2);
        } finally {
            didmutate();
        }
    }

    public final void setMessage(ESquadPositionMessage eSquadPositionMessage) {
        eSquadPositionMessage.getClass();
        ESquadPositionMessage eSquadPositionMessage2 = (ESquadPositionMessage) StructKt.sref$default(eSquadPositionMessage, null, 1, null);
        willmutate();
        try {
            Swift_message_set(this.Swift_peer, eSquadPositionMessage2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setStarter(Participant participant) {
        Participant participant2 = (Participant) StructKt.sref$default(participant, null, 1, null);
        willmutate();
        try {
            Swift_starter_set(this.Swift_peer, participant2);
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

    public ClientChatSquadPositionCard(ESquadPositionMessage eSquadPositionMessage, ClientChatPositionAttachment clientChatPositionAttachment, Participant participant, Participant participant2) {
        eSquadPositionMessage.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(eSquadPositionMessage, clientChatPositionAttachment, participant, participant2);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\t\u0010\u0010B\u0011\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0015\u0010\u001f\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010 \u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010!\u001a\u00020\fH\u0082 J\u0015\u0010$\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010%\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010!\u001a\u00020\fH\u0082 J\u0017\u0010*\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010+\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0082 J'\u0010,\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0082 J\u0015\u0010-\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0011\u001a\u00020\u0001H\u0082 J\b\u0010;\u001a\u00020\u0001H\u0016J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u000100H\u0096\u0002J\u0019\u0010?\u001a\u00020=2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0000H\u0082 J\b\u0010B\u001a\u000206H\u0016J\u0015\u0010C\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u0002000E2\u0006\u0010F\u001a\u000206H\u0016J\u0017\u0010G\u001a\b\u0012\u0004\u0012\u0002000E2\u0006\u0010F\u001a\u000206H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR(\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010.\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0018\u0018\u00010/X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006I"}, d2 = {"Lcom/polymarket/clients/ClientChatSquadPositionCard$Participant;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "userId", "", "displayName", "avatarUrl", "Ljava/net/URI;", "(Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "Swift_userId", "Swift_userId_set", "value", "getDisplayName", "setDisplayName", "Swift_displayName", "Swift_displayName_set", "getAvatarUrl", "()Ljava/net/URI;", "setAvatarUrl", "(Ljava/net/URI;)V", "Swift_avatarUrl", "Swift_avatarUrl_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Participant implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public Participant(String str, String str2, URI uri) {
            str.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, uri);
        }

        private final native URI Swift_avatarUrl(long Swift_peer);

        private final native void Swift_avatarUrl_set(long Swift_peer, URI value);

        private final native long Swift_constructor_0(String userId, String displayName, URI avatarUrl);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native String Swift_displayName(long Swift_peer);

        private final native void Swift_displayName_set(long Swift_peer, String value);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(Participant lhs, Participant rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_userId(long Swift_peer);

        private final native void Swift_userId_set(long Swift_peer, String value);

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
            if (!(other instanceof Participant)) {
                return false;
            }
            return Swift_isequal(this, (Participant) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final URI getAvatarUrl() {
            return Swift_avatarUrl(this.Swift_peer);
        }

        public final String getDisplayName() {
            return Swift_displayName(this.Swift_peer);
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

        public final String getUserId() {
            return Swift_userId(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new Participant(this);
        }

        public final void setAvatarUrl(URI uri) {
            URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
            willmutate();
            try {
                Swift_avatarUrl_set(this.Swift_peer, uri2);
            } finally {
                didmutate();
            }
        }

        public final void setDisplayName(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_displayName_set(this.Swift_peer, str);
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

        public final void setUserId(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_userId_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public Participant(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Participant(String str, String str2, URI uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : uri);
        }

        private Participant(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    public ClientChatSquadPositionCard(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private ClientChatSquadPositionCard(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_3(mutableStruct);
    }
}

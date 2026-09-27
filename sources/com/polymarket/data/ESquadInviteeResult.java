package com.polymarket.data;

import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001HB\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\u0011B\u0011\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0015\u0010&\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010'\u001a\u00020\u00192\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010(\u001a\u00020\u0002H\u0082 J\u0015\u0010-\u001a\u00020\u000f2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010.\u001a\u00020\u00192\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010(\u001a\u00020\u000fH\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00102\u001a\u00020\u00192\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0015\u00105\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J'\u00106\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0015\u00107\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0082 J\b\u0010C\u001a\u00020\u0003H\u0016J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001e0E2\u0006\u0010F\u001a\u00020 H\u0016J\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001e0E2\u0006\u0010F\u001a\u00020 H\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010#\"\u0004\b0\u0010%R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010#R(\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0019\u0018\u000109X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006I"}, d2 = {"Lcom/polymarket/data/ESquadInviteeResult;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "userId", "outcome", "Lcom/polymarket/data/ESquadInviteeOutcome;", "inviteId", "(Ljava/lang/String;Lcom/polymarket/data/ESquadInviteeOutcome;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "Swift_userId", "Swift_userId_set", "value", "getOutcome", "()Lcom/polymarket/data/ESquadInviteeOutcome;", "setOutcome", "(Lcom/polymarket/data/ESquadInviteeOutcome;)V", "Swift_outcome", "Swift_outcome_set", "getInviteId", "setInviteId", "Swift_inviteId", "Swift_inviteId_set", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquadInviteeResult implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public ESquadInviteeResult(String str, ESquadInviteeOutcome eSquadInviteeOutcome, String str2) {
        str.getClass();
        eSquadInviteeOutcome.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, eSquadInviteeOutcome, str2);
    }

    private final native long Swift_constructor_0(String userId, ESquadInviteeOutcome outcome, String inviteId);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native String Swift_id(long Swift_peer);

    private final native String Swift_inviteId(long Swift_peer);

    private final native void Swift_inviteId_set(long Swift_peer, String value);

    private final native ESquadInviteeOutcome Swift_outcome(long Swift_peer);

    private final native void Swift_outcome_set(long Swift_peer, ESquadInviteeOutcome value);

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
        if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final String getInviteId() {
        return Swift_inviteId(this.Swift_peer);
    }

    public final ESquadInviteeOutcome getOutcome() {
        return Swift_outcome(this.Swift_peer);
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
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ESquadInviteeResult(this);
    }

    public final void setInviteId(String str) {
        willmutate();
        try {
            Swift_inviteId_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setOutcome(ESquadInviteeOutcome eSquadInviteeOutcome) {
        eSquadInviteeOutcome.getClass();
        willmutate();
        try {
            Swift_outcome_set(this.Swift_peer, eSquadInviteeOutcome);
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

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public ESquadInviteeResult(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ESquadInviteeResult(String str, ESquadInviteeOutcome eSquadInviteeOutcome, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ESquadInviteeOutcome.invalid : eSquadInviteeOutcome, (i & 4) != 0 ? null : str2);
    }

    private ESquadInviteeResult(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }
}

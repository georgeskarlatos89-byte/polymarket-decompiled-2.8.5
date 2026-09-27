package com.polymarket.data;

import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0097\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0097\u0001B\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0012\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010#\u001a\u00020\u001d2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010$\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010%\u001a\u00020\u001dH\u0082 J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020'0&2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J#\u0010.\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0082 J\u001b\u00102\u001a\b\u0012\u0004\u0012\u00020'0&2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J#\u00103\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0082 J\u001b\u00108\u001a\b\u0012\u0004\u0012\u0002040&2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J#\u00109\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002040&H\u0082 J\u0017\u0010?\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010@\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u0010G\u001a\u0004\u0018\u00010A2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010H\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010%\u001a\u0004\u0018\u00010AH\u0082 J\u001c\u0010N\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 ¢\u0006\u0002\u0010OJ$\u0010P\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010%\u001a\u0004\u0018\u00010\u001bH\u0082 ¢\u0006\u0002\u0010QJ\u0015\u0010X\u001a\u00020R2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010Y\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010%\u001a\u00020RH\u0082 J\u0015\u0010\\\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001b\u0010_\u001a\b\u0012\u0004\u0012\u00020'0&2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010c\u001a\u00020\u001b2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001c\u0010f\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 ¢\u0006\u0002\u0010OJ\u0015\u0010i\u001a\u00020\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010l\u001a\u00020\u001d2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001b\u0010o\u001a\b\u0012\u0004\u0012\u00020'0&2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001b\u0010r\u001a\b\u0012\u0004\u0012\u00020'0&2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0010\u0010s\u001a\u0004\u0018\u00010'2\u0006\u0010t\u001a\u00020\u0002J\u001f\u0010u\u001a\u0004\u0018\u00010'2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010v\u001a\u00020\u0002H\u0082 J\u000e\u0010w\u001a\u00020\u00172\u0006\u0010v\u001a\u00020\u0002J\u001d\u0010x\u001a\u00020\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010v\u001a\u00020\u0002H\u0082 J\u000e\u0010y\u001a\u00020\u00172\u0006\u0010v\u001a\u00020\u0002J\u001d\u0010z\u001a\u00020\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010v\u001a\u00020\u0002H\u0082 J\u000e\u0010{\u001a\u00020\u00172\u0006\u0010v\u001a\u00020\u0002J\u001d\u0010|\u001a\u00020\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010v\u001a\u00020\u0002H\u0082 J\u0016\u0010}\u001a\u00020\u00172\u0006\u0010~\u001a\u0002042\u0006\u0010\u007f\u001a\u00020\u0002J&\u0010\u0080\u0001\u001a\u00020\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010~\u001a\u0002042\u0006\u0010\u007f\u001a\u00020\u0002H\u0082 J\u0013\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u0002J!\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0082\u00012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010v\u001a\u00020\u0002H\u0082 J\u0012\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00022\u0007\u0010\u0083\u0001\u001a\u00020'J \u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010s\u001a\u00020'H\u0082 J\u0016\u0010\u0087\u0001\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u0003H\u0082 J\t\u0010\u0092\u0001\u001a\u00020\u0003H\u0016J\u0019\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u0094\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u001bH\u0016J\u001a\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u0094\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R0\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020'0&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R0\u0010/\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020'0&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010*\"\u0004\b1\u0010,R0\u00105\u001a\b\u0012\u0004\u0012\u0002040&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002040&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R(\u0010:\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010B\u001a\u0004\u0018\u00010A2\b\u0010\u001c\u001a\u0004\u0018\u00010A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010I\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010S\u001a\u00020R2\u0006\u0010\u001c\u001a\u00020R8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010<R\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020'0&8F¢\u0006\u0006\u001a\u0004\b^\u0010*R\u0011\u0010`\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0013\u0010d\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\be\u0010KR\u0011\u0010g\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0011\u0010j\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bk\u0010 R\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020'0&8F¢\u0006\u0006\u001a\u0004\bn\u0010*R\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020'0&8F¢\u0006\u0006\u001a\u0004\bq\u0010*R.\u0010\u0088\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0089\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001e\u0010\u008e\u0001\u001a\u00020\u001bX\u0096\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u008f\u0001\u0010b\"\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0098\u0001"}, d2 = {"Lcom/polymarket/data/ESquadDetails;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "Lcom/polymarket/data/ESquad;", "squad", "getSquad", "()Lcom/polymarket/data/ESquad;", "setSquad", "(Lcom/polymarket/data/ESquad;)V", "Swift_squad", "Swift_squad_set", "value", "", "Lcom/polymarket/data/ESquadMember;", "members", "getMembers", "()Ljava/util/List;", "setMembers", "(Ljava/util/List;)V", "Swift_members", "Swift_members_set", "lastActiveMembers", "getLastActiveMembers", "setLastActiveMembers", "Swift_lastActiveMembers", "Swift_lastActiveMembers_set", "Lcom/polymarket/data/ESquadInvitation;", "pendingInvitations", "getPendingInvitations", "setPendingInvitations", "Swift_pendingInvitations", "Swift_pendingInvitations_set", "inviteLinkId", "getInviteLinkId", "()Ljava/lang/String;", "setInviteLinkId", "(Ljava/lang/String;)V", "Swift_inviteLinkId", "Swift_inviteLinkId_set", "Lcom/polymarket/data/ESquadUser;", "creatorUser", "getCreatorUser", "()Lcom/polymarket/data/ESquadUser;", "setCreatorUser", "(Lcom/polymarket/data/ESquadUser;)V", "Swift_creatorUser", "Swift_creatorUser_set", "maxMembers", "getMaxMembers", "()Ljava/lang/Integer;", "setMaxMembers", "(Ljava/lang/Integer;)V", "Swift_maxMembers", "(J)Ljava/lang/Integer;", "Swift_maxMembers_set", "(JLjava/lang/Integer;)V", "Lcom/polymarket/data/ESquadMemberSettings;", "viewerSettings", "getViewerSettings", "()Lcom/polymarket/data/ESquadMemberSettings;", "setViewerSettings", "(Lcom/polymarket/data/ESquadMemberSettings;)V", "Swift_viewerSettings", "Swift_viewerSettings_set", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", "activeMembers", "getActiveMembers", "Swift_activeMembers", "totalMemberCount", "getTotalMemberCount", "()I", "Swift_totalMemberCount", "remainingInviteCapacity", "getRemainingInviteCapacity", "Swift_remainingInviteCapacity", "isAtInviteCapacity", "()Z", "Swift_isAtInviteCapacity", "squadWithMembers", "getSquadWithMembers", "Swift_squadWithMembers", "activeMembersAdminsFirst", "getActiveMembersAdminsFirst", "Swift_activeMembersAdminsFirst", "activeAdmins", "getActiveAdmins", "Swift_activeAdmins", "member", "withUserId", "Swift_member_0", "userId", "isAdmin", "Swift_isAdmin_1", "canSendMessages", "Swift_canSendMessages_2", "canCustomize", "Swift_canCustomize_3", "canCancelInvite", "invitation", "viewerUserId", "Swift_canCancelInvite_4", "leaveRestriction", "Lcom/polymarket/data/ESquadLeaveRestriction;", "for_", "Swift_leaveRestriction_5", "roleText", "Swift_roleText_6", "Swift_constructor_7", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquadDetails implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ESquadDetails(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_7(mutableStruct);
    }

    private final native List<ESquadMember> Swift_activeAdmins(long Swift_peer);

    private final native List<ESquadMember> Swift_activeMembers(long Swift_peer);

    private final native List<ESquadMember> Swift_activeMembersAdminsFirst(long Swift_peer);

    private final native boolean Swift_canCancelInvite_4(long Swift_peer, ESquadInvitation invitation, String viewerUserId);

    private final native boolean Swift_canCustomize_3(long Swift_peer, String userId);

    private final native boolean Swift_canSendMessages_2(long Swift_peer, String userId);

    private final native long Swift_constructor_7(MutableStruct copy);

    private final native ESquadUser Swift_creatorUser(long Swift_peer);

    private final native void Swift_creatorUser_set(long Swift_peer, ESquadUser value);

    private final native String Swift_id(long Swift_peer);

    private final native String Swift_inviteLinkId(long Swift_peer);

    private final native void Swift_inviteLinkId_set(long Swift_peer, String value);

    private final native boolean Swift_isAdmin_1(long Swift_peer, String userId);

    private final native boolean Swift_isAtInviteCapacity(long Swift_peer);

    private final native List<ESquadMember> Swift_lastActiveMembers(long Swift_peer);

    private final native void Swift_lastActiveMembers_set(long Swift_peer, List<ESquadMember> value);

    private final native ESquadLeaveRestriction Swift_leaveRestriction_5(long Swift_peer, String userId);

    private final native Integer Swift_maxMembers(long Swift_peer);

    private final native void Swift_maxMembers_set(long Swift_peer, Integer value);

    private final native ESquadMember Swift_member_0(long Swift_peer, String userId);

    private final native List<ESquadMember> Swift_members(long Swift_peer);

    private final native void Swift_members_set(long Swift_peer, List<ESquadMember> value);

    private final native List<ESquadInvitation> Swift_pendingInvitations(long Swift_peer);

    private final native void Swift_pendingInvitations_set(long Swift_peer, List<ESquadInvitation> value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native Integer Swift_remainingInviteCapacity(long Swift_peer);

    private final native String Swift_roleText_6(long Swift_peer, ESquadMember member);

    private final native ESquad Swift_squad(long Swift_peer);

    private final native ESquad Swift_squadWithMembers(long Swift_peer);

    private final native void Swift_squad_set(long Swift_peer, ESquad value);

    private final native int Swift_totalMemberCount(long Swift_peer);

    private final native ESquadMemberSettings Swift_viewerSettings(long Swift_peer);

    private final native void Swift_viewerSettings_set(long Swift_peer, ESquadMemberSettings value);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean canCancelInvite(ESquadInvitation invitation, String viewerUserId) {
        invitation.getClass();
        viewerUserId.getClass();
        return Swift_canCancelInvite_4(this.Swift_peer, invitation, viewerUserId);
    }

    public final boolean canCustomize(String userId) {
        userId.getClass();
        return Swift_canCustomize_3(this.Swift_peer, userId);
    }

    public final boolean canSendMessages(String userId) {
        userId.getClass();
        return Swift_canSendMessages_2(this.Swift_peer, userId);
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

    public final List<ESquadMember> getActiveAdmins() {
        return Swift_activeAdmins(this.Swift_peer);
    }

    public final List<ESquadMember> getActiveMembers() {
        return Swift_activeMembers(this.Swift_peer);
    }

    public final List<ESquadMember> getActiveMembersAdminsFirst() {
        return Swift_activeMembersAdminsFirst(this.Swift_peer);
    }

    public final ESquadUser getCreatorUser() {
        return Swift_creatorUser(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final String getInviteLinkId() {
        return Swift_inviteLinkId(this.Swift_peer);
    }

    public final List<ESquadMember> getLastActiveMembers() {
        return Swift_lastActiveMembers(this.Swift_peer);
    }

    public final Integer getMaxMembers() {
        return Swift_maxMembers(this.Swift_peer);
    }

    public final List<ESquadMember> getMembers() {
        return Swift_members(this.Swift_peer);
    }

    public final List<ESquadInvitation> getPendingInvitations() {
        return Swift_pendingInvitations(this.Swift_peer);
    }

    public final Integer getRemainingInviteCapacity() {
        return Swift_remainingInviteCapacity(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final ESquad getSquad() {
        return Swift_squad(this.Swift_peer);
    }

    public final ESquad getSquadWithMembers() {
        return Swift_squadWithMembers(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final int getTotalMemberCount() {
        return Swift_totalMemberCount(this.Swift_peer);
    }

    public final ESquadMemberSettings getViewerSettings() {
        return Swift_viewerSettings(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isAdmin(String userId) {
        userId.getClass();
        return Swift_isAdmin_1(this.Swift_peer, userId);
    }

    public final boolean isAtInviteCapacity() {
        return Swift_isAtInviteCapacity(this.Swift_peer);
    }

    public final ESquadLeaveRestriction leaveRestriction(String for_) {
        for_.getClass();
        return Swift_leaveRestriction_5(this.Swift_peer, for_);
    }

    public final ESquadMember member(String withUserId) {
        withUserId.getClass();
        return Swift_member_0(this.Swift_peer, withUserId);
    }

    public final String roleText(ESquadMember for_) {
        for_.getClass();
        return Swift_roleText_6(this.Swift_peer, for_);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ESquadDetails(this);
    }

    public final void setCreatorUser(ESquadUser eSquadUser) {
        ESquadUser eSquadUser2 = (ESquadUser) StructKt.sref$default(eSquadUser, null, 1, null);
        willmutate();
        try {
            Swift_creatorUser_set(this.Swift_peer, eSquadUser2);
        } finally {
            didmutate();
        }
    }

    public final void setInviteLinkId(String str) {
        willmutate();
        try {
            Swift_inviteLinkId_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setLastActiveMembers(List<ESquadMember> list) {
        list.getClass();
        List<ESquadMember> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_lastActiveMembers_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setMaxMembers(Integer num) {
        willmutate();
        try {
            Swift_maxMembers_set(this.Swift_peer, num);
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

    public final void setPendingInvitations(List<ESquadInvitation> list) {
        list.getClass();
        List<ESquadInvitation> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_pendingInvitations_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setSquad(ESquad eSquad) {
        eSquad.getClass();
        ESquad eSquad2 = (ESquad) StructKt.sref$default(eSquad, null, 1, null);
        willmutate();
        try {
            Swift_squad_set(this.Swift_peer, eSquad2);
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

    public final void setViewerSettings(ESquadMemberSettings eSquadMemberSettings) {
        eSquadMemberSettings.getClass();
        ESquadMemberSettings eSquadMemberSettings2 = (ESquadMemberSettings) StructKt.sref$default(eSquadMemberSettings, null, 1, null);
        willmutate();
        try {
            Swift_viewerSettings_set(this.Swift_peer, eSquadMemberSettings2);
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

    public ESquadDetails(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

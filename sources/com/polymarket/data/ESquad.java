package com.polymarket.data;

import com.polymarket.data.ESquadMember;
import com.socure.docv.capturesdk.api.Keys;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.Date;
import java.util.List;
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
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0092\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0092\u0001B\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0012\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\"\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010#\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010$\u001a\u00020\u0002H\u0082 J\u0015\u0010(\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010)\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010$\u001a\u00020\u0002H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010*2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00101\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u00010*H\u0082 J\u0017\u00108\u001a\u0004\u0018\u0001022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00109\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u000102H\u0082 J\u0015\u0010?\u001a\u00020\u001b2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010@\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010$\u001a\u00020\u001bH\u0082 J\u0015\u0010D\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010E\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010$\u001a\u00020\u0002H\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010F2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010M\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u00010FH\u0082 J\u001b\u0010U\u001a\b\u0012\u0004\u0012\u00020O0N2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J#\u0010V\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020O0NH\u0082 J\u001b\u0010Z\u001a\b\u0012\u0004\u0012\u00020O0N2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J#\u0010[\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020O0NH\u0082 J\u001b\u0010`\u001a\b\u0012\u0004\u0012\u00020\\0N2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J#\u0010a\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\\0NH\u0082 J\u0015\u0010h\u001a\u00020b2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010i\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010$\u001a\u00020bH\u0082 J\u0017\u0010m\u001a\u0004\u0018\u00010F2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010n\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u00010FH\u0082 J\u0015\u0010q\u001a\u00020\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001b\u0010t\u001a\b\u0012\u0004\u0012\u00020O0N2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0010\u0010u\u001a\u0004\u0018\u00010v2\u0006\u0010w\u001a\u00020\u0002J\u001f\u0010x\u001a\u0004\u0018\u00010v2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010y\u001a\u00020\u0002H\u0082 J\u0015\u0010|\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010\u007f\u001a\u00020\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0010\u0010\u0080\u0001\u001a\u00020\u00022\u0007\u0010\u0081\u0001\u001a\u00020\u0002J\u001f\u0010\u0082\u0001\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0007\u0010\u0081\u0001\u001a\u00020\u0002H\u0082 J\u0016\u0010\u0083\u0001\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u0003H\u0082 J\t\u0010\u008d\u0001\u001a\u00020\u0003H\u0016J\u0019\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u008f\u00012\u0007\u0010\u0090\u0001\u001a\u00020\u001bH\u0016J\u001a\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u008f\u00012\u0007\u0010\u0090\u0001\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010%\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R(\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u001c\u001a\u0004\u0018\u00010*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00103\u001a\u0004\u0018\u0001022\b\u0010\u001c\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010:\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010A\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010!R(\u0010G\u001a\u0004\u0018\u00010F2\b\u0010\u001c\u001a\u0004\u0018\u00010F8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR0\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020O0N8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR0\u0010W\u001a\b\u0012\u0004\u0012\u00020O0N2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020O0N8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010R\"\u0004\bY\u0010TR0\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0N2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\\0N8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010R\"\u0004\b_\u0010TR$\u0010c\u001a\u00020b2\u0006\u0010\u001c\u001a\u00020b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR(\u0010j\u001a\u0004\u0018\u00010F2\b\u0010\u001c\u001a\u0004\u0018\u00010F8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010I\"\u0004\bl\u0010KR\u0011\u0010o\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020O0N8F¢\u0006\u0006\u001a\u0004\bs\u0010RR\u0011\u0010z\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b{\u0010\u001fR\u0011\u0010}\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b~\u0010pR.\u0010\u0084\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0085\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001d\u0010\u008a\u0001\u001a\u00020\u001bX\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010<\"\u0005\b\u008c\u0001\u0010>¨\u0006\u0093\u0001"}, d2 = {"Lcom/polymarket/data/ESquad;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", Keys.KEY_NAME, "getName", "setName", "Swift_name", "Swift_name_set", "Ljava/net/URI;", "imageUrl", "getImageUrl", "()Ljava/net/URI;", "setImageUrl", "(Ljava/net/URI;)V", "Swift_imageUrl", "Swift_imageUrl_set", "Lcom/polymarket/data/ESquadImage;", "image", "getImage", "()Lcom/polymarket/data/ESquadImage;", "setImage", "(Lcom/polymarket/data/ESquadImage;)V", "Swift_image", "Swift_image_set", "totalMemberCount", "getTotalMemberCount", "()I", "setTotalMemberCount", "(I)V", "Swift_totalMemberCount", "Swift_totalMemberCount_set", "createdBy", "getCreatedBy", "setCreatedBy", "Swift_createdBy", "Swift_createdBy_set", "Ljava/util/Date;", "createdAt", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "Swift_createdAt", "Swift_createdAt_set", "", "Lcom/polymarket/data/ESquadMember;", "members", "getMembers", "()Ljava/util/List;", "setMembers", "(Ljava/util/List;)V", "Swift_members", "Swift_members_set", "lastActiveMembers", "getLastActiveMembers", "setLastActiveMembers", "Swift_lastActiveMembers", "Swift_lastActiveMembers_set", "Lcom/polymarket/data/ESquadUser;", "pendingInviteUsers", "getPendingInviteUsers", "setPendingInviteUsers", "Swift_pendingInviteUsers", "Swift_pendingInviteUsers_set", "Lcom/polymarket/data/ESquadPermissions;", "permissions", "getPermissions", "()Lcom/polymarket/data/ESquadPermissions;", "setPermissions", "(Lcom/polymarket/data/ESquadPermissions;)V", "Swift_permissions", "Swift_permissions_set", "viewerMutedUntil", "getViewerMutedUntil", "setViewerMutedUntil", "Swift_viewerMutedUntil", "Swift_viewerMutedUntil_set", "isViewerMuted", "()Z", "Swift_isViewerMuted", "activeMembers", "getActiveMembers", "Swift_activeMembers", "role", "Lcom/polymarket/data/ESquadMember$Role;", "of", "Swift_role_0", "userId", "memberCountText", "getMemberCountText", "Swift_memberCountText", "hasDefaultName", "getHasDefaultName", "Swift_hasDefaultName", "displayName", "viewerUserId", "Swift_displayName_2", "Swift_constructor_3", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquad implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ESquad(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_3(mutableStruct);
    }

    private final native List<ESquadMember> Swift_activeMembers(long Swift_peer);

    private final native long Swift_constructor_3(MutableStruct copy);

    private final native Date Swift_createdAt(long Swift_peer);

    private final native void Swift_createdAt_set(long Swift_peer, Date value);

    private final native String Swift_createdBy(long Swift_peer);

    private final native void Swift_createdBy_set(long Swift_peer, String value);

    private final native String Swift_displayName_2(long Swift_peer, String viewerUserId);

    private final native boolean Swift_hasDefaultName(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native ESquadImage Swift_image(long Swift_peer);

    private final native URI Swift_imageUrl(long Swift_peer);

    private final native void Swift_imageUrl_set(long Swift_peer, URI value);

    private final native void Swift_image_set(long Swift_peer, ESquadImage value);

    private final native boolean Swift_isViewerMuted(long Swift_peer);

    private final native List<ESquadMember> Swift_lastActiveMembers(long Swift_peer);

    private final native void Swift_lastActiveMembers_set(long Swift_peer, List<ESquadMember> value);

    private final native String Swift_memberCountText(long Swift_peer);

    private final native List<ESquadMember> Swift_members(long Swift_peer);

    private final native void Swift_members_set(long Swift_peer, List<ESquadMember> value);

    private final native String Swift_name(long Swift_peer);

    private final native void Swift_name_set(long Swift_peer, String value);

    private final native List<ESquadUser> Swift_pendingInviteUsers(long Swift_peer);

    private final native void Swift_pendingInviteUsers_set(long Swift_peer, List<ESquadUser> value);

    private final native ESquadPermissions Swift_permissions(long Swift_peer);

    private final native void Swift_permissions_set(long Swift_peer, ESquadPermissions value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native ESquadMember.Role Swift_role_0(long Swift_peer, String userId);

    private final native int Swift_totalMemberCount(long Swift_peer);

    private final native void Swift_totalMemberCount_set(long Swift_peer, int value);

    private final native Date Swift_viewerMutedUntil(long Swift_peer);

    private final native void Swift_viewerMutedUntil_set(long Swift_peer, Date value);

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

    public final String displayName(String viewerUserId) {
        viewerUserId.getClass();
        return Swift_displayName_2(this.Swift_peer, viewerUserId);
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

    public final List<ESquadMember> getActiveMembers() {
        return Swift_activeMembers(this.Swift_peer);
    }

    public final Date getCreatedAt() {
        return Swift_createdAt(this.Swift_peer);
    }

    public final String getCreatedBy() {
        return Swift_createdBy(this.Swift_peer);
    }

    public final boolean getHasDefaultName() {
        return Swift_hasDefaultName(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final ESquadImage getImage() {
        return Swift_image(this.Swift_peer);
    }

    public final URI getImageUrl() {
        return Swift_imageUrl(this.Swift_peer);
    }

    public final List<ESquadMember> getLastActiveMembers() {
        return Swift_lastActiveMembers(this.Swift_peer);
    }

    public final String getMemberCountText() {
        return Swift_memberCountText(this.Swift_peer);
    }

    public final List<ESquadMember> getMembers() {
        return Swift_members(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final List<ESquadUser> getPendingInviteUsers() {
        return Swift_pendingInviteUsers(this.Swift_peer);
    }

    public final ESquadPermissions getPermissions() {
        return Swift_permissions(this.Swift_peer);
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

    public final int getTotalMemberCount() {
        return Swift_totalMemberCount(this.Swift_peer);
    }

    public final Date getViewerMutedUntil() {
        return Swift_viewerMutedUntil(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isViewerMuted() {
        return Swift_isViewerMuted(this.Swift_peer);
    }

    public final ESquadMember.Role role(String of) {
        of.getClass();
        return Swift_role_0(this.Swift_peer, of);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ESquad(this);
    }

    public final void setCreatedAt(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_createdAt_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    public final void setCreatedBy(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_createdBy_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public void setId(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_id_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setImage(ESquadImage eSquadImage) {
        willmutate();
        try {
            Swift_image_set(this.Swift_peer, eSquadImage);
        } finally {
            didmutate();
        }
    }

    public final void setImageUrl(URI uri) {
        URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
        willmutate();
        try {
            Swift_imageUrl_set(this.Swift_peer, uri2);
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

    public final void setName(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_name_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setPendingInviteUsers(List<ESquadUser> list) {
        list.getClass();
        List<ESquadUser> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_pendingInviteUsers_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setPermissions(ESquadPermissions eSquadPermissions) {
        eSquadPermissions.getClass();
        ESquadPermissions eSquadPermissions2 = (ESquadPermissions) StructKt.sref$default(eSquadPermissions, null, 1, null);
        willmutate();
        try {
            Swift_permissions_set(this.Swift_peer, eSquadPermissions2);
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

    public final void setTotalMemberCount(int i) {
        willmutate();
        try {
            Swift_totalMemberCount_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setViewerMutedUntil(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_viewerMutedUntil_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0082 ¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESquad$Companion;", "", "<init>", "()V", "defaultName", "", "creatorUsername", "Swift_Companion_defaultName_1", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_defaultName_1(String creatorUsername);

        public final String defaultName(String creatorUsername) {
            creatorUsername.getClass();
            return Swift_Companion_defaultName_1(creatorUsername);
        }

        private Companion() {
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public ESquad(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

package com.polymarket.data;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.Participant;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 y2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002xyB\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0012\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\"\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010#\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010$\u001a\u00020\u0002H\u0082 J\u0015\u0010(\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010)\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010$\u001a\u00020\u0002H\u0082 J\u0015\u00100\u001a\u00020*2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u00101\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010$\u001a\u00020*H\u0082 J\u0017\u00105\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00106\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u0010=\u001a\u0004\u0018\u0001072\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010>\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u000107H\u0082 J\u0017\u0010B\u001a\u0004\u0018\u0001072\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010C\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u000107H\u0082 J\u0017\u0010G\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010H\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u0010L\u001a\u0004\u0018\u0001072\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010M\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u000107H\u0082 J\u0017\u0010Q\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010R\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u0010Y\u001a\u0004\u0018\u00010S2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010Z\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010$\u001a\u0004\u0018\u00010SH\u0082 J\u0015\u0010]\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010`\u001a\u00020\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010c\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010f\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010g\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u0003H\u0082 J\b\u0010s\u001a\u00020\u0003H\u0016J\u0016\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00190u2\u0006\u0010v\u001a\u00020\u001bH\u0016J\u0017\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00190u2\u0006\u0010v\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010%\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R$\u0010+\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00102\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!R(\u00108\u001a\u0004\u0018\u0001072\b\u0010\u001c\u001a\u0004\u0018\u0001078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010?\u001a\u0004\u0018\u0001072\b\u0010\u001c\u001a\u0004\u0018\u0001078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010:\"\u0004\bA\u0010<R(\u0010D\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010\u001f\"\u0004\bF\u0010!R(\u0010I\u001a\u0004\u0018\u0001072\b\u0010\u001c\u001a\u0004\u0018\u0001078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010:\"\u0004\bK\u0010<R(\u0010N\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010\u001f\"\u0004\bP\u0010!R(\u0010T\u001a\u0004\u0018\u00010S2\b\u0010\u001c\u001a\u0004\u0018\u00010S8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u001fR\u0011\u0010^\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bb\u0010\u001fR\u0013\u0010d\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\be\u0010\u001fR(\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010iX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010n\u001a\u00020\u001bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010r¨\u0006z"}, d2 = {"Lcom/polymarket/data/ESquadMember;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "squadId", "getSquadId", "()Ljava/lang/String;", "setSquadId", "(Ljava/lang/String;)V", "Swift_squadId", "Swift_squadId_set", "value", "userId", "getUserId", "setUserId", "Swift_userId", "Swift_userId_set", "Lcom/polymarket/data/ESquadMember$Role;", "role", "getRole", "()Lcom/polymarket/data/ESquadMember$Role;", "setRole", "(Lcom/polymarket/data/ESquadMember$Role;)V", "Swift_role", "Swift_role_set", "nickname", "getNickname", "setNickname", "Swift_nickname", "Swift_nickname_set", "Ljava/util/Date;", "mutedUntil", "getMutedUntil", "()Ljava/util/Date;", "setMutedUntil", "(Ljava/util/Date;)V", "Swift_mutedUntil", "Swift_mutedUntil_set", "joinedAt", "getJoinedAt", "setJoinedAt", "Swift_joinedAt", "Swift_joinedAt_set", "invitedBy", "getInvitedBy", "setInvitedBy", "Swift_invitedBy", "Swift_invitedBy_set", "removedAt", "getRemovedAt", "setRemovedAt", "Swift_removedAt", "Swift_removedAt_set", "removedBy", "getRemovedBy", "setRemovedBy", "Swift_removedBy", "Swift_removedBy_set", "Lcom/polymarket/data/ESquadUser;", "user", "getUser", "()Lcom/polymarket/data/ESquadUser;", "setUser", "(Lcom/polymarket/data/ESquadUser;)V", "Swift_user", "Swift_user_set", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", "isMuted", "()Z", "Swift_isMuted", "displayName", "getDisplayName", "Swift_displayName", "username", "getUsername", "Swift_username", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Role", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESquadMember implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ESquadMember(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native String Swift_displayName(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native String Swift_invitedBy(long Swift_peer);

    private final native void Swift_invitedBy_set(long Swift_peer, String value);

    private final native boolean Swift_isMuted(long Swift_peer);

    private final native Date Swift_joinedAt(long Swift_peer);

    private final native void Swift_joinedAt_set(long Swift_peer, Date value);

    private final native Date Swift_mutedUntil(long Swift_peer);

    private final native void Swift_mutedUntil_set(long Swift_peer, Date value);

    private final native String Swift_nickname(long Swift_peer);

    private final native void Swift_nickname_set(long Swift_peer, String value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native Date Swift_removedAt(long Swift_peer);

    private final native void Swift_removedAt_set(long Swift_peer, Date value);

    private final native String Swift_removedBy(long Swift_peer);

    private final native void Swift_removedBy_set(long Swift_peer, String value);

    private final native Role Swift_role(long Swift_peer);

    private final native void Swift_role_set(long Swift_peer, Role value);

    private final native String Swift_squadId(long Swift_peer);

    private final native void Swift_squadId_set(long Swift_peer, String value);

    private final native ESquadUser Swift_user(long Swift_peer);

    private final native String Swift_userId(long Swift_peer);

    private final native void Swift_userId_set(long Swift_peer, String value);

    private final native void Swift_user_set(long Swift_peer, ESquadUser value);

    private final native String Swift_username(long Swift_peer);

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

    public final String getDisplayName() {
        return Swift_displayName(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final String getInvitedBy() {
        return Swift_invitedBy(this.Swift_peer);
    }

    public final Date getJoinedAt() {
        return Swift_joinedAt(this.Swift_peer);
    }

    public final Date getMutedUntil() {
        return Swift_mutedUntil(this.Swift_peer);
    }

    public final String getNickname() {
        return Swift_nickname(this.Swift_peer);
    }

    public final Date getRemovedAt() {
        return Swift_removedAt(this.Swift_peer);
    }

    public final String getRemovedBy() {
        return Swift_removedBy(this.Swift_peer);
    }

    public final Role getRole() {
        return Swift_role(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final String getSquadId() {
        return Swift_squadId(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final ESquadUser getUser() {
        return Swift_user(this.Swift_peer);
    }

    public final String getUserId() {
        return Swift_userId(this.Swift_peer);
    }

    public final String getUsername() {
        return Swift_username(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isMuted() {
        return Swift_isMuted(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ESquadMember(this);
    }

    public final void setInvitedBy(String str) {
        willmutate();
        try {
            Swift_invitedBy_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setJoinedAt(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_joinedAt_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    public final void setMutedUntil(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_mutedUntil_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    public final void setNickname(String str) {
        willmutate();
        try {
            Swift_nickname_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setRemovedAt(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_removedAt_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    public final void setRemovedBy(String str) {
        willmutate();
        try {
            Swift_removedBy_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setRole(Role role) {
        role.getClass();
        willmutate();
        try {
            Swift_role_set(this.Swift_peer, role);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setSquadId(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_squadId_set(this.Swift_peer, str);
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

    public final void setUser(ESquadUser eSquadUser) {
        ESquadUser eSquadUser2 = (ESquadUser) StructKt.sref$default(eSquadUser, null, 1, null);
        willmutate();
        try {
            Swift_user_set(this.Swift_peer, eSquadUser2);
        } finally {
            didmutate();
        }
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/ESquadMember$Role;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", Participant.ADMIN_TYPE, "member", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Role implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Role[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Role admin = new Role(Participant.ADMIN_TYPE, 0, Participant.ADMIN_TYPE, null, 2, null);
        public static final Role member = new Role("member", 1, "member", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ Role[] $values() {
            return new Role[]{admin, member};
        }

        static {
            Role[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Role(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Role valueOf(String str) {
            return (Role) Enum.valueOf(Role.class, str);
        }

        public static Role[] values() {
            return (Role[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESquadMember$Role$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/ESquadMember$Role;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Role init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, Participant.ADMIN_TYPE)) {
                    return Role.admin;
                }
                if (Intrinsics.areEqual(rawValue, "member")) {
                    return Role.member;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private Role(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESquadMember$Companion;", "", "<init>", "()V", "Role", "Lcom/polymarket/data/ESquadMember$Role;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Role Role(String rawValue) {
            rawValue.getClass();
            return Role.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public ESquadMember(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}

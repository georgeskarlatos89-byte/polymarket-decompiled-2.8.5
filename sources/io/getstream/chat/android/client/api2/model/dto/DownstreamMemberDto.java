package io.getstream.chat.android.client.api2.model.dto;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.hdi;
import defpackage.mda;
import defpackage.sv6;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003JÊ\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b#\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b$\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b'\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006D"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "user", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "created_at", "Ljava/util/Date;", "updated_at", "invited", "", "invite_accepted_at", "invite_rejected_at", "shadow_banned", "banned", "channel_role", "", "notifications_muted", "status", "ban_expires", "pinned_at", "archived_at", "extraData", "", "", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCreated_at", "()Ljava/util/Date;", "getUpdated_at", "getInvited", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInvite_accepted_at", "getInvite_rejected_at", "getShadow_banned", "getBanned", "getChannel_role", "()Ljava/lang/String;", "getNotifications_muted", "getStatus", "getBan_expires", "getPinned_at", "getArchived_at", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamMemberDto implements ExtraDataDto {
    private final Date archived_at;
    private final Date ban_expires;
    private final Boolean banned;
    private final String channel_role;
    private final Date created_at;
    private final Map<String, Object> extraData;
    private final Date invite_accepted_at;
    private final Date invite_rejected_at;
    private final Boolean invited;
    private final Boolean notifications_muted;
    private final Date pinned_at;
    private final Boolean shadow_banned;
    private final String status;
    private final Date updated_at;
    private final DownstreamUserDto user;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DownstreamMemberDto(DownstreamUserDto downstreamUserDto, Date date, Date date2, Boolean bool, Date date3, Date date4, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2, Date date5, Date date6, Date date7, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(downstreamUserDto, date, date2, bool, date3, date4, r9, r10, str, bool4, str2, date5, date6, date7, map);
        Boolean bool5;
        Boolean bool6;
        if ((i & 64) != 0) {
            bool5 = Boolean.FALSE;
        } else {
            bool5 = bool2;
        }
        if ((i & 128) != 0) {
            bool6 = Boolean.FALSE;
        } else {
            bool6 = bool3;
        }
    }

    public static /* synthetic */ DownstreamMemberDto copy$default(DownstreamMemberDto downstreamMemberDto, DownstreamUserDto downstreamUserDto, Date date, Date date2, Boolean bool, Date date3, Date date4, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2, Date date5, Date date6, Date date7, Map map, int i, Object obj) {
        DownstreamUserDto downstreamUserDto2;
        Date date8;
        Date date9;
        Boolean bool5;
        Date date10;
        Date date11;
        Boolean bool6;
        Boolean bool7;
        String str3;
        Boolean bool8;
        String str4;
        Date date12;
        Date date13;
        Date date14;
        Map map2;
        if ((i & 1) != 0) {
            downstreamUserDto2 = downstreamMemberDto.user;
        } else {
            downstreamUserDto2 = downstreamUserDto;
        }
        if ((i & 2) != 0) {
            date8 = downstreamMemberDto.created_at;
        } else {
            date8 = date;
        }
        if ((i & 4) != 0) {
            date9 = downstreamMemberDto.updated_at;
        } else {
            date9 = date2;
        }
        if ((i & 8) != 0) {
            bool5 = downstreamMemberDto.invited;
        } else {
            bool5 = bool;
        }
        if ((i & 16) != 0) {
            date10 = downstreamMemberDto.invite_accepted_at;
        } else {
            date10 = date3;
        }
        if ((i & 32) != 0) {
            date11 = downstreamMemberDto.invite_rejected_at;
        } else {
            date11 = date4;
        }
        if ((i & 64) != 0) {
            bool6 = downstreamMemberDto.shadow_banned;
        } else {
            bool6 = bool2;
        }
        if ((i & 128) != 0) {
            bool7 = downstreamMemberDto.banned;
        } else {
            bool7 = bool3;
        }
        if ((i & 256) != 0) {
            str3 = downstreamMemberDto.channel_role;
        } else {
            str3 = str;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            bool8 = downstreamMemberDto.notifications_muted;
        } else {
            bool8 = bool4;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            str4 = downstreamMemberDto.status;
        } else {
            str4 = str2;
        }
        if ((i & 2048) != 0) {
            date12 = downstreamMemberDto.ban_expires;
        } else {
            date12 = date5;
        }
        if ((i & 4096) != 0) {
            date13 = downstreamMemberDto.pinned_at;
        } else {
            date13 = date6;
        }
        if ((i & 8192) != 0) {
            date14 = downstreamMemberDto.archived_at;
        } else {
            date14 = date7;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            map2 = downstreamMemberDto.extraData;
        } else {
            map2 = map;
        }
        return downstreamMemberDto.copy(downstreamUserDto2, date8, date9, bool5, date10, date11, bool6, bool7, str3, bool8, str4, date12, date13, date14, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getNotifications_muted() {
        return this.notifications_muted;
    }

    /* renamed from: component11, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component12, reason: from getter */
    public final Date getBan_expires() {
        return this.ban_expires;
    }

    /* renamed from: component13, reason: from getter */
    public final Date getPinned_at() {
        return this.pinned_at;
    }

    /* renamed from: component14, reason: from getter */
    public final Date getArchived_at() {
        return this.archived_at;
    }

    public final Map<String, Object> component15() {
        return this.extraData;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getInvited() {
        return this.invited;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getInvite_accepted_at() {
        return this.invite_accepted_at;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getInvite_rejected_at() {
        return this.invite_rejected_at;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getShadow_banned() {
        return this.shadow_banned;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getBanned() {
        return this.banned;
    }

    /* renamed from: component9, reason: from getter */
    public final String getChannel_role() {
        return this.channel_role;
    }

    public final DownstreamMemberDto copy(DownstreamUserDto user, Date created_at, Date updated_at, Boolean invited, Date invite_accepted_at, Date invite_rejected_at, Boolean shadow_banned, Boolean banned, String channel_role, Boolean notifications_muted, String status, Date ban_expires, Date pinned_at, Date archived_at, Map<String, ? extends Object> extraData) {
        user.getClass();
        extraData.getClass();
        return new DownstreamMemberDto(user, created_at, updated_at, invited, invite_accepted_at, invite_rejected_at, shadow_banned, banned, channel_role, notifications_muted, status, ban_expires, pinned_at, archived_at, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamMemberDto)) {
            return false;
        }
        DownstreamMemberDto downstreamMemberDto = (DownstreamMemberDto) other;
        if (Intrinsics.areEqual(this.user, downstreamMemberDto.user) && Intrinsics.areEqual(this.created_at, downstreamMemberDto.created_at) && Intrinsics.areEqual(this.updated_at, downstreamMemberDto.updated_at) && Intrinsics.areEqual(this.invited, downstreamMemberDto.invited) && Intrinsics.areEqual(this.invite_accepted_at, downstreamMemberDto.invite_accepted_at) && Intrinsics.areEqual(this.invite_rejected_at, downstreamMemberDto.invite_rejected_at) && Intrinsics.areEqual(this.shadow_banned, downstreamMemberDto.shadow_banned) && Intrinsics.areEqual(this.banned, downstreamMemberDto.banned) && Intrinsics.areEqual(this.channel_role, downstreamMemberDto.channel_role) && Intrinsics.areEqual(this.notifications_muted, downstreamMemberDto.notifications_muted) && Intrinsics.areEqual(this.status, downstreamMemberDto.status) && Intrinsics.areEqual(this.ban_expires, downstreamMemberDto.ban_expires) && Intrinsics.areEqual(this.pinned_at, downstreamMemberDto.pinned_at) && Intrinsics.areEqual(this.archived_at, downstreamMemberDto.archived_at) && Intrinsics.areEqual(this.extraData, downstreamMemberDto.extraData)) {
            return true;
        }
        return false;
    }

    public final Date getArchived_at() {
        return this.archived_at;
    }

    public final Date getBan_expires() {
        return this.ban_expires;
    }

    public final Boolean getBanned() {
        return this.banned;
    }

    public final String getChannel_role() {
        return this.channel_role;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final Date getInvite_accepted_at() {
        return this.invite_accepted_at;
    }

    public final Date getInvite_rejected_at() {
        return this.invite_rejected_at;
    }

    public final Boolean getInvited() {
        return this.invited;
    }

    public final Boolean getNotifications_muted() {
        return this.notifications_muted;
    }

    public final Date getPinned_at() {
        return this.pinned_at;
    }

    public final Boolean getShadow_banned() {
        return this.shadow_banned;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13 = this.user.hashCode() * 31;
        Date date = this.created_at;
        int i = 0;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (hashCode13 + hashCode) * 31;
        Date date2 = this.updated_at;
        if (date2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.invited;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Date date3 = this.invite_accepted_at;
        if (date3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Date date4 = this.invite_rejected_at;
        if (date4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Boolean bool2 = this.shadow_banned;
        if (bool2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Boolean bool3 = this.banned;
        if (bool3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool3.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str = this.channel_role;
        if (str == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Boolean bool4 = this.notifications_muted;
        if (bool4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool4.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str2 = this.status;
        if (str2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str2.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Date date5 = this.ban_expires;
        if (date5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = date5.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Date date6 = this.pinned_at;
        if (date6 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = date6.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        Date date7 = this.archived_at;
        if (date7 != null) {
            i = date7.hashCode();
        }
        return this.extraData.hashCode() + ((i13 + i) * 31);
    }

    public String toString() {
        DownstreamUserDto downstreamUserDto = this.user;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        Boolean bool = this.invited;
        Date date3 = this.invite_accepted_at;
        Date date4 = this.invite_rejected_at;
        Boolean bool2 = this.shadow_banned;
        Boolean bool3 = this.banned;
        String str = this.channel_role;
        Boolean bool4 = this.notifications_muted;
        String str2 = this.status;
        Date date5 = this.ban_expires;
        Date date6 = this.pinned_at;
        Date date7 = this.archived_at;
        Map<String, Object> map = this.extraData;
        StringBuilder sb = new StringBuilder("DownstreamMemberDto(user=");
        sb.append(downstreamUserDto);
        sb.append(", created_at=");
        sb.append(date);
        sb.append(", updated_at=");
        sb.append(date2);
        sb.append(", invited=");
        sb.append(bool);
        sb.append(", invite_accepted_at=");
        sv6.B(sb, date3, ", invite_rejected_at=", date4, ", shadow_banned=");
        hdi.A(sb, bool2, ", banned=", bool3, ", channel_role=");
        sb.append(str);
        sb.append(", notifications_muted=");
        sb.append(bool4);
        sb.append(", status=");
        sv6.A(sb, str2, ", ban_expires=", date5, ", pinned_at=");
        sv6.B(sb, date6, ", archived_at=", date7, ", extraData=");
        return ace.n(sb, map, ")");
    }

    public DownstreamMemberDto(DownstreamUserDto downstreamUserDto, Date date, Date date2, Boolean bool, Date date3, Date date4, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2, Date date5, Date date6, Date date7, Map<String, ? extends Object> map) {
        downstreamUserDto.getClass();
        map.getClass();
        this.user = downstreamUserDto;
        this.created_at = date;
        this.updated_at = date2;
        this.invited = bool;
        this.invite_accepted_at = date3;
        this.invite_rejected_at = date4;
        this.shadow_banned = bool2;
        this.banned = bool3;
        this.channel_role = str;
        this.notifications_muted = bool4;
        this.status = str2;
        this.ban_expires = date5;
        this.pinned_at = date6;
        this.archived_at = date7;
        this.extraData = map;
    }
}

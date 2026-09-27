package io.getstream.chat.android.client.api2.model.dto;

import com.appsflyer.AppsFlyerProperties;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JU\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006("}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;", "", "remind_at", "Ljava/util/Date;", "channel_cid", "", AppsFlyerProperties.CHANNEL, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "message_id", "message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "created_at", "updated_at", "<init>", "(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/util/Date;Ljava/util/Date;)V", "getRemind_at", "()Ljava/util/Date;", "getChannel_cid", "()Ljava/lang/String;", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "getMessage_id", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getCreated_at", "getUpdated_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamReminderDto {
    private final DownstreamChannelDto channel;
    private final String channel_cid;
    private final Date created_at;
    private final DownstreamMessageDto message;
    private final String message_id;
    private final Date remind_at;
    private final Date updated_at;

    public DownstreamReminderDto(Date date, String str, DownstreamChannelDto downstreamChannelDto, String str2, DownstreamMessageDto downstreamMessageDto, Date date2, Date date3) {
        str.getClass();
        str2.getClass();
        date2.getClass();
        date3.getClass();
        this.remind_at = date;
        this.channel_cid = str;
        this.channel = downstreamChannelDto;
        this.message_id = str2;
        this.message = downstreamMessageDto;
        this.created_at = date2;
        this.updated_at = date3;
    }

    public static /* synthetic */ DownstreamReminderDto copy$default(DownstreamReminderDto downstreamReminderDto, Date date, String str, DownstreamChannelDto downstreamChannelDto, String str2, DownstreamMessageDto downstreamMessageDto, Date date2, Date date3, int i, Object obj) {
        if ((i & 1) != 0) {
            date = downstreamReminderDto.remind_at;
        }
        if ((i & 2) != 0) {
            str = downstreamReminderDto.channel_cid;
        }
        if ((i & 4) != 0) {
            downstreamChannelDto = downstreamReminderDto.channel;
        }
        if ((i & 8) != 0) {
            str2 = downstreamReminderDto.message_id;
        }
        if ((i & 16) != 0) {
            downstreamMessageDto = downstreamReminderDto.message;
        }
        if ((i & 32) != 0) {
            date2 = downstreamReminderDto.created_at;
        }
        if ((i & 64) != 0) {
            date3 = downstreamReminderDto.updated_at;
        }
        Date date4 = date2;
        Date date5 = date3;
        DownstreamMessageDto downstreamMessageDto2 = downstreamMessageDto;
        DownstreamChannelDto downstreamChannelDto2 = downstreamChannelDto;
        return downstreamReminderDto.copy(date, str, downstreamChannelDto2, str2, downstreamMessageDto2, date4, date5);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getRemind_at() {
        return this.remind_at;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    /* renamed from: component3, reason: from getter */
    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* renamed from: component5, reason: from getter */
    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final DownstreamReminderDto copy(Date remind_at, String channel_cid, DownstreamChannelDto channel, String message_id, DownstreamMessageDto message, Date created_at, Date updated_at) {
        channel_cid.getClass();
        message_id.getClass();
        created_at.getClass();
        updated_at.getClass();
        return new DownstreamReminderDto(remind_at, channel_cid, channel, message_id, message, created_at, updated_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamReminderDto)) {
            return false;
        }
        DownstreamReminderDto downstreamReminderDto = (DownstreamReminderDto) other;
        if (Intrinsics.areEqual(this.remind_at, downstreamReminderDto.remind_at) && Intrinsics.areEqual(this.channel_cid, downstreamReminderDto.channel_cid) && Intrinsics.areEqual(this.channel, downstreamReminderDto.channel) && Intrinsics.areEqual(this.message_id, downstreamReminderDto.message_id) && Intrinsics.areEqual(this.message, downstreamReminderDto.message) && Intrinsics.areEqual(this.created_at, downstreamReminderDto.created_at) && Intrinsics.areEqual(this.updated_at, downstreamReminderDto.updated_at)) {
            return true;
        }
        return false;
    }

    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final Date getRemind_at() {
        return this.remind_at;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Date date = this.remind_at;
        int i = 0;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int e = hdi.e(hashCode * 31, 31, this.channel_cid);
        DownstreamChannelDto downstreamChannelDto = this.channel;
        if (downstreamChannelDto == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = downstreamChannelDto.hashCode();
        }
        int e2 = hdi.e((e + hashCode2) * 31, 31, this.message_id);
        DownstreamMessageDto downstreamMessageDto = this.message;
        if (downstreamMessageDto != null) {
            i = downstreamMessageDto.hashCode();
        }
        return this.updated_at.hashCode() + woa.f(this.created_at, (e2 + i) * 31, 31);
    }

    public String toString() {
        Date date = this.remind_at;
        String str = this.channel_cid;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        String str2 = this.message_id;
        DownstreamMessageDto downstreamMessageDto = this.message;
        Date date2 = this.created_at;
        Date date3 = this.updated_at;
        StringBuilder sb = new StringBuilder("DownstreamReminderDto(remind_at=");
        sb.append(date);
        sb.append(", channel_cid=");
        sb.append(str);
        sb.append(", channel=");
        sb.append(downstreamChannelDto);
        sb.append(", message_id=");
        sb.append(str2);
        sb.append(", message=");
        sb.append(downstreamMessageDto);
        sb.append(", created_at=");
        sb.append(date2);
        sb.append(", updated_at=");
        return sv6.q(sb, date3, ")");
    }
}

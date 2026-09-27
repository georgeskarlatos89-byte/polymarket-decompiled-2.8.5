package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.woa;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006$"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "", "user", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "last_read", "Ljava/util/Date;", "unread_messages", "", "last_read_message_id", "", "last_delivered_at", "last_delivered_message_id", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Date;ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getLast_read", "()Ljava/util/Date;", "getUnread_messages", "()I", "getLast_read_message_id", "()Ljava/lang/String;", "getLast_delivered_at", "getLast_delivered_message_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamChannelUserRead {
    private final Date last_delivered_at;
    private final String last_delivered_message_id;
    private final Date last_read;
    private final String last_read_message_id;
    private final int unread_messages;
    private final DownstreamUserDto user;

    public DownstreamChannelUserRead(DownstreamUserDto downstreamUserDto, Date date, int i, String str, Date date2, String str2) {
        downstreamUserDto.getClass();
        date.getClass();
        this.user = downstreamUserDto;
        this.last_read = date;
        this.unread_messages = i;
        this.last_read_message_id = str;
        this.last_delivered_at = date2;
        this.last_delivered_message_id = str2;
    }

    public static /* synthetic */ DownstreamChannelUserRead copy$default(DownstreamChannelUserRead downstreamChannelUserRead, DownstreamUserDto downstreamUserDto, Date date, int i, String str, Date date2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            downstreamUserDto = downstreamChannelUserRead.user;
        }
        if ((i2 & 2) != 0) {
            date = downstreamChannelUserRead.last_read;
        }
        if ((i2 & 4) != 0) {
            i = downstreamChannelUserRead.unread_messages;
        }
        if ((i2 & 8) != 0) {
            str = downstreamChannelUserRead.last_read_message_id;
        }
        if ((i2 & 16) != 0) {
            date2 = downstreamChannelUserRead.last_delivered_at;
        }
        if ((i2 & 32) != 0) {
            str2 = downstreamChannelUserRead.last_delivered_message_id;
        }
        Date date3 = date2;
        String str3 = str2;
        return downstreamChannelUserRead.copy(downstreamUserDto, date, i, str, date3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getLast_read() {
        return this.last_read;
    }

    /* renamed from: component3, reason: from getter */
    public final int getUnread_messages() {
        return this.unread_messages;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLast_read_message_id() {
        return this.last_read_message_id;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getLast_delivered_at() {
        return this.last_delivered_at;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLast_delivered_message_id() {
        return this.last_delivered_message_id;
    }

    public final DownstreamChannelUserRead copy(DownstreamUserDto user, Date last_read, int unread_messages, String last_read_message_id, Date last_delivered_at, String last_delivered_message_id) {
        user.getClass();
        last_read.getClass();
        return new DownstreamChannelUserRead(user, last_read, unread_messages, last_read_message_id, last_delivered_at, last_delivered_message_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamChannelUserRead)) {
            return false;
        }
        DownstreamChannelUserRead downstreamChannelUserRead = (DownstreamChannelUserRead) other;
        if (Intrinsics.areEqual(this.user, downstreamChannelUserRead.user) && Intrinsics.areEqual(this.last_read, downstreamChannelUserRead.last_read) && this.unread_messages == downstreamChannelUserRead.unread_messages && Intrinsics.areEqual(this.last_read_message_id, downstreamChannelUserRead.last_read_message_id) && Intrinsics.areEqual(this.last_delivered_at, downstreamChannelUserRead.last_delivered_at) && Intrinsics.areEqual(this.last_delivered_message_id, downstreamChannelUserRead.last_delivered_message_id)) {
            return true;
        }
        return false;
    }

    public final Date getLast_delivered_at() {
        return this.last_delivered_at;
    }

    public final String getLast_delivered_message_id() {
        return this.last_delivered_message_id;
    }

    public final Date getLast_read() {
        return this.last_read;
    }

    public final String getLast_read_message_id() {
        return this.last_read_message_id;
    }

    public final int getUnread_messages() {
        return this.unread_messages;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int b = woa.b(this.unread_messages, woa.f(this.last_read, this.user.hashCode() * 31, 31), 31);
        String str = this.last_read_message_id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        Date date = this.last_delivered_at;
        if (date == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.last_delivered_message_id;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        DownstreamUserDto downstreamUserDto = this.user;
        Date date = this.last_read;
        int i = this.unread_messages;
        String str = this.last_read_message_id;
        Date date2 = this.last_delivered_at;
        String str2 = this.last_delivered_message_id;
        StringBuilder sb = new StringBuilder("DownstreamChannelUserRead(user=");
        sb.append(downstreamUserDto);
        sb.append(", last_read=");
        sb.append(date);
        sb.append(", unread_messages=");
        woa.u(i, ", last_read_message_id=", str, ", last_delivered_at=", sb);
        sb.append(date2);
        sb.append(", last_delivered_message_id=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ DownstreamChannelUserRead(DownstreamUserDto downstreamUserDto, Date date, int i, String str, Date date2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(downstreamUserDto, date, i, str, (i2 & 16) != 0 ? null : date2, (i2 & 32) != 0 ? null : str2);
    }
}

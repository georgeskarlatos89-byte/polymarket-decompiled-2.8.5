package io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ChannelUserReadEntity {
    public final String a;
    public final Date b;
    public final int c;
    public final Date d;
    public final String e;
    public final Date f;
    public final String g;

    public ChannelUserReadEntity(String str, Date date, int i, Date date2, String str2, Date date3, String str3) {
        str.getClass();
        date.getClass();
        date2.getClass();
        this.a = str;
        this.b = date;
        this.c = i;
        this.d = date2;
        this.e = str2;
        this.f = date3;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelUserReadEntity)) {
            return false;
        }
        ChannelUserReadEntity channelUserReadEntity = (ChannelUserReadEntity) obj;
        if (Intrinsics.areEqual(this.a, channelUserReadEntity.a) && Intrinsics.areEqual(this.b, channelUserReadEntity.b) && this.c == channelUserReadEntity.c && Intrinsics.areEqual(this.d, channelUserReadEntity.d) && Intrinsics.areEqual(this.e, channelUserReadEntity.e) && Intrinsics.areEqual(this.f, channelUserReadEntity.f) && Intrinsics.areEqual(this.g, channelUserReadEntity.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int f = woa.f(this.d, woa.b(this.c, woa.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
        int i = 0;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (f + hashCode) * 31;
        Date date = this.f;
        if (date == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder u = sv6.u("ChannelUserReadEntity(userId=", this.a, ", lastReceivedEventDate=", ", unreadMessages=", this.b);
        u.append(this.c);
        u.append(", lastRead=");
        u.append(this.d);
        u.append(", lastReadMessageId=");
        sv6.A(u, this.e, ", lastDeliveredAt=", this.f, ", lastDeliveredMessageId=");
        return woa.r(u, this.g, ")");
    }
}

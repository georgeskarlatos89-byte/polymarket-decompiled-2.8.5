package io.getstream.chat.android.client.api2.model.response;

import com.appsflyer.AppsFlyerProperties;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import defpackage.woa;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/BannedUserResponse;", "", "user", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "banned_by", AppsFlyerProperties.CHANNEL, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "created_at", "Ljava/util/Date;", "expires", "shadow", "", "reason", "", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/String;)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getBanned_by", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "getCreated_at", "()Ljava/util/Date;", "getExpires", "getShadow", "()Z", "getReason", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class BannedUserResponse {
    private final DownstreamUserDto banned_by;
    private final DownstreamChannelDto channel;
    private final Date created_at;
    private final Date expires;
    private final String reason;
    private final boolean shadow;
    private final DownstreamUserDto user;

    public BannedUserResponse(DownstreamUserDto downstreamUserDto, DownstreamUserDto downstreamUserDto2, DownstreamChannelDto downstreamChannelDto, Date date, Date date2, boolean z, String str) {
        downstreamUserDto.getClass();
        this.user = downstreamUserDto;
        this.banned_by = downstreamUserDto2;
        this.channel = downstreamChannelDto;
        this.created_at = date;
        this.expires = date2;
        this.shadow = z;
        this.reason = str;
    }

    public static /* synthetic */ BannedUserResponse copy$default(BannedUserResponse bannedUserResponse, DownstreamUserDto downstreamUserDto, DownstreamUserDto downstreamUserDto2, DownstreamChannelDto downstreamChannelDto, Date date, Date date2, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            downstreamUserDto = bannedUserResponse.user;
        }
        if ((i & 2) != 0) {
            downstreamUserDto2 = bannedUserResponse.banned_by;
        }
        if ((i & 4) != 0) {
            downstreamChannelDto = bannedUserResponse.channel;
        }
        if ((i & 8) != 0) {
            date = bannedUserResponse.created_at;
        }
        if ((i & 16) != 0) {
            date2 = bannedUserResponse.expires;
        }
        if ((i & 32) != 0) {
            z = bannedUserResponse.shadow;
        }
        if ((i & 64) != 0) {
            str = bannedUserResponse.reason;
        }
        boolean z2 = z;
        String str2 = str;
        Date date3 = date2;
        DownstreamChannelDto downstreamChannelDto2 = downstreamChannelDto;
        return bannedUserResponse.copy(downstreamUserDto, downstreamUserDto2, downstreamChannelDto2, date, date3, z2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* renamed from: component2, reason: from getter */
    public final DownstreamUserDto getBanned_by() {
        return this.banned_by;
    }

    /* renamed from: component3, reason: from getter */
    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShadow() {
        return this.shadow;
    }

    /* renamed from: component7, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final BannedUserResponse copy(DownstreamUserDto user, DownstreamUserDto banned_by, DownstreamChannelDto channel, Date created_at, Date expires, boolean shadow, String reason) {
        user.getClass();
        return new BannedUserResponse(user, banned_by, channel, created_at, expires, shadow, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannedUserResponse)) {
            return false;
        }
        BannedUserResponse bannedUserResponse = (BannedUserResponse) other;
        if (Intrinsics.areEqual(this.user, bannedUserResponse.user) && Intrinsics.areEqual(this.banned_by, bannedUserResponse.banned_by) && Intrinsics.areEqual(this.channel, bannedUserResponse.channel) && Intrinsics.areEqual(this.created_at, bannedUserResponse.created_at) && Intrinsics.areEqual(this.expires, bannedUserResponse.expires) && this.shadow == bannedUserResponse.shadow && Intrinsics.areEqual(this.reason, bannedUserResponse.reason)) {
            return true;
        }
        return false;
    }

    public final DownstreamUserDto getBanned_by() {
        return this.banned_by;
    }

    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final String getReason() {
        return this.reason;
    }

    public final boolean getShadow() {
        return this.shadow;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.user.hashCode() * 31;
        DownstreamUserDto downstreamUserDto = this.banned_by;
        int i = 0;
        if (downstreamUserDto == null) {
            hashCode = 0;
        } else {
            hashCode = downstreamUserDto.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        if (downstreamChannelDto == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = downstreamChannelDto.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date = this.created_at;
        if (date == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Date date2 = this.expires;
        if (date2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date2.hashCode();
        }
        int g = hdi.g((i4 + hashCode4) * 31, 31, this.shadow);
        String str = this.reason;
        if (str != null) {
            i = str.hashCode();
        }
        return g + i;
    }

    public String toString() {
        DownstreamUserDto downstreamUserDto = this.user;
        DownstreamUserDto downstreamUserDto2 = this.banned_by;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        Date date = this.created_at;
        Date date2 = this.expires;
        boolean z = this.shadow;
        String str = this.reason;
        StringBuilder sb = new StringBuilder("BannedUserResponse(user=");
        sb.append(downstreamUserDto);
        sb.append(", banned_by=");
        sb.append(downstreamUserDto2);
        sb.append(", channel=");
        sb.append(downstreamChannelDto);
        sb.append(", created_at=");
        sb.append(date);
        sb.append(", expires=");
        sb.append(date2);
        sb.append(", shadow=");
        sb.append(z);
        sb.append(", reason=");
        return woa.r(sb, str, ")");
    }

    public /* synthetic */ BannedUserResponse(DownstreamUserDto downstreamUserDto, DownstreamUserDto downstreamUserDto2, DownstreamChannelDto downstreamChannelDto, Date date, Date date2, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(downstreamUserDto, downstreamUserDto2, downstreamChannelDto, date, date2, (i & 32) != 0 ? false : z, str);
    }
}

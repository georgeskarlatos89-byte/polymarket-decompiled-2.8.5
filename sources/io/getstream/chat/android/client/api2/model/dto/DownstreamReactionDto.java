package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.hdi;
import defpackage.k84;
import defpackage.mda;
import defpackage.woa;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Jw\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "created_at", "Ljava/util/Date;", "message_id", "", "score", "", "type", "updated_at", "user", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "user_id", "emoji_code", "extraData", "", "", "<init>", "(Ljava/util/Date;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCreated_at", "()Ljava/util/Date;", "getMessage_id", "()Ljava/lang/String;", "getScore", "()I", "getType", "getUpdated_at", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getUser_id", "getEmoji_code", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamReactionDto implements ExtraDataDto {
    private final Date created_at;
    private final String emoji_code;
    private final Map<String, Object> extraData;
    private final String message_id;
    private final int score;
    private final String type;
    private final Date updated_at;
    private final DownstreamUserDto user;
    private final String user_id;

    public DownstreamReactionDto(Date date, String str, int i, String str2, Date date2, DownstreamUserDto downstreamUserDto, String str3, String str4, Map<String, ? extends Object> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        this.created_at = date;
        this.message_id = str;
        this.score = i;
        this.type = str2;
        this.updated_at = date2;
        this.user = downstreamUserDto;
        this.user_id = str3;
        this.emoji_code = str4;
        this.extraData = map;
    }

    public static /* synthetic */ DownstreamReactionDto copy$default(DownstreamReactionDto downstreamReactionDto, Date date, String str, int i, String str2, Date date2, DownstreamUserDto downstreamUserDto, String str3, String str4, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            date = downstreamReactionDto.created_at;
        }
        if ((i2 & 2) != 0) {
            str = downstreamReactionDto.message_id;
        }
        if ((i2 & 4) != 0) {
            i = downstreamReactionDto.score;
        }
        if ((i2 & 8) != 0) {
            str2 = downstreamReactionDto.type;
        }
        if ((i2 & 16) != 0) {
            date2 = downstreamReactionDto.updated_at;
        }
        if ((i2 & 32) != 0) {
            downstreamUserDto = downstreamReactionDto.user;
        }
        if ((i2 & 64) != 0) {
            str3 = downstreamReactionDto.user_id;
        }
        if ((i2 & 128) != 0) {
            str4 = downstreamReactionDto.emoji_code;
        }
        if ((i2 & 256) != 0) {
            map = downstreamReactionDto.extraData;
        }
        String str5 = str4;
        Map map2 = map;
        DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
        String str6 = str3;
        Date date3 = date2;
        int i3 = i;
        return downstreamReactionDto.copy(date, str, i3, str2, date3, downstreamUserDto2, str6, str5, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* renamed from: component3, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: component6, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEmoji_code() {
        return this.emoji_code;
    }

    public final Map<String, Object> component9() {
        return this.extraData;
    }

    public final DownstreamReactionDto copy(Date created_at, String message_id, int score, String type, Date updated_at, DownstreamUserDto user, String user_id, String emoji_code, Map<String, ? extends Object> extraData) {
        message_id.getClass();
        type.getClass();
        user_id.getClass();
        extraData.getClass();
        return new DownstreamReactionDto(created_at, message_id, score, type, updated_at, user, user_id, emoji_code, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamReactionDto)) {
            return false;
        }
        DownstreamReactionDto downstreamReactionDto = (DownstreamReactionDto) other;
        if (Intrinsics.areEqual(this.created_at, downstreamReactionDto.created_at) && Intrinsics.areEqual(this.message_id, downstreamReactionDto.message_id) && this.score == downstreamReactionDto.score && Intrinsics.areEqual(this.type, downstreamReactionDto.type) && Intrinsics.areEqual(this.updated_at, downstreamReactionDto.updated_at) && Intrinsics.areEqual(this.user, downstreamReactionDto.user) && Intrinsics.areEqual(this.user_id, downstreamReactionDto.user_id) && Intrinsics.areEqual(this.emoji_code, downstreamReactionDto.emoji_code) && Intrinsics.areEqual(this.extraData, downstreamReactionDto.extraData)) {
            return true;
        }
        return false;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final String getEmoji_code() {
        return this.emoji_code;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final int getScore() {
        return this.score;
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Date date = this.created_at;
        int i = 0;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int e = hdi.e(woa.b(this.score, hdi.e(hashCode * 31, 31, this.message_id), 31), 31, this.type);
        Date date2 = this.updated_at;
        if (date2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date2.hashCode();
        }
        int i2 = (e + hashCode2) * 31;
        DownstreamUserDto downstreamUserDto = this.user;
        if (downstreamUserDto == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = downstreamUserDto.hashCode();
        }
        int e2 = hdi.e((i2 + hashCode3) * 31, 31, this.user_id);
        String str = this.emoji_code;
        if (str != null) {
            i = str.hashCode();
        }
        return this.extraData.hashCode() + ((e2 + i) * 31);
    }

    public String toString() {
        Date date = this.created_at;
        String str = this.message_id;
        int i = this.score;
        String str2 = this.type;
        Date date2 = this.updated_at;
        DownstreamUserDto downstreamUserDto = this.user;
        String str3 = this.user_id;
        String str4 = this.emoji_code;
        Map<String, Object> map = this.extraData;
        StringBuilder sb = new StringBuilder("DownstreamReactionDto(created_at=");
        sb.append(date);
        sb.append(", message_id=");
        sb.append(str);
        sb.append(", score=");
        woa.u(i, ", type=", str2, ", updated_at=", sb);
        sb.append(date2);
        sb.append(", user=");
        sb.append(downstreamUserDto);
        sb.append(", user_id=");
        k84.q(sb, str3, ", emoji_code=", str4, ", extraData=");
        return ace.n(sb, map, ")");
    }
}

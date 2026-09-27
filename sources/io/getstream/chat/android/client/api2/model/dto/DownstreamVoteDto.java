package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jp\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\f\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006."}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "poll_id", "option_id", "created_at", "Ljava/util/Date;", "updated_at", "user", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "user_id", "is_answer", "", "answer_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPoll_id", "getOption_id", "getCreated_at", "()Ljava/util/Date;", "getUpdated_at", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getUser_id", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAnswer_text", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamVoteDto {
    private final String answer_text;
    private final Date created_at;
    private final String id;
    private final Boolean is_answer;
    private final String option_id;
    private final String poll_id;
    private final Date updated_at;
    private final DownstreamUserDto user;
    private final String user_id;

    public DownstreamVoteDto(String str, String str2, String str3, Date date, Date date2, DownstreamUserDto downstreamUserDto, String str4, Boolean bool, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        date.getClass();
        date2.getClass();
        this.id = str;
        this.poll_id = str2;
        this.option_id = str3;
        this.created_at = date;
        this.updated_at = date2;
        this.user = downstreamUserDto;
        this.user_id = str4;
        this.is_answer = bool;
        this.answer_text = str5;
    }

    public static /* synthetic */ DownstreamVoteDto copy$default(DownstreamVoteDto downstreamVoteDto, String str, String str2, String str3, Date date, Date date2, DownstreamUserDto downstreamUserDto, String str4, Boolean bool, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downstreamVoteDto.id;
        }
        if ((i & 2) != 0) {
            str2 = downstreamVoteDto.poll_id;
        }
        if ((i & 4) != 0) {
            str3 = downstreamVoteDto.option_id;
        }
        if ((i & 8) != 0) {
            date = downstreamVoteDto.created_at;
        }
        if ((i & 16) != 0) {
            date2 = downstreamVoteDto.updated_at;
        }
        if ((i & 32) != 0) {
            downstreamUserDto = downstreamVoteDto.user;
        }
        if ((i & 64) != 0) {
            str4 = downstreamVoteDto.user_id;
        }
        if ((i & 128) != 0) {
            bool = downstreamVoteDto.is_answer;
        }
        if ((i & 256) != 0) {
            str5 = downstreamVoteDto.answer_text;
        }
        Boolean bool2 = bool;
        String str6 = str5;
        DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
        String str7 = str4;
        Date date3 = date2;
        String str8 = str3;
        return downstreamVoteDto.copy(str, str2, str8, date, date3, downstreamUserDto2, str7, bool2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPoll_id() {
        return this.poll_id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOption_id() {
        return this.option_id;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
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
    public final Boolean getIs_answer() {
        return this.is_answer;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAnswer_text() {
        return this.answer_text;
    }

    public final DownstreamVoteDto copy(String id, String poll_id, String option_id, Date created_at, Date updated_at, DownstreamUserDto user, String user_id, Boolean is_answer, String answer_text) {
        id.getClass();
        poll_id.getClass();
        option_id.getClass();
        created_at.getClass();
        updated_at.getClass();
        return new DownstreamVoteDto(id, poll_id, option_id, created_at, updated_at, user, user_id, is_answer, answer_text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamVoteDto)) {
            return false;
        }
        DownstreamVoteDto downstreamVoteDto = (DownstreamVoteDto) other;
        if (Intrinsics.areEqual(this.id, downstreamVoteDto.id) && Intrinsics.areEqual(this.poll_id, downstreamVoteDto.poll_id) && Intrinsics.areEqual(this.option_id, downstreamVoteDto.option_id) && Intrinsics.areEqual(this.created_at, downstreamVoteDto.created_at) && Intrinsics.areEqual(this.updated_at, downstreamVoteDto.updated_at) && Intrinsics.areEqual(this.user, downstreamVoteDto.user) && Intrinsics.areEqual(this.user_id, downstreamVoteDto.user_id) && Intrinsics.areEqual(this.is_answer, downstreamVoteDto.is_answer) && Intrinsics.areEqual(this.answer_text, downstreamVoteDto.answer_text)) {
            return true;
        }
        return false;
    }

    public final String getAnswer_text() {
        return this.answer_text;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOption_id() {
        return this.option_id;
    }

    public final String getPoll_id() {
        return this.poll_id;
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
        int f = woa.f(this.updated_at, woa.f(this.created_at, hdi.e(hdi.e(this.id.hashCode() * 31, 31, this.poll_id), 31, this.option_id), 31), 31);
        DownstreamUserDto downstreamUserDto = this.user;
        int i = 0;
        if (downstreamUserDto == null) {
            hashCode = 0;
        } else {
            hashCode = downstreamUserDto.hashCode();
        }
        int i2 = (f + hashCode) * 31;
        String str = this.user_id;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.is_answer;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.answer_text;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i4 + i;
    }

    public final Boolean is_answer() {
        return this.is_answer;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.poll_id;
        String str3 = this.option_id;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        DownstreamUserDto downstreamUserDto = this.user;
        String str4 = this.user_id;
        Boolean bool = this.is_answer;
        String str5 = this.answer_text;
        StringBuilder r = m51.r("DownstreamVoteDto(id=", str, ", poll_id=", str2, ", option_id=");
        sv6.A(r, str3, ", created_at=", date, ", updated_at=");
        r.append(date2);
        r.append(", user=");
        r.append(downstreamUserDto);
        r.append(", user_id=");
        r.append(str4);
        r.append(", is_answer=");
        r.append(bool);
        r.append(", answer_text=");
        return woa.r(r, str5, ")");
    }
}

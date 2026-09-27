package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001f"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;", "", "user", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "target", "created_at", "Ljava/util/Date;", "updated_at", "expires", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getTarget", "getCreated_at", "()Ljava/util/Date;", "getUpdated_at", "getExpires", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamMuteDto {
    private final Date created_at;
    private final Date expires;
    private final DownstreamUserDto target;
    private final Date updated_at;
    private final DownstreamUserDto user;

    public DownstreamMuteDto(DownstreamUserDto downstreamUserDto, DownstreamUserDto downstreamUserDto2, Date date, Date date2, Date date3) {
        date.getClass();
        date2.getClass();
        this.user = downstreamUserDto;
        this.target = downstreamUserDto2;
        this.created_at = date;
        this.updated_at = date2;
        this.expires = date3;
    }

    public static /* synthetic */ DownstreamMuteDto copy$default(DownstreamMuteDto downstreamMuteDto, DownstreamUserDto downstreamUserDto, DownstreamUserDto downstreamUserDto2, Date date, Date date2, Date date3, int i, Object obj) {
        if ((i & 1) != 0) {
            downstreamUserDto = downstreamMuteDto.user;
        }
        if ((i & 2) != 0) {
            downstreamUserDto2 = downstreamMuteDto.target;
        }
        if ((i & 4) != 0) {
            date = downstreamMuteDto.created_at;
        }
        if ((i & 8) != 0) {
            date2 = downstreamMuteDto.updated_at;
        }
        if ((i & 16) != 0) {
            date3 = downstreamMuteDto.expires;
        }
        Date date4 = date3;
        Date date5 = date;
        return downstreamMuteDto.copy(downstreamUserDto, downstreamUserDto2, date5, date2, date4);
    }

    /* renamed from: component1, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* renamed from: component2, reason: from getter */
    public final DownstreamUserDto getTarget() {
        return this.target;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    public final DownstreamMuteDto copy(DownstreamUserDto user, DownstreamUserDto target, Date created_at, Date updated_at, Date expires) {
        created_at.getClass();
        updated_at.getClass();
        return new DownstreamMuteDto(user, target, created_at, updated_at, expires);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamMuteDto)) {
            return false;
        }
        DownstreamMuteDto downstreamMuteDto = (DownstreamMuteDto) other;
        if (Intrinsics.areEqual(this.user, downstreamMuteDto.user) && Intrinsics.areEqual(this.target, downstreamMuteDto.target) && Intrinsics.areEqual(this.created_at, downstreamMuteDto.created_at) && Intrinsics.areEqual(this.updated_at, downstreamMuteDto.updated_at) && Intrinsics.areEqual(this.expires, downstreamMuteDto.expires)) {
            return true;
        }
        return false;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final DownstreamUserDto getTarget() {
        return this.target;
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
        DownstreamUserDto downstreamUserDto = this.user;
        int i = 0;
        if (downstreamUserDto == null) {
            hashCode = 0;
        } else {
            hashCode = downstreamUserDto.hashCode();
        }
        int i2 = hashCode * 31;
        DownstreamUserDto downstreamUserDto2 = this.target;
        if (downstreamUserDto2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = downstreamUserDto2.hashCode();
        }
        int f = woa.f(this.updated_at, woa.f(this.created_at, (i2 + hashCode2) * 31, 31), 31);
        Date date = this.expires;
        if (date != null) {
            i = date.hashCode();
        }
        return f + i;
    }

    public String toString() {
        DownstreamUserDto downstreamUserDto = this.user;
        DownstreamUserDto downstreamUserDto2 = this.target;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        Date date3 = this.expires;
        StringBuilder sb = new StringBuilder("DownstreamMuteDto(user=");
        sb.append(downstreamUserDto);
        sb.append(", target=");
        sb.append(downstreamUserDto2);
        sb.append(", created_at=");
        sv6.B(sb, date, ", updated_at=", date2, ", expires=");
        return sv6.q(sb, date3, ")");
    }
}

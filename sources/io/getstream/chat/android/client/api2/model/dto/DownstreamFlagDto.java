package io.getstream.chat.android.client.api2.model.dto;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.k84;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jy\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001b¨\u00060"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamFlagDto;", "", "user", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "target_user", "target_message_id", "", "created_at", "created_by_automod", "", "approved_at", "Ljava/util/Date;", "updated_at", "reviewed_at", "reviewed_by", "rejected_at", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getTarget_user", "getTarget_message_id", "()Ljava/lang/String;", "getCreated_at", "getCreated_by_automod", "()Z", "getApproved_at", "()Ljava/util/Date;", "getUpdated_at", "getReviewed_at", "getReviewed_by", "getRejected_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamFlagDto {
    private final Date approved_at;
    private final String created_at;
    private final boolean created_by_automod;
    private final Date rejected_at;
    private final Date reviewed_at;
    private final Date reviewed_by;
    private final String target_message_id;
    private final DownstreamUserDto target_user;
    private final Date updated_at;
    private final DownstreamUserDto user;

    public DownstreamFlagDto(DownstreamUserDto downstreamUserDto, DownstreamUserDto downstreamUserDto2, String str, String str2, boolean z, Date date, Date date2, Date date3, Date date4, Date date5) {
        downstreamUserDto.getClass();
        str2.getClass();
        date2.getClass();
        this.user = downstreamUserDto;
        this.target_user = downstreamUserDto2;
        this.target_message_id = str;
        this.created_at = str2;
        this.created_by_automod = z;
        this.approved_at = date;
        this.updated_at = date2;
        this.reviewed_at = date3;
        this.reviewed_by = date4;
        this.rejected_at = date5;
    }

    public static /* synthetic */ DownstreamFlagDto copy$default(DownstreamFlagDto downstreamFlagDto, DownstreamUserDto downstreamUserDto, DownstreamUserDto downstreamUserDto2, String str, String str2, boolean z, Date date, Date date2, Date date3, Date date4, Date date5, int i, Object obj) {
        if ((i & 1) != 0) {
            downstreamUserDto = downstreamFlagDto.user;
        }
        if ((i & 2) != 0) {
            downstreamUserDto2 = downstreamFlagDto.target_user;
        }
        if ((i & 4) != 0) {
            str = downstreamFlagDto.target_message_id;
        }
        if ((i & 8) != 0) {
            str2 = downstreamFlagDto.created_at;
        }
        if ((i & 16) != 0) {
            z = downstreamFlagDto.created_by_automod;
        }
        if ((i & 32) != 0) {
            date = downstreamFlagDto.approved_at;
        }
        if ((i & 64) != 0) {
            date2 = downstreamFlagDto.updated_at;
        }
        if ((i & 128) != 0) {
            date3 = downstreamFlagDto.reviewed_at;
        }
        if ((i & 256) != 0) {
            date4 = downstreamFlagDto.reviewed_by;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            date5 = downstreamFlagDto.rejected_at;
        }
        Date date6 = date4;
        Date date7 = date5;
        Date date8 = date2;
        Date date9 = date3;
        boolean z2 = z;
        Date date10 = date;
        return downstreamFlagDto.copy(downstreamUserDto, downstreamUserDto2, str, str2, z2, date10, date8, date9, date6, date7);
    }

    /* renamed from: component1, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* renamed from: component10, reason: from getter */
    public final Date getRejected_at() {
        return this.rejected_at;
    }

    /* renamed from: component2, reason: from getter */
    public final DownstreamUserDto getTarget_user() {
        return this.target_user;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTarget_message_id() {
        return this.target_message_id;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCreated_by_automod() {
        return this.created_by_automod;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getApproved_at() {
        return this.approved_at;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: component8, reason: from getter */
    public final Date getReviewed_at() {
        return this.reviewed_at;
    }

    /* renamed from: component9, reason: from getter */
    public final Date getReviewed_by() {
        return this.reviewed_by;
    }

    public final DownstreamFlagDto copy(DownstreamUserDto user, DownstreamUserDto target_user, String target_message_id, String created_at, boolean created_by_automod, Date approved_at, Date updated_at, Date reviewed_at, Date reviewed_by, Date rejected_at) {
        user.getClass();
        created_at.getClass();
        updated_at.getClass();
        return new DownstreamFlagDto(user, target_user, target_message_id, created_at, created_by_automod, approved_at, updated_at, reviewed_at, reviewed_by, rejected_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamFlagDto)) {
            return false;
        }
        DownstreamFlagDto downstreamFlagDto = (DownstreamFlagDto) other;
        if (Intrinsics.areEqual(this.user, downstreamFlagDto.user) && Intrinsics.areEqual(this.target_user, downstreamFlagDto.target_user) && Intrinsics.areEqual(this.target_message_id, downstreamFlagDto.target_message_id) && Intrinsics.areEqual(this.created_at, downstreamFlagDto.created_at) && this.created_by_automod == downstreamFlagDto.created_by_automod && Intrinsics.areEqual(this.approved_at, downstreamFlagDto.approved_at) && Intrinsics.areEqual(this.updated_at, downstreamFlagDto.updated_at) && Intrinsics.areEqual(this.reviewed_at, downstreamFlagDto.reviewed_at) && Intrinsics.areEqual(this.reviewed_by, downstreamFlagDto.reviewed_by) && Intrinsics.areEqual(this.rejected_at, downstreamFlagDto.rejected_at)) {
            return true;
        }
        return false;
    }

    public final Date getApproved_at() {
        return this.approved_at;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final boolean getCreated_by_automod() {
        return this.created_by_automod;
    }

    public final Date getRejected_at() {
        return this.rejected_at;
    }

    public final Date getReviewed_at() {
        return this.reviewed_at;
    }

    public final Date getReviewed_by() {
        return this.reviewed_by;
    }

    public final String getTarget_message_id() {
        return this.target_message_id;
    }

    public final DownstreamUserDto getTarget_user() {
        return this.target_user;
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
        int hashCode6 = this.user.hashCode() * 31;
        DownstreamUserDto downstreamUserDto = this.target_user;
        int i = 0;
        if (downstreamUserDto == null) {
            hashCode = 0;
        } else {
            hashCode = downstreamUserDto.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        String str = this.target_message_id;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int g = hdi.g(hdi.e((i2 + hashCode2) * 31, 31, this.created_at), 31, this.created_by_automod);
        Date date = this.approved_at;
        if (date == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date.hashCode();
        }
        int f = woa.f(this.updated_at, (g + hashCode3) * 31, 31);
        Date date2 = this.reviewed_at;
        if (date2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date2.hashCode();
        }
        int i3 = (f + hashCode4) * 31;
        Date date3 = this.reviewed_by;
        if (date3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date3.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        Date date4 = this.rejected_at;
        if (date4 != null) {
            i = date4.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        DownstreamUserDto downstreamUserDto = this.user;
        DownstreamUserDto downstreamUserDto2 = this.target_user;
        String str = this.target_message_id;
        String str2 = this.created_at;
        boolean z = this.created_by_automod;
        Date date = this.approved_at;
        Date date2 = this.updated_at;
        Date date3 = this.reviewed_at;
        Date date4 = this.reviewed_by;
        Date date5 = this.rejected_at;
        StringBuilder sb = new StringBuilder("DownstreamFlagDto(user=");
        sb.append(downstreamUserDto);
        sb.append(", target_user=");
        sb.append(downstreamUserDto2);
        sb.append(", target_message_id=");
        k84.q(sb, str, ", created_at=", str2, ", created_by_automod=");
        sb.append(z);
        sb.append(", approved_at=");
        sb.append(date);
        sb.append(", updated_at=");
        sv6.B(sb, date2, ", reviewed_at=", date3, ", reviewed_by=");
        sb.append(date4);
        sb.append(", rejected_at=");
        sb.append(date5);
        sb.append(")");
        return sb.toString();
    }
}

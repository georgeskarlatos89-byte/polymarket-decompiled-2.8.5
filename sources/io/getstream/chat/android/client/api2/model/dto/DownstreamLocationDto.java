package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.m51;
import defpackage.mda;
import defpackage.woa;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "", "channel_cid", "", "message_id", "user_id", "latitude", "", "longitude", "created_by_device_id", "end_at", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/util/Date;)V", "getChannel_cid", "()Ljava/lang/String;", "getMessage_id", "getUser_id", "getLatitude", "()D", "getLongitude", "getCreated_by_device_id", "getEnd_at", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamLocationDto {
    private final String channel_cid;
    private final String created_by_device_id;
    private final Date end_at;
    private final double latitude;
    private final double longitude;
    private final String message_id;
    private final String user_id;

    public DownstreamLocationDto(String str, String str2, String str3, double d, double d2, String str4, Date date) {
        woa.A(str, str2, str3, str4);
        this.channel_cid = str;
        this.message_id = str2;
        this.user_id = str3;
        this.latitude = d;
        this.longitude = d2;
        this.created_by_device_id = str4;
        this.end_at = date;
    }

    public static /* synthetic */ DownstreamLocationDto copy$default(DownstreamLocationDto downstreamLocationDto, String str, String str2, String str3, double d, double d2, String str4, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downstreamLocationDto.channel_cid;
        }
        if ((i & 2) != 0) {
            str2 = downstreamLocationDto.message_id;
        }
        if ((i & 4) != 0) {
            str3 = downstreamLocationDto.user_id;
        }
        if ((i & 8) != 0) {
            d = downstreamLocationDto.latitude;
        }
        if ((i & 16) != 0) {
            d2 = downstreamLocationDto.longitude;
        }
        if ((i & 32) != 0) {
            str4 = downstreamLocationDto.created_by_device_id;
        }
        if ((i & 64) != 0) {
            date = downstreamLocationDto.end_at;
        }
        double d3 = d2;
        double d4 = d;
        String str5 = str3;
        return downstreamLocationDto.copy(str, str2, str5, d4, d3, str4, date);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* renamed from: component4, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component5, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreated_by_device_id() {
        return this.created_by_device_id;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getEnd_at() {
        return this.end_at;
    }

    public final DownstreamLocationDto copy(String channel_cid, String message_id, String user_id, double latitude, double longitude, String created_by_device_id, Date end_at) {
        channel_cid.getClass();
        message_id.getClass();
        user_id.getClass();
        created_by_device_id.getClass();
        return new DownstreamLocationDto(channel_cid, message_id, user_id, latitude, longitude, created_by_device_id, end_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamLocationDto)) {
            return false;
        }
        DownstreamLocationDto downstreamLocationDto = (DownstreamLocationDto) other;
        if (Intrinsics.areEqual(this.channel_cid, downstreamLocationDto.channel_cid) && Intrinsics.areEqual(this.message_id, downstreamLocationDto.message_id) && Intrinsics.areEqual(this.user_id, downstreamLocationDto.user_id) && Double.compare(this.latitude, downstreamLocationDto.latitude) == 0 && Double.compare(this.longitude, downstreamLocationDto.longitude) == 0 && Intrinsics.areEqual(this.created_by_device_id, downstreamLocationDto.created_by_device_id) && Intrinsics.areEqual(this.end_at, downstreamLocationDto.end_at)) {
            return true;
        }
        return false;
    }

    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final String getCreated_by_device_id() {
        return this.created_by_device_id;
    }

    public final Date getEnd_at() {
        return this.end_at;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        int hashCode;
        int e = hdi.e(hdi.c(hdi.c(hdi.e(hdi.e(this.channel_cid.hashCode() * 31, 31, this.message_id), 31, this.user_id), 31, this.latitude), 31, this.longitude), 31, this.created_by_device_id);
        Date date = this.end_at;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return e + hashCode;
    }

    public String toString() {
        String str = this.channel_cid;
        String str2 = this.message_id;
        String str3 = this.user_id;
        double d = this.latitude;
        double d2 = this.longitude;
        String str4 = this.created_by_device_id;
        Date date = this.end_at;
        StringBuilder r = m51.r("DownstreamLocationDto(channel_cid=", str, ", message_id=", str2, ", user_id=");
        r.append(str3);
        r.append(", latitude=");
        r.append(d);
        r.append(", longitude=");
        r.append(d2);
        r.append(", created_by_device_id=");
        r.append(str4);
        r.append(", end_at=");
        r.append(date);
        r.append(")");
        return r.toString();
    }
}

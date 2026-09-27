package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;", "", "latitude", "", "longitude", "created_by_device_id", "", "end_at", "Ljava/util/Date;", "<init>", "(DDLjava/lang/String;Ljava/util/Date;)V", "getLatitude", "()D", "getLongitude", "getCreated_by_device_id", "()Ljava/lang/String;", "getEnd_at", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UpstreamLocationDto {
    private final String created_by_device_id;
    private final Date end_at;
    private final double latitude;
    private final double longitude;

    public UpstreamLocationDto(double d, double d2, String str, Date date) {
        str.getClass();
        this.latitude = d;
        this.longitude = d2;
        this.created_by_device_id = str;
        this.end_at = date;
    }

    public static /* synthetic */ UpstreamLocationDto copy$default(UpstreamLocationDto upstreamLocationDto, double d, double d2, String str, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            d = upstreamLocationDto.latitude;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = upstreamLocationDto.longitude;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            str = upstreamLocationDto.created_by_device_id;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            date = upstreamLocationDto.end_at;
        }
        return upstreamLocationDto.copy(d3, d4, str2, date);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCreated_by_device_id() {
        return this.created_by_device_id;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getEnd_at() {
        return this.end_at;
    }

    public final UpstreamLocationDto copy(double latitude, double longitude, String created_by_device_id, Date end_at) {
        created_by_device_id.getClass();
        return new UpstreamLocationDto(latitude, longitude, created_by_device_id, end_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamLocationDto)) {
            return false;
        }
        UpstreamLocationDto upstreamLocationDto = (UpstreamLocationDto) other;
        if (Double.compare(this.latitude, upstreamLocationDto.latitude) == 0 && Double.compare(this.longitude, upstreamLocationDto.longitude) == 0 && Intrinsics.areEqual(this.created_by_device_id, upstreamLocationDto.created_by_device_id) && Intrinsics.areEqual(this.end_at, upstreamLocationDto.end_at)) {
            return true;
        }
        return false;
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

    public int hashCode() {
        int hashCode;
        int e = hdi.e(hdi.c(Double.hashCode(this.latitude) * 31, 31, this.longitude), 31, this.created_by_device_id);
        Date date = this.end_at;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return e + hashCode;
    }

    public String toString() {
        return "UpstreamLocationDto(latitude=" + this.latitude + ", longitude=" + this.longitude + ", created_by_device_id=" + this.created_by_device_id + ", end_at=" + this.end_at + ")";
    }
}

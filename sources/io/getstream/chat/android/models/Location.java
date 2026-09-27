package io.getstream.chat.android.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.m51;
import defpackage.sv6;
import defpackage.woa;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lio/getstream/chat/android/models/Location;", "", "cid", "", "messageId", "userId", "endAt", "Ljava/util/Date;", "latitude", "", "longitude", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;DDLjava/lang/String;)V", "getCid", "()Ljava/lang/String;", "getMessageId", "getUserId", "getEndAt", "()Ljava/util/Date;", "getLatitude", "()D", "getLongitude", "getDeviceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Location {
    private final String cid;
    private final String deviceId;
    private final Date endAt;
    private final double latitude;
    private final double longitude;
    private final String messageId;
    private final String userId;

    public /* synthetic */ Location(String str, String str2, String str3, Date date, double d, double d2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : date, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? 0.0d : d2, (i & 64) != 0 ? "" : str4);
    }

    public static /* synthetic */ Location copy$default(Location location, String str, String str2, String str3, Date date, double d, double d2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = location.cid;
        }
        if ((i & 2) != 0) {
            str2 = location.messageId;
        }
        if ((i & 4) != 0) {
            str3 = location.userId;
        }
        if ((i & 8) != 0) {
            date = location.endAt;
        }
        if ((i & 16) != 0) {
            d = location.latitude;
        }
        if ((i & 32) != 0) {
            d2 = location.longitude;
        }
        if ((i & 64) != 0) {
            str4 = location.deviceId;
        }
        String str5 = str4;
        double d3 = d2;
        double d4 = d;
        return location.copy(str, str2, str3, date, d4, d3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getEndAt() {
        return this.endAt;
    }

    /* renamed from: component5, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component6, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final Location copy(String cid, String messageId, String userId, Date endAt, double latitude, double longitude, String deviceId) {
        cid.getClass();
        messageId.getClass();
        userId.getClass();
        deviceId.getClass();
        return new Location(cid, messageId, userId, endAt, latitude, longitude, deviceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Location)) {
            return false;
        }
        Location location = (Location) other;
        if (Intrinsics.areEqual(this.cid, location.cid) && Intrinsics.areEqual(this.messageId, location.messageId) && Intrinsics.areEqual(this.userId, location.userId) && Intrinsics.areEqual(this.endAt, location.endAt) && Double.compare(this.latitude, location.latitude) == 0 && Double.compare(this.longitude, location.longitude) == 0 && Intrinsics.areEqual(this.deviceId, location.deviceId)) {
            return true;
        }
        return false;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final Date getEndAt() {
        return this.endAt;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int e = hdi.e(hdi.e(this.cid.hashCode() * 31, 31, this.messageId), 31, this.userId);
        Date date = this.endAt;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return this.deviceId.hashCode() + hdi.c(hdi.c((e + hashCode) * 31, 31, this.latitude), 31, this.longitude);
    }

    public String toString() {
        String str = this.cid;
        String str2 = this.messageId;
        String str3 = this.userId;
        Date date = this.endAt;
        double d = this.latitude;
        double d2 = this.longitude;
        String str4 = this.deviceId;
        StringBuilder r = m51.r("Location(cid=", str, ", messageId=", str2, ", userId=");
        sv6.A(r, str3, ", endAt=", date, ", latitude=");
        r.append(d);
        r.append(", longitude=");
        r.append(d2);
        r.append(", deviceId=");
        return woa.r(r, str4, ")");
    }

    public Location(String str, String str2, String str3, Date date, double d, double d2, String str4) {
        woa.A(str, str2, str3, str4);
        this.cid = str;
        this.messageId = str2;
        this.userId = str3;
        this.endAt = date;
        this.latitude = d;
        this.longitude = d2;
        this.deviceId = str4;
    }

    public Location() {
        this(null, null, null, null, ConstantsKt.UNSET, ConstantsKt.UNSET, null, 127, null);
    }
}

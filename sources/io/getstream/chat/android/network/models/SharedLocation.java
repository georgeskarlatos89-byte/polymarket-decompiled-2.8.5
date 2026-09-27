package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import defpackage.zca;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/getstream/chat/android/network/models/SharedLocation;", "", "", "latitude", "longitude", "", "createdByDeviceId", "Ljava/util/Date;", "endAt", "<init>", "(DDLjava/lang/String;Ljava/util/Date;)V", "copy", "(DDLjava/lang/String;Ljava/util/Date;)Lio/getstream/chat/android/network/models/SharedLocation;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class SharedLocation {
    public final double a;
    public final double b;
    public final String c;
    public final Date d;

    public /* synthetic */ SharedLocation(double d, double d2, String str, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : date);
    }

    public final SharedLocation copy(@zca(name = "latitude") double latitude, @zca(name = "longitude") double longitude, @zca(name = "created_by_device_id") String createdByDeviceId, @zca(name = "end_at") Date endAt) {
        return new SharedLocation(latitude, longitude, createdByDeviceId, endAt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedLocation)) {
            return false;
        }
        SharedLocation sharedLocation = (SharedLocation) obj;
        if (Double.compare(this.a, sharedLocation.a) == 0 && Double.compare(this.b, sharedLocation.b) == 0 && Intrinsics.areEqual(this.c, sharedLocation.c) && Intrinsics.areEqual(this.d, sharedLocation.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = hdi.c(Double.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        Date date = this.d;
        if (date != null) {
            i = date.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "SharedLocation(latitude=" + this.a + ", longitude=" + this.b + ", createdByDeviceId=" + this.c + ", endAt=" + this.d + ")";
    }

    public SharedLocation(@zca(name = "latitude") double d, @zca(name = "longitude") double d2, @zca(name = "created_by_device_id") String str, @zca(name = "end_at") Date date) {
        this.a = d;
        this.b = d2;
        this.c = str;
        this.d = date;
    }
}

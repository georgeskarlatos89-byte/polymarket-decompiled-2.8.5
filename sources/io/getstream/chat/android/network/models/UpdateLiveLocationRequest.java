package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import defpackage.zca;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/getstream/chat/android/network/models/UpdateLiveLocationRequest;", "", "", "messageId", "Ljava/util/Date;", "endAt", "", "latitude", "longitude", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/Double;Ljava/lang/Double;)V", "copy", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/Double;Ljava/lang/Double;)Lio/getstream/chat/android/network/models/UpdateLiveLocationRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UpdateLiveLocationRequest {
    public final String a;
    public final Date b;
    public final Double c;
    public final Double d;

    public /* synthetic */ UpdateLiveLocationRequest(String str, Date date, Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : date, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2);
    }

    public final UpdateLiveLocationRequest copy(@zca(name = "message_id") String messageId, @zca(name = "end_at") Date endAt, @zca(name = "latitude") Double latitude, @zca(name = "longitude") Double longitude) {
        messageId.getClass();
        return new UpdateLiveLocationRequest(messageId, endAt, latitude, longitude);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateLiveLocationRequest)) {
            return false;
        }
        UpdateLiveLocationRequest updateLiveLocationRequest = (UpdateLiveLocationRequest) obj;
        if (Intrinsics.areEqual(this.a, updateLiveLocationRequest.a) && Intrinsics.areEqual(this.b, updateLiveLocationRequest.b) && Intrinsics.areEqual(this.c, updateLiveLocationRequest.c) && Intrinsics.areEqual(this.d, updateLiveLocationRequest.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        Date date = this.b;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Double d = this.c;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Double d2 = this.d;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder u = sv6.u("UpdateLiveLocationRequest(messageId=", this.a, ", endAt=", ", latitude=", this.b);
        u.append(this.c);
        u.append(", longitude=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }

    public UpdateLiveLocationRequest(@zca(name = "message_id") String str, @zca(name = "end_at") Date date, @zca(name = "latitude") Double d, @zca(name = "longitude") Double d2) {
        str.getClass();
        this.a = str;
        this.b = date;
        this.c = d;
        this.d = d2;
    }
}

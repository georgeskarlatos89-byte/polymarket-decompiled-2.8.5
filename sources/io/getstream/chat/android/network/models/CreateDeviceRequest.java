package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.k84;
import defpackage.mda;
import defpackage.wb5;
import defpackage.zca;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0004B?\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJH\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/getstream/chat/android/network/models/CreateDeviceRequest;", "", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "Lwb5;", "pushProvider", "hardwareId", "pushProviderName", "", "voipToken", "<init>", "(Ljava/lang/String;Lwb5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "copy", "(Ljava/lang/String;Lwb5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/chat/android/network/models/CreateDeviceRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class CreateDeviceRequest {
    public final String a;
    public final wb5 b;
    public final String c;
    public final String d;
    public final Boolean e;

    public CreateDeviceRequest(@zca(name = "id") String str, @zca(name = "push_provider") wb5 wb5Var, @zca(name = "hardware_id") String str2, @zca(name = "push_provider_name") String str3, @zca(name = "voip_token") Boolean bool) {
        str.getClass();
        wb5Var.getClass();
        this.a = str;
        this.b = wb5Var;
        this.c = str2;
        this.d = str3;
        this.e = bool;
    }

    public final CreateDeviceRequest copy(@zca(name = "id") String id, @zca(name = "push_provider") wb5 pushProvider, @zca(name = "hardware_id") String hardwareId, @zca(name = "push_provider_name") String pushProviderName, @zca(name = "voip_token") Boolean voipToken) {
        id.getClass();
        pushProvider.getClass();
        return new CreateDeviceRequest(id, pushProvider, hardwareId, pushProviderName, voipToken);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateDeviceRequest)) {
            return false;
        }
        CreateDeviceRequest createDeviceRequest = (CreateDeviceRequest) obj;
        if (Intrinsics.areEqual(this.a, createDeviceRequest.a) && Intrinsics.areEqual(this.b, createDeviceRequest.b) && Intrinsics.areEqual(this.c, createDeviceRequest.c) && Intrinsics.areEqual(this.d, createDeviceRequest.d) && Intrinsics.areEqual(this.e, createDeviceRequest.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateDeviceRequest(id=");
        sb.append(this.a);
        sb.append(", pushProvider=");
        sb.append(this.b);
        sb.append(", hardwareId=");
        k84.q(sb, this.c, ", pushProviderName=", this.d, ", voipToken=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ CreateDeviceRequest(String str, wb5 wb5Var, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, wb5Var, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool);
    }
}

package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import defpackage.zc7;
import defpackage.zca;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0003\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJp\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\u0018\b\u0003\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/getstream/chat/android/network/models/UserRequest;", "", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "image", "", "invisible", Keys.KEY_LANGUAGE, Keys.KEY_NAME, "", "custom", "Lio/getstream/chat/android/network/models/PrivacySettingsResponse;", "privacySettings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/network/models/PrivacySettingsResponse;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/network/models/PrivacySettingsResponse;)Lio/getstream/chat/android/network/models/UserRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UserRequest {
    public final String a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final Map f;
    public final PrivacySettingsResponse g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UserRequest(String str, String str2, Boolean bool, String str3, String str4, Map map, PrivacySettingsResponse privacySettingsResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, str3, str4, map, (i & 64) != 0 ? null : privacySettingsResponse);
        str2 = (i & 2) != 0 ? null : str2;
        bool = (i & 4) != 0 ? null : bool;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        if ((i & 32) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final UserRequest copy(@zca(name = "id") String id, @zca(name = "image") String image, @zca(name = "invisible") Boolean invisible, @zca(name = "language") String language, @zca(name = "name") String name, @zca(name = "custom") Map<String, ? extends Object> custom, @zca(name = "privacy_settings") PrivacySettingsResponse privacySettings) {
        id.getClass();
        return new UserRequest(id, image, invisible, language, name, custom, privacySettings);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRequest)) {
            return false;
        }
        UserRequest userRequest = (UserRequest) obj;
        if (Intrinsics.areEqual(this.a, userRequest.a) && Intrinsics.areEqual(this.b, userRequest.b) && Intrinsics.areEqual(this.c, userRequest.c) && Intrinsics.areEqual(this.d, userRequest.d) && Intrinsics.areEqual(this.e, userRequest.e) && Intrinsics.areEqual(this.f, userRequest.f) && Intrinsics.areEqual(this.g, userRequest.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        Boolean bool = this.c;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.e;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Map map = this.f;
        if (map == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = map.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        PrivacySettingsResponse privacySettingsResponse = this.g;
        if (privacySettingsResponse != null) {
            i = privacySettingsResponse.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("UserRequest(id=", this.a, ", image=", this.b, ", invisible=");
        r.append(this.c);
        r.append(", language=");
        r.append(this.d);
        r.append(", name=");
        r.append(this.e);
        r.append(", custom=");
        r.append(this.f);
        r.append(", privacySettings=");
        r.append(this.g);
        r.append(")");
        return r.toString();
    }

    public UserRequest(@zca(name = "id") String str, @zca(name = "image") String str2, @zca(name = "invisible") Boolean bool, @zca(name = "language") String str3, @zca(name = "name") String str4, @zca(name = "custom") Map<String, ? extends Object> map, @zca(name = "privacy_settings") PrivacySettingsResponse privacySettingsResponse) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = str3;
        this.e = str4;
        this.f = map;
        this.g = privacySettingsResponse;
    }
}

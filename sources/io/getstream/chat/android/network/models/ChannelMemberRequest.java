package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import defpackage.zc7;
import defpackage.zca;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0003\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJL\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0018\b\u0003\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/getstream/chat/android/network/models/ChannelMemberRequest;", "", "", "userId", "channelRole", "", "custom", "Lio/getstream/chat/android/network/models/UserResponse;", "user", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/network/models/UserResponse;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/network/models/UserResponse;)Lio/getstream/chat/android/network/models/ChannelMemberRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ChannelMemberRequest {
    public final String a;
    public final String b;
    public final Map c;
    public final UserResponse d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChannelMemberRequest(String str, String str2, Map map, UserResponse userResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, (i & 8) != 0 ? null : userResponse);
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final ChannelMemberRequest copy(@zca(name = "user_id") String userId, @zca(name = "channel_role") String channelRole, @zca(name = "custom") Map<String, ? extends Object> custom, @zca(name = "user") UserResponse user) {
        userId.getClass();
        return new ChannelMemberRequest(userId, channelRole, custom, user);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelMemberRequest)) {
            return false;
        }
        ChannelMemberRequest channelMemberRequest = (ChannelMemberRequest) obj;
        if (Intrinsics.areEqual(this.a, channelMemberRequest.a) && Intrinsics.areEqual(this.b, channelMemberRequest.b) && Intrinsics.areEqual(this.c, channelMemberRequest.c) && Intrinsics.areEqual(this.d, channelMemberRequest.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Map map = this.c;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        UserResponse userResponse = this.d;
        if (userResponse != null) {
            i = userResponse.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("ChannelMemberRequest(userId=", this.a, ", channelRole=", this.b, ", custom=");
        r.append(this.c);
        r.append(", user=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }

    public ChannelMemberRequest(@zca(name = "user_id") String str, @zca(name = "channel_role") String str2, @zca(name = "custom") Map<String, ? extends Object> map, @zca(name = "user") UserResponse userResponse) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = userResponse;
    }
}

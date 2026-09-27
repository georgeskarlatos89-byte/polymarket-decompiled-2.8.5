package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zc7;
import defpackage.zca;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/getstream/chat/android/network/models/GroupedQueryChannelsRequest;", "", "", "limit", "", "presence", "watch", "", "", "Lio/getstream/chat/android/network/models/GroupedChannelsGroupRequest;", "groups", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)Lio/getstream/chat/android/network/models/GroupedQueryChannelsRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class GroupedQueryChannelsRequest {
    public final Integer a;
    public final Boolean b;
    public final Boolean c;
    public final Map d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupedQueryChannelsRequest(Integer num, Boolean bool, Boolean bool2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, bool, bool2, map);
        num = (i & 1) != 0 ? null : num;
        bool = (i & 2) != 0 ? null : bool;
        bool2 = (i & 4) != 0 ? null : bool2;
        if ((i & 8) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final GroupedQueryChannelsRequest copy(@zca(name = "limit") Integer limit, @zca(name = "presence") Boolean presence, @zca(name = "watch") Boolean watch, @zca(name = "groups") Map<String, GroupedChannelsGroupRequest> groups) {
        return new GroupedQueryChannelsRequest(limit, presence, watch, groups);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupedQueryChannelsRequest)) {
            return false;
        }
        GroupedQueryChannelsRequest groupedQueryChannelsRequest = (GroupedQueryChannelsRequest) obj;
        if (Intrinsics.areEqual(this.a, groupedQueryChannelsRequest.a) && Intrinsics.areEqual(this.b, groupedQueryChannelsRequest.b) && Intrinsics.areEqual(this.c, groupedQueryChannelsRequest.c) && Intrinsics.areEqual(this.d, groupedQueryChannelsRequest.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.b;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool2 = this.c;
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Map map = this.d;
        if (map != null) {
            i = map.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "GroupedQueryChannelsRequest(limit=" + this.a + ", presence=" + this.b + ", watch=" + this.c + ", groups=" + this.d + ")";
    }

    public GroupedQueryChannelsRequest(@zca(name = "limit") Integer num, @zca(name = "presence") Boolean bool, @zca(name = "watch") Boolean bool2, @zca(name = "groups") Map<String, GroupedChannelsGroupRequest> map) {
        this.a = num;
        this.b = bool;
        this.c = bool2;
        this.d = map;
    }
}

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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\u0014\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/getstream/chat/android/network/models/UpdateUsersRequest;", "", "", "", "Lio/getstream/chat/android/network/models/UserRequest;", "users", "<init>", "(Ljava/util/Map;)V", "copy", "(Ljava/util/Map;)Lio/getstream/chat/android/network/models/UpdateUsersRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UpdateUsersRequest {
    public final Map a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UpdateUsersRequest(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
        if ((i & 1) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final UpdateUsersRequest copy(@zca(name = "users") Map<String, UserRequest> users) {
        users.getClass();
        return new UpdateUsersRequest(users);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UpdateUsersRequest) && Intrinsics.areEqual(this.a, ((UpdateUsersRequest) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateUsersRequest(users=" + this.a + ")";
    }

    public UpdateUsersRequest(@zca(name = "users") Map<String, UserRequest> map) {
        map.getClass();
        this.a = map;
    }
}

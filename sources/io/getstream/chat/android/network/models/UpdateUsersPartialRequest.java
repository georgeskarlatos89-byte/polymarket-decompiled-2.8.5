package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import defpackage.zca;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/getstream/chat/android/network/models/UpdateUsersPartialRequest;", "", "", "Lio/getstream/chat/android/network/models/UpdateUserPartialRequest;", "users", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lio/getstream/chat/android/network/models/UpdateUsersPartialRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UpdateUsersPartialRequest {
    public final List a;

    public /* synthetic */ UpdateUsersPartialRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final UpdateUsersPartialRequest copy(@zca(name = "users") List<UpdateUserPartialRequest> users) {
        users.getClass();
        return new UpdateUsersPartialRequest(users);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UpdateUsersPartialRequest) && Intrinsics.areEqual(this.a, ((UpdateUsersPartialRequest) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hdi.q("UpdateUsersPartialRequest(users=", ")", this.a);
    }

    public UpdateUsersPartialRequest(@zca(name = "users") List<UpdateUserPartialRequest> list) {
        list.getClass();
        this.a = list;
    }
}

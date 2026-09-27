package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/getstream/chat/android/network/models/GetBlockedUsersResponse;", "", "", "duration", "", "Lio/getstream/chat/android/network/models/BlockedUserResponse;", "blocks", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/network/models/GetBlockedUsersResponse;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class GetBlockedUsersResponse {
    public final String a;
    public final List b;

    public GetBlockedUsersResponse(@zca(name = "duration") String str, @zca(name = "blocks") List<BlockedUserResponse> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final GetBlockedUsersResponse copy(@zca(name = "duration") String duration, @zca(name = "blocks") List<BlockedUserResponse> blocks) {
        duration.getClass();
        blocks.getClass();
        return new GetBlockedUsersResponse(duration, blocks);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetBlockedUsersResponse)) {
            return false;
        }
        GetBlockedUsersResponse getBlockedUsersResponse = (GetBlockedUsersResponse) obj;
        if (Intrinsics.areEqual(this.a, getBlockedUsersResponse.a) && Intrinsics.areEqual(this.b, getBlockedUsersResponse.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GetBlockedUsersResponse(duration=" + this.a + ", blocks=" + this.b + ")";
    }

    public /* synthetic */ GetBlockedUsersResponse(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}

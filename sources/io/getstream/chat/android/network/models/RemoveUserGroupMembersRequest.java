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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/getstream/chat/android/network/models/RemoveUserGroupMembersRequest;", "", "", "", "memberIds", "teamId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "copy", "(Ljava/util/List;Ljava/lang/String;)Lio/getstream/chat/android/network/models/RemoveUserGroupMembersRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class RemoveUserGroupMembersRequest {
    public final List a;
    public final String b;

    public /* synthetic */ RemoveUserGroupMembersRequest(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : str);
    }

    public final RemoveUserGroupMembersRequest copy(@zca(name = "member_ids") List<String> memberIds, @zca(name = "team_id") String teamId) {
        memberIds.getClass();
        return new RemoveUserGroupMembersRequest(memberIds, teamId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveUserGroupMembersRequest)) {
            return false;
        }
        RemoveUserGroupMembersRequest removeUserGroupMembersRequest = (RemoveUserGroupMembersRequest) obj;
        if (Intrinsics.areEqual(this.a, removeUserGroupMembersRequest.a) && Intrinsics.areEqual(this.b, removeUserGroupMembersRequest.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "RemoveUserGroupMembersRequest(memberIds=" + this.a + ", teamId=" + this.b + ")";
    }

    public RemoveUserGroupMembersRequest(@zca(name = "member_ids") List<String> list, @zca(name = "team_id") String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }
}

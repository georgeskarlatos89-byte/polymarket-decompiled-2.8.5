package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.woa;
import defpackage.zca;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/getstream/chat/android/network/models/AddUserGroupMembersRequest;", "", "", "", "memberIds", "", "asAdmin", "teamId", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lio/getstream/chat/android/network/models/AddUserGroupMembersRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class AddUserGroupMembersRequest {
    public final List a;
    public final Boolean b;
    public final String c;

    public /* synthetic */ AddUserGroupMembersRequest(List list, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str);
    }

    public final AddUserGroupMembersRequest copy(@zca(name = "member_ids") List<String> memberIds, @zca(name = "as_admin") Boolean asAdmin, @zca(name = "team_id") String teamId) {
        memberIds.getClass();
        return new AddUserGroupMembersRequest(memberIds, asAdmin, teamId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddUserGroupMembersRequest)) {
            return false;
        }
        AddUserGroupMembersRequest addUserGroupMembersRequest = (AddUserGroupMembersRequest) obj;
        if (Intrinsics.areEqual(this.a, addUserGroupMembersRequest.a) && Intrinsics.areEqual(this.b, addUserGroupMembersRequest.b) && Intrinsics.areEqual(this.c, addUserGroupMembersRequest.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        Boolean bool = this.b;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddUserGroupMembersRequest(memberIds=");
        sb.append(this.a);
        sb.append(", asAdmin=");
        sb.append(this.b);
        sb.append(", teamId=");
        return woa.r(sb, this.c, ")");
    }

    public AddUserGroupMembersRequest(@zca(name = "member_ids") List<String> list, @zca(name = "as_admin") Boolean bool, @zca(name = "team_id") String str) {
        list.getClass();
        this.a = list;
        this.b = bool;
        this.c = str;
    }
}

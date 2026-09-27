package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.k84;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import defpackage.zca;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJn\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/getstream/chat/android/network/models/UserGroupResponse;", "", "Ljava/util/Date;", "createdAt", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, Keys.KEY_NAME, "updatedAt", "createdBy", "description", "teamId", "", "Lio/getstream/chat/android/network/models/UserGroupMember;", "members", "<init>", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/network/models/UserGroupResponse;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UserGroupResponse {
    public final Date a;
    public final String b;
    public final String c;
    public final Date d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;

    public UserGroupResponse(@zca(name = "created_at") Date date, @zca(name = "id") String str, @zca(name = "name") String str2, @zca(name = "updated_at") Date date2, @zca(name = "created_by") String str3, @zca(name = "description") String str4, @zca(name = "team_id") String str5, @zca(name = "members") List<UserGroupMember> list) {
        date.getClass();
        str.getClass();
        str2.getClass();
        date2.getClass();
        this.a = date;
        this.b = str;
        this.c = str2;
        this.d = date2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = list;
    }

    public final UserGroupResponse copy(@zca(name = "created_at") Date createdAt, @zca(name = "id") String id, @zca(name = "name") String name, @zca(name = "updated_at") Date updatedAt, @zca(name = "created_by") String createdBy, @zca(name = "description") String description, @zca(name = "team_id") String teamId, @zca(name = "members") List<UserGroupMember> members) {
        createdAt.getClass();
        id.getClass();
        name.getClass();
        updatedAt.getClass();
        return new UserGroupResponse(createdAt, id, name, updatedAt, createdBy, description, teamId, members);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserGroupResponse)) {
            return false;
        }
        UserGroupResponse userGroupResponse = (UserGroupResponse) obj;
        if (Intrinsics.areEqual(this.a, userGroupResponse.a) && Intrinsics.areEqual(this.b, userGroupResponse.b) && Intrinsics.areEqual(this.c, userGroupResponse.c) && Intrinsics.areEqual(this.d, userGroupResponse.d) && Intrinsics.areEqual(this.e, userGroupResponse.e) && Intrinsics.areEqual(this.f, userGroupResponse.f) && Intrinsics.areEqual(this.g, userGroupResponse.g) && Intrinsics.areEqual(this.h, userGroupResponse.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int f = woa.f(this.d, hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        int i = 0;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (f + hashCode) * 31;
        String str2 = this.f;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.g;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List list = this.h;
        if (list != null) {
            i = list.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserGroupResponse(createdAt=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", name=");
        sv6.A(sb, this.c, ", updatedAt=", this.d, ", createdBy=");
        k84.q(sb, this.e, ", description=", this.f, ", teamId=");
        sb.append(this.g);
        sb.append(", members=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ UserGroupResponse(Date date, String str, String str2, Date date2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, str, str2, date2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? CollectionsKt.emptyList() : list);
    }
}

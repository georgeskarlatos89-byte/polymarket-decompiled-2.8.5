package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import defpackage.zc7;
import defpackage.zca;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJj\u0010\u0010\u001a\u00020\u00002\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/getstream/chat/android/network/models/QueryUsersPayload;", "", "", "", "filterConditions", "", "includeDeactivatedUsers", "", "limit", "offset", "presence", "", "Lio/getstream/chat/android/network/models/SortParamRequest;", "sort", "<init>", "(Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)V", "copy", "(Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)Lio/getstream/chat/android/network/models/QueryUsersPayload;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class QueryUsersPayload {
    public final Map a;
    public final Boolean b;
    public final Integer c;
    public final Integer d;
    public final Boolean e;
    public final List f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QueryUsersPayload(Map map, Boolean bool, Integer num, Integer num2, Boolean bool2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
        if ((i & 1) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final QueryUsersPayload copy(@zca(name = "filter_conditions") Map<String, ? extends Object> filterConditions, @zca(name = "include_deactivated_users") Boolean includeDeactivatedUsers, @zca(name = "limit") Integer limit, @zca(name = "offset") Integer offset, @zca(name = "presence") Boolean presence, @zca(name = "sort") List<SortParamRequest> sort) {
        filterConditions.getClass();
        return new QueryUsersPayload(filterConditions, includeDeactivatedUsers, limit, offset, presence, sort);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryUsersPayload)) {
            return false;
        }
        QueryUsersPayload queryUsersPayload = (QueryUsersPayload) obj;
        if (Intrinsics.areEqual(this.a, queryUsersPayload.a) && Intrinsics.areEqual(this.b, queryUsersPayload.b) && Intrinsics.areEqual(this.c, queryUsersPayload.c) && Intrinsics.areEqual(this.d, queryUsersPayload.d) && Intrinsics.areEqual(this.e, queryUsersPayload.e) && Intrinsics.areEqual(this.f, queryUsersPayload.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.a.hashCode() * 31;
        int i = 0;
        Boolean bool = this.b;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        Integer num = this.c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num2 = this.d;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool2 = this.e;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        List list = this.f;
        if (list != null) {
            i = list.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryUsersPayload(filterConditions=");
        sb.append(this.a);
        sb.append(", includeDeactivatedUsers=");
        sb.append(this.b);
        sb.append(", limit=");
        sv6.z(sb, this.c, ", offset=", this.d, ", presence=");
        sb.append(this.e);
        sb.append(", sort=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public QueryUsersPayload(@zca(name = "filter_conditions") Map<String, ? extends Object> map, @zca(name = "include_deactivated_users") Boolean bool, @zca(name = "limit") Integer num, @zca(name = "offset") Integer num2, @zca(name = "presence") Boolean bool2, @zca(name = "sort") List<SortParamRequest> list) {
        map.getClass();
        this.a = map;
        this.b = bool;
        this.c = num;
        this.d = num2;
        this.e = bool2;
        this.f = list;
    }
}

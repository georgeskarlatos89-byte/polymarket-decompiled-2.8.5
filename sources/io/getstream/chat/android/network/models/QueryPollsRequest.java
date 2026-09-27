package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.mda;
import defpackage.zc7;
import defpackage.zca;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0018\b\u0003\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ`\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0018\b\u0003\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/getstream/chat/android/network/models/QueryPollsRequest;", "", "", "limit", "", "next", "prev", "", "Lio/getstream/chat/android/network/models/SortParamRequest;", "sort", "", "filter", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lio/getstream/chat/android/network/models/QueryPollsRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class QueryPollsRequest {
    public final Integer a;
    public final String b;
    public final String c;
    public final List d;
    public final Map e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QueryPollsRequest(Integer num, String str, String str2, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, list, map);
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        list = (i & 8) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 16) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final QueryPollsRequest copy(@zca(name = "limit") Integer limit, @zca(name = "next") String next, @zca(name = "prev") String prev, @zca(name = "sort") List<SortParamRequest> sort, @zca(name = "filter") Map<String, ? extends Object> filter) {
        return new QueryPollsRequest(limit, next, prev, sort, filter);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryPollsRequest)) {
            return false;
        }
        QueryPollsRequest queryPollsRequest = (QueryPollsRequest) obj;
        if (Intrinsics.areEqual(this.a, queryPollsRequest.a) && Intrinsics.areEqual(this.b, queryPollsRequest.b) && Intrinsics.areEqual(this.c, queryPollsRequest.c) && Intrinsics.areEqual(this.d, queryPollsRequest.d) && Intrinsics.areEqual(this.e, queryPollsRequest.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List list = this.d;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Map map = this.e;
        if (map != null) {
            i = map.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryPollsRequest(limit=");
        sb.append(this.a);
        sb.append(", next=");
        sb.append(this.b);
        sb.append(", prev=");
        ace.C(sb, this.c, ", sort=", this.d, ", filter=");
        return ace.n(sb, this.e, ")");
    }

    public QueryPollsRequest(@zca(name = "limit") Integer num, @zca(name = "next") String str, @zca(name = "prev") String str2, @zca(name = "sort") List<SortParamRequest> list, @zca(name = "filter") Map<String, ? extends Object> map) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = map;
    }
}

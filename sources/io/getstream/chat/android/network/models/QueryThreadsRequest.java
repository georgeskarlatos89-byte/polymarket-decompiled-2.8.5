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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0018\b\u0003\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0090\u0001\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0018\b\u0003\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/getstream/chat/android/network/models/QueryThreadsRequest;", "", "", "limit", "memberLimit", "", "next", "participantLimit", "prev", "replyLimit", "", "watch", "", "Lio/getstream/chat/android/network/models/SortParamRequest;", "sort", "", "filter", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)Lio/getstream/chat/android/network/models/QueryThreadsRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class QueryThreadsRequest {
    public final Integer a;
    public final Integer b;
    public final String c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final Boolean g;
    public final List h;
    public final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QueryThreadsRequest(Integer num, Integer num2, String str, Integer num3, String str2, Integer num4, Boolean bool, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, str, num3, str2, num4, bool, list, map);
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        str = (i & 4) != 0 ? null : str;
        num3 = (i & 8) != 0 ? null : num3;
        str2 = (i & 16) != 0 ? null : str2;
        num4 = (i & 32) != 0 ? null : num4;
        bool = (i & 64) != 0 ? null : bool;
        list = (i & 128) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 256) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final QueryThreadsRequest copy(@zca(name = "limit") Integer limit, @zca(name = "member_limit") Integer memberLimit, @zca(name = "next") String next, @zca(name = "participant_limit") Integer participantLimit, @zca(name = "prev") String prev, @zca(name = "reply_limit") Integer replyLimit, @zca(name = "watch") Boolean watch, @zca(name = "sort") List<SortParamRequest> sort, @zca(name = "filter") Map<String, ? extends Object> filter) {
        return new QueryThreadsRequest(limit, memberLimit, next, participantLimit, prev, replyLimit, watch, sort, filter);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryThreadsRequest)) {
            return false;
        }
        QueryThreadsRequest queryThreadsRequest = (QueryThreadsRequest) obj;
        if (Intrinsics.areEqual(this.a, queryThreadsRequest.a) && Intrinsics.areEqual(this.b, queryThreadsRequest.b) && Intrinsics.areEqual(this.c, queryThreadsRequest.c) && Intrinsics.areEqual(this.d, queryThreadsRequest.d) && Intrinsics.areEqual(this.e, queryThreadsRequest.e) && Intrinsics.areEqual(this.f, queryThreadsRequest.f) && Intrinsics.areEqual(this.g, queryThreadsRequest.g) && Intrinsics.areEqual(this.h, queryThreadsRequest.h) && Intrinsics.areEqual(this.i, queryThreadsRequest.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.c;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num3 = this.d;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str2 = this.e;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Integer num4 = this.f;
        if (num4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num4.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Boolean bool = this.g;
        if (bool == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        List list = this.h;
        if (list == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Map map = this.i;
        if (map != null) {
            i = map.hashCode();
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryThreadsRequest(limit=");
        sb.append(this.a);
        sb.append(", memberLimit=");
        sb.append(this.b);
        sb.append(", next=");
        sb.append(this.c);
        sb.append(", participantLimit=");
        sb.append(this.d);
        sb.append(", prev=");
        sb.append(this.e);
        sb.append(", replyLimit=");
        sb.append(this.f);
        sb.append(", watch=");
        sb.append(this.g);
        sb.append(", sort=");
        sb.append(this.h);
        sb.append(", filter=");
        return ace.n(sb, this.i, ")");
    }

    public QueryThreadsRequest(@zca(name = "limit") Integer num, @zca(name = "member_limit") Integer num2, @zca(name = "next") String str, @zca(name = "participant_limit") Integer num3, @zca(name = "prev") String str2, @zca(name = "reply_limit") Integer num4, @zca(name = "watch") Boolean bool, @zca(name = "sort") List<SortParamRequest> list, @zca(name = "filter") Map<String, ? extends Object> map) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = num3;
        this.e = str2;
        this.f = num4;
        this.g = bool;
        this.h = list;
        this.i = map;
    }
}

package io.getstream.chat.android.client.api2.model.response;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/QueryGroupedChannelsResponse;", "", "groups", "", "", "Lio/getstream/chat/android/client/api2/model/response/QueryGroupedChannelsGroup;", "duration", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getGroups", "()Ljava/util/Map;", "getDuration", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class QueryGroupedChannelsResponse {
    private final String duration;
    private final Map<String, QueryGroupedChannelsGroup> groups;

    public QueryGroupedChannelsResponse(Map<String, QueryGroupedChannelsGroup> map, String str) {
        map.getClass();
        str.getClass();
        this.groups = map;
        this.duration = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryGroupedChannelsResponse copy$default(QueryGroupedChannelsResponse queryGroupedChannelsResponse, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = queryGroupedChannelsResponse.groups;
        }
        if ((i & 2) != 0) {
            str = queryGroupedChannelsResponse.duration;
        }
        return queryGroupedChannelsResponse.copy(map, str);
    }

    public final Map<String, QueryGroupedChannelsGroup> component1() {
        return this.groups;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final QueryGroupedChannelsResponse copy(Map<String, QueryGroupedChannelsGroup> groups, String duration) {
        groups.getClass();
        duration.getClass();
        return new QueryGroupedChannelsResponse(groups, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryGroupedChannelsResponse)) {
            return false;
        }
        QueryGroupedChannelsResponse queryGroupedChannelsResponse = (QueryGroupedChannelsResponse) other;
        if (Intrinsics.areEqual(this.groups, queryGroupedChannelsResponse.groups) && Intrinsics.areEqual(this.duration, queryGroupedChannelsResponse.duration)) {
            return true;
        }
        return false;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final Map<String, QueryGroupedChannelsGroup> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.duration.hashCode() + (this.groups.hashCode() * 31);
    }

    public String toString() {
        return "QueryGroupedChannelsResponse(groups=" + this.groups + ", duration=" + this.duration + ")";
    }
}

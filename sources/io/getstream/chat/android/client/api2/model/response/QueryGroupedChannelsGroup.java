package io.getstream.chat.android.client.api2.model.response;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003JB\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/QueryGroupedChannelsGroup;", "", "channels", "", "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;", "unread_channels", "", "next", "", "prev", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getChannels", "()Ljava/util/List;", "getUnread_channels", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNext", "()Ljava/lang/String;", "getPrev", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/api2/model/response/QueryGroupedChannelsGroup;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class QueryGroupedChannelsGroup {
    private final List<ChannelResponse> channels;
    private final String next;
    private final String prev;
    private final Integer unread_channels;

    public QueryGroupedChannelsGroup(List<ChannelResponse> list, Integer num, String str, String str2) {
        list.getClass();
        this.channels = list;
        this.unread_channels = num;
        this.next = str;
        this.prev = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryGroupedChannelsGroup copy$default(QueryGroupedChannelsGroup queryGroupedChannelsGroup, List list, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = queryGroupedChannelsGroup.channels;
        }
        if ((i & 2) != 0) {
            num = queryGroupedChannelsGroup.unread_channels;
        }
        if ((i & 4) != 0) {
            str = queryGroupedChannelsGroup.next;
        }
        if ((i & 8) != 0) {
            str2 = queryGroupedChannelsGroup.prev;
        }
        return queryGroupedChannelsGroup.copy(list, num, str, str2);
    }

    public final List<ChannelResponse> component1() {
        return this.channels;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getUnread_channels() {
        return this.unread_channels;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    public final QueryGroupedChannelsGroup copy(List<ChannelResponse> channels, Integer unread_channels, String next, String prev) {
        channels.getClass();
        return new QueryGroupedChannelsGroup(channels, unread_channels, next, prev);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryGroupedChannelsGroup)) {
            return false;
        }
        QueryGroupedChannelsGroup queryGroupedChannelsGroup = (QueryGroupedChannelsGroup) other;
        if (Intrinsics.areEqual(this.channels, queryGroupedChannelsGroup.channels) && Intrinsics.areEqual(this.unread_channels, queryGroupedChannelsGroup.unread_channels) && Intrinsics.areEqual(this.next, queryGroupedChannelsGroup.next) && Intrinsics.areEqual(this.prev, queryGroupedChannelsGroup.prev)) {
            return true;
        }
        return false;
    }

    public final List<ChannelResponse> getChannels() {
        return this.channels;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final Integer getUnread_channels() {
        return this.unread_channels;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.channels.hashCode() * 31;
        Integer num = this.unread_channels;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str = this.next;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.prev;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        List<ChannelResponse> list = this.channels;
        Integer num = this.unread_channels;
        String str = this.next;
        String str2 = this.prev;
        StringBuilder sb = new StringBuilder("QueryGroupedChannelsGroup(channels=");
        sb.append(list);
        sb.append(", unread_channels=");
        sb.append(num);
        sb.append(", next=");
        return sv6.p(sb, str, ", prev=", str2, ")");
    }
}

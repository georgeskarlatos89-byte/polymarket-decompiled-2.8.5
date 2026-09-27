package io.getstream.chat.android.models;

import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lio/getstream/chat/android/models/GroupedChannelsGroupQuery;", "", "limit", "", "next", "", "prev", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNext", "()Ljava/lang/String;", "getPrev", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/GroupedChannelsGroupQuery;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GroupedChannelsGroupQuery {
    private final Integer limit;
    private final String next;
    private final String prev;

    public /* synthetic */ GroupedChannelsGroupQuery(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ GroupedChannelsGroupQuery copy$default(GroupedChannelsGroupQuery groupedChannelsGroupQuery, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = groupedChannelsGroupQuery.limit;
        }
        if ((i & 2) != 0) {
            str = groupedChannelsGroupQuery.next;
        }
        if ((i & 4) != 0) {
            str2 = groupedChannelsGroupQuery.prev;
        }
        return groupedChannelsGroupQuery.copy(num, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    public final GroupedChannelsGroupQuery copy(Integer limit, String next, String prev) {
        return new GroupedChannelsGroupQuery(limit, next, prev);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupedChannelsGroupQuery)) {
            return false;
        }
        GroupedChannelsGroupQuery groupedChannelsGroupQuery = (GroupedChannelsGroupQuery) other;
        if (Intrinsics.areEqual(this.limit, groupedChannelsGroupQuery.limit) && Intrinsics.areEqual(this.next, groupedChannelsGroupQuery.next) && Intrinsics.areEqual(this.prev, groupedChannelsGroupQuery.prev)) {
            return true;
        }
        return false;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrev() {
        return this.prev;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.limit;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
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
        Integer num = this.limit;
        String str = this.next;
        String str2 = this.prev;
        StringBuilder sb = new StringBuilder("GroupedChannelsGroupQuery(limit=");
        sb.append(num);
        sb.append(", next=");
        sb.append(str);
        sb.append(", prev=");
        return woa.r(sb, str2, ")");
    }

    public GroupedChannelsGroupQuery(Integer num, String str, String str2) {
        this.limit = num;
        this.next = str;
        this.prev = str2;
    }

    public GroupedChannelsGroupQuery() {
        this(null, null, null, 7, null);
    }
}

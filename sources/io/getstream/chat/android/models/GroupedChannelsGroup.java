package io.getstream.chat.android.models;

import defpackage.hdi;
import defpackage.woa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006 "}, d2 = {"Lio/getstream/chat/android/models/GroupedChannelsGroup;", "", "groupKey", "", "channels", "", "Lio/getstream/chat/android/models/Channel;", "unreadChannels", "", "next", "prev", "<init>", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "getGroupKey", "()Ljava/lang/String;", "getChannels", "()Ljava/util/List;", "getUnreadChannels", "()I", "getNext", "getPrev", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GroupedChannelsGroup {
    private final List<Channel> channels;
    private final String groupKey;
    private final String next;
    private final String prev;
    private final int unreadChannels;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ GroupedChannelsGroup(String str, List list, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, r3, r4, r5);
        String str4;
        String str5;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i2 & 16) != 0) {
            str5 = null;
        } else {
            str5 = str3;
        }
    }

    public static /* synthetic */ GroupedChannelsGroup copy$default(GroupedChannelsGroup groupedChannelsGroup, String str, List list, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = groupedChannelsGroup.groupKey;
        }
        if ((i2 & 2) != 0) {
            list = groupedChannelsGroup.channels;
        }
        if ((i2 & 4) != 0) {
            i = groupedChannelsGroup.unreadChannels;
        }
        if ((i2 & 8) != 0) {
            str2 = groupedChannelsGroup.next;
        }
        if ((i2 & 16) != 0) {
            str3 = groupedChannelsGroup.prev;
        }
        String str4 = str3;
        int i3 = i;
        return groupedChannelsGroup.copy(str, list, i3, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroupKey() {
        return this.groupKey;
    }

    public final List<Channel> component2() {
        return this.channels;
    }

    /* renamed from: component3, reason: from getter */
    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    public final GroupedChannelsGroup copy(String groupKey, List<Channel> channels, int unreadChannels, String next, String prev) {
        groupKey.getClass();
        channels.getClass();
        return new GroupedChannelsGroup(groupKey, channels, unreadChannels, next, prev);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupedChannelsGroup)) {
            return false;
        }
        GroupedChannelsGroup groupedChannelsGroup = (GroupedChannelsGroup) other;
        if (Intrinsics.areEqual(this.groupKey, groupedChannelsGroup.groupKey) && Intrinsics.areEqual(this.channels, groupedChannelsGroup.channels) && this.unreadChannels == groupedChannelsGroup.unreadChannels && Intrinsics.areEqual(this.next, groupedChannelsGroup.next) && Intrinsics.areEqual(this.prev, groupedChannelsGroup.prev)) {
            return true;
        }
        return false;
    }

    public final List<Channel> getChannels() {
        return this.channels;
    }

    public final String getGroupKey() {
        return this.groupKey;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    public int hashCode() {
        int hashCode;
        int b = woa.b(this.unreadChannels, hdi.f(this.groupKey.hashCode() * 31, 31, this.channels), 31);
        String str = this.next;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        String str2 = this.prev;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.groupKey;
        List<Channel> list = this.channels;
        int i = this.unreadChannels;
        String str2 = this.next;
        String str3 = this.prev;
        StringBuilder sb = new StringBuilder("GroupedChannelsGroup(groupKey=");
        sb.append(str);
        sb.append(", channels=");
        sb.append(list);
        sb.append(", unreadChannels=");
        woa.u(i, ", next=", str2, ", prev=", sb);
        return woa.r(sb, str3, ")");
    }

    public GroupedChannelsGroup(String str, List<Channel> list, int i, String str2, String str3) {
        str.getClass();
        list.getClass();
        this.groupKey = str;
        this.channels = list;
        this.unreadChannels = i;
        this.next = str2;
        this.prev = str3;
    }
}

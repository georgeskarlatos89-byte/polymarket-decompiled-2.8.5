package io.getstream.chat.android.models;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lio/getstream/chat/android/models/GroupedChannels;", "", "groups", "", "", "Lio/getstream/chat/android/models/GroupedChannelsGroup;", "<init>", "(Ljava/util/Map;)V", "getGroups", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GroupedChannels {
    private final Map<String, GroupedChannelsGroup> groups;

    public GroupedChannels(Map<String, GroupedChannelsGroup> map) {
        map.getClass();
        this.groups = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupedChannels copy$default(GroupedChannels groupedChannels, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = groupedChannels.groups;
        }
        return groupedChannels.copy(map);
    }

    public final Map<String, GroupedChannelsGroup> component1() {
        return this.groups;
    }

    public final GroupedChannels copy(Map<String, GroupedChannelsGroup> groups) {
        groups.getClass();
        return new GroupedChannels(groups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof GroupedChannels) && Intrinsics.areEqual(this.groups, ((GroupedChannels) other).groups)) {
            return true;
        }
        return false;
    }

    public final Map<String, GroupedChannelsGroup> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    public String toString() {
        return "GroupedChannels(groups=" + this.groups + ")";
    }
}

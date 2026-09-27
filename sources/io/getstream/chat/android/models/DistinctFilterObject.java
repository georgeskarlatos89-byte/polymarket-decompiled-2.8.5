package io.getstream.chat.android.models;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001e\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÀ\u0001¢\u0006\u0002\b\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/getstream/chat/android/models/DistinctFilterObject;", "Lio/getstream/chat/android/models/FilterObject;", "memberIds", "", "", "<init>", "(Ljava/util/Set;)V", "getMemberIds", "()Ljava/util/Set;", "component1", "copy", "copy$stream_chat_android_core", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DistinctFilterObject extends FilterObject {
    private final Set<String> memberIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistinctFilterObject(Set<String> set) {
        super(null);
        set.getClass();
        this.memberIds = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistinctFilterObject copy$stream_chat_android_core$default(DistinctFilterObject distinctFilterObject, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = distinctFilterObject.memberIds;
        }
        return distinctFilterObject.copy$stream_chat_android_core(set);
    }

    public final Set<String> component1() {
        return this.memberIds;
    }

    public final DistinctFilterObject copy$stream_chat_android_core(Set<String> memberIds) {
        memberIds.getClass();
        return new DistinctFilterObject(memberIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof DistinctFilterObject) && Intrinsics.areEqual(this.memberIds, ((DistinctFilterObject) other).memberIds)) {
            return true;
        }
        return false;
    }

    public final Set<String> getMemberIds() {
        return this.memberIds;
    }

    public int hashCode() {
        return this.memberIds.hashCode();
    }

    public String toString() {
        return "DistinctFilterObject(memberIds=" + this.memberIds + ")";
    }
}

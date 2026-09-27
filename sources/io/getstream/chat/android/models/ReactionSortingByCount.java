package io.getstream.chat.android.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, d2 = {"Lio/getstream/chat/android/models/ReactionSortingByCount;", "Lio/getstream/chat/android/models/ReactionSorting;", "<init>", "()V", "compare", "", "o1", "Lio/getstream/chat/android/models/ReactionGroup;", "o2", "equals", "", "other", "", "hashCode", "toString", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReactionSortingByCount implements ReactionSorting {
    public static final ReactionSortingByCount INSTANCE = new ReactionSortingByCount();

    private ReactionSortingByCount() {
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(ReactionGroup o1, ReactionGroup o2) {
        o1.getClass();
        o2.getClass();
        return Intrinsics.d(o1.getCount(), o2.getCount());
    }

    @Override // java.util.Comparator
    public boolean equals(Object other) {
        if (this == other || (other instanceof ReactionSortingByCount)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return -1623541620;
    }

    public String toString() {
        return "ReactionSortingByCount";
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(ReactionGroup reactionGroup, ReactionGroup reactionGroup2) {
        return compare2(reactionGroup, reactionGroup2);
    }
}

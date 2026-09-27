package io.getstream.chat.android.models;

import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lio/getstream/chat/android/models/BannedUsersSort;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "createdAt", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getCreatedAt", "()Ljava/util/Date;", "getComparableField", "", "fieldName", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BannedUsersSort implements ComparableFieldProvider {
    private final Date createdAt;

    public BannedUsersSort(Date date) {
        date.getClass();
        this.createdAt = date;
    }

    public static /* synthetic */ BannedUsersSort copy$default(BannedUsersSort bannedUsersSort, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            date = bannedUsersSort.createdAt;
        }
        return bannedUsersSort.copy(date);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final BannedUsersSort copy(Date createdAt) {
        createdAt.getClass();
        return new BannedUsersSort(createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof BannedUsersSort) && Intrinsics.areEqual(this.createdAt, ((BannedUsersSort) other).createdAt)) {
            return true;
        }
        return false;
    }

    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    public Comparable<?> getComparableField(String fieldName) {
        fieldName.getClass();
        if (!Intrinsics.areEqual(fieldName, "created_at") && !Intrinsics.areEqual(fieldName, "createdAt")) {
            return null;
        }
        return this.createdAt;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public int hashCode() {
        return this.createdAt.hashCode();
    }

    public String toString() {
        return "BannedUsersSort(createdAt=" + this.createdAt + ")";
    }
}

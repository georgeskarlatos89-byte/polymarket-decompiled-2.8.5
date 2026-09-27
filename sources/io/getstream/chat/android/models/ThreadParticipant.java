package io.getstream.chat.android.models;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/getstream/chat/android/models/ThreadParticipant;", "Lio/getstream/chat/android/models/UserEntity;", "user", "Lio/getstream/chat/android/models/User;", "lastThreadMessageAt", "Ljava/util/Date;", "<init>", "(Lio/getstream/chat/android/models/User;Ljava/util/Date;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getLastThreadMessageAt", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ThreadParticipant implements UserEntity {
    private final Date lastThreadMessageAt;
    private final User user;

    public ThreadParticipant(User user, Date date) {
        user.getClass();
        this.user = user;
        this.lastThreadMessageAt = date;
    }

    public static /* synthetic */ ThreadParticipant copy$default(ThreadParticipant threadParticipant, User user, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            user = threadParticipant.user;
        }
        if ((i & 2) != 0) {
            date = threadParticipant.lastThreadMessageAt;
        }
        return threadParticipant.copy(user, date);
    }

    /* renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getLastThreadMessageAt() {
        return this.lastThreadMessageAt;
    }

    public final ThreadParticipant copy(User user, Date lastThreadMessageAt) {
        user.getClass();
        return new ThreadParticipant(user, lastThreadMessageAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadParticipant)) {
            return false;
        }
        ThreadParticipant threadParticipant = (ThreadParticipant) other;
        if (Intrinsics.areEqual(this.user, threadParticipant.user) && Intrinsics.areEqual(this.lastThreadMessageAt, threadParticipant.lastThreadMessageAt)) {
            return true;
        }
        return false;
    }

    public final Date getLastThreadMessageAt() {
        return this.lastThreadMessageAt;
    }

    @Override // io.getstream.chat.android.models.UserEntity
    public User getUser() {
        return this.user;
    }

    @Override // io.getstream.chat.android.models.UserEntity
    public String getUserId() {
        return super.getUserId();
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.user.hashCode() * 31;
        Date date = this.lastThreadMessageAt;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ThreadParticipant(user=" + this.user + ", lastThreadMessageAt=" + this.lastThreadMessageAt + ")";
    }
}

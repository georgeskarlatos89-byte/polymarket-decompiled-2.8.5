package io.getstream.chat.android.models;

import defpackage.m51;
import defpackage.sv6;
import defpackage.woa;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0007J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\""}, d2 = {"Lio/getstream/chat/android/models/ReactionGroup;", "", "type", "", "count", "", "sumScore", "firstReactionAt", "Ljava/util/Date;", "lastReactionAt", "<init>", "(Ljava/lang/String;IILjava/util/Date;Ljava/util/Date;)V", "getType", "()Ljava/lang/String;", "getCount", "()I", "getSumScore", "getFirstReactionAt", "()Ljava/util/Date;", "getLastReactionAt", "newBuilder", "Lio/getstream/chat/android/models/ReactionGroup$Builder;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Builder", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReactionGroup {
    private final int count;
    private final Date firstReactionAt;
    private final Date lastReactionAt;
    private final int sumScore;
    private final String type;

    public ReactionGroup(String str, int i, int i2, Date date, Date date2) {
        str.getClass();
        date.getClass();
        date2.getClass();
        this.type = str;
        this.count = i;
        this.sumScore = i2;
        this.firstReactionAt = date;
        this.lastReactionAt = date2;
    }

    public static /* synthetic */ ReactionGroup copy$default(ReactionGroup reactionGroup, String str, int i, int i2, Date date, Date date2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = reactionGroup.type;
        }
        if ((i3 & 2) != 0) {
            i = reactionGroup.count;
        }
        if ((i3 & 4) != 0) {
            i2 = reactionGroup.sumScore;
        }
        if ((i3 & 8) != 0) {
            date = reactionGroup.firstReactionAt;
        }
        if ((i3 & 16) != 0) {
            date2 = reactionGroup.lastReactionAt;
        }
        Date date3 = date2;
        int i4 = i2;
        return reactionGroup.copy(str, i, i4, date, date3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSumScore() {
        return this.sumScore;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getFirstReactionAt() {
        return this.firstReactionAt;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getLastReactionAt() {
        return this.lastReactionAt;
    }

    public final ReactionGroup copy(String type, int count, int sumScore, Date firstReactionAt, Date lastReactionAt) {
        type.getClass();
        firstReactionAt.getClass();
        lastReactionAt.getClass();
        return new ReactionGroup(type, count, sumScore, firstReactionAt, lastReactionAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionGroup)) {
            return false;
        }
        ReactionGroup reactionGroup = (ReactionGroup) other;
        if (Intrinsics.areEqual(this.type, reactionGroup.type) && this.count == reactionGroup.count && this.sumScore == reactionGroup.sumScore && Intrinsics.areEqual(this.firstReactionAt, reactionGroup.firstReactionAt) && Intrinsics.areEqual(this.lastReactionAt, reactionGroup.lastReactionAt)) {
            return true;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public final Date getFirstReactionAt() {
        return this.firstReactionAt;
    }

    public final Date getLastReactionAt() {
        return this.lastReactionAt;
    }

    public final int getSumScore() {
        return this.sumScore;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.lastReactionAt.hashCode() + woa.f(this.firstReactionAt, woa.b(this.sumScore, woa.b(this.count, this.type.hashCode() * 31, 31), 31), 31);
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.type;
        int i = this.count;
        int i2 = this.sumScore;
        Date date = this.firstReactionAt;
        Date date2 = this.lastReactionAt;
        StringBuilder q = m51.q("ReactionGroup(type=", str, ", count=", i, ", sumScore=");
        q.append(i2);
        q.append(", firstReactionAt=");
        q.append(date);
        q.append(", lastReactionAt=");
        return sv6.q(q, date2, ")");
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/getstream/chat/android/models/ReactionGroup$Builder;", "", "<init>", "()V", "reactionGroup", "Lio/getstream/chat/android/models/ReactionGroup;", "(Lio/getstream/chat/android/models/ReactionGroup;)V", "type", "", "count", "", "sumScore", "firstReactionAt", "Ljava/util/Date;", "lastReactionAt", "build", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Builder {
        private int count;
        private Date firstReactionAt;
        private Date lastReactionAt;
        private int sumScore;
        private String type;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(ReactionGroup reactionGroup) {
            this();
            reactionGroup.getClass();
            this.type = reactionGroup.getType();
            this.count = reactionGroup.getCount();
            this.sumScore = reactionGroup.getSumScore();
            this.firstReactionAt = reactionGroup.getFirstReactionAt();
            this.lastReactionAt = reactionGroup.getLastReactionAt();
        }

        public final ReactionGroup build() {
            return new ReactionGroup(this.type, this.count, this.sumScore, this.firstReactionAt, this.lastReactionAt);
        }

        public final Builder count(int count) {
            this.count = count;
            return this;
        }

        public final Builder firstReactionAt(Date firstReactionAt) {
            firstReactionAt.getClass();
            this.firstReactionAt = firstReactionAt;
            return this;
        }

        public final Builder lastReactionAt(Date lastReactionAt) {
            lastReactionAt.getClass();
            this.lastReactionAt = lastReactionAt;
            return this;
        }

        public final Builder sumScore(int sumScore) {
            this.sumScore = sumScore;
            return this;
        }

        public final Builder type(String type) {
            type.getClass();
            this.type = type;
            return this;
        }

        public Builder() {
            this.type = "";
            this.firstReactionAt = new Date();
            this.lastReactionAt = new Date();
        }
    }
}

package io.getstream.chat.android.models;

import defpackage.hdi;
import defpackage.m51;
import defpackage.sv6;
import defpackage.woa;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000f\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "pollId", "optionId", "createdAt", "Ljava/util/Date;", "updatedAt", "user", "Lio/getstream/chat/android/models/User;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;)V", "getId", "()Ljava/lang/String;", "getPollId", "getOptionId", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getComparableField", "", "fieldName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Vote implements ComparableFieldProvider {
    private final Date createdAt;
    private final String id;
    private final String optionId;
    private final String pollId;
    private final Date updatedAt;
    private final User user;

    public Vote(String str, String str2, String str3, Date date, Date date2, User user) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        date.getClass();
        date2.getClass();
        this.id = str;
        this.pollId = str2;
        this.optionId = str3;
        this.createdAt = date;
        this.updatedAt = date2;
        this.user = user;
    }

    public static /* synthetic */ Vote copy$default(Vote vote, String str, String str2, String str3, Date date, Date date2, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vote.id;
        }
        if ((i & 2) != 0) {
            str2 = vote.pollId;
        }
        if ((i & 4) != 0) {
            str3 = vote.optionId;
        }
        if ((i & 8) != 0) {
            date = vote.createdAt;
        }
        if ((i & 16) != 0) {
            date2 = vote.updatedAt;
        }
        if ((i & 32) != 0) {
            user = vote.user;
        }
        Date date3 = date2;
        User user2 = user;
        return vote.copy(str, str2, str3, date, date3, user2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOptionId() {
        return this.optionId;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component6, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final Vote copy(String id, String pollId, String optionId, Date createdAt, Date updatedAt, User user) {
        id.getClass();
        pollId.getClass();
        optionId.getClass();
        createdAt.getClass();
        updatedAt.getClass();
        return new Vote(id, pollId, optionId, createdAt, updatedAt, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vote)) {
            return false;
        }
        Vote vote = (Vote) other;
        if (Intrinsics.areEqual(this.id, vote.id) && Intrinsics.areEqual(this.pollId, vote.pollId) && Intrinsics.areEqual(this.optionId, vote.optionId) && Intrinsics.areEqual(this.createdAt, vote.createdAt) && Intrinsics.areEqual(this.updatedAt, vote.updatedAt) && Intrinsics.areEqual(this.user, vote.user)) {
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

    public final String getId() {
        return this.id;
    }

    public final String getOptionId() {
        return this.optionId;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode;
        int f = woa.f(this.updatedAt, woa.f(this.createdAt, hdi.e(hdi.e(this.id.hashCode() * 31, 31, this.pollId), 31, this.optionId), 31), 31);
        User user = this.user;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        return f + hashCode;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pollId;
        String str3 = this.optionId;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        User user = this.user;
        StringBuilder r = m51.r("Vote(id=", str, ", pollId=", str2, ", optionId=");
        sv6.A(r, str3, ", createdAt=", date, ", updatedAt=");
        r.append(date2);
        r.append(", user=");
        r.append(user);
        r.append(")");
        return r.toString();
    }
}

package io.getstream.chat.android.models;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
import defpackage.hdi;
import defpackage.m51;
import defpackage.sv6;
import defpackage.woa;
import defpackage.zc7;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0010\u000f\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013¢\u0006\u0004\b\"\u0010#J\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010B\u001a\u00020\bJ\u0016\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010D2\u0006\u0010E\u001a\u00020\u0003H\u0016J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010J\u001a\u00020\nHÆ\u0003J\t\u0010K\u001a\u00020\fHÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010/J\t\u0010M\u001a\u00020\fHÆ\u0003J\t\u0010N\u001a\u00020\fHÆ\u0003J\t\u0010O\u001a\u00020\u000eHÆ\u0003J\u0015\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007HÆ\u0003J\t\u0010S\u001a\u00020\u0018HÆ\u0003J\t\u0010T\u001a\u00020\u0018HÆ\u0003J\t\u0010U\u001a\u00020\fHÆ\u0003J\t\u0010V\u001a\u00020\u000eHÆ\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u0015\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013HÆ\u0003J\u008a\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013HÆ\u0001¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020\f2\b\u0010]\u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010^\u001a\u00020\u000eHÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0019\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0011\u0010\u001a\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010-R\u0011\u0010\u001b\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013¢\u0006\b\n\u0000\u001a\u0004\bA\u00106¨\u0006`"}, d2 = {"Lio/getstream/chat/android/models/Poll;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "description", "options", "", "Lio/getstream/chat/android/models/Option;", "votingVisibility", "Lio/getstream/chat/android/models/VotingVisibility;", "enforceUniqueVote", "", "maxVotesAllowed", "", "allowUserSuggestedOptions", "allowAnswers", "voteCount", "voteCountsByOption", "", "votes", "Lio/getstream/chat/android/models/Vote;", "ownVotes", "createdAt", "Ljava/util/Date;", "updatedAt", MetricTracker.Action.CLOSED, "answersCount", "answers", "Lio/getstream/chat/android/models/Answer;", "createdBy", "Lio/getstream/chat/android/models/User;", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getOptions", "()Ljava/util/List;", "getVotingVisibility", "()Lio/getstream/chat/android/models/VotingVisibility;", "getEnforceUniqueVote", "()Z", "getMaxVotesAllowed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAllowUserSuggestedOptions", "getAllowAnswers", "getVoteCount", "()I", "getVoteCountsByOption", "()Ljava/util/Map;", "getVotes", "getOwnVotes", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getClosed", "getAnswersCount", "getAnswers", "getCreatedBy", "()Lio/getstream/chat/android/models/User;", "getExtraData", "option", "getComparableField", "", "fieldName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)Lio/getstream/chat/android/models/Poll;", "equals", "other", "hashCode", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Poll implements ComparableFieldProvider {
    private final boolean allowAnswers;
    private final boolean allowUserSuggestedOptions;
    private final List<Answer> answers;
    private final int answersCount;
    private final boolean closed;
    private final Date createdAt;
    private final User createdBy;
    private final String description;
    private final boolean enforceUniqueVote;
    private final Map<String, Object> extraData;
    private final String id;
    private final Integer maxVotesAllowed;
    private final String name;
    private final List<Option> options;
    private final List<Vote> ownVotes;
    private final Date updatedAt;
    private final int voteCount;
    private final Map<String, Integer> voteCountsByOption;
    private final List<Vote> votes;
    private final VotingVisibility votingVisibility;

    public Poll(String str, String str2, String str3, List<Option> list, VotingVisibility votingVisibility, boolean z, Integer num, boolean z2, boolean z3, int i, Map<String, Integer> map, List<Vote> list2, List<Vote> list3, Date date, Date date2, boolean z4, int i2, List<Answer> list4, User user, Map<String, ? extends Object> map2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        votingVisibility.getClass();
        map.getClass();
        list2.getClass();
        list3.getClass();
        date.getClass();
        date2.getClass();
        list4.getClass();
        map2.getClass();
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.options = list;
        this.votingVisibility = votingVisibility;
        this.enforceUniqueVote = z;
        this.maxVotesAllowed = num;
        this.allowUserSuggestedOptions = z2;
        this.allowAnswers = z3;
        this.voteCount = i;
        this.voteCountsByOption = map;
        this.votes = list2;
        this.ownVotes = list3;
        this.createdAt = date;
        this.updatedAt = date2;
        this.closed = z4;
        this.answersCount = i2;
        this.answers = list4;
        this.createdBy = user;
        this.extraData = map2;
    }

    public static /* synthetic */ Poll copy$default(Poll poll, String str, String str2, String str3, List list, VotingVisibility votingVisibility, boolean z, Integer num, boolean z2, boolean z3, int i, Map map, List list2, List list3, Date date, Date date2, boolean z4, int i2, List list4, User user, Map map2, int i3, Object obj) {
        Map map3;
        User user2;
        String str4 = (i3 & 1) != 0 ? poll.id : str;
        String str5 = (i3 & 2) != 0 ? poll.name : str2;
        String str6 = (i3 & 4) != 0 ? poll.description : str3;
        List list5 = (i3 & 8) != 0 ? poll.options : list;
        VotingVisibility votingVisibility2 = (i3 & 16) != 0 ? poll.votingVisibility : votingVisibility;
        boolean z5 = (i3 & 32) != 0 ? poll.enforceUniqueVote : z;
        Integer num2 = (i3 & 64) != 0 ? poll.maxVotesAllowed : num;
        boolean z6 = (i3 & 128) != 0 ? poll.allowUserSuggestedOptions : z2;
        boolean z7 = (i3 & 256) != 0 ? poll.allowAnswers : z3;
        int i4 = (i3 & Barcode.FORMAT_UPC_A) != 0 ? poll.voteCount : i;
        Map map4 = (i3 & Barcode.FORMAT_UPC_E) != 0 ? poll.voteCountsByOption : map;
        List list6 = (i3 & 2048) != 0 ? poll.votes : list2;
        List list7 = (i3 & 4096) != 0 ? poll.ownVotes : list3;
        Date date3 = (i3 & 8192) != 0 ? poll.createdAt : date;
        String str7 = str4;
        Date date4 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? poll.updatedAt : date2;
        boolean z8 = (i3 & 32768) != 0 ? poll.closed : z4;
        int i5 = (i3 & 65536) != 0 ? poll.answersCount : i2;
        List list8 = (i3 & 131072) != 0 ? poll.answers : list4;
        User user3 = (i3 & 262144) != 0 ? poll.createdBy : user;
        if ((i3 & 524288) != 0) {
            user2 = user3;
            map3 = poll.extraData;
        } else {
            map3 = map2;
            user2 = user3;
        }
        return poll.copy(str7, str5, str6, list5, votingVisibility2, z5, num2, z6, z7, i4, map4, list6, list7, date3, date4, z8, i5, list8, user2, map3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getVoteCount() {
        return this.voteCount;
    }

    public final Map<String, Integer> component11() {
        return this.voteCountsByOption;
    }

    public final List<Vote> component12() {
        return this.votes;
    }

    public final List<Vote> component13() {
        return this.ownVotes;
    }

    /* renamed from: component14, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component15, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* renamed from: component17, reason: from getter */
    public final int getAnswersCount() {
        return this.answersCount;
    }

    public final List<Answer> component18() {
        return this.answers;
    }

    /* renamed from: component19, reason: from getter */
    public final User getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> component20() {
        return this.extraData;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<Option> component4() {
        return this.options;
    }

    /* renamed from: component5, reason: from getter */
    public final VotingVisibility getVotingVisibility() {
        return this.votingVisibility;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnforceUniqueVote() {
        return this.enforceUniqueVote;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getMaxVotesAllowed() {
        return this.maxVotesAllowed;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getAllowUserSuggestedOptions() {
        return this.allowUserSuggestedOptions;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getAllowAnswers() {
        return this.allowAnswers;
    }

    public final Poll copy(String id, String name, String description, List<Option> options, VotingVisibility votingVisibility, boolean enforceUniqueVote, Integer maxVotesAllowed, boolean allowUserSuggestedOptions, boolean allowAnswers, int voteCount, Map<String, Integer> voteCountsByOption, List<Vote> votes, List<Vote> ownVotes, Date createdAt, Date updatedAt, boolean closed, int answersCount, List<Answer> answers, User createdBy, Map<String, ? extends Object> extraData) {
        id.getClass();
        name.getClass();
        description.getClass();
        options.getClass();
        votingVisibility.getClass();
        voteCountsByOption.getClass();
        votes.getClass();
        ownVotes.getClass();
        createdAt.getClass();
        updatedAt.getClass();
        answers.getClass();
        extraData.getClass();
        return new Poll(id, name, description, options, votingVisibility, enforceUniqueVote, maxVotesAllowed, allowUserSuggestedOptions, allowAnswers, voteCount, voteCountsByOption, votes, ownVotes, createdAt, updatedAt, closed, answersCount, answers, createdBy, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Poll)) {
            return false;
        }
        Poll poll = (Poll) other;
        if (Intrinsics.areEqual(this.id, poll.id) && Intrinsics.areEqual(this.name, poll.name) && Intrinsics.areEqual(this.description, poll.description) && Intrinsics.areEqual(this.options, poll.options) && this.votingVisibility == poll.votingVisibility && this.enforceUniqueVote == poll.enforceUniqueVote && Intrinsics.areEqual(this.maxVotesAllowed, poll.maxVotesAllowed) && this.allowUserSuggestedOptions == poll.allowUserSuggestedOptions && this.allowAnswers == poll.allowAnswers && this.voteCount == poll.voteCount && Intrinsics.areEqual(this.voteCountsByOption, poll.voteCountsByOption) && Intrinsics.areEqual(this.votes, poll.votes) && Intrinsics.areEqual(this.ownVotes, poll.ownVotes) && Intrinsics.areEqual(this.createdAt, poll.createdAt) && Intrinsics.areEqual(this.updatedAt, poll.updatedAt) && this.closed == poll.closed && this.answersCount == poll.answersCount && Intrinsics.areEqual(this.answers, poll.answers) && Intrinsics.areEqual(this.createdBy, poll.createdBy) && Intrinsics.areEqual(this.extraData, poll.extraData)) {
            return true;
        }
        return false;
    }

    public final boolean getAllowAnswers() {
        return this.allowAnswers;
    }

    public final boolean getAllowUserSuggestedOptions() {
        return this.allowUserSuggestedOptions;
    }

    public final List<Answer> getAnswers() {
        return this.answers;
    }

    public final int getAnswersCount() {
        return this.answersCount;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    public Comparable<?> getComparableField(String fieldName) {
        fieldName.getClass();
        switch (fieldName.hashCode()) {
            case -1949194674:
                if (!fieldName.equals("updatedAt")) {
                    return null;
                }
                return this.updatedAt;
            case -893481439:
                if (!fieldName.equals("is_closed")) {
                    return null;
                }
                return Boolean.valueOf(this.closed);
            case -683486410:
                if (!fieldName.equals("isClosed")) {
                    return null;
                }
                return Boolean.valueOf(this.closed);
            case -295464393:
                if (!fieldName.equals("updated_at")) {
                    return null;
                }
                return this.updatedAt;
            case 3355:
                if (fieldName.equals(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)) {
                    return this.id;
                }
                return null;
            case 3373707:
                if (fieldName.equals(Keys.KEY_NAME)) {
                    return this.name;
                }
                return null;
            case 598371643:
                if (!fieldName.equals("createdAt")) {
                    return null;
                }
                return this.createdAt;
            case 1369680106:
                if (!fieldName.equals("created_at")) {
                    return null;
                }
                return this.createdAt;
            default:
                return null;
        }
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final User getCreatedBy() {
        return this.createdBy;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnforceUniqueVote() {
        return this.enforceUniqueVote;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getMaxVotesAllowed() {
        return this.maxVotesAllowed;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Option> getOptions() {
        return this.options;
    }

    public final List<Vote> getOwnVotes() {
        return this.ownVotes;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getVoteCount() {
        return this.voteCount;
    }

    public final Map<String, Integer> getVoteCountsByOption() {
        return this.voteCountsByOption;
    }

    public final List<Vote> getVotes(Option option) {
        option.getClass();
        List<Vote> list = this.votes;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((Vote) obj).getOptionId(), option.getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final VotingVisibility getVotingVisibility() {
        return this.votingVisibility;
    }

    public int hashCode() {
        int hashCode;
        int g = hdi.g((this.votingVisibility.hashCode() + hdi.f(hdi.e(hdi.e(this.id.hashCode() * 31, 31, this.name), 31, this.description), 31, this.options)) * 31, 31, this.enforceUniqueVote);
        Integer num = this.maxVotesAllowed;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int f = hdi.f(woa.b(this.answersCount, hdi.g(woa.f(this.updatedAt, woa.f(this.createdAt, hdi.f(hdi.f(sv6.c(this.voteCountsByOption, woa.b(this.voteCount, hdi.g(hdi.g((g + hashCode) * 31, 31, this.allowUserSuggestedOptions), 31, this.allowAnswers), 31), 31), 31, this.votes), 31, this.ownVotes), 31), 31), 31, this.closed), 31), 31, this.answers);
        User user = this.createdBy;
        if (user != null) {
            i = user.hashCode();
        }
        return this.extraData.hashCode() + ((f + i) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.description;
        List<Option> list = this.options;
        VotingVisibility votingVisibility = this.votingVisibility;
        boolean z = this.enforceUniqueVote;
        Integer num = this.maxVotesAllowed;
        boolean z2 = this.allowUserSuggestedOptions;
        boolean z3 = this.allowAnswers;
        int i = this.voteCount;
        Map<String, Integer> map = this.voteCountsByOption;
        List<Vote> list2 = this.votes;
        List<Vote> list3 = this.ownVotes;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        boolean z4 = this.closed;
        int i2 = this.answersCount;
        List<Answer> list4 = this.answers;
        User user = this.createdBy;
        Map<String, Object> map2 = this.extraData;
        StringBuilder r = m51.r("Poll(id=", str, ", name=", str2, ", description=");
        ace.C(r, str3, ", options=", list, ", votingVisibility=");
        r.append(votingVisibility);
        r.append(", enforceUniqueVote=");
        r.append(z);
        r.append(", maxVotesAllowed=");
        r.append(num);
        r.append(", allowUserSuggestedOptions=");
        r.append(z2);
        r.append(", allowAnswers=");
        r.append(z3);
        r.append(", voteCount=");
        r.append(i);
        r.append(", voteCountsByOption=");
        r.append(map);
        r.append(", votes=");
        r.append(list2);
        r.append(", ownVotes=");
        r.append(list3);
        r.append(", createdAt=");
        r.append(date);
        r.append(", updatedAt=");
        r.append(date2);
        r.append(", closed=");
        r.append(z4);
        r.append(", answersCount=");
        r.append(i2);
        r.append(", answers=");
        r.append(list4);
        r.append(", createdBy=");
        r.append(user);
        r.append(", extraData=");
        r.append(map2);
        r.append(")");
        return r.toString();
    }

    public final List<Vote> getVotes() {
        return this.votes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Poll(String str, String str2, String str3, List list, VotingVisibility votingVisibility, boolean z, Integer num, boolean z2, boolean z3, int i, Map map, List list2, List list3, Date date, Date date2, boolean z4, int i2, List list4, User user, Map map2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, votingVisibility, z, num, z2, z3, i, map, list2, list3, date, date2, z4, i2, r19, user, r21);
        Map map3;
        List emptyList = (i3 & 131072) != 0 ? CollectionsKt.emptyList() : list4;
        if ((i3 & 524288) != 0) {
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            map3 = zc7Var;
        } else {
            map3 = map2;
        }
    }
}

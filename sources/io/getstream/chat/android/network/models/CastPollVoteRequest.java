package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/getstream/chat/android/network/models/CastPollVoteRequest;", "", "Lio/getstream/chat/android/network/models/VoteData;", "vote", "<init>", "(Lio/getstream/chat/android/network/models/VoteData;)V", "copy", "(Lio/getstream/chat/android/network/models/VoteData;)Lio/getstream/chat/android/network/models/CastPollVoteRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class CastPollVoteRequest {
    public final VoteData a;

    public /* synthetic */ CastPollVoteRequest(VoteData voteData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : voteData);
    }

    public final CastPollVoteRequest copy(@zca(name = "vote") VoteData vote) {
        return new CastPollVoteRequest(vote);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CastPollVoteRequest) && Intrinsics.areEqual(this.a, ((CastPollVoteRequest) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        VoteData voteData = this.a;
        if (voteData == null) {
            return 0;
        }
        return voteData.hashCode();
    }

    public final String toString() {
        return "CastPollVoteRequest(vote=" + this.a + ")";
    }

    public CastPollVoteRequest(@zca(name = "vote") VoteData voteData) {
        this.a = voteData;
    }
}

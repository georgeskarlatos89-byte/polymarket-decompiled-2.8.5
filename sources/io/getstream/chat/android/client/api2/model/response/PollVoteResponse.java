package io.getstream.chat.android.client.api2.model.response;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import io.getstream.chat.android.client.api2.model.dto.DownstreamVoteDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/PollVoteResponse;", "", "duration", "", "vote", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;)V", "getDuration", "()Ljava/lang/String;", "getVote", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class PollVoteResponse {
    private final String duration;
    private final DownstreamVoteDto vote;

    public PollVoteResponse(String str, DownstreamVoteDto downstreamVoteDto) {
        str.getClass();
        downstreamVoteDto.getClass();
        this.duration = str;
        this.vote = downstreamVoteDto;
    }

    public static /* synthetic */ PollVoteResponse copy$default(PollVoteResponse pollVoteResponse, String str, DownstreamVoteDto downstreamVoteDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pollVoteResponse.duration;
        }
        if ((i & 2) != 0) {
            downstreamVoteDto = pollVoteResponse.vote;
        }
        return pollVoteResponse.copy(str, downstreamVoteDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* renamed from: component2, reason: from getter */
    public final DownstreamVoteDto getVote() {
        return this.vote;
    }

    public final PollVoteResponse copy(String duration, DownstreamVoteDto vote) {
        duration.getClass();
        vote.getClass();
        return new PollVoteResponse(duration, vote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollVoteResponse)) {
            return false;
        }
        PollVoteResponse pollVoteResponse = (PollVoteResponse) other;
        if (Intrinsics.areEqual(this.duration, pollVoteResponse.duration) && Intrinsics.areEqual(this.vote, pollVoteResponse.vote)) {
            return true;
        }
        return false;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final DownstreamVoteDto getVote() {
        return this.vote;
    }

    public int hashCode() {
        return this.vote.hashCode() + (this.duration.hashCode() * 31);
    }

    public String toString() {
        return "PollVoteResponse(duration=" + this.duration + ", vote=" + this.vote + ")";
    }
}

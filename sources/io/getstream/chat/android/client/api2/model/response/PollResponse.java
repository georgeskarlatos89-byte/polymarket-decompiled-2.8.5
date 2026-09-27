package io.getstream.chat.android.client.api2.model.response;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPollDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/PollResponse;", "", "duration", "", "poll", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;)V", "getDuration", "()Ljava/lang/String;", "getPoll", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class PollResponse {
    private final String duration;
    private final DownstreamPollDto poll;

    public PollResponse(String str, DownstreamPollDto downstreamPollDto) {
        str.getClass();
        downstreamPollDto.getClass();
        this.duration = str;
        this.poll = downstreamPollDto;
    }

    public static /* synthetic */ PollResponse copy$default(PollResponse pollResponse, String str, DownstreamPollDto downstreamPollDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pollResponse.duration;
        }
        if ((i & 2) != 0) {
            downstreamPollDto = pollResponse.poll;
        }
        return pollResponse.copy(str, downstreamPollDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* renamed from: component2, reason: from getter */
    public final DownstreamPollDto getPoll() {
        return this.poll;
    }

    public final PollResponse copy(String duration, DownstreamPollDto poll) {
        duration.getClass();
        poll.getClass();
        return new PollResponse(duration, poll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollResponse)) {
            return false;
        }
        PollResponse pollResponse = (PollResponse) other;
        if (Intrinsics.areEqual(this.duration, pollResponse.duration) && Intrinsics.areEqual(this.poll, pollResponse.poll)) {
            return true;
        }
        return false;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final DownstreamPollDto getPoll() {
        return this.poll;
    }

    public int hashCode() {
        return this.poll.hashCode() + (this.duration.hashCode() * 31);
    }

    public String toString() {
        return "PollResponse(duration=" + this.duration + ", poll=" + this.poll + ")";
    }
}

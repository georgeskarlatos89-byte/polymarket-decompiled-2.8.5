package io.getstream.chat.android.client.api2.model.response;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import io.getstream.chat.android.client.api2.model.dto.DownstreamReactionDto;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/ReactionResponse;", "", MetricTracker.Object.REACTION, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;)V", "getReaction", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ReactionResponse {
    private final DownstreamReactionDto reaction;

    public ReactionResponse(DownstreamReactionDto downstreamReactionDto) {
        downstreamReactionDto.getClass();
        this.reaction = downstreamReactionDto;
    }

    public static /* synthetic */ ReactionResponse copy$default(ReactionResponse reactionResponse, DownstreamReactionDto downstreamReactionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            downstreamReactionDto = reactionResponse.reaction;
        }
        return reactionResponse.copy(downstreamReactionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final DownstreamReactionDto getReaction() {
        return this.reaction;
    }

    public final ReactionResponse copy(DownstreamReactionDto reaction) {
        reaction.getClass();
        return new ReactionResponse(reaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ReactionResponse) && Intrinsics.areEqual(this.reaction, ((ReactionResponse) other).reaction)) {
            return true;
        }
        return false;
    }

    public final DownstreamReactionDto getReaction() {
        return this.reaction;
    }

    public int hashCode() {
        return this.reaction.hashCode();
    }

    public String toString() {
        return "ReactionResponse(reaction=" + this.reaction + ")";
    }
}

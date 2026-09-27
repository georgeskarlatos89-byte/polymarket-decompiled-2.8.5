package io.getstream.chat.android.client.api2.model.response;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import io.getstream.chat.android.client.api2.model.dto.DownstreamReactionDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/ReactionsResponse;", "", "reactions", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "<init>", "(Ljava/util/List;)V", "getReactions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ReactionsResponse {
    private final List<DownstreamReactionDto> reactions;

    public ReactionsResponse(List<DownstreamReactionDto> list) {
        list.getClass();
        this.reactions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactionsResponse copy$default(ReactionsResponse reactionsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = reactionsResponse.reactions;
        }
        return reactionsResponse.copy(list);
    }

    public final List<DownstreamReactionDto> component1() {
        return this.reactions;
    }

    public final ReactionsResponse copy(List<DownstreamReactionDto> reactions) {
        reactions.getClass();
        return new ReactionsResponse(reactions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ReactionsResponse) && Intrinsics.areEqual(this.reactions, ((ReactionsResponse) other).reactions)) {
            return true;
        }
        return false;
    }

    public final List<DownstreamReactionDto> getReactions() {
        return this.reactions;
    }

    public int hashCode() {
        return this.reactions.hashCode();
    }

    public String toString() {
        return hdi.q("ReactionsResponse(reactions=", ")", this.reactions);
    }
}

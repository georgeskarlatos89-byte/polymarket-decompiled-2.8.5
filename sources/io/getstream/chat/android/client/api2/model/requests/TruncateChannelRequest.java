package io.getstream.chat.android.client.api2.model.requests;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMessageDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/getstream/chat/android/client/api2/model/requests/TruncateChannelRequest;", "", "message", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;)V", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class TruncateChannelRequest {
    private final UpstreamMessageDto message;

    public TruncateChannelRequest(UpstreamMessageDto upstreamMessageDto) {
        this.message = upstreamMessageDto;
    }

    public static /* synthetic */ TruncateChannelRequest copy$default(TruncateChannelRequest truncateChannelRequest, UpstreamMessageDto upstreamMessageDto, int i, Object obj) {
        if ((i & 1) != 0) {
            upstreamMessageDto = truncateChannelRequest.message;
        }
        return truncateChannelRequest.copy(upstreamMessageDto);
    }

    /* renamed from: component1, reason: from getter */
    public final UpstreamMessageDto getMessage() {
        return this.message;
    }

    public final TruncateChannelRequest copy(UpstreamMessageDto message) {
        return new TruncateChannelRequest(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof TruncateChannelRequest) && Intrinsics.areEqual(this.message, ((TruncateChannelRequest) other).message)) {
            return true;
        }
        return false;
    }

    public final UpstreamMessageDto getMessage() {
        return this.message;
    }

    public int hashCode() {
        UpstreamMessageDto upstreamMessageDto = this.message;
        if (upstreamMessageDto == null) {
            return 0;
        }
        return upstreamMessageDto.hashCode();
    }

    public String toString() {
        return "TruncateChannelRequest(message=" + this.message + ")";
    }
}

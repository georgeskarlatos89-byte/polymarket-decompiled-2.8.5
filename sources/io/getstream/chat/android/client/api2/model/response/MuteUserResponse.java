package io.getstream.chat.android.client.api2.model.response;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMuteDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import io.getstream.chat.android.models.CommandDefaults;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/MuteUserResponse;", "", CommandDefaults.MUTE, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;", "own_user", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;)V", "getMute", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;", "getOwn_user", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class MuteUserResponse {
    private final DownstreamMuteDto mute;
    private final DownstreamUserDto own_user;

    public MuteUserResponse(DownstreamMuteDto downstreamMuteDto, DownstreamUserDto downstreamUserDto) {
        downstreamMuteDto.getClass();
        downstreamUserDto.getClass();
        this.mute = downstreamMuteDto;
        this.own_user = downstreamUserDto;
    }

    public static /* synthetic */ MuteUserResponse copy$default(MuteUserResponse muteUserResponse, DownstreamMuteDto downstreamMuteDto, DownstreamUserDto downstreamUserDto, int i, Object obj) {
        if ((i & 1) != 0) {
            downstreamMuteDto = muteUserResponse.mute;
        }
        if ((i & 2) != 0) {
            downstreamUserDto = muteUserResponse.own_user;
        }
        return muteUserResponse.copy(downstreamMuteDto, downstreamUserDto);
    }

    /* renamed from: component1, reason: from getter */
    public final DownstreamMuteDto getMute() {
        return this.mute;
    }

    /* renamed from: component2, reason: from getter */
    public final DownstreamUserDto getOwn_user() {
        return this.own_user;
    }

    public final MuteUserResponse copy(DownstreamMuteDto mute, DownstreamUserDto own_user) {
        mute.getClass();
        own_user.getClass();
        return new MuteUserResponse(mute, own_user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MuteUserResponse)) {
            return false;
        }
        MuteUserResponse muteUserResponse = (MuteUserResponse) other;
        if (Intrinsics.areEqual(this.mute, muteUserResponse.mute) && Intrinsics.areEqual(this.own_user, muteUserResponse.own_user)) {
            return true;
        }
        return false;
    }

    public final DownstreamMuteDto getMute() {
        return this.mute;
    }

    public final DownstreamUserDto getOwn_user() {
        return this.own_user;
    }

    public int hashCode() {
        return this.own_user.hashCode() + (this.mute.hashCode() * 31);
    }

    public String toString() {
        return "MuteUserResponse(mute=" + this.mute + ", own_user=" + this.own_user + ")";
    }
}

package io.getstream.chat.android.client.api2.model.dto;

import com.appsflyer.AppsFlyerProperties;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/AgoraDto;", "Lio/getstream/chat/android/client/api2/model/dto/VideoCallDto;", AppsFlyerProperties.CHANNEL, "", "<init>", "(Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class AgoraDto implements VideoCallDto {
    private final String channel;

    public AgoraDto(String str) {
        str.getClass();
        this.channel = str;
    }

    public static /* synthetic */ AgoraDto copy$default(AgoraDto agoraDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agoraDto.channel;
        }
        return agoraDto.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    public final AgoraDto copy(String channel) {
        channel.getClass();
        return new AgoraDto(channel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof AgoraDto) && Intrinsics.areEqual(this.channel, ((AgoraDto) other).channel)) {
            return true;
        }
        return false;
    }

    public final String getChannel() {
        return this.channel;
    }

    public int hashCode() {
        return this.channel.hashCode();
    }

    public String toString() {
        return sv6.n("AgoraDto(channel=", this.channel, ")");
    }
}

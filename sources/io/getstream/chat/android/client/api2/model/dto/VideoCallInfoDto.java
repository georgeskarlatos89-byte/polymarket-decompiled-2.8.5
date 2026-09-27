package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.m51;
import defpackage.mda;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "provider", "type", "agora", "Lio/getstream/chat/android/client/api2/model/dto/AgoraDto;", "hms", "Lio/getstream/chat/android/client/api2/model/dto/HMSDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/AgoraDto;Lio/getstream/chat/android/client/api2/model/dto/HMSDto;)V", "getId", "()Ljava/lang/String;", "getProvider", "getType", "getAgora", "()Lio/getstream/chat/android/client/api2/model/dto/AgoraDto;", "getHms", "()Lio/getstream/chat/android/client/api2/model/dto/HMSDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class VideoCallInfoDto {
    private final AgoraDto agora;
    private final HMSDto hms;
    private final String id;
    private final String provider;
    private final String type;

    public VideoCallInfoDto(String str, String str2, String str3, AgoraDto agoraDto, HMSDto hMSDto) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        agoraDto.getClass();
        hMSDto.getClass();
        this.id = str;
        this.provider = str2;
        this.type = str3;
        this.agora = agoraDto;
        this.hms = hMSDto;
    }

    public static /* synthetic */ VideoCallInfoDto copy$default(VideoCallInfoDto videoCallInfoDto, String str, String str2, String str3, AgoraDto agoraDto, HMSDto hMSDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoCallInfoDto.id;
        }
        if ((i & 2) != 0) {
            str2 = videoCallInfoDto.provider;
        }
        if ((i & 4) != 0) {
            str3 = videoCallInfoDto.type;
        }
        if ((i & 8) != 0) {
            agoraDto = videoCallInfoDto.agora;
        }
        if ((i & 16) != 0) {
            hMSDto = videoCallInfoDto.hms;
        }
        HMSDto hMSDto2 = hMSDto;
        String str4 = str3;
        return videoCallInfoDto.copy(str, str2, str4, agoraDto, hMSDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final AgoraDto getAgora() {
        return this.agora;
    }

    /* renamed from: component5, reason: from getter */
    public final HMSDto getHms() {
        return this.hms;
    }

    public final VideoCallInfoDto copy(String id, String provider, String type, AgoraDto agora, HMSDto hms) {
        id.getClass();
        provider.getClass();
        type.getClass();
        agora.getClass();
        hms.getClass();
        return new VideoCallInfoDto(id, provider, type, agora, hms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCallInfoDto)) {
            return false;
        }
        VideoCallInfoDto videoCallInfoDto = (VideoCallInfoDto) other;
        if (Intrinsics.areEqual(this.id, videoCallInfoDto.id) && Intrinsics.areEqual(this.provider, videoCallInfoDto.provider) && Intrinsics.areEqual(this.type, videoCallInfoDto.type) && Intrinsics.areEqual(this.agora, videoCallInfoDto.agora) && Intrinsics.areEqual(this.hms, videoCallInfoDto.hms)) {
            return true;
        }
        return false;
    }

    public final AgoraDto getAgora() {
        return this.agora;
    }

    public final HMSDto getHms() {
        return this.hms;
    }

    public final String getId() {
        return this.id;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.hms.hashCode() + ((this.agora.hashCode() + hdi.e(hdi.e(this.id.hashCode() * 31, 31, this.provider), 31, this.type)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.provider;
        String str3 = this.type;
        AgoraDto agoraDto = this.agora;
        HMSDto hMSDto = this.hms;
        StringBuilder r = m51.r("VideoCallInfoDto(id=", str, ", provider=", str2, ", type=");
        r.append(str3);
        r.append(", agora=");
        r.append(agoraDto);
        r.append(", hms=");
        r.append(hMSDto);
        r.append(")");
        return r.toString();
    }
}

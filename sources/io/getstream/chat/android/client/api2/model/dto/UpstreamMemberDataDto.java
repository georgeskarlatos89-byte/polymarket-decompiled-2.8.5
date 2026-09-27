package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDataDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "user_id", "", "extraData", "", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getUser_id", "()Ljava/lang/String;", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UpstreamMemberDataDto implements ExtraDataDto {
    private final Map<String, Object> extraData;
    private final String user_id;

    public UpstreamMemberDataDto(String str, Map<String, ? extends Object> map) {
        str.getClass();
        map.getClass();
        this.user_id = str;
        this.extraData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpstreamMemberDataDto copy$default(UpstreamMemberDataDto upstreamMemberDataDto, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upstreamMemberDataDto.user_id;
        }
        if ((i & 2) != 0) {
            map = upstreamMemberDataDto.extraData;
        }
        return upstreamMemberDataDto.copy(str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    public final Map<String, Object> component2() {
        return this.extraData;
    }

    public final UpstreamMemberDataDto copy(String user_id, Map<String, ? extends Object> extraData) {
        user_id.getClass();
        extraData.getClass();
        return new UpstreamMemberDataDto(user_id, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamMemberDataDto)) {
            return false;
        }
        UpstreamMemberDataDto upstreamMemberDataDto = (UpstreamMemberDataDto) other;
        if (Intrinsics.areEqual(this.user_id, upstreamMemberDataDto.user_id) && Intrinsics.areEqual(this.extraData, upstreamMemberDataDto.extraData)) {
            return true;
        }
        return false;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return this.extraData.hashCode() + (this.user_id.hashCode() * 31);
    }

    public String toString() {
        return "UpstreamMemberDataDto(user_id=" + this.user_id + ", extraData=" + this.extraData + ")";
    }
}

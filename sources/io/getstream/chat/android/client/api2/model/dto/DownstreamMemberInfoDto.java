package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zc7;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003JT\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "channel_role", "", "notifications_muted", "", "custom", "", "", "extraData", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)V", "getChannel_role", "()Ljava/lang/String;", "getNotifications_muted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCustom", "()Ljava/util/Map;", "getExtraData", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamMemberInfoDto implements ExtraDataDto {
    private final String channel_role;
    private final Map<String, Object> custom;
    private final Map<String, Object> extraData;
    private final Boolean notifications_muted;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DownstreamMemberInfoDto(String str, Boolean bool, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, map, map2);
        bool = (i & 2) != 0 ? null : bool;
        map = (i & 4) != 0 ? null : map;
        if ((i & 8) != 0) {
            map2 = zc7.a;
            map2.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownstreamMemberInfoDto copy$default(DownstreamMemberInfoDto downstreamMemberInfoDto, String str, Boolean bool, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downstreamMemberInfoDto.channel_role;
        }
        if ((i & 2) != 0) {
            bool = downstreamMemberInfoDto.notifications_muted;
        }
        if ((i & 4) != 0) {
            map = downstreamMemberInfoDto.custom;
        }
        if ((i & 8) != 0) {
            map2 = downstreamMemberInfoDto.extraData;
        }
        return downstreamMemberInfoDto.copy(str, bool, map, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannel_role() {
        return this.channel_role;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getNotifications_muted() {
        return this.notifications_muted;
    }

    public final Map<String, Object> component3() {
        return this.custom;
    }

    public final Map<String, Object> component4() {
        return this.extraData;
    }

    public final DownstreamMemberInfoDto copy(String channel_role, Boolean notifications_muted, Map<String, ? extends Object> custom, Map<String, ? extends Object> extraData) {
        extraData.getClass();
        return new DownstreamMemberInfoDto(channel_role, notifications_muted, custom, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamMemberInfoDto)) {
            return false;
        }
        DownstreamMemberInfoDto downstreamMemberInfoDto = (DownstreamMemberInfoDto) other;
        if (Intrinsics.areEqual(this.channel_role, downstreamMemberInfoDto.channel_role) && Intrinsics.areEqual(this.notifications_muted, downstreamMemberInfoDto.notifications_muted) && Intrinsics.areEqual(this.custom, downstreamMemberInfoDto.custom) && Intrinsics.areEqual(this.extraData, downstreamMemberInfoDto.extraData)) {
            return true;
        }
        return false;
    }

    public final String getChannel_role() {
        return this.channel_role;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final Boolean getNotifications_muted() {
        return this.notifications_muted;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.channel_role;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.notifications_muted;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map<String, Object> map = this.custom;
        if (map != null) {
            i = map.hashCode();
        }
        return this.extraData.hashCode() + ((i3 + i) * 31);
    }

    public String toString() {
        return "DownstreamMemberInfoDto(channel_role=" + this.channel_role + ", notifications_muted=" + this.notifications_muted + ", custom=" + this.custom + ", extraData=" + this.extraData + ")";
    }

    public DownstreamMemberInfoDto(String str, Boolean bool, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        map2.getClass();
        this.channel_role = str;
        this.notifications_muted = bool;
        this.custom = map;
        this.extraData = map2;
    }
}

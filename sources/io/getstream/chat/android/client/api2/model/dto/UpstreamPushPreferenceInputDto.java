package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamPushPreferenceInputDto;", "", "channel_cid", "", "chat_level", "disabled_until", "Ljava/util/Date;", "remove_disable", "", "chat_preferences", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamChatPreferencesDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/UpstreamChatPreferencesDto;)V", "getChannel_cid", "()Ljava/lang/String;", "getChat_level", "getDisabled_until", "()Ljava/util/Date;", "getRemove_disable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChat_preferences", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamChatPreferencesDto;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/UpstreamChatPreferencesDto;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamPushPreferenceInputDto;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UpstreamPushPreferenceInputDto {
    private final String channel_cid;
    private final String chat_level;
    private final UpstreamChatPreferencesDto chat_preferences;
    private final Date disabled_until;
    private final Boolean remove_disable;

    public /* synthetic */ UpstreamPushPreferenceInputDto(String str, String str2, Date date, Boolean bool, UpstreamChatPreferencesDto upstreamChatPreferencesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, date, bool, (i & 16) != 0 ? null : upstreamChatPreferencesDto);
    }

    public static /* synthetic */ UpstreamPushPreferenceInputDto copy$default(UpstreamPushPreferenceInputDto upstreamPushPreferenceInputDto, String str, String str2, Date date, Boolean bool, UpstreamChatPreferencesDto upstreamChatPreferencesDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upstreamPushPreferenceInputDto.channel_cid;
        }
        if ((i & 2) != 0) {
            str2 = upstreamPushPreferenceInputDto.chat_level;
        }
        if ((i & 4) != 0) {
            date = upstreamPushPreferenceInputDto.disabled_until;
        }
        if ((i & 8) != 0) {
            bool = upstreamPushPreferenceInputDto.remove_disable;
        }
        if ((i & 16) != 0) {
            upstreamChatPreferencesDto = upstreamPushPreferenceInputDto.chat_preferences;
        }
        UpstreamChatPreferencesDto upstreamChatPreferencesDto2 = upstreamChatPreferencesDto;
        Date date2 = date;
        return upstreamPushPreferenceInputDto.copy(str, str2, date2, bool, upstreamChatPreferencesDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChat_level() {
        return this.chat_level;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getDisabled_until() {
        return this.disabled_until;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getRemove_disable() {
        return this.remove_disable;
    }

    /* renamed from: component5, reason: from getter */
    public final UpstreamChatPreferencesDto getChat_preferences() {
        return this.chat_preferences;
    }

    public final UpstreamPushPreferenceInputDto copy(String channel_cid, String chat_level, Date disabled_until, Boolean remove_disable, UpstreamChatPreferencesDto chat_preferences) {
        return new UpstreamPushPreferenceInputDto(channel_cid, chat_level, disabled_until, remove_disable, chat_preferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamPushPreferenceInputDto)) {
            return false;
        }
        UpstreamPushPreferenceInputDto upstreamPushPreferenceInputDto = (UpstreamPushPreferenceInputDto) other;
        if (Intrinsics.areEqual(this.channel_cid, upstreamPushPreferenceInputDto.channel_cid) && Intrinsics.areEqual(this.chat_level, upstreamPushPreferenceInputDto.chat_level) && Intrinsics.areEqual(this.disabled_until, upstreamPushPreferenceInputDto.disabled_until) && Intrinsics.areEqual(this.remove_disable, upstreamPushPreferenceInputDto.remove_disable) && Intrinsics.areEqual(this.chat_preferences, upstreamPushPreferenceInputDto.chat_preferences)) {
            return true;
        }
        return false;
    }

    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final String getChat_level() {
        return this.chat_level;
    }

    public final UpstreamChatPreferencesDto getChat_preferences() {
        return this.chat_preferences;
    }

    public final Date getDisabled_until() {
        return this.disabled_until;
    }

    public final Boolean getRemove_disable() {
        return this.remove_disable;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.channel_cid;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.chat_level;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date = this.disabled_until;
        if (date == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool = this.remove_disable;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        UpstreamChatPreferencesDto upstreamChatPreferencesDto = this.chat_preferences;
        if (upstreamChatPreferencesDto != null) {
            i = upstreamChatPreferencesDto.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        String str = this.channel_cid;
        String str2 = this.chat_level;
        Date date = this.disabled_until;
        Boolean bool = this.remove_disable;
        UpstreamChatPreferencesDto upstreamChatPreferencesDto = this.chat_preferences;
        StringBuilder r = m51.r("UpstreamPushPreferenceInputDto(channel_cid=", str, ", chat_level=", str2, ", disabled_until=");
        r.append(date);
        r.append(", remove_disable=");
        r.append(bool);
        r.append(", chat_preferences=");
        r.append(upstreamChatPreferencesDto);
        r.append(")");
        return r.toString();
    }

    public UpstreamPushPreferenceInputDto(String str, String str2, Date date, Boolean bool, UpstreamChatPreferencesDto upstreamChatPreferencesDto) {
        this.channel_cid = str;
        this.chat_level = str2;
        this.disabled_until = date;
        this.remove_disable = bool;
        this.chat_preferences = upstreamChatPreferencesDto;
    }
}

package io.getstream.chat.android.client.api2.model.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "", "chat_level", "", "disabled_until", "Ljava/util/Date;", "chat_preferences", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChatPreferencesDto;", "<init>", "(Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChatPreferencesDto;)V", "getChat_level", "()Ljava/lang/String;", "getDisabled_until", "()Ljava/util/Date;", "getChat_preferences", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChatPreferencesDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamPushPreferenceDto {
    private final String chat_level;
    private final DownstreamChatPreferencesDto chat_preferences;
    private final Date disabled_until;

    public DownstreamPushPreferenceDto(String str, Date date, DownstreamChatPreferencesDto downstreamChatPreferencesDto) {
        this.chat_level = str;
        this.disabled_until = date;
        this.chat_preferences = downstreamChatPreferencesDto;
    }

    public static /* synthetic */ DownstreamPushPreferenceDto copy$default(DownstreamPushPreferenceDto downstreamPushPreferenceDto, String str, Date date, DownstreamChatPreferencesDto downstreamChatPreferencesDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downstreamPushPreferenceDto.chat_level;
        }
        if ((i & 2) != 0) {
            date = downstreamPushPreferenceDto.disabled_until;
        }
        if ((i & 4) != 0) {
            downstreamChatPreferencesDto = downstreamPushPreferenceDto.chat_preferences;
        }
        return downstreamPushPreferenceDto.copy(str, date, downstreamChatPreferencesDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChat_level() {
        return this.chat_level;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getDisabled_until() {
        return this.disabled_until;
    }

    /* renamed from: component3, reason: from getter */
    public final DownstreamChatPreferencesDto getChat_preferences() {
        return this.chat_preferences;
    }

    public final DownstreamPushPreferenceDto copy(String chat_level, Date disabled_until, DownstreamChatPreferencesDto chat_preferences) {
        return new DownstreamPushPreferenceDto(chat_level, disabled_until, chat_preferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamPushPreferenceDto)) {
            return false;
        }
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = (DownstreamPushPreferenceDto) other;
        if (Intrinsics.areEqual(this.chat_level, downstreamPushPreferenceDto.chat_level) && Intrinsics.areEqual(this.disabled_until, downstreamPushPreferenceDto.disabled_until) && Intrinsics.areEqual(this.chat_preferences, downstreamPushPreferenceDto.chat_preferences)) {
            return true;
        }
        return false;
    }

    public final String getChat_level() {
        return this.chat_level;
    }

    public final DownstreamChatPreferencesDto getChat_preferences() {
        return this.chat_preferences;
    }

    public final Date getDisabled_until() {
        return this.disabled_until;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.chat_level;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Date date = this.disabled_until;
        if (date == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        DownstreamChatPreferencesDto downstreamChatPreferencesDto = this.chat_preferences;
        if (downstreamChatPreferencesDto != null) {
            i = downstreamChatPreferencesDto.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.chat_level;
        Date date = this.disabled_until;
        DownstreamChatPreferencesDto downstreamChatPreferencesDto = this.chat_preferences;
        StringBuilder u = sv6.u("DownstreamPushPreferenceDto(chat_level=", str, ", disabled_until=", ", chat_preferences=", date);
        u.append(downstreamChatPreferencesDto);
        u.append(")");
        return u.toString();
    }

    public /* synthetic */ DownstreamPushPreferenceDto(String str, Date date, DownstreamChatPreferencesDto downstreamChatPreferencesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, (i & 4) != 0 ? null : downstreamChatPreferencesDto);
    }
}

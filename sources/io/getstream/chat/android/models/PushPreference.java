package io.getstream.chat.android.models;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/getstream/chat/android/models/PushPreference;", "", "level", "Lio/getstream/chat/android/models/PushPreferenceLevel;", "disabledUntil", "Ljava/util/Date;", "chatPreferences", "Lio/getstream/chat/android/models/ChatPreferences;", "<init>", "(Lio/getstream/chat/android/models/PushPreferenceLevel;Ljava/util/Date;Lio/getstream/chat/android/models/ChatPreferences;)V", "getLevel", "()Lio/getstream/chat/android/models/PushPreferenceLevel;", "getDisabledUntil", "()Ljava/util/Date;", "getChatPreferences", "()Lio/getstream/chat/android/models/ChatPreferences;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PushPreference {
    private final ChatPreferences chatPreferences;
    private final Date disabledUntil;
    private final PushPreferenceLevel level;

    public PushPreference(PushPreferenceLevel pushPreferenceLevel, Date date, ChatPreferences chatPreferences) {
        this.level = pushPreferenceLevel;
        this.disabledUntil = date;
        this.chatPreferences = chatPreferences;
    }

    public static /* synthetic */ PushPreference copy$default(PushPreference pushPreference, PushPreferenceLevel pushPreferenceLevel, Date date, ChatPreferences chatPreferences, int i, Object obj) {
        if ((i & 1) != 0) {
            pushPreferenceLevel = pushPreference.level;
        }
        if ((i & 2) != 0) {
            date = pushPreference.disabledUntil;
        }
        if ((i & 4) != 0) {
            chatPreferences = pushPreference.chatPreferences;
        }
        return pushPreference.copy(pushPreferenceLevel, date, chatPreferences);
    }

    /* renamed from: component1, reason: from getter */
    public final PushPreferenceLevel getLevel() {
        return this.level;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getDisabledUntil() {
        return this.disabledUntil;
    }

    /* renamed from: component3, reason: from getter */
    public final ChatPreferences getChatPreferences() {
        return this.chatPreferences;
    }

    public final PushPreference copy(PushPreferenceLevel level, Date disabledUntil, ChatPreferences chatPreferences) {
        return new PushPreference(level, disabledUntil, chatPreferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushPreference)) {
            return false;
        }
        PushPreference pushPreference = (PushPreference) other;
        if (Intrinsics.areEqual(this.level, pushPreference.level) && Intrinsics.areEqual(this.disabledUntil, pushPreference.disabledUntil) && Intrinsics.areEqual(this.chatPreferences, pushPreference.chatPreferences)) {
            return true;
        }
        return false;
    }

    public final ChatPreferences getChatPreferences() {
        return this.chatPreferences;
    }

    public final Date getDisabledUntil() {
        return this.disabledUntil;
    }

    public final PushPreferenceLevel getLevel() {
        return this.level;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        PushPreferenceLevel pushPreferenceLevel = this.level;
        int i = 0;
        if (pushPreferenceLevel == null) {
            hashCode = 0;
        } else {
            hashCode = pushPreferenceLevel.hashCode();
        }
        int i2 = hashCode * 31;
        Date date = this.disabledUntil;
        if (date == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ChatPreferences chatPreferences = this.chatPreferences;
        if (chatPreferences != null) {
            i = chatPreferences.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "PushPreference(level=" + this.level + ", disabledUntil=" + this.disabledUntil + ", chatPreferences=" + this.chatPreferences + ")";
    }

    public /* synthetic */ PushPreference(PushPreferenceLevel pushPreferenceLevel, Date date, ChatPreferences chatPreferences, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pushPreferenceLevel, date, (i & 4) != 0 ? null : chatPreferences);
    }
}

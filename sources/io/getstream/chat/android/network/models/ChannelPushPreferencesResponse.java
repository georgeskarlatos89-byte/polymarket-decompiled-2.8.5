package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import defpackage.zca;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/getstream/chat/android/network/models/ChannelPushPreferencesResponse;", "", "", "chatLevel", "Ljava/util/Date;", "disabledUntil", "Lio/getstream/chat/android/network/models/ChatPreferencesResponse;", "chatPreferences", "<init>", "(Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/network/models/ChatPreferencesResponse;)V", "copy", "(Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/network/models/ChatPreferencesResponse;)Lio/getstream/chat/android/network/models/ChannelPushPreferencesResponse;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ChannelPushPreferencesResponse {
    public final String a;
    public final Date b;
    public final ChatPreferencesResponse c;

    public /* synthetic */ ChannelPushPreferencesResponse(String str, Date date, ChatPreferencesResponse chatPreferencesResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : date, (i & 4) != 0 ? null : chatPreferencesResponse);
    }

    public final ChannelPushPreferencesResponse copy(@zca(name = "chat_level") String chatLevel, @zca(name = "disabled_until") Date disabledUntil, @zca(name = "chat_preferences") ChatPreferencesResponse chatPreferences) {
        return new ChannelPushPreferencesResponse(chatLevel, disabledUntil, chatPreferences);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelPushPreferencesResponse)) {
            return false;
        }
        ChannelPushPreferencesResponse channelPushPreferencesResponse = (ChannelPushPreferencesResponse) obj;
        if (Intrinsics.areEqual(this.a, channelPushPreferencesResponse.a) && Intrinsics.areEqual(this.b, channelPushPreferencesResponse.b) && Intrinsics.areEqual(this.c, channelPushPreferencesResponse.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Date date = this.b;
        if (date == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ChatPreferencesResponse chatPreferencesResponse = this.c;
        if (chatPreferencesResponse != null) {
            i = chatPreferencesResponse.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder u = sv6.u("ChannelPushPreferencesResponse(chatLevel=", this.a, ", disabledUntil=", ", chatPreferences=", this.b);
        u.append(this.c);
        u.append(")");
        return u.toString();
    }

    public ChannelPushPreferencesResponse(@zca(name = "chat_level") String str, @zca(name = "disabled_until") Date date, @zca(name = "chat_preferences") ChatPreferencesResponse chatPreferencesResponse) {
        this.a = str;
        this.b = date;
        this.c = chatPreferencesResponse;
    }
}

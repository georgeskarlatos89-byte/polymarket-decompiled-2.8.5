package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import defpackage.zca;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJX\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/getstream/chat/android/network/models/PushPreferencesResponse;", "", "", "callLevel", "chatLevel", "Ljava/util/Date;", "disabledUntil", "feedsLevel", "Lio/getstream/chat/android/network/models/ChatPreferencesResponse;", "chatPreferences", "Lio/getstream/chat/android/network/models/FeedsPreferencesResponse;", "feedsPreferences", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/network/models/ChatPreferencesResponse;Lio/getstream/chat/android/network/models/FeedsPreferencesResponse;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/network/models/ChatPreferencesResponse;Lio/getstream/chat/android/network/models/FeedsPreferencesResponse;)Lio/getstream/chat/android/network/models/PushPreferencesResponse;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class PushPreferencesResponse {
    public final String a;
    public final String b;
    public final Date c;
    public final String d;
    public final ChatPreferencesResponse e;
    public final FeedsPreferencesResponse f;

    public /* synthetic */ PushPreferencesResponse(String str, String str2, Date date, String str3, ChatPreferencesResponse chatPreferencesResponse, FeedsPreferencesResponse feedsPreferencesResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : chatPreferencesResponse, (i & 32) != 0 ? null : feedsPreferencesResponse);
    }

    public final PushPreferencesResponse copy(@zca(name = "call_level") String callLevel, @zca(name = "chat_level") String chatLevel, @zca(name = "disabled_until") Date disabledUntil, @zca(name = "feeds_level") String feedsLevel, @zca(name = "chat_preferences") ChatPreferencesResponse chatPreferences, @zca(name = "feeds_preferences") FeedsPreferencesResponse feedsPreferences) {
        return new PushPreferencesResponse(callLevel, chatLevel, disabledUntil, feedsLevel, chatPreferences, feedsPreferences);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushPreferencesResponse)) {
            return false;
        }
        PushPreferencesResponse pushPreferencesResponse = (PushPreferencesResponse) obj;
        if (Intrinsics.areEqual(this.a, pushPreferencesResponse.a) && Intrinsics.areEqual(this.b, pushPreferencesResponse.b) && Intrinsics.areEqual(this.c, pushPreferencesResponse.c) && Intrinsics.areEqual(this.d, pushPreferencesResponse.d) && Intrinsics.areEqual(this.e, pushPreferencesResponse.e) && Intrinsics.areEqual(this.f, pushPreferencesResponse.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date = this.c;
        if (date == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        ChatPreferencesResponse chatPreferencesResponse = this.e;
        if (chatPreferencesResponse == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = chatPreferencesResponse.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        FeedsPreferencesResponse feedsPreferencesResponse = this.f;
        if (feedsPreferencesResponse != null) {
            i = feedsPreferencesResponse.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("PushPreferencesResponse(callLevel=", this.a, ", chatLevel=", this.b, ", disabledUntil=");
        r.append(this.c);
        r.append(", feedsLevel=");
        r.append(this.d);
        r.append(", chatPreferences=");
        r.append(this.e);
        r.append(", feedsPreferences=");
        r.append(this.f);
        r.append(")");
        return r.toString();
    }

    public PushPreferencesResponse(@zca(name = "call_level") String str, @zca(name = "chat_level") String str2, @zca(name = "disabled_until") Date date, @zca(name = "feeds_level") String str3, @zca(name = "chat_preferences") ChatPreferencesResponse chatPreferencesResponse, @zca(name = "feeds_preferences") FeedsPreferencesResponse feedsPreferencesResponse) {
        this.a = str;
        this.b = str2;
        this.c = date;
        this.d = str3;
        this.e = chatPreferencesResponse;
        this.f = feedsPreferencesResponse;
    }
}

package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.woa;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJd\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/getstream/chat/android/network/models/ChatPreferencesResponse;", "", "", "channelMentions", "defaultPreference", "directMentions", "groupMentions", "hereMentions", "roleMentions", "threadReplies", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/network/models/ChatPreferencesResponse;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ChatPreferencesResponse {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ ChatPreferencesResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public final ChatPreferencesResponse copy(@zca(name = "channel_mentions") String channelMentions, @zca(name = "default_preference") String defaultPreference, @zca(name = "direct_mentions") String directMentions, @zca(name = "group_mentions") String groupMentions, @zca(name = "here_mentions") String hereMentions, @zca(name = "role_mentions") String roleMentions, @zca(name = "thread_replies") String threadReplies) {
        return new ChatPreferencesResponse(channelMentions, defaultPreference, directMentions, groupMentions, hereMentions, roleMentions, threadReplies);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatPreferencesResponse)) {
            return false;
        }
        ChatPreferencesResponse chatPreferencesResponse = (ChatPreferencesResponse) obj;
        if (Intrinsics.areEqual(this.a, chatPreferencesResponse.a) && Intrinsics.areEqual(this.b, chatPreferencesResponse.b) && Intrinsics.areEqual(this.c, chatPreferencesResponse.c) && Intrinsics.areEqual(this.d, chatPreferencesResponse.d) && Intrinsics.areEqual(this.e, chatPreferencesResponse.e) && Intrinsics.areEqual(this.f, chatPreferencesResponse.f) && Intrinsics.areEqual(this.g, chatPreferencesResponse.g)) {
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
        int hashCode6;
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
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.g;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("ChatPreferencesResponse(channelMentions=", this.a, ", defaultPreference=", this.b, ", directMentions=");
        k84.q(r, this.c, ", groupMentions=", this.d, ", hereMentions=");
        k84.q(r, this.e, ", roleMentions=", this.f, ", threadReplies=");
        return woa.r(r, this.g, ")");
    }

    public ChatPreferencesResponse(@zca(name = "channel_mentions") String str, @zca(name = "default_preference") String str2, @zca(name = "direct_mentions") String str3, @zca(name = "group_mentions") String str4, @zca(name = "here_mentions") String str5, @zca(name = "role_mentions") String str6, @zca(name = "thread_replies") String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }
}

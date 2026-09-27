package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.zc7;
import defpackage.zca;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0003\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ|\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\u0016\b\u0003\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/getstream/chat/android/network/models/FeedsPreferencesResponse;", "", "", "comment", "commentMention", "commentReaction", "commentReply", "follow", "mention", MetricTracker.Object.REACTION, "", "customActivityTypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/network/models/FeedsPreferencesResponse;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class FeedsPreferencesResponse {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeedsPreferencesResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, map);
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        str7 = (i & 64) != 0 ? null : str7;
        if ((i & 128) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final FeedsPreferencesResponse copy(@zca(name = "comment") String comment, @zca(name = "comment_mention") String commentMention, @zca(name = "comment_reaction") String commentReaction, @zca(name = "comment_reply") String commentReply, @zca(name = "follow") String follow, @zca(name = "mention") String mention, @zca(name = "reaction") String reaction, @zca(name = "custom_activity_types") Map<String, String> customActivityTypes) {
        return new FeedsPreferencesResponse(comment, commentMention, commentReaction, commentReply, follow, mention, reaction, customActivityTypes);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedsPreferencesResponse)) {
            return false;
        }
        FeedsPreferencesResponse feedsPreferencesResponse = (FeedsPreferencesResponse) obj;
        if (Intrinsics.areEqual(this.a, feedsPreferencesResponse.a) && Intrinsics.areEqual(this.b, feedsPreferencesResponse.b) && Intrinsics.areEqual(this.c, feedsPreferencesResponse.c) && Intrinsics.areEqual(this.d, feedsPreferencesResponse.d) && Intrinsics.areEqual(this.e, feedsPreferencesResponse.e) && Intrinsics.areEqual(this.f, feedsPreferencesResponse.f) && Intrinsics.areEqual(this.g, feedsPreferencesResponse.g) && Intrinsics.areEqual(this.h, feedsPreferencesResponse.h)) {
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
        int hashCode7;
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
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Map map = this.h;
        if (map != null) {
            i = map.hashCode();
        }
        return i8 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("FeedsPreferencesResponse(comment=", this.a, ", commentMention=", this.b, ", commentReaction=");
        k84.q(r, this.c, ", commentReply=", this.d, ", follow=");
        k84.q(r, this.e, ", mention=", this.f, ", reaction=");
        r.append(this.g);
        r.append(", customActivityTypes=");
        r.append(this.h);
        r.append(")");
        return r.toString();
    }

    public FeedsPreferencesResponse(@zca(name = "comment") String str, @zca(name = "comment_mention") String str2, @zca(name = "comment_reaction") String str3, @zca(name = "comment_reply") String str4, @zca(name = "follow") String str5, @zca(name = "mention") String str6, @zca(name = "reaction") String str7, @zca(name = "custom_activity_types") Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = map;
    }
}

package io.getstream.chat.android.network.models;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.mda;
import defpackage.vc5;
import defpackage.zc7;
import defpackage.zca;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\rB\u009d\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0018\b\u0003\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J¦\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0018\b\u0003\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/getstream/chat/android/network/models/CreatePollRequest;", "", "", Keys.KEY_NAME, "", "allowAnswers", "allowUserSuggestedOptions", "description", "enforceUniqueVote", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "isClosed", "", "maxVotesAllowed", "Lvc5;", "votingVisibility", "", "Lio/getstream/chat/android/network/models/PollOptionInput;", "options", "", "custom", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lvc5;Ljava/util/List;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lvc5;Ljava/util/List;Ljava/util/Map;)Lio/getstream/chat/android/network/models/CreatePollRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class CreatePollRequest {
    public final String a;
    public final Boolean b;
    public final Boolean c;
    public final String d;
    public final Boolean e;
    public final String f;
    public final Boolean g;
    public final Integer h;
    public final vc5 i;
    public final List j;
    public final Map k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CreatePollRequest(String str, Boolean bool, Boolean bool2, String str2, Boolean bool3, String str3, Boolean bool4, Integer num, vc5 vc5Var, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, bool2, str2, bool3, str3, bool4, num, vc5Var, list, map);
        bool = (i & 2) != 0 ? null : bool;
        bool2 = (i & 4) != 0 ? null : bool2;
        str2 = (i & 8) != 0 ? null : str2;
        bool3 = (i & 16) != 0 ? null : bool3;
        str3 = (i & 32) != 0 ? null : str3;
        bool4 = (i & 64) != 0 ? null : bool4;
        num = (i & 128) != 0 ? null : num;
        vc5Var = (i & 256) != 0 ? null : vc5Var;
        list = (i & Barcode.FORMAT_UPC_A) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final CreatePollRequest copy(@zca(name = "name") String name, @zca(name = "allow_answers") Boolean allowAnswers, @zca(name = "allow_user_suggested_options") Boolean allowUserSuggestedOptions, @zca(name = "description") String description, @zca(name = "enforce_unique_vote") Boolean enforceUniqueVote, @zca(name = "id") String id, @zca(name = "is_closed") Boolean isClosed, @zca(name = "max_votes_allowed") Integer maxVotesAllowed, @zca(name = "voting_visibility") vc5 votingVisibility, @zca(name = "options") List<PollOptionInput> options, @zca(name = "custom") Map<String, ? extends Object> custom) {
        name.getClass();
        return new CreatePollRequest(name, allowAnswers, allowUserSuggestedOptions, description, enforceUniqueVote, id, isClosed, maxVotesAllowed, votingVisibility, options, custom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePollRequest)) {
            return false;
        }
        CreatePollRequest createPollRequest = (CreatePollRequest) obj;
        if (Intrinsics.areEqual(this.a, createPollRequest.a) && Intrinsics.areEqual(this.b, createPollRequest.b) && Intrinsics.areEqual(this.c, createPollRequest.c) && Intrinsics.areEqual(this.d, createPollRequest.d) && Intrinsics.areEqual(this.e, createPollRequest.e) && Intrinsics.areEqual(this.f, createPollRequest.f) && Intrinsics.areEqual(this.g, createPollRequest.g) && Intrinsics.areEqual(this.h, createPollRequest.h) && Intrinsics.areEqual(this.i, createPollRequest.i) && Intrinsics.areEqual(this.j, createPollRequest.j) && Intrinsics.areEqual(this.k, createPollRequest.k)) {
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
        int hashCode8;
        int hashCode9;
        int hashCode10 = this.a.hashCode() * 31;
        int i = 0;
        Boolean bool = this.b;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode10 + hashCode) * 31;
        Boolean bool2 = this.c;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.d;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool3 = this.e;
        if (bool3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str2 = this.f;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Boolean bool4 = this.g;
        if (bool4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool4.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Integer num = this.h;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        vc5 vc5Var = this.i;
        if (vc5Var == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = vc5Var.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        List list = this.j;
        if (list == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Map map = this.k;
        if (map != null) {
            i = map.hashCode();
        }
        return i10 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreatePollRequest(name=");
        sb.append(this.a);
        sb.append(", allowAnswers=");
        sb.append(this.b);
        sb.append(", allowUserSuggestedOptions=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", enforceUniqueVote=");
        sb.append(this.e);
        sb.append(", id=");
        sb.append(this.f);
        sb.append(", isClosed=");
        sb.append(this.g);
        sb.append(", maxVotesAllowed=");
        sb.append(this.h);
        sb.append(", votingVisibility=");
        sb.append(this.i);
        sb.append(", options=");
        sb.append(this.j);
        sb.append(", custom=");
        return ace.n(sb, this.k, ")");
    }

    public CreatePollRequest(@zca(name = "name") String str, @zca(name = "allow_answers") Boolean bool, @zca(name = "allow_user_suggested_options") Boolean bool2, @zca(name = "description") String str2, @zca(name = "enforce_unique_vote") Boolean bool3, @zca(name = "id") String str3, @zca(name = "is_closed") Boolean bool4, @zca(name = "max_votes_allowed") Integer num, @zca(name = "voting_visibility") vc5 vc5Var, @zca(name = "options") List<PollOptionInput> list, @zca(name = "custom") Map<String, ? extends Object> map) {
        str.getClass();
        this.a = str;
        this.b = bool;
        this.c = bool2;
        this.d = str2;
        this.e = bool3;
        this.f = str3;
        this.g = bool4;
        this.h = num;
        this.i = vc5Var;
        this.j = list;
        this.k = map;
    }
}

package io.getstream.chat.android.network.models;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import defpackage.zc7;
import defpackage.zca;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001Bñ\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\u0016\b\u0003\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0003\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f¢\u0006\u0004\b\u001a\u0010\u001bJú\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\u00042\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0016\b\u0003\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0016\b\u0003\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/getstream/chat/android/network/models/UserResponse;", "", "", "banned", "Ljava/util/Date;", "createdAt", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, Keys.KEY_LANGUAGE, "online", "role", "updatedAt", "", "blockedUserIds", "teams", "", "custom", "", "avgResponseTime", "deactivatedAt", "deletedAt", "image", "lastActive", Keys.KEY_NAME, "revokeTokensIssuedBefore", "teamsRole", "<init>", "(ZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V", "copy", "(ZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/network/models/UserResponse;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UserResponse {
    public final boolean a;
    public final Date b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final Date g;
    public final List h;
    public final List i;
    public final Map j;
    public final Integer k;
    public final Date l;
    public final Date m;
    public final String n;
    public final Date o;
    public final String p;
    public final Date q;
    public final Map r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UserResponse(boolean z, Date date, String str, String str2, boolean z2, String str3, Date date2, List list, List list2, Map map, Integer num, Date date3, Date date4, String str4, Date date5, String str5, Date date6, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, date, str, str2, z2, str3, date2, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        List list3;
        List list4;
        Map map3;
        Integer num2;
        Date date7;
        Date date8;
        String str6;
        Date date9;
        String str7;
        Date date10;
        Map map4;
        if ((i & 128) != 0) {
            list3 = CollectionsKt.emptyList();
        } else {
            list3 = list;
        }
        if ((i & 256) != 0) {
            list4 = CollectionsKt.emptyList();
        } else {
            list4 = list2;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            map3 = zc7Var;
        } else {
            map3 = map;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 2048) != 0) {
            date7 = null;
        } else {
            date7 = date3;
        }
        if ((i & 4096) != 0) {
            date8 = null;
        } else {
            date8 = date4;
        }
        if ((i & 8192) != 0) {
            str6 = null;
        } else {
            str6 = str4;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            date9 = null;
        } else {
            date9 = date5;
        }
        if ((32768 & i) != 0) {
            str7 = null;
        } else {
            str7 = str5;
        }
        if ((65536 & i) != 0) {
            date10 = null;
        } else {
            date10 = date6;
        }
        if ((i & 131072) != 0) {
            zc7 zc7Var2 = zc7.a;
            zc7Var2.getClass();
            map4 = zc7Var2;
        } else {
            map4 = map2;
        }
    }

    public final UserResponse copy(@zca(name = "banned") boolean banned, @zca(name = "created_at") Date createdAt, @zca(name = "id") String id, @zca(name = "language") String language, @zca(name = "online") boolean online, @zca(name = "role") String role, @zca(name = "updated_at") Date updatedAt, @zca(name = "blocked_user_ids") List<String> blockedUserIds, @zca(name = "teams") List<String> teams, @zca(name = "custom") Map<String, ? extends Object> custom, @zca(name = "avg_response_time") Integer avgResponseTime, @zca(name = "deactivated_at") Date deactivatedAt, @zca(name = "deleted_at") Date deletedAt, @zca(name = "image") String image, @zca(name = "last_active") Date lastActive, @zca(name = "name") String name, @zca(name = "revoke_tokens_issued_before") Date revokeTokensIssuedBefore, @zca(name = "teams_role") Map<String, String> teamsRole) {
        createdAt.getClass();
        id.getClass();
        language.getClass();
        role.getClass();
        updatedAt.getClass();
        blockedUserIds.getClass();
        teams.getClass();
        custom.getClass();
        return new UserResponse(banned, createdAt, id, language, online, role, updatedAt, blockedUserIds, teams, custom, avgResponseTime, deactivatedAt, deletedAt, image, lastActive, name, revokeTokensIssuedBefore, teamsRole);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserResponse)) {
            return false;
        }
        UserResponse userResponse = (UserResponse) obj;
        if (this.a == userResponse.a && Intrinsics.areEqual(this.b, userResponse.b) && Intrinsics.areEqual(this.c, userResponse.c) && Intrinsics.areEqual(this.d, userResponse.d) && this.e == userResponse.e && Intrinsics.areEqual(this.f, userResponse.f) && Intrinsics.areEqual(this.g, userResponse.g) && Intrinsics.areEqual(this.h, userResponse.h) && Intrinsics.areEqual(this.i, userResponse.i) && Intrinsics.areEqual(this.j, userResponse.j) && Intrinsics.areEqual(this.k, userResponse.k) && Intrinsics.areEqual(this.l, userResponse.l) && Intrinsics.areEqual(this.m, userResponse.m) && Intrinsics.areEqual(this.n, userResponse.n) && Intrinsics.areEqual(this.o, userResponse.o) && Intrinsics.areEqual(this.p, userResponse.p) && Intrinsics.areEqual(this.q, userResponse.q) && Intrinsics.areEqual(this.r, userResponse.r)) {
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
        int c = sv6.c(this.j, hdi.f(hdi.f(woa.f(this.g, hdi.e(hdi.g(hdi.e(hdi.e(woa.f(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31);
        int i = 0;
        Integer num = this.k;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        Date date = this.l;
        if (date == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date2 = this.m;
        if (date2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str = this.n;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Date date3 = this.o;
        if (date3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date3.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str2 = this.p;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Date date4 = this.q;
        if (date4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = date4.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Map map = this.r;
        if (map != null) {
            i = map.hashCode();
        }
        return i8 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserResponse(banned=");
        sb.append(this.a);
        sb.append(", createdAt=");
        sb.append(this.b);
        sb.append(", id=");
        k84.q(sb, this.c, ", language=", this.d, ", online=");
        m51.y(", role=", this.f, ", updatedAt=", sb, this.e);
        sb.append(this.g);
        sb.append(", blockedUserIds=");
        sb.append(this.h);
        sb.append(", teams=");
        sb.append(this.i);
        sb.append(", custom=");
        sb.append(this.j);
        sb.append(", avgResponseTime=");
        sb.append(this.k);
        sb.append(", deactivatedAt=");
        sb.append(this.l);
        sb.append(", deletedAt=");
        sb.append(this.m);
        sb.append(", image=");
        sb.append(this.n);
        sb.append(", lastActive=");
        sb.append(this.o);
        sb.append(", name=");
        sb.append(this.p);
        sb.append(", revokeTokensIssuedBefore=");
        sb.append(this.q);
        sb.append(", teamsRole=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }

    public UserResponse(@zca(name = "banned") boolean z, @zca(name = "created_at") Date date, @zca(name = "id") String str, @zca(name = "language") String str2, @zca(name = "online") boolean z2, @zca(name = "role") String str3, @zca(name = "updated_at") Date date2, @zca(name = "blocked_user_ids") List<String> list, @zca(name = "teams") List<String> list2, @zca(name = "custom") Map<String, ? extends Object> map, @zca(name = "avg_response_time") Integer num, @zca(name = "deactivated_at") Date date3, @zca(name = "deleted_at") Date date4, @zca(name = "image") String str4, @zca(name = "last_active") Date date5, @zca(name = "name") String str5, @zca(name = "revoke_tokens_issued_before") Date date6, @zca(name = "teams_role") Map<String, String> map2) {
        date.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        date2.getClass();
        list.getClass();
        list2.getClass();
        map.getClass();
        this.a = z;
        this.b = date;
        this.c = str;
        this.d = str2;
        this.e = z2;
        this.f = str3;
        this.g = date2;
        this.h = list;
        this.i = list2;
        this.j = map;
        this.k = num;
        this.l = date3;
        this.m = date4;
        this.n = str4;
        this.o = date5;
        this.p = str5;
        this.q = date6;
        this.r = map2;
    }
}

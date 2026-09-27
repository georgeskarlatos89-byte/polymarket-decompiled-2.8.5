package io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
import defpackage.zc7;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;", "", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class MemberEntity {
    public final String a;
    public final String b;
    public final Date c;
    public final Date d;
    public final boolean e;
    public final Date f;
    public final Date g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final Boolean k;
    public final String l;
    public final Date m;
    public final Date n;
    public final Date o;
    public final Map p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MemberEntity(String str, String str2, Date date, Date date2, boolean z, Date date3, Date date4, boolean z2, boolean z3, String str3, Boolean bool, String str4, Date date5, Date date6, Date date7, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r1, r2, r4, r5, r7, r8, r9, r6, r10, r11, r12, r13, r14, r3, r34);
        String str5;
        Date date8;
        Date date9;
        boolean z4;
        Date date10;
        Date date11;
        boolean z5;
        String str6;
        Boolean bool2;
        String str7;
        Date date12;
        Date date13;
        Map map2;
        if ((i & 2) != 0) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            date8 = null;
        } else {
            date8 = date;
        }
        if ((i & 8) != 0) {
            date9 = null;
        } else {
            date9 = date2;
        }
        if ((i & 16) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 32) != 0) {
            date10 = null;
        } else {
            date10 = date3;
        }
        if ((i & 64) != 0) {
            date11 = null;
        } else {
            date11 = date4;
        }
        if ((i & 128) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        boolean z6 = (i & 256) == 0 ? z3 : false;
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i & 2048) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 4096) != 0) {
            date12 = null;
        } else {
            date12 = date5;
        }
        if ((i & 8192) != 0) {
            date13 = null;
        } else {
            date13 = date6;
        }
        Date date14 = (i & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? date7 : null;
        if ((i & 32768) != 0) {
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            map2 = zc7Var;
        } else {
            map2 = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemberEntity)) {
            return false;
        }
        MemberEntity memberEntity = (MemberEntity) obj;
        if (Intrinsics.areEqual(this.a, memberEntity.a) && Intrinsics.areEqual(this.b, memberEntity.b) && Intrinsics.areEqual(this.c, memberEntity.c) && Intrinsics.areEqual(this.d, memberEntity.d) && this.e == memberEntity.e && Intrinsics.areEqual(this.f, memberEntity.f) && Intrinsics.areEqual(this.g, memberEntity.g) && this.h == memberEntity.h && this.i == memberEntity.i && Intrinsics.areEqual(this.j, memberEntity.j) && Intrinsics.areEqual(this.k, memberEntity.k) && Intrinsics.areEqual(this.l, memberEntity.l) && Intrinsics.areEqual(this.m, memberEntity.m) && Intrinsics.areEqual(this.n, memberEntity.n) && Intrinsics.areEqual(this.o, memberEntity.o) && Intrinsics.areEqual(this.p, memberEntity.p)) {
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
        int e = hdi.e(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        Date date = this.c;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        Date date2 = this.d;
        if (date2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date2.hashCode();
        }
        int g = hdi.g((i2 + hashCode2) * 31, 31, this.e);
        Date date3 = this.f;
        if (date3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date3.hashCode();
        }
        int i3 = (g + hashCode3) * 31;
        Date date4 = this.g;
        if (date4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date4.hashCode();
        }
        int g2 = hdi.g(hdi.g((i3 + hashCode4) * 31, 31, this.h), 31, this.i);
        String str = this.j;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i4 = (g2 + hashCode5) * 31;
        Boolean bool = this.k;
        if (bool == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool.hashCode();
        }
        int i5 = (i4 + hashCode6) * 31;
        String str2 = this.l;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int i6 = (i5 + hashCode7) * 31;
        Date date5 = this.m;
        if (date5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = date5.hashCode();
        }
        int i7 = (i6 + hashCode8) * 31;
        Date date6 = this.n;
        if (date6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = date6.hashCode();
        }
        int i8 = (i7 + hashCode9) * 31;
        Date date7 = this.o;
        if (date7 != null) {
            i = date7.hashCode();
        }
        return this.p.hashCode() + ((i8 + i) * 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("MemberEntity(userId=", this.a, ", role=", this.b, ", createdAt=");
        sv6.B(r, this.c, ", updatedAt=", this.d, ", isInvited=");
        r.append(this.e);
        r.append(", inviteAcceptedAt=");
        r.append(this.f);
        r.append(", inviteRejectedAt=");
        r.append(this.g);
        r.append(", shadowBanned=");
        r.append(this.h);
        r.append(", banned=");
        m51.y(", channelRole=", this.j, ", notificationsMuted=", r, this.i);
        r.append(this.k);
        r.append(", status=");
        r.append(this.l);
        r.append(", banExpires=");
        sv6.B(r, this.m, ", pinnedAt=", this.n, ", archivedAt=");
        r.append(this.o);
        r.append(", extraData=");
        r.append(this.p);
        r.append(")");
        return r.toString();
    }

    public MemberEntity(String str, String str2, Date date, Date date2, boolean z, Date date3, Date date4, boolean z2, boolean z3, String str3, Boolean bool, String str4, Date date5, Date date6, Date date7, Map map) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = date;
        this.d = date2;
        this.e = z;
        this.f = date3;
        this.g = date4;
        this.h = z2;
        this.i = z3;
        this.j = str3;
        this.k = bool;
        this.l = str4;
        this.m = date5;
        this.n = date6;
        this.o = date7;
        this.p = map;
    }
}

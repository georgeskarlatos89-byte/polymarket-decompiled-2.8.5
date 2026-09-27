package defpackage;

import io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal.MemberEntity;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zf3 {
    public final Set A;
    public final MemberEntity B;
    public final List C;
    public final Integer D;
    public String E;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final Boolean j;
    public final Boolean k;
    public final Date l;
    public final Date m;
    public final Map n;
    public final int o;
    public final List p;
    public final int q;
    public final Map r;
    public final Date s;
    public final String t;
    public final Date u;
    public final Date v;
    public final Date w;
    public final Map x;
    public final SyncStatus y;
    public final String z;

    public zf3(String str, String str2, String str3, String str4, int i, String str5, List list, boolean z, boolean z2, Boolean bool, Boolean bool2, Date date, Date date2, Map map, int i2, List list2, int i3, Map map2, Date date3, String str6, Date date4, Date date5, Date date6, Map map3, SyncStatus syncStatus, String str7, Set set, MemberEntity memberEntity, List list3, Integer num) {
        k84.p(str, str2, str3, str4, str5);
        list.getClass();
        map3.getClass();
        syncStatus.getClass();
        str7.getClass();
        set.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = list;
        this.h = z;
        this.i = z2;
        this.j = bool;
        this.k = bool2;
        this.l = date;
        this.m = date2;
        this.n = map;
        this.o = i2;
        this.p = list2;
        this.q = i3;
        this.r = map2;
        this.s = date3;
        this.t = str6;
        this.u = date4;
        this.v = date5;
        this.w = date6;
        this.x = map3;
        this.y = syncStatus;
        this.z = str7;
        this.A = set;
        this.B = memberEntity;
        this.C = list3;
        this.D = num;
        this.E = String.format("%s:%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zf3) {
                zf3 zf3Var = (zf3) obj;
                if (!Intrinsics.areEqual(this.a, zf3Var.a) || !Intrinsics.areEqual(this.b, zf3Var.b) || !Intrinsics.areEqual(this.c, zf3Var.c) || !Intrinsics.areEqual(this.d, zf3Var.d) || this.e != zf3Var.e || !Intrinsics.areEqual(this.f, zf3Var.f) || !Intrinsics.areEqual(this.g, zf3Var.g) || this.h != zf3Var.h || this.i != zf3Var.i || !Intrinsics.areEqual(this.j, zf3Var.j) || !Intrinsics.areEqual(this.k, zf3Var.k) || !Intrinsics.areEqual(this.l, zf3Var.l) || !Intrinsics.areEqual(this.m, zf3Var.m) || !Intrinsics.areEqual(this.n, zf3Var.n) || this.o != zf3Var.o || !Intrinsics.areEqual(this.p, zf3Var.p) || this.q != zf3Var.q || !Intrinsics.areEqual(this.r, zf3Var.r) || !Intrinsics.areEqual(this.s, zf3Var.s) || !Intrinsics.areEqual(this.t, zf3Var.t) || !Intrinsics.areEqual(this.u, zf3Var.u) || !Intrinsics.areEqual(this.v, zf3Var.v) || !Intrinsics.areEqual(this.w, zf3Var.w) || !Intrinsics.areEqual(this.x, zf3Var.x) || this.y != zf3Var.y || !Intrinsics.areEqual(this.z, zf3Var.z) || !Intrinsics.areEqual(this.A, zf3Var.A) || !Intrinsics.areEqual(this.B, zf3Var.B) || !Intrinsics.areEqual(this.C, zf3Var.C) || !Intrinsics.areEqual(this.D, zf3Var.D)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
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
        int hashCode10;
        int g = hdi.g(hdi.g(hdi.f(hdi.e(woa.b(this.e, hdi.e(hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        int i = 0;
        Boolean bool = this.j;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (g + hashCode) * 31;
        Boolean bool2 = this.k;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date = this.l;
        if (date == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Date date2 = this.m;
        if (date2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date2.hashCode();
        }
        int c = sv6.c(this.r, woa.b(this.q, hdi.f(woa.b(this.o, sv6.c(this.n, (i4 + hashCode4) * 31, 31), 31), 31, this.p), 31), 31);
        Date date3 = this.s;
        if (date3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date3.hashCode();
        }
        int i5 = (c + hashCode5) * 31;
        String str = this.t;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        Date date4 = this.u;
        if (date4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = date4.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        Date date5 = this.v;
        if (date5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = date5.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        Date date6 = this.w;
        if (date6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = date6.hashCode();
        }
        int d = sv6.d(this.A, hdi.e((this.y.hashCode() + sv6.c(this.x, (i8 + hashCode9) * 31, 31)) * 31, 31, this.z), 31);
        MemberEntity memberEntity = this.B;
        if (memberEntity == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = memberEntity.hashCode();
        }
        int f = hdi.f((d + hashCode10) * 31, 31, this.C);
        Integer num = this.D;
        if (num != null) {
            i = num.hashCode();
        }
        return f + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("ChannelEntity(type=", this.a, ", channelId=", this.b, ", name=");
        k84.q(r, this.c, ", image=", this.d, ", cooldown=");
        woa.u(this.e, ", createdByUserId=", this.f, ", filterTags=", r);
        r.append(this.g);
        r.append(", frozen=");
        r.append(this.h);
        r.append(", disabled=");
        r.append(this.i);
        r.append(", blocked=");
        r.append(this.j);
        r.append(", hidden=");
        r.append(this.k);
        r.append(", hideMessagesBefore=");
        r.append(this.l);
        r.append(", truncatedAt=");
        r.append(this.m);
        r.append(", members=");
        r.append(this.n);
        r.append(", memberCount=");
        r.append(this.o);
        r.append(", watcherIds=");
        r.append(this.p);
        r.append(", watcherCount=");
        r.append(this.q);
        r.append(", reads=");
        r.append(this.r);
        r.append(", lastMessageAt=");
        r.append(this.s);
        r.append(", lastMessageId=");
        r.append(this.t);
        r.append(", createdAt=");
        sv6.B(r, this.u, ", updatedAt=", this.v, ", deletedAt=");
        r.append(this.w);
        r.append(", extraData=");
        r.append(this.x);
        r.append(", syncStatus=");
        r.append(this.y);
        r.append(", team=");
        r.append(this.z);
        r.append(", ownCapabilities=");
        r.append(this.A);
        r.append(", membership=");
        r.append(this.B);
        r.append(", activeLiveLocations=");
        r.append(this.C);
        r.append(", messageCount=");
        r.append(this.D);
        r.append(")");
        return r.toString();
    }
}

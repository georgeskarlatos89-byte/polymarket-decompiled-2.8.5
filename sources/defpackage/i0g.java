package defpackage;

import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MemberInfoEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ModerationDetailsEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReminderInfoEntity;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class i0g {
    public final boolean A;
    public final Map B;
    public final boolean C;
    public final Date D;
    public final Date E;
    public final String F;
    public final List G;
    public final ModerationDetailsEntity H;
    public final Date I;
    public final String J;
    public final List K;
    public final ReminderInfoEntity L;
    public final MemberInfoEntity M;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final SyncStatus g;
    public final int h;
    public final int i;
    public final Date j;
    public final Date k;
    public final Date l;
    public final Date m;
    public final Date n;
    public final List o;
    public final List p;
    public final boolean q;
    public final boolean r;
    public final List s;
    public final List t;
    public final String u;
    public final String v;
    public final boolean w;
    public final Map x;
    public final boolean y;
    public final mg3 z;

    public i0g(String str, String str2, String str3, String str4, String str5, String str6, SyncStatus syncStatus, int i, int i2, Date date, Date date2, Date date3, Date date4, Date date5, List list, List list2, boolean z, boolean z2, List list3, List list4, String str7, String str8, boolean z3, Map map, boolean z4, mg3 mg3Var, boolean z5, Map map2, boolean z6, Date date6, Date date7, String str9, List list5, ModerationDetailsEntity moderationDetailsEntity, Date date8, String str10, List list6, ReminderInfoEntity reminderInfoEntity, MemberInfoEntity memberInfoEntity) {
        k84.p(str, str2, str3, str4, str5);
        str6.getClass();
        syncStatus.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        map.getClass();
        map2.getClass();
        list6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = syncStatus;
        this.h = i;
        this.i = i2;
        this.j = date;
        this.k = date2;
        this.l = date3;
        this.m = date4;
        this.n = date5;
        this.o = list;
        this.p = list2;
        this.q = z;
        this.r = z2;
        this.s = list3;
        this.t = list4;
        this.u = str7;
        this.v = str8;
        this.w = z3;
        this.x = map;
        this.y = z4;
        this.z = mg3Var;
        this.A = z5;
        this.B = map2;
        this.C = z6;
        this.D = date6;
        this.E = date7;
        this.F = str9;
        this.G = list5;
        this.H = moderationDetailsEntity;
        this.I = date8;
        this.J = str10;
        this.K = list6;
        this.L = reminderInfoEntity;
        this.M = memberInfoEntity;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i0g) {
                i0g i0gVar = (i0g) obj;
                if (!Intrinsics.areEqual(this.a, i0gVar.a) || !Intrinsics.areEqual(this.b, i0gVar.b) || !Intrinsics.areEqual(this.c, i0gVar.c) || !Intrinsics.areEqual(this.d, i0gVar.d) || !Intrinsics.areEqual(this.e, i0gVar.e) || !Intrinsics.areEqual(this.f, i0gVar.f) || this.g != i0gVar.g || this.h != i0gVar.h || this.i != i0gVar.i || !Intrinsics.areEqual(this.j, i0gVar.j) || !Intrinsics.areEqual(this.k, i0gVar.k) || !Intrinsics.areEqual(this.l, i0gVar.l) || !Intrinsics.areEqual(this.m, i0gVar.m) || !Intrinsics.areEqual(this.n, i0gVar.n) || !Intrinsics.areEqual(this.o, i0gVar.o) || !Intrinsics.areEqual(this.p, i0gVar.p) || this.q != i0gVar.q || this.r != i0gVar.r || !Intrinsics.areEqual(this.s, i0gVar.s) || !Intrinsics.areEqual(this.t, i0gVar.t) || !Intrinsics.areEqual(this.u, i0gVar.u) || !Intrinsics.areEqual(this.v, i0gVar.v) || this.w != i0gVar.w || !Intrinsics.areEqual(this.x, i0gVar.x) || this.y != i0gVar.y || !Intrinsics.areEqual(this.z, i0gVar.z) || this.A != i0gVar.A || !Intrinsics.areEqual(this.B, i0gVar.B) || this.C != i0gVar.C || !Intrinsics.areEqual(this.D, i0gVar.D) || !Intrinsics.areEqual(this.E, i0gVar.E) || !Intrinsics.areEqual(this.F, i0gVar.F) || !Intrinsics.areEqual(this.G, i0gVar.G) || !Intrinsics.areEqual(this.H, i0gVar.H) || !Intrinsics.areEqual(this.I, i0gVar.I) || !Intrinsics.areEqual(this.J, i0gVar.J) || !Intrinsics.areEqual(this.K, i0gVar.K) || !Intrinsics.areEqual(this.L, i0gVar.L) || !Intrinsics.areEqual(this.M, i0gVar.M)) {
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
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int b = woa.b(this.i, woa.b(this.h, (this.g.hashCode() + hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31), 31);
        int i = 0;
        Date date = this.j;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        Date date2 = this.k;
        if (date2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date3 = this.l;
        if (date3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Date date4 = this.m;
        if (date4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Date date5 = this.n;
        if (date5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date5.hashCode();
        }
        int f = hdi.f(hdi.f(hdi.g(hdi.g(hdi.f(hdi.f((i5 + hashCode5) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
        String str = this.u;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i6 = (f + hashCode6) * 31;
        String str2 = this.v;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int g = hdi.g(sv6.c(this.x, hdi.g((i6 + hashCode7) * 31, 31, this.w), 31), 31, this.y);
        mg3 mg3Var = this.z;
        if (mg3Var == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = mg3Var.hashCode();
        }
        int g2 = hdi.g(sv6.c(this.B, hdi.g((g + hashCode8) * 31, 31, this.A), 31), 31, this.C);
        Date date6 = this.D;
        if (date6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = date6.hashCode();
        }
        int i7 = (g2 + hashCode9) * 31;
        Date date7 = this.E;
        if (date7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = date7.hashCode();
        }
        int i8 = (i7 + hashCode10) * 31;
        String str3 = this.F;
        if (str3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str3.hashCode();
        }
        int f2 = hdi.f((i8 + hashCode11) * 31, 31, this.G);
        ModerationDetailsEntity moderationDetailsEntity = this.H;
        if (moderationDetailsEntity == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = moderationDetailsEntity.hashCode();
        }
        int i9 = (f2 + hashCode12) * 31;
        Date date8 = this.I;
        if (date8 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = date8.hashCode();
        }
        int i10 = (i9 + hashCode13) * 31;
        String str4 = this.J;
        if (str4 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str4.hashCode();
        }
        int f3 = hdi.f((i10 + hashCode14) * 31, 31, this.K);
        ReminderInfoEntity reminderInfoEntity = this.L;
        if (reminderInfoEntity == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = reminderInfoEntity.hashCode();
        }
        int i11 = (f3 + hashCode15) * 31;
        MemberInfoEntity memberInfoEntity = this.M;
        if (memberInfoEntity != null) {
            i = memberInfoEntity.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("ReplyMessageInnerEntity(id=", this.a, ", cid=", this.b, ", userId=");
        k84.q(r, this.c, ", text=", this.d, ", html=");
        k84.q(r, this.e, ", type=", this.f, ", syncStatus=");
        r.append(this.g);
        r.append(", replyCount=");
        r.append(this.h);
        r.append(", deletedReplyCount=");
        r.append(this.i);
        r.append(", createdAt=");
        r.append(this.j);
        r.append(", createdLocallyAt=");
        sv6.B(r, this.k, ", updatedAt=", this.l, ", updatedLocallyAt=");
        sv6.B(r, this.m, ", deletedAt=", this.n, ", remoteMentionedUserIds=");
        ace.D(r, this.o, ", mentionedUsersId=", this.p, ", mentionedHere=");
        hdi.B(r, this.q, ", mentionedChannel=", this.r, ", mentionedGroups=");
        ace.D(r, this.s, ", mentionedRoles=", this.t, ", parentId=");
        k84.q(r, this.u, ", command=", this.v, ", shadowed=");
        r.append(this.w);
        r.append(", i18n=");
        r.append(this.x);
        r.append(", showInChannel=");
        r.append(this.y);
        r.append(", channelInfo=");
        r.append(this.z);
        r.append(", silent=");
        r.append(this.A);
        r.append(", extraData=");
        r.append(this.B);
        r.append(", pinned=");
        r.append(this.C);
        r.append(", pinnedAt=");
        r.append(this.D);
        r.append(", pinExpires=");
        r.append(this.E);
        r.append(", pinnedByUserId=");
        r.append(this.F);
        r.append(", threadParticipantsIds=");
        r.append(this.G);
        r.append(", moderationDetails=");
        r.append(this.H);
        r.append(", messageTextUpdatedAt=");
        r.append(this.I);
        r.append(", pollId=");
        r.append(this.J);
        r.append(", restrictedVisibility=");
        r.append(this.K);
        r.append(", reminder=");
        r.append(this.L);
        r.append(", member=");
        r.append(this.M);
        r.append(")");
        return r.toString();
    }
}

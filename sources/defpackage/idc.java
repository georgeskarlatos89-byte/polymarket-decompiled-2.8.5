package defpackage;

import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.LocationEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MemberInfoEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ModerationDetailsEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ModerationEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReminderInfoEntity;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class idc {
    public final Map A;
    public final boolean B;
    public final mg3 C;
    public final boolean D;
    public final Map E;
    public final String F;
    public final boolean G;
    public final Date H;
    public final Date I;
    public final String J;
    public final List K;
    public final boolean L;
    public final boolean M;
    public final ModerationDetailsEntity N;
    public final ModerationEntity O;
    public final Date P;
    public final String Q;
    public final List R;
    public final ReminderInfoEntity S;
    public final LocationEntity T;
    public final MemberInfoEntity U;
    public final boolean V;
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
    public final Map u;
    public final Map v;
    public final Map w;
    public final String x;
    public final String y;
    public final boolean z;

    public idc(String str, String str2, String str3, String str4, String str5, String str6, SyncStatus syncStatus, int i, int i2, Date date, Date date2, Date date3, Date date4, Date date5, List list, List list2, boolean z, boolean z2, List list3, List list4, Map map, Map map2, Map map3, String str7, String str8, boolean z3, Map map4, boolean z4, mg3 mg3Var, boolean z5, Map map5, String str9, boolean z6, Date date6, Date date7, String str10, List list5, boolean z7, boolean z8, ModerationDetailsEntity moderationDetailsEntity, ModerationEntity moderationEntity, Date date8, String str11, List list6, ReminderInfoEntity reminderInfoEntity, LocationEntity locationEntity, MemberInfoEntity memberInfoEntity, boolean z9) {
        k84.p(str, str2, str3, str4, str5);
        str6.getClass();
        syncStatus.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        map.getClass();
        map2.getClass();
        map4.getClass();
        map5.getClass();
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
        this.u = map;
        this.v = map2;
        this.w = map3;
        this.x = str7;
        this.y = str8;
        this.z = z3;
        this.A = map4;
        this.B = z4;
        this.C = mg3Var;
        this.D = z5;
        this.E = map5;
        this.F = str9;
        this.G = z6;
        this.H = date6;
        this.I = date7;
        this.J = str10;
        this.K = list5;
        this.L = z7;
        this.M = z8;
        this.N = moderationDetailsEntity;
        this.O = moderationEntity;
        this.P = date8;
        this.Q = str11;
        this.R = list6;
        this.S = reminderInfoEntity;
        this.T = locationEntity;
        this.U = memberInfoEntity;
        this.V = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof idc) {
                idc idcVar = (idc) obj;
                if (!Intrinsics.areEqual(this.a, idcVar.a) || !Intrinsics.areEqual(this.b, idcVar.b) || !Intrinsics.areEqual(this.c, idcVar.c) || !Intrinsics.areEqual(this.d, idcVar.d) || !Intrinsics.areEqual(this.e, idcVar.e) || !Intrinsics.areEqual(this.f, idcVar.f) || this.g != idcVar.g || this.h != idcVar.h || this.i != idcVar.i || !Intrinsics.areEqual(this.j, idcVar.j) || !Intrinsics.areEqual(this.k, idcVar.k) || !Intrinsics.areEqual(this.l, idcVar.l) || !Intrinsics.areEqual(this.m, idcVar.m) || !Intrinsics.areEqual(this.n, idcVar.n) || !Intrinsics.areEqual(this.o, idcVar.o) || !Intrinsics.areEqual(this.p, idcVar.p) || this.q != idcVar.q || this.r != idcVar.r || !Intrinsics.areEqual(this.s, idcVar.s) || !Intrinsics.areEqual(this.t, idcVar.t) || !Intrinsics.areEqual(this.u, idcVar.u) || !Intrinsics.areEqual(this.v, idcVar.v) || !Intrinsics.areEqual(this.w, idcVar.w) || !Intrinsics.areEqual(this.x, idcVar.x) || !Intrinsics.areEqual(this.y, idcVar.y) || this.z != idcVar.z || !Intrinsics.areEqual(this.A, idcVar.A) || this.B != idcVar.B || !Intrinsics.areEqual(this.C, idcVar.C) || this.D != idcVar.D || !Intrinsics.areEqual(this.E, idcVar.E) || !Intrinsics.areEqual(this.F, idcVar.F) || this.G != idcVar.G || !Intrinsics.areEqual(this.H, idcVar.H) || !Intrinsics.areEqual(this.I, idcVar.I) || !Intrinsics.areEqual(this.J, idcVar.J) || !Intrinsics.areEqual(this.K, idcVar.K) || this.L != idcVar.L || this.M != idcVar.M || !Intrinsics.areEqual(this.N, idcVar.N) || !Intrinsics.areEqual(this.O, idcVar.O) || !Intrinsics.areEqual(this.P, idcVar.P) || !Intrinsics.areEqual(this.Q, idcVar.Q) || !Intrinsics.areEqual(this.R, idcVar.R) || !Intrinsics.areEqual(this.S, idcVar.S) || !Intrinsics.areEqual(this.T, idcVar.T) || !Intrinsics.areEqual(this.U, idcVar.U) || this.V != idcVar.V) {
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
        int hashCode16;
        int hashCode17;
        int hashCode18;
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
        int c = sv6.c(this.w, sv6.c(this.v, sv6.c(this.u, hdi.f(hdi.f(hdi.g(hdi.g(hdi.f(hdi.f((i5 + hashCode5) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31), 31), 31);
        String str = this.x;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i6 = (c + hashCode6) * 31;
        String str2 = this.y;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int g = hdi.g(sv6.c(this.A, hdi.g((i6 + hashCode7) * 31, 31, this.z), 31), 31, this.B);
        mg3 mg3Var = this.C;
        if (mg3Var == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = mg3Var.hashCode();
        }
        int c2 = sv6.c(this.E, hdi.g((g + hashCode8) * 31, 31, this.D), 31);
        String str3 = this.F;
        if (str3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str3.hashCode();
        }
        int g2 = hdi.g((c2 + hashCode9) * 31, 31, this.G);
        Date date6 = this.H;
        if (date6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = date6.hashCode();
        }
        int i7 = (g2 + hashCode10) * 31;
        Date date7 = this.I;
        if (date7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = date7.hashCode();
        }
        int i8 = (i7 + hashCode11) * 31;
        String str4 = this.J;
        if (str4 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str4.hashCode();
        }
        int g3 = hdi.g(hdi.g(hdi.f((i8 + hashCode12) * 31, 31, this.K), 31, this.L), 31, this.M);
        ModerationDetailsEntity moderationDetailsEntity = this.N;
        if (moderationDetailsEntity == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = moderationDetailsEntity.hashCode();
        }
        int i9 = (g3 + hashCode13) * 31;
        ModerationEntity moderationEntity = this.O;
        if (moderationEntity == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = moderationEntity.hashCode();
        }
        int i10 = (i9 + hashCode14) * 31;
        Date date8 = this.P;
        if (date8 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = date8.hashCode();
        }
        int i11 = (i10 + hashCode15) * 31;
        String str5 = this.Q;
        if (str5 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str5.hashCode();
        }
        int f = hdi.f((i11 + hashCode16) * 31, 31, this.R);
        ReminderInfoEntity reminderInfoEntity = this.S;
        if (reminderInfoEntity == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = reminderInfoEntity.hashCode();
        }
        int i12 = (f + hashCode17) * 31;
        LocationEntity locationEntity = this.T;
        if (locationEntity == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = locationEntity.hashCode();
        }
        int i13 = (i12 + hashCode18) * 31;
        MemberInfoEntity memberInfoEntity = this.U;
        if (memberInfoEntity != null) {
            i = memberInfoEntity.hashCode();
        }
        return Boolean.hashCode(this.V) + ((i13 + i) * 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("MessageInnerEntity(id=", this.a, ", cid=", this.b, ", userId=");
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
        ace.D(r, this.s, ", mentionedRoles=", this.t, ", reactionCounts=");
        r.append(this.u);
        r.append(", reactionScores=");
        r.append(this.v);
        r.append(", reactionGroups=");
        r.append(this.w);
        r.append(", parentId=");
        r.append(this.x);
        r.append(", command=");
        ace.A(this.y, ", shadowed=", ", i18n=", r, this.z);
        r.append(this.A);
        r.append(", showInChannel=");
        r.append(this.B);
        r.append(", channelInfo=");
        r.append(this.C);
        r.append(", silent=");
        r.append(this.D);
        r.append(", extraData=");
        r.append(this.E);
        r.append(", replyToId=");
        r.append(this.F);
        r.append(", pinned=");
        r.append(this.G);
        r.append(", pinnedAt=");
        r.append(this.H);
        r.append(", pinExpires=");
        r.append(this.I);
        r.append(", pinnedByUserId=");
        r.append(this.J);
        r.append(", threadParticipantsIds=");
        r.append(this.K);
        r.append(", skipPushNotification=");
        r.append(this.L);
        r.append(", skipEnrichUrl=");
        r.append(this.M);
        r.append(", moderationDetails=");
        r.append(this.N);
        r.append(", moderation=");
        r.append(this.O);
        r.append(", messageTextUpdatedAt=");
        r.append(this.P);
        r.append(", pollId=");
        ace.C(r, this.Q, ", restrictedVisibility=", this.R, ", reminder=");
        r.append(this.S);
        r.append(", sharedLocation=");
        r.append(this.T);
        r.append(", member=");
        r.append(this.U);
        r.append(", deletedForMe=");
        r.append(this.V);
        r.append(")");
        return r.toString();
    }
}

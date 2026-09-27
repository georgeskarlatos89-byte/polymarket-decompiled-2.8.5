package defpackage;

import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class czi {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final List f;
    public final Date g;
    public final Date h;
    public final Date i;
    public final Date j;
    public final String k;
    public final List l;
    public final List m;
    public final Map n;

    public czi(String str, String str2, String str3, int i, int i2, List list, Date date, Date date2, Date date3, Date date4, String str4, List list2, List list3, Map map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        date.getClass();
        date2.getClass();
        date3.getClass();
        str4.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = list;
        this.g = date;
        this.h = date2;
        this.i = date3;
        this.j = date4;
        this.k = str4;
        this.l = list2;
        this.m = list3;
        this.n = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof czi) {
                czi cziVar = (czi) obj;
                if (!Intrinsics.areEqual(this.a, cziVar.a) || !Intrinsics.areEqual(this.b, cziVar.b) || !Intrinsics.areEqual(this.c, cziVar.c) || this.d != cziVar.d || this.e != cziVar.e || !Intrinsics.areEqual(this.f, cziVar.f) || !Intrinsics.areEqual(this.g, cziVar.g) || !Intrinsics.areEqual(this.h, cziVar.h) || !Intrinsics.areEqual(this.i, cziVar.i) || !Intrinsics.areEqual(this.j, cziVar.j) || !Intrinsics.areEqual(this.k, cziVar.k) || !Intrinsics.areEqual(this.l, cziVar.l) || !Intrinsics.areEqual(this.m, cziVar.m) || !Intrinsics.areEqual(this.n, cziVar.n)) {
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
        int f = woa.f(this.i, woa.f(this.h, woa.f(this.g, hdi.f(woa.b(this.e, woa.b(this.d, hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31), 31), 31);
        Date date = this.j;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return this.n.hashCode() + hdi.f(hdi.f(hdi.e((f + hashCode) * 31, 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder r = m51.r("ThreadEntity(parentMessageId=", this.a, ", cid=", this.b, ", createdByUserId=");
        k84.l(this.d, this.c, ", activeParticipantCount=", ", participantCount=", r);
        r.append(this.e);
        r.append(", threadParticipants=");
        r.append(this.f);
        r.append(", lastMessageAt=");
        sv6.B(r, this.g, ", createdAt=", this.h, ", updatedAt=");
        sv6.B(r, this.i, ", deletedAt=", this.j, ", title=");
        ace.C(r, this.k, ", read=", this.l, ", latestReplyIds=");
        r.append(this.m);
        r.append(", extraData=");
        r.append(this.n);
        r.append(")");
        return r.toString();
    }
}

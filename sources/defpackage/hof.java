package defpackage;

import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hof {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final Date e;
    public final Date f;
    public final Date g;
    public final Date h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final Map l;
    public final SyncStatus m;
    public int n;

    public hof(String str, String str2, String str3, int i, Date date, Date date2, Date date3, Date date4, boolean z, boolean z2, String str4, Map map, SyncStatus syncStatus) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        syncStatus.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = date;
        this.f = date2;
        this.g = date3;
        this.h = date4;
        this.i = z;
        this.j = z2;
        this.k = str4;
        this.l = map;
        this.m = syncStatus;
        this.n = str3.hashCode() + str2.hashCode() + str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hof)) {
            return false;
        }
        hof hofVar = (hof) obj;
        if (Intrinsics.areEqual(this.a, hofVar.a) && Intrinsics.areEqual(this.b, hofVar.b) && Intrinsics.areEqual(this.c, hofVar.c) && this.d == hofVar.d && Intrinsics.areEqual(this.e, hofVar.e) && Intrinsics.areEqual(this.f, hofVar.f) && Intrinsics.areEqual(this.g, hofVar.g) && Intrinsics.areEqual(this.h, hofVar.h) && this.i == hofVar.i && this.j == hofVar.j && Intrinsics.areEqual(this.k, hofVar.k) && Intrinsics.areEqual(this.l, hofVar.l) && this.m == hofVar.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int b = woa.b(this.d, hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        int i = 0;
        Date date = this.e;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        Date date2 = this.f;
        if (date2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date3 = this.g;
        if (date3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Date date4 = this.h;
        if (date4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date4.hashCode();
        }
        int g = hdi.g(hdi.g((i4 + hashCode4) * 31, 31, this.i), 31, this.j);
        String str = this.k;
        if (str != null) {
            i = str.hashCode();
        }
        return this.m.hashCode() + sv6.c(this.l, (g + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("ReactionEntity(messageId=", this.a, ", userId=", this.b, ", type=");
        k84.l(this.d, this.c, ", score=", ", createdAt=", r);
        sv6.B(r, this.e, ", createdLocallyAt=", this.f, ", updatedAt=");
        sv6.B(r, this.g, ", deletedAt=", this.h, ", enforceUnique=");
        hdi.B(r, this.i, ", skipPush=", this.j, ", emojiCode=");
        r.append(this.k);
        r.append(", extraData=");
        r.append(this.l);
        r.append(", syncStatus=");
        r.append(this.m);
        r.append(")");
        return r.toString();
    }
}

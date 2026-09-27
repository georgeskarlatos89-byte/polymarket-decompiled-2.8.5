package defpackage;

import io.getstream.chat.android.client.internal.offline.repository.domain.push.internal.PushPreferenceEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.PrivacySettingsEntity;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gzj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Date f;
    public final Date g;
    public final Date h;
    public final boolean i;
    public final PrivacySettingsEntity j;
    public final boolean k;
    public final List l;
    public final List m;
    public final Map n;
    public final Map o;
    public final Long p;
    public final PushPreferenceEntity q;

    public gzj(String str, String str2, String str3, String str4, String str5, Date date, Date date2, Date date3, boolean z, PrivacySettingsEntity privacySettingsEntity, boolean z2, List list, List list2, Map map, Map map2, Long l, PushPreferenceEntity pushPreferenceEntity) {
        k84.p(str, str2, str3, str4, str5);
        list2.getClass();
        map.getClass();
        map2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = date;
        this.g = date2;
        this.h = date3;
        this.i = z;
        this.j = privacySettingsEntity;
        this.k = z2;
        this.l = list;
        this.m = list2;
        this.n = map;
        this.o = map2;
        this.p = l;
        this.q = pushPreferenceEntity;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gzj) {
                gzj gzjVar = (gzj) obj;
                if (!Intrinsics.areEqual(this.a, gzjVar.a) || !Intrinsics.areEqual(this.b, gzjVar.b) || !Intrinsics.areEqual(this.c, gzjVar.c) || !Intrinsics.areEqual(this.d, gzjVar.d) || !Intrinsics.areEqual(this.e, gzjVar.e) || !Intrinsics.areEqual(this.f, gzjVar.f) || !Intrinsics.areEqual(this.g, gzjVar.g) || !Intrinsics.areEqual(this.h, gzjVar.h) || this.i != gzjVar.i || !Intrinsics.areEqual(this.j, gzjVar.j) || this.k != gzjVar.k || !Intrinsics.areEqual(this.l, gzjVar.l) || !Intrinsics.areEqual(this.m, gzjVar.m) || !Intrinsics.areEqual(this.n, gzjVar.n) || !Intrinsics.areEqual(this.o, gzjVar.o) || !Intrinsics.areEqual(this.p, gzjVar.p) || !Intrinsics.areEqual(this.q, gzjVar.q)) {
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
        int e = hdi.e(hdi.e(hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int i = 0;
        Date date = this.f;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        Date date2 = this.g;
        if (date2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date3 = this.h;
        if (date3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date3.hashCode();
        }
        int g = hdi.g((i3 + hashCode3) * 31, 31, this.i);
        PrivacySettingsEntity privacySettingsEntity = this.j;
        if (privacySettingsEntity == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = privacySettingsEntity.hashCode();
        }
        int c = sv6.c(this.o, sv6.c(this.n, hdi.f(hdi.f(hdi.g((g + hashCode4) * 31, 31, this.k), 31, this.l), 31, this.m), 31), 31);
        Long l = this.p;
        if (l == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l.hashCode();
        }
        int i4 = (c + hashCode5) * 31;
        PushPreferenceEntity pushPreferenceEntity = this.q;
        if (pushPreferenceEntity != null) {
            i = pushPreferenceEntity.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("UserEntity(id=", this.a, ", originalId=", this.b, ", name=");
        k84.q(r, this.c, ", image=", this.d, ", role=");
        sv6.A(r, this.e, ", createdAt=", this.f, ", updatedAt=");
        sv6.B(r, this.g, ", lastActive=", this.h, ", invisible=");
        r.append(this.i);
        r.append(", privacySettings=");
        r.append(this.j);
        r.append(", banned=");
        r.append(this.k);
        r.append(", mutes=");
        r.append(this.l);
        r.append(", teams=");
        r.append(this.m);
        r.append(", teamsRole=");
        r.append(this.n);
        r.append(", extraData=");
        r.append(this.o);
        r.append(", avgResponseTime=");
        r.append(this.p);
        r.append(", pushPreference=");
        r.append(this.q);
        r.append(")");
        return r.toString();
    }
}

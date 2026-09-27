package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hhi {
    public final String a;
    public final List b;
    public final Date c;
    public final String d;
    public final Date e;

    public hhi(String str, List list, Date date, String str2, Date date2) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = date;
        this.d = str2;
        this.e = date2;
    }

    public static hhi a(hhi hhiVar, ArrayList arrayList, Date date, String str, Date date2, int i) {
        List list = arrayList;
        String str2 = hhiVar.a;
        if ((i & 2) != 0) {
            list = hhiVar.b;
        }
        if ((i & 4) != 0) {
            date = hhiVar.c;
        }
        if ((i & 8) != 0) {
            str = hhiVar.d;
        }
        if ((i & 16) != 0) {
            date2 = hhiVar.e;
        }
        Date date3 = date2;
        str2.getClass();
        list.getClass();
        String str3 = str;
        return new hhi(str2, list, date, str3, date3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhi)) {
            return false;
        }
        hhi hhiVar = (hhi) obj;
        if (Intrinsics.areEqual(this.a, hhiVar.a) && Intrinsics.areEqual(this.b, hhiVar.b) && Intrinsics.areEqual(this.c, hhiVar.c) && Intrinsics.areEqual(this.d, hhiVar.d) && Intrinsics.areEqual(this.e, hhiVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int f = hdi.f(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        Date date = this.c;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (f + hashCode) * 31;
        String str = this.d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date2 = this.e;
        if (date2 != null) {
            i = date2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncState(userId=");
        sb.append(this.a);
        sb.append(", activeChannelIds=");
        sb.append(this.b);
        sb.append(", lastSyncedAt=");
        sb.append(this.c);
        sb.append(", rawLastSyncedAt=");
        sb.append(this.d);
        sb.append(", markedAllReadAt=");
        return sv6.q(sb, this.e, ")");
    }
}

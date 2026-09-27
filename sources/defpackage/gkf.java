package defpackage;

import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gkf {
    public final FilterObject a;
    public final QuerySorter b;
    public final Set c;
    public final String d;
    public final Map e;
    public final Map f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gkf(FilterObject filterObject, QuerySortByField querySortByField, String str, Map map, Map map2, String str2, int i) {
        this(filterObject, querySortByField, r6, r0, map, map2, r10);
        String str3;
        String str4 = str;
        fd7 fd7Var = fd7.a;
        str4 = (i & 8) != 0 ? null : str4;
        map = (i & 16) != 0 ? null : map;
        map2 = (i & 32) != 0 ? null : map2;
        if ((i & 64) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkf)) {
            return false;
        }
        gkf gkfVar = (gkf) obj;
        if (Intrinsics.areEqual(this.a, gkfVar.a) && Intrinsics.areEqual(this.b, gkfVar.b) && Intrinsics.areEqual(this.c, gkfVar.c) && Intrinsics.areEqual(this.d, gkfVar.d) && Intrinsics.areEqual(this.e, gkfVar.e) && Intrinsics.areEqual(this.f, gkfVar.f) && Intrinsics.areEqual(this.g, gkfVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int d = sv6.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        int i = 0;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (d + hashCode) * 31;
        Map map = this.e;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map map2 = this.f;
        if (map2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryChannelsSpec(filter=");
        sb.append(this.a);
        sb.append(", querySort=");
        sb.append(this.b);
        sb.append(", cids=");
        sb.append(this.c);
        sb.append(", predefinedFilterName=");
        sb.append(this.d);
        sb.append(", predefinedFilterValues=");
        sb.append(this.e);
        sb.append(", predefinedSortValues=");
        sb.append(this.f);
        sb.append(", groupKey=");
        return woa.r(sb, this.g, ")");
    }

    public gkf(FilterObject filterObject, QuerySorter querySorter, Set set, String str, Map map, Map map2, String str2) {
        filterObject.getClass();
        querySorter.getClass();
        set.getClass();
        this.a = filterObject;
        this.b = querySorter;
        this.c = set;
        this.d = str;
        this.e = map;
        this.f = map2;
        this.g = str2;
    }
}

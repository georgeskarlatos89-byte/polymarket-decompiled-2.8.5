package defpackage;

import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hjf {
    public final String a;
    public final FilterObject b;
    public final QuerySorter c;
    public final List d;
    public final String e;
    public final Map f;
    public final Map g;
    public final String h;

    public hjf(String str, FilterObject filterObject, QuerySorter querySorter, List list, String str2, Map map, Map map2, String str3) {
        str.getClass();
        filterObject.getClass();
        querySorter.getClass();
        list.getClass();
        this.a = str;
        this.b = filterObject;
        this.c = querySorter;
        this.d = list;
        this.e = str2;
        this.f = map;
        this.g = map2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjf)) {
            return false;
        }
        hjf hjfVar = (hjf) obj;
        if (Intrinsics.areEqual(this.a, hjfVar.a) && Intrinsics.areEqual(this.b, hjfVar.b) && Intrinsics.areEqual(this.c, hjfVar.c) && Intrinsics.areEqual(this.d, hjfVar.d) && Intrinsics.areEqual(this.e, hjfVar.e) && Intrinsics.areEqual(this.f, hjfVar.f) && Intrinsics.areEqual(this.g, hjfVar.g) && Intrinsics.areEqual(this.h, hjfVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int f = hdi.f((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        int i = 0;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (f + hashCode) * 31;
        Map map = this.f;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map map2 = this.g;
        if (map2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "QueryChannelsEntity(id=" + this.a + ", filter=" + this.b + ", querySort=" + this.c + ", cids=" + this.d + ", predefinedFilterName=" + this.e + ", predefinedFilterValues=" + this.f + ", predefinedSortValues=" + this.g + ", groupKey=" + this.h + ")";
    }
}

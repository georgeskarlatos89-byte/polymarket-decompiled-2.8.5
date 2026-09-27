package defpackage;

import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class m1f {
    public final FilterObject a;
    public final QuerySorter b;

    public m1f(FilterObject filterObject, QuerySortByField querySortByField) {
        filterObject.getClass();
        querySortByField.getClass();
        this.a = filterObject;
        this.b = querySortByField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1f)) {
            return false;
        }
        m1f m1fVar = (m1f) obj;
        if (Intrinsics.areEqual(this.a, m1fVar.a) && Intrinsics.areEqual(this.b, m1fVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PredefinedFilter(filter=" + this.a + ", sort=" + this.b + ")";
    }
}

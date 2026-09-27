package defpackage;

import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kjf implements ljf {
    public final FilterObject a;
    public final QuerySorter b;

    public kjf(FilterObject filterObject, QuerySorter querySorter) {
        filterObject.getClass();
        querySorter.getClass();
        this.a = filterObject;
        this.b = querySorter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjf)) {
            return false;
        }
        kjf kjfVar = (kjf) obj;
        if (Intrinsics.areEqual(this.a, kjfVar.a) && Intrinsics.areEqual(this.b, kjfVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Standard(filter=" + this.a + ", sort=" + this.b + ")";
    }
}

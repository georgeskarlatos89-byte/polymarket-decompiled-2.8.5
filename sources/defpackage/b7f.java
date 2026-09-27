package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b7f {
    public final List a;
    public final Map b;

    public b7f(List list, Map map) {
        list.getClass();
        map.getClass();
        this.a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7f)) {
            return false;
        }
        b7f b7fVar = (b7f) obj;
        if (Intrinsics.areEqual(this.a, b7fVar.a) && Intrinsics.areEqual(this.b, b7fVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProcessingOptionsInfo(aflEntries=" + this.a + ", records=" + this.b + ")";
    }
}

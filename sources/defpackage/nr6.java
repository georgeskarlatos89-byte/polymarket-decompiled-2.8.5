package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nr6 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final List d;

    public nr6(Map map, Map map2, Map map3, List list) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr6)) {
            return false;
        }
        nr6 nr6Var = (nr6) obj;
        if (Intrinsics.areEqual(this.a, nr6Var.a) && Intrinsics.areEqual(this.b, nr6Var.b) && Intrinsics.areEqual(this.c, nr6Var.c) && Intrinsics.areEqual(this.d, nr6Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        Map map = this.a;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = hashCode * 31;
        Map map2 = this.b;
        if (map2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map map3 = this.c;
        if (map3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiagnosticsSnapshot(tags=");
        sb.append(this.a);
        sb.append(", counters=");
        sb.append(this.b);
        sb.append(", histograms=");
        sb.append(this.c);
        sb.append(", events=");
        return sv6.r(sb, this.d, ')');
    }
}

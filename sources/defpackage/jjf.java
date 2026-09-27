package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class jjf implements ljf {
    public final String a;
    public final Map b;
    public final Map c;

    public jjf(String str, Map map, Map map2) {
        str.getClass();
        this.a = str;
        this.b = map;
        this.c = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjf)) {
            return false;
        }
        jjf jjfVar = (jjf) obj;
        if (Intrinsics.areEqual(this.a, jjfVar.a) && Intrinsics.areEqual(this.b, jjfVar.b) && Intrinsics.areEqual(this.c, jjfVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        Map map = this.b;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Map map2 = this.c;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predefined(name=");
        sb.append(this.a);
        sb.append(", filterValues=");
        sb.append(this.b);
        sb.append(", sortValues=");
        return ace.n(sb, this.c, ")");
    }
}

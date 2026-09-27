package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bl7 {
    public final String a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;

    public bl7(String str, Map map, Map map2, Map map3, Map map4) {
        str.getClass();
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl7)) {
            return false;
        }
        bl7 bl7Var = (bl7) obj;
        if (Intrinsics.areEqual(this.a, bl7Var.a) && Intrinsics.areEqual(this.b, bl7Var.b) && Intrinsics.areEqual(this.c, bl7Var.c) && Intrinsics.areEqual(this.d, bl7Var.d) && Intrinsics.areEqual(this.e, bl7Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.a.hashCode() * 31;
        int i = 0;
        Map map = this.b;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        Map map2 = this.c;
        if (map2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map map3 = this.d;
        if (map3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Map map4 = this.e;
        if (map4 != null) {
            i = map4.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event(eventType=");
        sb.append(this.a);
        sb.append(", eventProperties=");
        sb.append(this.b);
        sb.append(", userProperties=");
        sb.append(this.c);
        sb.append(", groups=");
        sb.append(this.d);
        sb.append(", groupProperties=");
        return hdi.s(sb, this.e, ')');
    }
}

package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f4k {
    public final String a;
    public final Object b;
    public final String c;
    public final String d;
    public final Map e;

    public f4k(String str, Object obj, String str2, String str3, Map map) {
        this.a = str;
        this.b = obj;
        this.c = str2;
        this.d = str3;
        this.e = map;
    }

    public final boolean a() {
        if (this.d == null && this.a == null && this.b == null && this.c == null && this.e == null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4k)) {
            return false;
        }
        f4k f4kVar = (f4k) obj;
        if (Intrinsics.areEqual(this.a, f4kVar.a) && Intrinsics.areEqual(this.b, f4kVar.b) && Intrinsics.areEqual(this.c, f4kVar.c) && Intrinsics.areEqual(this.d, f4kVar.d) && Intrinsics.areEqual(this.e, f4kVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj = this.b;
        if (obj == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Map map = this.e;
        if (map != null) {
            i = map.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Variant(value=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append(", expKey=");
        sb.append(this.c);
        sb.append(", key=");
        sb.append(this.d);
        sb.append(", metadata=");
        return hdi.s(sb, this.e, ')');
    }

    public /* synthetic */ f4k() {
        this(null, null, null, null, null);
    }
}

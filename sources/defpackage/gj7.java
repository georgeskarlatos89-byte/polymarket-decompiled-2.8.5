package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gj7 {
    public final int a;
    public String b;
    public final int c;
    public final Map d;
    public final String e;
    public final List f;

    public gj7(int i, String str, int i2, Map map, String str2, List list) {
        str.getClass();
        map.getClass();
        str2.getClass();
        list.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = map;
        this.e = str2;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj7)) {
            return false;
        }
        gj7 gj7Var = (gj7) obj;
        if (this.a == gj7Var.a && Intrinsics.areEqual(this.b, gj7Var.b) && this.c == gj7Var.c && Intrinsics.areEqual(this.d, gj7Var.d) && Intrinsics.areEqual(this.e, gj7Var.e) && Intrinsics.areEqual(this.f, gj7Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + hdi.e(sv6.c(this.d, woa.b(this.c, hdi.e(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        return "ErrorResponse(code=" + this.a + ", message=" + this.b + ", statusCode=" + this.c + ", exceptionFields=" + this.d + ", moreInfo=" + this.e + ", details=" + this.f + ")";
    }
}

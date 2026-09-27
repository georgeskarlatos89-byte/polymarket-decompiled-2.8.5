package defpackage;

import com.fingerprintjs.android.fpjs_pro.g;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uw0 {
    public final String a;
    public final Integer b;
    public final ld7 c;
    public final long d;
    public final long e;
    public final Map f;
    public final Integer g;

    public uw0(String str, Integer num, ld7 ld7Var, long j, long j2, HashMap hashMap, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = ld7Var;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
        this.g = num2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x47] */
    public final x47 c() {
        ?? obj = new Object();
        String str = this.a;
        if (str != null) {
            obj.a = str;
            obj.b = this.b;
            obj.g = this.g;
            ld7 ld7Var = this.c;
            if (ld7Var != null) {
                obj.c = ld7Var;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f = new HashMap(this.f);
                return obj;
            }
            dmk.s("Null encodedPayload");
            return null;
        }
        dmk.s("Null transportName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uw0) {
            uw0 uw0Var = (uw0) obj;
            if (this.a.equals(uw0Var.a)) {
                Integer num = uw0Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(uw0Var.c) && this.d == uw0Var.d && this.e == uw0Var.e && this.f.equals(uw0Var.f)) {
                        Integer num3 = uw0Var.g;
                        Integer num4 = this.g;
                        if (num4 != null ? num4.equals(num3) : num3 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i2 = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int hashCode4 = (((i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", encodedPayload=");
        sb.append(this.c);
        sb.append(", eventMillis=");
        sb.append(this.d);
        sb.append(", uptimeMillis=");
        sb.append(this.e);
        sb.append(", autoMetadata=");
        sb.append(this.f);
        sb.append(", productId=");
        return g.p(sb, this.g, "}");
    }
}

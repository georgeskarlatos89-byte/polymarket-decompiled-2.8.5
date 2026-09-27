package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class f5l {
    public static final tr9 d = tr9.k(3, "_syn", "_err", "_el");
    public String a;
    public final long b;
    public final HashMap c;

    public f5l(String str, long j, HashMap hashMap) {
        this.a = str;
        this.b = j;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final f5l a() {
        return new f5l(this.a, this.b, new HashMap(this.c));
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f5l) {
            f5l f5lVar = (f5l) obj;
            if (this.b != f5lVar.b || !this.a.equals(f5lVar.a)) {
                return false;
            }
            return this.c.equals(f5lVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.a;
        String obj = this.c.toString();
        int length = String.valueOf(str).length();
        long j = this.b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + obj.length() + 1);
        ix2.C(sb, "Event{name='", str, "', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}

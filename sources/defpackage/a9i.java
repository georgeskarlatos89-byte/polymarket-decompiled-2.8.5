package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a9i {
    public final int a;
    public final Object b;
    public final Map c;
    public final boolean d;
    public final boolean e;
    public final h2g f;

    public a9i(int i, String str, Map map) {
        boolean z;
        String str2;
        map.getClass();
        this.a = i;
        this.b = str;
        this.c = map;
        if (i == 200) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        this.e = i < 200 || i >= 300;
        List a = a("Request-Id");
        if (a != null) {
            str2 = (String) CollectionsKt.firstOrNull(a);
        } else {
            str2 = null;
        }
        str2 = (str2 == null || StringsKt.T(str2)) ? null : str2;
        this.f = str2 != null ? new h2g(str2) : null;
    }

    public final List a(String str) {
        Object obj;
        Iterator it = this.c.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (e.o((String) ((Map.Entry) obj).getKey(), str, true)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (List) entry.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9i)) {
            return false;
        }
        a9i a9iVar = (a9i) obj;
        if (this.a == a9iVar.a && Intrinsics.areEqual(this.b, a9iVar.b) && Intrinsics.areEqual(this.c, a9iVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "Request-Id: " + this.f + ", Status Code: " + this.a;
    }
}

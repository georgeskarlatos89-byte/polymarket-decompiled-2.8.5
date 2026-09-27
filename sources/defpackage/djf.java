package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public class djf {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();

    public final boolean a() {
        LinkedHashMap linkedHashMap = this.f;
        if (!linkedHashMap.isEmpty()) {
            Set keySet = linkedHashMap.keySet();
            if (!keySet.contains(xsd.LESS_THAN.toString()) && !keySet.contains(xsd.LESS_THAN_OR_EQUAL.toString())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        return linkedHashMap.keySet().contains(xsd.AROUND_ID.toString());
    }

    public final boolean c() {
        xsd[] values = xsd.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (xsd xsdVar : values) {
            arrayList.add(xsdVar.toString());
        }
        return !CollectionsKt.L(arrayList, this.f.keySet()).isEmpty();
    }

    public final boolean d() {
        LinkedHashMap linkedHashMap = this.f;
        if (!linkedHashMap.isEmpty()) {
            Set keySet = linkedHashMap.keySet();
            if (!keySet.contains(xsd.GREATER_THAN.toString()) && !keySet.contains(xsd.GREATER_THAN_OR_EQUAL.toString())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int e() {
        Integer num;
        Object obj = this.f.get("limit");
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof djf) {
                djf djfVar = (djf) obj;
                if (this.a != djfVar.a || this.b != djfVar.b || this.c != djfVar.c || this.d != djfVar.d || !Intrinsics.areEqual(this.f, djfVar.f) || !Intrinsics.areEqual(this.g, djfVar.g) || !Intrinsics.areEqual(this.h, djfVar.h) || !Intrinsics.areEqual(this.i, djfVar.i) || this.e != djfVar.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final Pair f() {
        xsd xsdVar;
        LinkedHashMap linkedHashMap = this.f;
        String str = null;
        if (!linkedHashMap.isEmpty()) {
            Set keySet = linkedHashMap.keySet();
            xsd[] values = xsd.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    xsdVar = values[i];
                    if (keySet.contains(xsdVar.toString())) {
                        break;
                    }
                    i++;
                } else {
                    xsdVar = null;
                    break;
                }
            }
            if (xsdVar != null) {
                Object obj = linkedHashMap.get(xsdVar.toString());
                if (obj instanceof String) {
                    str = (String) obj;
                }
                if (str == null) {
                    str = "";
                }
                return new Pair(xsdVar, str);
            }
        }
        return null;
    }

    public djf g(int i) {
        this.a = true;
        HashMap hashMap = new HashMap();
        hashMap.put("limit", Integer.valueOf(i));
        this.f.putAll(hashMap);
        return this;
    }

    public djf h(xsd xsdVar, String str, int i) {
        xsdVar.getClass();
        str.getClass();
        this.a = true;
        HashMap hashMap = new HashMap();
        hashMap.put("limit", Integer.valueOf(i));
        hashMap.put(xsdVar.toString(), str);
        this.f.putAll(hashMap);
        return this;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + hdi.g(hdi.g(hdi.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        StringBuilder h = k84.h("QueryChannelRequest(state=", ", watch=", ", presence=", z, z2);
        hdi.B(h, z3, ", shouldRefresh=", z4, ", isWatchChannel=false, isNotificationUpdate=");
        h.append(z5);
        h.append(", messages=");
        h.append(this.f);
        h.append(", watchers=");
        h.append(this.g);
        h.append(", members=");
        h.append(this.h);
        h.append(", data=");
        h.append(this.i);
        h.append(")");
        return h.toString();
    }
}

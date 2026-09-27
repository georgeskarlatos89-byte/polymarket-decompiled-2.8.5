package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zr7 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public LinkedHashMap p;
    public LinkedHashMap q;
    public LinkedHashMap r;

    public final as7 a() {
        return new as7(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final void b(Map map) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(c1c.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                LinkedHashMap p = d1c.p((Map) entry.getValue());
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(c1c.a(p.size()));
                for (Map.Entry entry2 : p.entrySet()) {
                    linkedHashMap3.put(entry2.getKey(), d1c.p((Map) entry2.getValue()));
                }
                linkedHashMap2.put(key, new LinkedHashMap(linkedHashMap3));
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        } else {
            linkedHashMap = null;
        }
        this.r = linkedHashMap;
    }
}

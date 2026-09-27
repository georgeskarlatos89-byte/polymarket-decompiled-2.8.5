package defpackage;

import com.socure.idplus.device.internal.mediaDevice.manager.d;
import java.io.Serializable;
import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class gaa implements Serializable {
    public final zna a;
    public final foa b;
    public final Set c;
    public final fn d;
    public final String e;
    public final URI f;
    public final h81 g;
    public final h81 h;
    public final List i;
    public final Date j;
    public final Date k;
    public final Date l;
    public final pna m;
    public final LinkedList n;

    public gaa(zna znaVar, foa foaVar, Set set, fn fnVar, String str, URI uri, h81 h81Var, h81 h81Var2, List list, Date date, Date date2, Date date3, pna pnaVar) {
        Objects.requireNonNull(znaVar, "The key type \"kty\" parameter must not be null");
        this.a = znaVar;
        Map map = goa.a;
        if (foaVar != null && set != null) {
            Map map2 = goa.a;
            if (map2.containsKey(foaVar) && !((Set) map2.get(foaVar)).containsAll(set)) {
                dmk.v("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
                throw null;
            }
        }
        this.b = foaVar;
        this.c = set;
        this.d = fnVar;
        this.e = str;
        this.f = uri;
        this.g = h81Var;
        this.h = h81Var2;
        if (list != null && list.isEmpty()) {
            dmk.v("The X.509 certificate chain \"x5c\" must not be empty");
            throw null;
        }
        this.i = list;
        try {
            this.n = r7n.a(list);
            this.j = date;
            this.k = date2;
            this.l = date3;
            this.m = pnaVar;
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e.getMessage(), e);
        }
    }

    public static gaa c(Map map) {
        gaa gaaVar;
        ArrayList arrayList;
        List list;
        String str;
        Iterator it;
        String f = y9a.f("kty", map);
        if (f != null) {
            zna a = zna.a(f);
            if (a == zna.b) {
                return t57.h(map);
            }
            zna znaVar = zna.c;
            if (a == znaVar) {
                if (znaVar.equals(bym.f(map))) {
                    h81 a2 = y9a.a("n", map);
                    h81 a3 = y9a.a("e", map);
                    h81 a4 = y9a.a(d.d, map);
                    h81 a5 = y9a.a("p", map);
                    h81 a6 = y9a.a("q", map);
                    h81 a7 = y9a.a("dp", map);
                    String str2 = "dq";
                    h81 a8 = y9a.a("dq", map);
                    h81 a9 = y9a.a("qi", map);
                    if (map.containsKey("oth") && (list = (List) y9a.c(map, "oth", List.class)) != null) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (next instanceof Map) {
                                Map map2 = (Map) next;
                                it = it2;
                                str = str2;
                                try {
                                    arrayList2.add(new zlf(y9a.a("r", map2), y9a.a(str2, map2), y9a.a("t", map2)));
                                } catch (IllegalArgumentException e) {
                                    fi9.g(e.getMessage());
                                    return null;
                                }
                            } else {
                                str = str2;
                                it = it2;
                            }
                            it2 = it;
                            str2 = str;
                        }
                        gaaVar = null;
                        arrayList = arrayList2;
                    } else {
                        gaaVar = null;
                        arrayList = null;
                    }
                    try {
                        return new amf(a2, a3, a4, a5, a6, a7, a8, a9, arrayList, bym.g(map), ina.b(y9a.g("key_ops", map)), bym.b(map), (String) y9a.c(map, "kid", String.class), y9a.h("x5u", map), y9a.a("x5t", map), y9a.a("x5t#S256", map), bym.i(map), bym.c(map), bym.h(map), bym.d(map), bym.e(map));
                    } catch (Exception e2) {
                        fi9.g(e2.getMessage());
                        return gaaVar;
                    }
                }
                fi9.g("The key type \"kty\" must be RSA");
                return null;
            }
            zna znaVar2 = zna.d;
            if (a == znaVar2) {
                if (znaVar2.equals(bym.f(map))) {
                    try {
                        return new igd(y9a.a("k", map), bym.g(map), ina.b(y9a.g("key_ops", map)), bym.b(map), (String) y9a.c(map, "kid", String.class), y9a.h("x5u", map), y9a.a("x5t", map), y9a.a("x5t#S256", map), bym.i(map), bym.c(map), bym.h(map), bym.d(map), bym.e(map));
                    } catch (Exception e3) {
                        fi9.g(e3.getMessage());
                        return null;
                    }
                }
                fi9.f(znaVar2.a, "The key type kty must be ");
                return null;
            }
            zna znaVar3 = zna.e;
            if (a == znaVar3) {
                Set set = hgd.t;
                if (znaVar3.equals(bym.f(map))) {
                    try {
                        lg5 b = lg5.b((String) y9a.c(map, "crv", String.class));
                        h81 a10 = y9a.a("x", map);
                        h81 a11 = y9a.a(d.d, map);
                        try {
                            if (a11 == null) {
                                return new hgd(b, a10, bym.g(map), ina.b(y9a.g("key_ops", map)), bym.b(map), (String) y9a.c(map, "kid", String.class), y9a.h("x5u", map), y9a.a("x5t", map), y9a.a("x5t#S256", map), bym.i(map), bym.c(map), bym.h(map), bym.d(map), bym.e(map));
                            }
                            return new hgd(b, a10, a11, bym.g(map), ina.b(y9a.g("key_ops", map)), bym.b(map), (String) y9a.c(map, "kid", String.class), y9a.h("x5u", map), y9a.a("x5t", map), y9a.a("x5t#S256", map), bym.i(map), bym.c(map), bym.h(map), bym.d(map), bym.e(map));
                        } catch (Exception e4) {
                            fi9.g(e4.getMessage());
                            return null;
                        }
                    } catch (IllegalArgumentException e5) {
                        fi9.g(e5.getMessage());
                        return null;
                    }
                }
                fi9.f(znaVar3.a, "The key type kty must be ");
                return null;
            }
            throw new ParseException("Unsupported key type \"kty\" parameter: " + a, 0);
        }
        fi9.g("Missing key type \"kty\" parameter");
        return null;
    }

    public final List a() {
        LinkedList linkedList = this.n;
        if (linkedList == null) {
            return null;
        }
        return Collections.unmodifiableList(linkedList);
    }

    public abstract boolean b();

    public HashMap d() {
        i19 i19Var = y9a.a;
        HashMap hashMap = new HashMap();
        hashMap.put("kty", this.a.a);
        foa foaVar = this.b;
        if (foaVar != null) {
            hashMap.put("use", foaVar.a);
        }
        Set set = this.c;
        if (set != null) {
            int i = w9a.a;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((ina) it.next()).a());
            }
            hashMap.put("key_ops", arrayList);
        }
        fn fnVar = this.d;
        if (fnVar != null) {
            hashMap.put("alg", fnVar.a);
        }
        String str = this.e;
        if (str != null) {
            hashMap.put("kid", str);
        }
        URI uri = this.f;
        if (uri != null) {
            hashMap.put("x5u", uri.toString());
        }
        h81 h81Var = this.g;
        if (h81Var != null) {
            hashMap.put("x5t", h81Var.a);
        }
        h81 h81Var2 = this.h;
        if (h81Var2 != null) {
            hashMap.put("x5t#S256", h81Var2.a);
        }
        List list = this.i;
        if (list != null) {
            int i2 = w9a.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((d81) it2.next()).a);
            }
            hashMap.put("x5c", arrayList2);
        }
        Date date = this.j;
        if (date != null) {
            hashMap.put("exp", Long.valueOf(date.getTime() / 1000));
        }
        Date date2 = this.k;
        if (date2 != null) {
            hashMap.put("nbf", Long.valueOf(date2.getTime() / 1000));
        }
        Date date3 = this.l;
        if (date3 != null) {
            hashMap.put("iat", Long.valueOf(date3.getTime() / 1000));
        }
        pna pnaVar = this.m;
        if (pnaVar != null) {
            i19 i19Var2 = y9a.a;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("revoked_at", Long.valueOf(pnaVar.a.getTime() / 1000));
            ona onaVar = pnaVar.b;
            if (onaVar != null) {
                hashMap2.put("reason", onaVar.a);
            }
            hashMap.put("revoked", hashMap2);
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gaa) {
            gaa gaaVar = (gaa) obj;
            if (Objects.equals(this.a, gaaVar.a) && Objects.equals(this.b, gaaVar.b) && Objects.equals(this.c, gaaVar.c) && Objects.equals(this.d, gaaVar.d) && Objects.equals(this.e, gaaVar.e) && Objects.equals(this.f, gaaVar.f) && Objects.equals(this.g, gaaVar.g) && Objects.equals(this.h, gaaVar.h) && Objects.equals(this.i, gaaVar.i) && Objects.equals(this.j, gaaVar.j) && Objects.equals(this.k, gaaVar.k) && Objects.equals(this.l, gaaVar.l) && Objects.equals(this.m, gaaVar.m)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null);
    }

    public final String toString() {
        return y9a.j(d());
    }
}

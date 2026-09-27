package defpackage;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class iaa extends yh4 {
    public static final Set p;
    public final boolean o;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        p = Collections.unmodifiableSet(hashSet);
    }

    public iaa(haa haaVar, v9a v9aVar, String str, Set set, URI uri, gaa gaaVar, URI uri2, h81 h81Var, h81 h81Var2, List list, String str2, boolean z, Map map, h81 h81Var3) {
        super(haaVar, v9aVar, str, set, uri, gaaVar, uri2, h81Var, h81Var2, list, str2, map, h81Var3);
        if (!haaVar.a.equals(fn.b.a)) {
            this.o = z;
        } else {
            dmk.v("The JWS algorithm \"alg\" cannot be \"none\"");
            throw null;
        }
    }

    public static iaa c(h81 h81Var) {
        fn fnVar;
        Map i = y9a.i(20000, new String(h81Var.a(), ouh.a));
        String f = y9a.f("alg", i);
        if (f != null) {
            fn fnVar2 = fn.b;
            if (f.equals(fnVar2.a)) {
                fnVar = fnVar2;
            } else if (i.containsKey("enc")) {
                fnVar = aaa.a(f);
            } else {
                fn fnVar3 = haa.c;
                if (!f.equals(fnVar3.a)) {
                    fnVar3 = haa.d;
                    if (!f.equals(fnVar3.a)) {
                        fnVar3 = haa.e;
                        if (!f.equals(fnVar3.a)) {
                            fnVar3 = haa.f;
                            if (!f.equals(fnVar3.a)) {
                                fnVar3 = haa.g;
                                if (!f.equals(fnVar3.a)) {
                                    fnVar3 = haa.h;
                                    if (!f.equals(fnVar3.a)) {
                                        fnVar3 = haa.i;
                                        if (!f.equals(fnVar3.a)) {
                                            fnVar3 = haa.j;
                                            if (!f.equals(fnVar3.a)) {
                                                fnVar3 = haa.k;
                                                if (!f.equals(fnVar3.a)) {
                                                    fnVar3 = haa.l;
                                                    if (!f.equals(fnVar3.a)) {
                                                        fnVar3 = haa.m;
                                                        if (!f.equals(fnVar3.a)) {
                                                            fnVar3 = haa.n;
                                                            if (!f.equals(fnVar3.a)) {
                                                                fnVar3 = haa.o;
                                                                if (!f.equals(fnVar3.a)) {
                                                                    fnVar3 = haa.p;
                                                                    if (!f.equals(fnVar3.a)) {
                                                                        fnVar3 = haa.q;
                                                                        if (!f.equals(fnVar3.a)) {
                                                                            fnVar3 = haa.r;
                                                                            if (!f.equals(fnVar3.a)) {
                                                                                fnVar3 = new fn(f);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                fnVar = fnVar3;
            }
            if (fnVar instanceof haa) {
                haa haaVar = (haa) fnVar;
                if (!haaVar.a.equals(fnVar2.a)) {
                    boolean z = true;
                    v9a v9aVar = null;
                    String str = null;
                    HashSet hashSet = null;
                    URI uri = null;
                    gaa gaaVar = null;
                    URI uri2 = null;
                    h81 h81Var2 = null;
                    h81 h81Var3 = null;
                    LinkedList linkedList = null;
                    String str2 = null;
                    HashMap hashMap = null;
                    while (true) {
                        boolean z2 = z;
                        for (String str3 : i.keySet()) {
                            if (!"alg".equals(str3)) {
                                if ("typ".equals(str3)) {
                                    String str4 = (String) y9a.c(i, str3, String.class);
                                    if (str4 != null) {
                                        v9aVar = new v9a(str4);
                                    }
                                } else if ("cty".equals(str3)) {
                                    str = (String) y9a.c(i, str3, String.class);
                                } else if ("crit".equals(str3)) {
                                    List g = y9a.g(str3, i);
                                    if (g != null) {
                                        hashSet = new HashSet(g);
                                    }
                                } else if ("jku".equals(str3)) {
                                    uri = y9a.h(str3, i);
                                } else if ("jwk".equals(str3)) {
                                    Map d = y9a.d(str3, i);
                                    if (d == null) {
                                        gaaVar = null;
                                    } else {
                                        gaa c = gaa.c(d);
                                        if (!c.b()) {
                                            gaaVar = c;
                                        } else {
                                            fi9.g("Non-public key in jwk header parameter");
                                            return null;
                                        }
                                    }
                                    if (gaaVar != null && gaaVar.b()) {
                                        dmk.v("The JWK must be public");
                                        return null;
                                    }
                                } else if ("x5u".equals(str3)) {
                                    uri2 = y9a.h(str3, i);
                                } else if ("x5t".equals(str3)) {
                                    h81Var2 = h81.d((String) y9a.c(i, str3, String.class));
                                } else if ("x5t#S256".equals(str3)) {
                                    h81Var3 = h81.d((String) y9a.c(i, str3, String.class));
                                } else if ("x5c".equals(str3)) {
                                    linkedList = r7n.e((List) y9a.c(i, str3, List.class));
                                } else if ("kid".equals(str3)) {
                                    str2 = (String) y9a.c(i, str3, String.class);
                                } else if ("b64".equals(str3)) {
                                    Boolean bool = (Boolean) y9a.c(i, str3, Boolean.class);
                                    if (bool != null) {
                                        z = bool.booleanValue();
                                    } else {
                                        fi9.g(sv6.n("JSON object member ", str3, " is missing or null"));
                                        return null;
                                    }
                                } else {
                                    Object obj = i.get(str3);
                                    if (!p.contains(str3)) {
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(str3, obj);
                                    } else {
                                        dmk.v(sv6.n("The parameter name \"", str3, "\" matches a registered name"));
                                        return null;
                                    }
                                }
                            }
                        }
                        return new iaa(haaVar, v9aVar, str, hashSet, uri, gaaVar, uri2, h81Var2, h81Var3, linkedList, str2, z2, hashMap, h81Var);
                    }
                }
                dmk.v("The JWS algorithm \"alg\" cannot be \"none\"");
                return null;
            }
            fi9.g("Not a JWS header");
            return null;
        }
        fi9.g("Missing \"alg\" in header JSON object");
        return null;
    }

    @Override // defpackage.yh4
    public final HashMap b() {
        HashMap b = super.b();
        if (!this.o) {
            b.put("b64", Boolean.FALSE);
        }
        return b;
    }
}

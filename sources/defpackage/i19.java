package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class i19 {
    public static final gl8 j = gl8.d;
    public static final c4j k = c4j.DOUBLE;
    public static final c4j l = c4j.LAZILY_PARSED_NUMBER;
    public final ThreadLocal a = new ThreadLocal();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final bw4 c;
    public final yfj d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final gl8 h;
    public final g1i i;

    public i19(kp7 kp7Var, sy7 sy7Var, HashMap hashMap, boolean z, boolean z2, gl8 gl8Var, g1i g1iVar, bub bubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, c4j c4jVar, c4j c4jVar2, ArrayList arrayList4) {
        ldd lddVar;
        iea ieaVar;
        ldd lddVar2;
        bw4 bw4Var = new bw4(1, hashMap, arrayList4);
        this.c = bw4Var;
        this.f = z;
        this.g = z2;
        this.h = gl8Var;
        this.i = g1iVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(cgj.A);
        if (c4jVar == c4j.DOUBLE) {
            lddVar = qfd.c;
        } else {
            ldd lddVar3 = qfd.c;
            lddVar = new ldd(c4jVar, 1);
        }
        arrayList5.add(lddVar);
        arrayList5.add(kp7Var);
        arrayList5.addAll(arrayList3);
        arrayList5.add(cgj.p);
        arrayList5.add(cgj.g);
        arrayList5.add(cgj.d);
        arrayList5.add(cgj.e);
        arrayList5.add(cgj.f);
        if (bubVar == bub.DEFAULT) {
            ieaVar = cgj.k;
        } else {
            ieaVar = new iea(3);
        }
        arrayList5.add(new zfj(Long.TYPE, Long.class, ieaVar));
        arrayList5.add(new zfj(Double.TYPE, Double.class, new iea(1)));
        arrayList5.add(new zfj(Float.TYPE, Float.class, new iea(2)));
        if (c4jVar2 == c4j.LAZILY_PARSED_NUMBER) {
            lddVar2 = ndd.b;
        } else {
            lddVar2 = new ldd(new ndd(c4jVar2), 0);
        }
        arrayList5.add(lddVar2);
        arrayList5.add(cgj.h);
        arrayList5.add(cgj.i);
        arrayList5.add(new yfj(AtomicLong.class, new sjh(ieaVar, 1).a(), 0));
        arrayList5.add(new yfj(AtomicLongArray.class, new sjh(ieaVar, 2).a(), 0));
        arrayList5.add(cgj.j);
        arrayList5.add(cgj.l);
        arrayList5.add(cgj.q);
        arrayList5.add(cgj.r);
        arrayList5.add(new yfj(BigDecimal.class, cgj.m, 0));
        arrayList5.add(new yfj(BigInteger.class, cgj.n, 0));
        arrayList5.add(new yfj(bya.class, cgj.o, 0));
        arrayList5.add(cgj.s);
        arrayList5.add(cgj.t);
        arrayList5.add(cgj.v);
        arrayList5.add(cgj.w);
        arrayList5.add(cgj.y);
        arrayList5.add(cgj.u);
        arrayList5.add(cgj.b);
        arrayList5.add(nl0.e);
        arrayList5.add(cgj.x);
        if (ujh.a) {
            arrayList5.add(ujh.c);
            arrayList5.add(ujh.b);
            arrayList5.add(ujh.d);
        }
        arrayList5.add(nl0.d);
        arrayList5.add(cgj.a);
        arrayList5.add(new za4(0, bw4Var));
        arrayList5.add(new za4(1, bw4Var));
        yfj yfjVar = new yfj(bw4Var);
        this.d = yfjVar;
        arrayList5.add(yfjVar);
        arrayList5.add(cgj.B);
        arrayList5.add(new bwf(bw4Var, sy7Var, kp7Var, yfjVar, arrayList4));
        this.e = Collections.unmodifiableList(arrayList5);
    }

    public static void a(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Type type) {
        g1i g1iVar;
        boolean z;
        jij jijVar = new jij(type);
        Object obj = null;
        if (str == null) {
            return null;
        }
        ufa ufaVar = new ufa(new StringReader(str));
        g1i g1iVar2 = this.i;
        if (g1iVar2 == null) {
            g1iVar = g1i.LEGACY_STRICT;
        } else {
            g1iVar = g1iVar2;
        }
        ufaVar.a0(g1iVar);
        g1i g1iVar3 = ufaVar.b;
        if (g1iVar2 != null) {
            ufaVar.b = g1iVar2;
        } else if (g1iVar3 == g1i.LEGACY_STRICT) {
            ufaVar.a0(g1i.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        ufaVar.R();
                        z = false;
                        try {
                            wfj c = c(jijVar);
                            Class cls = jijVar.a;
                            Object b = c.b(ufaVar);
                            Class b2 = wrn.b(cls);
                            if (b != null && !b2.isInstance(b)) {
                                throw new ClassCastException("Type adapter '" + c + "' returned wrong type; requested " + cls + " but got instance of " + b.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            ufaVar.a0(g1iVar3);
                            obj = b;
                        } catch (EOFException e) {
                            e = e;
                            if (z) {
                                if (obj != null) {
                                }
                                return obj;
                            }
                            throw new RuntimeException(e);
                        }
                    } finally {
                        ufaVar.a0(g1iVar3);
                    }
                } catch (EOFException e2) {
                    e = e2;
                    z = true;
                }
                if (obj != null) {
                    try {
                        if (ufaVar.R() != ega.END_DOCUMENT) {
                            throw new RuntimeException("JSON document was not fully consumed.");
                        }
                    } catch (vyb e3) {
                        throw new RuntimeException(e3);
                    } catch (IOException e4) {
                        throw new RuntimeException(e4);
                    }
                }
                return obj;
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        } catch (AssertionError e6) {
            throw new AssertionError("AssertionError (GSON 2.13.1): " + e6.getMessage(), e6);
        } catch (IllegalStateException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [h19, java.lang.Object] */
    public final wfj c(jij jijVar) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        wfj wfjVar = (wfj) concurrentHashMap.get(jijVar);
        if (wfjVar != null) {
            return wfjVar;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            wfj wfjVar2 = (wfj) map.get(jijVar);
            if (wfjVar2 != null) {
                return wfjVar2;
            }
            z = false;
        }
        try {
            ?? obj = new Object();
            obj.a = null;
            map.put(jijVar, obj);
            Iterator it = this.e.iterator();
            wfj wfjVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wfjVar3 = ((xfj) it.next()).a(this, jijVar);
                if (wfjVar3 != null) {
                    if (obj.a == null) {
                        obj.a = wfjVar3;
                        map.put(jijVar, wfjVar3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (wfjVar3 != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return wfjVar3;
            }
            qp7.k(jijVar, "GSON (2.13.1) cannot handle ");
            return null;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final void d(Map map, Class cls, xga xgaVar) {
        wfj c = c(new jij(cls));
        g1i g1iVar = xgaVar.h;
        g1i g1iVar2 = this.i;
        if (g1iVar2 != null) {
            xgaVar.h = g1iVar2;
        } else if (g1iVar == g1i.LEGACY_STRICT) {
            xgaVar.D(g1i.LENIENT);
        }
        boolean z = xgaVar.i;
        boolean z2 = xgaVar.k;
        xgaVar.i = this.g;
        xgaVar.k = this.f;
        try {
            try {
                try {
                    c.c(xgaVar, map);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e2.getMessage(), e2);
            }
        } finally {
            xgaVar.D(g1iVar);
            xgaVar.i = z;
            xgaVar.k = z2;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}

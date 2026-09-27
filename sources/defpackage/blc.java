package defpackage;

import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class blc {
    public static final ArrayList e;
    public final List a;
    public final int b;
    public final ThreadLocal c = new ThreadLocal();
    public final LinkedHashMap d = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        e = arrayList;
        arrayList.add(i0n.a);
        arrayList.add(wa4.j);
        arrayList.add(s0c.k);
        arrayList.add(wk0.k);
        arrayList.add(urf.h);
        arrayList.add(e44.l);
    }

    public blc(ykc ykcVar) {
        ArrayList arrayList = ykcVar.b;
        int size = arrayList.size();
        ArrayList arrayList2 = e;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.a = Collections.unmodifiableList(arrayList3);
        this.b = ykcVar.a;
    }

    public final JsonAdapter a(Type type) {
        return c(type, s1k.a, null);
    }

    public final JsonAdapter b(Type type, Set set) {
        return c(type, set, null);
    }

    public final JsonAdapter c(Type type, Set set, String str) {
        Object asList;
        JsonAdapter jsonAdapter = null;
        if (type != null) {
            if (set != null) {
                Type h = s1k.h(s1k.a(type));
                if (set.isEmpty()) {
                    asList = h;
                } else {
                    asList = Arrays.asList(h, set);
                }
                synchronized (this.d) {
                    try {
                        JsonAdapter jsonAdapter2 = (JsonAdapter) this.d.get(asList);
                        if (jsonAdapter2 != null) {
                            return jsonAdapter2;
                        }
                        alc alcVar = (alc) this.c.get();
                        if (alcVar == null) {
                            alcVar = new alc(this);
                            this.c.set(alcVar);
                        }
                        ArrayDeque arrayDeque = alcVar.b;
                        ArrayList arrayList = alcVar.a;
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                zkc zkcVar = (zkc) arrayList.get(i);
                                if (zkcVar.j.equals(asList)) {
                                    arrayDeque.add(zkcVar);
                                    jsonAdapter = zkcVar.k;
                                    if (jsonAdapter == null) {
                                        jsonAdapter = zkcVar;
                                    }
                                } else {
                                    i++;
                                }
                            } else {
                                zkc zkcVar2 = new zkc(h, str, asList);
                                arrayList.add(zkcVar2);
                                arrayDeque.add(zkcVar2);
                                break;
                            }
                        }
                        try {
                            if (jsonAdapter != null) {
                                return jsonAdapter;
                            }
                            try {
                                int size2 = this.a.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    JsonAdapter a = ((cda) this.a.get(i2)).a(h, set, this);
                                    if (a != null) {
                                        ((zkc) alcVar.b.getLast()).k = a;
                                        alcVar.b(true);
                                        return a;
                                    }
                                }
                                throw new IllegalArgumentException("No JsonAdapter for " + s1k.k(h, set));
                            } catch (IllegalArgumentException e2) {
                                throw alcVar.a(e2);
                            }
                        } finally {
                            alcVar.b(false);
                        }
                    } finally {
                    }
                }
            }
            dmk.s("annotations == null");
            return null;
        }
        dmk.s("type == null");
        return null;
    }

    public final JsonAdapter d(cda cdaVar, Type type, Set set) {
        if (set != null) {
            Type h = s1k.h(s1k.a(type));
            List list = this.a;
            int indexOf = list.indexOf(cdaVar);
            if (indexOf != -1) {
                int size = list.size();
                for (int i = indexOf + 1; i < size; i++) {
                    JsonAdapter a = ((cda) list.get(i)).a(h, set, this);
                    if (a != null) {
                        return a;
                    }
                }
                dmk.v("No next JsonAdapter for ".concat(s1k.k(h, set)));
                return null;
            }
            qp7.k(cdaVar, "Unable to skip past unknown factory ");
            return null;
        }
        dmk.s("annotations == null");
        return null;
    }
}

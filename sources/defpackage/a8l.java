package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class a8l {
    public static final u74 a = new u74(null);

    public static final KSerializer a(Collection collection, sxg sxgVar) {
        Collection collection2 = collection;
        ArrayList C = CollectionsKt.C(collection2);
        ArrayList arrayList = new ArrayList(CollectionsKt.w(C));
        Iterator it = C.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), sxgVar));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((KSerializer) next).getDescriptor().h())) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(CollectionsKt.w(arrayList2));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((KSerializer) it3.next()).getDescriptor().h());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        KSerializer kSerializer = (KSerializer) CollectionsKt.w0(arrayList2);
        if (kSerializer == null) {
            bin.j(n1i.a);
            kSerializer = b2i.a;
        }
        if (!kSerializer.getDescriptor().b() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            Iterator it4 = collection2.iterator();
            while (it4.hasNext()) {
                if (it4.next() == null) {
                    return bin.c(kSerializer);
                }
            }
        }
        return kSerializer;
    }

    public static final KSerializer b(Object obj, sxg sxgVar) {
        sxgVar.getClass();
        if (obj == null) {
            bin.j(n1i.a);
            return bin.c(b2i.a);
        }
        if (obj instanceof List) {
            return new yk0(a((Collection) obj, sxgVar), 0);
        }
        if (obj instanceof Object[]) {
            Object w = ArraysKt.w((Object[]) obj);
            if (w != null) {
                return b(w, sxgVar);
            }
            bin.j(n1i.a);
            return new yk0(b2i.a, 0);
        }
        if (obj instanceof Set) {
            return new yk0(a((Collection) obj, sxgVar), 2);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return bin.b(a(map.keySet(), sxgVar), a(map.values(), sxgVar));
        }
        Class<?> cls = obj.getClass();
        qvf qvfVar = lvf.a;
        KSerializer m = sxg.m(sxgVar, qvfVar.getOrCreateKotlinClass(cls));
        if (m == null) {
            return sel.g(qvfVar.getOrCreateKotlinClass(obj.getClass()));
        }
        return m;
    }

    public static final KSerializer c(sxg sxgVar, zgj zgjVar) {
        KSerializer h;
        sxgVar.getClass();
        zgjVar.getClass();
        wka wkaVar = zgjVar.b;
        KClass kClass = zgjVar.a;
        if (wkaVar != null) {
            if (wkaVar.d().isEmpty()) {
                h = null;
            } else {
                h = sel.h(sxgVar, wkaVar, false);
            }
            if (h != null) {
                return h;
            }
        }
        KSerializer m = sxg.m(sxgVar, kClass);
        if (m != null) {
            if (wkaVar != null && wkaVar.a()) {
                return bin.c(m);
            }
            return m;
        }
        KSerializer g = sel.g(kClass);
        if (wkaVar != null && wkaVar.a()) {
            return bin.c(g);
        }
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v7l d() {
        Iterator it;
        ArrayList arrayList;
        ClassLoader classLoader = a8l.class.getClassLoader();
        if (v7l.class.equals(v7l.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
                it = Arrays.asList(new a8l[0]).iterator();
                arrayList = new ArrayList();
                while (it.hasNext()) {
                }
                if (arrayList.size() != 1) {
                }
            }
        }
        try {
            it = Arrays.asList(new a8l[0]).iterator();
            arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                    break;
                } catch (ServiceConfigurationError e2) {
                    Logger.getLogger(t7l.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(v7l.class.getSimpleName()), (Throwable) e2);
                }
            }
            if (arrayList.size() != 1) {
                return (v7l) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (v7l) v7l.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e3) {
                xbc.m(e3);
                return null;
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}

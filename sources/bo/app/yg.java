package bo.app;

import android.content.Context;
import android.net.Uri;
import defpackage.b4a;
import defpackage.b69;
import defpackage.e1l;
import defpackage.hdi;
import defpackage.hl1;
import defpackage.ix2;
import defpackage.m0l;
import defpackage.m51;
import defpackage.o1l;
import defpackage.oyk;
import defpackage.pm1;
import defpackage.u0l;
import defpackage.v0l;
import defpackage.v1l;
import defpackage.w1f;
import defpackage.wl1;
import defpackage.ylk;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yg {
    public static final String c(File file) {
        return "Deleting triggers directory at: " + file.getAbsolutePath();
    }

    public final void a(File file, ConcurrentHashMap concurrentHashMap, LinkedHashMap linkedHashMap) {
        file.getClass();
        concurrentHashMap.getClass();
        linkedHashMap.getClass();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            b69.h(this, pm1.V, null, false, new v0l(listFiles, 12), 6);
            try {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (File file2 : listFiles) {
                    if (!concurrentHashMap.containsValue(file2.getPath())) {
                        arrayList.add(file2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (!linkedHashMap.containsValue(((File) obj).getPath())) {
                        arrayList2.add(obj);
                    }
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    File file3 = (File) obj2;
                    b69.h(zg.e, null, null, false, new hl1(file3, 10), 7);
                    file3.getClass();
                    wl1.a(file3);
                }
            } catch (Exception e) {
                b69.h(this, pm1.E, e, false, new v1l(17), 4);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    public final String b(String str) {
        int U;
        str.getClass();
        ?? obj = new Object();
        obj.a = "";
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (lastPathSegment != null && lastPathSegment.length() != 0 && (U = StringsKt.U(lastPathSegment, '.', 0, 6)) > -1) {
            obj.a = lastPathSegment.substring(U);
            b69.h(this, pm1.V, null, false, new m0l(13, obj, str), 6);
        }
        return b4a.b() + ((String) obj.a);
    }

    public static final String b() {
        return "Failed to retrieve local assets from DataStore";
    }

    public static final String b(File file) {
        return "Deleting obsolete asset '" + file.getPath() + "' from filesystem.";
    }

    public final void a(Context context) {
        context.getClass();
        File file = new File(context.getCacheDir(), "ab_triggers");
        b69.h(this, pm1.V, null, false, new hl1(file, 9), 6);
        wl1.a(file);
    }

    public static final String a(String str) {
        return s0.a("Not removing local path for remote path ", str, " from cache because it is being preserved until the end of the app run.");
    }

    public static final String a(File[] fileArr) {
        return "Local triggered asset directory contains files: ".concat(ArraysKt.J(fileArr, " , ", null, null, new ylk(16), 30));
    }

    public static final CharSequence a(File file) {
        String name = file.getName();
        name.getClass();
        return name;
    }

    public static final String a() {
        return "Exception while deleting obsolete assets from filesystem.";
    }

    public final ConcurrentHashMap a(e1l e1lVar) {
        try {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry<w1f, Object> entry : e1lVar.readAllData().entrySet()) {
                w1f key = entry.getKey();
                Object value = entry.getValue();
                if (!StringsKt.T(key.a) && (value instanceof String) && !StringsKt.T((CharSequence) value)) {
                    b69.h(this, null, null, false, new m0l(14, (String) value, key), 7);
                    concurrentHashMap.put(key.a, value);
                }
            }
            return concurrentHashMap;
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new v1l(16), 4);
            return new ConcurrentHashMap();
        }
    }

    public static final String a(Object obj, w1f w1fVar) {
        StringBuilder sb = new StringBuilder("Retrieving trigger local asset path '");
        sb.append((String) obj);
        sb.append("' from DataStore for remote path '");
        return m51.m(sb, w1fVar.a, '\'');
    }

    public final LinkedHashSet a(ConcurrentHashMap concurrentHashMap, Set set, LinkedHashMap linkedHashMap) {
        concurrentHashMap.getClass();
        set.getClass();
        linkedHashMap.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = new HashSet(concurrentHashMap.keySet()).iterator();
        it.getClass();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (linkedHashMap.containsKey(str)) {
                b69.h(this, null, null, false, new u0l(str, 16), 7);
            } else if (!set.contains(str)) {
                String str2 = (String) concurrentHashMap.remove(str);
                str.getClass();
                linkedHashSet.add(str);
                if (str2 != null && !StringsKt.T(str2)) {
                    b69.h(this, null, null, false, new o1l(str2, str, 6), 7);
                    wl1.a(new File(str2));
                }
            }
        }
        return linkedHashSet;
    }

    public static final String a(String str, String str2) {
        return hdi.p("Removing obsolete local path ", str, " for obsolete remote path ", str2, " from cache.");
    }

    public final Pair a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sa saVar = (sa) it.next();
            if (!((rh) saVar).c) {
                b69.h(this, null, null, false, new oyk(saVar, 8), 7);
            } else {
                ArrayList a = saVar.a();
                int size = a.size();
                int i = 0;
                while (i < size) {
                    Object obj = a.get(i);
                    i++;
                    yd ydVar = (yd) obj;
                    String str = ydVar.b;
                    if (!StringsKt.T(str)) {
                        b69.h(this, null, null, false, new m0l(15, saVar, str), 7);
                        linkedHashSet.add(ydVar);
                        linkedHashSet2.add(str);
                    }
                }
            }
        }
        return new Pair(linkedHashSet, linkedHashSet2);
    }

    public static final String a(sa saVar) {
        return p0.a(new StringBuilder("Pre-fetch off for triggered action "), ((rh) saVar).a, ". Not pre-fetching assets.");
    }

    public static final String a(sa saVar, String str) {
        return "Received new remote path for triggered action " + ((rh) saVar).a + " at " + str + '.';
    }

    public static final String a(Ref.ObjectRef objectRef, String str) {
        return ix2.p(new StringBuilder("Using file extension "), (String) objectRef.a, " for remote asset url: ", str);
    }
}

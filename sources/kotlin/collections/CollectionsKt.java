package kotlin.collections;

import defpackage.ahh;
import defpackage.ail;
import defpackage.bah;
import defpackage.bn1;
import defpackage.bp;
import defpackage.c1c;
import defpackage.dmk;
import defpackage.eb4;
import defpackage.f27;
import defpackage.fd7;
import defpackage.fnf;
import defpackage.gb4;
import defpackage.gnf;
import defpackage.h3;
import defpackage.hhj;
import defpackage.iwg;
import defpackage.k3;
import defpackage.l3;
import defpackage.of2;
import defpackage.pk0;
import defpackage.qi4;
import defpackage.scb;
import defpackage.sl0;
import defpackage.sv6;
import defpackage.tl0;
import defpackage.vzg;
import defpackage.xc7;
import defpackage.xja;
import defpackage.yja;
import defpackage.zk0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"eb4", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/a", "fb4", "gb4", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/b", "hb4", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
/* loaded from: classes6.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    public static List A(int i, List list) {
        list.getClass();
        if (i >= 0) {
            List list2 = list;
            int size = list.size() - i;
            if (size < 0) {
                size = 0;
            }
            return D0(size, list2);
        }
        f27.q(sv6.j(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static LinkedHashSet A0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection h = CollectionsKt__MutableCollectionsKt.h(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!h.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static Object B(int i, Iterable iterable) {
        iterable.getClass();
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        of2 of2Var = new of2(i, 5);
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            of2Var.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i >= 0) {
            int i2 = 0;
            for (Object obj : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return obj;
                }
                i2 = i3;
            }
            of2Var.invoke(Integer.valueOf(i));
            throw null;
        }
        of2Var.invoke(Integer.valueOf(i));
        throw null;
    }

    public static float B0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            f += ((Number) it.next()).floatValue();
        }
        return f;
    }

    public static ArrayList C(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int C0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return i;
    }

    public static Object D(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return E((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        ahh.i("Collection is empty.");
        return null;
    }

    public static List D0(int i, Iterable iterable) {
        iterable.getClass();
        if (i >= 0) {
            if (i == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return M0(iterable);
                }
                if (i == 1) {
                    return eb4.c(D(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return CollectionsKt__CollectionsKt.d(arrayList);
        }
        f27.q(sv6.j(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static Object E(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        ahh.i("List is empty.");
        return null;
    }

    public static List E0(int i, List list) {
        list.getClass();
        if (i >= 0) {
            if (i == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            int size = list.size();
            if (i >= size) {
                return M0(list);
            }
            if (i == 1) {
                return eb4.c(P(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        f27.q(sv6.j(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static Object F(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static void F0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static ArrayList G(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static boolean[] G0(Collection collection) {
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    public static IntRange H(Collection collection) {
        collection.getClass();
        return new kotlin.ranges.a(0, collection.size() - 1, 1);
    }

    public static /* bridge */ /* synthetic */ byte[] H0(ArrayList arrayList) {
        return CollectionsKt___CollectionsKt.toByteArray(arrayList);
    }

    public static int I(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static void I0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static Object J(int i, List list) {
        list.getClass();
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public static float[] J0(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int K(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static HashSet K0(ArrayList arrayList) {
        HashSet hashSet = new HashSet(c1c.a(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 12)));
        I0(arrayList, hashSet);
        return hashSet;
    }

    public static LinkedHashSet L(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection h = CollectionsKt__MutableCollectionsKt.h(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (h.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static int[] L0(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static /* synthetic */ void M(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i) {
        String str4;
        String str5;
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 8) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.m(iterable, appendable, str6, str4, str5, "...", function1);
    }

    public static List M0(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return eb4.c(next);
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return CollectionsKt__CollectionsKt.d(CollectionsKt___CollectionsKt.n(iterable));
    }

    public static String N(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i) {
        String str3;
        String str4;
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 2) != 0) {
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.m(iterable, sb, charSequence2, str3, str4, "...", function1);
        return sb.toString();
    }

    public static long[] N0(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static Object O(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return P((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        ahh.i("Collection is empty.");
        return null;
    }

    public static ArrayList O0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static Object P(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        ahh.i("List is empty.");
        return null;
    }

    public static LinkedHashSet P0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        I0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static int Q(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(obj);
        }
        int i = -1;
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(obj, obj2)) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    public static Set Q0(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(c1c.a(collection.size()));
                    I0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return vzg.b(next);
            }
            return fd7.a;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        I0(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            return vzg.b(linkedHashSet2.iterator().next());
        }
        return fd7.a;
    }

    public static Object R(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static LinkedHashSet R0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        LinkedHashSet P0 = P0(iterable);
        CollectionsKt__MutableCollectionsKt.addAll(P0, iterable2);
        return P0;
    }

    public static Object S(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList S0(ArrayList arrayList, Function1 function1) {
        function1.getClass();
        int i = 1;
        ail.a(2, 1);
        int size = arrayList.size();
        if (size % 1 == 0) {
            i = 0;
        }
        ArrayList arrayList2 = new ArrayList(i + size);
        k3 k3Var = new k3(arrayList);
        for (int i2 = 0; i2 >= 0 && i2 < size; i2++) {
            int i3 = size - i2;
            if (2 <= i3) {
                i3 = 2;
            }
            if (i3 < 2) {
                break;
            }
            int i4 = i3 + i2;
            h3 h3Var = l3.a;
            int size2 = ((ArrayList) k3Var.e).size();
            h3Var.getClass();
            h3.d(i2, i4, size2);
            k3Var.c = i2;
            k3Var.d = i4 - i2;
            arrayList2.add(function1.invoke(k3Var));
        }
        return arrayList2;
    }

    public static List T(Object obj) {
        if (obj != null) {
            return eb4.c(obj);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static sl0 T0(Iterable iterable) {
        iterable.getClass();
        return new sl0(new bn1(iterable, 23), 2);
    }

    public static List U(Object... objArr) {
        objArr.getClass();
        return ArraysKt___ArraysKt.filterNotNull(objArr);
    }

    public static ArrayList U0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static ArrayList V(Iterable iterable, Function1 function1) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        return arrayList;
    }

    public static Comparable W(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Double X(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static Float Y(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Comparable Z(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
            return comparable;
        }
        dmk.t();
        return null;
    }

    public static Object a0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Double b0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static Float c0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Object d0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static ArrayList e0(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && Intrinsics.areEqual(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List f0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection h = CollectionsKt__MutableCollectionsKt.h(iterable2);
        if (h.isEmpty()) {
            return M0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!h.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList g0(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new pk0(objArr, true));
    }

    public static ArrayList h0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        if (iterable instanceof Collection) {
            return i0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList i0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList2, iterable);
        return arrayList2;
    }

    public static List j0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return CollectionsKt___CollectionsKt.plus((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object k0(Collection collection, fnf fnfVar) {
        collection.getClass();
        fnfVar.getClass();
        if (!collection.isEmpty()) {
            return B(gnf.b.d(collection.size()), collection);
        }
        ahh.i("Collection is empty.");
        return null;
    }

    public static void l0(Iterable iterable, scb scbVar) {
        iterable.getClass();
        CollectionsKt__MutableCollectionsKt.i(iterable, scbVar, true);
    }

    public static void m0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        collection.removeAll(CollectionsKt__MutableCollectionsKt.h(iterable));
    }

    public static void n0(List list, Function1 function1) {
        int size;
        list.getClass();
        function1.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof xja) && !(list instanceof yja)) {
                hhj.h(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                CollectionsKt__MutableCollectionsKt.i(list, function1, true);
                return;
            } catch (ClassCastException e) {
                Intrinsics.f(e, hhj.class.getName());
                throw e;
            }
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size != i) {
                size--;
            } else {
                return;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void o(Collection collection, Iterable iterable) {
        CollectionsKt__MutableCollectionsKt.addAll(collection, iterable);
    }

    public static Object o0(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        ahh.i("List is empty.");
        return null;
    }

    public static void p(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        collection.addAll(asList);
    }

    public static Object p0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        ahh.i("List is empty.");
        return null;
    }

    public static ArrayList q(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new pk0(objArr, true));
    }

    public static Object q0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public static tl0 r(Iterable iterable) {
        iterable.getClass();
        return new tl0(iterable, 1);
    }

    public static void r0(zk0 zk0Var, bp bpVar) {
        CollectionsKt__MutableCollectionsKt.i(zk0Var, bpVar, false);
    }

    public static int s(ArrayList arrayList, Object obj, Comparator comparator) {
        int size = arrayList.size();
        comparator.getClass();
        CollectionsKt__CollectionsKt.e(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int compare = comparator.compare(arrayList.get(i3), obj);
            if (compare < 0) {
                i2 = i3 + 1;
            } else if (compare > 0) {
                i = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static List s0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return M0(iterable);
        }
        List n = CollectionsKt___CollectionsKt.n(iterable);
        Collections.reverse(n);
        return n;
    }

    public static int t(List list, Comparable comparable) {
        int size = list.size();
        list.getClass();
        CollectionsKt__CollectionsKt.e(list.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int b = qi4.b((Comparable) list.get(i3), comparable);
            if (b < 0) {
                i2 = i3 + 1;
            } else if (b > 0) {
                i = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static Object t0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return u0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            dmk.v("Collection has more than one element.");
            return null;
        }
        ahh.i("Collection is empty.");
        return null;
    }

    public static int u(List list, Function1 function1) {
        int size = list.size();
        list.getClass();
        CollectionsKt__CollectionsKt.e(list.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int intValue = ((Number) function1.invoke(list.get(i3))).intValue();
            if (intValue < 0) {
                i2 = i3 + 1;
            } else if (intValue > 0) {
                i = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static Object u0(List list) {
        list.getClass();
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            dmk.v("List has more than one element.");
            return null;
        }
        ahh.i("List is empty.");
        return null;
    }

    public static ArrayList v(int i, Iterable iterable) {
        Iterator a;
        iterable.getClass();
        ail.a(i, i);
        int i2 = 1;
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i3 = size / i;
            if (size % i == 0) {
                i2 = 0;
            }
            ArrayList arrayList = new ArrayList(i3 + i2);
            int i4 = 0;
            while (i4 >= 0 && i4 < size) {
                int i5 = size - i4;
                if (i <= i5) {
                    i5 = i;
                }
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList2.add(list.get(i6 + i4));
                }
                arrayList.add(arrayList2);
                i4 += i;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = iterable.iterator();
        it.getClass();
        if (!it.hasNext()) {
            a = xc7.a;
        } else {
            a = iwg.a(new bah(i, i, it, false, true, null));
        }
        while (a.hasNext()) {
            arrayList3.add((List) a.next());
        }
        return arrayList3;
    }

    public static Object v0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                return null;
            }
            return next;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ int w(Iterable iterable) {
        return CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
    }

    public static Object w0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static boolean x(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (K(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static List x0(ArrayList arrayList, IntRange intRange) {
        if (intRange.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return M0(arrayList.subList(intRange.a, intRange.b + 1));
    }

    public static int y(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                F0();
                throw null;
            }
        }
        return i;
    }

    public static List y0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return M0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            comparableArr.getClass();
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            return ArraysKt.f(array);
        }
        List n = CollectionsKt___CollectionsKt.n(iterable);
        gb4.f(n);
        return n;
    }

    public static List z(int i, Iterable iterable) {
        ArrayList arrayList;
        iterable.getClass();
        if (i >= 0) {
            if (i == 0) {
                return M0(iterable);
            }
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i;
                if (size <= 0) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                if (size == 1) {
                    return eb4.c(O(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i < size2) {
                            arrayList.add(list.get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i2 = 0;
            for (Object obj : iterable) {
                if (i2 >= i) {
                    arrayList.add(obj);
                } else {
                    i2++;
                }
            }
            return CollectionsKt__CollectionsKt.d(arrayList);
        }
        f27.q(sv6.j(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List z0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return M0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            array.getClass();
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            List asList = Arrays.asList(array);
            asList.getClass();
            return asList;
        }
        List n = CollectionsKt___CollectionsKt.n(iterable);
        gb4.g(n, comparator);
        return n;
    }
}

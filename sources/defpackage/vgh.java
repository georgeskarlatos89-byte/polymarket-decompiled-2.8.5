package defpackage;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class vgh {
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Map c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final rgh g;
    public static final Map h;
    public static final LinkedHashMap i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    static {
        Set<String> l0 = ArraysKt.l0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(CollectionsKt.w(l0));
        for (String str : l0) {
            String d2 = kia.BOOLEAN.d();
            d2.getClass();
            arrayList.add(hol.e("java/util/Collection", str, "Ljava/util/Collection;", d2));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.w(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((rgh) it.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.w(arrayList3));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((rgh) it2.next()).b.b());
        }
        String concat = "java/util/".concat("Collection");
        kia kiaVar = kia.BOOLEAN;
        String d3 = kiaVar.d();
        d3.getClass();
        rgh e2 = hol.e(concat, "contains", "Ljava/lang/Object;", d3);
        ugh ughVar = ugh.FALSE;
        Pair pair = new Pair(e2, ughVar);
        String concat2 = "java/util/".concat("Collection");
        String d4 = kiaVar.d();
        d4.getClass();
        Pair pair2 = new Pair(hol.e(concat2, "remove", "Ljava/lang/Object;", d4), ughVar);
        String concat3 = "java/util/".concat("Map");
        String d5 = kiaVar.d();
        d5.getClass();
        Pair pair3 = new Pair(hol.e(concat3, "containsKey", "Ljava/lang/Object;", d5), ughVar);
        String concat4 = "java/util/".concat("Map");
        String d6 = kiaVar.d();
        d6.getClass();
        Pair pair4 = new Pair(hol.e(concat4, "containsValue", "Ljava/lang/Object;", d6), ughVar);
        String concat5 = "java/util/".concat("Map");
        String d7 = kiaVar.d();
        d7.getClass();
        Pair pair5 = new Pair(hol.e(concat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", d7), ughVar);
        Pair pair6 = new Pair(hol.e("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), ugh.MAP_GET_OR_DEFAULT);
        rgh e3 = hol.e("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        ugh ughVar2 = ugh.NULL;
        Pair pair7 = new Pair(e3, ughVar2);
        Pair pair8 = new Pair(hol.e("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), ughVar2);
        String concat6 = "java/util/".concat("List");
        kia kiaVar2 = kia.INT;
        String d8 = kiaVar2.d();
        d8.getClass();
        rgh e4 = hol.e(concat6, "indexOf", "Ljava/lang/Object;", d8);
        ugh ughVar3 = ugh.INDEX;
        Pair pair9 = new Pair(e4, ughVar3);
        String concat7 = "java/util/".concat("List");
        String d9 = kiaVar2.d();
        d9.getClass();
        Map e5 = d1c.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(hol.e(concat7, "lastIndexOf", "Ljava/lang/Object;", d9), ughVar3));
        c = e5;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c1c.a(e5.size()));
        for (Map.Entry entry : e5.entrySet()) {
            linkedHashMap.put(((rgh) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet h2 = f.h(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.w(h2));
        Iterator it3 = h2.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((rgh) it3.next()).b);
        }
        e = CollectionsKt.Q0(arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.w(h2));
        Iterator it4 = h2.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((rgh) it4.next()).e);
        }
        f = CollectionsKt.Q0(arrayList6);
        kia kiaVar3 = kia.INT;
        String d10 = kiaVar3.d();
        d10.getClass();
        rgh e6 = hol.e("java/util/List", "removeAt", d10, "Ljava/lang/Object;");
        g = e6;
        String concat8 = "java/lang/".concat("Number");
        String d11 = kia.BYTE.d();
        d11.getClass();
        Pair pair10 = new Pair(hol.e(concat8, "toByte", "", d11), csc.e("byteValue"));
        String concat9 = "java/lang/".concat("Number");
        String d12 = kia.SHORT.d();
        d12.getClass();
        Pair pair11 = new Pair(hol.e(concat9, "toShort", "", d12), csc.e("shortValue"));
        String concat10 = "java/lang/".concat("Number");
        String d13 = kiaVar3.d();
        d13.getClass();
        Pair pair12 = new Pair(hol.e(concat10, "toInt", "", d13), csc.e("intValue"));
        String concat11 = "java/lang/".concat("Number");
        String d14 = kia.LONG.d();
        d14.getClass();
        Pair pair13 = new Pair(hol.e(concat11, "toLong", "", d14), csc.e("longValue"));
        String concat12 = "java/lang/".concat("Number");
        String d15 = kia.FLOAT.d();
        d15.getClass();
        Pair pair14 = new Pair(hol.e(concat12, "toFloat", "", d15), csc.e("floatValue"));
        String concat13 = "java/lang/".concat("Number");
        String d16 = kia.DOUBLE.d();
        d16.getClass();
        Pair pair15 = new Pair(hol.e(concat13, "toDouble", "", d16), csc.e("doubleValue"));
        Pair pair16 = new Pair(e6, csc.e("remove"));
        String concat14 = "java/lang/".concat("CharSequence");
        String d17 = kiaVar3.d();
        d17.getClass();
        String d18 = kia.CHAR.d();
        d18.getClass();
        Map e7 = d1c.e(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(hol.e(concat14, "get", d17, d18), csc.e("charAt")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), csc.e("get")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicInteger"), PlaceTypes.STORE, "I", "V"), csc.e("set")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), csc.e("getAndSet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), csc.e("getAndAdd")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), csc.e("addAndGet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), csc.e("get")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicLong"), PlaceTypes.STORE, "J", "V"), csc.e("set")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), csc.e("getAndSet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), csc.e("getAndAdd")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), csc.e("addAndGet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), csc.e("get")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicBoolean"), PlaceTypes.STORE, "Z", "V"), csc.e("set")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), csc.e("getAndSet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), csc.e("get")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicReference"), PlaceTypes.STORE, "Ljava/lang/Object;", "V"), csc.e("set")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), csc.e("getAndSet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), csc.e("get")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), csc.e("set")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), csc.e("getAndSet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), csc.e("compareAndSet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), csc.e("getAndAdd")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), csc.e("addAndGet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), csc.e("get")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), csc.e("set")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), csc.e("getAndSet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), csc.e("compareAndSet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), csc.e("getAndAdd")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), csc.e("addAndGet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), csc.e("get")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), csc.e("set")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), csc.e("getAndSet")), new Pair(hol.e("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), csc.e("compareAndSet")));
        h = e7;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c1c.a(e7.size()));
        for (Map.Entry entry2 : e7.entrySet()) {
            linkedHashMap2.put(((rgh) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        Map map = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            rgh rghVar = (rgh) entry3.getKey();
            csc cscVar = (csc) entry3.getValue();
            String str2 = rghVar.a;
            String str3 = rghVar.c;
            String str4 = rghVar.d;
            cscVar.getClass();
            str3.getClass();
            str4.getClass();
            linkedHashSet.add(str2 + '.' + (cscVar + '(' + str3 + ')' + str4));
        }
        Set keySet = h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = keySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((rgh) it5.next()).b);
        }
        j = hashSet;
        Set<Map.Entry> entrySet = h.entrySet();
        ArrayList arrayList7 = new ArrayList(CollectionsKt.w(entrySet));
        for (Map.Entry entry4 : entrySet) {
            arrayList7.add(new Pair(((rgh) entry4.getKey()).b, entry4.getValue()));
        }
        int a2 = c1c.a(CollectionsKt.w(arrayList7));
        if (a2 < 16) {
            a2 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(a2);
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            Pair pair17 = (Pair) it6.next();
            linkedHashMap3.put((csc) pair17.getSecond(), (csc) pair17.getFirst());
        }
        k = linkedHashMap3;
    }
}

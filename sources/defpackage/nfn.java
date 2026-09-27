package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class nfn {
    public static vvn a(List list, Function1 function1, Function2 function2) {
        Object next;
        list.getClass();
        List list2 = list;
        Iterator it = list2.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) function1.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) function1.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        }
        if (next != null) {
            ((Number) function1.invoke(next)).intValue();
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((Number) function1.invoke(it2.next())).intValue() == 0) {
                        dmk.v("There should be no empty entries");
                        return null;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            b(arrayList, list, 0, function1, function2);
            arrayList.trimToSize();
            new xl0((char) 0, CollectionsKt.emptyList(), arrayList);
            return new vvn(23);
        }
        ahh.i("Unable to build char tree from an empty list");
        return null;
    }

    public static void b(ArrayList arrayList, List list, int i, Function1 function1, Function2 function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) function2.invoke(obj, Integer.valueOf(i));
            ch.getClass();
            Object obj2 = linkedHashMap.get(ch);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(ch, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char charValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i2 = i + 1;
            ArrayList arrayList2 = new ArrayList();
            List list3 = list2;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list3) {
                if (((Number) function1.invoke(obj3)).intValue() > i2) {
                    arrayList3.add(obj3);
                }
            }
            b(arrayList2, arrayList3, i2, function1, function2);
            arrayList2.trimToSize();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list3) {
                if (((Number) function1.invoke(obj4)).intValue() == i2) {
                    arrayList4.add(obj4);
                }
            }
            arrayList.add(new xl0(charValue, arrayList4, arrayList2));
        }
    }

    public static final float c(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final float d(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int e(int i, float f, int i2) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        dmk.s(str.concat(" must not be null"));
    }
}

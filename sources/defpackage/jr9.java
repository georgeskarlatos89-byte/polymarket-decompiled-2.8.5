package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class jr9 extends xq9 implements List, RandomAccess {
    public static final we8 b = new we8(wwf.e, 0);

    public static wwf j(int i, Object[] objArr) {
        if (i == 0) {
            return wwf.e;
        }
        return new wwf(objArr, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dr9, wq9] */
    public static dr9 k() {
        return new wq9(4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dr9, wq9] */
    public static dr9 l(int i) {
        yon.c(i, "expectedSize");
        return new wq9(i);
    }

    public static jr9 m(Collection collection) {
        if (collection instanceof xq9) {
            jr9 a = ((xq9) collection).a();
            if (a.h()) {
                Object[] array = a.toArray(xq9.a);
                return j(array.length, array);
            }
            return a;
        }
        Object[] array2 = collection.toArray();
        akn.b(array2.length, array2);
        return j(array2.length, array2);
    }

    public static wwf n(Object[] objArr) {
        if (objArr.length == 0) {
            return wwf.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        akn.b(objArr2.length, objArr2);
        return j(objArr2.length, objArr2);
    }

    public static wwf r(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        akn.b(5, objArr);
        return j(5, objArr);
    }

    public static wwf s(Object obj) {
        Object[] objArr = {obj};
        akn.b(1, objArr);
        return j(1, objArr);
    }

    public static wwf t(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        akn.b(2, objArr);
        return j(2, objArr);
    }

    public static wwf u(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        akn.b(3, objArr);
        return j(3, objArr);
    }

    public static wwf v(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        boolean z;
        if (objArr.length <= 2147483635) {
            z = true;
        } else {
            z = false;
        }
        brn.g("the total number of elements must fit in an int", z);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        akn.b(length, objArr2);
        return j(length, objArr2);
    }

    public static wwf x(rmd rmdVar, List list) {
        List list2;
        rmdVar.getClass();
        if (list instanceof Collection) {
            list2 = list;
        } else {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list2 = arrayList;
        }
        Object[] array = list2.toArray();
        akn.b(array.length, array);
        Arrays.sort(array, rmdVar);
        return j(array.length, array);
    }

    public jr9 B(int i, int i2) {
        brn.o(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return wwf.e;
        }
        return new fr9(this, i, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.xq9
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.xq9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i = 0; i < size; i++) {
                            if (ckn.a(get(i), list.get(i))) {
                            }
                        }
                    } else {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && ckn.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // defpackage.xq9
    public final tuj i() {
        return q(0);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.xq9, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return q(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return q(0);
    }

    public final we8 q(int i) {
        brn.n(i, size());
        if (isEmpty()) {
            return b;
        }
        return new we8(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return B(i, i2);
    }

    public jr9 w() {
        if (size() <= 1) {
            return this;
        }
        return new er9(this);
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return q(i);
    }

    @Override // defpackage.xq9
    public final jr9 a() {
        return this;
    }
}

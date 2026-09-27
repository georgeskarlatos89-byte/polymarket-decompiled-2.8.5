package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sd7 implements sf5 {
    public ArrayList a;

    public sd7(int i, boolean z) {
        switch (i) {
            case 2:
                this.a = new ArrayList();
                return;
            default:
                this.a = new ArrayList();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.sf5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(tf5 tf5Var, long j) {
        boolean z;
        boolean z2;
        int size;
        ArrayList arrayList = this.a;
        long j2 = tf5Var.b;
        if (j2 != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        if (j2 <= j) {
            long j3 = tf5Var.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z2 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j2 >= ((tf5) arrayList.get(size)).b) {
                        arrayList.add(size + 1, tf5Var);
                        return z2;
                    }
                    if (((tf5) arrayList.get(size)).b <= j) {
                        z2 = false;
                    }
                }
                arrayList.add(0, tf5Var);
                return z2;
            }
        }
        z2 = false;
        while (size >= 0) {
        }
        arrayList.add(0, tf5Var);
        return z2;
    }

    @Override // defpackage.sf5
    public jr9 b(long j) {
        int j2 = j(j);
        if (j2 == 0) {
            we8 we8Var = jr9.b;
            return wwf.e;
        }
        tf5 tf5Var = (tf5) this.a.get(j2 - 1);
        long j3 = tf5Var.d;
        if (j3 != -9223372036854775807L && j >= j3) {
            we8 we8Var2 = jr9.b;
            return wwf.e;
        }
        return tf5Var.a;
    }

    @Override // defpackage.sf5
    public long c(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((tf5) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((tf5) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                tf5 tf5Var = (tf5) arrayList.get(i - 1);
                long j3 = tf5Var.d;
                if (j3 != -9223372036854775807L && j3 <= j) {
                    return j3;
                }
                return tf5Var.b;
            }
        }
        tf5 tf5Var2 = (tf5) dwm.g(arrayList);
        long j4 = tf5Var2.d;
        if (j4 != -9223372036854775807L && j >= j4) {
            return j4;
        }
        return tf5Var2.b;
    }

    @Override // defpackage.sf5
    public void clear() {
        this.a.clear();
    }

    @Override // defpackage.sf5
    public long d(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j < ((tf5) arrayList.get(0)).b) {
                return ((tf5) arrayList.get(0)).b;
            }
            for (int i = 1; i < arrayList.size(); i++) {
                long j2 = ((tf5) arrayList.get(i)).b;
                if (j < j2) {
                    long j3 = ((tf5) arrayList.get(i - 1)).d;
                    if (j3 != -9223372036854775807L && j3 > j && j3 < j2) {
                        return j3;
                    }
                    return j2;
                }
            }
            long j4 = ((tf5) dwm.g(arrayList)).d;
            if (j4 != -9223372036854775807L && j < j4) {
                return j4;
            }
            return Long.MIN_VALUE;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.sf5
    public void e(long j) {
        ArrayList arrayList = this.a;
        int j2 = j(j);
        if (j2 == 0) {
            return;
        }
        long j3 = ((tf5) arrayList.get(j2 - 1)).d;
        if (j3 == -9223372036854775807L || j3 >= j) {
            j2--;
        }
        arrayList.subList(0, j2).clear();
    }

    public void f(Object obj) {
        this.a.add(obj);
    }

    public void g(List list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.a = arrayList;
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.a;
        if (isEmpty) {
            arrayList2.addAll(list);
            return;
        }
        int size = arrayList2.size() - 1;
        ofh ofhVar = (ofh) this.a.get(size);
        ofh ofhVar2 = (ofh) list.get(0);
        int i = ofhVar.c;
        int i2 = ofhVar.d;
        int i3 = i + i2;
        int i4 = ofhVar2.c;
        ArrayList arrayList3 = this.a;
        if (i3 == i4) {
            arrayList3.set(size, new ofh(ofhVar.a, ofhVar.b, i, i2 + ofhVar2.d));
            this.a.addAll(list.subList(1, list.size()));
        } else {
            arrayList3.addAll(list);
        }
    }

    public void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g(((o8d) it.next()).b());
        }
    }

    public void i(Object obj) {
        ArrayList arrayList = this.a;
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(arrayList, objArr);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                arrayList.addAll((Collection) obj);
                return;
            }
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else if (obj instanceof Iterator) {
                Iterator it2 = (Iterator) obj;
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    public int j(long j) {
        ArrayList arrayList = this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((tf5) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public sd7(int i) {
        this.a = new ArrayList(i);
    }
}

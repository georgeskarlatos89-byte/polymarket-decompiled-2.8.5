package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ddh implements Parcelable, hxh, List, RandomAccess, zja {
    public static final Parcelable.Creator<ddh> CREATOR = new cdh(0);
    public dxh a;

    public ddh(r4 r4Var) {
        kch h = qch.h();
        dxh dxhVar = new dxh(h.g(), r4Var);
        if (!(h instanceof rw8)) {
            dxhVar.b = new dxh(1L, r4Var);
        }
        this.a = dxhVar;
    }

    public final void K0(int i, int i2) {
        int i3;
        r4 r4Var;
        kch h;
        boolean a;
        do {
            synchronized (edh.a) {
                dxh dxhVar = this.a;
                dxhVar.getClass();
                dxh dxhVar2 = (dxh) qch.f(dxhVar);
                i3 = dxhVar2.d;
                r4Var = dxhVar2.c;
            }
            r4Var.getClass();
            wke d = r4Var.d();
            d.subList(i, i2).clear();
            r4 c = d.c();
            if (!Intrinsics.areEqual(c, r4Var)) {
                dxh dxhVar3 = this.a;
                dxhVar3.getClass();
                synchronized (qch.c) {
                    h = qch.h();
                    a = edh.a((dxh) qch.w(dxhVar3, this, h), i3, c, true);
                }
                qch.l(h, this);
            } else {
                return;
            }
        } while (!a);
    }

    @Override // defpackage.hxh
    public final mxh O() {
        return this.a;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        r4 r4Var;
        kch h;
        boolean a;
        do {
            synchronized (edh.a) {
                dxh dxhVar = this.a;
                dxhVar.getClass();
                dxh dxhVar2 = (dxh) qch.f(dxhVar);
                i = dxhVar2.d;
                r4Var = dxhVar2.c;
            }
            r4Var.getClass();
            r4 b = r4Var.b(obj);
            if (Intrinsics.areEqual(b, r4Var)) {
                return false;
            }
            dxh dxhVar3 = this.a;
            dxhVar3.getClass();
            synchronized (qch.c) {
                h = qch.h();
                a = edh.a((dxh) qch.w(dxhVar3, this, h), i, b, true);
            }
            qch.l(h, this);
        } while (!a);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        r4 r4Var;
        kch h;
        boolean a;
        do {
            synchronized (edh.a) {
                dxh dxhVar = this.a;
                dxhVar.getClass();
                dxh dxhVar2 = (dxh) qch.f(dxhVar);
                i = dxhVar2.d;
                r4Var = dxhVar2.c;
            }
            r4Var.getClass();
            r4 c = r4Var.c(collection);
            if (Intrinsics.areEqual(c, r4Var)) {
                return false;
            }
            dxh dxhVar3 = this.a;
            dxhVar3.getClass();
            synchronized (qch.c) {
                h = qch.h();
                a = edh.a((dxh) qch.w(dxhVar3, this, h), i, c, true);
            }
            qch.l(h, this);
        } while (!a);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        kch h;
        dxh dxhVar = this.a;
        dxhVar.getClass();
        synchronized (qch.c) {
            h = qch.h();
            dxh dxhVar2 = (dxh) qch.w(dxhVar, this, h);
            synchronized (edh.a) {
                dxhVar2.c = nah.c;
                dxhVar2.d++;
                dxhVar2.e++;
            }
        }
        qch.l(h, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return edh.b(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return edh.b(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return edh.b(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return edh.b(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return edh.b(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // defpackage.hxh
    public final void l(mxh mxhVar) {
        mxhVar.b = this.a;
        this.a = (dxh) mxhVar;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return edh.b(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new i89(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        r4 r4Var;
        r4 r4Var2;
        kch h;
        boolean a;
        do {
            synchronized (edh.a) {
                dxh dxhVar = this.a;
                dxhVar.getClass();
                dxh dxhVar2 = (dxh) qch.f(dxhVar);
                i = dxhVar2.d;
                r4Var = dxhVar2.c;
            }
            r4Var.getClass();
            int indexOf = r4Var.indexOf(obj);
            if (indexOf != -1) {
                r4Var2 = r4Var.h(indexOf);
            } else {
                r4Var2 = r4Var;
            }
            if (Intrinsics.areEqual(r4Var2, r4Var)) {
                return false;
            }
            dxh dxhVar3 = this.a;
            dxhVar3.getClass();
            synchronized (qch.c) {
                h = qch.h();
                a = edh.a((dxh) qch.w(dxhVar3, this, h), i, r4Var2, true);
            }
            qch.l(h, this);
        } while (!a);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        r4 r4Var;
        kch h;
        boolean a;
        do {
            synchronized (edh.a) {
                dxh dxhVar = this.a;
                dxhVar.getClass();
                dxh dxhVar2 = (dxh) qch.f(dxhVar);
                i = dxhVar2.d;
                r4Var = dxhVar2.c;
            }
            r4Var.getClass();
            r4 f = r4Var.f(new p4(0, collection));
            if (Intrinsics.areEqual(f, r4Var)) {
                return false;
            }
            dxh dxhVar3 = this.a;
            dxhVar3.getClass();
            synchronized (qch.c) {
                h = qch.h();
                a = edh.a((dxh) qch.w(dxhVar3, this, h), i, f, true);
            }
            qch.l(h, this);
        } while (!a);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return edh.d(this, new p4(3, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        r4 r4Var;
        kch h;
        boolean a;
        Object obj2 = get(i);
        do {
            synchronized (edh.a) {
                dxh dxhVar = this.a;
                dxhVar.getClass();
                dxh dxhVar2 = (dxh) qch.f(dxhVar);
                i2 = dxhVar2.d;
                r4Var = dxhVar2.c;
            }
            r4Var.getClass();
            r4 i3 = r4Var.i(i, obj);
            if (Intrinsics.areEqual(i3, r4Var)) {
                break;
            }
            dxh dxhVar3 = this.a;
            dxhVar3.getClass();
            synchronized (qch.c) {
                h = qch.h();
                a = edh.a((dxh) qch.w(dxhVar3, this, h), i2, i3, false);
            }
            qch.l(h, this);
        } while (!a);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return edh.b(this).c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        boolean z;
        if (i >= 0 && i <= i2 && i2 <= size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f1f.a("fromIndex or toIndex are out of bounds");
        }
        return new eai(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pel.f(this);
    }

    public final String toString() {
        dxh dxhVar = this.a;
        dxhVar.getClass();
        return "SnapshotStateList(value=" + ((dxh) qch.f(dxhVar)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        r4 r4Var = edh.b(this).c;
        int size = r4Var.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(r4Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pel.g(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new i89(this, i);
    }

    public ddh() {
        this(nah.c);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        r4 r4Var;
        kch h;
        boolean a;
        do {
            synchronized (edh.a) {
                dxh dxhVar = this.a;
                dxhVar.getClass();
                dxh dxhVar2 = (dxh) qch.f(dxhVar);
                i2 = dxhVar2.d;
                r4Var = dxhVar2.c;
            }
            r4Var.getClass();
            r4 a2 = r4Var.a(i, obj);
            if (Intrinsics.areEqual(a2, r4Var)) {
                return;
            }
            dxh dxhVar3 = this.a;
            dxhVar3.getClass();
            synchronized (qch.c) {
                h = qch.h();
                a = edh.a((dxh) qch.w(dxhVar3, this, h), i2, a2, true);
            }
            qch.l(h, this);
        } while (!a);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return edh.d(this, new ok0(i, collection, 6));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        r4 r4Var;
        kch h;
        boolean a;
        Object obj = get(i);
        do {
            synchronized (edh.a) {
                dxh dxhVar = this.a;
                dxhVar.getClass();
                dxh dxhVar2 = (dxh) qch.f(dxhVar);
                i2 = dxhVar2.d;
                r4Var = dxhVar2.c;
            }
            r4Var.getClass();
            r4 h2 = r4Var.h(i);
            if (Intrinsics.areEqual(h2, r4Var)) {
                break;
            }
            dxh dxhVar3 = this.a;
            dxhVar3.getClass();
            synchronized (qch.c) {
                h = qch.h();
                a = edh.a((dxh) qch.w(dxhVar3, this, h), i2, h2, true);
            }
            qch.l(h, this);
        } while (!a);
        return obj;
    }
}

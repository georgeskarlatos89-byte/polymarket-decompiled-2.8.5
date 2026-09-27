package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class r4b extends u4 implements s4b, RandomAccess {
    public final ArrayList b;

    static {
        new r4b(10).a = false;
    }

    public r4b(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.s4b
    public final void S0(fw1 fw1Var) {
        a();
        this.b.add(fw1Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.u4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof s4b) {
            collection = ((s4b) collection).e();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.s4b
    public final List e() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.s4b
    public final s4b g() {
        if (this.a) {
            return new xuj(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof fw1) {
            fw1 fw1Var = (fw1) obj;
            Charset charset = d5a.a;
            if (fw1Var.size() == 0) {
                str = "";
            } else {
                cw1 cw1Var = (cw1) fw1Var;
                str = new String(cw1Var.d, cw1Var.h(), cw1Var.size(), charset);
            }
            cw1 cw1Var2 = (cw1) fw1Var;
            int h = cw1Var2.h();
            if (f1k.a.d(cw1Var2.d, h, cw1Var2.size() + h)) {
                arrayList.set(i, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, d5a.a);
        if (f1k.a.d(bArr, 0, bArr.length)) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // defpackage.s4b
    public final Object h1(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.b5a
    public final b5a q0(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i);
            arrayList2.addAll(arrayList);
            return new r4b(arrayList2);
        }
        omf.a();
        return null;
    }

    @Override // defpackage.u4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof fw1) {
            fw1 fw1Var = (fw1) remove;
            Charset charset = d5a.a;
            if (fw1Var.size() == 0) {
                return "";
            }
            cw1 cw1Var = (cw1) fw1Var;
            return new String(cw1Var.d, cw1Var.h(), cw1Var.size(), charset);
        }
        return new String((byte[]) remove, d5a.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof fw1) {
            fw1 fw1Var = (fw1) obj2;
            Charset charset = d5a.a;
            if (fw1Var.size() == 0) {
                return "";
            }
            cw1 cw1Var = (cw1) fw1Var;
            return new String(cw1Var.d, cw1Var.h(), cw1Var.size(), charset);
        }
        return new String((byte[]) obj2, d5a.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public r4b(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}

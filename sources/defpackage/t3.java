package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class t3 implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public t3(c4 c4Var, int i) {
        Iterator it;
        this.a = 10;
        this.d = c4Var;
        Collection collection = c4Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public void a() {
        c4 c4Var = (c4) this.d;
        c4Var.b();
        if (c4Var.c == ((Collection) this.c)) {
            return;
        }
        f27.g();
    }

    public void b() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 5:
                c4 c4Var = (c4) obj;
                c4Var.zzb();
                if (c4Var.c != ((Collection) this.c)) {
                    f27.g();
                    return;
                }
                return;
            case 6:
            default:
                c4 c4Var2 = (c4) obj;
                c4Var2.zzb();
                if (c4Var2.c != ((Collection) this.c)) {
                    f27.g();
                    return;
                }
                return;
            case 7:
                c4 c4Var3 = (c4) obj;
                c4Var3.zzb();
                if (c4Var3.c != ((Collection) this.c)) {
                    f27.g();
                    return;
                }
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            case 1:
                return this.b.hasNext();
            case 2:
                a();
                return this.b.hasNext();
            case 3:
                return this.b.hasNext();
            case 4:
                return this.b.hasNext();
            case 5:
                b();
                return this.b.hasNext();
            case 6:
                return this.b.hasNext();
            case 7:
                b();
                return this.b.hasNext();
            case 8:
                return this.b.hasNext();
            case 9:
                return this.b.hasNext();
            default:
                b();
                return this.b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        c4 c4Var;
        c4 c4Var2;
        c4 c4Var3;
        int i = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((u3) obj).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return it.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) it.next();
                this.c = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                Collection collection = (Collection) entry3.getValue();
                qdl qdlVar = (qdl) ((u3) obj).e;
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    c4Var = new c4(qdlVar, key, list, (c4) null);
                } else {
                    c4Var = new c4(qdlVar, key, list, (c4) null);
                }
                return new hgl(key, c4Var);
            case 4:
                Map.Entry entry4 = (Map.Entry) it.next();
                this.c = (Collection) entry4.getValue();
                Object key2 = entry4.getKey();
                eel eelVar = (eel) ((u3) obj).e;
                List list2 = (List) ((Collection) entry4.getValue());
                if (list2 instanceof RandomAccess) {
                    c4Var2 = new c4(eelVar, key2, list2, (c4) null);
                } else {
                    c4Var2 = new c4(eelVar, key2, list2, (c4) null);
                }
                return new ogl(key2, c4Var2);
            case 5:
                b();
                return it.next();
            case 6:
                Map.Entry entry5 = (Map.Entry) it.next();
                this.c = entry5;
                return entry5.getKey();
            case 7:
                b();
                return it.next();
            case 8:
                Map.Entry entry6 = (Map.Entry) it.next();
                this.c = (Collection) entry6.getValue();
                Object key3 = entry6.getKey();
                Collection collection2 = (Collection) entry6.getValue();
                zhl zhlVar = (zhl) ((u3) obj).e;
                List list3 = (List) collection2;
                if (list3 instanceof RandomAccess) {
                    c4Var3 = new c4(zhlVar, key3, list3, (c4) null);
                } else {
                    c4Var3 = new c4(zhlVar, key3, list3, (c4) null);
                }
                return new all(key3, c4Var3);
            case 9:
                Map.Entry entry7 = (Map.Entry) it.next();
                this.c = entry7;
                return entry7.getKey();
            default:
                b();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        boolean z = false;
        Object obj = this.d;
        Iterator it = this.b;
        switch (i) {
            case 0:
                if (((Collection) this.c) != null) {
                    z = true;
                }
                brn.r("no calls to next() since the last call to remove()", z);
                it.remove();
                ((aoc) ((u3) obj).e).e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 1:
                if (((Map.Entry) this.c) != null) {
                    z = true;
                }
                brn.r("no calls to next() since the last call to remove()", z);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((v3) obj).c.e -= collection.size();
                collection.clear();
                this.c = null;
                return;
            case 2:
                it.remove();
                c4 c4Var = (c4) obj;
                ((aoc) c4Var.f).e--;
                c4Var.c();
                return;
            case 3:
                if (((Collection) this.c) != null) {
                    z = true;
                }
                if (z) {
                    it.remove();
                    ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                    return;
                }
                dmk.n("no calls to next() since the last call to remove()");
                return;
            case 4:
                if (((Collection) this.c) != null) {
                    z = true;
                }
                if (z) {
                    it.remove();
                    ((eel) ((u3) obj).e).d -= ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                    return;
                }
                dmk.n("no calls to next() since the last call to remove()");
                return;
            case 5:
                it.remove();
                ((c4) obj).f();
                return;
            case 6:
                Map.Entry entry = (Map.Entry) this.c;
                if (entry != null) {
                    z = true;
                }
                if (z) {
                    Collection collection2 = (Collection) entry.getValue();
                    it.remove();
                    ((jcl) obj).c.d -= collection2.size();
                    collection2.clear();
                    this.c = null;
                    return;
                }
                dmk.n("no calls to next() since the last call to remove()");
                return;
            case 7:
                it.remove();
                c4 c4Var2 = (c4) obj;
                eel eelVar = (eel) c4Var2.f;
                eelVar.d--;
                c4Var2.f();
                return;
            case 8:
                if (((Collection) this.c) != null) {
                    z = true;
                }
                scn.d("no calls to next() since the last call to remove()", z);
                it.remove();
                ((zhl) ((u3) obj).e).e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 9:
                if (((Map.Entry) this.c) != null) {
                    z = true;
                }
                scn.d("no calls to next() since the last call to remove()", z);
                Collection collection3 = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((ugl) obj).c.e -= collection3.size();
                collection3.clear();
                this.c = null;
                return;
            default:
                it.remove();
                c4 c4Var3 = (c4) obj;
                zhl zhlVar = (zhl) c4Var3.f;
                zhlVar.e--;
                c4Var3.f();
                return;
        }
    }

    public t3(c4 c4Var, ListIterator listIterator, char c) {
        this.a = 7;
        this.d = c4Var;
        this.c = c4Var.c;
        this.b = listIterator;
    }

    public t3(c4 c4Var, ListIterator listIterator, int i) {
        this.a = 10;
        this.d = c4Var;
        this.c = c4Var.c;
        this.b = listIterator;
    }

    public /* synthetic */ t3(AbstractSet abstractSet, Iterator it, int i) {
        this.a = i;
        this.b = it;
        this.d = abstractSet;
    }

    public t3(u3 u3Var, byte b) {
        this.a = 3;
        this.d = u3Var;
        this.b = u3Var.b.entrySet().iterator();
    }

    public t3(u3 u3Var, char c) {
        this.a = 4;
        this.d = u3Var;
        this.b = u3Var.b.entrySet().iterator();
    }

    public t3(u3 u3Var, int i) {
        this.a = 8;
        this.d = u3Var;
        this.b = ((gi4) u3Var.b).entrySet().iterator();
    }

    public t3(c4 c4Var, byte b) {
        Iterator it;
        this.a = 5;
        this.d = c4Var;
        Collection collection = c4Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public t3(c4 c4Var, char c) {
        Iterator it;
        this.a = 7;
        this.d = c4Var;
        Collection collection = c4Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public t3(c4 c4Var, ListIterator listIterator, byte b) {
        this.a = 5;
        this.d = c4Var;
        this.c = c4Var.c;
        this.b = listIterator;
    }

    public t3(c4 c4Var) {
        Iterator it;
        this.a = 2;
        this.d = c4Var;
        Collection collection = c4Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public t3(c4 c4Var, ListIterator listIterator) {
        this.a = 2;
        this.d = c4Var;
        this.c = c4Var.c;
        this.b = listIterator;
    }

    public t3(u3 u3Var) {
        this.a = 0;
        this.d = u3Var;
        this.b = u3Var.b.entrySet().iterator();
    }
}

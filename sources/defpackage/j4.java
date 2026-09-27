package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class j4 extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((aoc) obj).b();
                return;
            case 1:
                ((gi4) obj).clear();
                return;
            case 2:
                ((u3) obj).clear();
                return;
            case 3:
                ((gi4) obj).clear();
                return;
            case 4:
                ((gi4) obj).clear();
                return;
            case 5:
                ((zhl) ((xhl) obj)).c();
                return;
            case 6:
                ((u3) obj).clear();
                return;
            case 7:
                ((u3) obj).clear();
                return;
            case 8:
                ((gi4) obj).clear();
                return;
            default:
                ((u3) obj).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Iterator it = ((aoc) obj2).a().values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            case 3:
            case 4:
            case 8:
            default:
                return super.contains(obj);
            case 2:
                return ((u3) obj2).containsValue(obj);
            case 5:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    c4 b = ((u3) ((xhl) obj2).a()).b(key);
                    if (b != null && b.contains(value)) {
                        return true;
                    }
                }
                return false;
            case 6:
                return ((u3) obj2).containsValue(obj);
            case 7:
                return ((u3) obj2).containsValue(obj);
            case 9:
                return ((u3) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                return ((u3) obj).isEmpty();
            case 6:
                return ((u3) obj).isEmpty();
            case 7:
                return ((u3) obj).isEmpty();
            case 9:
                return ((u3) obj).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new r3((aoc) obj);
            case 1:
                gi4 gi4Var = (gi4) obj;
                Map b = gi4Var.b();
                if (b != null) {
                    return b.values().iterator();
                }
                return new ci4(gi4Var, 2);
            case 2:
                return new qbj(0, ((u3) obj).entrySet().iterator());
            case 3:
                gi4 gi4Var2 = (gi4) obj;
                Map o = gi4Var2.o();
                if (o != null) {
                    return o.values().iterator();
                }
                return new bel(gi4Var2, 2);
            case 4:
                gi4 gi4Var3 = (gi4) obj;
                Map o2 = gi4Var3.o();
                if (o2 != null) {
                    return o2.values().iterator();
                }
                return new mel(gi4Var3, 2);
            case 5:
                return new r3((zhl) ((xhl) obj));
            case 6:
                return new vuj(3, ((u3) obj).entrySet().iterator());
            case 7:
                return new qbj(1, ((u3) obj).entrySet().iterator());
            case 8:
                gi4 gi4Var4 = (gi4) obj;
                Map o3 = gi4Var4.o();
                if (o3 != null) {
                    return o3.values().iterator();
                }
                return new gil(gi4Var4, 2);
            default:
                return new vuj(4, ((u3) obj).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                u3 u3Var = (u3) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : u3Var.entrySet()) {
                        if (ckn.a(obj, entry.getValue())) {
                            u3Var.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
            case 4:
            case 8:
            default:
                return super.remove(obj);
            case 5:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                c4 b = ((u3) ((xhl) obj2).a()).b(key);
                if (b == null || !b.remove(value)) {
                    return false;
                }
                return true;
            case 6:
                u3 u3Var2 = (u3) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry3 : u3Var2.entrySet()) {
                        if (jhn.c(obj, entry3.getValue())) {
                            u3Var2.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 7:
                u3 u3Var3 = (u3) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry4 : u3Var3.entrySet()) {
                        if (ghn.c(obj, entry4.getValue())) {
                            u3Var3.remove(entry4.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 9:
                u3 u3Var4 = (u3) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused4) {
                    for (Map.Entry entry5 : u3Var4.entrySet()) {
                        if (mcn.d(obj, entry5.getValue())) {
                            u3Var4.remove(entry5.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                u3 u3Var = (u3) obj;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : u3Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return u3Var.keySet().removeAll(hashSet);
                }
            case 6:
                u3 u3Var2 = (u3) obj;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : u3Var2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((eel) u3Var2.e).b().removeAll(hashSet2);
                }
            case 7:
                u3 u3Var3 = (u3) obj;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : u3Var3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((qdl) u3Var3.e).b().removeAll(hashSet3);
                }
            case 9:
                u3 u3Var4 = (u3) obj;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused4) {
                    HashSet hashSet4 = new HashSet();
                    for (Map.Entry entry4 : u3Var4.entrySet()) {
                        if (collection.contains(entry4.getValue())) {
                            hashSet4.add(entry4.getKey());
                        }
                    }
                    return ((zhl) u3Var4.e).b().removeAll(hashSet4);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                u3 u3Var = (u3) obj;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : u3Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return u3Var.keySet().retainAll(hashSet);
                }
            case 6:
                u3 u3Var2 = (u3) obj;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : u3Var2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((eel) u3Var2.e).b().retainAll(hashSet2);
                }
            case 7:
                u3 u3Var3 = (u3) obj;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : u3Var3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((qdl) u3Var3.e).b().retainAll(hashSet3);
                }
            case 9:
                u3 u3Var4 = (u3) obj;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused4) {
                    HashSet hashSet4 = new HashSet();
                    for (Map.Entry entry4 : u3Var4.entrySet()) {
                        if (collection.contains(entry4.getValue())) {
                            hashSet4.add(entry4.getKey());
                        }
                    }
                    return ((zhl) u3Var4.e).b().retainAll(hashSet4);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((aoc) obj).e;
            case 1:
                return ((gi4) obj).size();
            case 2:
                return ((u3) obj).b.size();
            case 3:
                return ((gi4) obj).size();
            case 4:
                return ((gi4) obj).size();
            case 5:
                return ((zhl) ((xhl) obj)).e;
            case 6:
                return ((u3) obj).b.size();
            case 7:
                return ((u3) obj).b.size();
            case 8:
                return ((gi4) obj).size();
            default:
                return ((u3) obj).size();
        }
    }

    public /* synthetic */ j4(AbstractMap abstractMap, int i) {
        this.a = i;
        this.b = abstractMap;
    }
}

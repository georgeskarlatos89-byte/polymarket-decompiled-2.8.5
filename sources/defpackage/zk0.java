package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class zk0 extends AbstractSet {
    public final /* synthetic */ int a;
    public final Object b;

    public zk0(h3k[] h3kVarArr) {
        this.a = 1;
        this.b = h3kVarArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((oah) obj2).e((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((pah) obj2).g((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((r9l) obj2).c((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 5:
            default:
                return super.add(obj);
            case 6:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((x2n) obj2).b((Comparable) entry4.getKey(), entry4.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                ((oah) obj).clear();
                return;
            case 3:
                ((pah) obj).clear();
                return;
            case 4:
                ((r9l) obj).clear();
                return;
            case 5:
            default:
                super.clear();
                return;
            case 6:
                ((x2n) obj).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                Object obj3 = ((oah) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj3 == value) {
                    return true;
                }
                if (obj3 != null && obj3.equals(value)) {
                    return true;
                }
                return false;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj4 = ((pah) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj4 == value2) {
                    return true;
                }
                if (obj4 != null && obj4.equals(value2)) {
                    return true;
                }
                return false;
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj5 = ((r9l) obj2).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj5 == value3) {
                    return true;
                }
                if (obj5 != null && obj5.equals(value3)) {
                    return true;
                }
                return false;
            case 5:
            default:
                return super.contains(obj);
            case 6:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj6 = ((x2n) obj2).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj6 == value4) {
                    return true;
                }
                if (obj6 != null && obj6.equals(value4)) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new cl0((fl0) obj);
            case 1:
                return new qq9((h3k[]) obj, 1);
            case 2:
                return new tah((oah) obj, 0);
            case 3:
                return new tah((pah) obj, 1);
            case 4:
                return new tah((r9l) obj, 2);
            case 5:
                return new e6l(this, 1);
            case 6:
                return new tah((x2n) obj, 3);
            default:
                return new e6l(this, 3);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((oah) obj2).remove(entry.getKey());
                return true;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((pah) obj2).remove(entry2.getKey());
                return true;
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((r9l) obj2).remove(entry3.getKey());
                return true;
            case 5:
            default:
                return super.remove(obj);
            case 6:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((x2n) obj2).remove(entry4.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((fl0) obj).c;
            case 1:
                return ((h3k[]) obj).length / 2;
            case 2:
                return ((oah) obj).size();
            case 3:
                return ((pah) obj).size();
            case 4:
                return ((r9l) obj).size();
            case 5:
                return ((ejl) obj).e;
            case 6:
                return ((x2n) obj).size();
            default:
                return ((v2o) obj).e;
        }
    }

    public /* synthetic */ zk0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}

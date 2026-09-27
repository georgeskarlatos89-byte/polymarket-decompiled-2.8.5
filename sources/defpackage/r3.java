package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class r3 implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public Collection d;
    public Iterator e;
    public final /* synthetic */ Serializable f;

    public r3(zhl zhlVar) {
        this.a = 1;
        this.f = zhlVar;
        this.b = zhlVar.d.entrySet().iterator();
        this.c = null;
        this.d = null;
        this.e = nml.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (!this.b.hasNext() && !this.e.hasNext()) {
                    return false;
                }
                return true;
            default:
                if (!this.b.hasNext() && !this.e.hasNext()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                if (!this.e.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.c = entry.getKey();
                    Collection collection = (Collection) entry.getValue();
                    this.d = collection;
                    this.e = collection.iterator();
                }
                return this.e.next();
            default:
                if (!this.e.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    this.c = entry2.getKey();
                    Collection collection2 = (Collection) entry2.getValue();
                    this.d = collection2;
                    this.e = collection2.iterator();
                }
                return new all(this.c, this.e.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Serializable serializable = this.f;
        Iterator it = this.b;
        switch (i) {
            case 0:
                this.e.remove();
                Collection collection = this.d;
                Objects.requireNonNull(collection);
                if (collection.isEmpty()) {
                    it.remove();
                }
                aoc aocVar = (aoc) serializable;
                aocVar.e--;
                return;
            default:
                this.e.remove();
                Collection collection2 = this.d;
                Objects.requireNonNull(collection2);
                if (collection2.isEmpty()) {
                    it.remove();
                }
                zhl zhlVar = (zhl) serializable;
                zhlVar.e--;
                return;
        }
    }

    public r3(aoc aocVar) {
        this.a = 0;
        this.f = aocVar;
        this.b = aocVar.d.entrySet().iterator();
        this.c = null;
        this.d = null;
        this.e = l9a.INSTANCE;
    }
}

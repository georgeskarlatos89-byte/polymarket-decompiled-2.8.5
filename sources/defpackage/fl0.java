package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class fl0 extends b7h implements Map {
    public zk0 d;
    public bl0 e;
    public dl0 f;

    @Override // java.util.Map
    public final Set entrySet() {
        zk0 zk0Var = this.d;
        if (zk0Var == null) {
            zk0 zk0Var2 = new zk0(this, 0);
            this.d = zk0Var2;
            return zk0Var2;
        }
        return zk0Var;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        bl0 bl0Var = this.e;
        if (bl0Var == null) {
            bl0 bl0Var2 = new bl0(this);
            this.e = bl0Var2;
            return bl0Var2;
        }
        return bl0Var;
    }

    public final boolean l(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        if (i != this.c) {
            return true;
        }
        return false;
    }

    public final boolean m(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                h(i2);
            }
        }
        if (i != this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        dl0 dl0Var = this.f;
        if (dl0Var == null) {
            dl0 dl0Var2 = new dl0(this);
            this.f = dl0Var2;
            return dl0Var2;
        }
        return dl0Var;
    }
}

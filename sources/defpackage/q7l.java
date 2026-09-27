package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class q7l extends otk implements Set {
    public transient c0o g;
    public final /* synthetic */ int h;
    public final transient y9l i;
    public final transient Serializable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7l(y9l y9lVar, Serializable serializable, int i) {
        super(4);
        this.h = i;
        this.i = y9lVar;
        this.j = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.h;
        y9l y9lVar = this.i;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || !value.equals(y9lVar.get(key))) {
                    return false;
                }
                return true;
            default:
                if (y9lVar.get(obj) == null) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int i2 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.h) {
            case 0:
                return r().t(0);
            default:
                return ((c9l) this.j).t(0);
        }
    }

    @Override // defpackage.otk
    public final int m(Object[] objArr) {
        switch (this.h) {
            case 0:
                return r().m(objArr);
            default:
                return ((c9l) this.j).m(objArr);
        }
    }

    public final c0o r() {
        c0o c0oVar = this.g;
        if (c0oVar == null) {
            z6l z6lVar = new z6l(this);
            this.g = z6lVar;
            return z6lVar;
        }
        return c0oVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.h) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }
}

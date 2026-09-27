package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ekl extends otk implements Set {
    public transient tgl g;
    public final /* synthetic */ int h;
    public final transient y9l i;
    public final transient Serializable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ekl(y9l y9lVar, Serializable serializable, int i) {
        super(2);
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

    @Override // defpackage.otk
    public final int f(Object[] objArr) {
        switch (this.h) {
            case 0:
                tgl tglVar = this.g;
                if (tglVar == null) {
                    tglVar = new zjl(this);
                    this.g = tglVar;
                }
                return tglVar.f(objArr);
            default:
                return ((kkl) this.j).f(objArr);
        }
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
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                tgl tglVar = this.g;
                if (tglVar == null) {
                    tglVar = new zjl(this);
                    this.g = tglVar;
                }
                return tglVar.t(0);
            default:
                return ((kkl) this.j).t(0);
        }
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

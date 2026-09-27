package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rpl extends wkl implements Set {
    public transient sll b;
    public final /* synthetic */ int c;
    public final transient y9l d;
    public final transient Serializable e;

    public /* synthetic */ rpl(y9l y9lVar, Serializable serializable, int i) {
        this.c = i;
        this.d = y9lVar;
        this.e = serializable;
    }

    @Override // defpackage.wkl
    public final int a(Object[] objArr, int i) {
        switch (this.c) {
            case 0:
                sll sllVar = this.b;
                if (sllVar == null) {
                    sllVar = new kpl(this);
                    this.b = sllVar;
                }
                return sllVar.a(objArr, i);
            default:
                return ((ypl) this.e).a(objArr, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.c;
        y9l y9lVar = this.d;
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
        if (obj == this || this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return lfn.e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.c) {
            case 0:
                sll sllVar = this.b;
                if (sllVar == null) {
                    sllVar = new kpl(this);
                    this.b = sllVar;
                }
                return sllVar.h(0);
            default:
                return ((ypl) this.e).h(0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.c) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }
}

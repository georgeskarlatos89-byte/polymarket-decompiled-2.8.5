package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dib extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ fib b;

    public /* synthetic */ dib(fib fibVar, int i) {
        this.a = i;
        this.b = fibVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        fib fibVar = this.b;
        switch (i) {
            case 0:
                fibVar.clear();
                return;
            default:
                fibVar.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        eib a;
        int i = this.a;
        fib fibVar = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                eib eibVar = null;
                if (key != null) {
                    try {
                        a = fibVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && Objects.equals(a.h, entry.getValue())) {
                        eibVar = a;
                    }
                    if (eibVar != null) {
                        return false;
                    }
                    return true;
                }
                a = null;
                if (a != null) {
                    eibVar = a;
                }
                if (eibVar != null) {
                }
            default:
                return fibVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        fib fibVar = this.b;
        switch (i) {
            case 0:
                return new cib(fibVar, 0);
            default:
                return new cib(fibVar, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        eib a;
        int i = this.a;
        eib eibVar = null;
        fib fibVar = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        a = fibVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && Objects.equals(a.h, entry.getValue())) {
                        eibVar = a;
                    }
                    if (eibVar != null) {
                        return false;
                    }
                    fibVar.c(eibVar, true);
                    return true;
                }
                a = null;
                if (a != null) {
                    eibVar = a;
                }
                if (eibVar != null) {
                }
            default:
                if (obj != null) {
                    try {
                        eibVar = fibVar.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (eibVar != null) {
                    fibVar.c(eibVar, true);
                }
                if (eibVar == null) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        fib fibVar = this.b;
        switch (i) {
            case 0:
                return fibVar.d;
            default:
                return fibVar.d;
        }
    }
}

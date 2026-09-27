package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class yhb extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ bib b;

    public /* synthetic */ yhb(bib bibVar, int i) {
        this.a = i;
        this.b = bibVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        bib bibVar = this.b;
        switch (i) {
            case 0:
                bibVar.clear();
                return;
            default:
                bibVar.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        aib a;
        Object obj2;
        Object value;
        int i = this.a;
        bib bibVar = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                aib aibVar = null;
                if (key != null) {
                    try {
                        a = bibVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && ((obj2 = a.h) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        aibVar = a;
                    }
                    if (aibVar != null) {
                        return false;
                    }
                    return true;
                }
                a = null;
                if (a != null) {
                    aibVar = a;
                }
                if (aibVar != null) {
                }
            default:
                return bibVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        bib bibVar = this.b;
        switch (i) {
            case 0:
                return new xhb(bibVar, 0);
            default:
                return new xhb(bibVar, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        aib a;
        Object obj2;
        Object value;
        int i = this.a;
        aib aibVar = null;
        bib bibVar = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        a = bibVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && ((obj2 = a.h) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        aibVar = a;
                    }
                    if (aibVar != null) {
                        return false;
                    }
                    bibVar.c(aibVar, true);
                    return true;
                }
                a = null;
                if (a != null) {
                    aibVar = a;
                }
                if (aibVar != null) {
                }
            default:
                if (obj != null) {
                    try {
                        aibVar = bibVar.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (aibVar != null) {
                    bibVar.c(aibVar, true);
                }
                if (aibVar == null) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        bib bibVar = this.b;
        switch (i) {
            case 0:
                return bibVar.d;
            default:
                return bibVar.d;
        }
    }
}

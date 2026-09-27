package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class y9l implements Map, Serializable {
    public final /* synthetic */ int a;
    public final transient Object[] b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;
    public transient AbstractCollection e;

    public /* synthetic */ y9l(Object[] objArr, int i) {
        this.a = i;
        this.b = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            case 1:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            case 2:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            default:
                if (get(obj) != null) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.a;
        Object[] objArr = this.b;
        switch (i) {
            case 0:
                c9l c9lVar = (c9l) this.e;
                if (c9lVar == null) {
                    c9lVar = new c9l(objArr, 1);
                    this.e = c9lVar;
                }
                return c9lVar.contains(obj);
            case 1:
                dkl dklVar = (dkl) this.e;
                if (dklVar == null) {
                    dklVar = new dkl(this.b, 1);
                    this.e = dklVar;
                }
                return dklVar.contains(obj);
            case 2:
                kkl kklVar = (kkl) this.e;
                if (kklVar == null) {
                    kklVar = new kkl(objArr, 1);
                    this.e = kklVar;
                }
                return kklVar.contains(obj);
            default:
                ypl yplVar = (ypl) this.e;
                if (yplVar == null) {
                    yplVar = new ypl(objArr, 1);
                    this.e = yplVar;
                }
                return yplVar.contains(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.io.Serializable] */
    @Override // java.util.Map
    public final Set entrySet() {
        int i = this.a;
        ?? r1 = this.b;
        switch (i) {
            case 0:
                q7l q7lVar = (q7l) this.c;
                if (q7lVar == null) {
                    q7l q7lVar2 = new q7l(this, r1, 0);
                    this.c = q7lVar2;
                    return q7lVar2;
                }
                return q7lVar;
            case 1:
                tjl tjlVar = (tjl) this.c;
                if (tjlVar == null) {
                    tjl tjlVar2 = new tjl(this, this.b, 0);
                    this.c = tjlVar2;
                    return tjlVar2;
                }
                return tjlVar;
            case 2:
                ekl eklVar = (ekl) this.c;
                if (eklVar == null) {
                    ekl eklVar2 = new ekl(this, r1, 0);
                    this.c = eklVar2;
                    return eklVar2;
                }
                return eklVar;
            default:
                rpl rplVar = (rpl) this.c;
                if (rplVar == null) {
                    rpl rplVar2 = new rpl(this, r1, 0);
                    this.c = rplVar2;
                    return rplVar2;
                }
                return rplVar;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return entrySet().equals(((Map) obj).entrySet());
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return entrySet().equals(((Map) obj).entrySet());
            case 2:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return entrySet().equals(((Map) obj).entrySet());
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return entrySet().equals(((Map) obj).entrySet());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i = this.a;
        Object[] objArr = this.b;
        switch (i) {
            case 0:
                if (obj != null) {
                    Object obj6 = objArr[0];
                    Objects.requireNonNull(obj6);
                    if (obj6.equals(obj)) {
                        obj2 = objArr[1];
                        Objects.requireNonNull(obj2);
                        if (obj2 != null) {
                            return null;
                        }
                        return obj2;
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                }
            case 1:
                if (obj != null) {
                    Object obj7 = objArr[0];
                    obj7.getClass();
                    if (obj7.equals(obj)) {
                        obj3 = objArr[1];
                        obj3.getClass();
                        if (obj3 != null) {
                            return null;
                        }
                        return obj3;
                    }
                }
                obj3 = null;
                if (obj3 != null) {
                }
            case 2:
                if (obj != null) {
                    Object obj8 = objArr[0];
                    Objects.requireNonNull(obj8);
                    if (obj8.equals(obj)) {
                        obj4 = objArr[1];
                        Objects.requireNonNull(obj4);
                        if (obj4 != null) {
                            return null;
                        }
                        return obj4;
                    }
                }
                obj4 = null;
                if (obj4 != null) {
                }
            default:
                if (obj != null) {
                    Object obj9 = objArr[0];
                    Objects.requireNonNull(obj9);
                    if (obj9.equals(obj)) {
                        obj5 = objArr[1];
                        Objects.requireNonNull(obj5);
                        if (obj5 != null) {
                            return null;
                        }
                        return obj5;
                    }
                }
                obj5 = null;
                if (obj5 != null) {
                }
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = get(obj);
                if (obj3 != null) {
                    return obj3;
                }
                return obj2;
            case 1:
                Object obj4 = get(obj);
                if (obj4 != null) {
                    return obj4;
                }
                return obj2;
            case 2:
                Object obj5 = get(obj);
                if (obj5 != null) {
                    return obj5;
                }
                return obj2;
            default:
                Object obj6 = get(obj);
                if (obj6 != null) {
                    return obj6;
                }
                return obj2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object[], java.io.Serializable] */
    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        ?? r1 = this.b;
        switch (i4) {
            case 0:
                q7l q7lVar = (q7l) this.c;
                if (q7lVar == null) {
                    q7lVar = new q7l(this, r1, 0);
                    this.c = q7lVar;
                }
                int i5 = 0;
                for (Object obj : q7lVar) {
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    i5 += i;
                }
                return i5;
            case 1:
                tjl tjlVar = (tjl) this.c;
                if (tjlVar == null) {
                    tjlVar = new tjl(this, this.b, 0);
                    this.c = tjlVar;
                }
                int i6 = 0;
                for (Object obj2 : tjlVar) {
                    if (obj2 != null) {
                        i2 = obj2.hashCode();
                    } else {
                        i2 = 0;
                    }
                    i6 += i2;
                }
                return i6;
            case 2:
                ekl eklVar = (ekl) this.c;
                if (eklVar == null) {
                    eklVar = new ekl(this, r1, 0);
                    this.c = eklVar;
                }
                int i7 = 0;
                for (Object obj3 : eklVar) {
                    if (obj3 != null) {
                        i3 = obj3.hashCode();
                    } else {
                        i3 = 0;
                    }
                    i7 += i3;
                }
                return i7;
            default:
                rpl rplVar = (rpl) this.c;
                if (rplVar == null) {
                    rplVar = new rpl(this, r1, 0);
                    this.c = rplVar;
                }
                return lfn.e(rplVar);
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        int i = this.a;
        Object[] objArr = this.b;
        switch (i) {
            case 0:
                q7l q7lVar = (q7l) this.d;
                if (q7lVar == null) {
                    q7l q7lVar2 = new q7l(this, new c9l(objArr, 0), 1);
                    this.d = q7lVar2;
                    return q7lVar2;
                }
                return q7lVar;
            case 1:
                tjl tjlVar = (tjl) this.d;
                if (tjlVar == null) {
                    tjl tjlVar2 = new tjl(this, new dkl(this.b, 0), 1);
                    this.d = tjlVar2;
                    return tjlVar2;
                }
                return tjlVar;
            case 2:
                ekl eklVar = (ekl) this.d;
                if (eklVar == null) {
                    ekl eklVar2 = new ekl(this, new kkl(objArr, 0), 1);
                    this.d = eklVar2;
                    return eklVar2;
                }
                return eklVar;
            default:
                rpl rplVar = (rpl) this.d;
                if (rplVar == null) {
                    rpl rplVar2 = new rpl(this, new ypl(objArr, 0), 1);
                    this.d = rplVar2;
                    return rplVar2;
                }
                return rplVar;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.a) {
            case 0:
                return 1;
            case 1:
                return 1;
            case 2:
                return 1;
            default:
                return 1;
        }
    }

    public final String toString() {
        boolean z = true;
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb.append('{');
                Iterator it = ((q7l) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            case 1:
                StringBuilder sb2 = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb2.append('{');
                Iterator it2 = ((tjl) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z = false;
                }
                sb2.append('}');
                return sb2.toString();
            case 2:
                StringBuilder sb3 = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb3.append('{');
                Iterator it3 = ((ekl) entrySet()).iterator();
                while (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    if (!z) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z = false;
                }
                sb3.append('}');
                return sb3.toString();
            default:
                StringBuilder sb4 = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb4.append('{');
                Iterator it4 = ((rpl) entrySet()).iterator();
                while (it4.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it4.next();
                    if (!z) {
                        sb4.append(", ");
                    }
                    sb4.append(entry4.getKey());
                    sb4.append('=');
                    sb4.append(entry4.getValue());
                    z = false;
                }
                sb4.append('}');
                return sb4.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        int i = this.a;
        Object[] objArr = this.b;
        switch (i) {
            case 0:
                c9l c9lVar = (c9l) this.e;
                if (c9lVar == null) {
                    c9l c9lVar2 = new c9l(objArr, 1);
                    this.e = c9lVar2;
                    return c9lVar2;
                }
                return c9lVar;
            case 1:
                dkl dklVar = (dkl) this.e;
                if (dklVar == null) {
                    dkl dklVar2 = new dkl(this.b, 1);
                    this.e = dklVar2;
                    return dklVar2;
                }
                return dklVar;
            case 2:
                kkl kklVar = (kkl) this.e;
                if (kklVar == null) {
                    kkl kklVar2 = new kkl(objArr, 1);
                    this.e = kklVar2;
                    return kklVar2;
                }
                return kklVar;
            default:
                ypl yplVar = (ypl) this.e;
                if (yplVar == null) {
                    ypl yplVar2 = new ypl(objArr, 1);
                    this.e = yplVar2;
                    return yplVar2;
                }
                return yplVar;
        }
    }
}

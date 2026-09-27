package defpackage;

import com.appsflyer.internal.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xzb implements Map, Serializable, bka {
    public static final tzb n = new tzb(null);
    public static final xzb o;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public zzb j;
    public a0c k;
    public yzb l;
    public boolean m;

    static {
        xzb xzbVar = new xzb(0);
        xzbVar.m = true;
        o = xzbVar;
    }

    public xzb(int i) {
        if (i >= 0) {
            Object[] objArr = new Object[i];
            int[] iArr = new int[i];
            n.getClass();
            int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
            this.a = objArr;
            this.b = null;
            this.c = iArr;
            this.d = new int[highestOneBit];
            this.e = 2;
            this.f = 0;
            this.g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        dmk.v("capacity must be non-negative.");
        throw null;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.e * 2;
            int length = this.d.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.d;
                int i4 = iArr[i];
                if (i4 == 0) {
                    int i5 = this.f;
                    Object[] objArr = this.a;
                    if (i5 >= objArr.length) {
                        f(1);
                    } else {
                        int i6 = i5 + 1;
                        this.f = i6;
                        objArr[i5] = obj;
                        this.c[i5] = i;
                        iArr[i] = i6;
                        this.i++;
                        this.h++;
                        if (i3 > this.e) {
                            this.e = i3;
                        }
                        return i5;
                    }
                } else {
                    if (Intrinsics.areEqual(this.a[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        j(this.d.length * 2);
                        break;
                    }
                    int i7 = i - 1;
                    if (i == 0) {
                        i = this.d.length - 1;
                    } else {
                        i = i7;
                    }
                }
            }
        }
    }

    public final xzb b() {
        c();
        this.m = true;
        if (this.i > 0) {
            return this;
        }
        xzb xzbVar = o;
        xzbVar.getClass();
        return xzbVar;
    }

    public final void c() {
        if (!this.m) {
            return;
        }
        l.g();
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        f8n.c(this.a, 0, this.f);
        Object[] objArr = this.b;
        if (objArr != null) {
            f8n.c(objArr, 0, this.f);
        }
        this.i = 0;
        this.f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        f8n.c(this.a, i3, i);
        if (objArr != null) {
            f8n.c(objArr, i3, this.f);
        }
        this.f = i3;
    }

    public final boolean e(Collection collection) {
        boolean areEqual;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = g(entry.getKey());
                    if (g < 0) {
                        areEqual = false;
                    } else {
                        Object[] objArr = this.b;
                        objArr.getClass();
                        areEqual = Intrinsics.areEqual(objArr[g], entry.getValue());
                    }
                    if (!areEqual) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        yzb yzbVar = this.l;
        if (yzbVar == null) {
            yzb yzbVar2 = new yzb(this);
            this.l = yzbVar2;
            return yzbVar2;
        }
        return yzbVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.i != map.size() || !e(map.entrySet())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(int i) {
        Object[] objArr;
        Object[] objArr2 = this.a;
        int length = objArr2.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        int i5 = 1;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i6 = i2 + i;
        if (i6 >= 0) {
            if (i6 > objArr2.length) {
                h3 h3Var = l3.a;
                int length2 = objArr2.length;
                h3Var.getClass();
                int e = h3.e(length2, i6);
                Object[] objArr3 = this.a;
                objArr3.getClass();
                this.a = Arrays.copyOf(objArr3, e);
                Object[] objArr4 = this.b;
                if (objArr4 != null) {
                    objArr = Arrays.copyOf(objArr4, e);
                } else {
                    objArr = null;
                }
                this.b = objArr;
                this.c = Arrays.copyOf(this.c, e);
                n.getClass();
                if (e >= 1) {
                    i5 = e;
                }
                int highestOneBit = Integer.highestOneBit(i5 * 3);
                if (highestOneBit > this.d.length) {
                    j(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.e;
        while (true) {
            int i3 = this.d[i];
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            if (Intrinsics.areEqual(this.a[i4], obj)) {
                return i4;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            int i5 = i - 1;
            if (i == 0) {
                i = this.d.length - 1;
            } else {
                i = i5;
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        return objArr[g];
    }

    public final int h(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                if (Intrinsics.areEqual(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int i2;
        uzb uzbVar = new uzb(this, 0);
        int i3 = 0;
        while (uzbVar.hasNext()) {
            int i4 = uzbVar.a;
            xzb xzbVar = (xzb) uzbVar.d;
            if (i4 < xzbVar.f) {
                uzbVar.a = i4 + 1;
                uzbVar.b = i4;
                Object obj = xzbVar.a[i4];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = xzbVar.b;
                objArr.getClass();
                Object obj2 = objArr[uzbVar.b];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                uzbVar.e();
                i3 += i ^ i2;
            } else {
                dmk.t();
                return 0;
            }
        }
        return i3;
    }

    public final int i(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.g;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.i == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i) {
        this.h++;
        int i2 = 0;
        if (this.f > this.i) {
            d(false);
        }
        this.d = new int[i];
        n.getClass();
        this.g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f) {
            int i3 = i2 + 1;
            int i4 = i(this.a[i2]);
            int i5 = this.e;
            while (true) {
                int[] iArr = this.d;
                if (iArr[i4] == 0) {
                    break;
                }
                i5--;
                if (i5 >= 0) {
                    int i6 = i4 - 1;
                    if (i4 == 0) {
                        i4 = iArr.length - 1;
                    } else {
                        i4 = i6;
                    }
                } else {
                    dmk.n("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
            }
        }
    }

    public final void k(int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        Object[] objArr = this.a;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i5 = this.c[i];
        loop0: while (true) {
            int i6 = i5;
            int i7 = 0;
            do {
                int i8 = i5 - 1;
                if (i5 == 0) {
                    i5 = this.d.length - 1;
                } else {
                    i5 = i8;
                }
                int[] iArr2 = this.d;
                i2 = iArr2[i5];
                i7++;
                if (i7 > this.e) {
                    iArr2[i6] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i6] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    i4 = i(this.a[i3]) - i5;
                    iArr = this.d;
                }
            } while ((i4 & (iArr.length - 1)) < i7);
            iArr[i6] = i2;
            this.c[i3] = i6;
        }
        this.c[i] = -1;
        this.i--;
        this.h++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzb zzbVar = this.j;
        if (zzbVar == null) {
            zzb zzbVar2 = new zzb(this, 0);
            this.j = zzbVar2;
            return zzbVar2;
        }
        return zzbVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.b = objArr;
            } else {
                dmk.v("capacity must be non-negative.");
                return null;
            }
        }
        if (a < 0) {
            int i = (-a) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[a] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            f(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a = a(entry.getKey());
                Object[] objArr = this.b;
                if (objArr == null) {
                    int length = this.a.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.b = objArr;
                    } else {
                        dmk.v("capacity must be non-negative.");
                        return;
                    }
                }
                if (a >= 0) {
                    objArr[a] = entry.getValue();
                } else {
                    int i = (-a) - 1;
                    if (!Intrinsics.areEqual(entry.getValue(), objArr[i])) {
                        objArr[i] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        Object obj2 = objArr[g];
        k(g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        int i = 0;
        uzb uzbVar = new uzb(this, 0);
        while (uzbVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = uzbVar.a;
            xzb xzbVar = (xzb) uzbVar.d;
            if (i2 < xzbVar.f) {
                uzbVar.a = i2 + 1;
                uzbVar.b = i2;
                Object obj = xzbVar.a[i2];
                if (obj == xzbVar) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = xzbVar.b;
                objArr.getClass();
                Object obj2 = objArr[uzbVar.b];
                if (obj2 == xzbVar) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                uzbVar.e();
                i++;
            } else {
                dmk.t();
                return null;
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        a0c a0cVar = this.k;
        if (a0cVar == null) {
            a0c a0cVar2 = new a0c(this, 0);
            this.k = a0cVar2;
            return a0cVar2;
        }
        return a0cVar;
    }

    public xzb() {
        this(8);
    }
}

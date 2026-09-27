package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gi4 extends AbstractMap implements Serializable {
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static final Object m = new Object();
    public static final Object n = new Object();
    public final /* synthetic */ int a;
    public transient Object b;
    public transient int[] c;
    public transient Object[] d;
    public transient Object[] e;
    public transient int f;
    public transient int g;
    public transient AbstractSet h;
    public transient AbstractSet i;
    public transient AbstractCollection j;

    public gi4(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.f = Math.min(Math.max(12, 1), 1073741823);
                return;
            case 2:
                this.f = Math.min(Math.max(12, 1), 1073741823);
                return;
            case 3:
                this.f = Math.min(Math.max(12, 1), 1073741823);
                return;
            default:
                return;
        }
    }

    public static gi4 a(int i) {
        boolean z;
        gi4 gi4Var = new gi4(0);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        brn.g("Expected size must be >= 0", z);
        gi4Var.f = Math.min(Math.max(i, 1), 1073741823);
        return gi4Var;
    }

    public Object A(Object obj) {
        switch (this.a) {
            case 1:
                if (!s()) {
                    int u = u();
                    Object obj2 = this.b;
                    Objects.requireNonNull(obj2);
                    int c = bdn.c(obj, null, u, obj2, l(), m(), null);
                    if (c != -1) {
                        Object obj3 = n()[c];
                        q(c, u);
                        this.g--;
                        this.f += 32;
                        return obj3;
                    }
                }
                return l;
            default:
                if (!s()) {
                    int u2 = u();
                    Object obj4 = this.b;
                    Objects.requireNonNull(obj4);
                    int c2 = nen.c(obj, null, u2, obj4, l(), m(), null);
                    if (c2 != -1) {
                        Object obj5 = n()[c2];
                        q(c2, u2);
                        this.g--;
                        this.f += 32;
                        return obj5;
                    }
                }
                return n;
        }
    }

    public Map b() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public int c() {
        return (1 << (this.f & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                if (!f()) {
                    this.f += 32;
                    Map b = b();
                    if (b != null) {
                        this.f = Math.min(Math.max(size(), 3), 1073741823);
                        b.clear();
                        this.b = null;
                        this.g = 0;
                        return;
                    }
                    Arrays.fill(i(), 0, this.g, (Object) null);
                    Arrays.fill(j(), 0, this.g, (Object) null);
                    Object obj = this.b;
                    Objects.requireNonNull(obj);
                    if (obj instanceof byte[]) {
                        Arrays.fill((byte[]) obj, (byte) 0);
                    } else if (obj instanceof short[]) {
                        Arrays.fill((short[]) obj, (short) 0);
                    } else {
                        Arrays.fill((int[]) obj, 0);
                    }
                    Arrays.fill(h(), 0, this.g, 0);
                    this.g = 0;
                    return;
                }
                return;
            case 1:
                if (!s()) {
                    this.f += 32;
                    Map o = o();
                    if (o != null) {
                        this.f = Math.min(Math.max(size(), 3), 1073741823);
                        o.clear();
                        this.b = null;
                        this.g = 0;
                        return;
                    }
                    Arrays.fill(m(), 0, this.g, (Object) null);
                    Arrays.fill(n(), 0, this.g, (Object) null);
                    Object obj2 = this.b;
                    Objects.requireNonNull(obj2);
                    if (obj2 instanceof byte[]) {
                        Arrays.fill((byte[]) obj2, (byte) 0);
                    } else if (obj2 instanceof short[]) {
                        Arrays.fill((short[]) obj2, (short) 0);
                    } else {
                        Arrays.fill((int[]) obj2, 0);
                    }
                    Arrays.fill(l(), 0, this.g, 0);
                    this.g = 0;
                    return;
                }
                return;
            case 2:
                if (!r()) {
                    this.f += 32;
                    Map o2 = o();
                    if (o2 != null) {
                        this.f = Math.min(Math.max(size(), 3), 1073741823);
                        o2.clear();
                        this.b = null;
                        this.g = 0;
                        return;
                    }
                    Object[] objArr = this.d;
                    objArr.getClass();
                    Arrays.fill(objArr, 0, this.g, (Object) null);
                    Object[] objArr2 = this.e;
                    objArr2.getClass();
                    Arrays.fill(objArr2, 0, this.g, (Object) null);
                    Object obj3 = this.b;
                    obj3.getClass();
                    if (obj3 instanceof byte[]) {
                        Arrays.fill((byte[]) obj3, (byte) 0);
                    } else if (obj3 instanceof short[]) {
                        Arrays.fill((short[]) obj3, (short) 0);
                    } else {
                        Arrays.fill((int[]) obj3, 0);
                    }
                    int[] iArr = this.c;
                    iArr.getClass();
                    Arrays.fill(iArr, 0, this.g, 0);
                    this.g = 0;
                    return;
                }
                return;
            default:
                if (!s()) {
                    this.f += 32;
                    Map o3 = o();
                    if (o3 != null) {
                        this.f = Math.min(Math.max(size(), 3), 1073741823);
                        o3.clear();
                        this.b = null;
                        this.g = 0;
                        return;
                    }
                    Arrays.fill(m(), 0, this.g, (Object) null);
                    Arrays.fill(n(), 0, this.g, (Object) null);
                    Object obj4 = this.b;
                    Objects.requireNonNull(obj4);
                    if (obj4 instanceof byte[]) {
                        Arrays.fill((byte[]) obj4, (byte) 0);
                    } else if (obj4 instanceof short[]) {
                        Arrays.fill((short[]) obj4, (short) 0);
                    } else {
                        Arrays.fill((int[]) obj4, 0);
                    }
                    Arrays.fill(l(), 0, this.g, 0);
                    this.g = 0;
                    return;
                }
                return;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                Map b = b();
                if (b != null) {
                    return b.containsKey(obj);
                }
                if (d(obj) != -1) {
                    return true;
                }
                return false;
            case 1:
                Map o = o();
                if (o != null) {
                    return o.containsKey(obj);
                }
                if (x(obj) != -1) {
                    return true;
                }
                return false;
            case 2:
                Map o2 = o();
                if (o2 != null) {
                    return o2.containsKey(obj);
                }
                if (v(obj) != -1) {
                    return true;
                }
                return false;
            default:
                Map o3 = o();
                if (o3 != null) {
                    return o3.containsKey(obj);
                }
                if (x(obj) != -1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                Map b = b();
                if (b != null) {
                    return b.containsValue(obj);
                }
                for (int i = 0; i < this.g; i++) {
                    if (ckn.a(obj, j()[i])) {
                        return true;
                    }
                }
                return false;
            case 1:
                Map o = o();
                if (o == null) {
                    for (int i2 = 0; i2 < this.g; i2++) {
                        if (ghn.c(obj, n()[i2])) {
                            return true;
                        }
                    }
                    return false;
                }
                return o.containsValue(obj);
            case 2:
                Map o2 = o();
                if (o2 == null) {
                    for (int i3 = 0; i3 < this.g; i3++) {
                        Object[] objArr = this.e;
                        objArr.getClass();
                        if (jhn.c(obj, objArr[i3])) {
                            return true;
                        }
                    }
                    return false;
                }
                return o2.containsValue(obj);
            default:
                Map o3 = o();
                if (o3 == null) {
                    for (int i4 = 0; i4 < this.g; i4++) {
                        if (mcn.d(obj, n()[i4])) {
                            return true;
                        }
                    }
                    return false;
                }
                return o3.containsValue(obj);
        }
    }

    public int d(Object obj) {
        if (f()) {
            return -1;
        }
        int e = xtl.e(obj);
        int c = c();
        Object obj2 = this.b;
        Objects.requireNonNull(obj2);
        int e2 = eqn.e(e & c, obj2);
        if (e2 == 0) {
            return -1;
        }
        int i = ~c;
        int i2 = e & i;
        do {
            int i3 = e2 - 1;
            int i4 = h()[i3];
            if ((i4 & i) == i2 && ckn.a(obj, i()[i3])) {
                return i3;
            }
            e2 = i4 & c;
        } while (e2 != 0);
        return -1;
    }

    public void e(int i, int i2) {
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] h = h();
        Object[] i3 = i();
        Object[] j = j();
        int size = size();
        int i4 = size - 1;
        if (i < i4) {
            Object obj2 = i3[i4];
            i3[i] = obj2;
            j[i] = j[i4];
            i3[i4] = null;
            j[i4] = null;
            h[i] = h[i4];
            h[i4] = 0;
            int e = xtl.e(obj2) & i2;
            int e2 = eqn.e(e, obj);
            if (e2 == size) {
                eqn.f(e, i + 1, obj);
                return;
            }
            while (true) {
                int i5 = e2 - 1;
                int i6 = h[i5];
                int i7 = i6 & i2;
                if (i7 == size) {
                    h[i5] = eqn.c(i6, i + 1, i2);
                    return;
                }
                e2 = i7;
            }
        } else {
            i3[i] = null;
            j[i] = null;
            h[i] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                di4 di4Var = (di4) this.i;
                if (di4Var == null) {
                    di4 di4Var2 = new di4(this, 0);
                    this.i = di4Var2;
                    return di4Var2;
                }
                return di4Var;
            case 1:
                lel lelVar = (lel) this.i;
                if (lelVar == null) {
                    lel lelVar2 = new lel(this, 0);
                    this.i = lelVar2;
                    return lelVar2;
                }
                return lelVar;
            case 2:
                vel velVar = (vel) this.i;
                if (velVar == null) {
                    vel velVar2 = new vel(this, 0);
                    this.i = velVar2;
                    return velVar2;
                }
                return velVar;
            default:
                jjl jjlVar = (jjl) this.i;
                if (jjlVar == null) {
                    jjl jjlVar2 = new jjl(this, 0);
                    this.i = jjlVar2;
                    return jjlVar2;
                }
                return jjlVar;
        }
    }

    public boolean f() {
        if (this.b == null) {
            return true;
        }
        return false;
    }

    public Object g(Object obj) {
        if (!f()) {
            int c = c();
            Object obj2 = this.b;
            Objects.requireNonNull(obj2);
            int d = eqn.d(obj, null, c, obj2, h(), i(), null);
            if (d != -1) {
                Object obj3 = j()[d];
                e(d, c);
                this.g--;
                this.f += 32;
                return obj3;
            }
        }
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                Map b = b();
                if (b != null) {
                    return b.get(obj);
                }
                int d = d(obj);
                if (d == -1) {
                    return null;
                }
                return j()[d];
            case 1:
                Map o = o();
                if (o != null) {
                    return o.get(obj);
                }
                int x = x(obj);
                if (x == -1) {
                    return null;
                }
                return n()[x];
            case 2:
                Map o2 = o();
                if (o2 != null) {
                    return o2.get(obj);
                }
                int v = v(obj);
                if (v == -1) {
                    return null;
                }
                Object[] objArr = this.e;
                objArr.getClass();
                return objArr[v];
            default:
                Map o3 = o();
                if (o3 != null) {
                    return o3.get(obj);
                }
                int x2 = x(obj);
                if (x2 == -1) {
                    return null;
                }
                return n()[x2];
        }
    }

    public int[] h() {
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public Object[] i() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (size() == 0) {
                    return true;
                }
                return false;
            case 1:
                if (size() == 0) {
                    return true;
                }
                return false;
            case 2:
                if (size() == 0) {
                    return true;
                }
                return false;
            default:
                if (size() == 0) {
                    return true;
                }
                return false;
        }
    }

    public Object[] j() {
        Object[] objArr = this.e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public int k(int i, int i2, int i3, int i4) {
        Object a = eqn.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            eqn.f(i3 & i5, i4 + 1, a);
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] h = h();
        for (int i6 = 0; i6 <= i; i6++) {
            int e = eqn.e(i6, obj);
            while (e != 0) {
                int i7 = e - 1;
                int i8 = h[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int e2 = eqn.e(i10, a);
                eqn.f(i10, e, a);
                h[i7] = eqn.c(i9, e2, i5);
                e = i8 & i;
            }
        }
        this.b = a;
        this.f = eqn.c(this.f, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                di4 di4Var = (di4) this.h;
                if (di4Var == null) {
                    di4 di4Var2 = new di4(this, 1);
                    this.h = di4Var2;
                    return di4Var2;
                }
                return di4Var;
            case 1:
                lel lelVar = (lel) this.h;
                if (lelVar == null) {
                    lel lelVar2 = new lel(this, 1);
                    this.h = lelVar2;
                    return lelVar2;
                }
                return lelVar;
            case 2:
                vel velVar = (vel) this.h;
                if (velVar == null) {
                    vel velVar2 = new vel(this, 1);
                    this.h = velVar2;
                    return velVar2;
                }
                return velVar;
            default:
                jjl jjlVar = (jjl) this.h;
                if (jjlVar == null) {
                    jjl jjlVar2 = new jjl(this, 1);
                    this.h = jjlVar2;
                    return jjlVar2;
                }
                return jjlVar;
        }
    }

    public int[] l() {
        switch (this.a) {
            case 1:
                int[] iArr = this.c;
                Objects.requireNonNull(iArr);
                return iArr;
            default:
                int[] iArr2 = this.c;
                Objects.requireNonNull(iArr2);
                return iArr2;
        }
    }

    public Object[] m() {
        switch (this.a) {
            case 1:
                Object[] objArr = this.d;
                Objects.requireNonNull(objArr);
                return objArr;
            default:
                Object[] objArr2 = this.d;
                Objects.requireNonNull(objArr2);
                return objArr2;
        }
    }

    public Object[] n() {
        switch (this.a) {
            case 1:
                Object[] objArr = this.e;
                Objects.requireNonNull(objArr);
                return objArr;
            default:
                Object[] objArr2 = this.e;
                Objects.requireNonNull(objArr2);
                return objArr2;
        }
    }

    public Map o() {
        switch (this.a) {
            case 1:
                Object obj = this.b;
                if (!(obj instanceof Map)) {
                    return null;
                }
                return (Map) obj;
            case 2:
                Object obj2 = this.b;
                if (!(obj2 instanceof Map)) {
                    return null;
                }
                return (Map) obj2;
            default:
                Object obj3 = this.b;
                if (!(obj3 instanceof Map)) {
                    return null;
                }
                return (Map) obj3;
        }
    }

    public void p(int i, int i2) {
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
        iArr.getClass();
        Object[] objArr = this.d;
        objArr.getClass();
        Object[] objArr2 = this.e;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj2 = objArr[i3];
            objArr[i] = obj2;
            objArr2[i] = objArr2[i3];
            objArr[i3] = null;
            objArr2[i3] = null;
            iArr[i] = iArr[i3];
            iArr[i3] = 0;
            int c = mdn.c(obj2) & i2;
            int d = ldn.d(obj, c);
            if (d == size) {
                ldn.f(obj, c, i + 1);
                return;
            }
            while (true) {
                int i4 = d - 1;
                int i5 = iArr[i4];
                int i6 = i5 & i2;
                if (i6 != size) {
                    d = i6;
                } else {
                    iArr[i4] = ((~i2) & i5) | ((i + 1) & i2);
                    return;
                }
            }
        } else {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0299 -> B:102:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x042a -> B:160:0x0411). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:218:0x05b9 -> B:215:0x05a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0108 -> B:42:0x00ef). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        Object obj3;
        int i3;
        int i4;
        int min;
        int i5;
        int i6;
        int i7;
        int i8;
        int min2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int min3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = 32;
        switch (this.a) {
            case 0:
                if (f()) {
                    brn.r("Arrays already allocated", f());
                    int i24 = this.f;
                    i2 = 2;
                    int max = Math.max(i24 + 1, 2);
                    int highestOneBit = Integer.highestOneBit(max);
                    if (max > ((int) (1.0d * highestOneBit))) {
                        int i25 = highestOneBit << 1;
                        if (i25 > 0) {
                            i6 = i25;
                        } else {
                            i = 4;
                            i6 = 1073741824;
                            int max2 = Math.max(i, i6);
                            this.b = eqn.a(max2);
                            this.f = eqn.c(this.f, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
                            this.c = new int[i24];
                            this.d = new Object[i24];
                            this.e = new Object[i24];
                        }
                    } else {
                        i6 = highestOneBit;
                    }
                    i = 4;
                    int max22 = Math.max(i, i6);
                    this.b = eqn.a(max22);
                    this.f = eqn.c(this.f, 32 - Integer.numberOfLeadingZeros(max22 - 1), 31);
                    this.c = new int[i24];
                    this.d = new Object[i24];
                    this.e = new Object[i24];
                } else {
                    i = 4;
                    i2 = 2;
                }
                Map b = b();
                if (b != null) {
                    return b.put(obj, obj2);
                }
                int[] h = h();
                Object[] i26 = i();
                Object[] j = j();
                int i27 = this.g;
                int i28 = i27 + 1;
                int e = xtl.e(obj);
                int c = c();
                int i29 = e & c;
                Object obj4 = this.b;
                Objects.requireNonNull(obj4);
                int e2 = eqn.e(i29, obj4);
                if (e2 == 0) {
                    if (i28 > c) {
                        if (c < 32) {
                            i5 = i;
                        } else {
                            i5 = i2;
                        }
                        c = k(c, (c + 1) * i5, e, i27);
                    } else {
                        Object obj5 = this.b;
                        Objects.requireNonNull(obj5);
                        eqn.f(i29, i28, obj5);
                    }
                    obj3 = null;
                } else {
                    int i30 = ~c;
                    int i31 = e & i30;
                    int i32 = 0;
                    while (true) {
                        int i33 = e2 - 1;
                        int i34 = h[i33];
                        if ((i34 & i30) == i31 && ckn.a(obj, i26[i33])) {
                            Object obj6 = j[i33];
                            j[i33] = obj2;
                            return obj6;
                        }
                        int i35 = i34 & c;
                        i32++;
                        if (i35 == 0) {
                            if (i32 >= 9) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                                if (!isEmpty()) {
                                    i4 = 0;
                                    while (i4 >= 0) {
                                        linkedHashMap.put(i()[i4], j()[i4]);
                                        i4++;
                                        if (i4 < this.g) {
                                        }
                                    }
                                    this.b = linkedHashMap;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f += 32;
                                    return linkedHashMap.put(obj, obj2);
                                }
                                i4 = -1;
                                while (i4 >= 0) {
                                }
                                this.b = linkedHashMap;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f += 32;
                                return linkedHashMap.put(obj, obj2);
                            }
                            obj3 = null;
                            if (i28 > c) {
                                if (c < 32) {
                                    i3 = 4;
                                } else {
                                    i3 = 2;
                                }
                                c = k(c, (c + 1) * i3, e, i27);
                            } else {
                                h[i33] = eqn.c(i34, i28, c);
                            }
                        } else {
                            e2 = i35;
                        }
                    }
                }
                int length = h().length;
                if (i28 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                    this.c = Arrays.copyOf(h(), min);
                    this.d = Arrays.copyOf(i(), min);
                    this.e = Arrays.copyOf(j(), min);
                }
                h()[i27] = eqn.c(e, 0, c);
                i()[i27] = obj;
                j()[i27] = obj2;
                this.g = i28;
                this.f += 32;
                return obj3;
            case 1:
                if (s()) {
                    if (s()) {
                        int i36 = this.f;
                        int max3 = Math.max(i36 + 1, 2);
                        int highestOneBit2 = Integer.highestOneBit(max3);
                        if (max3 > highestOneBit2 && (highestOneBit2 = highestOneBit2 + highestOneBit2) <= 0) {
                            i11 = 4;
                            i10 = 1073741824;
                        } else {
                            i10 = highestOneBit2;
                            i11 = 4;
                        }
                        int max4 = Math.max(i11, i10);
                        this.b = bdn.f(max4);
                        this.f = (this.f & (-32)) | ((32 - Integer.numberOfLeadingZeros(max4 - 1)) & 31);
                        this.c = new int[i36];
                        this.d = new Object[i36];
                        this.e = new Object[i36];
                    } else {
                        dmk.n("Arrays already allocated");
                        return null;
                    }
                }
                Map o = o();
                if (o != null) {
                    return o.put(obj, obj2);
                }
                int[] l2 = l();
                Object[] m2 = m();
                Object[] n2 = n();
                int i37 = this.g;
                int i38 = i37 + 1;
                int k2 = hdn.k(obj);
                int u = u();
                int i39 = k2 & u;
                Object obj7 = this.b;
                Objects.requireNonNull(obj7);
                int e3 = bdn.e(obj7, i39);
                if (e3 == 0) {
                    if (i38 > u) {
                        if (u < 32) {
                            i9 = 4;
                        } else {
                            i9 = 2;
                        }
                        u = y(u, (u + 1) * i9, k2, i37);
                    } else {
                        Object obj8 = this.b;
                        Objects.requireNonNull(obj8);
                        bdn.g(obj8, i39, i38);
                    }
                } else {
                    int i40 = ~u;
                    int i41 = k2 & i40;
                    int i42 = 0;
                    while (true) {
                        int i43 = e3 - 1;
                        int i44 = l2[i43];
                        int i45 = i44 & i40;
                        int[] iArr = l2;
                        if (i45 == i41 && ghn.c(obj, m2[i43])) {
                            Object obj9 = n2[i43];
                            n2[i43] = obj2;
                            return obj9;
                        }
                        int i46 = i44 & u;
                        i42++;
                        if (i46 == 0) {
                            if (i42 >= 9) {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(u() + 1, 1.0f);
                                if (!isEmpty()) {
                                    i8 = 0;
                                    while (i8 >= 0) {
                                        linkedHashMap2.put(m()[i8], n()[i8]);
                                        i8++;
                                        if (i8 < this.g) {
                                        }
                                    }
                                    this.b = linkedHashMap2;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f += 32;
                                    return linkedHashMap2.put(obj, obj2);
                                }
                                i8 = -1;
                                while (i8 >= 0) {
                                }
                                this.b = linkedHashMap2;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f += 32;
                                return linkedHashMap2.put(obj, obj2);
                            }
                            if (i38 > u) {
                                if (u < 32) {
                                    i7 = 4;
                                } else {
                                    i7 = 2;
                                }
                                u = y(u, (u + 1) * i7, k2, i37);
                            } else {
                                iArr[i43] = (i38 & u) | i45;
                            }
                        } else {
                            e3 = i46;
                            l2 = iArr;
                        }
                    }
                }
                int length2 = l().length;
                if (i38 > length2 && (min2 = Math.min(1073741823, (Math.max(1, length2 >>> 1) + length2) | 1)) != length2) {
                    this.c = Arrays.copyOf(l(), min2);
                    this.d = Arrays.copyOf(m(), min2);
                    this.e = Arrays.copyOf(n(), min2);
                }
                l()[i37] = (~u) & k2;
                m()[i37] = obj;
                n()[i37] = obj2;
                this.g = i38;
                this.f += 32;
                return null;
            case 2:
                if (r()) {
                    if (r()) {
                        int i47 = this.f;
                        int max5 = Math.max(i47 + 1, 2);
                        int highestOneBit3 = Integer.highestOneBit(max5);
                        if (max5 > highestOneBit3 && (highestOneBit3 = highestOneBit3 + highestOneBit3) <= 0) {
                            i16 = 4;
                            i15 = 1073741824;
                        } else {
                            i15 = highestOneBit3;
                            i16 = 4;
                        }
                        int max6 = Math.max(i16, i15);
                        this.b = ldn.e(max6);
                        this.f = ((32 - Integer.numberOfLeadingZeros(max6 - 1)) & 31) | (this.f & (-32));
                        this.c = new int[i47];
                        this.d = new Object[i47];
                        this.e = new Object[i47];
                    } else {
                        dmk.n("Arrays already allocated");
                        return null;
                    }
                }
                Map o2 = o();
                if (o2 != null) {
                    return o2.put(obj, obj2);
                }
                int[] iArr2 = this.c;
                iArr2.getClass();
                Object[] objArr = this.d;
                objArr.getClass();
                Object[] objArr2 = this.e;
                objArr2.getClass();
                int i48 = this.g;
                int i49 = i48 + 1;
                int c2 = mdn.c(obj);
                int t = t();
                int i50 = c2 & t;
                Object obj10 = this.b;
                obj10.getClass();
                int d = ldn.d(obj10, i50);
                if (d == 0) {
                    if (i49 > t) {
                        if (t < 32) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        t = w(t, (t + 1) * i14, c2, i48);
                    } else {
                        Object obj11 = this.b;
                        obj11.getClass();
                        ldn.f(obj11, i50, i49);
                    }
                } else {
                    int i51 = ~t;
                    int i52 = c2 & i51;
                    int i53 = 0;
                    while (true) {
                        int i54 = d - 1;
                        int i55 = iArr2[i54];
                        int i56 = i55 & i51;
                        int[] iArr3 = iArr2;
                        if (i56 == i52 && jhn.c(obj, objArr[i54])) {
                            Object obj12 = objArr2[i54];
                            objArr2[i54] = obj2;
                            return obj12;
                        }
                        int i57 = i55 & t;
                        i53++;
                        if (i57 == 0) {
                            if (i53 >= 9) {
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap(t() + 1, 1.0f);
                                if (!isEmpty()) {
                                    i13 = 0;
                                    while (i13 >= 0) {
                                        Object[] objArr3 = this.d;
                                        objArr3.getClass();
                                        Object obj13 = objArr3[i13];
                                        Object[] objArr4 = this.e;
                                        objArr4.getClass();
                                        linkedHashMap3.put(obj13, objArr4[i13]);
                                        i13++;
                                        if (i13 < this.g) {
                                        }
                                    }
                                    this.b = linkedHashMap3;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f += 32;
                                    return linkedHashMap3.put(obj, obj2);
                                }
                                i13 = -1;
                                while (i13 >= 0) {
                                }
                                this.b = linkedHashMap3;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f += 32;
                                return linkedHashMap3.put(obj, obj2);
                            }
                            if (i49 > t) {
                                if (t < 32) {
                                    i12 = 4;
                                } else {
                                    i12 = 2;
                                }
                                t = w(t, (t + 1) * i12, c2, i48);
                            } else {
                                iArr3[i54] = (i49 & t) | i56;
                            }
                        } else {
                            d = i57;
                            iArr2 = iArr3;
                        }
                    }
                }
                int[] iArr4 = this.c;
                iArr4.getClass();
                int length3 = iArr4.length;
                if (i49 > length3 && (min3 = Math.min(1073741823, (Math.max(1, length3 >>> 1) + length3) | 1)) != length3) {
                    int[] iArr5 = this.c;
                    iArr5.getClass();
                    this.c = Arrays.copyOf(iArr5, min3);
                    Object[] objArr5 = this.d;
                    objArr5.getClass();
                    this.d = Arrays.copyOf(objArr5, min3);
                    Object[] objArr6 = this.e;
                    objArr6.getClass();
                    this.e = Arrays.copyOf(objArr6, min3);
                }
                int[] iArr6 = this.c;
                iArr6.getClass();
                iArr6[i48] = (~t) & c2;
                Object[] objArr7 = this.d;
                objArr7.getClass();
                objArr7[i48] = obj;
                Object[] objArr8 = this.e;
                objArr8.getClass();
                objArr8[i48] = obj2;
                this.g = i49;
                this.f += 32;
                return null;
            default:
                if (s()) {
                    scn.d("Arrays already allocated", s());
                    int i58 = this.f;
                    int max7 = Math.max(i58 + 1, 2);
                    i17 = -1;
                    int highestOneBit4 = Integer.highestOneBit(max7);
                    if (max7 > highestOneBit4 && (highestOneBit4 = highestOneBit4 + highestOneBit4) <= 0) {
                        i22 = 1073741824;
                    } else {
                        i22 = highestOneBit4;
                    }
                    int max8 = Math.max(4, i22);
                    this.b = nen.e(max8);
                    this.f = ((32 - Integer.numberOfLeadingZeros(max8 - 1)) & 31) | (this.f & (-32));
                    this.c = new int[i58];
                    this.d = new Object[i58];
                    this.e = new Object[i58];
                } else {
                    i17 = -1;
                }
                Map o3 = o();
                if (o3 != null) {
                    return o3.put(obj, obj2);
                }
                int[] l3 = l();
                Object[] m3 = m();
                Object[] n3 = n();
                int i59 = this.g;
                int i60 = i59 + 1;
                int f = uen.f(obj);
                int u2 = u();
                int i61 = f & u2;
                Object obj14 = this.b;
                Objects.requireNonNull(obj14);
                int d2 = nen.d(obj14, i61);
                if (d2 == 0) {
                    if (i60 > u2) {
                        if (u2 < 32) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        u2 = y(u2, (u2 + 1) * i21, f, i59);
                    } else {
                        Object obj15 = this.b;
                        Objects.requireNonNull(obj15);
                        nen.f(obj15, i61, i60);
                    }
                    i18 = 1;
                } else {
                    int i62 = ~u2;
                    i18 = 1;
                    int i63 = f & i62;
                    int i64 = 0;
                    while (true) {
                        int i65 = d2 - 1;
                        int i66 = l3[i65];
                        int i67 = i23;
                        int i68 = i66 & i62;
                        if (i68 == i63 && mcn.d(obj, m3[i65])) {
                            Object obj16 = n3[i65];
                            n3[i65] = obj2;
                            return obj16;
                        }
                        int i69 = i66 & u2;
                        int[] iArr7 = l3;
                        int i70 = i64 + 1;
                        if (i69 == 0) {
                            if (i70 >= 9) {
                                LinkedHashMap linkedHashMap4 = new LinkedHashMap(u() + 1, 1.0f);
                                if (!isEmpty()) {
                                    i20 = 0;
                                    while (i20 >= 0) {
                                        linkedHashMap4.put(m()[i20], n()[i20]);
                                        i20++;
                                        if (i20 < this.g) {
                                        }
                                    }
                                    this.b = linkedHashMap4;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f += 32;
                                    return linkedHashMap4.put(obj, obj2);
                                }
                                i20 = i17;
                                while (i20 >= 0) {
                                }
                                this.b = linkedHashMap4;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f += 32;
                                return linkedHashMap4.put(obj, obj2);
                            }
                            if (i60 > u2) {
                                if (u2 < i67) {
                                    i19 = 4;
                                } else {
                                    i19 = 2;
                                }
                                u2 = y(u2, (u2 + 1) * i19, f, i59);
                            } else {
                                iArr7[i65] = (i60 & u2) | i68;
                            }
                        } else {
                            i64 = i70;
                            d2 = i69;
                            l3 = iArr7;
                            i23 = 32;
                            i18 = 1;
                        }
                    }
                }
                int length4 = l().length;
                if (i60 > length4) {
                    int i71 = i18;
                    int min4 = Math.min(1073741823, (Math.max(i71, length4 >>> 1) + length4) | i71);
                    if (min4 != length4) {
                        this.c = Arrays.copyOf(l(), min4);
                        this.d = Arrays.copyOf(m(), min4);
                        this.e = Arrays.copyOf(n(), min4);
                    }
                }
                l()[i59] = (~u2) & f;
                m()[i59] = obj;
                n()[i59] = obj2;
                this.g = i60;
                this.f += 32;
                return null;
        }
    }

    public void q(int i, int i2) {
        switch (this.a) {
            case 1:
                Object obj = this.b;
                Objects.requireNonNull(obj);
                int[] l2 = l();
                Object[] m2 = m();
                Object[] n2 = n();
                int size = size();
                int i3 = size - 1;
                if (i < i3) {
                    int i4 = i + 1;
                    Object obj2 = m2[i3];
                    m2[i] = obj2;
                    n2[i] = n2[i3];
                    m2[i3] = null;
                    n2[i3] = null;
                    l2[i] = l2[i3];
                    l2[i3] = 0;
                    int k2 = hdn.k(obj2) & i2;
                    int e = bdn.e(obj, k2);
                    if (e == size) {
                        bdn.g(obj, k2, i4);
                        return;
                    }
                    while (true) {
                        int i5 = e - 1;
                        int i6 = l2[i5];
                        int i7 = i6 & i2;
                        if (i7 != size) {
                            e = i7;
                        } else {
                            l2[i5] = ((~i2) & i6) | (i4 & i2);
                            return;
                        }
                    }
                } else {
                    m2[i] = null;
                    n2[i] = null;
                    l2[i] = 0;
                    return;
                }
            default:
                Object obj3 = this.b;
                Objects.requireNonNull(obj3);
                int[] l3 = l();
                Object[] m3 = m();
                Object[] n3 = n();
                int size2 = size();
                int i8 = size2 - 1;
                if (i < i8) {
                    int i9 = i + 1;
                    Object obj4 = m3[i8];
                    m3[i] = obj4;
                    n3[i] = n3[i8];
                    m3[i8] = null;
                    n3[i8] = null;
                    l3[i] = l3[i8];
                    l3[i8] = 0;
                    int f = uen.f(obj4) & i2;
                    int d = nen.d(obj3, f);
                    if (d == size2) {
                        nen.f(obj3, f, i9);
                        return;
                    }
                    while (true) {
                        int i10 = d - 1;
                        int i11 = l3[i10];
                        int i12 = i11 & i2;
                        if (i12 != size2) {
                            d = i12;
                        } else {
                            l3[i10] = ((~i2) & i11) | (i9 & i2);
                            return;
                        }
                    }
                } else {
                    m3[i] = null;
                    n3[i] = null;
                    l3[i] = 0;
                    return;
                }
        }
    }

    public boolean r() {
        if (this.b == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                Map b = b();
                if (b != null) {
                    return b.remove(obj);
                }
                Object g = g(obj);
                if (g == k) {
                    return null;
                }
                return g;
            case 1:
                Map o = o();
                if (o != null) {
                    return o.remove(obj);
                }
                Object A = A(obj);
                if (A == l) {
                    return null;
                }
                return A;
            case 2:
                Map o2 = o();
                if (o2 != null) {
                    return o2.remove(obj);
                }
                Object z = z(obj);
                if (z == m) {
                    return null;
                }
                return z;
            default:
                Map o3 = o();
                if (o3 != null) {
                    return o3.remove(obj);
                }
                Object A2 = A(obj);
                if (A2 == n) {
                    return null;
                }
                return A2;
        }
    }

    public boolean s() {
        switch (this.a) {
            case 1:
                if (this.b == null) {
                    return true;
                }
                return false;
            default:
                if (this.b == null) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
            case 0:
                Map b = b();
                if (b != null) {
                    return b.size();
                }
                return this.g;
            case 1:
                Map o = o();
                if (o != null) {
                    return o.size();
                }
                return this.g;
            case 2:
                Map o2 = o();
                if (o2 != null) {
                    return o2.size();
                }
                return this.g;
            default:
                Map o3 = o();
                if (o3 != null) {
                    return o3.size();
                }
                return this.g;
        }
    }

    public int t() {
        return (1 << (this.f & 31)) - 1;
    }

    public int u() {
        int i;
        switch (this.a) {
            case 1:
                i = this.f;
                break;
            default:
                i = this.f;
                break;
        }
        return (1 << (i & 31)) - 1;
    }

    public int v(Object obj) {
        if (r()) {
            return -1;
        }
        int c = mdn.c(obj);
        int t = t();
        Object obj2 = this.b;
        obj2.getClass();
        int d = ldn.d(obj2, c & t);
        if (d != 0) {
            int i = ~t;
            int i2 = c & i;
            do {
                int i3 = d - 1;
                int[] iArr = this.c;
                iArr.getClass();
                int i4 = iArr[i3];
                if ((i4 & i) == i2) {
                    Object[] objArr = this.d;
                    objArr.getClass();
                    if (jhn.c(obj, objArr[i3])) {
                        return i3;
                    }
                }
                d = i4 & t;
            } while (d != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.j;
                if (j4Var == null) {
                    j4 j4Var2 = new j4((Object) this, 1);
                    this.j = j4Var2;
                    return j4Var2;
                }
                return j4Var;
            case 1:
                j4 j4Var3 = (j4) this.j;
                if (j4Var3 == null) {
                    j4 j4Var4 = new j4((Object) this, 3);
                    this.j = j4Var4;
                    return j4Var4;
                }
                return j4Var3;
            case 2:
                j4 j4Var5 = (j4) this.j;
                if (j4Var5 == null) {
                    j4 j4Var6 = new j4((Object) this, 4);
                    this.j = j4Var6;
                    return j4Var6;
                }
                return j4Var5;
            default:
                j4 j4Var7 = (j4) this.j;
                if (j4Var7 == null) {
                    j4 j4Var8 = new j4((Object) this, 8);
                    this.j = j4Var8;
                    return j4Var8;
                }
                return j4Var7;
        }
    }

    public int w(int i, int i2, int i3, int i4) {
        Object e = ldn.e(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            ldn.f(e, i3 & i5, i4 + 1);
        }
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int d = ldn.d(obj, i6);
            while (d != 0) {
                int i7 = d - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int d2 = ldn.d(e, i10);
                ldn.f(e, i10, d);
                iArr[i7] = ((~i5) & i9) | (d2 & i5);
                d = i8 & i;
            }
        }
        this.b = e;
        this.f = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f & (-32));
        return i5;
    }

    public int x(Object obj) {
        switch (this.a) {
            case 1:
                if (s()) {
                    return -1;
                }
                int k2 = hdn.k(obj);
                int u = u();
                Object obj2 = this.b;
                Objects.requireNonNull(obj2);
                int e = bdn.e(obj2, k2 & u);
                if (e == 0) {
                    return -1;
                }
                int i = ~u;
                int i2 = k2 & i;
                do {
                    int i3 = e - 1;
                    int i4 = l()[i3];
                    if ((i4 & i) == i2 && ghn.c(obj, m()[i3])) {
                        return i3;
                    }
                    e = i4 & u;
                } while (e != 0);
                return -1;
            default:
                if (s()) {
                    return -1;
                }
                int f = uen.f(obj);
                int u2 = u();
                Object obj3 = this.b;
                Objects.requireNonNull(obj3);
                int d = nen.d(obj3, f & u2);
                if (d == 0) {
                    return -1;
                }
                int i5 = ~u2;
                int i6 = f & i5;
                do {
                    int i7 = d - 1;
                    int i8 = l()[i7];
                    if ((i8 & i5) == i6 && mcn.d(obj, m()[i7])) {
                        return i7;
                    }
                    d = i8 & u2;
                } while (d != 0);
                return -1;
        }
    }

    public int y(int i, int i2, int i3, int i4) {
        int i5 = 0;
        switch (this.a) {
            case 1:
                int i6 = i2 - 1;
                Object f = bdn.f(i2);
                if (i4 != 0) {
                    bdn.g(f, i3 & i6, i4 + 1);
                }
                Object obj = this.b;
                Objects.requireNonNull(obj);
                int[] l2 = l();
                while (i5 <= i) {
                    int e = bdn.e(obj, i5);
                    while (e != 0) {
                        int i7 = e - 1;
                        int i8 = l2[i7];
                        int i9 = ((~i) & i8) | i5;
                        int i10 = i9 & i6;
                        int e2 = bdn.e(f, i10);
                        bdn.g(f, i10, e);
                        l2[i7] = ((~i6) & i9) | (e2 & i6);
                        e = i8 & i;
                    }
                    i5++;
                }
                this.b = f;
                this.f = ((32 - Integer.numberOfLeadingZeros(i6)) & 31) | (this.f & (-32));
                return i6;
            default:
                int i11 = i2 - 1;
                Object e3 = nen.e(i2);
                if (i4 != 0) {
                    nen.f(e3, i3 & i11, i4 + 1);
                }
                Object obj2 = this.b;
                Objects.requireNonNull(obj2);
                int[] l3 = l();
                while (i5 <= i) {
                    int d = nen.d(obj2, i5);
                    while (d != 0) {
                        int i12 = d - 1;
                        int i13 = l3[i12];
                        int i14 = ((~i) & i13) | i5;
                        int i15 = i14 & i11;
                        int d2 = nen.d(e3, i15);
                        nen.f(e3, i15, d);
                        l3[i12] = ((~i11) & i14) | (d2 & i11);
                        d = i13 & i;
                    }
                    i5++;
                }
                this.b = e3;
                this.f = ((32 - Integer.numberOfLeadingZeros(i11)) & 31) | (this.f & (-32));
                return i11;
        }
    }

    public Object z(Object obj) {
        if (!r()) {
            int t = t();
            Object obj2 = this.b;
            obj2.getClass();
            int[] iArr = this.c;
            iArr.getClass();
            Object[] objArr = this.d;
            objArr.getClass();
            int c = ldn.c(obj, null, t, obj2, iArr, objArr, null);
            if (c != -1) {
                Object[] objArr2 = this.e;
                objArr2.getClass();
                Object obj3 = objArr2[c];
                p(c, t);
                this.g--;
                this.f += 32;
                return obj3;
            }
        }
        return m;
    }
}

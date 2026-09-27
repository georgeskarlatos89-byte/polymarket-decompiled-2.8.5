package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class g6l extends AbstractMap {
    public static final lki g = new lki(12);
    public static final lki h = new lki(15);
    public final /* synthetic */ int a;
    public final Object[] b;
    public final int[] c;
    public Integer d;
    public String e;
    public final AbstractSet f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, g6l] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public g6l(g6l g6lVar, g6l g6lVar2, byte b) {
        int i;
        int i2;
        int i3;
        Object obj;
        Object[] objArr;
        int i4 = 1;
        r0.a = 1;
        g6l abstractMap = new AbstractMap();
        int i5 = -1;
        abstractMap.f = new zol(abstractMap, -1);
        abstractMap.d = null;
        abstractMap.e = null;
        int size = g6lVar2.size() + g6lVar.size();
        int i6 = g6lVar.c[g6lVar.size()] + g6lVar2.c[g6lVar2.size()];
        int i7 = size + 1;
        Object[] objArr2 = new Object[i6];
        int[] iArr = new int[i7];
        int i8 = 0;
        iArr[0] = size;
        Map.Entry b2 = g6lVar.b(0);
        Map.Entry b3 = g6lVar2.b(0);
        int i9 = 0;
        int i10 = 0;
        int i11 = size;
        int i12 = 0;
        while (true) {
            if (b2 == null && b3 == null) {
                break;
            }
            int i13 = i12 + 1;
            if (b2 == null) {
                i = i4;
            } else if (b3 == null) {
                i = i5;
            } else {
                i = i8;
            }
            if (i == 0 && (i = ((String) b2.getKey()).compareTo((String) b3.getKey())) == 0) {
                int i14 = i10 + 1;
                int i15 = i9 + 1;
                objArr2[i12] = new AbstractMap.SimpleImmutableEntry((String) b2.getKey(), new zol(abstractMap, i12));
                zol zolVar = (zol) b2.getValue();
                zol zolVar2 = (zol) b3.getValue();
                int i16 = 0;
                int i17 = 0;
                abstractMap = abstractMap;
                while (true) {
                    int a = zolVar.a();
                    g6l g6lVar3 = zolVar.b;
                    if (i16 >= a - zolVar.b() && i17 >= zolVar2.a() - zolVar2.b()) {
                        break;
                    }
                    if (i16 == zolVar.a() - zolVar.b()) {
                        i2 = 1;
                    } else if (i17 == zolVar2.a() - zolVar2.b()) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i3 = i16;
                        i2 = mpl.b.compare(g6lVar3.b[zolVar.b() + i16], zolVar2.b.b[zolVar2.b() + i17]);
                    } else {
                        i3 = i16;
                    }
                    if (i2 < 0) {
                        i16 = i3 + 1;
                        obj = g6lVar3.b[zolVar.b() + i3];
                    } else {
                        int i18 = i17 + 1;
                        Object obj2 = zolVar2.b.b[zolVar2.b() + i17];
                        if (i2 == 0) {
                            i17 = i18;
                            obj = obj2;
                            i16 = i3 + 1;
                        } else {
                            i17 = i18;
                            obj = obj2;
                            i16 = i3;
                        }
                    }
                    objArr2[i11] = obj;
                    abstractMap = this;
                    i11++;
                }
                iArr[i13] = i11;
                b2 = g6lVar.b(i15);
                b3 = g6lVar2.b(i14);
                i10 = i14;
                i9 = i15;
                i12 = i13;
                i4 = 1;
                i5 = -1;
                i8 = 0;
            } else {
                if (i < 0) {
                    i9++;
                    i11 = a(b2, i12, i11, objArr2, iArr);
                    b2 = g6lVar.b(i9);
                } else {
                    Map.Entry entry = b2;
                    i10++;
                    int a2 = a(b3, i12, i11, objArr2, iArr);
                    b3 = g6lVar2.b(i10);
                    i11 = a2;
                    b2 = entry;
                }
                i12 = i13;
                i4 = 1;
                i5 = -1;
                i8 = 0;
                abstractMap = this;
            }
        }
        int i19 = iArr[i8];
        int i20 = i19 - i12;
        if (i20 != 0) {
            for (int i21 = i8; i21 <= i12; i21++) {
                iArr[i21] = iArr[i21] - i20;
            }
            int i22 = iArr[i12];
            int i23 = i22 - i12;
            if (e(i6, i22)) {
                objArr = new Object[i22];
                System.arraycopy(objArr2, i8, objArr, i8, i12);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i19, objArr, i12, i23);
            objArr2 = objArr;
        }
        abstractMap.b = objArr2;
        int i24 = iArr[i8] + i4;
        abstractMap.c = e(i7, i24) ? Arrays.copyOf(iArr, i24) : iArr;
    }

    public static boolean c(int i, int i2) {
        if (i > 16 && i * 9 > i2 * 10) {
            return true;
        }
        return false;
    }

    public static boolean e(int i, int i2) {
        if (i > 16 && i * 9 > i2 * 10) {
            return true;
        }
        return false;
    }

    public final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        switch (this.a) {
            case 0:
                f6l f6lVar = (f6l) entry.getValue();
                int b = f6lVar.b() - f6lVar.a();
                System.arraycopy(f6lVar.b.b, f6lVar.a(), objArr, i2, b);
                objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new f6l(this, i));
                int i3 = i2 + b;
                iArr[i + 1] = i3;
                return i3;
            default:
                zol zolVar = (zol) entry.getValue();
                int a = zolVar.a() - zolVar.b();
                System.arraycopy(zolVar.b.b, zolVar.b(), objArr, i2, a);
                objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new zol(this, i));
                int i4 = i2 + a;
                iArr[i + 1] = i4;
                return i4;
        }
    }

    public Map.Entry b(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    public Map.Entry d(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                return (f6l) this.f;
            default:
                return (zol) this.f;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                Integer num = this.d;
                if (num == null) {
                    num = Integer.valueOf(super.hashCode());
                    this.d = num;
                }
                return num.intValue();
            default:
                Integer num2 = this.d;
                if (num2 == null) {
                    num2 = Integer.valueOf(super.hashCode());
                    this.d = num2;
                }
                return num2.intValue();
        }
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.a) {
            case 0:
                String str = this.e;
                if (str == null) {
                    String abstractMap = super.toString();
                    this.e = abstractMap;
                    return abstractMap;
                }
                return str;
            default:
                String str2 = this.e;
                if (str2 == null) {
                    String abstractMap2 = super.toString();
                    this.e = abstractMap2;
                    return abstractMap2;
                }
                return str2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x016f, code lost:
    
        if (r8 < 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, g6l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [g6l] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g6l(g6l g6lVar, g6l g6lVar2) {
        int i;
        Object obj;
        Object[] objArr;
        int i2 = 0;
        r0.a = 0;
        ?? abstractMap = new AbstractMap();
        abstractMap.f = new f6l(abstractMap, -1);
        abstractMap.d = null;
        abstractMap.e = null;
        int size = g6lVar2.size() + g6lVar.size();
        int i3 = g6lVar.c[g6lVar.size()] + g6lVar2.c[g6lVar2.size()];
        int i4 = size + 1;
        Object[] objArr2 = new Object[i3];
        int[] iArr = new int[i4];
        iArr[0] = size;
        Map.Entry d = g6lVar.d(0);
        Map.Entry d2 = g6lVar2.d(0);
        int i5 = 0;
        int i6 = 0;
        int i7 = size;
        int i8 = 0;
        while (true) {
            if (d == null && d2 == null) {
                break;
            }
            int i9 = i8 + 1;
            if (d != null) {
                if (d2 != null) {
                    int compareTo = ((String) d.getKey()).compareTo((String) d2.getKey());
                    if (compareTo == 0) {
                        int i10 = i5 + 1;
                        int i11 = i6 + 1;
                        objArr2[i8] = new AbstractMap.SimpleImmutableEntry((String) d.getKey(), new f6l(abstractMap, i8));
                        f6l f6lVar = (f6l) d.getValue();
                        f6l f6lVar2 = (f6l) d2.getValue();
                        int i12 = 0;
                        int i13 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int b = f6lVar.b();
                            g6l g6lVar3 = f6lVar.b;
                            if (i12 >= b - f6lVar.a() && i13 >= f6lVar2.b() - f6lVar2.a()) {
                                break;
                            }
                            int i14 = i12 == f6lVar.b() - f6lVar.a() ? 1 : i13 == f6lVar2.b() - f6lVar2.a() ? -1 : 0;
                            if (i14 == 0) {
                                lki lkiVar = i6l.b;
                                i = i12;
                                i14 = i6l.b.compare(g6lVar3.b[f6lVar.a() + i12], f6lVar2.b.b[f6lVar2.a() + i13]);
                            } else {
                                i = i12;
                            }
                            if (i14 < 0) {
                                i12 = i + 1;
                                obj = g6lVar3.b[f6lVar.a() + i];
                            } else {
                                int i15 = i13 + 1;
                                Object obj2 = f6lVar2.b.b[f6lVar2.a() + i13];
                                if (i14 == 0) {
                                    i13 = i15;
                                    obj = obj2;
                                    i12 = i + 1;
                                } else {
                                    i13 = i15;
                                    obj = obj2;
                                    i12 = i;
                                }
                            }
                            objArr2[i7] = obj;
                            abstractMap = this;
                            i7++;
                        }
                        iArr[i9] = i7;
                        d = g6lVar.d(i11);
                        d2 = g6lVar2.d(i10);
                        i6 = i11;
                        i5 = i10;
                        i8 = i9;
                        i2 = 0;
                    }
                }
                i6++;
                i7 = a(d, i8, i7, objArr2, iArr);
                d = g6lVar.d(i6);
                i8 = i9;
                i2 = 0;
                abstractMap = this;
            }
            Map.Entry entry = d;
            i5++;
            int a = a(d2, i8, i7, objArr2, iArr);
            d2 = g6lVar2.d(i5);
            i7 = a;
            d = entry;
            i8 = i9;
            i2 = 0;
            abstractMap = this;
        }
        int i16 = iArr[i2];
        int i17 = i16 - i8;
        if (i17 != 0) {
            for (int i18 = i2; i18 <= i8; i18++) {
                iArr[i18] = iArr[i18] - i17;
            }
            int i19 = iArr[i8];
            int i20 = i19 - i8;
            if (c(i3, i19)) {
                objArr = new Object[i19];
                System.arraycopy(objArr2, i2, objArr, i2, i8);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i16, objArr, i8, i20);
            objArr2 = objArr;
        }
        abstractMap.b = objArr2;
        int i21 = iArr[i2] + 1;
        abstractMap.c = c(i4, i21) ? Arrays.copyOf(iArr, i21) : iArr;
    }

    public g6l(int i) {
        this.a = i;
        switch (i) {
            case 1:
                List list = Collections.EMPTY_LIST;
                this.f = new zol(this, -1);
                this.d = null;
                this.e = null;
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    int size = list.size();
                    Object[] objArr = new Object[size];
                    Iterator it2 = list.iterator();
                    if (!it2.hasNext()) {
                        int[] iArr = {0};
                        this.b = e(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                        this.c = iArr;
                        return;
                    }
                    throw m51.g(it2);
                }
                throw m51.g(it);
            default:
                List list2 = Collections.EMPTY_LIST;
                this.f = new f6l(this, -1);
                this.d = null;
                this.e = null;
                Iterator it3 = list2.iterator();
                if (!it3.hasNext()) {
                    int size2 = list2.size();
                    Object[] objArr2 = new Object[size2];
                    Iterator it4 = list2.iterator();
                    if (!it4.hasNext()) {
                        int[] iArr2 = {0};
                        this.b = c(size2, 0) ? Arrays.copyOf(objArr2, 0) : objArr2;
                        this.c = iArr2;
                        return;
                    }
                    throw m51.g(it4);
                }
                throw m51.g(it3);
        }
    }
}

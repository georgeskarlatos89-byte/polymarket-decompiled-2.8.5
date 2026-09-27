package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class tr9 extends xq9 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient jr9 b;

    public static int j(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        brn.g("collection too large", z);
        return 1073741824;
    }

    public static tr9 k(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int j = j(i);
                Object[] objArr2 = new Object[j];
                int i2 = j - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int d = xtl.d(hashCode);
                        while (true) {
                            int i6 = d & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            d++;
                        }
                    } else {
                        dmk.s(ace.f(i5, "at index "));
                        return null;
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new x8h(obj3);
                }
                if (j(i4) < j / 2) {
                    return k(i4, objArr);
                }
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new cxf(i3, i2, i4, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new x8h(obj4);
        }
        return cxf.j;
    }

    public static tr9 l(Collection collection) {
        if ((collection instanceof tr9) && !(collection instanceof SortedSet)) {
            tr9 tr9Var = (tr9) collection;
            if (!tr9Var.h()) {
                return tr9Var;
            }
        }
        Object[] array = collection.toArray();
        return k(array.length, array);
    }

    public static tr9 m(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return k(objArr.length, (Object[]) objArr.clone());
            }
            return new x8h(objArr[0]);
        }
        return cxf.j;
    }

    public static tr9 q(Object obj, Object obj2) {
        return k(2, obj, obj2);
    }

    public static tr9 r(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        boolean z;
        if (objArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        brn.g("the total number of elements must fit in an int", z);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return k(length, objArr2);
    }

    public static void s(String str) {
        new x8h(str);
    }

    @Override // defpackage.xq9
    public jr9 a() {
        jr9 jr9Var = this.b;
        if (jr9Var == null) {
            jr9 n = n();
            this.b = n;
            return n;
        }
        return jr9Var;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof tr9) && (this instanceof cxf) && (((tr9) obj) instanceof cxf) && hashCode() != obj.hashCode()) {
            return false;
        }
        return lfl.e(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return lfl.g(this);
    }

    public jr9 n() {
        Object[] array = toArray(xq9.a);
        we8 we8Var = jr9.b;
        return jr9.j(array.length, array);
    }
}

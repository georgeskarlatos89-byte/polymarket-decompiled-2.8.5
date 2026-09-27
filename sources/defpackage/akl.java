package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class akl extends otk implements Set {
    public static final /* synthetic */ int h = 0;
    public transient njl g;

    public static akl r(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int s = s(i);
                Object[] objArr2 = new Object[s];
                int i2 = s - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
                        while (true) {
                            int i6 = rotateLeft & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            }
                            if (!obj2.equals(obj)) {
                                rotateLeft++;
                            }
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
                    return new cnl(obj3);
                }
                if (s(i4) < s / 2) {
                    return r(i4, objArr);
                }
                if (i4 <= 0) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new fml(i3, i2, i4, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new cnl(obj4);
        }
        return fml.o;
    }

    public static int s(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        dmk.v("collection too large");
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof akl) || !(this instanceof fml) || !(((akl) obj) instanceof fml) || ((fml) this).j == obj.hashCode()) {
                if (obj != this) {
                    if (obj instanceof Set) {
                        Set set = (Set) obj;
                        try {
                            if (size() == set.size()) {
                                if (containsAll(set)) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        } catch (ClassCastException | NullPointerException unused) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zen.d(this);
    }

    public njl t() {
        njl njlVar = this.g;
        if (njlVar == null) {
            njl u = u();
            this.g = u;
            return u;
        }
        return njlVar;
    }

    public njl u() {
        Object[] array = toArray(otk.e);
        iil iilVar = njl.g;
        return njl.t(array.length, array);
    }
}

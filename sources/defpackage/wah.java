package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wah extends AbstractList implements RandomAccess {
    public int a;
    public Object b;

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i != 2 && i != 3) {
            if (i != 5 && i != 6 && i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
            } else {
                objArr[1] = "toArray";
            }
        } else {
            objArr[1] = "iterator";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) {
            throw new IllegalStateException(format);
        }
    }

    public static /* synthetic */ int b(wah wahVar) {
        return ((AbstractList) wahVar).modCount;
    }

    public static /* synthetic */ int c(wah wahVar) {
        return ((AbstractList) wahVar).modCount;
    }

    public static /* synthetic */ int d(wah wahVar) {
        return ((AbstractList) wahVar).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        if (i >= 0 && i <= (i2 = this.a)) {
            if (i2 == 0) {
                this.b = obj;
            } else if (i2 == 1 && i == 0) {
                this.b = new Object[]{obj, this.b};
            } else {
                Object[] objArr = new Object[i2 + 1];
                Object obj2 = this.b;
                if (i2 == 1) {
                    objArr[0] = obj2;
                } else {
                    Object[] objArr2 = (Object[]) obj2;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.a - i);
                }
                objArr[i] = obj;
                this.b = objArr;
            }
            this.a++;
            ((AbstractList) this).modCount++;
            return;
        }
        omf.e(this.a, ace.o(i, "Index: ", ", Size: "));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = null;
        this.a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.a)) {
            Object obj = this.b;
            if (i2 == 1) {
                return obj;
            }
            return ((Object[]) obj)[i];
        }
        omf.e(this.a, ace.o(i, "Index: ", ", Size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i = this.a;
        if (i == 0) {
            return uah.b;
        }
        if (i == 1) {
            return new vah(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.a)) {
            Object obj = this.b;
            if (i2 == 1) {
                this.b = null;
            } else {
                Object[] objArr = (Object[]) obj;
                Object obj2 = objArr[i];
                if (i2 == 2) {
                    this.b = objArr[1 - i];
                } else {
                    int i3 = (i2 - i) - 1;
                    if (i3 > 0) {
                        System.arraycopy(objArr, i + 1, objArr, i, i3);
                    }
                    i2 = this.a;
                    objArr[i2 - 1] = null;
                }
                obj = obj2;
            }
            this.a = i2 - 1;
            ((AbstractList) this).modCount++;
            return obj;
        }
        omf.e(this.a, ace.o(i, "Index: ", ", Size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        if (i >= 0 && i < (i2 = this.a)) {
            Object obj2 = this.b;
            if (i2 == 1) {
                this.b = obj;
                return obj2;
            }
            Object[] objArr = (Object[]) obj2;
            Object obj3 = objArr[i];
            objArr[i] = obj;
            return obj3;
        }
        omf.e(this.a, ace.o(i, "Index: ", ", Size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i = this.a;
        if (i >= 2) {
            Arrays.sort((Object[]) this.b, 0, i, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = this.a;
            if (i == 1) {
                if (length != 0) {
                    objArr[0] = this.b;
                } else {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                    objArr2[0] = this.b;
                    return objArr2;
                }
            } else {
                if (length < i) {
                    Object[] copyOf = Arrays.copyOf((Object[]) this.b, i, objArr.getClass());
                    if (copyOf != null) {
                        return copyOf;
                    }
                    a(6);
                    throw null;
                }
                if (i != 0) {
                    System.arraycopy(this.b, 0, objArr, 0, i);
                }
            }
            int i2 = this.a;
            if (length > i2) {
                objArr[i2] = null;
            }
            return objArr;
        }
        a(4);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.b = obj;
        } else {
            Object obj2 = this.b;
            if (i == 1) {
                this.b = new Object[]{obj2, obj};
            } else {
                Object[] objArr = (Object[]) obj2;
                int length = objArr.length;
                if (i >= length) {
                    int a = ace.a(length, 3, 2, 1);
                    int i2 = i + 1;
                    if (a < i2) {
                        a = i2;
                    }
                    Object[] objArr2 = new Object[a];
                    this.b = objArr2;
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    objArr = objArr2;
                }
                i = this.a;
                objArr[i] = obj;
            }
        }
        this.a = i + 1;
        ((AbstractList) this).modCount++;
        return true;
    }
}

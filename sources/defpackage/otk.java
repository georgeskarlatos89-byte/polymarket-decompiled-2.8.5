package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class otk extends AbstractCollection implements Serializable {
    public static final Object[] b = new Object[0];
    public static final Object[] c = new Object[0];
    public static final Object[] d = new Object[0];
    public static final Object[] e = new Object[0];
    public static final Object[] f = new Object[0];
    public final /* synthetic */ int a;

    public /* synthetic */ otk(int i) {
        this.a = i;
    }

    public abstract int a(Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract int b();

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract Object[] d();

    public int f(Object[] objArr) {
        tuj l = l();
        int i = 0;
        while (l.hasNext()) {
            objArr[i] = l.next();
            i++;
        }
        return i;
    }

    public int h() {
        switch (this.a) {
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Object[] i() {
        switch (this.a) {
            case 1:
                return null;
            default:
                return null;
        }
    }

    public int j() {
        switch (this.a) {
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int k() {
        switch (this.a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract tuj l();

    public abstract int m(Object[] objArr);

    public Object[] n() {
        switch (this.a) {
            case 2:
                return null;
            default:
                return null;
        }
    }

    public abstract int q(Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        switch (this.a) {
            case 0:
                return Spliterators.spliterator(this, 1296);
            case 1:
                return Spliterators.spliterator(this, 1296);
            case 2:
                return Spliterators.spliterator(this, 1296);
            case 3:
                return Spliterators.spliterator(this, 1296);
            default:
                return Spliterators.spliterator(this, 1296);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                int size = size();
                int length = objArr.length;
                if (length < size) {
                    Object[] d2 = d();
                    if (d2 == null) {
                        if (length != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size);
                    } else {
                        return Arrays.copyOfRange(d2, c(), b(), objArr.getClass());
                    }
                } else if (length > size) {
                    objArr[size] = null;
                }
                a(objArr);
                return objArr;
            case 1:
                objArr.getClass();
                int size2 = size();
                int length2 = objArr.length;
                if (length2 < size2) {
                    Object[] i = i();
                    if (i == null) {
                        if (length2 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size2);
                    } else {
                        return Arrays.copyOfRange(i, j(), k(), objArr.getClass());
                    }
                } else if (length2 > size2) {
                    objArr[size2] = null;
                }
                q(objArr);
                return objArr;
            case 2:
                objArr.getClass();
                int size3 = size();
                int length3 = objArr.length;
                if (length3 < size3) {
                    Object[] n = n();
                    if (n == null) {
                        if (length3 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size3);
                    } else {
                        return Arrays.copyOfRange(n, j(), h(), objArr.getClass());
                    }
                } else if (length3 > size3) {
                    objArr[size3] = null;
                }
                f(objArr);
                return objArr;
            case 3:
                objArr.getClass();
                int size4 = size();
                int length4 = objArr.length;
                if (length4 < size4) {
                    Object[] n2 = n();
                    if (n2 == null) {
                        if (length4 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size4);
                    } else {
                        return Arrays.copyOfRange(n2, j(), h(), objArr.getClass());
                    }
                } else if (length4 > size4) {
                    objArr[size4] = null;
                }
                f(objArr);
                return objArr;
            default:
                objArr.getClass();
                int size5 = size();
                int length5 = objArr.length;
                if (length5 < size5) {
                    Object[] i2 = i();
                    if (i2 == null) {
                        if (length5 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size5);
                    } else {
                        return Arrays.copyOfRange(i2, j(), k(), objArr.getClass());
                    }
                } else if (length5 > size5) {
                    objArr[size5] = null;
                }
                m(objArr);
                return objArr;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                return toArray(b);
            case 1:
                return toArray(c);
            case 2:
                return toArray(d);
            case 3:
                return toArray(e);
            default:
                return toArray(f);
        }
    }
}

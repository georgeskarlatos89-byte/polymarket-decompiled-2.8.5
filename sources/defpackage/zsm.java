package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zsm extends rjm implements RandomAccess, ttm {
    public static final zsm d = new zsm(new int[0], 0, false);
    public int[] b;
    public int c;

    public zsm(int[] iArr, int i, boolean z) {
        super(z);
        this.b = iArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i >= 0 && i <= (i2 = this.c)) {
            int i3 = i + 1;
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i3, i2 - i);
            } else {
                int[] iArr2 = new int[ace.a(i2, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.b, i, iArr2, i3, this.c - i);
                this.b = iArr2;
            }
            this.b[i] = intValue;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        f27.m(woa.l(i, this.c, "Index:", ", Size:"));
    }

    @Override // defpackage.rjm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = jum.a;
        collection.getClass();
        if (!(collection instanceof zsm)) {
            return super.addAll(collection);
        }
        zsm zsmVar = (zsm) collection;
        int i = zsmVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (bd0.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.b;
            if (i3 > iArr.length) {
                iArr = Arrays.copyOf(iArr, i3);
                this.b = iArr;
            }
            System.arraycopy(zsmVar.b, 0, iArr, this.c, zsmVar.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int b(int i) {
        d(i);
        return this.b[i];
    }

    public final void c(int i) {
        a();
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[ace.a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.b = iArr2;
            iArr = iArr2;
        }
        int i3 = this.c;
        this.c = i3 + 1;
        iArr[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        f27.m(woa.l(i, this.c, "Index:", ", Size:"));
    }

    @Override // defpackage.rjm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zsm)) {
                return super.equals(obj);
            }
            zsm zsmVar = (zsm) obj;
            if (this.c == zsmVar.c) {
                int[] iArr = zsmVar.b;
                for (int i = 0; i < this.c; i++) {
                    if (this.b[i] == iArr[i]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        d(i);
        return Integer.valueOf(this.b[i]);
    }

    @Override // defpackage.rjm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.b[i2] == intValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // defpackage.rjm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        d(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        if (i < this.c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            int[] iArr = this.b;
            System.arraycopy(iArr, i2, iArr, i, this.c - i2);
            this.c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        f27.m("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        d(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.dum
    public final /* bridge */ /* synthetic */ dum zzd(int i) {
        if (i >= this.c) {
            return new zsm(Arrays.copyOf(this.b, i), this.c, true);
        }
        omf.a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Integer) obj).intValue());
        return true;
    }
}

package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class grm extends rjm implements RandomAccess, otm {
    public static final grm d = new grm(new float[0], 0, false);
    public float[] b;
    public int c;

    public grm(float[] fArr, int i, boolean z) {
        super(z);
        this.b = fArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i >= 0 && i <= (i2 = this.c)) {
            int i3 = i + 1;
            float[] fArr = this.b;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i3, i2 - i);
            } else {
                float[] fArr2 = new float[ace.a(i2, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.b, i, fArr2, i3, this.c - i);
                this.b = fArr2;
            }
            this.b[i] = floatValue;
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
        if (!(collection instanceof grm)) {
            return super.addAll(collection);
        }
        grm grmVar = (grm) collection;
        int i = grmVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (bd0.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.b;
            if (i3 > fArr.length) {
                fArr = Arrays.copyOf(fArr, i3);
                this.b = fArr;
            }
            System.arraycopy(grmVar.b, 0, fArr, this.c, grmVar.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(float f) {
        a();
        int i = this.c;
        float[] fArr = this.b;
        if (i == fArr.length) {
            float[] fArr2 = new float[ace.a(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.b = fArr2;
            fArr = fArr2;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        fArr[i2] = f;
    }

    public final void c(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        f27.m(woa.l(i, this.c, "Index:", ", Size:"));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rjm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof grm)) {
                return super.equals(obj);
            }
            grm grmVar = (grm) obj;
            if (this.c == grmVar.c) {
                float[] fArr = grmVar.b;
                for (int i = 0; i < this.c; i++) {
                    if (Float.floatToIntBits(this.b[i]) == Float.floatToIntBits(fArr[i])) {
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
        c(i);
        return Float.valueOf(this.b[i]);
    }

    @Override // defpackage.rjm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.b[i2] == floatValue) {
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
        c(i);
        float[] fArr = this.b;
        float f = fArr[i];
        if (i < this.c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            float[] fArr = this.b;
            System.arraycopy(fArr, i2, fArr, i, this.c - i2);
            this.c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        f27.m("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        c(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.dum
    public final /* bridge */ /* synthetic */ dum zzd(int i) {
        if (i >= this.c) {
            return new grm(Arrays.copyOf(this.b, i), this.c, true);
        }
        omf.a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}

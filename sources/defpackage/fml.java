package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fml extends akl {
    public static final Object[] n;
    public static final fml o;
    public final transient Object[] i;
    public final transient int j;
    public final transient Object[] k;
    public final transient int l;
    public final transient int m;

    static {
        Object[] objArr = new Object[0];
        n = objArr;
        o = new fml(0, 0, 0, objArr, objArr);
    }

    public fml(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(3);
        this.i = objArr;
        this.j = i;
        this.k = objArr2;
        this.l = i2;
        this.m = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.k;
            if (objArr.length != 0) {
                int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                while (true) {
                    int i = rotateLeft & this.l;
                    Object obj2 = objArr[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return true;
                        }
                        rotateLeft = i + 1;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // defpackage.otk
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.i;
        int i = this.m;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.otk
    public final int h() {
        return this.m;
    }

    @Override // defpackage.akl, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return t().v(0);
    }

    @Override // defpackage.otk
    public final int j() {
        return 0;
    }

    @Override // defpackage.otk
    public final tuj l() {
        return t().v(0);
    }

    @Override // defpackage.otk
    public final Object[] n() {
        return this.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.m;
    }

    @Override // defpackage.akl
    public final njl u() {
        return njl.t(this.m, this.i);
    }
}

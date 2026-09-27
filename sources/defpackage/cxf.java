package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cxf extends tr9 {
    public static final Object[] i;
    public static final cxf j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new cxf(0, 0, 0, objArr, objArr);
    }

    public cxf(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // defpackage.xq9
    public final int b(int i2, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i3 = this.h;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // defpackage.xq9
    public final Object[] c() {
        return this.d;
    }

    @Override // defpackage.xq9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int e = xtl.e(obj);
                while (true) {
                    int i2 = e & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    e = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.xq9
    public final int d() {
        return this.h;
    }

    @Override // defpackage.xq9
    public final int f() {
        return 0;
    }

    @Override // defpackage.xq9
    public final boolean h() {
        return false;
    }

    @Override // defpackage.tr9, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.xq9
    public final tuj i() {
        return a().q(0);
    }

    @Override // defpackage.tr9
    public final jr9 n() {
        return jr9.j(this.h, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}

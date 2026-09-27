package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wwf extends jr9 {
    public static final wwf e = new wwf(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public wwf(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.jr9, defpackage.xq9
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.xq9
    public final Object[] c() {
        return this.c;
    }

    @Override // defpackage.xq9
    public final int d() {
        return this.d;
    }

    @Override // defpackage.xq9
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        brn.k(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.xq9
    public final boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}

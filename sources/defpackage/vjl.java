package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class vjl extends tgl {
    public static final vjl j = new vjl(new Object[0], 0);
    public final transient Object[] h;
    public final transient int i;

    public vjl(Object[] objArr, int i) {
        super(2);
        this.h = objArr;
        this.i = i;
    }

    @Override // defpackage.tgl, defpackage.otk
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.i;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        khn.c(i, this.i);
        Object obj = this.h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.otk
    public final int h() {
        return this.i;
    }

    @Override // defpackage.otk
    public final int j() {
        return 0;
    }

    @Override // defpackage.otk
    public final Object[] n() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}

package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gpl extends sll {
    public static final gpl e = new gpl(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public gpl(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.sll, defpackage.wkl
    public final int a(Object[] objArr, int i) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.wkl
    public final int b() {
        return this.d;
    }

    @Override // defpackage.wkl
    public final int c() {
        return 0;
    }

    @Override // defpackage.wkl
    public final Object[] d() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        scn.b(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}

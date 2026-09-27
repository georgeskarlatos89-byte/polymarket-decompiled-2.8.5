package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class c6l extends c0o {
    public static final c6l j = new c6l(new Object[0], 0);
    public final transient Object[] h;
    public final transient int i;

    public c6l(Object[] objArr, int i) {
        super(4);
        this.h = objArr;
        this.i = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tgn.c(i, this.i);
        Object obj = this.h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.otk
    public final Object[] i() {
        return this.h;
    }

    @Override // defpackage.otk
    public final int j() {
        return 0;
    }

    @Override // defpackage.otk
    public final int k() {
        return this.i;
    }

    @Override // defpackage.c0o, defpackage.otk
    public final int m(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.i;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}

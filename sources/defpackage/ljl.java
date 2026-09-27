package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ljl extends fhl {
    public static final ljl e = new ljl(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public ljl(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.fhl, defpackage.lgl
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.lgl
    public final int b() {
        return this.d;
    }

    @Override // defpackage.lgl
    public final int c() {
        return 0;
    }

    @Override // defpackage.lgl
    public final Object[] d() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pbn.b(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}

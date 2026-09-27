package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dkl extends fhl {
    public final transient Object[] c;
    public final transient int d;

    public dkl(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pbn.b(i, 1);
        Object obj = this.c[i + i + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }
}

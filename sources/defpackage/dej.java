package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class dej extends aej {
    public final cke e;

    public dej(cke ckeVar) {
        super(0);
        this.e = ckeVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        this.d = i + 2;
        Object[] objArr = this.b;
        return new mpc(this.e, objArr[i], objArr[i + 1]);
    }
}

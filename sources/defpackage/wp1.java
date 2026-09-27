package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wp1 extends m3 {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public wp1(Object[] objArr, int i, int i2) {
        super(i, i2, 1);
        this.e = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (hasNext()) {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return ((Object[]) obj)[i2];
                }
                dmk.t();
                return null;
            default:
                if (hasNext()) {
                    this.b++;
                    return obj;
                }
                dmk.t();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (hasPrevious()) {
                    int i2 = this.b - 1;
                    this.b = i2;
                    return ((Object[]) obj)[i2];
                }
                dmk.t();
                return null;
            default:
                if (hasPrevious()) {
                    this.b--;
                    return obj;
                }
                dmk.t();
                return null;
        }
    }

    public wp1(Object obj, int i) {
        super(i, 1, 1);
        this.e = obj;
    }
}

package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yke extends m3 {
    public final Object[] d;
    public final xdj e;

    public yke(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, 1);
        this.d = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.e = new xdj(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            xdj xdjVar = this.e;
            if (xdjVar.hasNext()) {
                this.b++;
                return xdjVar.next();
            }
            int i = this.b;
            this.b = i + 1;
            return this.d[i - xdjVar.c];
        }
        dmk.t();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.b;
            xdj xdjVar = this.e;
            int i2 = xdjVar.c;
            if (i > i2) {
                int i3 = i - 1;
                this.b = i3;
                return this.d[i3 - i2];
            }
            this.b = i - 1;
            return xdjVar.previous();
        }
        dmk.t();
        return null;
    }
}

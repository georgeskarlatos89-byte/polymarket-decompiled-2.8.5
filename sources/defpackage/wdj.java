package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wdj extends m3 {
    public int d;
    public Object[] e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public wdj(Object[] objArr, int i, int i2, int i3) {
        super(i, i2, 0);
        ?? r5;
        objArr.getClass();
        this.d = i3;
        Object[] objArr2 = new Object[i3];
        this.e = objArr2;
        if (i == i2) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.f = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.b & 31;
        Object obj = this.e[this.d - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.d - i2) * 5;
        while (i2 < this.d) {
            Object[] objArr = this.e;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[e2n.b(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (e2n.b(this.b, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.b, ((this.d - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a = a();
            int i = this.b + 1;
            this.b = i;
            if (i == this.c) {
                this.f = true;
                return a;
            }
            c(0);
            return a;
        }
        dmk.t();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.b--;
            if (this.f) {
                this.f = false;
                return a();
            }
            c(31);
            return a();
        }
        dmk.t();
        return null;
    }
}

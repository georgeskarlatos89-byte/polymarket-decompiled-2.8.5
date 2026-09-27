package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class vje implements Iterator, xja {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object[] d;

    public vje(ydj ydjVar, aej[] aejVarArr) {
        this.a = 0;
        ydjVar.getClass();
        this.d = aejVarArr;
        this.c = true;
        aej aejVar = aejVarArr[0];
        Object[] objArr = ydjVar.d;
        int bitCount = Integer.bitCount(ydjVar.a) * 2;
        aejVar.getClass();
        objArr.getClass();
        aejVar.b = objArr;
        aejVar.c = bitCount;
        aejVar.d = 0;
        this.b = 0;
        b();
    }

    public void a() {
        aej[] aejVarArr = (aej[]) this.d;
        int i = this.b;
        aej aejVar = aejVarArr[i];
        if (aejVar.d < aejVar.c) {
            return;
        }
        while (-1 < i) {
            int c = c(i);
            if (c == -1) {
                aej aejVar2 = aejVarArr[i];
                int i2 = aejVar2.d;
                Object[] objArr = aejVar2.b;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    aejVar2.d = i2 + 1;
                    c = c(i);
                }
            }
            if (c != -1) {
                this.b = c;
                return;
            }
            if (i > 0) {
                aej aejVar3 = aejVarArr[i - 1];
                int i3 = aejVar3.d;
                int length2 = aejVar3.b.length;
                aejVar3.d = i3 + 1;
            }
            aejVarArr[i].a(zdj.e.d, 0, 0);
            i--;
        }
        this.c = false;
    }

    public void b() {
        aej[] aejVarArr = (aej[]) this.d;
        int i = this.b;
        aej aejVar = aejVarArr[i];
        if (aejVar.d < aejVar.c) {
            return;
        }
        while (-1 < i) {
            int d = d(i);
            if (d == -1) {
                aej aejVar2 = aejVarArr[i];
                int i2 = aejVar2.d;
                Object[] objArr = aejVar2.b;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    aejVar2.d = i2 + 1;
                    d = d(i);
                }
            }
            if (d != -1) {
                this.b = d;
                return;
            }
            if (i > 0) {
                aej aejVar3 = aejVarArr[i - 1];
                int i3 = aejVar3.d;
                int length2 = aejVar3.b.length;
                aejVar3.d = i3 + 1;
            }
            aej aejVar4 = aejVarArr[i];
            Object[] objArr2 = ydj.e.d;
            aejVar4.getClass();
            objArr2.getClass();
            aejVar4.b = objArr2;
            aejVar4.c = 0;
            aejVar4.d = 0;
            i--;
        }
        this.c = false;
    }

    public int c(int i) {
        aej[] aejVarArr = (aej[]) this.d;
        aej aejVar = aejVarArr[i];
        int i2 = aejVar.d;
        if (i2 < aejVar.c) {
            return i;
        }
        Object[] objArr = aejVar.b;
        if (i2 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i2];
            obj.getClass();
            zdj zdjVar = (zdj) obj;
            if (i == 6) {
                aej aejVar2 = aejVarArr[i + 1];
                Object[] objArr2 = zdjVar.d;
                aejVar2.a(objArr2, objArr2.length, 0);
            } else {
                aejVarArr[i + 1].a(zdjVar.d, Integer.bitCount(zdjVar.a) * 2, 0);
            }
            return c(i + 1);
        }
        return -1;
    }

    public int d(int i) {
        aej[] aejVarArr = (aej[]) this.d;
        aej aejVar = aejVarArr[i];
        int i2 = aejVar.d;
        if (i2 < aejVar.c) {
            return i;
        }
        Object[] objArr = aejVar.b;
        if (i2 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i2];
            obj.getClass();
            ydj ydjVar = (ydj) obj;
            if (i == 6) {
                aej aejVar2 = aejVarArr[i + 1];
                Object[] objArr2 = ydjVar.d;
                int length2 = objArr2.length;
                aejVar2.getClass();
                aejVar2.b = objArr2;
                aejVar2.c = length2;
                aejVar2.d = 0;
            } else {
                aej aejVar3 = aejVarArr[i + 1];
                Object[] objArr3 = ydjVar.d;
                int bitCount = Integer.bitCount(ydjVar.a) * 2;
                aejVar3.getClass();
                objArr3.getClass();
                aejVar3.b = objArr3;
                aejVar3.c = bitCount;
                aejVar3.d = 0;
            }
            return d(i + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.a;
        Object[] objArr = this.d;
        switch (i) {
            case 0:
                if (this.c) {
                    Object next = ((aej[]) objArr)[this.b].next();
                    b();
                    return next;
                }
                dmk.t();
                return null;
            default:
                if (this.c) {
                    Object next2 = ((aej[]) objArr)[this.b].next();
                    a();
                    return next2;
                }
                dmk.t();
                return null;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public vje(zdj zdjVar, aej[] aejVarArr) {
        this.a = 1;
        this.d = aejVarArr;
        this.c = true;
        aejVarArr[0].a(zdjVar.d, Integer.bitCount(zdjVar.a) * 2, 0);
        this.b = 0;
        a();
    }
}

package defpackage;

import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class zje extends vje {
    public final xje e;
    public Object f;
    public boolean g;
    public int h;

    public zje(xje xjeVar, aej[] aejVarArr) {
        super(xjeVar.c, aejVarArr);
        this.e = xjeVar;
        this.h = xjeVar.e;
    }

    public final void e(int i, zdj zdjVar, Object obj, int i2) {
        aej[] aejVarArr = (aej[]) this.d;
        int i3 = i2 * 5;
        if (i3 > 30) {
            aej aejVar = aejVarArr[i2];
            Object[] objArr = zdjVar.d;
            aejVar.a(objArr, objArr.length, 0);
            while (true) {
                aej aejVar2 = aejVarArr[i2];
                if (!Intrinsics.areEqual(aejVar2.b[aejVar2.d], obj)) {
                    aejVarArr[i2].d += 2;
                } else {
                    this.b = i2;
                    return;
                }
            }
        } else {
            int c = 1 << bsm.c(i, i3);
            if (zdjVar.h(c)) {
                aejVarArr[i2].a(zdjVar.d, Integer.bitCount(zdjVar.a) * 2, zdjVar.f(c));
                this.b = i2;
            } else {
                int t = zdjVar.t(c);
                zdj s = zdjVar.s(t);
                aejVarArr[i2].a(zdjVar.d, Integer.bitCount(zdjVar.a) * 2, t);
                e(i, s, obj, i2 + 1);
            }
        }
    }

    @Override // defpackage.vje, java.util.Iterator
    public final Object next() {
        if (this.e.e == this.h) {
            if (this.c) {
                aej aejVar = ((aej[]) this.d)[this.b];
                this.f = aejVar.b[aejVar.d];
                this.g = true;
                return super.next();
            }
            dmk.t();
            return null;
        }
        f27.g();
        return null;
    }

    @Override // defpackage.vje, java.util.Iterator
    public final void remove() {
        int i;
        if (this.g) {
            boolean z = this.c;
            xje xjeVar = this.e;
            if (z) {
                if (z) {
                    aej aejVar = ((aej[]) this.d)[this.b];
                    Object obj = aejVar.b[aejVar.d];
                    hhj.c(xjeVar).remove(this.f);
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    e(i, xjeVar.c, obj, 0);
                } else {
                    dmk.t();
                    return;
                }
            } else {
                hhj.c(xjeVar).remove(this.f);
            }
            this.f = null;
            this.g = false;
            this.h = xjeVar.e;
            return;
        }
        l.o();
    }
}

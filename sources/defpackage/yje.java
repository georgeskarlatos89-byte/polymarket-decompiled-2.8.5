package defpackage;

import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class yje extends vje {
    public final wje e;
    public Object f;
    public boolean g;
    public int h;

    public yje(wje wjeVar, aej[] aejVarArr) {
        super(wjeVar.c, aejVarArr);
        this.e = wjeVar;
        this.h = wjeVar.e;
    }

    public final void e(int i, ydj ydjVar, Object obj, int i2, int i3, boolean z) {
        int i4;
        int i5;
        aej[] aejVarArr = (aej[]) this.d;
        int i6 = i2 * 5;
        if (i6 > 30) {
            aej aejVar = aejVarArr[i2];
            Object[] objArr = ydjVar.d;
            int length = objArr.length;
            aejVar.getClass();
            aejVar.b = objArr;
            aejVar.c = length;
            aejVar.d = 0;
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
            int b = 1 << yrm.b(i, i6);
            if (ydjVar.i(b)) {
                int f = ydjVar.f(b);
                if (z) {
                    i4 = 1 << yrm.b(i3, i6);
                } else {
                    i4 = 0;
                }
                if (b == i4 && i2 < (i5 = this.b)) {
                    aej aejVar3 = aejVarArr[i5];
                    Object[] objArr2 = ydjVar.d;
                    Object[] objArr3 = {objArr2[f], objArr2[f + 1]};
                    aejVar3.getClass();
                    aejVar3.b = objArr3;
                    aejVar3.c = 2;
                    aejVar3.d = 0;
                    return;
                }
                aej aejVar4 = aejVarArr[i2];
                Object[] objArr4 = ydjVar.d;
                int bitCount = Integer.bitCount(ydjVar.a) * 2;
                aejVar4.getClass();
                objArr4.getClass();
                aejVar4.b = objArr4;
                aejVar4.c = bitCount;
                aejVar4.d = f;
                this.b = i2;
                return;
            }
            int t = ydjVar.t(b);
            ydj s = ydjVar.s(t);
            aej aejVar5 = aejVarArr[i2];
            Object[] objArr5 = ydjVar.d;
            int bitCount2 = Integer.bitCount(ydjVar.a) * 2;
            aejVar5.getClass();
            objArr5.getClass();
            aejVar5.b = objArr5;
            aejVar5.c = bitCount2;
            aejVar5.d = t;
            e(i, s, obj, i2 + 1, i3, z);
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
        yje yjeVar;
        int i;
        int i2;
        if (this.g) {
            boolean z = this.c;
            wje wjeVar = this.e;
            if (z) {
                if (z) {
                    aej aejVar = ((aej[]) this.d)[this.b];
                    Object obj = aejVar.b[aejVar.d];
                    hhj.c(wjeVar).remove(this.f);
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    ydj ydjVar = wjeVar.c;
                    Object obj2 = this.f;
                    if (obj2 != null) {
                        i2 = obj2.hashCode();
                    } else {
                        i2 = 0;
                    }
                    yjeVar = this;
                    yjeVar.e(i, ydjVar, obj, 0, i2, true);
                } else {
                    dmk.t();
                    return;
                }
            } else {
                yjeVar = this;
                hhj.c(wjeVar).remove(yjeVar.f);
            }
            yjeVar.f = null;
            yjeVar.g = false;
            yjeVar.h = wjeVar.e;
            return;
        }
        l.o();
    }
}

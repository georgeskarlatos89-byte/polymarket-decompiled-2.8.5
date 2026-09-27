package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.math.RoundingMode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j24 {
    public final t11 a;
    public final q8j b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public j24(int i, t11 t11Var, q8j q8jVar) {
        int i2;
        int i3;
        int i4 = t11Var.d;
        this.a = t11Var;
        int a = t11Var.a();
        boolean z = true;
        if (a != 1 && a != 2) {
            z = false;
        }
        pfn.b(z);
        if (a == 2) {
            i2 = 1667497984;
        } else {
            i2 = 1651965952;
        }
        int i5 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = i2 | i5;
        long j = t11Var.b * 1000000;
        long j2 = t11Var.c;
        int i6 = u1k.a;
        this.e = u1k.S(i4, j, j2, RoundingMode.DOWN);
        this.b = q8jVar;
        if (a == 2) {
            i3 = i5 | 1650720768;
        } else {
            i3 = -1;
        }
        this.d = i3;
        this.l = -1L;
        this.m = new long[Barcode.FORMAT_UPC_A];
        this.n = new int[Barcode.FORMAT_UPC_A];
        this.f = i4;
    }

    public final qng a(int i) {
        return new qng((this.e / this.f) * this.n[i], this.m[i]);
    }

    public final nng b(long j) {
        if (this.k == 0) {
            qng qngVar = new qng(0L, this.l);
            return new nng(qngVar, qngVar);
        }
        int i = (int) (j / (this.e / this.f));
        int d = u1k.d(this.n, i, true, true);
        if (this.n[d] == i) {
            qng a = a(d);
            return new nng(a, a);
        }
        qng a2 = a(d);
        int i2 = d + 1;
        if (i2 < this.m.length) {
            return new nng(a2, a(i2));
        }
        return new nng(a2, a2);
    }
}

package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class q11 implements ong {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public q11(long j, long j2) {
        qng qngVar;
        this.a = 2;
        this.b = j;
        if (j2 == 0) {
            qngVar = qng.c;
        } else {
            qngVar = new qng(0L, j2);
        }
        this.c = new nng(qngVar, qngVar);
    }

    @Override // defpackage.ong
    public final nng d(long j) {
        long j2;
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                r11 r11Var = (r11) obj;
                nng b = r11Var.i[0].b(j);
                while (true) {
                    j24[] j24VarArr = r11Var.i;
                    if (i2 < j24VarArr.length) {
                        nng b2 = j24VarArr[i2].b(j);
                        if (b2.a.b < b.a.b) {
                            b = b2;
                        }
                        i2++;
                    } else {
                        return b;
                    }
                }
            case 1:
                v68 v68Var = (v68) obj;
                pfn.g(v68Var.k);
                a35 a35Var = v68Var.k;
                long[] jArr = (long[]) a35Var.b;
                long[] jArr2 = (long[]) a35Var.c;
                int e = u1k.e(jArr, u1k.j((v68Var.e * j) / 1000000, 0L, v68Var.j - 1), false);
                long j3 = 0;
                if (e == -1) {
                    j2 = 0;
                } else {
                    j2 = jArr[e];
                }
                if (e != -1) {
                    j3 = jArr2[e];
                }
                int i3 = v68Var.e;
                long j4 = (j2 * 1000000) / i3;
                long j5 = this.b;
                qng qngVar = new qng(j4, j3 + j5);
                if (j4 != j && e != jArr.length - 1) {
                    int i4 = e + 1;
                    return new nng(qngVar, new qng((jArr[i4] * 1000000) / i3, j5 + jArr2[i4]));
                }
                return new nng(qngVar, qngVar);
            default:
                return (nng) obj;
        }
    }

    @Override // defpackage.ong
    public final boolean g() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.ong
    public final long k() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((v68) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q11(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public /* synthetic */ q11(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}

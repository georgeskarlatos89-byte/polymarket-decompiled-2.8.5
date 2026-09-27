package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nt9 implements ong {
    public final ctb a;
    public final ctb b;
    public long c;

    public nt9(long j, long[] jArr, long[] jArr2) {
        boolean z;
        ctb ctbVar;
        ctb ctbVar2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i = length + 1;
            ctbVar = new ctb(i);
            this.a = ctbVar;
            ctbVar2 = new ctb(i);
            this.b = ctbVar2;
            ctbVar.a(0L);
            ctbVar2.a(0L);
        } else {
            ctbVar = new ctb(length);
            this.a = ctbVar;
            ctbVar2 = new ctb(length);
            this.b = ctbVar2;
        }
        ctbVar.b(jArr);
        ctbVar2.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.ong
    public final nng d(long j) {
        ctb ctbVar = this.b;
        if (ctbVar.b == 0) {
            qng qngVar = qng.c;
            return new nng(qngVar, qngVar);
        }
        int b = u1k.b(ctbVar, j);
        long d = ctbVar.d(b);
        ctb ctbVar2 = this.a;
        qng qngVar2 = new qng(d, ctbVar2.d(b));
        if (d != j && b != ctbVar.b - 1) {
            int i = b + 1;
            return new nng(qngVar2, new qng(ctbVar.d(i), ctbVar2.d(i)));
        }
        return new nng(qngVar2, qngVar2);
    }

    @Override // defpackage.ong
    public final boolean g() {
        if (this.b.b > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ong
    public final long k() {
        return this.c;
    }
}

package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l1j implements q7c, p7c {
    public final q7c a;
    public final long b;
    public p7c c;

    public l1j(q7c q7cVar, long j) {
        this.a = q7cVar;
        this.b = j;
    }

    @Override // defpackage.gwg
    public final void a(hwg hwgVar) {
        p7c p7cVar = this.c;
        p7cVar.getClass();
        p7cVar.a(this);
    }

    @Override // defpackage.q7c
    public final long b(rr7[] rr7VarArr, boolean[] zArr, ldg[] ldgVarArr, boolean[] zArr2, long j) {
        ldg[] ldgVarArr2 = new ldg[ldgVarArr.length];
        int i = 0;
        while (true) {
            ldg ldgVar = null;
            if (i >= ldgVarArr.length) {
                break;
            }
            k1j k1jVar = (k1j) ldgVarArr[i];
            if (k1jVar != null) {
                ldgVar = k1jVar.a;
            }
            ldgVarArr2[i] = ldgVar;
            i++;
        }
        q7c q7cVar = this.a;
        long j2 = this.b;
        long b = q7cVar.b(rr7VarArr, zArr, ldgVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < ldgVarArr.length; i2++) {
            ldg ldgVar2 = ldgVarArr2[i2];
            if (ldgVar2 == null) {
                ldgVarArr[i2] = null;
            } else {
                ldg ldgVar3 = ldgVarArr[i2];
                if (ldgVar3 == null || ((k1j) ldgVar3).a != ldgVar2) {
                    ldgVarArr[i2] = new k1j(ldgVar2, j2);
                }
            }
        }
        return b + j2;
    }

    @Override // defpackage.hwg
    public final long c() {
        long c = this.a.c();
        if (c == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return c + this.b;
    }

    @Override // defpackage.q7c
    public final long d(long j, png pngVar) {
        long j2 = this.b;
        return this.a.d(j - j2, pngVar) + j2;
    }

    @Override // defpackage.q7c
    public final long f(long j) {
        long j2 = this.b;
        return this.a.f(j - j2) + j2;
    }

    @Override // defpackage.hwg
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.q7c
    public final long h() {
        long h = this.a.h();
        if (h == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return h + this.b;
    }

    @Override // defpackage.p7c
    public final void i(q7c q7cVar) {
        p7c p7cVar = this.c;
        p7cVar.getClass();
        p7cVar.i(this);
    }

    @Override // defpackage.q7c
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.q7c
    public final void l(long j) {
        this.a.l(j - this.b);
    }

    @Override // defpackage.q7c
    public final void o(p7c p7cVar, long j) {
        this.c = p7cVar;
        this.a.o(this, j - this.b);
    }

    @Override // defpackage.q7c
    public final n8j p() {
        return this.a.p();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fob, java.lang.Object] */
    @Override // defpackage.hwg
    public final boolean q(gob gobVar) {
        ?? obj = new Object();
        long j = gobVar.a;
        obj.b = gobVar.b;
        obj.c = gobVar.c;
        obj.a = j - this.b;
        return this.a.q(new gob(obj));
    }

    @Override // defpackage.hwg
    public final long s() {
        long s = this.a.s();
        if (s == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s + this.b;
    }

    @Override // defpackage.hwg
    public final void v(long j) {
        this.a.v(j - this.b);
    }
}

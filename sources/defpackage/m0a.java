package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class m0a implements n0a {
    public int a;
    public long b;

    public m0a(int i, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        this.a = i;
        this.b = j;
    }

    public static m0a c(tu7 tu7Var, svd svdVar) {
        tu7Var.o(svdVar.a, 0, 8);
        svdVar.F(0);
        return new m0a(svdVar.g(), false, svdVar.k());
    }

    @Override // defpackage.n0a
    public e0a a() {
        long j = this.b;
        if (j >= e0a.c.a && j <= e0a.d.a) {
            return wnm.b(this.a, j);
        }
        return null;
    }

    public synchronized boolean b() {
        boolean z;
        if (this.a != 0) {
            if (System.currentTimeMillis() <= this.b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public synchronized void d(int i) {
        long min;
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            this.a++;
            synchronized (this) {
                if (i != 429 && (i < 500 || i >= 600)) {
                    min = 86400000;
                    this.b = System.currentTimeMillis() + min;
                }
                min = (long) Math.min(Math.pow(2.0d, this.a) + ((long) (Math.random() * 1000.0d)), 1800000.0d);
                this.b = System.currentTimeMillis() + min;
            }
            return;
        }
        synchronized (this) {
            this.a = 0;
        }
        return;
    }

    @Override // defpackage.n0a
    public e0a toInstant() {
        long j = this.b;
        if (j >= e0a.c.a && j <= e0a.d.a) {
            return wnm.b(this.a, j);
        }
        throw new IllegalArgumentException("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }

    public /* synthetic */ m0a(int i, boolean z, long j) {
        this.a = i;
        this.b = j;
    }
}

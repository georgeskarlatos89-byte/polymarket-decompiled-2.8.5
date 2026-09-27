package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n89 implements h6c {
    public final long a;
    public long b = -1;
    public final List c;
    public final long d;

    public n89(long j, List list) {
        this.a = list.size() - 1;
        this.d = j;
        this.c = list;
    }

    @Override // defpackage.h6c
    public final long c() {
        long j = this.b;
        if (j >= 0 && j <= this.a) {
            return this.d + ((y89) this.c.get((int) j)).e;
        }
        dmk.t();
        return 0L;
    }

    @Override // defpackage.h6c
    public final long e() {
        long j = this.b;
        if (j >= 0 && j <= this.a) {
            y89 y89Var = (y89) this.c.get((int) j);
            return this.d + y89Var.e + y89Var.c;
        }
        dmk.t();
        return 0L;
    }

    @Override // defpackage.h6c
    public final boolean next() {
        boolean z;
        long j = this.b + 1;
        this.b = j;
        if (j > this.a) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}

package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class obc implements rr7 {
    public final rr7 a;
    public final m8j b;

    public obc(rr7 rr7Var, m8j m8jVar) {
        this.a = rr7Var;
        this.b = m8jVar;
    }

    @Override // defpackage.rr7
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // defpackage.rr7
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.rr7
    public final boolean c(long j, h24 h24Var, List list) {
        return this.a.c(j, h24Var, list);
    }

    @Override // defpackage.rr7
    public final el8 d(int i) {
        return this.b.d[this.a.e(i)];
    }

    @Override // defpackage.rr7
    public final int e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof obc) {
                obc obcVar = (obc) obj;
                if (this.a.equals(obcVar.a) && this.b.equals(obcVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.rr7
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.rr7
    public final boolean g(int i, long j) {
        return this.a.g(i, j);
    }

    @Override // defpackage.rr7
    public final void h(float f) {
        this.a.h(f);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // defpackage.rr7
    public final Object i() {
        return this.a.i();
    }

    @Override // defpackage.rr7
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.rr7
    public final int k(int i) {
        return this.a.k(i);
    }

    @Override // defpackage.rr7
    public final void l(long j, long j2, long j3, List list, h6c[] h6cVarArr) {
        this.a.l(j, j2, j3, list, h6cVarArr);
    }

    @Override // defpackage.rr7
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.rr7
    public final m8j m() {
        return this.b;
    }

    @Override // defpackage.rr7
    public final void n(boolean z) {
        this.a.n(z);
    }

    @Override // defpackage.rr7
    public final void o() {
        this.a.o();
    }

    @Override // defpackage.rr7
    public final int p(long j, List list) {
        return this.a.p(j, list);
    }

    @Override // defpackage.rr7
    public final int q() {
        return this.a.q();
    }

    @Override // defpackage.rr7
    public final el8 r() {
        return this.b.d[this.a.q()];
    }

    @Override // defpackage.rr7
    public final int s() {
        return this.a.s();
    }

    @Override // defpackage.rr7
    public final void t() {
        this.a.t();
    }
}

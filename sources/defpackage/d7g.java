package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d7g implements il6 {
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public float j;
    public float k;
    public float l;
    public float m;
    public long n;
    public z0h o;
    public boolean p;
    public int q;
    public long r;
    public il6 s;
    public owa t;
    public hzf u;
    public int v;
    public knd w;

    public d7g() {
        long j = l09.a;
        this.h = j;
        this.i = j;
        this.m = 8.0f;
        this.n = hbj.b;
        this.o = nym.a;
        this.q = 0;
        this.r = 9205357640488583168L;
        this.s = bwn.a();
        this.t = owa.Ltr;
        this.v = 3;
    }

    public final void B(long j) {
        if (!hbj.a(this.n, j)) {
            this.a |= 4096;
            this.n = j;
        }
    }

    public final void C(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public final void G(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    public final void a() {
        r(1.0f);
        s(1.0f);
        b(1.0f);
        C(0.0f);
        G(0.0f);
        u(0.0f);
        long j = l09.a;
        c(j);
        z(j);
        m(0.0f);
        o(0.0f);
        q(0.0f);
        e(8.0f);
        B(hbj.b);
        y(nym.a);
        f(false);
        j(null);
        if (!Intrinsics.areEqual(null, null)) {
            this.a |= 262144;
        }
        if (this.v != 3) {
            this.a |= 524288;
            this.v = 3;
        }
        h(0);
        this.r = 9205357640488583168L;
        this.w = null;
        this.a = 0;
    }

    public final void b(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void c(long j) {
        long j2 = this.h;
        int i = ib4.n;
        if (!hkj.a(j2, j)) {
            this.a |= 64;
            this.h = j;
        }
    }

    public final void e(float f) {
        if (this.m == f) {
            return;
        }
        this.a |= 2048;
        this.m = f;
    }

    public final void f(boolean z) {
        if (this.p != z) {
            this.a |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.p = z;
        }
    }

    @Override // defpackage.il6
    public final float getDensity() {
        return this.s.getDensity();
    }

    public final void h(int i) {
        if (this.q == i) {
            return;
        }
        this.a |= 32768;
        this.q = i;
    }

    public final void j(hzf hzfVar) {
        if (!Intrinsics.areEqual(this.u, hzfVar)) {
            this.a |= 131072;
            this.u = hzfVar;
        }
    }

    public final void m(float f) {
        if (this.j == f) {
            return;
        }
        this.a |= 256;
        this.j = f;
    }

    public final void o(float f) {
        if (this.k == f) {
            return;
        }
        this.a |= Barcode.FORMAT_UPC_A;
        this.k = f;
    }

    public final void q(float f) {
        if (this.l == f) {
            return;
        }
        this.a |= Barcode.FORMAT_UPC_E;
        this.l = f;
    }

    @Override // defpackage.il6
    public final float q0() {
        return this.s.q0();
    }

    public final void r(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void s(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void u(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }

    public final void y(z0h z0hVar) {
        if (!Intrinsics.areEqual(this.o, z0hVar)) {
            this.a |= 8192;
            this.o = z0hVar;
        }
    }

    public final void z(long j) {
        long j2 = this.i;
        int i = ib4.n;
        if (!hkj.a(j2, j)) {
            this.a |= 128;
            this.i = j;
        }
    }
}

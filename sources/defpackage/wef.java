package defpackage;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wef extends ms8 {
    public static final wef u;
    public static final mia v = new mia(22);
    public final gw1 b;
    public int c;
    public List d;
    public boolean e;
    public int f;
    public wef g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public wef m;
    public int n;
    public wef o;
    public int p;
    public int q;
    public List r;
    public byte s;
    public int t;

    static {
        wef wefVar = new wef();
        u = wefVar;
        wefVar.q();
    }

    public wef(x84 x84Var, nt7 nt7Var) {
        boolean z;
        this.s = (byte) -1;
        this.t = -1;
        q();
        ew1 ew1Var = new ew1();
        hj1 u2 = hj1.u(ew1Var, 1);
        boolean z2 = false;
        int i = 0;
        while (!z2) {
            try {
                try {
                    int n = x84Var.n();
                    mia miaVar = v;
                    vef vefVar = null;
                    switch (n) {
                        case 0:
                            break;
                        case 8:
                            this.c |= 4096;
                            this.q = x84Var.k();
                            continue;
                        case MlKitException.UNSUPPORTED /* 18 */:
                            if ((i & 1) != 1) {
                                this.d = new ArrayList();
                                i |= 1;
                            }
                            this.d.add(x84Var.g(uef.i, nt7Var));
                            continue;
                        case 24:
                            this.c |= 1;
                            if (x84Var.l() != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.e = z;
                            continue;
                        case 32:
                            this.c |= 2;
                            this.f = x84Var.k();
                            continue;
                        case 42:
                            if ((this.c & 4) == 4) {
                                wef wefVar = this.g;
                                wefVar.getClass();
                                vefVar = r(wefVar);
                            }
                            wef wefVar2 = (wef) x84Var.g(miaVar, nt7Var);
                            this.g = wefVar2;
                            if (vefVar != null) {
                                vefVar.m(wefVar2);
                                this.g = vefVar.k();
                            }
                            this.c |= 4;
                            continue;
                        case 48:
                            this.c |= 16;
                            this.i = x84Var.k();
                            continue;
                        case 56:
                            this.c |= 32;
                            this.j = x84Var.k();
                            continue;
                        case 64:
                            this.c |= 8;
                            this.h = x84Var.k();
                            continue;
                        case 72:
                            this.c |= 64;
                            this.k = x84Var.k();
                            continue;
                        case 82:
                            if ((this.c & 256) == 256) {
                                wef wefVar3 = this.m;
                                wefVar3.getClass();
                                vefVar = r(wefVar3);
                            }
                            wef wefVar4 = (wef) x84Var.g(miaVar, nt7Var);
                            this.m = wefVar4;
                            if (vefVar != null) {
                                vefVar.m(wefVar4);
                                this.m = vefVar.k();
                            }
                            this.c |= 256;
                            continue;
                        case 88:
                            this.c |= Barcode.FORMAT_UPC_A;
                            this.n = x84Var.k();
                            continue;
                        case 96:
                            this.c |= 128;
                            this.l = x84Var.k();
                            continue;
                        case 106:
                            if ((this.c & Barcode.FORMAT_UPC_E) == 1024) {
                                wef wefVar5 = this.o;
                                wefVar5.getClass();
                                vefVar = r(wefVar5);
                            }
                            wef wefVar6 = (wef) x84Var.g(miaVar, nt7Var);
                            this.o = wefVar6;
                            if (vefVar != null) {
                                vefVar.m(wefVar6);
                                this.o = vefVar.k();
                            }
                            this.c |= Barcode.FORMAT_UPC_E;
                            continue;
                        case 112:
                            this.c |= 2048;
                            this.p = x84Var.k();
                            continue;
                        case 802:
                            if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                                this.r = new ArrayList();
                                i |= Http2.INITIAL_MAX_FRAME_SIZE;
                            }
                            this.r.add(x84Var.g(kdf.h, nt7Var));
                            continue;
                        default:
                            if (!n(x84Var, u2, nt7Var, n)) {
                                break;
                            } else {
                                break;
                            }
                    }
                    z2 = true;
                } catch (a8a e) {
                    e.a = this;
                    throw e;
                } catch (IOException e2) {
                    a8a a8aVar = new a8a(e2.getMessage());
                    a8aVar.a = this;
                    throw a8aVar;
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.d = Collections.unmodifiableList(this.d);
                }
                if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                try {
                    u2.B();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.b = ew1Var.o();
                    throw th2;
                }
                this.b = ew1Var.o();
                m();
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
            this.r = Collections.unmodifiableList(this.r);
        }
        try {
            u2.B();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.b = ew1Var.o();
            throw th3;
        }
        this.b = ew1Var.o();
        m();
    }

    public static vef r(wef wefVar) {
        vef l = vef.l();
        l.m(wefVar);
        return l;
    }

    @Override // defpackage.odc
    public final ndc a() {
        return u;
    }

    @Override // defpackage.odc
    public final boolean b() {
        byte b = this.s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!((uef) this.d.get(i)).b()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if ((this.c & 4) == 4 && !this.g.b()) {
            this.s = (byte) 0;
            return false;
        }
        if ((this.c & 256) == 256 && !this.m.b()) {
            this.s = (byte) 0;
            return false;
        }
        if ((this.c & Barcode.FORMAT_UPC_E) == 1024 && !this.o.b()) {
            this.s = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            if (!((kdf) this.r.get(i2)).b()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if (!i()) {
            this.s = (byte) 0;
            return false;
        }
        this.s = (byte) 1;
        return true;
    }

    @Override // defpackage.ndc
    public final hs8 c() {
        return r(this);
    }

    @Override // defpackage.ndc
    public final int d() {
        int i;
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        if ((this.c & 4096) == 4096) {
            i = hj1.e(1, this.q);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            i += hj1.g(2, (ndc) this.d.get(i3));
        }
        if ((this.c & 1) == 1) {
            i += hj1.k(3) + 1;
        }
        if ((this.c & 2) == 2) {
            i += hj1.e(4, this.f);
        }
        if ((this.c & 4) == 4) {
            i += hj1.g(5, this.g);
        }
        if ((this.c & 16) == 16) {
            i += hj1.e(6, this.i);
        }
        if ((this.c & 32) == 32) {
            i += hj1.e(7, this.j);
        }
        if ((this.c & 8) == 8) {
            i += hj1.e(8, this.h);
        }
        if ((this.c & 64) == 64) {
            i += hj1.e(9, this.k);
        }
        if ((this.c & 256) == 256) {
            i += hj1.g(10, this.m);
        }
        if ((this.c & Barcode.FORMAT_UPC_A) == 512) {
            i += hj1.e(11, this.n);
        }
        if ((this.c & 128) == 128) {
            i += hj1.e(12, this.l);
        }
        if ((this.c & Barcode.FORMAT_UPC_E) == 1024) {
            i += hj1.g(13, this.o);
        }
        if ((this.c & 2048) == 2048) {
            i += hj1.e(14, this.p);
        }
        for (int i4 = 0; i4 < this.r.size(); i4++) {
            i += hj1.g(100, (ndc) this.r.get(i4));
        }
        int size = this.b.size() + j() + i;
        this.t = size;
        return size;
    }

    @Override // defpackage.ndc
    public final void e(hj1 hj1Var) {
        d();
        a35 a35Var = new a35(this);
        if ((this.c & 4096) == 4096) {
            hj1Var.F(1, this.q);
        }
        for (int i = 0; i < this.d.size(); i++) {
            hj1Var.H(2, (ndc) this.d.get(i));
        }
        if ((this.c & 1) == 1) {
            boolean z = this.e;
            hj1Var.Q(3, 0);
            hj1Var.J(z ? 1 : 0);
        }
        if ((this.c & 2) == 2) {
            hj1Var.F(4, this.f);
        }
        if ((this.c & 4) == 4) {
            hj1Var.H(5, this.g);
        }
        if ((this.c & 16) == 16) {
            hj1Var.F(6, this.i);
        }
        if ((this.c & 32) == 32) {
            hj1Var.F(7, this.j);
        }
        if ((this.c & 8) == 8) {
            hj1Var.F(8, this.h);
        }
        if ((this.c & 64) == 64) {
            hj1Var.F(9, this.k);
        }
        if ((this.c & 256) == 256) {
            hj1Var.H(10, this.m);
        }
        if ((this.c & Barcode.FORMAT_UPC_A) == 512) {
            hj1Var.F(11, this.n);
        }
        if ((this.c & 128) == 128) {
            hj1Var.F(12, this.l);
        }
        if ((this.c & Barcode.FORMAT_UPC_E) == 1024) {
            hj1Var.H(13, this.o);
        }
        if ((this.c & 2048) == 2048) {
            hj1Var.F(14, this.p);
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            hj1Var.H(100, (ndc) this.r.get(i2));
        }
        a35Var.o(200, hj1Var);
        hj1Var.K(this.b);
    }

    @Override // defpackage.ndc
    public final hs8 f() {
        return vef.l();
    }

    public final boolean p() {
        if ((this.c & 16) == 16) {
            return true;
        }
        return false;
    }

    public final void q() {
        List list = Collections.EMPTY_LIST;
        this.d = list;
        this.e = false;
        this.f = 0;
        wef wefVar = u;
        this.g = wefVar;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = wefVar;
        this.n = 0;
        this.o = wefVar;
        this.p = 0;
        this.q = 0;
        this.r = list;
    }

    public wef() {
        this.s = (byte) -1;
        this.t = -1;
        this.b = gw1.a;
    }

    public wef(vef vefVar) {
        super(vefVar);
        this.s = (byte) -1;
        this.t = -1;
        this.b = vefVar.a;
    }
}

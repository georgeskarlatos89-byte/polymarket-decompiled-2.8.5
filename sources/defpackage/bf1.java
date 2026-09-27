package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bf1 implements lbi, vx5 {
    public final go a;
    public final Object b;
    public final ArrayDeque c;
    public final ArrayDeque d;
    public final zx5[] e;
    public final ay5[] f;
    public int g;
    public int h;
    public zx5 i;
    public xx5 j;
    public boolean k;
    public boolean l;
    public long m;
    public final /* synthetic */ int n;
    public final Object o;

    public bf1(zx5[] zx5VarArr, ay5[] ay5VarArr) {
        ay5 af1Var;
        zx5 zx5Var;
        this.b = new Object();
        this.m = -9223372036854775807L;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = zx5VarArr;
        this.g = zx5VarArr.length;
        for (int i = 0; i < this.g; i++) {
            zx5[] zx5VarArr2 = this.e;
            switch (this.n) {
                case 0:
                    zx5Var = new zx5(1);
                    break;
                default:
                    zx5Var = new zx5(1);
                    break;
            }
            zx5VarArr2[i] = zx5Var;
        }
        this.f = ay5VarArr;
        this.h = ay5VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            ay5[] ay5VarArr2 = this.f;
            switch (this.n) {
                case 0:
                    af1Var = new af1(this);
                    break;
                default:
                    af1Var = new za3(this);
                    break;
            }
            ay5VarArr2[i2] = af1Var;
        }
        go goVar = new go(this);
        this.a = goVar;
        goVar.start();
    }

    @Override // defpackage.vx5
    public final /* bridge */ /* synthetic */ Object b() {
        return i();
    }

    @Override // defpackage.vx5
    public final /* bridge */ /* synthetic */ void c(pbi pbiVar) {
        j(pbiVar);
    }

    @Override // defpackage.vx5
    public final void d(long j) {
        boolean z;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length && !this.k) {
                    z = false;
                    pfn.f(z);
                    this.m = j;
                }
                z = true;
                pfn.f(z);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vx5
    public final Object e() {
        boolean z;
        zx5 zx5Var;
        synchronized (this.b) {
            try {
                xx5 xx5Var = this.j;
                if (xx5Var == null) {
                    if (this.i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    pfn.f(z);
                    int i = this.g;
                    if (i == 0) {
                        zx5Var = null;
                    } else {
                        zx5[] zx5VarArr = this.e;
                        int i2 = i - 1;
                        this.g = i2;
                        zx5Var = zx5VarArr[i2];
                    }
                    this.i = zx5Var;
                } else {
                    throw xx5Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zx5Var;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [xx5, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v3, types: [xx5, java.lang.Exception] */
    public final xx5 f(Throwable th) {
        switch (this.n) {
            case 0:
                return new Exception("Unexpected decode error", th);
            default:
                return new Exception("Unexpected decode error", th);
        }
    }

    @Override // defpackage.vx5
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                zx5 zx5Var = this.i;
                if (zx5Var != null) {
                    zx5Var.x();
                    zx5[] zx5VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    zx5VarArr[i] = zx5Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    zx5 zx5Var2 = (zx5) this.c.removeFirst();
                    zx5Var2.x();
                    zx5[] zx5VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    zx5VarArr2[i2] = zx5Var2;
                }
                while (!this.d.isEmpty()) {
                    ((ay5) this.d.removeFirst()).y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final xx5 g(zx5 zx5Var, ay5 ay5Var, boolean z) {
        int i = this.n;
        Object obj = this.o;
        boolean z2 = false;
        switch (i) {
            case 0:
                af1 af1Var = (af1) ay5Var;
                try {
                    ByteBuffer byteBuffer = zx5Var.e;
                    byteBuffer.getClass();
                    pfn.f(byteBuffer.hasArray());
                    if (byteBuffer.arrayOffset() == 0) {
                        z2 = true;
                    }
                    pfn.b(z2);
                    byte[] array = byteBuffer.array();
                    int remaining = byteBuffer.remaining();
                    ((f27) obj).getClass();
                    af1Var.e = f27.f(remaining, array);
                    af1Var.c = zx5Var.g;
                    return null;
                } catch (tn9 e) {
                    return e;
                }
            default:
                pbi pbiVar = (pbi) zx5Var;
                za3 za3Var = (za3) ay5Var;
                try {
                    ByteBuffer byteBuffer2 = pbiVar.e;
                    byteBuffer2.getClass();
                    byte[] array2 = byteBuffer2.array();
                    int limit = byteBuffer2.limit();
                    tbi tbiVar = (tbi) obj;
                    if (z) {
                        tbiVar.reset();
                    }
                    kbi B = tbiVar.B(array2, 0, limit);
                    long j = pbiVar.g;
                    long j2 = pbiVar.j;
                    za3Var.c = j;
                    za3Var.e = B;
                    if (j2 != Long.MAX_VALUE) {
                        j = j2;
                    }
                    za3Var.f = j;
                    za3Var.d = false;
                    return null;
                } catch (mbi e2) {
                    return e2;
                }
        }
    }

    public final boolean h() {
        boolean z;
        xx5 f;
        boolean z2;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            zx5 zx5Var = (zx5) this.c.removeFirst();
            ay5[] ay5VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            ay5 ay5Var = ay5VarArr[i];
            boolean z3 = this.k;
            this.k = false;
            if (zx5Var.f(4)) {
                ay5Var.b(4);
            } else {
                ay5Var.c = zx5Var.g;
                if (zx5Var.f(134217728)) {
                    ay5Var.b(134217728);
                }
                long j = zx5Var.g;
                synchronized (this.b) {
                    long j2 = this.m;
                    if (j2 != -9223372036854775807L && j < j2) {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    ay5Var.d = true;
                }
                try {
                    f = g(zx5Var, ay5Var, z3);
                } catch (OutOfMemoryError e) {
                    f = f(e);
                } catch (RuntimeException e2) {
                    f = f(e2);
                }
                if (f != null) {
                    synchronized (this.b) {
                        this.j = f;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        ay5Var.y();
                    } else if (ay5Var.d) {
                        ay5Var.y();
                    } else {
                        this.d.addLast(ay5Var);
                    }
                    zx5Var.x();
                    zx5[] zx5VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    zx5VarArr[i2] = zx5Var;
                } finally {
                }
            }
            return true;
        }
    }

    public final ay5 i() {
        synchronized (this.b) {
            try {
                xx5 xx5Var = this.j;
                if (xx5Var == null) {
                    if (this.d.isEmpty()) {
                        return null;
                    }
                    return (ay5) this.d.removeFirst();
                }
                throw xx5Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(zx5 zx5Var) {
        boolean z;
        synchronized (this.b) {
            try {
                xx5 xx5Var = this.j;
                if (xx5Var == null) {
                    if (zx5Var == this.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    pfn.b(z);
                    this.c.addLast(zx5Var);
                    if (!this.c.isEmpty() && this.h > 0) {
                        this.b.notify();
                    }
                    this.i = null;
                } else {
                    throw xx5Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(ay5 ay5Var) {
        synchronized (this.b) {
            ay5Var.x();
            ay5[] ay5VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            ay5VarArr[i] = ay5Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // defpackage.vx5
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.lbi
    public void a(long j) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bf1(tbi tbiVar) {
        this(new pbi[2], new za3[2]);
        this.n = 1;
        int i = this.g;
        zx5[] zx5VarArr = this.e;
        pfn.f(i == zx5VarArr.length);
        for (zx5 zx5Var : zx5VarArr) {
            zx5Var.z(Barcode.FORMAT_UPC_E);
        }
        this.o = tbiVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bf1(f27 f27Var) {
        this(new zx5[1], new af1[1]);
        this.n = 0;
        this.o = f27Var;
    }
}

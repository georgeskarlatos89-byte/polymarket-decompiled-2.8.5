package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eeh implements kt0 {
    public float b;
    public float c;
    public it0 d;
    public it0 e;
    public it0 f;
    public it0 g;
    public boolean h;
    public deh i;
    public ByteBuffer j;
    public ShortBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // defpackage.kt0
    public final ByteBuffer a() {
        boolean z;
        deh dehVar = this.i;
        if (dehVar != null) {
            int i = dehVar.b;
            boolean z2 = true;
            if (dehVar.m >= 0) {
                z = true;
            } else {
                z = false;
            }
            pfn.f(z);
            int i2 = dehVar.m * i * 2;
            if (i2 > 0) {
                if (this.j.capacity() < i2) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.j = order;
                    this.k = order.asShortBuffer();
                } else {
                    this.j.clear();
                    this.k.clear();
                }
                ShortBuffer shortBuffer = this.k;
                if (dehVar.m < 0) {
                    z2 = false;
                }
                pfn.f(z2);
                int min = Math.min(shortBuffer.remaining() / i, dehVar.m);
                int i3 = min * i;
                shortBuffer.put(dehVar.l, 0, i3);
                int i4 = dehVar.m - min;
                dehVar.m = i4;
                short[] sArr = dehVar.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.n += i2;
                this.j.limit(i2);
                this.l = this.j;
            }
        }
        ByteBuffer byteBuffer = this.l;
        this.l = kt0.a;
        return byteBuffer;
    }

    @Override // defpackage.kt0
    public final void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        deh dehVar = this.i;
        dehVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.m += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i = dehVar.b;
        int i2 = remaining2 / i;
        short[] c = dehVar.c(dehVar.j, dehVar.k, i2);
        dehVar.j = c;
        asShortBuffer.get(c, dehVar.k * i, ((i2 * i) * 2) / 2);
        dehVar.k += i2;
        dehVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // defpackage.kt0
    public final it0 c(it0 it0Var) {
        if (it0Var.c == 2) {
            int i = it0Var.a;
            this.d = it0Var;
            it0 it0Var2 = new it0(i, it0Var.b, 2);
            this.e = it0Var2;
            this.h = true;
            return it0Var2;
        }
        throw new jt0(it0Var);
    }

    @Override // defpackage.kt0
    public final void d() {
        deh dehVar = this.i;
        if (dehVar != null) {
            int i = dehVar.k;
            float f = dehVar.c;
            float f2 = dehVar.d;
            double d = f / f2;
            int i2 = dehVar.m + ((int) (((((((i - r6) / d) + dehVar.r) + dehVar.w) + dehVar.o) / (dehVar.e * f2)) + 0.5d));
            dehVar.w = ConstantsKt.UNSET;
            short[] sArr = dehVar.j;
            int i3 = dehVar.h * 2;
            dehVar.j = dehVar.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = dehVar.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                dehVar.j[(i5 * i) + i4] = 0;
                i4++;
            }
            dehVar.k = i3 + dehVar.k;
            dehVar.f();
            if (dehVar.m > i2) {
                dehVar.m = Math.max(i2, 0);
            }
            dehVar.k = 0;
            dehVar.r = 0;
            dehVar.o = 0;
        }
        this.o = true;
    }

    @Override // defpackage.kt0
    public final boolean e() {
        boolean z;
        if (this.o) {
            deh dehVar = this.i;
            if (dehVar != null) {
                if (dehVar.m >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                pfn.f(z);
                if (dehVar.m * dehVar.b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.kt0
    public final void flush() {
        if (isActive()) {
            it0 it0Var = this.d;
            this.f = it0Var;
            it0 it0Var2 = this.e;
            this.g = it0Var2;
            if (this.h) {
                this.i = new deh(it0Var.a, it0Var.b, this.b, this.c, it0Var2.a);
            } else {
                deh dehVar = this.i;
                if (dehVar != null) {
                    dehVar.k = 0;
                    dehVar.m = 0;
                    dehVar.o = 0;
                    dehVar.p = 0;
                    dehVar.q = 0;
                    dehVar.r = 0;
                    dehVar.s = 0;
                    dehVar.t = 0;
                    dehVar.u = 0;
                    dehVar.v = 0;
                    dehVar.w = ConstantsKt.UNSET;
                }
            }
        }
        this.l = kt0.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // defpackage.kt0
    public final boolean isActive() {
        if (this.e.a != -1) {
            if (Math.abs(this.b - 1.0f) >= 1.0E-4f || Math.abs(this.c - 1.0f) >= 1.0E-4f || this.e.a != this.d.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.kt0
    public final void reset() {
        this.b = 1.0f;
        this.c = 1.0f;
        it0 it0Var = it0.e;
        this.d = it0Var;
        this.e = it0Var;
        this.f = it0Var;
        this.g = it0Var;
        ByteBuffer byteBuffer = kt0.a;
        this.j = byteBuffer;
        this.k = byteBuffer.asShortBuffer();
        this.l = byteBuffer;
        this.h = false;
        this.i = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }
}

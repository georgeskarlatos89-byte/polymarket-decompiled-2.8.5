package defpackage;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v14 implements tu7, uu7, iid {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ v14(iam iamVar, long j) {
        boolean z;
        this.a = 8;
        this.c = iamVar;
        arn.e("health_monitor");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        arn.b(z);
        this.b = j;
    }

    public void A() {
        iam iamVar = (iam) this.c;
        iamVar.g1();
        ((kfm) iamVar.a).k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = iamVar.k1().edit();
        edit.remove("health_monitor:count");
        edit.remove("health_monitor:value");
        edit.putLong("health_monitor:start", currentTimeMillis);
        edit.apply();
    }

    @Override // defpackage.tu7
    public boolean b(byte[] bArr, int i, int i2, boolean z) {
        return ((tu7) this.c).b(bArr, i, i2, z);
    }

    @Override // defpackage.tu7
    public void d() {
        ((tu7) this.c).d();
    }

    @Override // defpackage.tu7
    public boolean f(byte[] bArr, int i, int i2, boolean z) {
        return ((tu7) this.c).f(bArr, 0, i2, z);
    }

    @Override // defpackage.tu7
    public long g() {
        return ((tu7) this.c).g() - this.b;
    }

    @Override // defpackage.tu7
    public long getLength() {
        return ((tu7) this.c).getLength() - this.b;
    }

    @Override // defpackage.tu7
    public long getPosition() {
        return ((tu7) this.c).getPosition() - this.b;
    }

    @Override // defpackage.tu7
    public void h(int i) {
        ((tu7) this.c).h(i);
    }

    @Override // defpackage.uu7
    public void i(ong ongVar) {
        ((uu7) this.c).i(new pvh(this, ongVar, ongVar));
    }

    @Override // defpackage.tu7
    public int j(int i) {
        return ((tu7) this.c).j(i);
    }

    @Override // defpackage.tu7
    public int k(byte[] bArr, int i, int i2) {
        return ((tu7) this.c).k(bArr, i, i2);
    }

    @Override // defpackage.tu7
    public void l(int i) {
        ((tu7) this.c).l(i);
    }

    @Override // defpackage.uu7
    public void m() {
        ((uu7) this.c).m();
    }

    @Override // defpackage.tu7
    public boolean n(int i, boolean z) {
        return ((tu7) this.c).n(i, true);
    }

    @Override // defpackage.tu7
    public void o(byte[] bArr, int i, int i2) {
        ((tu7) this.c).o(bArr, i, i2);
    }

    @Override // defpackage.iid
    public void onFailure(Exception exc) {
        qw4 qw4Var;
        switch (this.a) {
            case 6:
                ry9 ry9Var = (ry9) this.c;
                long j = this.b;
                ry9Var.getClass();
                Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
                if ((exc instanceof qd0) && (qw4Var = ((qd0) exc).a.d) != null && qw4Var.b == 24) {
                    ((AtomicLong) ry9Var.c).set(j);
                    return;
                }
                return;
            case 7:
                ((AtomicLong) ((ndj) this.c).d).set(this.b);
                return;
            case 8:
            default:
                ((wzn) this.c).b.set(this.b);
                return;
            case 9:
                ((obn) this.c).b.set(this.b);
                return;
            case 10:
                ((yun) this.c).b.set(this.b);
                return;
            case 11:
                ((dwn) this.c).b.set(this.b);
                return;
        }
    }

    public void p(int i) {
        if (i >= 64) {
            v14 v14Var = (v14) this.c;
            if (v14Var != null) {
                v14Var.p(i - 64);
                return;
            }
            return;
        }
        this.b &= ~(1 << i);
    }

    public int q(int i) {
        v14 v14Var = (v14) this.c;
        if (v14Var == null) {
            long j = this.b;
            if (i >= 64) {
                return Long.bitCount(j);
            }
            return Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + v14Var.q(i - 64);
    }

    @Override // defpackage.uu7
    public q8j r(int i, int i2) {
        return ((uu7) this.c).r(i, i2);
    }

    @Override // defpackage.vo5
    public int read(byte[] bArr, int i, int i2) {
        return ((tu7) this.c).read(bArr, i, i2);
    }

    @Override // defpackage.tu7
    public void readFully(byte[] bArr, int i, int i2) {
        ((tu7) this.c).readFully(bArr, i, i2);
    }

    public void s() {
        if (((v14) this.c) == null) {
            this.c = new v14();
        }
    }

    public boolean t(int i) {
        if (i >= 64) {
            s();
            return ((v14) this.c).t(i - 64);
        }
        if (((1 << i) & this.b) != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((v14) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((v14) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public long u(float f, long j, boolean z) {
        long f2;
        float abs;
        long j2;
        long j3 = this.b;
        if (z) {
            f2 = ogd.f(j3, j);
            this.b = f2;
        } else {
            f2 = ogd.f(j3, j);
        }
        if (((xmd) this.c) == null) {
            abs = ogd.d(f2);
        } else {
            abs = Math.abs(w(f2));
        }
        if (abs >= f) {
            xmd xmdVar = (xmd) this.c;
            long j4 = this.b;
            if (xmdVar == null) {
                return ogd.e(this.b, ogd.g(f, ogd.b(ogd.d(j4), j4)));
            }
            float w = w(j4) - (Math.signum(w(this.b)) * f);
            long j5 = this.b;
            xmd xmdVar2 = (xmd) this.c;
            xmd xmdVar3 = xmd.Horizontal;
            if (xmdVar2 == xmdVar3) {
                j2 = j5 & 4294967295L;
            } else {
                j2 = j5 >> 32;
            }
            float intBitsToFloat = Float.intBitsToFloat((int) j2);
            if (((xmd) this.c) == xmdVar3) {
                return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(w) << 32);
            }
            return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(w) & 4294967295L);
        }
        return 9205357640488583168L;
    }

    public void v(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            s();
            ((v14) this.c).v(i - 64, z);
            return;
        }
        long j = this.b;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            z(i);
        } else {
            p(i);
        }
        if (!z2 && ((v14) this.c) == null) {
            return;
        }
        s();
        ((v14) this.c).v(0, z2);
    }

    public float w(long j) {
        long j2;
        if (((xmd) this.c) == xmd.Horizontal) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public boolean x(int i) {
        boolean z;
        if (i >= 64) {
            s();
            return ((v14) this.c).x(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        v14 v14Var = (v14) this.c;
        if (v14Var != null) {
            if (v14Var.t(0)) {
                z(63);
            }
            ((v14) this.c).x(0);
        }
        return z;
    }

    public void y() {
        this.b = 0L;
        v14 v14Var = (v14) this.c;
        if (v14Var != null) {
            v14Var.y();
        }
    }

    public void z(int i) {
        if (i >= 64) {
            s();
            ((v14) this.c).z(i - 64);
        } else {
            this.b |= 1 << i;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v14(xmd xmdVar) {
        this(xmdVar, 0L, 5);
        this.a = 5;
    }

    public /* synthetic */ v14(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public /* synthetic */ v14(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public v14(Context context) {
        this.a = 2;
        this.c = context;
        this.b = context.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    public v14(tu7 tu7Var, long j) {
        this.a = 3;
        this.c = tu7Var;
        pfn.b(tu7Var.getPosition() >= j);
        this.b = j;
    }

    public v14() {
        this.a = 0;
        this.b = 0L;
    }
}

package defpackage;

import androidx.work.OverwritingInputMerger;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xok {
    public final String a;
    public iok b;
    public final String c;
    public final String d;
    public bo5 e;
    public final bo5 f;
    public final long g;
    public final long h;
    public final long i;
    public qz4 j;
    public final int k;
    public final n31 l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final dnd r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;

    static {
        dm0.j("WorkSpec");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ xok(String str, iok iokVar, String str2, String str3, bo5 bo5Var, bo5 bo5Var2, long j, long j2, long j3, qz4 qz4Var, int i, n31 n31Var, long j4, long j5, long j6, long j7, boolean z, dnd dndVar, int i2, long j8, int i3, int i4, int i5) {
        this(str, r4, str2, r6, r7, r8, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & Barcode.FORMAT_UPC_A) != 0 ? qz4.i : qz4Var, (i5 & Barcode.FORMAT_UPC_E) != 0 ? 0 : i, (i5 & 2048) != 0 ? n31.EXPONENTIAL : n31Var, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z, (131072 & i5) != 0 ? dnd.RUN_AS_NON_EXPEDITED_WORK_REQUEST : dndVar, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (i5 & 4194304) != 0 ? -256 : i4);
        bo5 bo5Var3;
        bo5 bo5Var4;
        iok iokVar2 = (i5 & 2) != 0 ? iok.ENQUEUED : iokVar;
        String name = (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3;
        if ((i5 & 16) != 0) {
            bo5 bo5Var5 = bo5.c;
            bo5Var5.getClass();
            bo5Var3 = bo5Var5;
        } else {
            bo5Var3 = bo5Var;
        }
        if ((i5 & 32) != 0) {
            bo5 bo5Var6 = bo5.c;
            bo5Var6.getClass();
            bo5Var4 = bo5Var6;
        } else {
            bo5Var4 = bo5Var2;
        }
    }

    public final long a() {
        boolean z;
        long j;
        long scalb;
        iok iokVar = this.b;
        iok iokVar2 = iok.ENQUEUED;
        int i = this.k;
        if (iokVar == iokVar2 && i > 0) {
            z = true;
        } else {
            z = false;
        }
        long j2 = this.n;
        boolean c = c();
        n31 n31Var = this.l;
        n31Var.getClass();
        long j3 = this.u;
        int i2 = this.s;
        if (j3 != Long.MAX_VALUE && c) {
            if (i2 != 0) {
                long j4 = j2 + 900000;
                if (j3 < j4) {
                    return j4;
                }
                return j3;
            }
            return j3;
        }
        if (z) {
            n31 n31Var2 = n31.LINEAR;
            long j5 = this.m;
            if (n31Var == n31Var2) {
                scalb = j5 * i;
            } else {
                scalb = Math.scalb((float) j5, i - 1);
            }
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return scalb + j2;
        }
        long j6 = this.g;
        if (c) {
            long j7 = this.h;
            if (i2 == 0) {
                j = j2 + j6;
            } else {
                j = j2 + j7;
            }
            long j8 = j;
            long j9 = this.i;
            if (j9 != j7 && i2 == 0) {
                return j8 + (j7 - j9);
            }
            return j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j6;
    }

    public final boolean b() {
        return !Intrinsics.areEqual(qz4.i, this.j);
    }

    public final boolean c() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xok)) {
            return false;
        }
        xok xokVar = (xok) obj;
        if (Intrinsics.areEqual(this.a, xokVar.a) && this.b == xokVar.b && Intrinsics.areEqual(this.c, xokVar.c) && Intrinsics.areEqual(this.d, xokVar.d) && Intrinsics.areEqual(this.e, xokVar.e) && Intrinsics.areEqual(this.f, xokVar.f) && this.g == xokVar.g && this.h == xokVar.h && this.i == xokVar.i && Intrinsics.areEqual(this.j, xokVar.j) && this.k == xokVar.k && this.l == xokVar.l && this.m == xokVar.m && this.n == xokVar.n && this.o == xokVar.o && this.p == xokVar.p && this.q == xokVar.q && this.r == xokVar.r && this.s == xokVar.s && this.t == xokVar.t && this.u == xokVar.u && this.v == xokVar.v && this.w == xokVar.w) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int d = woa.d(woa.d(woa.d(woa.d((this.l.hashCode() + woa.b(this.k, (this.j.hashCode() + woa.d(woa.d(woa.d((this.f.hashCode() + ((this.e.hashCode() + hdi.e(hdi.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        boolean z = this.q;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Integer.hashCode(this.w) + woa.b(this.v, woa.d(woa.b(this.t, woa.b(this.s, (this.r.hashCode() + ((d + i) * 31)) * 31, 31), 31), 31, this.u), 31);
    }

    public final String toString() {
        return m51.m(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public xok(String str, iok iokVar, String str2, String str3, bo5 bo5Var, bo5 bo5Var2, long j, long j2, long j3, qz4 qz4Var, int i, n31 n31Var, long j4, long j5, long j6, long j7, boolean z, dnd dndVar, int i2, int i3, long j8, int i4, int i5) {
        str.getClass();
        iokVar.getClass();
        str2.getClass();
        str3.getClass();
        bo5Var.getClass();
        bo5Var2.getClass();
        qz4Var.getClass();
        n31Var.getClass();
        dndVar.getClass();
        this.a = str;
        this.b = iokVar;
        this.c = str2;
        this.d = str3;
        this.e = bo5Var;
        this.f = bo5Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = qz4Var;
        this.k = i;
        this.l = n31Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = dndVar;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
    }
}

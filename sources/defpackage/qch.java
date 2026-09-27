package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class qch {
    public static final h6h a = new h6h(4);
    public static final bm9 b = new bm9(25);
    public static final Object c = new Object();
    public static pch d;
    public static long e;
    public static final afc f;
    public static final vt1 g;
    public static List h;
    public static List i;
    public static final rw8 j;
    public static final ep0 k;

    /* JADX WARN: Type inference failed for: r0v13, types: [ep0, java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, afc] */
    /* JADX WARN: Type inference failed for: r1v4, types: [oqc, kch, rw8] */
    static {
        pch pchVar = pch.e;
        d = pchVar;
        e = 2L;
        ?? obj = new Object();
        obj.c = new long[16];
        obj.d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        obj.e = iArr;
        f = obj;
        vt1 vt1Var = new vt1((char) 0, 15);
        vt1Var.b = new int[16];
        vt1Var.d = new ahk[16];
        g = vt1Var;
        h = CollectionsKt.emptyList();
        i = CollectionsKt.emptyList();
        long j2 = e;
        e = 1 + j2;
        ?? oqcVar = new oqc(j2, pchVar, null, new ex7(26));
        d = d.f(oqcVar.b);
        j = oqcVar;
        k = new AtomicInteger(0);
    }

    public static final pch a(pch pchVar, long j2, long j3) {
        while (Intrinsics.e(j2, j3) < 0) {
            pchVar = pchVar.f(j2);
            j2++;
        }
        return pchVar;
    }

    public static final Object b(Function1 function1) {
        jqc jqcVar;
        Object u;
        rw8 rw8Var = j;
        synchronized (c) {
            try {
                jqcVar = rw8Var.h;
                if (jqcVar != null) {
                    k.addAndGet(1);
                }
                u = u(rw8Var, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jqcVar != null) {
            try {
                List list = h;
                iig iigVar = new iig(jqcVar);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function2) list.get(i2)).invoke(iigVar, rw8Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            d();
            if (jqcVar != null) {
                Object[] objArr = jqcVar.b;
                long[] jArr = jqcVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    p((hxh) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return u;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        vt1 vt1Var = g;
        int i2 = vt1Var.c;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= i2) {
                break;
            }
            ahk ahkVar = ((ahk[]) vt1Var.d)[i3];
            if (ahkVar != null) {
                obj = ahkVar.get();
            }
            if (obj != null && o((hxh) obj)) {
                if (i4 != i3) {
                    ((ahk[]) vt1Var.d)[i4] = ahkVar;
                    int[] iArr = (int[]) vt1Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((ahk[]) vt1Var.d)[i5] = null;
            ((int[]) vt1Var.b)[i5] = 0;
        }
        if (i4 != i2) {
            vt1Var.c = i4;
        }
    }

    public static final kch e(kch kchVar, Function1 function1, boolean z) {
        oqc oqcVar;
        boolean z2 = kchVar instanceof oqc;
        if (!z2 && kchVar != null) {
            return new fdj(kchVar, function1, false, z);
        }
        if (z2) {
            oqcVar = (oqc) kchVar;
        } else {
            oqcVar = null;
        }
        return new edj(oqcVar, function1, null, false, z);
    }

    public static final mxh f(mxh mxhVar) {
        mxh r;
        kch h2 = h();
        mxh r2 = r(mxhVar, h2.g(), h2.d());
        if (r2 == null) {
            synchronized (c) {
                kch h3 = h();
                r = r(mxhVar, h3.g(), h3.d());
            }
            if (r != null) {
                return r;
            }
            q();
            throw null;
        }
        return r2;
    }

    public static final mxh g(mxh mxhVar, kch kchVar) {
        mxh r;
        mxh r2 = r(mxhVar, kchVar.g(), kchVar.d());
        if (r2 == null) {
            synchronized (c) {
                r = r(mxhVar, kchVar.g(), kchVar.d());
            }
            if (r != null) {
                return r;
            }
            q();
            throw null;
        }
        return r2;
    }

    public static final kch h() {
        kch kchVar = (kch) b.n();
        if (kchVar == null) {
            return j;
        }
        return kchVar;
    }

    public static final Function1 i(Function1 function1, Function1 function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        if (function1 != null && function12 != null && function1 != function12) {
            return new ze9(function1, function12, 2);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    public static final Function1 j(Function1 function1, Function1 function12) {
        if (function1 != null && function12 != null && function1 != function12) {
            return new ze9(function1, function12, 3);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final mxh k(mxh mxhVar, hxh hxhVar) {
        mxh O = hxhVar.O();
        long j2 = e;
        afc afcVar = f;
        if (afcVar.a > 0) {
            j2 = ((long[]) afcVar.c)[0];
        }
        long j3 = j2 - 1;
        mxh mxhVar2 = null;
        mxh mxhVar3 = null;
        while (true) {
            if (O == null) {
                break;
            }
            long j4 = O.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && Intrinsics.e(j4, j3) <= 0 && !pch.e.c(j4)) {
                if (mxhVar3 == null) {
                    mxhVar3 = O;
                } else if (Intrinsics.e(O.a, mxhVar3.a) >= 0) {
                    mxhVar2 = mxhVar3;
                }
            }
            O = O.b;
        }
        if (mxhVar2 != null) {
            mxhVar2.a = Long.MAX_VALUE;
            return mxhVar2;
        }
        mxh b2 = mxhVar.b(Long.MAX_VALUE);
        b2.b = hxhVar.O();
        hxhVar.l(b2);
        return b2;
    }

    public static final void l(kch kchVar, hxh hxhVar) {
        kchVar.t(kchVar.h() + 1);
        Function1 i2 = kchVar.i();
        if (i2 != null) {
            i2.invoke(hxhVar);
        }
    }

    public static final HashMap m(long j2, oqc oqcVar, pch pchVar) {
        long[] jArr;
        pch pchVar2;
        long[] jArr2;
        pch pchVar3;
        int i2;
        int i3;
        mxh r;
        jqc x = oqcVar.x();
        if (x != null) {
            long g2 = oqcVar.g();
            pch d2 = oqcVar.d().f(g2).d(oqcVar.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                hxh hxhVar = (hxh) objArr[(i4 << 3) + i7];
                                mxh O = hxhVar.O();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                mxh r2 = r(O, j2, pchVar);
                                if (r2 != null && (r = r(O, g2, d2)) != null && !Intrinsics.areEqual(r2, r)) {
                                    pchVar3 = d2;
                                    mxh r3 = r(O, g2, oqcVar.d());
                                    if (r3 != null) {
                                        mxh U = hxhVar.U(r, r2, r3);
                                        if (U == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(r2, U);
                                        hashMap = hashMap;
                                    } else {
                                        q();
                                        throw null;
                                    }
                                } else {
                                    pchVar3 = d2;
                                }
                            } else {
                                jArr2 = jArr3;
                                pchVar3 = d2;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            d2 = pchVar3;
                        }
                        jArr = jArr3;
                        pchVar2 = d2;
                        if (i6 != i5) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        pchVar2 = d2;
                    }
                    if (i4 != length) {
                        i4++;
                        jArr3 = jArr;
                        d2 = pchVar2;
                    } else {
                        return hashMap;
                    }
                }
            }
        }
        return null;
    }

    public static final mxh n(mxh mxhVar, ixh ixhVar, kch kchVar, mxh mxhVar2) {
        mxh k2;
        if (kchVar.f()) {
            kchVar.n(ixhVar);
        }
        long g2 = kchVar.g();
        if (mxhVar2.a == g2) {
            return mxhVar2;
        }
        synchronized (c) {
            k2 = k(mxhVar, ixhVar);
        }
        k2.a = g2;
        if (mxhVar2.a != 1) {
            kchVar.n(ixhVar);
        }
        return k2;
    }

    public static final boolean o(hxh hxhVar) {
        mxh mxhVar;
        long j2 = e;
        afc afcVar = f;
        if (afcVar.a > 0) {
            j2 = ((long[]) afcVar.c)[0];
        }
        mxh mxhVar2 = null;
        mxh mxhVar3 = null;
        int i2 = 0;
        for (mxh O = hxhVar.O(); O != null; O = O.b) {
            long j3 = O.a;
            if (j3 != 0) {
                if (Intrinsics.e(j3, j2) < 0) {
                    if (mxhVar2 == null) {
                        i2++;
                        mxhVar2 = O;
                    } else {
                        if (Intrinsics.e(O.a, mxhVar2.a) < 0) {
                            mxhVar = mxhVar2;
                            mxhVar2 = O;
                        } else {
                            mxhVar = O;
                        }
                        if (mxhVar3 == null) {
                            mxhVar3 = hxhVar.O();
                            mxh mxhVar4 = mxhVar3;
                            while (true) {
                                if (mxhVar3 != null) {
                                    if (Intrinsics.e(mxhVar3.a, j2) >= 0) {
                                        break;
                                    }
                                    if (Intrinsics.e(mxhVar4.a, mxhVar3.a) < 0) {
                                        mxhVar4 = mxhVar3;
                                    }
                                    mxhVar3 = mxhVar3.b;
                                } else {
                                    mxhVar3 = mxhVar4;
                                    break;
                                }
                            }
                        }
                        mxhVar2.a = 0L;
                        mxhVar2.a(mxhVar3);
                        mxhVar2 = mxhVar;
                    }
                } else {
                    i2++;
                }
            }
        }
        if (i2 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(hxh hxhVar) {
        Object obj;
        Object obj2;
        Object obj3;
        if (o(hxhVar)) {
            vt1 vt1Var = g;
            int i2 = vt1Var.c;
            int identityHashCode = System.identityHashCode(hxhVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = vt1Var.c - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = ((int[]) vt1Var.b)[i6];
                        if (i7 < identityHashCode) {
                            i5 = i6 + 1;
                        } else if (i7 > identityHashCode) {
                            i4 = i6 - 1;
                        } else {
                            ahk ahkVar = ((ahk[]) vt1Var.d)[i6];
                            if (ahkVar != null) {
                                obj = ahkVar.get();
                            } else {
                                obj = null;
                            }
                            if (hxhVar != obj) {
                                for (int i8 = i6 - 1; -1 < i8 && ((int[]) vt1Var.b)[i8] == identityHashCode; i8--) {
                                    ahk ahkVar2 = ((ahk[]) vt1Var.d)[i8];
                                    if (ahkVar2 != null) {
                                        obj3 = ahkVar2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == hxhVar) {
                                        i3 = i8;
                                        break;
                                    }
                                }
                                i6++;
                                int i9 = vt1Var.c;
                                while (true) {
                                    if (i6 < i9) {
                                        if (((int[]) vt1Var.b)[i6] != identityHashCode) {
                                            i3 = -(i6 + 1);
                                            break;
                                        }
                                        ahk ahkVar3 = ((ahk[]) vt1Var.d)[i6];
                                        if (ahkVar3 != null) {
                                            obj2 = ahkVar3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == hxhVar) {
                                            break;
                                        } else {
                                            i6++;
                                        }
                                    } else {
                                        i3 = -(vt1Var.c + 1);
                                        break;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    } else {
                        i3 = -(i5 + 1);
                        break;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            ahk[] ahkVarArr = (ahk[]) vt1Var.d;
            int length = ahkVarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                ahk[] ahkVarArr2 = new ahk[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(ahkVarArr, i10, ahkVarArr2, i12, i2 - i10);
                System.arraycopy((ahk[]) vt1Var.d, 0, ahkVarArr2, 0, i10);
                ArraysKt.k(i12, i10, i2, (int[]) vt1Var.b, iArr);
                ArraysKt.o(0, i10, 6, (int[]) vt1Var.b, iArr);
                vt1Var.d = ahkVarArr2;
                vt1Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(ahkVarArr, i10, ahkVarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) vt1Var.b;
                ArraysKt.k(i13, i10, i2, iArr2, iArr2);
            }
            ((ahk[]) vt1Var.d)[i10] = new WeakReference(hxhVar);
            ((int[]) vt1Var.b)[i10] = identityHashCode;
            vt1Var.c++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final mxh r(mxh mxhVar, long j2, pch pchVar) {
        mxh mxhVar2 = null;
        while (mxhVar != null) {
            long j3 = mxhVar.a;
            if (j3 != 0 && Intrinsics.e(j3, j2) <= 0 && !pchVar.c(j3) && (mxhVar2 == null || Intrinsics.e(mxhVar2.a, mxhVar.a) < 0)) {
                mxhVar2 = mxhVar;
            }
            mxhVar = mxhVar.b;
        }
        if (mxhVar2 == null) {
            return null;
        }
        return mxhVar2;
    }

    public static final mxh s(mxh mxhVar, hxh hxhVar) {
        mxh r;
        kch h2 = h();
        Function1 e2 = h2.e();
        if (e2 != null) {
            e2.invoke(hxhVar);
        }
        mxh r2 = r(mxhVar, h2.g(), h2.d());
        if (r2 == null) {
            synchronized (c) {
                kch h3 = h();
                mxh O = hxhVar.O();
                O.getClass();
                r = r(O, h3.g(), h3.d());
                if (r == null) {
                    q();
                    throw null;
                }
            }
            return r;
        }
        return r2;
    }

    public static final void t(int i2) {
        afc afcVar = f;
        int i3 = ((int[]) afcVar.e)[i2];
        afcVar.h(i3, afcVar.a - 1);
        afcVar.a--;
        long[] jArr = (long[]) afcVar.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (Intrinsics.e(jArr[i5], j2) <= 0) {
                break;
            }
            afcVar.h(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) afcVar.c;
        int i6 = afcVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < afcVar.a && Intrinsics.e(jArr2[i7], jArr2[i8]) < 0) {
                if (Intrinsics.e(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                afcVar.h(i7, i3);
                i3 = i7;
            } else {
                if (Intrinsics.e(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                afcVar.h(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) afcVar.e)[i2] = afcVar.b;
        afcVar.b = i2;
    }

    public static final Object u(rw8 rw8Var, Function1 function1) {
        long j2 = rw8Var.b;
        Object invoke = function1.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        pch b2 = d.b(j2);
        d = b2;
        rw8Var.b = j3;
        rw8Var.a = b2;
        rw8Var.g = 0;
        rw8Var.h = null;
        rw8Var.o();
        d = d.f(j3);
        return invoke;
    }

    public static final void v(kch kchVar) {
        oqc oqcVar;
        Object obj;
        long j2;
        if (!d.c(kchVar.g())) {
            StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
            sb.append(kchVar.g());
            sb.append(", disposed=");
            sb.append(kchVar.c);
            sb.append(", applied=");
            if (kchVar instanceof oqc) {
                oqcVar = (oqc) kchVar;
            } else {
                oqcVar = null;
            }
            if (oqcVar != null) {
                obj = Boolean.valueOf(oqcVar.m);
            } else {
                obj = "read-only";
            }
            sb.append(obj);
            sb.append(", lowestPin=");
            synchronized (c) {
                afc afcVar = f;
                if (afcVar.a > 0) {
                    j2 = ((long[]) afcVar.c)[0];
                } else {
                    j2 = -1;
                }
            }
            sb.append(j2);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public static final mxh w(mxh mxhVar, hxh hxhVar, kch kchVar) {
        mxh r;
        if (kchVar.f()) {
            kchVar.n(hxhVar);
        }
        long g2 = kchVar.g();
        mxh r2 = r(mxhVar, g2, kchVar.d());
        if (r2 != null) {
            if (r2.a == kchVar.g()) {
                return r2;
            }
            synchronized (c) {
                r = r(hxhVar.O(), g2, kchVar.d());
                if (r != null) {
                    if (r.a != g2) {
                        mxh k2 = k(r, hxhVar);
                        k2.a(r);
                        k2.a = kchVar.g();
                        r = k2;
                    }
                } else {
                    q();
                    throw null;
                }
            }
            if (r2.a != 1) {
                kchVar.n(hxhVar);
            }
            return r;
        }
        q();
        throw null;
    }
}

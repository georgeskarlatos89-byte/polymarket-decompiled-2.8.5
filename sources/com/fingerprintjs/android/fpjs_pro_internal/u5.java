package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import com.fingerprintjs.android.fpjs_pro_internal.C1722;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u5 {
    public static int c = 0;
    public static int d = 1;
    public final bc a;
    public final List b = CollectionsKt.listOf(C1722.g3.e, C1722.e3.e, C1722.f3.e, C1722.wc.e, C1722.h.e, C1722.o.e, C1722.a0.e, C1722.id.e, C1722.e0.e, C1722.ud.e, C1722.w.e, C1722.xd.e, C1722.k7.e, C1722.t7.e, C1722.s3.e, C1722.c8.e, C1722.ed.e, C1722.cd.e, C1722.pd.e, C1722.m0.e, C1722.u.e, C1722.x.e, C1722.e8.e, C1722.ue.e, C1722.v3.e, C1722.r.e, C1722.f.e, C1722.le.e, C1722.zc.e, C1722.n0.e, C1722.q3.e, C1722.de.e, C1722.q.e, C1722.r2.e, C1722.zd.e, C1722.i0.e, C1722.l0.e, C1722.uc.e, C1722.r7.e, C1722.q2.e, C1722.q1.e, C1722.p0.e, C1722.e.e, C1722.m4.e, C1722.i7.e, C1722.j5.e, C1722.a9.e, C1722.aa.e, C1722.eb.e, C1722.vc.e, C1722.qc.e, C1722.sc.e, C1722.ic.e, C1722.bd.e, C1722.md.e, C1722.jd.e, C1722.xc.e, C1722.fd.e, C1722.we.e, C1722.qe.e, C1722.te.e, C1722.ne.e, C1722.ke.e, C1722.af.e, C1722.q0.e, C1722.ye.e, C1722.s0.e, C1722.w3.e, C1722.r0.e, C1722.u0.e, C1722.v0.e, C1722.t0.e, C1722.w0.e, C1722.x0.e, C1722.a1.e, C1722.b1.e, C1722.z0.e, C1722.x7.e, C1722.da.e, C1722.i5.e, C1722.n5.e);

    public u5(bc bcVar) {
        this.a = bcVar;
    }

    public final D8871 a() {
        int myTid;
        try {
            Object[] objArr = {0L, new t5(this), 1, null};
            Object f = rV4669.f(-754466100);
            if (f == null) {
                f = rV4669.g(Color.blue(0) + 848, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), Drawable.resolveOpacity(0, 0) + 52, 1520639912, "setPivotYN16904", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            D8871 d8871 = (D8871) ((Method) f).invoke(null, objArr);
            int i = j0.b;
            int i2 = i % 9759118;
            j0.b = i + 1;
            if (i2 != 0) {
                myTid = j0.c;
            } else {
                myTid = Process.myTid();
                j0.c = myTid;
            }
            int i3 = ~((151427426 & myTid) | (151427426 ^ myTid));
            int i4 = -(-(((i3 & 2068208360) | (2068208360 ^ i3)) * (-318)));
            int i5 = (1726312488 & i4) + (i4 | 1726312488);
            int i6 = ~((2068208360 ^ myTid) | (2068208360 & myTid));
            int i7 = ~myTid;
            int i8 = (i7 ^ (-151427427)) | (i7 & (-151427427));
            int i9 = ((i6 | (~((i8 & (-2068208361)) | (i8 ^ (-2068208361))))) * 318) + i5;
            int i10 = 2068208360 | i7;
            int i11 = ~((i10 & (-151427427)) | (i10 ^ (-151427427)));
            int i12 = ~((myTid & (-151394401)) | ((-151394401) ^ myTid));
            int i13 = ((i12 & i11) | (i11 ^ i12)) * 318;
            int i14 = (i9 ^ i13) + ((i13 & i9) << 1);
            int identityHashCode = System.identityHashCode(this);
            int i15 = ~identityHashCode;
            int i16 = ~((-602478258) | i15);
            int i17 = ~((i15 & (-1683116865)) | ((-1683116865) ^ i15));
            int i18 = (i17 & (-602478258)) | ((-602478258) ^ i17);
            int i19 = ~((1683116864 & identityHashCode) | (1683116864 ^ identityHashCode));
            int i20 = (((((i16 & 61408433) | (i16 ^ 61408433)) * 98) - 54351505) - (~(-(-(((i18 & i19) | (i18 ^ i19)) * (-49)))))) - 1;
            int i21 = -(-(((~(identityHashCode | (-602478258))) | (-1744525298)) * 49));
            if (i14 > ((i20 | i21) << 1) - (i21 ^ i20)) {
                return d8871;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}

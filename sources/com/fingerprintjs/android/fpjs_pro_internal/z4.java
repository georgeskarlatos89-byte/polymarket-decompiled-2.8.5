package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.google.mlkit.common.MlKitException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z4 {
    public static int c = 0;
    public static int d = 1;
    public final bc a;
    public final Lazy b = LazyKt.lazy(y4.h);

    public z4(bc bcVar) {
        this.a = bcVar;
    }

    public static Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i);
        int i9 = ~(i4 | i);
        int i10 = ~i4;
        int i11 = ~i;
        int i12 = i8 | i9 | (~(i10 | i11 | i2));
        int i13 = (~(i7 | i4)) | i8 | i9;
        int i14 = (~(i | i2)) | (~(i10 | i)) | (~(i7 | i11 | i4));
        int i15 = 1174405120 * i3;
        int i16 = ((-973078528) * i6) + (1711276032 * i5) + i15 + ((-407831203) * i14) + (815662406 * i13) + (i12 * (-407831203)) + (1582236324 * i4) + ((766573918 * i2) - 2147483648);
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i6, 458392769, (1880080305 * i5) + i2 + i4 + i3);
        int i17 = i12 * MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD;
        int i18 = i13 * (-414);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, -1109000192, (i6 * (-1160779685)) + (i5 * (-161570901)) + (i3 * 319678491) + (i14 * MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD) + i18 + i17 + (i4 * 319678284) + ((i2 * 319678698) - 2002258816), -1432485888, (68288512 * a) + i16) != 1) {
            z4 z4Var = (z4) objArr[0];
            d = (c + 111) % 128;
            z4Var.getClass();
            int i19 = d;
            c = (((i19 | 33) << 1) - (i19 ^ 33)) % 128;
            List list = (List) z4Var.b.getValue();
            int i20 = c;
            int i21 = i20 + 67;
            d = i21 % 128;
            if (i21 % 2 != 0) {
                d = (((i20 | 39) << 1) - (i20 ^ 39)) % 128;
                return list;
            }
            throw null;
        }
        z4 z4Var2 = (z4) objArr[0];
        int i22 = c;
        int i23 = ((i22 ^ 17) + ((i22 & 17) << 1)) % 128;
        d = i23;
        bc bcVar = z4Var2.a;
        int i24 = i23 + 9;
        c = i24 % 128;
        if (i24 % 2 == 0) {
            return bcVar;
        }
        throw null;
    }

    public final D8871 a() {
        try {
            Object[] objArr = {0L, new x4(this), 1, null};
            Object f = rV4669.f(-754466100);
            if (f == null) {
                f = rV4669.g(848 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51, 1520639912, "setPivotYN16904", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            D8871 d8871 = (D8871) ((Method) f).invoke(null, objArr);
            c = (d + 21) % 128;
            return d8871;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}

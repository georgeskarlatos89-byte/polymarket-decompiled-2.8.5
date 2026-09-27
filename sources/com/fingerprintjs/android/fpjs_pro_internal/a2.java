package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.ConnectivityManager;
import android.view.ViewConfiguration;
import com.fingerprintjs.android.fpjs_pro_internal.z1;
import defpackage.dmk;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a2 {
    public static int c = 0;
    public static int d = 1;
    public final Context a;
    public final ConnectivityManager b;

    public a2(Context context, ConnectivityManager connectivityManager) {
        this.a = context;
        this.b = connectivityManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3 | i5;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = (~(i5 | i8)) | (~(i9 | i3));
        int i12 = ((-548405248) * i6) + (1607991296 * i) + ((-1889271808) * i2) + (1543273332 * i11) + (i10 * 1543273332) + ((-1543273332) * i7) + (862422157 * i4) + ((-345998475) * i3) + 1335230464;
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i6, -1243605516, (1389894630 * i) + i3 + i4 + i2);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, 182059008, (i6 * (-147040884)) + (i * (-349388198)) + (i2 * (-88671137)) + (i11 * 12) + (i10 * 12) + (i7 * (-12)) + (i4 * (-88671149)) + ((i3 * (-88671125)) - 261777699), -132513792, ((-1553596416) * a) + i12) != 1) {
            try {
                Object[] objArr2 = {0L, new x1((a2) objArr[0]), 1, null};
                Object f = rV4669.f(-754466100);
                if (f == null) {
                    f = rV4669.g(848 - (ViewConfiguration.getTapTimeout() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.green(0) + 52, 1520639912, "setPivotYN16904", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
                }
                D8871 d8871 = (D8871) ((Method) f).invoke(null, objArr2);
                if (d8871 instanceof vD14832N6715) {
                    int i13 = d;
                    int i14 = (i13 & 105) + (i13 | 105);
                    c = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                } else if (d8871 instanceof setPivotYN16904) {
                    setPivotYN16904 setpivotyn16904 = new setPivotYN16904(z1.a.a);
                    int i15 = d;
                    c = ((i15 ^ 121) + ((i15 & 121) << 1)) % 128;
                    d8871 = setpivotyn16904;
                } else {
                    dmk.a();
                    return null;
                }
                D8871 D8871 = bf.D8871(d8871);
                int i16 = c;
                int i17 = (i16 & 65) + (i16 | 65);
                d = i17 % 128;
                if (i17 % 2 != 0) {
                    return D8871;
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
        a2 a2Var = (a2) objArr[0];
        int i18 = d;
        int i19 = (i18 ^ 13) + ((i18 & 13) << 1);
        c = i19 % 128;
        int i20 = i19 % 2;
        ConnectivityManager connectivityManager = a2Var.b;
        if (i20 != 0) {
            int i21 = 36 / 0;
        }
        return connectivityManager;
    }

    public static final /* synthetic */ Context b(a2 a2Var) {
        int i = c;
        int i2 = (i ^ 35) + ((i & 35) << 1);
        d = i2 % 128;
        int i3 = i2 % 2;
        Context context = a2Var.a;
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        d = ((i & 71) + (i | 71)) % 128;
        return context;
    }
}

package com.fingerprintjs.android.fpjs_pro_internal;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c1 {
    public static int b = 0;
    public static int c = 1;
    public final bc a;

    public c1(bc bcVar) {
        this.a = bcVar;
    }

    public final D8871 a() {
        try {
            Object[] objArr = {0L, new b1(this), 1, null};
            Object f = rV4669.f(-754466100);
            if (f == null) {
                f = rV4669.g(847 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1520639912, "setPivotYN16904", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            D8871 d8871 = (D8871) ((Method) f).invoke(null, objArr);
            int i = c;
            if ((((i | 35) << 1) - (i ^ 35)) % 2 == 0) {
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

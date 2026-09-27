package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http.HttpStatusCodesKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g0 {
    public static int e = 0;
    public static int f = 1;
    public final o3 a;
    public final T9586V28869 b;
    public final boolean c;
    public final long d;

    public g0(o3 o3Var, T9586V28869 t9586v28869, boolean z, long j) {
        this.a = o3Var;
        this.b = t9586v28869;
        this.c = z;
        this.d = j;
    }

    public static /* synthetic */ Location a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~(i4 | i3)) | i5;
        int i8 = (~((~i3) | i4)) | i5;
        int i9 = i4 | (~i5);
        int i10 = ((-180879360) * i2) + (780402688 * i6) + (181665792 * i) + (1603099839 * i9) + ((-1603099839) * i8) + (i7 * (-1603099839)) + ((-1421434046) * i4) + ((-907101825) * i5) + 1075183616;
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i2, -634449194, (440753341 * i6) + i5 + i4 + i);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, 1390542848, (i2 * 448958498) + ((-770690073) * i6) + (892200819 * i) + (i9 * 717) + (i8 * (-717)) + (i7 * (-717)) + (892200102 * i4) + (i5 * 892202253) + 1676176333, -1042677760, (353763328 * a) + i10) != 1) {
            g0 g0Var = (g0) objArr[0];
            long longValue = ((Number) objArr[1]).longValue();
            try {
                Object[] objArr2 = {Long.valueOf(longValue), r14, r14, new f0(g0Var, longValue), 6, null};
                Boolean bool = Boolean.FALSE;
                Object f2 = rV4669.f(942509419);
                if (f2 == null) {
                    int offsetBefore = 848 - TextUtils.getOffsetBefore("", 0);
                    char keyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int lastIndexOf = 51 - TextUtils.lastIndexOf("", '0', 0);
                    Class cls = Long.TYPE;
                    Class cls2 = Boolean.TYPE;
                    f2 = rV4669.g(offsetBefore, keyCodeFromString, lastIndexOf, -1316401137, "setPivotYN16904", new Class[]{cls, cls2, cls2, Function1.class, Integer.TYPE, Object.class});
                }
                Location location = (Location) component9.D8871((D8871) ((Method) f2).invoke(null, objArr2), null);
                int i11 = e + 119;
                f = i11 % 128;
                if (i11 % 2 != 0) {
                    return location;
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
        g0 g0Var2 = (g0) objArr[0];
        try {
            Object[] objArr3 = {Long.valueOf(((Number) objArr[1]).longValue()), r14, r14, new e0(g0Var2), 6, null};
            Boolean bool2 = Boolean.FALSE;
            Object f3 = rV4669.f(942509419);
            if (f3 == null) {
                int trimmedLength = TextUtils.getTrimmedLength("") + 848;
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int normalizeMetaState = 52 - KeyEvent.normalizeMetaState(0);
                Class cls3 = Long.TYPE;
                Class cls4 = Boolean.TYPE;
                f3 = rV4669.g(trimmedLength, keyRepeatDelay, normalizeMetaState, -1316401137, "setPivotYN16904", new Class[]{cls3, cls4, cls4, Function1.class, Integer.TYPE, Object.class});
            }
            Location location2 = (Location) component9.D8871((D8871) ((Method) f3).invoke(null, objArr3), null);
            f = (e + HttpStatusCodesKt.HTTP_EARLY_HINTS) % 128;
            return location2;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    public static final /* synthetic */ o3 b(g0 g0Var) {
        int i = e + 83;
        int i2 = i % 128;
        f = i2;
        int i3 = i % 2;
        o3 o3Var = g0Var.a;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        e = ((i2 ^ 69) + ((i2 & 69) << 1)) % 128;
        return o3Var;
    }
}

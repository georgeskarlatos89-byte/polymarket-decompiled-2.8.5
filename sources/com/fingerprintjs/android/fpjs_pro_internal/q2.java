package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import android.util.TypedValue;
import android.view.View;
import defpackage.hdi;
import defpackage.nin;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q2 implements ca {
    public static int a;
    public static int b;

    public static int a() {
        int i = a;
        int i2 = i % 9900406;
        a = i + 1;
        if (i2 != 0) {
            return b;
        }
        int a2 = hdi.a();
        b = a2;
        return a2;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.ca
    public final D8871 component5(final byte[] bArr) {
        try {
            Object[] objArr = {0L, new Function0<byte[]>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.cb$3
                public static int i;
                public static int j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public static int vD14832N6715() {
                    int i2 = i;
                    int i3 = i2 % 7581971;
                    i = i2 + 1;
                    if (i3 != 0) {
                        return j;
                    }
                    int b2 = hdi.b(1996626886);
                    j = b2;
                    return b2;
                }

                public final byte[] b() {
                    InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr), new Inflater(true));
                    try {
                        byte[] c = nin.c(inflaterInputStream);
                        inflaterInputStream.close();
                        return c;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ byte[] invoke() {
                    return b();
                }
            }, 1, null};
            Object f = rV4669.f(-754466100);
            if (f == null) {
                f = rV4669.g(View.resolveSizeAndState(0, 0, 0) + 848, (char) (Process.myTid() >> 22), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52, 1520639912, "setPivotYN16904", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            return (D8871) ((Method) f).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class xrn {
    public static final void a(apc apcVar, int i) {
        if (apcVar.b != 0 && (apcVar.a(0) == i || apcVar.a(apcVar.b - 1) == i)) {
            return;
        }
        int i2 = apcVar.b;
        apcVar.c(i);
        while (i2 > 0) {
            int i3 = ((i2 + 1) >>> 1) - 1;
            int a = apcVar.a(i3);
            if (i <= a) {
                break;
            }
            apcVar.f(i2, a);
            i2 = i3;
        }
        apcVar.f(i2, i);
    }

    public static Context b(Context context) {
        int k;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 34 && (k = o6.k(context)) != o6.k(applicationContext)) {
            applicationContext = o6.a(applicationContext, k);
        }
        String attributionTag = context.getAttributionTag();
        if (!Objects.equals(attributionTag, applicationContext.getAttributionTag())) {
            return applicationContext.createAttributionContext(attributionTag);
        }
        return applicationContext;
    }

    public static final int c(apc apcVar) {
        int a;
        int i = apcVar.b;
        int a2 = apcVar.a(0);
        while (apcVar.b != 0 && apcVar.a(0) == a2) {
            apcVar.f(0, apcVar.b());
            apcVar.e(apcVar.b - 1);
            int i2 = apcVar.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int a3 = apcVar.a(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int a4 = apcVar.a(i6);
                if (i5 < i2 && (a = apcVar.a(i5)) > a4) {
                    if (a > a3) {
                        apcVar.f(i4, a);
                        apcVar.f(i5, a3);
                        i4 = i5;
                    }
                } else if (a4 > a3) {
                    apcVar.f(i4, a4);
                    apcVar.f(i6, a3);
                    i4 = i6;
                }
            }
        }
        return a2;
    }
}

package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.core.app.FrameMetricsAggregator;
import com.google.mlkit.common.MlKitException;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.w6;
import io.sentry.a7;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b4;
import io.sentry.c1;
import io.sentry.f4;
import io.sentry.o4;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.protocol.w;
import io.sentry.t4;
import io.sentry.z1;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class l implements z1, io.sentry.util.f, b4, o4, f4 {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    public static /* synthetic */ void g() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void h(double d, String str) {
        throw new IllegalArgumentException(str + d);
    }

    public static /* synthetic */ void i(int i, int i2) {
        throw new UnsupportedOperationException("Provided data element number (" + i + ((Object) ") should be multiple of the Mat channels count (") + i2 + ((Object) ")"));
    }

    public static /* synthetic */ void j(Object obj, Object obj2, String str) {
        throw new NumberFormatException(str + obj + obj2);
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void l(String str, Object[] objArr) {
        throw new IOException(String.format(str, objArr));
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void n() {
        throw new RuntimeException();
    }

    public static /* synthetic */ void o() {
        throw new IllegalStateException();
    }

    @Override // io.sentry.util.f
    public Object c() {
        switch (this.a) {
            case 7:
                return p6.empty();
            case 8:
                return p6.empty();
            case 10:
                return new t4();
            case 11:
                return new FrameMetricsAggregator();
            case MlKitException.UNSUPPORTED /* 18 */:
                try {
                    return Build.MODEL.split(ApiConstant.SPACE, -1)[0];
                } catch (Throwable unused) {
                    p5 p5Var = p5.DEBUG;
                    return null;
                }
            default:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (io.sentry.clientreport.d dVar : io.sentry.clientreport.d.values()) {
                    for (io.sentry.m mVar : io.sentry.m.values()) {
                        concurrentHashMap.put(new io.sentry.clientreport.c(dVar.getReason(), mVar.getCategory()), new AtomicLong(0L));
                    }
                }
                return Collections.unmodifiableMap(concurrentHashMap);
        }
    }

    @Override // io.sentry.z1
    public Object d() {
        return null;
    }

    public Object e(Context context) {
        String str = null;
        switch (this.a) {
            case 13:
                try {
                    return com.socure.docv.capturesdk.di.docselection.a.a(context.getPackageManager(), context.getPackageName(), com.socure.docv.capturesdk.di.docselection.a.j());
                } catch (Throwable unused) {
                    return null;
                }
            case 14:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused2) {
                    return null;
                }
            case 15:
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i = applicationInfo.labelRes;
                    if (i == 0) {
                        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                        }
                    } else {
                        str = context.getString(i);
                    }
                } catch (Throwable unused3) {
                }
                return str;
            case 16:
                try {
                    return w6.c(context.getPackageManager(), context.getPackageName(), com.socure.docv.capturesdk.di.docselection.a.b());
                } catch (Throwable unused4) {
                    return null;
                }
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                } catch (Throwable unused5) {
                    return null;
                }
        }
    }

    @Override // io.sentry.f4
    public void f(c1 c1Var) {
        switch (this.a) {
            case 22:
                c1Var.getClass();
                c1Var.q(w.b);
                return;
            default:
                c1Var.K(new com.socure.docv.capturesdk.core.extractor.a(c1Var, 21));
                return;
        }
    }

    public /* synthetic */ l(io.sentry.okhttp.h hVar, int i) {
        this.a = i;
    }

    @Override // io.sentry.b4
    public void a(a7 a7Var) {
    }

    @Override // io.sentry.o4
    public void b(SentryAndroidOptions sentryAndroidOptions) {
    }
}

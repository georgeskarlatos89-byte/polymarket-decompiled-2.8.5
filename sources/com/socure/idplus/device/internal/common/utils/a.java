package com.socure.idplus.device.internal.common.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Handler;
import com.socure.docv.capturesdk.common.utils.Scanner;
import com.socure.idplus.device.error.SigmaDeviceError;
import com.socure.idplus.device.internal.thread.d;
import com.socure.idplus.device.internal.thread.e;
import defpackage.ky;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class a {
    public static void a(Context context, d dVar, int i, Function0 function0, Function2 function2) {
        NetworkCapabilities networkCapabilities;
        if (i < 3) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3))) {
                b bVar = new b(function0, 0);
                e eVar = (e) dVar;
                eVar.getClass();
                Handler handler = eVar.a;
                if (handler != null) {
                    handler.post(bVar);
                    return;
                }
                return;
            }
            ky kyVar = new ky(context, dVar, i, function0, function2);
            long j = i * Scanner.CAMERA_SETUP_DELAY_MS;
            e eVar2 = (e) dVar;
            eVar2.getClass();
            Handler handler2 = eVar2.a;
            if (handler2 != null) {
                handler2.postDelayed(kyVar, j);
                return;
            }
            return;
        }
        function2.invoke(SigmaDeviceError.NetworkConnectionError, "Network not available");
    }

    public static String b(String str) {
        str.getClass();
        if (str.length() > 20) {
            return "other - ".concat(str.substring(0, 20));
        }
        return "other - ".concat(str);
    }

    public static boolean c(String str) {
        str.getClass();
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e) {
            e.getMessage();
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
            return false;
        }
    }

    public static final void b(Context context, d dVar, int i, Function0 function0, Function2 function2) {
        a(context, dVar, i + 1, function0, function2);
    }

    public static String a(String str) {
        str.getClass();
        return "Bearer " + str;
    }

    public static final void a(Function0 function0) {
        function0.invoke();
    }

    public static int a(Context context) {
        ApplicationInfo applicationInfo;
        context.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        PackageInfo a = a(context, packageName);
        if (a == null || (applicationInfo = a.applicationInfo) == null) {
            return -1;
        }
        return applicationInfo.targetSdkVersion;
    }

    public static PackageInfo a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (Build.VERSION.SDK_INT < 33) {
                return packageManager.getPackageInfo(str, 0);
            }
            return com.socure.docv.capturesdk.di.docselection.a.a(packageManager, str, com.socure.docv.capturesdk.di.docselection.a.c());
        } catch (PackageManager.NameNotFoundException e) {
            e.getMessage();
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
            return null;
        }
    }
}

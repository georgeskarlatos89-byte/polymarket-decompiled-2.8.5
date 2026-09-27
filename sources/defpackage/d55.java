package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.app.NotificationManagerCompat;
import io.sentry.android.core.m0;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class d55 {
    public static int a(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        dmk.s("permission must be non-null");
        return 0;
    }

    public static Context b(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static String c(Context context) {
        return context.getAttributionTag();
    }

    public static int d(Context context, int i) {
        return context.getColor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList e(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        k4g k4gVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        l4g l4gVar = new l4g(resources, theme);
        synchronized (m4g.c) {
            try {
                SparseArray sparseArray = (SparseArray) m4g.b.get(l4gVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (k4gVar = (k4g) sparseArray.get(i)) != null) {
                    if (k4gVar.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (k4gVar.c != 0) {
                            }
                            colorStateList2 = k4gVar.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = m4g.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = cc4.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                m0.q("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList != null) {
            synchronized (m4g.c) {
                try {
                    WeakHashMap weakHashMap = m4g.b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(l4gVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(l4gVar, sparseArray2);
                    }
                    sparseArray2.append(i, new k4g(colorStateList, l4gVar.a.getConfiguration(), theme));
                } finally {
                }
            }
            return colorStateList;
        }
        return resources.getColorStateList(i, theme);
    }

    public static File f(Context context) {
        return context.getDataDir();
    }

    public static Drawable g(Context context, int i) {
        return context.getDrawable(i);
    }

    @Deprecated
    public static File[] h(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] i(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor j(Context context) {
        return context.getMainExecutor();
    }

    public static File k(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static <T> T l(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String m(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (jon.k(context, str) != 0) {
            String str2 = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (jon.k(context, str2) == 0) {
                return str2;
            }
            qp7.p(sv6.n("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
            return null;
        }
        return str;
    }

    public static Intent n(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return o(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static Intent o(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            dmk.v("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            dmk.v("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i4 != 0 && (i3 & 4) != 0) {
            dmk.v("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i3);
        }
        if ((i3 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, m(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i3 & 1);
    }

    public static boolean p(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    @Deprecated
    public static void q(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void r(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}

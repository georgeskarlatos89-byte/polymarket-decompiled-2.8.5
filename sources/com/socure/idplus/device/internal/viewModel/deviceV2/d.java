package com.socure.idplus.device.internal.viewModel.deviceV2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.accessibility.CaptioningManager;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.AndroidAttributes;
import com.socure.idplus.device.internal.utils.g;
import com.socure.idplus.device.internal.utils.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d extends Lambda implements Function1 {
    public final /* synthetic */ Calendar a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ CaptioningManager c;
    public final /* synthetic */ com.socure.idplus.device.internal.utils.a d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Calendar calendar, Context context, CaptioningManager captioningManager, com.socure.idplus.device.internal.utils.a aVar, String str, long j, String str2) {
        super(1);
        this.a = calendar;
        this.b = context;
        this.c = captioningManager;
        this.d = aVar;
        this.e = str;
        this.f = j;
        this.g = str2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:1|(2:3|(2:4|(2:6|(1:9)(1:8))(3:10|11|(1:15)(0))))(0)|82|16|(3:78|79|(23:81|(1:20)(1:77)|21|22|(18:24|25|(2:72|73)(1:27)|28|(4:(1:31)(1:70)|32|33|(4:(1:36)(1:69)|37|38|(13:40|41|(3:43|(1:45)(1:65)|(10:49|50|51|52|53|54|55|56|57|58))|66|50|51|52|53|54|55|56|57|58)))|71|41|(0)|66|50|51|52|53|54|55|56|57|58)|74|25|(0)(0)|28|(0)|71|41|(0)|66|50|51|52|53|54|55|56|57|58))|18|(0)(0)|21|22|(0)|74|25|(0)(0)|28|(0)|71|41|(0)|66|50|51|52|53|54|55|56|57|58|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013c, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013a, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[Catch: Exception -> 0x00a4, TryCatch #3 {Exception -> 0x00a4, blocks: (B:79:0x007b, B:81:0x0081, B:20:0x0089, B:21:0x0091), top: B:78:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0090  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        Resources resources;
        Configuration configuration;
        String str;
        String str2;
        boolean z3;
        boolean z4;
        Context context;
        ContentResolver contentResolver;
        boolean z5;
        Context context2;
        String str3;
        WifiInfo wifiInfo;
        String ssid;
        ContentResolver contentResolver2;
        ContentResolver contentResolver3;
        Float f;
        String str4 = (String) obj;
        if (!com.socure.idplus.device.internal.utils.f.b()) {
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
            int i = 0;
            while (true) {
                if (i < 10) {
                    if (new File(strArr[i]).exists()) {
                        break;
                    }
                    i++;
                } else {
                    String str5 = Build.TAGS;
                    if (str5 == null || !StringsKt.L(str5, "test-keys", false)) {
                        z2 = true;
                        z = false;
                    }
                }
            }
        }
        z = true;
        z2 = true;
        String str6 = Build.FINGERPRINT;
        String str7 = Build.BRAND;
        boolean z6 = z2;
        String str8 = Build.DEVICE;
        String str9 = Build.HARDWARE;
        String str10 = Build.PRODUCT;
        Calendar calendar = this.a;
        calendar.getClass();
        String a = g.a(calendar);
        String b = g.b(this.b);
        String a2 = g.a(this.b);
        boolean isEnabled = this.c.isEnabled();
        Context context3 = this.b;
        if (context3 != null) {
            try {
                resources = context3.getResources();
            } catch (Exception unused) {
            }
            if (resources != null) {
                configuration = resources.getConfiguration();
                if (configuration == null) {
                    f = Float.valueOf(configuration.fontScale);
                } else {
                    f = null;
                }
                f.getClass();
                if (f.floatValue() > 1.0f) {
                    str = a;
                    str2 = a2;
                    z3 = isEnabled;
                    z4 = z6;
                    context = this.b;
                    if (context != null) {
                        try {
                            contentResolver = context.getContentResolver();
                        } catch (Exception unused2) {
                        }
                    } else {
                        contentResolver = null;
                    }
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale") == 0.0f) {
                        if (context != null) {
                            contentResolver2 = context.getContentResolver();
                        } else {
                            contentResolver2 = null;
                        }
                        if (Settings.Global.getFloat(contentResolver2, "transition_animation_scale") == 0.0f) {
                            if (context != null) {
                                contentResolver3 = context.getContentResolver();
                            } else {
                                contentResolver3 = null;
                            }
                            if (Settings.Global.getFloat(contentResolver3, "window_animation_scale") == 0.0f) {
                                z5 = true;
                                context2 = this.b;
                                context2.getClass();
                                if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.WIFI, context2)) {
                                    WifiManager wifiManager = (WifiManager) context2.getApplicationContext().getSystemService("wifi");
                                    if (wifiManager != null) {
                                        wifiInfo = wifiManager.getConnectionInfo();
                                    } else {
                                        wifiInfo = null;
                                    }
                                    if (wifiInfo != null && (ssid = wifiInfo.getSSID()) != null) {
                                        str3 = kotlin.text.e.s(ssid, "\"", "");
                                        ArrayList a3 = h.a(this.b);
                                        UUID uuid = com.socure.idplus.device.internal.utils.f.a;
                                        Context context4 = this.b;
                                        context4.getClass();
                                        boolean z7 = z;
                                        String str11 = Settings.Secure.getString(context4.getContentResolver(), "android_id");
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        String str12 = this.d.a;
                                        str6.getClass();
                                        str7.getClass();
                                        str8.getClass();
                                        str9.getClass();
                                        str10.getClass();
                                        return new AndroidAttributes(z7, str6, str7, str8, str9, str10, str, b, str2, this.e, z3, z4, z5, str3, a3, Long.valueOf(this.f), str11, Long.valueOf(elapsedRealtime), this.g, str12, str4);
                                    }
                                }
                                str3 = null;
                                ArrayList a32 = h.a(this.b);
                                UUID uuid2 = com.socure.idplus.device.internal.utils.f.a;
                                Context context42 = this.b;
                                context42.getClass();
                                boolean z72 = z;
                                String str112 = Settings.Secure.getString(context42.getContentResolver(), "android_id");
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                String str122 = this.d.a;
                                str6.getClass();
                                str7.getClass();
                                str8.getClass();
                                str9.getClass();
                                str10.getClass();
                                return new AndroidAttributes(z72, str6, str7, str8, str9, str10, str, b, str2, this.e, z3, z4, z5, str3, a32, Long.valueOf(this.f), str112, Long.valueOf(elapsedRealtime2), this.g, str122, str4);
                            }
                        }
                    }
                    z5 = false;
                    context2 = this.b;
                    context2.getClass();
                    if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.WIFI, context2)) {
                    }
                    str3 = null;
                    ArrayList a322 = h.a(this.b);
                    UUID uuid22 = com.socure.idplus.device.internal.utils.f.a;
                    Context context422 = this.b;
                    context422.getClass();
                    boolean z722 = z;
                    String str1122 = Settings.Secure.getString(context422.getContentResolver(), "android_id");
                    long elapsedRealtime22 = SystemClock.elapsedRealtime();
                    String str1222 = this.d.a;
                    str6.getClass();
                    str7.getClass();
                    str8.getClass();
                    str9.getClass();
                    str10.getClass();
                    return new AndroidAttributes(z722, str6, str7, str8, str9, str10, str, b, str2, this.e, z3, z4, z5, str3, a322, Long.valueOf(this.f), str1122, Long.valueOf(elapsedRealtime22), this.g, str1222, str4);
                }
                str = a;
                str2 = a2;
                z3 = isEnabled;
                z4 = false;
                context = this.b;
                if (context != null) {
                }
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale") == 0.0f) {
                }
                z5 = false;
                context2 = this.b;
                context2.getClass();
                if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.WIFI, context2)) {
                }
                str3 = null;
                ArrayList a3222 = h.a(this.b);
                UUID uuid222 = com.socure.idplus.device.internal.utils.f.a;
                Context context4222 = this.b;
                context4222.getClass();
                boolean z7222 = z;
                String str11222 = Settings.Secure.getString(context4222.getContentResolver(), "android_id");
                long elapsedRealtime222 = SystemClock.elapsedRealtime();
                String str12222 = this.d.a;
                str6.getClass();
                str7.getClass();
                str8.getClass();
                str9.getClass();
                str10.getClass();
                return new AndroidAttributes(z7222, str6, str7, str8, str9, str10, str, b, str2, this.e, z3, z4, z5, str3, a3222, Long.valueOf(this.f), str11222, Long.valueOf(elapsedRealtime222), this.g, str12222, str4);
            }
        }
        configuration = null;
        if (configuration == null) {
        }
        f.getClass();
        if (f.floatValue() > 1.0f) {
        }
        str = a;
        str2 = a2;
        z3 = isEnabled;
        z4 = false;
        context = this.b;
        if (context != null) {
        }
        if (Settings.Global.getFloat(contentResolver, "animator_duration_scale") == 0.0f) {
        }
        z5 = false;
        context2 = this.b;
        context2.getClass();
        if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.WIFI, context2)) {
        }
        str3 = null;
        ArrayList a32222 = h.a(this.b);
        UUID uuid2222 = com.socure.idplus.device.internal.utils.f.a;
        Context context42222 = this.b;
        context42222.getClass();
        boolean z72222 = z;
        String str112222 = Settings.Secure.getString(context42222.getContentResolver(), "android_id");
        long elapsedRealtime2222 = SystemClock.elapsedRealtime();
        String str122222 = this.d.a;
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        return new AndroidAttributes(z72222, str6, str7, str8, str9, str10, str, b, str2, this.e, z3, z4, z5, str3, a32222, Long.valueOf(this.f), str112222, Long.valueOf(elapsedRealtime2222), this.g, str122222, str4);
    }
}

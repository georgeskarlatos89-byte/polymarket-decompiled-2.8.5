package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.intercom.android.sdk.models.AttributeType;
import io.radar.sdk.RadarUtils;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class eq6 {
    public final v0h a;
    public final DisplayMetrics b;
    public final String c;
    public final TelephonyManager d;
    public final int e;
    public final AudioManager f;
    public final PackageManager g;
    public final int h;
    public final String i;
    public final String j;
    public final int k;

    public eq6(Context context, v0h v0hVar, sec secVar) {
        String str;
        int i;
        context.getClass();
        this.a = v0hVar;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        this.b = displayMetrics;
        this.c = WebSettings.getDefaultUserAgent(context);
        Object systemService = context.getSystemService(AttributeType.PHONE);
        systemService.getClass();
        this.d = (TelephonyManager) systemService;
        int i2 = 0;
        this.e = Settings.Secure.getInt(context.getContentResolver(), "secure_frp_mode", 0);
        Object systemService2 = context.getSystemService("audio");
        systemService2.getClass();
        this.f = (AudioManager) systemService2;
        this.g = context.getPackageManager();
        this.h = Build.VERSION.SDK_INT;
        this.i = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(Calendar.getInstance().getTime());
        Field[] fields = Build.VERSION_CODES.class.getFields();
        fields.getClass();
        int length = fields.length;
        while (true) {
            if (i2 < length) {
                Field field = fields[i2];
                str = field.getName();
                str.getClass();
                try {
                    i = field.getInt(new Object());
                } catch (IllegalAccessException | IllegalArgumentException | NullPointerException unused) {
                    i = -1;
                }
                if (i == Build.VERSION.SDK_INT) {
                    break;
                } else {
                    i2++;
                }
            } else {
                str = null;
                break;
            }
        }
        str = str == null ? "UNKNOWN" : str;
        String str2 = Build.VERSION.RELEASE;
        int i3 = this.h;
        StringBuilder r = m51.r("Android ", str, ApiConstant.SPACE, str2, " API ");
        r.append(i3);
        this.j = r.toString();
        this.k = (TimeZone.getDefault().getRawOffset() / 1000) / 60;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, llg llgVar, q55 q55Var) {
        dq6 dq6Var;
        int i;
        Pair[] pairArr;
        String str2;
        int i2;
        llg llgVar2;
        String str3;
        Pair[] pairArr2;
        int i3;
        String str4;
        if (q55Var instanceof dq6) {
            dq6Var = (dq6) q55Var;
            int i4 = dq6Var.s;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dq6Var.s = i4 - Integer.MIN_VALUE;
                Object obj = dq6Var.q;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = dq6Var.s;
                if (i == 0) {
                    if (i == 1) {
                        i2 = dq6Var.p;
                        str3 = dq6Var.o;
                        pairArr = dq6Var.n;
                        pairArr2 = dq6Var.m;
                        llgVar2 = dq6Var.l;
                        str2 = dq6Var.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    Pair[] pairArr3 = new Pair[13];
                    pairArr3[0] = new Pair(kq6.PARAM_PLATFORM.toString(), RadarUtils.deviceType);
                    pairArr3[1] = new Pair(kq6.PARAM_DEVICE_MODEL.toString(), ace.m(Build.MANUFACTURER, "||", Build.MODEL));
                    pairArr3[2] = new Pair(kq6.PARAM_OS_NAME.toString(), this.j);
                    pairArr3[3] = new Pair(kq6.PARAM_OS_VERSION.toString(), Build.VERSION.RELEASE);
                    String kq6Var = kq6.PARAM_LOCALE.toString();
                    Locale[] localeArr = {Locale.getDefault()};
                    kpb kpbVar = kpb.b;
                    pairArr3[4] = new Pair(kq6Var, kpb.e(new LocaleList(localeArr)).a.a.toLanguageTags());
                    pairArr3[5] = new Pair(kq6.PARAM_TIME_ZONE.toString(), String.valueOf(this.k));
                    String kq6Var2 = kq6.PARAM_SCREEN_RESOLUTION.toString();
                    Locale locale = Locale.ROOT;
                    DisplayMetrics displayMetrics = this.b;
                    pairArr3[6] = new Pair(kq6Var2, String.format(locale, "%sx%s", Arrays.copyOf(new Object[]{new Integer(displayMetrics.heightPixels), new Integer(displayMetrics.widthPixels)}, 2)));
                    String kq6Var3 = kq6.PARAM_SDK_APP_ID.toString();
                    dq6Var.k = str;
                    dq6Var.l = llgVar;
                    dq6Var.m = pairArr3;
                    dq6Var.n = pairArr3;
                    dq6Var.o = kq6Var3;
                    dq6Var.p = 7;
                    dq6Var.s = 1;
                    Object m = this.a.m(dq6Var);
                    if (m == u85Var) {
                        return u85Var;
                    }
                    pairArr = pairArr3;
                    obj = m;
                    str2 = str;
                    i2 = 7;
                    llgVar2 = llgVar;
                    str3 = kq6Var3;
                    pairArr2 = pairArr;
                }
                pairArr[i2] = new Pair(str3, ((vh0) obj).a);
                pairArr2[8] = new Pair(kq6.PARAM_SDK_VERSION.toString(), "2.2.0");
                pairArr2[9] = new Pair(kq6.PARAM_SDK_REF_NUMBER.toString(), str2);
                pairArr2[10] = new Pair(kq6.PARAM_DATE_TIME.toString(), this.i);
                pairArr2[11] = new Pair(kq6.PARAM_SDK_TRANS_ID.toString(), llgVar2.a);
                pairArr2[12] = new Pair(kq6.PARAM_WEB_VIEW_USER_AGENT.toString(), this.c);
                HashMap d = d1c.d(pairArr2);
                i3 = this.h;
                TelephonyManager telephonyManager = this.d;
                if (i3 >= 28) {
                    d.put(kq6.PARAM_SIM_CARRIER_ID.toString(), String.valueOf(telephonyManager.getSimCarrierId()));
                    d.put(kq6.PARAM_SIM_CARRIER_ID_NAME.toString(), String.valueOf(telephonyManager.getSimCarrierIdName()));
                }
                if (i3 >= 29) {
                    d.put(kq6.PARAM_SIM_SPECIFIC_CARRIER_ID.toString(), String.valueOf(telephonyManager.getSimSpecificCarrierId()));
                    d.put(kq6.PARAM_SIM_SPECIFIC_CARRIER_ID_NAME.toString(), String.valueOf(telephonyManager.getSimSpecificCarrierIdName()));
                    if (this.g.hasSystemFeature("android.hardware.telephony.ims")) {
                        d.put(kq6.PARAM_RTT_CALLING_MODE.toString(), String.valueOf(telephonyManager.isRttSupported()));
                    }
                }
                if (i3 >= 30) {
                    d.put(kq6.PARAM_SUBSCRIPTION_ID.toString(), String.valueOf(telephonyManager.getSubscriptionId()));
                    String kq6Var4 = kq6.PARAM_SECURE_FRP_MODE.toString();
                    if (this.e == 1) {
                        str4 = "true";
                    } else {
                        str4 = "false";
                    }
                    d.put(kq6Var4, str4);
                }
                if (i3 >= 31) {
                    d.put(kq6.PARAM_HARDWARE_SKU.toString(), Build.SKU);
                    d.put(kq6.PARAM_SOC_MANUFACTURER.toString(), Build.SOC_MANUFACTURER);
                    d.put(kq6.PARAM_SOC_MODEL.toString(), Build.SOC_MODEL);
                }
                if (i3 >= 33) {
                    d.put(kq6.PARAM_APPLY_RAMPING_RINGER.toString(), String.valueOf(h84.n(this.f)));
                }
                return d;
            }
        }
        dq6Var = new dq6(this, q55Var);
        Object obj2 = dq6Var.q;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = dq6Var.s;
        if (i == 0) {
        }
        pairArr[i2] = new Pair(str3, ((vh0) obj2).a);
        pairArr2[8] = new Pair(kq6.PARAM_SDK_VERSION.toString(), "2.2.0");
        pairArr2[9] = new Pair(kq6.PARAM_SDK_REF_NUMBER.toString(), str2);
        pairArr2[10] = new Pair(kq6.PARAM_DATE_TIME.toString(), this.i);
        pairArr2[11] = new Pair(kq6.PARAM_SDK_TRANS_ID.toString(), llgVar2.a);
        pairArr2[12] = new Pair(kq6.PARAM_WEB_VIEW_USER_AGENT.toString(), this.c);
        HashMap d2 = d1c.d(pairArr2);
        i3 = this.h;
        TelephonyManager telephonyManager2 = this.d;
        if (i3 >= 28) {
        }
        if (i3 >= 29) {
        }
        if (i3 >= 30) {
        }
        if (i3 >= 31) {
        }
        if (i3 >= 33) {
        }
        return d2;
    }
}

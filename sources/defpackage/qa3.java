package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import io.intercom.android.sdk.models.AttributeType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qa3 implements idj {
    public final me7 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final g74 e;
    public final g74 f;

    public qa3(Context context, g74 g74Var, g74 g74Var2) {
        uda udaVar = new uda();
        uwn.c.configure(udaVar);
        udaVar.d = true;
        this.a = new me7(udaVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(vw1.c);
        this.e = g74Var2;
        this.f = g74Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(k84.g("Invalid url: ", str), e);
        }
    }

    public final uw0 a(uw0 uw0Var) {
        int type;
        int subtype;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        x47 c = uw0Var.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap = (HashMap) c.f;
        if (hashMap != null) {
            hashMap.put("sdk-version", String.valueOf(i));
            c.a(ConstantsKt.KEY_MODEL, Build.MODEL);
            c.a("hardware", Build.HARDWARE);
            c.a("device", Build.DEVICE);
            c.a("product", Build.PRODUCT);
            c.a("os-uild", Build.ID);
            c.a("manufacturer", Build.MANUFACTURER);
            c.a("fingerprint", Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
            HashMap hashMap2 = (HashMap) c.f;
            if (hashMap2 != null) {
                hashMap2.put("tz-offset", String.valueOf(offset));
                if (activeNetworkInfo == null) {
                    type = o2d.NONE.b();
                } else {
                    type = activeNetworkInfo.getType();
                }
                HashMap hashMap3 = (HashMap) c.f;
                if (hashMap3 != null) {
                    hashMap3.put("net-type", String.valueOf(type));
                    int i2 = -1;
                    if (activeNetworkInfo == null) {
                        subtype = n2d.UNKNOWN_MOBILE_SUBTYPE.b();
                    } else {
                        subtype = activeNetworkInfo.getSubtype();
                        if (subtype == -1) {
                            subtype = n2d.COMBINED.b();
                        } else if (n2d.a(subtype) == null) {
                            subtype = 0;
                        }
                    }
                    HashMap hashMap4 = (HashMap) c.f;
                    if (hashMap4 != null) {
                        hashMap4.put("mobile-subtype", String.valueOf(subtype));
                        c.a("country", Locale.getDefault().getCountry());
                        c.a("locale", Locale.getDefault().getLanguage());
                        Context context = this.c;
                        String simOperator = ((TelephonyManager) context.getSystemService(AttributeType.PHONE)).getSimOperator();
                        if (simOperator == null) {
                            simOperator = "";
                        }
                        c.a("mcc_mnc", simOperator);
                        try {
                            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException e) {
                            gan.c("CctTransportBackend", "Unable to find version code for package", e);
                        }
                        c.a("application_build", Integer.toString(i2));
                        return c.d();
                    }
                    dmk.n("Property \"autoMetadata\" has not been set");
                    return null;
                }
                dmk.n("Property \"autoMetadata\" has not been set");
                return null;
            }
            dmk.n("Property \"autoMetadata\" has not been set");
            return null;
        }
        dmk.n("Property \"autoMetadata\" has not been set");
        return null;
    }
}

package defpackage;

import android.content.Context;
import java.io.File;
import java.io.Serializable;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class huk {
    public static eq9 a;

    public static JSONObject a(Context context, String str) {
        wsk.a(0, huk.class, "entering getCachedConfig");
        try {
            wsk.a(0, huk.class, "Loading loadCachedConfigData");
            String f = owk.f(new File(context.getFilesDir(), str.concat("_DATA")));
            if (!f.isEmpty()) {
                wsk.a(0, huk.class, "leaving getCachedConfig,cached config loadsuccessfully");
                return new JSONObject(f);
            }
            wsk.a(0, huk.class, "leaving getCachedConfig,cached config loaded empty");
            return null;
        } catch (Exception e) {
            wsk.b(huk.class, e);
            return null;
        }
    }

    public static void b(Context context, String str, String str2) {
        wsk.a(0, huk.class, "entering saveConfigData");
        File file = new File(context.getFilesDir(), str2.concat("_DATA"));
        File file2 = new File(context.getFilesDir(), str2.concat("_TIME"));
        owk.b(file, str);
        owk.b(file2, String.valueOf(System.currentTimeMillis()));
    }

    public static boolean c(JSONObject jSONObject, long j, ivk ivkVar) {
        String str;
        if (ivkVar == ivk.RAMP) {
            str = yvk.CONF_REFRESH_TIME_KEY.toString();
        } else if (ivkVar == ivk.REMOTE) {
            str = zvk.CONF_REFRESH_TIME_KEY.toString();
        } else {
            str = "";
        }
        if (System.currentTimeMillis() > (jSONObject.optLong(str, 0L) * 1000) + j) {
            return true;
        }
        return false;
    }

    public static final kjc e(kjc kjcVar, bo1 bo1Var) {
        return kjcVar.e(new co1(bo1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] f(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        }
        if (serializable instanceof long[]) {
            return (long[]) serializable;
        }
        return null;
    }

    public static boolean g(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public String d(Context context, String str) {
        wsk.a(0, getClass(), "Loading loadCachedConfigTime");
        return owk.f(new File(context.getFilesDir(), str.concat("_TIME")));
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import io.ably.lib.http.HttpConstants;
import io.radar.sdk.RadarUtils;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a36 implements Serializable {
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final y26 b;
    public final CoroutineContext c;
    public final k9n d;
    public final String e;
    public final String f;
    public final int g;

    static {
        StandardCharsets.UTF_8.name();
    }

    public a36(Context context, y2i y2iVar, CoroutineContext coroutineContext, k9n k9nVar, int i) {
        y26 y26Var = (i & 2) != 0 ? z26.a : y2iVar;
        if ((i & 4) != 0) {
            mv6 mv6Var = mv6.a;
            coroutineContext = a66.c;
        }
        k9nVar = (i & 8) != 0 ? vrb.b : k9nVar;
        String country = Locale.getDefault().getCountry();
        country.getClass();
        int i2 = Build.VERSION.SDK_INT;
        context.getClass();
        coroutineContext.getClass();
        this.a = context;
        this.b = y26Var;
        this.c = coroutineContext;
        this.d = k9nVar;
        this.e = "release";
        this.f = country;
        this.g = i2;
    }

    public final JSONObject a(Throwable th) {
        Object m882constructorimpl;
        CharSequence charSequence;
        ApplicationInfo applicationInfo;
        JSONObject put = new JSONObject().put("release", "com.stripe.android.stripe3ds2@23.16.0");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject put2 = new JSONObject().put("type", th.getClass().getCanonicalName());
        String message = th.getMessage();
        String str = "";
        if (message == null) {
            message = "";
        }
        JSONObject put3 = put2.put("value", message);
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray2 = new JSONArray();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : ArraysKt.S(stackTrace)) {
            jSONArray2.put(new JSONObject().put("lineno", stackTraceElement.getLineNumber()).put("filename", stackTraceElement.getClassName()).put("function", stackTraceElement.getMethodName()));
        }
        JSONObject put4 = jSONObject2.put("frames", jSONArray2);
        put4.getClass();
        JSONObject put5 = put.put("exception", jSONObject.put("values", jSONArray.put(put3.put("stacktrace", put4))));
        JSONObject put6 = new JSONObject().put("locale", this.f).put(ConstantsKt.ENV_FACING_MODE, this.e).put("android_os_version", this.g);
        for (Map.Entry entry : this.b.e().entrySet()) {
            put6.put((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject put7 = put5.put("tags", put6);
        Context context = this.a;
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th2));
        }
        String str2 = null;
        if (m882constructorimpl instanceof r5g) {
            m882constructorimpl = null;
        }
        PackageInfo packageInfo = (PackageInfo) m882constructorimpl;
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            charSequence = applicationInfo.loadLabel(context.getPackageManager());
        } else {
            charSequence = null;
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject put8 = new JSONObject().put("app_identifier", context.getPackageName()).put("app_name", charSequence);
        if (packageInfo != null) {
            str2 = packageInfo.versionName;
        }
        if (str2 != null) {
            str = str2;
        }
        JSONObject put9 = jSONObject3.put("app", put8.put("app_version", str));
        JSONObject put10 = new JSONObject().put(Keys.KEY_NAME, RadarUtils.deviceType).put("version", Build.VERSION.RELEASE);
        String str3 = Build.TYPE;
        JSONObject put11 = put9.put("os", put10.put("type", str3).put("build", Build.DISPLAY));
        JSONObject put12 = new JSONObject().put("model_id", Build.ID).put(ConstantsKt.KEY_MODEL, Build.MODEL).put("manufacturer", Build.MANUFACTURER).put("type", str3);
        JSONArray jSONArray3 = new JSONArray();
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        for (String str4 : strArr) {
            jSONArray3.put(str4);
        }
        JSONObject put13 = put11.put("device", put12.put("archs", jSONArray3));
        put13.getClass();
        JSONObject put14 = put7.put("contexts", put13);
        put14.getClass();
        return put14;
    }

    public final void b(Throwable th) {
        coc.c(qsn.a(this.c), null, null, new uc0(this, th, null, 6), 3);
    }

    public final void c(JSONObject jSONObject) {
        URLConnection openConnection = new URL("https://errors.stripe.com/api/426/store/").openConnection();
        openConnection.getClass();
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        httpsURLConnection.setRequestMethod(HttpConstants.Methods.POST);
        httpsURLConnection.setDoOutput(true);
        Pair pair = new Pair("Content-Type", "application/json; charset=utf-8");
        Pair pair2 = new Pair("User-Agent", "Android3ds2Sdk 23.16.0");
        Pair pair3 = new Pair("sentry_key", "dcb428fea25c40e7b99f81ae5981ee6a");
        Pair pair4 = new Pair("sentry_version", "7");
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis / 1000;
        for (Map.Entry entry : d1c.e(pair, pair2, new Pair("X-Sentry-Auth", CollectionsKt.N(CollectionsKt.listOf("Sentry", CollectionsKt.N(CollectionsKt.listOf(pair3, pair4, new Pair("sentry_timestamp", j + "." + (currentTimeMillis - TimeUnit.SECONDS.toMillis(j))), new Pair("sentry_client", "Android3ds2Sdk 23.16.0")), ", ", null, null, new cu5(14), 30)), ApiConstant.SPACE, null, null, null, 62))).entrySet()) {
            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        OutputStream outputStream = httpsURLConnection.getOutputStream();
        try {
            outputStream.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
            try {
                outputStreamWriter.write(jSONObject.toString());
                outputStreamWriter.flush();
                outputStreamWriter.close();
                outputStream.close();
                httpsURLConnection.connect();
                httpsURLConnection.getResponseCode();
                httpsURLConnection.disconnect();
            } finally {
            }
        } finally {
        }
    }
}

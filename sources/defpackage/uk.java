package defpackage;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.auth0.android.request.internal.a;
import com.socure.docv.capturesdk.api.Keys;
import io.sentry.android.core.m0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class uk implements r4j, vb7 {
    public static final uk c = new uk("TINK", 0);
    public static final uk d = new uk("CRUNCHY", 0);
    public static final uk e = new uk("NO_PREFIX", 0);
    public static final uk f = new uk("SHA1", 1);
    public static final uk g = new uk("SHA224", 1);
    public static final uk h = new uk("SHA256", 1);
    public static final uk i = new uk("SHA384", 1);
    public static final uk j = new uk("SHA512", 1);
    public static final uk k = new uk("TINK", 2);
    public static final uk l = new uk("CRUNCHY", 2);
    public static final uk m = new uk("NO_PREFIX", 2);
    public final /* synthetic */ int a;
    public String b;

    public uk(int i2) {
        this.a = i2;
        switch (i2) {
            case 7:
                return;
            default:
                TextUtils.isEmpty("Auth0.Android");
                TextUtils.isEmpty("2.11.0");
                HashMap hashMap = new HashMap();
                hashMap.put("android", String.valueOf(Build.VERSION.SDK_INT));
                if (!TextUtils.isEmpty(null)) {
                    hashMap.put("auth0.android", null);
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                unmodifiableMap.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(Keys.KEY_NAME, "Auth0.Android");
                hashMap2.put("version", "2.11.0");
                hashMap2.put("env", unmodifiableMap);
                String json = a.a.toJson(hashMap2);
                json.getClass();
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                byte[] bytes = json.getBytes(charset);
                bytes.getClass();
                byte[] encode = Base64.encode(bytes, 10);
                encode.getClass();
                this.b = new String(encode, charset);
                return;
        }
    }

    public static uk b(svd svdVar) {
        String str;
        String str2;
        svdVar.G(2);
        int t = svdVar.t();
        int i2 = t >> 1;
        int t2 = ((svdVar.t() >> 3) & 31) | ((t & 1) << 5);
        if (i2 != 4 && i2 != 5 && i2 != 7 && i2 != 8) {
            if (i2 == 9) {
                str = "dvav";
            } else if (i2 == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder(str);
        String str3 = ".";
        if (i2 >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        sb.append(str2);
        sb.append(i2);
        if (t2 < 10) {
            str3 = ".0";
        }
        return new uk(hdi.l(t2, str3, sb), 5);
    }

    public static String e(Object[] objArr, String str, String str2) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                m0.e("PlayCore", "Unable to format ".concat(str2), e2);
                str2 = m51.k(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return sv6.n(str, " : ", str2);
    }

    @Override // defpackage.r4j
    public String a() {
        return this.b;
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(objArr, this.b, str));
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            m0.p("PlayCore", e(objArr, this.b, str));
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 8:
                return m51.m(new StringBuilder("<"), this.b, '>');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.vb7
    public boolean x(CharSequence charSequence, int i2, int i3, tij tijVar) {
        if (TextUtils.equals(charSequence.subSequence(i2, i3), this.b)) {
            tijVar.c = (tijVar.c & 3) | 4;
            return false;
        }
        return true;
    }

    @Override // defpackage.vb7
    public Object t() {
        return this;
    }

    public uk(String str, qgj qgjVar) {
        this.a = 9;
        this.b = str;
    }

    public uk(String str) {
        this.a = 10;
        this.b = m51.j(Process.myUid(), "UID: [", Process.myPid(), "]  PID: [", "] ").concat(str);
    }

    public /* synthetic */ uk(String str, int i2) {
        this.a = i2;
        this.b = str;
    }
}

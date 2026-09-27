package defpackage;

import android.content.Context;
import bo.app.z0;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class d2i {
    public static final String a = "Braze v43.1.1 .".concat("StringUtils");

    public static final long a(String str) {
        str.getClass();
        str.getBytes(Charsets.UTF_8).getClass();
        return r2.length;
    }

    public static final String b(Context context, String str, String str2) {
        context.getClass();
        if (str == null) {
            str = "null";
        }
        if (Intrinsics.areEqual(str, "null")) {
            return c("37a6259cc0c1dae299a7866489dff0bd", str2);
        }
        qq5 qq5Var = new qq5(context);
        fq5 fq5Var = fq5.SUFFIX_CACHE_USER_ID_KEY;
        String readString = qq5Var.readString(fq5Var, null);
        if (readString != null && Intrinsics.areEqual(readString, str)) {
            String readString2 = qq5Var.readString(fq5.SUFFIX_CACHE_USER_ID_HASH, null);
            if (readString2 != null && readString2.length() != 0) {
                return c(readString2, str2);
            }
            b69.o(a, null, null, false, new k1i(21), 14);
        }
        b69.o(a, pm1.V, null, false, new qh0(str, str2, 14), 12);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        String format = String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest(bytes))}, 1));
        qq5Var.writeData(fq5Var, str);
        qq5Var.writeData(fq5.SUFFIX_CACHE_USER_ID_HASH, format);
        return c(format, str2);
    }

    public static final String c(String str, String str2) {
        if (str2 != null && !StringsKt.T(str2)) {
            return "." + str + '.' + str2;
        }
        return z0.a(".", str);
    }

    public static final boolean d(String str) {
        if (str != null && !StringsKt.T(str)) {
            return false;
        }
        return true;
    }
}

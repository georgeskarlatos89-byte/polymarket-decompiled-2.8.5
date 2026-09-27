package defpackage;

import androidx.compose.foundation.layout.b;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import io.getstream.chat.android.models.User;
import io.intercom.android.sdk.Injector;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ix2 implements ew2 {
    public static void A(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void B(StringBuilder sb, String str, String str2, User user, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(user);
        sb.append(str3);
    }

    public static void C(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static float D(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int b(float f, float f2, float f3) {
        return Math.round((f + f2) * f3);
    }

    public static int c(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static int d(DownstreamUserDto downstreamUserDto, int i, int i2) {
        return (downstreamUserDto.hashCode() + i) * i2;
    }

    public static int e(ExactDate exactDate, int i, int i2) {
        return (exactDate.hashCode() + i) * i2;
    }

    public static int f(User user, int i, int i2) {
        return (user.hashCode() + i) * i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cta, java.lang.RuntimeException] */
    public static cta g(String str) {
        kw9.d(str);
        return new RuntimeException();
    }

    public static Object h() {
        return Injector.get().getAppConfigProvider().get();
    }

    public static String i(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String k(sr8 sr8Var, int i, int i2, sr8 sr8Var2, boolean z) {
        sr8Var.e0(i);
        String g = pql.g(sr8Var2, i2);
        sr8Var.s(z);
        return g;
    }

    public static String l(String str, d78 d78Var, String str2) {
        return str + d78Var + str2;
    }

    public static String m(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String n(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String o(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String q(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static String r(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder s(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap t(Class cls, ap0 ap0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, ap0Var);
        return hashMap;
    }

    public static Map u(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void v(int i, int i2, int i3, int i4, int i5) {
        u1k.G(i);
        u1k.G(i2);
        u1k.G(i3);
        u1k.G(i4);
        u1k.G(i5);
    }

    public static void w(int i, sr8 sr8Var, int i2, n70 n70Var) {
        sr8Var.o0(Integer.valueOf(i));
        sr8Var.b(Integer.valueOf(i2), n70Var);
    }

    public static void x(hjc hjcVar, float f, sr8 sr8Var, boolean z) {
        wnl.a(sr8Var, b.q(hjcVar, f));
        sr8Var.s(z);
    }

    public static /* synthetic */ void y(Object obj) {
        if (obj == null) {
            return;
        }
        dmk.p();
    }

    public static void z(String str, String str2, String str3, String str4, Date date) {
        str.getClass();
        date.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }
}

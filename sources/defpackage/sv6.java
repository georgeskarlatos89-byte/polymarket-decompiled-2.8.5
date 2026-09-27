package defpackage;

import android.os.Parcel;
import androidx.compose.foundation.layout.b;
import androidx.fragment.app.o;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class sv6 {
    public static void A(StringBuilder sb, String str, String str2, Date date, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(date);
        sb.append(str3);
    }

    public static void B(StringBuilder sb, Date date, String str, Date date2, String str2) {
        sb.append(date);
        sb.append(str);
        sb.append(date2);
        sb.append(str2);
    }

    public static long C(IntercomTheme intercomTheme, sr8 sr8Var, int i) {
        return intercomTheme.getColors(sr8Var, i).getBase().m701getBase0d7_KjU();
    }

    public static long D(IntercomTheme intercomTheme, sr8 sr8Var, int i) {
        return intercomTheme.getColors(sr8Var, i).getText().m807getDefault0d7_KjU();
    }

    public static int a(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(Parcel parcel, LinkedHashSet linkedHashSet, int i, int i2) {
        linkedHashSet.add(parcel.readString());
        return i + i2;
    }

    public static int c(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static int d(Set set, int i, int i2) {
        return (set.hashCode() + i) * i2;
    }

    public static int e(Function3 function3, int i, int i2) {
        return (function3.hashCode() + i) * i2;
    }

    public static long f(IntercomTheme intercomTheme, pq4 pq4Var, int i) {
        return intercomTheme.getColors(pq4Var, i).getBase().m701getBase0d7_KjU();
    }

    public static long g(IntercomTheme intercomTheme, sr8 sr8Var, int i) {
        return intercomTheme.getColors(sr8Var, i).getText().m810getMuted0d7_KjU();
    }

    public static hvd h(int i, sr8 sr8Var) {
        hvd hvdVar = new hvd(i);
        sr8Var.o0(hvdVar);
        return hvdVar;
    }

    public static String i() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return uuid;
    }

    public static String j(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String k(kxd kxdVar, String str) {
        return str + kxdVar;
    }

    public static String l(String str, o oVar, String str2) {
        return str + oVar + str2;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String o(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String q(StringBuilder sb, Date date, String str) {
        sb.append(date);
        sb.append(str);
        return sb.toString();
    }

    public static String r(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder s(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder t(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3, String str4, Date date) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(date);
        sb.append(str4);
        return sb;
    }

    public static void v(int i, int i2, int i3, int i4, int i5) {
        e2n.a(i);
        e2n.a(i2);
        e2n.a(i3);
        e2n.a(i4);
        e2n.a(i5);
    }

    public static void w(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void x(int i, vl4 vl4Var, sr8 sr8Var, boolean z) {
        vl4Var.invoke(sr8Var, Integer.valueOf(i));
        sr8Var.s(z);
    }

    public static void y(sr8 sr8Var, boolean z, hjc hjcVar, float f, sr8 sr8Var2) {
        sr8Var.s(z);
        wnl.a(sr8Var2, b.q(hjcVar, f));
    }

    public static void z(StringBuilder sb, Integer num, String str, Integer num2, String str2) {
        sb.append(num);
        sb.append(str);
        sb.append(num2);
        sb.append(str2);
    }
}

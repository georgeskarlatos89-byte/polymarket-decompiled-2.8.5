package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ace {
    public static void A(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static void B(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
    }

    public static void C(StringBuilder sb, String str, String str2, List list, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }

    public static void D(StringBuilder sb, List list, String str, List list2, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
    }

    public static int a(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int b(rwi rwiVar, int i, int i2) {
        return (rwiVar.hashCode() + i) * i2;
    }

    public static kjc c(float f, kjc kjcVar, boolean z) {
        return kjcVar.e(new zxa(z, f));
    }

    public static ldi d(odi odiVar, mdi mdiVar, ldi ldiVar, ArrayList arrayList, ldi ldiVar2) {
        ldiVar.a(qdi.a(odiVar, mdiVar));
        arrayList.add(ldiVar2);
        return new ldi();
    }

    public static ldi e(ArrayList arrayList, ldi ldiVar) {
        arrayList.add(ldiVar);
        return new ldi();
    }

    public static String f(int i, String str) {
        return str + i;
    }

    public static String g(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String h(qvf qvfVar, Class cls, StringBuilder sb) {
        sb.append(qvfVar.getOrCreateKotlinClass(cls));
        return sb.toString();
    }

    public static String i(Uri uri, String str) {
        return str + uri;
    }

    public static String j(Class cls, String str) {
        return str + cls;
    }

    public static String k(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    public static String l(Class cls, StringBuilder sb) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb, Map map, String str) {
        sb.append(map);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder o(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static Map q(Object obj, String str) {
        return c1c.b(new Pair(str, obj));
    }

    public static Map r(String str, Map map) {
        return c1c.b(new Pair(str, map));
    }

    public static Set s(String str) {
        return vzg.b(new pva(str));
    }

    public static Pair t(String str, String str2, String str3, String str4) {
        return new Pair(str4, new nle(str, str2, str3));
    }

    public static void u(sr8 sr8Var, boolean z, boolean z2, boolean z3) {
        sr8Var.s(z);
        sr8Var.s(z2);
        sr8Var.s(z3);
    }

    public static void v(y0a y0aVar, JSONArray jSONArray, ArrayList arrayList) {
        arrayList.add(jSONArray.getString(y0aVar.nextInt()));
    }

    public static void w(odi odiVar, mdi mdiVar, ldi ldiVar, odi odiVar2, mdi mdiVar2) {
        ldiVar.a(qdi.a(odiVar, mdiVar));
        ldiVar.a(qdi.a(odiVar2, mdiVar2));
    }

    public static void x(ysk yskVar, long j) {
        yskVar.t().k();
        yskVar.Q(j);
    }

    public static void y(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void z(EEvent eEvent, EMarket eMarket, EMarket.MarketSide marketSide) {
        eMarket.getClass();
        marketSide.getClass();
        eEvent.getClass();
    }
}

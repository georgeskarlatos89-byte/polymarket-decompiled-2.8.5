package defpackage;

import android.os.Build;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class g2g {
    public static final String a;

    static {
        String name = Charsets.UTF_8.name();
        name.getClass();
        a = name;
    }

    public g2g() {
        zc7.a.getClass();
    }

    public static LinkedHashMap b() {
        Pair pair = new Pair("lang", "kotlin");
        Pair pair2 = new Pair("bindings_version", "23.16.0");
        Pair pair3 = new Pair("os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        return d1c.h(pair, pair2, pair3, new Pair("type", str + "_" + str2 + "_" + str3), new Pair(ConstantsKt.KEY_MODEL, str3));
    }

    public final LinkedHashMap a() {
        return d1c.j(c(), d1c.e(new Pair("User-Agent", d()), new Pair("Accept-Charset", a), new Pair("X-Stripe-User-Agent", e())));
    }

    public abstract Map c();

    public abstract String d();

    public abstract String e();
}

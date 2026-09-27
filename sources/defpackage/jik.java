package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import io.ably.lib.rest.Auth;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class jik {
    public static final WeakHashMap a;

    static {
        Uri.parse(Auth.WILDCARD_CLIENTID);
        Uri.parse("");
        a = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set) {
        if (mik.h.a()) {
            pik c = c(webView);
            return;
        }
        throw mik.a();
    }

    public static void b(WebView webView, String str, Set set, iik iikVar) {
        if (mik.g.a()) {
            pik c = c(webView);
            c.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new si1(new nhk(iikVar, 0)));
            return;
        }
        throw mik.a();
    }

    public static pik c(WebView webView) {
        if (mik.i.a()) {
            WeakHashMap weakHashMap = a;
            pik pikVar = (pik) weakHashMap.get(webView);
            if (pikVar == null) {
                pik pikVar2 = new pik(oik.a.createWebView(webView));
                weakHashMap.put(webView, pikVar2);
                return pikVar2;
            }
            return pikVar;
        }
        return new pik(oik.a.createWebView(webView));
    }
}

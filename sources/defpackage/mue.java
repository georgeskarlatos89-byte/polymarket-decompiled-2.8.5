package defpackage;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.polymarket.appwebview.PolyBridgeV1;
import com.polymarket.appwebview.PolyWebBridge;
import com.polymarket.appwebview.PolyWebBridgePolicy;
import com.polymarket.appwebview.PolyWebBridgeResources;
import io.sentry.android.core.m0;
import io.sentry.e1;
import io.sentry.j0;
import io.sentry.p4;
import io.sentry.p5;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class mue {
    public static final qf5 r = new qf5(20);
    public static WebView s;
    public static MutableContextWrapper t;
    public final iue a;
    public final eue b;
    public final List c;
    public final PolyWebBridgePolicy d;
    public Function1 e;
    public Function1 f;
    public Function2 g;
    public znj h;
    public uhk i;
    public vhk j;
    public f71 k;
    public Function1 l;
    public boolean m;
    public final hue n;
    public final ca2 o;
    public boolean p;
    public final WebView q;

    public mue(Context context, iue iueVar, eue eueVar, List list, PolyWebBridgePolicy polyWebBridgePolicy, int i) {
        WebView webView;
        list = (i & 8) != 0 ? CollectionsKt.emptyList() : list;
        xw1 b = qsn.b();
        context.getClass();
        list.getClass();
        polyWebBridgePolicy.getClass();
        this.a = iueVar;
        this.b = eueVar;
        this.c = list;
        this.d = polyWebBridgePolicy;
        final hue hueVar = new hue(b);
        this.n = hueVar;
        this.o = new ca2(context);
        synchronized (r) {
            try {
                webView = s;
                if (webView == null) {
                    webView = null;
                } else {
                    MutableContextWrapper mutableContextWrapper = t;
                    if (mutableContextWrapper != null) {
                        mutableContextWrapper.setBaseContext(context);
                    }
                    s = null;
                    t = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (webView != null) {
            webView.stopLoading();
        } else {
            webView = new WebView(context);
        }
        qf5.c(webView);
        webView.setWebChromeClient(new t48(this, 2));
        boolean b2 = mik.b("DOCUMENT_START_SCRIPT");
        Set<String> androidOriginRules = polyWebBridgePolicy.getAndroidOriginRules();
        webView.setWebViewClient(new jue(b2, androidOriginRules, this));
        hueVar.b(PolyBridgeV1.CloseMessage.INSTANCE.getMethod(), new iie(15), new xfc(this, 5));
        hueVar.b(PolyBridgeV1.OpenMessage.INSTANCE.getMethod(), new iie(20), new xfc(this, 6));
        hueVar.b(PolyBridgeV1.HapticsMessage.INSTANCE.getMethod(), new iie(12), new xfc(this, 2));
        hueVar.b(PolyBridgeV1.LogEventMessage.INSTANCE.getMethod(), new iie(13), new xfc(this, 3));
        hueVar.b(PolyBridgeV1.ResetAuthMessage.INSTANCE.getMethod(), new iie(14), new xfc(this, 4));
        hueVar.b(PolyBridgeV1.PageReadyMessage.INSTANCE.getMethod(), new iie(16), new iie(this, 17));
        hueVar.c(PolyBridgeV1.RequestPermissionMessage.INSTANCE.getMethod(), new iie(18), new kue(this, null));
        hueVar.c(PolyBridgeV1.GetDeviceAttestationMessage.INSTANCE.getMethod(), new iie(19), new lue(this, null));
        final int i2 = 1;
        if (androidOriginRules != null) {
            if (!mik.b("WEB_MESSAGE_LISTENER")) {
                m0.p("PolyBridge", "PolyBridge: WEB_MESSAGE_LISTENER unsupported; JS→native messages will silently no-op");
                p4.a("PolyBridge: WEB_MESSAGE_LISTENER unsupported; JS→native messages will silently no-op", p5.WARNING);
            } else {
                PolyWebBridge.Companion companion = PolyWebBridge.INSTANCE;
                final int i3 = 0;
                jik.b(webView, companion.getNotifyChannel(), androidOriginRules, new iik() { // from class: gue
                    @Override // defpackage.iik
                    public final void d(WebView webView2, nfj nfjVar, Uri uri, qba qbaVar) {
                        Object m882constructorimpl;
                        Function1 function1;
                        Object m882constructorimpl2;
                        Object m882constructorimpl3;
                        String str;
                        Object obj;
                        String str2 = null;
                        switch (i3) {
                            case 0:
                                webView2.getClass();
                                uri.getClass();
                                qbaVar.getClass();
                                String a = nfjVar.a();
                                if (a != null) {
                                    hue hueVar2 = hueVar;
                                    hueVar2.getClass();
                                    try {
                                        Result.Companion companion2 = Result.INSTANCE;
                                        m882constructorimpl = Result.m882constructorimpl(new JSONObject(a));
                                    } catch (Throwable th2) {
                                        Result.Companion companion3 = Result.INSTANCE;
                                        m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th2));
                                    }
                                    if (m882constructorimpl instanceof r5g) {
                                        m882constructorimpl = null;
                                    }
                                    JSONObject jSONObject = (JSONObject) m882constructorimpl;
                                    if (jSONObject != null) {
                                        String optString = jSONObject.optString("method");
                                        optString.getClass();
                                        if (optString.length() > 0) {
                                            str2 = optString;
                                        }
                                        if (str2 != null && (function1 = (Function1) hueVar2.b.get(str2)) != null) {
                                            try {
                                                function1.invoke(jSONObject);
                                                m882constructorimpl2 = Result.m882constructorimpl(Unit.INSTANCE);
                                            } catch (Throwable th3) {
                                                Result.Companion companion4 = Result.INSTANCE;
                                                m882constructorimpl2 = Result.m882constructorimpl(ResultKt.createFailure(th3));
                                            }
                                            Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl2);
                                            if (m883exceptionOrNullimpl != null) {
                                                m0.e("PolyBridge", "Notify handler for " + str2 + " threw", m883exceptionOrNullimpl);
                                                e1 c = p4.c();
                                                c.getClass();
                                                c.z(m883exceptionOrNullimpl, new j0());
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                webView2.getClass();
                                uri.getClass();
                                qbaVar.getClass();
                                String a2 = nfjVar.a();
                                if (a2 != null) {
                                    hue hueVar3 = hueVar;
                                    hueVar3.getClass();
                                    try {
                                        Result.Companion companion5 = Result.INSTANCE;
                                        m882constructorimpl3 = Result.m882constructorimpl(new JSONObject(a2));
                                    } catch (Throwable th4) {
                                        Result.Companion companion6 = Result.INSTANCE;
                                        m882constructorimpl3 = Result.m882constructorimpl(ResultKt.createFailure(th4));
                                    }
                                    if (m882constructorimpl3 instanceof r5g) {
                                        m882constructorimpl3 = null;
                                    }
                                    JSONObject jSONObject2 = (JSONObject) m882constructorimpl3;
                                    if (jSONObject2 == null) {
                                        qbaVar.a(hue.a(null, "Malformed with-reply envelope"));
                                        return;
                                    }
                                    String optString2 = jSONObject2.optString("method");
                                    optString2.getClass();
                                    if (optString2.length() > 0) {
                                        str = optString2;
                                    } else {
                                        str = null;
                                    }
                                    if (jSONObject2.has("callId")) {
                                        obj = jSONObject2.opt("callId");
                                    } else {
                                        obj = null;
                                    }
                                    if (str == null) {
                                        qbaVar.a(hue.a(obj, "With-reply message missing 'method'"));
                                        return;
                                    }
                                    Function2 function2 = (Function2) hueVar3.c.get(str);
                                    if (function2 == null) {
                                        qbaVar.a(hue.a(obj, "No with-reply handler for method: ".concat(str)));
                                        return;
                                    } else {
                                        coc.c(hueVar3.a, null, null, new jrc(qbaVar, hueVar3, obj, function2, jSONObject2, str, null), 3);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                jik.b(webView, companion.getWithReplyChannel(), androidOriginRules, new iik() { // from class: gue
                    @Override // defpackage.iik
                    public final void d(WebView webView2, nfj nfjVar, Uri uri, qba qbaVar) {
                        Object m882constructorimpl;
                        Function1 function1;
                        Object m882constructorimpl2;
                        Object m882constructorimpl3;
                        String str;
                        Object obj;
                        String str2 = null;
                        switch (i2) {
                            case 0:
                                webView2.getClass();
                                uri.getClass();
                                qbaVar.getClass();
                                String a = nfjVar.a();
                                if (a != null) {
                                    hue hueVar2 = hueVar;
                                    hueVar2.getClass();
                                    try {
                                        Result.Companion companion2 = Result.INSTANCE;
                                        m882constructorimpl = Result.m882constructorimpl(new JSONObject(a));
                                    } catch (Throwable th2) {
                                        Result.Companion companion3 = Result.INSTANCE;
                                        m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th2));
                                    }
                                    if (m882constructorimpl instanceof r5g) {
                                        m882constructorimpl = null;
                                    }
                                    JSONObject jSONObject = (JSONObject) m882constructorimpl;
                                    if (jSONObject != null) {
                                        String optString = jSONObject.optString("method");
                                        optString.getClass();
                                        if (optString.length() > 0) {
                                            str2 = optString;
                                        }
                                        if (str2 != null && (function1 = (Function1) hueVar2.b.get(str2)) != null) {
                                            try {
                                                function1.invoke(jSONObject);
                                                m882constructorimpl2 = Result.m882constructorimpl(Unit.INSTANCE);
                                            } catch (Throwable th3) {
                                                Result.Companion companion4 = Result.INSTANCE;
                                                m882constructorimpl2 = Result.m882constructorimpl(ResultKt.createFailure(th3));
                                            }
                                            Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl2);
                                            if (m883exceptionOrNullimpl != null) {
                                                m0.e("PolyBridge", "Notify handler for " + str2 + " threw", m883exceptionOrNullimpl);
                                                e1 c = p4.c();
                                                c.getClass();
                                                c.z(m883exceptionOrNullimpl, new j0());
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                webView2.getClass();
                                uri.getClass();
                                qbaVar.getClass();
                                String a2 = nfjVar.a();
                                if (a2 != null) {
                                    hue hueVar3 = hueVar;
                                    hueVar3.getClass();
                                    try {
                                        Result.Companion companion5 = Result.INSTANCE;
                                        m882constructorimpl3 = Result.m882constructorimpl(new JSONObject(a2));
                                    } catch (Throwable th4) {
                                        Result.Companion companion6 = Result.INSTANCE;
                                        m882constructorimpl3 = Result.m882constructorimpl(ResultKt.createFailure(th4));
                                    }
                                    if (m882constructorimpl3 instanceof r5g) {
                                        m882constructorimpl3 = null;
                                    }
                                    JSONObject jSONObject2 = (JSONObject) m882constructorimpl3;
                                    if (jSONObject2 == null) {
                                        qbaVar.a(hue.a(null, "Malformed with-reply envelope"));
                                        return;
                                    }
                                    String optString2 = jSONObject2.optString("method");
                                    optString2.getClass();
                                    if (optString2.length() > 0) {
                                        str = optString2;
                                    } else {
                                        str = null;
                                    }
                                    if (jSONObject2.has("callId")) {
                                        obj = jSONObject2.opt("callId");
                                    } else {
                                        obj = null;
                                    }
                                    if (str == null) {
                                        qbaVar.a(hue.a(obj, "With-reply message missing 'method'"));
                                        return;
                                    }
                                    Function2 function2 = (Function2) hueVar3.c.get(str);
                                    if (function2 == null) {
                                        qbaVar.a(hue.a(obj, "No with-reply handler for method: ".concat(str)));
                                        return;
                                    } else {
                                        coc.c(hueVar3.a, null, null, new jrc(qbaVar, hueVar3, obj, function2, jSONObject2, str, null), 3);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
            }
            if (b2) {
                jik.a(webView, fue.a(eueVar, list), androidOriginRules);
                jik.a(webView, PolyWebBridgeResources.INSTANCE.getBridgeScript(), androidOriginRules);
            } else {
                m0.p("PolyBridge", "PolyBridge: DOCUMENT_START_SCRIPT unsupported; bridge injection may race page scripts");
                p4.a("PolyBridge: DOCUMENT_START_SCRIPT unsupported; bridge injection may race page scripts", p5.WARNING).getClass();
            }
        }
        webView.addOnLayoutChangeListener(new s93(this, 3));
        if (eueVar.b != null) {
            dlc dlcVar = new dlc(22, this, webView);
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeAllCookies(new wl0(1, cookieManager, dlcVar));
        } else {
            String str = iueVar.a;
            if (!(polyWebBridgePolicy instanceof PolyWebBridgePolicy.CustomCase) || polyWebBridgePolicy.shouldInject(str)) {
                webView.loadUrl(str);
            } else {
                String str2 = "PolyBridge: initial URL " + str + " rejected by .custom policy; load skipped";
                m0.p("PolyBridge", str2);
                p4.a(str2, p5.WARNING);
            }
        }
        this.q = webView;
    }

    public final void a() {
        this.p = true;
        hue hueVar = this.n;
        ViewGroup viewGroup = null;
        qsn.e(hueVar.a, null);
        hueVar.b.clear();
        hueVar.c.clear();
        WebView webView = this.q;
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
    }

    public final void b(WebView webView) {
        int height;
        if (this.d.getAndroidOriginRules() == null || (height = webView.getHeight()) <= 0) {
            return;
        }
        webView.evaluateJavascript(PolyWebBridge.INSTANCE.refreshViewportMetricsJS(height / webView.getResources().getDisplayMetrics().density), null);
    }
}

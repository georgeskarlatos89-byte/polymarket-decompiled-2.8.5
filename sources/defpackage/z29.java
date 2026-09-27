package defpackage;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class z29 implements Serializable {
    public final transient Handler a;
    public final transient dj9 b;
    public final Lazy c;

    public z29(Handler handler, o29 o29Var, dj9 dj9Var) {
        this.a = handler;
        this.b = dj9Var;
        this.c = LazyKt.lazy(new bm7(o29Var, 14));
    }

    @JavascriptInterface
    public final String getConfig() {
        return (String) this.c.getValue();
    }

    @JavascriptInterface
    public final void onError(int i) {
        t29.Companion.getClass();
        for (t29 t29Var : t29.a()) {
            if (t29Var.b() == i) {
                this.a.post(new vq8(1, this, t29Var));
                return;
            }
        }
        qp7.p(ace.f(i, "Unsupported error id: "));
    }

    @JavascriptInterface
    public final void onLoaded() {
        this.a.post(new y29(this, 1));
    }

    @JavascriptInterface
    public final void onOpen() {
        this.a.post(new y29(this, 0));
    }

    @JavascriptInterface
    public final void onPass(String str) {
        str.getClass();
        this.a.post(new vq8(2, this, str));
    }
}

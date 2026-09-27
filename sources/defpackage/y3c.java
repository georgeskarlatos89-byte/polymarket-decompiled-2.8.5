package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class y3c {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(x3c x3cVar) {
        Objects.requireNonNull(x3cVar);
        return new jd0(x3cVar, 2);
    }

    public void b(x3c x3cVar, View view, boolean z) {
        OnBackInvokedDispatcher g;
        int i;
        if (this.a != null || (g = fx8.g(view)) == null) {
            return;
        }
        OnBackInvokedCallback a = a(x3cVar);
        this.a = a;
        if (z) {
            i = 1000000;
        } else {
            i = 0;
        }
        fx8.t(g, i, a);
    }

    public void c(View view) {
        OnBackInvokedDispatcher g;
        if (this.a == null || (g = fx8.g(view)) == null) {
            return;
        }
        fx8.u(g, this.a);
        this.a = null;
    }
}

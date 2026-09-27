package defpackage;

import android.util.Log;
import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class trb {
    public final /* synthetic */ int a;

    public /* synthetic */ trb(int i) {
        this.a = i;
    }

    public final void a(String str) {
        int i = this.a;
    }

    public final void d(String str, Throwable th) {
        switch (this.a) {
            case 0:
                return;
            default:
                m0.e("StripeSdk", str, th);
                return;
        }
    }

    public final void f(String str) {
        switch (this.a) {
            case 0:
                return;
            default:
                Log.i("StripeSdk", str);
                return;
        }
    }

    public final void h(String str) {
        switch (this.a) {
            case 0:
                return;
            default:
                m0.p("StripeSdk", str);
                return;
        }
    }

    private final void b(String str) {
    }

    private final void c(String str) {
    }

    private final void g(String str) {
    }

    private final void i(String str) {
    }

    private final void e(String str, Throwable th) {
    }
}

package defpackage;

import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class krb implements xrb {
    public static final krb b = new krb();
    public final urb a = urb.INFO;

    @Override // defpackage.xrb
    public final void a(String str) {
        str.getClass();
        if (this.a.compareTo(urb.WARN) <= 0) {
            m0.p("Amplitude", str);
        }
    }

    @Override // defpackage.xrb
    public final void b(String str) {
        this.a.compareTo(urb.DEBUG);
    }

    @Override // defpackage.xrb
    public final void c(String str) {
        if (this.a.compareTo(urb.ERROR) <= 0) {
            m0.d("Amplitude", str);
        }
    }
}

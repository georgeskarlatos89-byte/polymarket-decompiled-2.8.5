package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t3d extends iz4 {
    public final ConnectivityManager f;
    public final zx g;

    public t3d(Context context, nok nokVar) {
        super(context, nokVar);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new zx(this, 2);
    }

    @Override // defpackage.iz4
    public final Object a() {
        return u3d.a(this.f);
    }

    @Override // defpackage.iz4
    public final void c() {
        try {
            dm0 g = dm0.g();
            String str = u3d.a;
            g.getClass();
            d2d.a(this.f, this.g);
        } catch (IllegalArgumentException e) {
            dm0.g().f(u3d.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            dm0.g().f(u3d.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.iz4
    public final void d() {
        try {
            dm0 g = dm0.g();
            String str = u3d.a;
            g.getClass();
            b2d.c(this.f, this.g);
        } catch (IllegalArgumentException e) {
            dm0.g().f(u3d.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            dm0.g().f(u3d.a, "Received exception while unregistering network callback", e2);
        }
    }
}

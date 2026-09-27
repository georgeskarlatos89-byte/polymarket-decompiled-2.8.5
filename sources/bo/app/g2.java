package bo.app;

import defpackage.st8;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g2 {
    public final st8 a;

    public g2(st8 st8Var) {
        st8Var.getClass();
        this.a = st8Var;
        try {
            Class.forName("com.braze.location.BrazeInternalGeofenceApi").getDeclaredConstructor(null).newInstance(null).getClass();
            throw new ClassCastException();
        } catch (Exception unused) {
        }
    }
}

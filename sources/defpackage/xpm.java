package defpackage;

import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xpm {
    public final Object a;
    public final int b;

    public xpm(jzm jzmVar, int i) {
        this.a = jzmVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xpm)) {
            return false;
        }
        xpm xpmVar = (xpm) obj;
        if (this.a != xpmVar.a || this.b != xpmVar.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
    }
}

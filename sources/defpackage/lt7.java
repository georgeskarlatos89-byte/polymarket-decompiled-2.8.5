package defpackage;

import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lt7 {
    public final Object a;
    public final int b;

    public lt7(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lt7)) {
            return false;
        }
        lt7 lt7Var = (lt7) obj;
        if (this.a != lt7Var.a || this.b != lt7Var.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
    }
}

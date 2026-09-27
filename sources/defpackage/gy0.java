package defpackage;

import android.view.Surface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gy0 {
    public final int a;
    public final Surface b;

    public gy0(int i, Surface surface) {
        this.a = i;
        if (surface != null) {
            this.b = surface;
        } else {
            dmk.s("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof gy0) {
                gy0 gy0Var = (gy0) obj;
                if (this.a == gy0Var.a && this.b.equals(gy0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.a + ", surface=" + this.b + "}";
    }
}

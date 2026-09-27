package defpackage;

import com.polymarket.clients.GeoFailureCode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class it8 implements jt8 {
    public final GeoFailureCode a;
    public final boolean b;

    public it8(GeoFailureCode geoFailureCode, boolean z) {
        geoFailureCode.getClass();
        this.a = geoFailureCode;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof it8) {
                it8 it8Var = (it8) obj;
                if (this.a != it8Var.a || this.b != it8Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(code=" + this.a + ", dismisses=" + this.b + ")";
    }
}

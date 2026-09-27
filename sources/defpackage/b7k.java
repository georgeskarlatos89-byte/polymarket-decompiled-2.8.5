package defpackage;

import com.polymarket.clients.GeoFailureCode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class b7k extends f7k {
    public final GeoFailureCode a;

    public b7k(GeoFailureCode geoFailureCode) {
        geoFailureCode.getClass();
        this.a = geoFailureCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b7k) && this.a == ((b7k) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(code=" + this.a + ")";
    }
}

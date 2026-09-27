package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class fn implements Serializable {
    public static final fn b = new fn("none");
    public final String a;

    public fn(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fn) {
            if (this.a.equals(((fn) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}

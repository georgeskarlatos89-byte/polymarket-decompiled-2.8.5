package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class foa implements Serializable {
    public static final foa b = new foa("sig");
    public static final foa c = new foa("enc");
    public final String a;

    public foa(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foa)) {
            return false;
        }
        return this.a.equals(((foa) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return this.a;
    }
}

package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class shl implements Serializable {
    public final Object a;

    public shl(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof shl) {
            return qdn.d(this.a, ((shl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return sv6.n("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}

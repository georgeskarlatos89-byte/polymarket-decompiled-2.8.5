package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jci implements gci, Serializable {
    public final Object a;

    public jci(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jci) {
            return ckn.a(this.a, ((jci) obj).a);
        }
        return false;
    }

    @Override // defpackage.gci
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return ix2.o(new StringBuilder("Suppliers.ofInstance("), this.a, ")");
    }
}

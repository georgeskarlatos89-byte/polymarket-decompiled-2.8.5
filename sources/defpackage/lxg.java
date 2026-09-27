package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class lxg {
    public final Class a;
    public final Class b;

    public lxg(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lxg)) {
            return false;
        }
        lxg lxgVar = (lxg) obj;
        if (!lxgVar.a.equals(this.a) || !lxgVar.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
    }
}

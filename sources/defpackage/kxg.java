package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kxg {
    public final Class a;
    public final pw1 b;

    public kxg(Class cls, pw1 pw1Var) {
        this.a = cls;
        this.b = pw1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxg) {
            kxg kxgVar = (kxg) obj;
            if (kxgVar.a.equals(this.a) && kxgVar.b.equals(this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + ", object identifier: " + this.b;
    }
}

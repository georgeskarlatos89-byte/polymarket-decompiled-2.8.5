package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class t5f {
    public final Class a;
    public final Class b;

    public t5f(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t5f)) {
            return false;
        }
        t5f t5fVar = (t5f) obj;
        if (!t5fVar.a.equals(this.a) || !t5fVar.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + " with primitive type: " + this.b.getSimpleName();
    }
}

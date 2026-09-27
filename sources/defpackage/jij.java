package defpackage;

import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jij {
    public final Class a;
    public final Type b;
    public final int c;

    public jij(Type type) {
        Objects.requireNonNull(type);
        Type d = bzl.d(type);
        this.b = d;
        this.a = bzl.h(d);
        this.c = d.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jij) {
            if (bzl.f(this.b, ((jij) obj).b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return bzl.k(this.b);
    }
}

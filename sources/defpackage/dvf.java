package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class dvf {
    public final Class a;
    public final wo1 b;

    public dvf(Class cls, wo1 wo1Var) {
        this.a = cls;
        this.b = wo1Var;
    }

    public final String a() {
        String replace = this.a.getName().replace('.', '/');
        replace.getClass();
        return replace.concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvf) {
            if (Intrinsics.areEqual(this.a, ((dvf) obj).a)) {
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
        return dvf.class.getName() + ": " + this.a;
    }
}

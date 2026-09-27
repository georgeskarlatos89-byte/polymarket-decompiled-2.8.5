package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class oja extends pja {
    public final h44 a;

    public oja(h44 h44Var) {
        this.a = h44Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof oja) || !Intrinsics.areEqual(this.a, ((oja) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.a + ')';
    }
}

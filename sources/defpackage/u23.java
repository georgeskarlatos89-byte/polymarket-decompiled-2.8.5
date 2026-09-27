package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u23 {
    public il6 a;
    public owa b;
    public t23 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u23) {
                u23 u23Var = (u23) obj;
                if (!Intrinsics.areEqual(this.a, u23Var.a) || this.b != u23Var.b || !Intrinsics.areEqual(this.c, u23Var.c) || !d9h.b(this.d, u23Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) d9h.g(this.d)) + ')';
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vs8 {
    public final int a;
    public final dck b;

    public vs8(int i, dck dckVar) {
        dckVar.getClass();
        this.a = i;
        this.b = dckVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs8)) {
            return false;
        }
        vs8 vs8Var = (vs8) obj;
        if (this.a == vs8Var.a && Intrinsics.areEqual(this.b, vs8Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}

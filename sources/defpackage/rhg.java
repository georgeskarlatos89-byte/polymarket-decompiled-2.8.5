package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rhg {
    public final float a;
    public final long b;
    public final h58 c;

    public rhg(float f, long j, h58 h58Var) {
        this.a = f;
        this.b = j;
        this.c = h58Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhg)) {
            return false;
        }
        rhg rhgVar = (rhg) obj;
        if (Float.compare(this.a, rhgVar.a) == 0 && hbj.a(this.b, rhgVar.b) && Intrinsics.areEqual(this.c, rhgVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        int i = hbj.c;
        return this.c.hashCode() + woa.d(hashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) hbj.b(this.b)) + ", animationSpec=" + this.c + ')';
    }
}

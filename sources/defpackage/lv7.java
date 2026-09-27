package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lv7 {
    public final float a;
    public final h58 b;

    public lv7(float f, h58 h58Var) {
        this.a = f;
        this.b = h58Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv7)) {
            return false;
        }
        lv7 lv7Var = (lv7) obj;
        if (Float.compare(this.a, lv7Var.a) == 0 && Intrinsics.areEqual(this.b, lv7Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}

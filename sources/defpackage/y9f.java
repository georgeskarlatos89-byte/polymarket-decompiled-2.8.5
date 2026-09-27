package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y9f {
    public static final y9f c = new y9f(0.0f, new y74(0.0f, 0.0f));
    public final float a;
    public final y74 b;

    public y9f(float f, y74 y74Var) {
        this.a = f;
        this.b = y74Var;
        if (!Float.isNaN(f)) {
            return;
        }
        dmk.v("current must not be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y9f) {
            y9f y9fVar = (y9f) obj;
            if (this.a == y9fVar.a && Intrinsics.areEqual(this.b, y9fVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}

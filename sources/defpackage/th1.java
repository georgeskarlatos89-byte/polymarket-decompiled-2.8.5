package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class th1 {
    public final float a;
    public final zdh b;

    public th1(float f, zdh zdhVar) {
        this.a = f;
        this.b = zdhVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof th1) {
                th1 th1Var = (th1) obj;
                if (!hy6.c(this.a, th1Var.a) || !Intrinsics.areEqual(this.b, th1Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) hy6.d(this.a)) + ", brush=" + this.b + ')';
    }
}

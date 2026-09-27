package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class a09 {
    public final List a;
    public final float b;

    public a09(List list, float f) {
        list.getClass();
        this.a = list;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a09)) {
            return false;
        }
        a09 a09Var = (a09) obj;
        if (Intrinsics.areEqual(this.a, a09Var.a) && Float.compare(this.b, a09Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GradientSpec(colors=" + this.a + ", angleRadians=" + this.b + ")";
    }
}

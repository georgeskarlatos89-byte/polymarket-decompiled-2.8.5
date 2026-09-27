package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j17 extends xx7 {
    public final Drawable a;
    public final boolean b;
    public final cp5 c;

    public j17(Drawable drawable, boolean z, cp5 cp5Var) {
        this.a = drawable;
        this.b = z;
        this.c = cp5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j17) {
            j17 j17Var = (j17) obj;
            if (Intrinsics.areEqual(this.a, j17Var.a) && this.b == j17Var.b && this.c == j17Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hdi.g(this.a.hashCode() * 31, 31, this.b);
    }
}

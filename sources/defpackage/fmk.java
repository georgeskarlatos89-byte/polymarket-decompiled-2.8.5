package defpackage;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fmk {
    public final ui1 a;
    public final float b;

    public fmk(Rect rect, float f) {
        rect.getClass();
        rect.getClass();
        this.a = new ui1(rect.left, rect.top, rect.right, rect.bottom);
        this.b = f;
    }

    public final Rect a() {
        ui1 ui1Var = this.a;
        return new Rect(ui1Var.a, ui1Var.b, ui1Var.c, ui1Var.d);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (Intrinsics.areEqual(fmk.class, cls)) {
                obj.getClass();
                fmk fmkVar = (fmk) obj;
                if (Intrinsics.areEqual(this.a, fmkVar.a) && this.b == fmkVar.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return ix2.m(sb, this.b, ')');
    }
}

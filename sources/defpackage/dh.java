package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dh implements x75 {
    public final x75 a;
    public final float b;

    public dh(float f, x75 x75Var) {
        while (x75Var instanceof dh) {
            x75Var = ((dh) x75Var).a;
            f += ((dh) x75Var).b;
        }
        this.a = x75Var;
        this.b = f;
    }

    @Override // defpackage.x75
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh)) {
            return false;
        }
        dh dhVar = (dh) obj;
        if (this.a.equals(dhVar.a) && this.b == dhVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}

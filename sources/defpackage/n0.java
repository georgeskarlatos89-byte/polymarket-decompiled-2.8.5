package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class n0 implements x75 {
    public final float a;

    public n0(float f) {
        this.a = f;
    }

    @Override // defpackage.x75
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n0) && this.a == ((n0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return hdi.r(new StringBuilder(), this.a, "px");
    }
}

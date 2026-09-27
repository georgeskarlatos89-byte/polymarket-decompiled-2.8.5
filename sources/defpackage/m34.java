package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m34 implements x75 {
    public final float a;

    public m34(float f) {
        this.a = f;
    }

    @Override // defpackage.x75
    public final float a(RectF rectF) {
        return qfn.a(this.a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m34) && this.a == ((m34) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}

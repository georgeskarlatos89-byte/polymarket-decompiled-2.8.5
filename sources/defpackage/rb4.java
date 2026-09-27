package defpackage;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rb4 extends kb4 {
    public float[] b;

    public final float[] a() {
        float[] fArr = this.b;
        if (fArr == null) {
            ColorFilter colorFilter = this.a;
            if (colorFilter instanceof ColorMatrixColorFilter) {
                ColorMatrix colorMatrix = new ColorMatrix();
                ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
                float[] array = colorMatrix.getArray();
                this.b = array;
                return array;
            }
            dmk.v("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            return null;
        }
        return fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rb4) && Arrays.equals(a(), ((rb4) obj).a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.b;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}

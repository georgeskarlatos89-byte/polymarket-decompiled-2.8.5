package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ji8 implements hi8 {
    public final float[] a;
    public final float[] b;

    public ji8(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.a = fArr;
            this.b = fArr2;
        } else {
            dmk.v("Array lengths must match and be nonzero");
            throw null;
        }
    }

    @Override // defpackage.hi8
    public final float a(float f) {
        return yol.b(f, this.b, this.a);
    }

    @Override // defpackage.hi8
    public final float b(float f) {
        return yol.b(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof ji8)) {
                ji8 ji8Var = (ji8) obj;
                if (Arrays.equals(this.a, ji8Var.a) && Arrays.equals(this.b, ji8Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}

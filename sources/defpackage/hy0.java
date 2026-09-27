package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hy0 {
    public final Rect a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    public final boolean f;

    public hy0(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        this.a = rect;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = matrix;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof hy0) {
                hy0 hy0Var = (hy0) obj;
                if (this.a.equals(hy0Var.a) && this.b == hy0Var.b && this.c == hy0Var.c && this.d == hy0Var.d && this.e.equals(hy0Var.e) && this.f == hy0Var.f) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        int i2 = 1237;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.e.hashCode()) * 1000003;
        if (this.f) {
            i2 = 1231;
        }
        return hashCode2 ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.a);
        sb.append(", getRotationDegrees=");
        sb.append(this.b);
        sb.append(", getTargetRotation=");
        sb.append(this.c);
        sb.append(", hasCameraTransform=");
        sb.append(this.d);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", isMirroring=");
        return ix2.r(sb, this.f, "}");
    }
}

package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class px0 {
    public final Object a;
    public final rp7 b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final c03 h;

    public px0(Object obj, rp7 rp7Var, int i, Size size, Rect rect, int i2, Matrix matrix, c03 c03Var) {
        if (obj != null) {
            this.a = obj;
            this.b = rp7Var;
            this.c = i;
            this.d = size;
            this.e = rect;
            this.f = i2;
            this.g = matrix;
            if (c03Var != null) {
                this.h = c03Var;
                return;
            } else {
                dmk.s("Null cameraCaptureResult");
                throw null;
            }
        }
        dmk.s("Null data");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof px0) {
                px0 px0Var = (px0) obj;
                if (this.a.equals(px0Var.a)) {
                    rp7 rp7Var = px0Var.b;
                    rp7 rp7Var2 = this.b;
                    if (rp7Var2 != null) {
                        if (rp7Var2 != rp7Var) {
                            return false;
                        }
                    }
                    if (this.c == px0Var.c && this.d.equals(px0Var.d) && this.e.equals(px0Var.e) && this.f == px0Var.f && this.g.equals(px0Var.g) && this.h.equals(px0Var.h)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        rp7 rp7Var = this.b;
        if (rp7Var == null) {
            hashCode = 0;
        } else {
            hashCode = rp7Var.hashCode();
        }
        return this.h.hashCode() ^ ((((((((((((hashCode2 ^ hashCode) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}

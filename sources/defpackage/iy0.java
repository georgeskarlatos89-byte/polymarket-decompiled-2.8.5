package defpackage;

import android.util.Size;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iy0 {
    public final Size a;
    public final HashMap b;
    public final Size c;
    public final HashMap d;
    public final Size e;
    public final HashMap f;
    public final HashMap g;
    public final HashMap h;
    public final HashMap i;

    public iy0(Size size, HashMap hashMap, Size size2, HashMap hashMap2, Size size3, HashMap hashMap3, HashMap hashMap4, HashMap hashMap5, HashMap hashMap6) {
        if (size != null) {
            this.a = size;
            this.b = hashMap;
            if (size2 != null) {
                this.c = size2;
                this.d = hashMap2;
                if (size3 != null) {
                    this.e = size3;
                    this.f = hashMap3;
                    this.g = hashMap4;
                    this.h = hashMap5;
                    this.i = hashMap6;
                    return;
                }
                dmk.s("Null recordSize");
                throw null;
            }
            dmk.s("Null previewSize");
            throw null;
        }
        dmk.s("Null analysisSize");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof iy0) {
                iy0 iy0Var = (iy0) obj;
                if (this.a.equals(iy0Var.a) && this.b.equals(iy0Var.b) && this.c.equals(iy0Var.c) && this.d.equals(iy0Var.d) && this.e.equals(iy0Var.e) && this.f.equals(iy0Var.f) && this.g.equals(iy0Var.g) && this.h.equals(iy0Var.h) && this.i.equals(iy0Var.i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", maximum4x3SizeMap=" + this.g + ", maximum16x9SizeMap=" + this.h + ", ultraMaximumSizeMap=" + this.i + "}";
    }
}

package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nx0 {
    public final UUID a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;

    public nx0(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid != null) {
            this.a = uuid;
            this.b = i;
            this.c = i2;
            this.d = rect;
            if (size != null) {
                this.e = size;
                this.f = i3;
                this.g = z;
                return;
            }
            dmk.s("Null getSize");
            throw null;
        }
        dmk.s("Null getUuid");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nx0) {
            nx0 nx0Var = (nx0) obj;
            if (this.a.equals(nx0Var.a) && this.b == nx0Var.b && this.c == nx0Var.c && this.d.equals(nx0Var.d) && this.e.equals(nx0Var.e) && this.f == nx0Var.f && this.g == nx0Var.g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003;
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((i ^ hashCode) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.a);
        sb.append(", getTargets=");
        sb.append(this.b);
        sb.append(", getFormat=");
        sb.append(this.c);
        sb.append(", getCropRect=");
        sb.append(this.d);
        sb.append(", getSize=");
        sb.append(this.e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f);
        sb.append(", isMirroring=");
        return ix2.r(sb, this.g, ", shouldRespectInputCropRect=false}");
    }
}

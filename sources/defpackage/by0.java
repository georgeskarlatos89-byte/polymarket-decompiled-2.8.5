package defpackage;

import android.util.Range;
import android.util.Size;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class by0 {
    public static final Range h = new Range(0, 0);
    public final Size a;
    public final Size b;
    public final c57 c;
    public final int d;
    public final Range e;
    public final ws4 f;
    public final boolean g;

    public by0(Size size, Size size2, c57 c57Var, int i, Range range, ws4 ws4Var, boolean z) {
        this.a = size;
        this.b = size2;
        this.c = c57Var;
        this.d = i;
        this.e = range;
        this.f = ws4Var;
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x47] */
    public static x47 a(Size size) {
        ?? obj = new Object();
        if (size != null) {
            obj.a = size;
            obj.b = size;
            obj.d = 0;
            Range range = h;
            if (range != null) {
                obj.e = range;
                obj.c = c57.d;
                obj.g = Boolean.FALSE;
                return obj;
            }
            dmk.s("Null expectedFrameRateRange");
            return null;
        }
        dmk.s("Null resolution");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x47] */
    public final x47 b() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = Integer.valueOf(this.d);
        obj.e = this.e;
        obj.f = this.f;
        obj.g = Boolean.valueOf(this.g);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof by0) {
            by0 by0Var = (by0) obj;
            if (this.a.equals(by0Var.a) && this.b.equals(by0Var.b) && this.c.equals(by0Var.c) && this.d == by0Var.d && this.e.equals(by0Var.e)) {
                ws4 ws4Var = by0Var.f;
                ws4 ws4Var2 = this.f;
                if (ws4Var2 != null ? ws4Var2.equals(ws4Var) : ws4Var == null) {
                    if (this.g == by0Var.g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        ws4 ws4Var = this.f;
        if (ws4Var == null) {
            hashCode = 0;
        } else {
            hashCode = ws4Var.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.b);
        sb.append(", dynamicRange=");
        sb.append(this.c);
        sb.append(", sessionType=");
        sb.append(this.d);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", zslDisabled=");
        return ix2.r(sb, this.g, "}");
    }
}

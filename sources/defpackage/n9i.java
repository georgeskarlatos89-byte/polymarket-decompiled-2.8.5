package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class n9i {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final Integer k;
    public final xxi l;

    public n9i(int i, int i2, int i3, float f, long j, long j2, long j3, long j4, long j5, long j6, Integer num, xxi xxiVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = num;
        this.l = xxiVar;
    }

    public static n9i a(n9i n9iVar, float f, Integer num, xxi xxiVar, int i) {
        float f2;
        Integer num2;
        int i2 = n9iVar.a;
        int i3 = n9iVar.b;
        int i4 = n9iVar.c;
        if ((i & 8) != 0) {
            f2 = n9iVar.d;
        } else {
            f2 = f;
        }
        long j = n9iVar.e;
        float f3 = f2;
        long j2 = n9iVar.f;
        long j3 = n9iVar.g;
        long j4 = n9iVar.h;
        long j5 = n9iVar.i;
        long j6 = n9iVar.j;
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            num2 = n9iVar.k;
        } else {
            num2 = num;
        }
        n9iVar.getClass();
        n9iVar.getClass();
        n9iVar.getClass();
        n9iVar.getClass();
        n9iVar.getClass();
        n9iVar.getClass();
        n9iVar.getClass();
        return new n9i(i2, i3, i4, f3, j, j2, j3, j4, j5, j6, num2, xxiVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n9i) {
                n9i n9iVar = (n9i) obj;
                if (this.a != n9iVar.a || this.b != n9iVar.b || this.c != n9iVar.c || Float.compare(this.d, n9iVar.d) != 0 || !cyi.a(this.e, n9iVar.e) || !cyi.a(this.f, n9iVar.f) || !cyi.a(this.g, n9iVar.g) || !cyi.a(this.h, n9iVar.h) || !cyi.a(this.i, n9iVar.i) || !cyi.a(this.j, n9iVar.j) || !Intrinsics.areEqual(this.k, n9iVar.k) || !Intrinsics.areEqual(this.l, n9iVar.l) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int a = sv6.a(woa.b(this.c, woa.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), this.d, 31);
        dyi[] dyiVarArr = cyi.b;
        int d = woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(a, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        int i = 0;
        Integer num = this.k;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (d + hashCode) * 31;
        xxi xxiVar = this.l;
        if (xxiVar != null) {
            i = xxiVar.hashCode();
        }
        return (i2 + i) * 887503681;
    }

    public final String toString() {
        String e = cyi.e(this.e);
        String e2 = cyi.e(this.f);
        String e3 = cyi.e(this.g);
        String e4 = cyi.e(this.h);
        String e5 = cyi.e(this.i);
        String e6 = cyi.e(this.j);
        StringBuilder n = m51.n(this.a, "StripeTypography(fontWeightNormal=", this.b, ", fontWeightMedium=", ", fontWeightBold=");
        n.append(this.c);
        n.append(", fontSizeMultiplier=");
        n.append(this.d);
        n.append(", xxSmallFontSize=");
        k84.q(n, e, ", xSmallFontSize=", e2, ", smallFontSize=");
        k84.q(n, e3, ", mediumFontSize=", e4, ", largeFontSize=");
        k84.q(n, e5, ", xLargeFontSize=", e6, ", fontFamily=");
        n.append(this.k);
        n.append(", h4=");
        n.append(this.l);
        n.append(", body1FontFamily=null, body2FontFamily=null, h5FontFamily=null, h6FontFamily=null, subtitle1FontFamily=null, captionFontFamily=null)");
        return n.toString();
    }
}

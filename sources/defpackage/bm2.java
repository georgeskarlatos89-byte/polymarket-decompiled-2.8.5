package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class bm2 {
    public final boolean a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final la0 i;
    public final la0 j;
    public final la0 k;
    public final la0 l;

    public bm2(boolean z, float f, float f2, float f3, float f4, float f5, float f6, boolean z2, la0 la0Var, la0 la0Var2, la0 la0Var3, la0 la0Var4) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = z2;
        this.i = la0Var;
        this.j = la0Var2;
        this.k = la0Var3;
        this.l = la0Var4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bm2) {
                bm2 bm2Var = (bm2) obj;
                if (this.a != bm2Var.a || !hy6.c(this.b, bm2Var.b) || !hy6.c(this.c, bm2Var.c) || !hy6.c(this.d, bm2Var.d) || !hy6.c(this.e, bm2Var.e) || !hy6.c(this.f, bm2Var.f) || Float.compare(this.g, bm2Var.g) != 0 || this.h != bm2Var.h || !Intrinsics.areEqual(this.i, bm2Var.i) || !Intrinsics.areEqual(this.j, bm2Var.j) || !Intrinsics.areEqual(this.k, bm2Var.k) || !Intrinsics.areEqual(this.l, bm2Var.l)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + hdi.g(sv6.a(sv6.a(sv6.a(sv6.a(sv6.a(sv6.a(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), 31, this.h)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String d = hy6.d(this.b);
        String d2 = hy6.d(this.c);
        String d3 = hy6.d(this.d);
        String d4 = hy6.d(this.e);
        String d5 = hy6.d(this.f);
        StringBuilder sb = new StringBuilder("CUISheetStyle(fullHeight=");
        sb.append(this.a);
        sb.append(", springOverflow=");
        sb.append(d);
        sb.append(", topMargin=");
        k84.q(sb, d2, ", restCorner=", d3, ", draggedCorner=");
        k84.q(sb, d4, ", cornerRamp=", d5, ", scrimMaxAlpha=");
        sb.append(this.g);
        sb.append(", cardEffect=");
        sb.append(this.h);
        sb.append(", presentSpec=");
        sb.append(this.i);
        sb.append(", dismissSpec=");
        sb.append(this.j);
        sb.append(", cancelSpec=");
        sb.append(this.k);
        sb.append(", programmaticDismissSpec=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}

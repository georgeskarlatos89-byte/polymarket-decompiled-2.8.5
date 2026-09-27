package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class j96 {
    public final xxi a;
    public final xxi b;
    public final xxi c;
    public final xxi d;
    public final xxi e;
    public final xxi f;
    public final xxi g;
    public final xxi h;
    public final xxi i;
    public final xxi j;
    public final xxi k;
    public final xxi l;
    public final xxi m;
    public final xxi n;
    public final gxi o;
    public final xxi p;

    public j96(xxi xxiVar, xxi xxiVar2, xxi xxiVar3, xxi xxiVar4, xxi xxiVar5, xxi xxiVar6, xxi xxiVar7, xxi xxiVar8, xxi xxiVar9, xxi xxiVar10, xxi xxiVar11, xxi xxiVar12, xxi xxiVar13, xxi xxiVar14, gxi gxiVar, xxi xxiVar15) {
        this.a = xxiVar;
        this.b = xxiVar2;
        this.c = xxiVar3;
        this.d = xxiVar4;
        this.e = xxiVar5;
        this.f = xxiVar6;
        this.g = xxiVar7;
        this.h = xxiVar8;
        this.i = xxiVar9;
        this.j = xxiVar10;
        this.k = xxiVar11;
        this.l = xxiVar12;
        this.m = xxiVar13;
        this.n = xxiVar14;
        this.o = gxiVar;
        this.p = xxiVar15;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j96) {
                j96 j96Var = (j96) obj;
                if (!Intrinsics.areEqual(this.a, j96Var.a) || !Intrinsics.areEqual(this.b, j96Var.b) || !Intrinsics.areEqual(this.c, j96Var.c) || !Intrinsics.areEqual(this.d, j96Var.d) || !Intrinsics.areEqual(this.e, j96Var.e) || !Intrinsics.areEqual(this.f, j96Var.f) || !Intrinsics.areEqual(this.g, j96Var.g) || !Intrinsics.areEqual(this.h, j96Var.h) || !Intrinsics.areEqual(this.i, j96Var.i) || !Intrinsics.areEqual(this.j, j96Var.j) || !Intrinsics.areEqual(this.k, j96Var.k) || !Intrinsics.areEqual(this.l, j96Var.l) || !Intrinsics.areEqual(this.m, j96Var.m) || !Intrinsics.areEqual(this.n, j96Var.n) || !Intrinsics.areEqual(this.o, j96Var.o) || !Intrinsics.areEqual(this.p, j96Var.p)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.p.hashCode() + ((this.o.hashCode() + hdi.h(this.n, hdi.h(this.m, hdi.h(this.l, hdi.h(this.k, hdi.h(this.j, hdi.h(this.i, hdi.h(this.h, hdi.h(this.g, hdi.h(this.f, hdi.h(this.e, hdi.h(this.d, hdi.h(this.c, hdi.h(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "DefaultMarkdownTypography(h1=" + this.a + ", h2=" + this.b + ", h3=" + this.c + ", h4=" + this.d + ", h5=" + this.e + ", h6=" + this.f + ", text=" + this.g + ", code=" + this.h + ", inlineCode=" + this.i + ", quote=" + this.j + ", paragraph=" + this.k + ", ordered=" + this.l + ", bullet=" + this.m + ", list=" + this.n + ", textLink=" + this.o + ", table=" + this.p + ")";
    }
}

package defpackage;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class e96 {
    public final Function3 a;
    public final Function3 b;
    public final Function3 c;
    public final Function3 d;
    public final Function3 e;
    public final Function3 f;
    public final Function3 g;
    public final Function3 h;
    public final Function3 i;
    public final Function3 j;
    public final Function3 k;
    public final Function3 l;
    public final Function3 m;
    public final Function3 n;
    public final Function3 o;
    public final Function3 p;
    public final Function3 q;
    public final Function3 r;
    public final Function3 s;
    public final Function3 t;

    public e96(Function3 function3, Function3 function32, Function3 function33, Function3 function34, Function3 function35, Function3 function36, Function3 function37, Function3 function38, Function3 function39, Function3 function310, Function3 function311, Function3 function312, Function3 function313, Function3 function314, Function3 function315, Function3 function316, Function3 function317, Function3 function318, Function3 function319, Function3 function320) {
        this.a = function3;
        this.b = function32;
        this.c = function33;
        this.d = function34;
        this.e = function35;
        this.f = function36;
        this.g = function37;
        this.h = function38;
        this.i = function39;
        this.j = function310;
        this.k = function311;
        this.l = function312;
        this.m = function313;
        this.n = function314;
        this.o = function315;
        this.p = function316;
        this.q = function317;
        this.r = function318;
        this.s = function319;
        this.t = function320;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e96) {
                e96 e96Var = (e96) obj;
                if (!Intrinsics.areEqual(this.a, e96Var.a) || !Intrinsics.areEqual(this.b, e96Var.b) || !Intrinsics.areEqual(this.c, e96Var.c) || !Intrinsics.areEqual(this.d, e96Var.d) || !Intrinsics.areEqual(this.e, e96Var.e) || !Intrinsics.areEqual(this.f, e96Var.f) || !Intrinsics.areEqual(this.g, e96Var.g) || !Intrinsics.areEqual(this.h, e96Var.h) || !Intrinsics.areEqual(this.i, e96Var.i) || !Intrinsics.areEqual(this.j, e96Var.j) || !Intrinsics.areEqual(this.k, e96Var.k) || !Intrinsics.areEqual(this.l, e96Var.l) || !Intrinsics.areEqual(this.m, e96Var.m) || !Intrinsics.areEqual(this.n, e96Var.n) || !Intrinsics.areEqual(this.o, e96Var.o) || !Intrinsics.areEqual(this.p, e96Var.p) || !Intrinsics.areEqual(this.q, e96Var.q) || !Intrinsics.areEqual(this.r, e96Var.r) || !Intrinsics.areEqual(this.s, e96Var.s) || !Intrinsics.areEqual(this.t, e96Var.t) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return sv6.e(this.t, sv6.e(this.s, sv6.e(this.r, sv6.e(this.q, sv6.e(this.p, sv6.e(this.o, sv6.e(this.n, sv6.e(this.m, sv6.e(this.l, sv6.e(this.k, sv6.e(this.j, sv6.e(this.i, sv6.e(this.h, sv6.e(this.g, sv6.e(this.f, sv6.e(this.e, sv6.e(this.d, sv6.e(this.c, sv6.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "DefaultMarkdownComponents(text=" + this.a + ", eol=" + this.b + ", codeFence=" + this.c + ", codeBlock=" + this.d + ", heading1=" + this.e + ", heading2=" + this.f + ", heading3=" + this.g + ", heading4=" + this.h + ", heading5=" + this.i + ", heading6=" + this.j + ", setextHeading1=" + this.k + ", setextHeading2=" + this.l + ", blockQuote=" + this.m + ", paragraph=" + this.n + ", orderedList=" + this.o + ", unorderedList=" + this.p + ", image=" + this.q + ", horizontalRule=" + this.r + ", table=" + this.s + ", checkbox=" + this.t + ", custom=null)";
    }
}

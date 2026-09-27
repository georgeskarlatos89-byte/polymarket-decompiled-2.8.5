package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class d32 {
    public final Function1 A;
    public final Function0 B;
    public final int C;
    public final boolean D;
    public final Function3 E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final c32 a;
    public final iqd b;
    public final float c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final boolean n;
    public final DesignTokens.Typography o;
    public final DesignTokens.PaletteColor p;
    public final float q;
    public final iqd r;
    public final float s;
    public final DesignTokens.SemanticColor t;
    public final DesignTokens.SemanticColor u;
    public final boolean v;
    public final Function1 w;
    public final int x;
    public final Function3 y;
    public final Function3 z;

    public d32(c32 c32Var, mqd mqdVar, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, boolean z4, DesignTokens.Typography typography, DesignTokens.PaletteColor paletteColor, mqd mqdVar2, float f5, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2, boolean z5, Function1 function1, int i, Function3 function3, Function3 function32, Function1 function12, Function0 function0, boolean z6, Function3 function33, boolean z7, int i2, int i3) {
        c32 c32Var2 = (i2 & 1) != 0 ? c32.Vertical : c32Var;
        mqd mqdVar3 = (i2 & 2) != 0 ? new mqd(0.0f, 0.0f, 0.0f, 0.0f) : mqdVar;
        float f6 = (i2 & 4) != 0 ? 8.0f : f;
        float e = (i2 & 8) != 0 ? ufh.e(DesignTokens.Size.medium) : f2;
        boolean z8 = (i2 & 16) != 0 ? true : z;
        boolean z9 = (i2 & 32) != 0 ? true : z2;
        boolean z10 = (i2 & 64) != 0 ? true : z3;
        boolean z11 = (i2 & 128) != 0;
        float f7 = (i2 & Barcode.FORMAT_UPC_E) != 0 ? 80.0f : 24.0f;
        float f8 = (i2 & 2048) == 0 ? f3 : 80.0f;
        float f9 = (i2 & 8192) != 0 ? 16.0f : f4;
        float e2 = ufh.e(DesignTokens.Size.medium);
        float c = ufh.c(DesignTokens.Padding.fourXS);
        boolean z12 = (i2 & 65536) != 0 ? false : z4;
        DesignTokens.Typography typography2 = (i2 & 131072) != 0 ? DesignTokens.Typography.body1Strong : typography;
        DesignTokens.PaletteColor paletteColor2 = (i2 & 262144) != 0 ? null : paletteColor;
        float f10 = (i2 & 524288) != 0 ? 1.0f : 0.5f;
        mqd mqdVar4 = (i2 & 1048576) != 0 ? new mqd(0.0f, 0.0f, 0.0f, 0.0f) : mqdVar2;
        float f11 = (i2 & 4194304) == 0 ? f5 : 0.0f;
        DesignTokens.SemanticColor semanticColor3 = (i2 & 8388608) != 0 ? null : semanticColor;
        DesignTokens.SemanticColor semanticColor4 = (i2 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : semanticColor2;
        boolean z13 = (i2 & 33554432) != 0 ? false : z5;
        Function1 function13 = (i2 & 67108864) != 0 ? null : function1;
        int i4 = (i2 & 134217728) != 0 ? 0 : i;
        Function3 function34 = (i2 & 268435456) != 0 ? null : function3;
        Function3 function35 = (i2 & 536870912) != 0 ? null : function32;
        Function1 function14 = (i2 & Integer.MIN_VALUE) != 0 ? null : function12;
        Function0 function02 = (i3 & 1) != 0 ? null : function0;
        boolean z14 = (i3 & 4) != 0 ? false : z6;
        Function3 function36 = (i3 & 8) != 0 ? null : function33;
        boolean z15 = (i3 & 16) == 0;
        boolean z16 = (i3 & 32) != 0 ? true : z7;
        boolean z17 = (i3 & 64) == 0;
        c32Var2.getClass();
        typography2.getClass();
        this.a = c32Var2;
        this.b = mqdVar3;
        this.c = f6;
        this.d = e;
        this.e = z8;
        this.f = z9;
        this.g = z10;
        this.h = z11;
        this.i = f7;
        this.j = f8;
        this.k = f9;
        this.l = e2;
        this.m = c;
        this.n = z12;
        this.o = typography2;
        this.p = paletteColor2;
        this.q = f10;
        this.r = mqdVar4;
        this.s = f11;
        this.t = semanticColor3;
        this.u = semanticColor4;
        this.v = z13;
        this.w = function13;
        this.x = i4;
        this.y = function34;
        this.z = function35;
        this.A = function14;
        this.B = function02;
        this.C = 3;
        this.D = z14;
        this.E = function36;
        this.F = z15;
        this.G = z16;
        this.H = z17;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d32) {
                d32 d32Var = (d32) obj;
                if (this.a != d32Var.a || !Intrinsics.areEqual(this.b, d32Var.b) || !hy6.c(this.c, d32Var.c) || !hy6.c(this.d, d32Var.d) || this.e != d32Var.e || this.f != d32Var.f || this.g != d32Var.g || this.h != d32Var.h || !hy6.c(this.i, d32Var.i) || !hy6.c(this.j, d32Var.j) || !Intrinsics.areEqual(null, null) || !hy6.c(this.k, d32Var.k) || !hy6.c(this.l, d32Var.l) || !hy6.c(this.m, d32Var.m) || this.n != d32Var.n || this.o != d32Var.o || !Intrinsics.areEqual(this.p, d32Var.p) || !hy6.c(this.q, d32Var.q) || !Intrinsics.areEqual(this.r, d32Var.r) || !hy6.c(0.0f, 0.0f) || !hy6.c(this.s, d32Var.s) || !Intrinsics.areEqual(this.t, d32Var.t) || !Intrinsics.areEqual(this.u, d32Var.u) || this.v != d32Var.v || !Intrinsics.areEqual(this.w, d32Var.w) || this.x != d32Var.x || !Intrinsics.areEqual(this.y, d32Var.y) || !Intrinsics.areEqual(this.z, d32Var.z) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.A, d32Var.A) || !Intrinsics.areEqual(this.B, d32Var.B) || this.C != d32Var.C || this.D != d32Var.D || !Intrinsics.areEqual(this.E, d32Var.E) || this.F != d32Var.F || this.G != d32Var.G || this.H != d32Var.H) {
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
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i = 0;
        int hashCode9 = (this.o.hashCode() + hdi.g(sv6.a(sv6.a(sv6.a(sv6.a(sv6.a(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(sv6.a(sv6.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, false), 31, false), this.i, 31), this.j, 961), this.k, 31), this.l, 31), this.m, 31), 31, this.n)) * 31;
        DesignTokens.PaletteColor paletteColor = this.p;
        if (paletteColor == null) {
            hashCode = 0;
        } else {
            hashCode = paletteColor.hashCode();
        }
        int a = sv6.a(sv6.a((this.r.hashCode() + sv6.a((hashCode9 + hashCode) * 31, this.q, 31)) * 31, 0.0f, 31), this.s, 31);
        DesignTokens.SemanticColor semanticColor = this.t;
        if (semanticColor == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = semanticColor.hashCode();
        }
        int i2 = (a + hashCode2) * 31;
        DesignTokens.SemanticColor semanticColor2 = this.u;
        if (semanticColor2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = semanticColor2.hashCode();
        }
        int g = hdi.g((i2 + hashCode3) * 31, 31, this.v);
        Function1 function1 = this.w;
        if (function1 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = function1.hashCode();
        }
        int b = woa.b(this.x, (g + hashCode4) * 31, 31);
        Function3 function3 = this.y;
        if (function3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = function3.hashCode();
        }
        int i3 = (b + hashCode5) * 31;
        Function3 function32 = this.z;
        if (function32 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = function32.hashCode();
        }
        int i4 = (i3 + hashCode6) * 961;
        Function1 function12 = this.A;
        if (function12 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = function12.hashCode();
        }
        int i5 = (i4 + hashCode7) * 31;
        Function0 function0 = this.B;
        if (function0 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = function0.hashCode();
        }
        int g2 = hdi.g(woa.b(this.C, (i5 + hashCode8) * 31, 31), 31, this.D);
        Function3 function33 = this.E;
        if (function33 != null) {
            i = function33.hashCode();
        }
        return Boolean.hashCode(this.H) + hdi.g(hdi.g((g2 + i) * 31, 31, this.F), 31, this.G);
    }

    public final String toString() {
        String d = hy6.d(this.c);
        String d2 = hy6.d(this.d);
        String d3 = hy6.d(this.i);
        String d4 = hy6.d(this.j);
        String d5 = hy6.d(this.k);
        String d6 = hy6.d(this.l);
        String d7 = hy6.d(this.m);
        String d8 = hy6.d(this.q);
        String d9 = hy6.d(0.0f);
        String d10 = hy6.d(this.s);
        StringBuilder sb = new StringBuilder("CUICollectionViewConfiguration(scrollAxis=");
        sb.append(this.a);
        sb.append(", contentPadding=");
        sb.append(this.b);
        sb.append(", itemSpacing=");
        k84.q(sb, d, ", sectionSpacing=", d2, ", stickyHeaders=");
        hdi.B(sb, this.e, ", edgeFadeTopEnabled=", this.f, ", edgeFadeBottomEnabled=");
        hdi.B(sb, this.g, ", edgeFadeSectionHeaderEnabled=", this.h, ", topEdgeFadeAlwaysVisible=false, topEdgeFadeBorderEnabled=false, topEdgeFadeLength=");
        k84.q(sb, d3, ", bottomEdgeFadeLength=", d4, ", edgeFadeColor=null, headerBottomSpacing=");
        k84.q(sb, d5, ", headerShadowBlurRadius=", d6, ", headerShadowOffsetY=");
        ace.A(d7, ", headerShowsDivider=", ", headerTypography=", sb, this.n);
        sb.append(this.o);
        sb.append(", dividerColor=");
        sb.append(this.p);
        sb.append(", dividerHeight=");
        sb.append(d8);
        sb.append(", dividerInsets=");
        sb.append(this.r);
        sb.append(", extraTopSpacing=");
        k84.q(sb, d9, ", extraBottomSpacing=", d10, ", backgroundColor=");
        sb.append(this.t);
        sb.append(", headerBackgroundColor=");
        sb.append(this.u);
        sb.append(", refreshEnabled=");
        sb.append(this.v);
        sb.append(", refreshHandler=");
        sb.append(this.w);
        sb.append(", scrollToTopTrigger=");
        sb.append(this.x);
        sb.append(", onItemSelected=");
        sb.append(this.y);
        sb.append(", onItemLongPressed=");
        sb.append(this.z);
        sb.append(", onItemVisible=null, onScrollDidScroll=");
        sb.append(this.A);
        sb.append(", onNearBottom=");
        sb.append(this.B);
        sb.append(", prefetchItemThreshold=");
        sb.append(this.C);
        sb.append(", isLoadingNextPage=");
        sb.append(this.D);
        sb.append(", itemKey=");
        sb.append(this.E);
        sb.append(", snappingEnabled=");
        hdi.B(sb, this.F, ", elasticOverscrollEnabled=", this.G, ", animatesItemPlacement=");
        return ix2.r(sb, this.H, ")");
    }
}

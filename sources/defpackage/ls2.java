package defpackage;

import com.google.mlkit.common.MlKitException;
import com.polymarket.designtokens.DesignTokens;
import com.socure.docv.capturesdk.common.utils.SelfieConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ls2 {
    public final ns2 A;
    public final ns2 B;
    public final ns2 C;
    public final ns2 D;
    public final ns2 a;
    public final ns2 b;
    public final ns2 c;
    public final ns2 d;
    public final ns2 e;
    public final ns2 f;
    public final ns2 g;
    public final ns2 h;
    public final ns2 i;
    public final ns2 j;
    public final ns2 k;
    public final ns2 l;
    public final ns2 m;
    public final ns2 n;
    public final ns2 o;
    public final ns2 p;
    public final ns2 q;
    public final ns2 r;
    public final ns2 s;
    public final ns2 t;
    public final ns2 u;
    public final ns2 v;
    public final ns2 w;
    public final ns2 x;
    public final ns2 y;
    public final ns2 z;

    public ls2(ns2 ns2Var, ns2 ns2Var2) {
        ns2 a = ms2.a(DesignTokens.Typography.smallerNumber);
        ns2 a2 = ms2.a(DesignTokens.Typography.largeTitle);
        ns2 a3 = ms2.a(DesignTokens.Typography.title1);
        ns2 a4 = ms2.a(DesignTokens.Typography.title2);
        ns2 a5 = ms2.a(DesignTokens.Typography.title3);
        ns2 a6 = ms2.a(DesignTokens.Typography.title4);
        ns2 a7 = ms2.a(DesignTokens.Typography.body1);
        ns2 a8 = ms2.a(DesignTokens.Typography.body1Strong);
        ns2 a9 = ms2.a(DesignTokens.Typography.body2);
        ns2 a10 = ms2.a(DesignTokens.Typography.body2Light);
        ns2 a11 = ms2.a(DesignTokens.Typography.body2Strong);
        ns2 a12 = ms2.a(DesignTokens.Typography.body2Condensed);
        ns2 a13 = ms2.a(DesignTokens.Typography.body3);
        ns2 a14 = ms2.a(DesignTokens.Typography.body3Strong);
        ns2 a15 = ms2.a(DesignTokens.Typography.body4);
        ns2 a16 = ms2.a(DesignTokens.Typography.body4Strong);
        ns2 a17 = ms2.a(DesignTokens.Typography.caption1);
        ns2 a18 = ms2.a(DesignTokens.Typography.caption1Strong);
        ns2 a19 = ms2.a(DesignTokens.Typography.caption2);
        ns2 a20 = ms2.a(DesignTokens.Typography.caption2Strong);
        ns2 a21 = ms2.a(DesignTokens.Typography.caption3Strong);
        ns2 a22 = ms2.a(DesignTokens.Typography.tagLabel);
        ns2 a23 = ms2.a(DesignTokens.Typography.tagLabelCondensed);
        ns2 a24 = ms2.a(DesignTokens.Typography.largeTitleCondensed);
        ns2 a25 = ms2.a(DesignTokens.Typography.title1Condensed);
        ns2 a26 = ms2.a(DesignTokens.Typography.title2Condensed);
        ns2 a27 = ms2.a(DesignTokens.Typography.title3Condensed);
        ns2 a28 = ms2.a(DesignTokens.Typography.title4Condensed);
        this.a = ns2Var;
        this.b = ns2Var2;
        this.c = a;
        this.d = a2;
        this.e = a3;
        this.f = a4;
        this.g = a5;
        this.h = a6;
        this.i = a7;
        this.j = a8;
        this.k = a9;
        this.l = a10;
        this.m = a11;
        this.n = a12;
        this.o = a13;
        this.p = a14;
        this.q = a15;
        this.r = a16;
        this.s = a17;
        this.t = a18;
        this.u = a19;
        this.v = a20;
        this.w = a21;
        this.x = a22;
        this.y = a23;
        this.z = a24;
        this.A = a25;
        this.B = a26;
        this.C = a27;
        this.D = a28;
    }

    public final ns2 a(DesignTokens.Typography typography) {
        typography.getClass();
        switch (ks2.a[typography.ordinal()]) {
            case 1:
                return this.a;
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.e;
            case 5:
                return this.f;
            case 6:
                return this.g;
            case 7:
                return this.h;
            case 8:
                return this.i;
            case 9:
                return this.j;
            case 10:
                return this.k;
            case 11:
                return this.l;
            case 12:
                return this.m;
            case 13:
                return this.n;
            case 14:
                return this.o;
            case 15:
                return this.p;
            case 16:
                return this.q;
            case 17:
                return this.r;
            case MlKitException.UNSUPPORTED /* 18 */:
                return this.s;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return this.t;
            case 20:
                return this.u;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return this.v;
            case 22:
                return this.w;
            case 23:
                return this.x;
            case 24:
                return this.y;
            case 25:
                return this.d;
            case 26:
                return this.z;
            case 27:
                return this.A;
            case 28:
                return this.B;
            case 29:
                return this.C;
            case SelfieConstants.EXPAND_GUIDING_BOX_PERCENTAGE /* 30 */:
                return this.D;
            default:
                dmk.a();
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls2)) {
            return false;
        }
        ls2 ls2Var = (ls2) obj;
        if (Intrinsics.areEqual(this.a, ls2Var.a) && Intrinsics.areEqual(this.b, ls2Var.b) && Intrinsics.areEqual(this.c, ls2Var.c) && Intrinsics.areEqual(this.d, ls2Var.d) && Intrinsics.areEqual(this.e, ls2Var.e) && Intrinsics.areEqual(this.f, ls2Var.f) && Intrinsics.areEqual(this.g, ls2Var.g) && Intrinsics.areEqual(this.h, ls2Var.h) && Intrinsics.areEqual(this.i, ls2Var.i) && Intrinsics.areEqual(this.j, ls2Var.j) && Intrinsics.areEqual(this.k, ls2Var.k) && Intrinsics.areEqual(this.l, ls2Var.l) && Intrinsics.areEqual(this.m, ls2Var.m) && Intrinsics.areEqual(this.n, ls2Var.n) && Intrinsics.areEqual(this.o, ls2Var.o) && Intrinsics.areEqual(this.p, ls2Var.p) && Intrinsics.areEqual(this.q, ls2Var.q) && Intrinsics.areEqual(this.r, ls2Var.r) && Intrinsics.areEqual(this.s, ls2Var.s) && Intrinsics.areEqual(this.t, ls2Var.t) && Intrinsics.areEqual(this.u, ls2Var.u) && Intrinsics.areEqual(this.v, ls2Var.v) && Intrinsics.areEqual(this.w, ls2Var.w) && Intrinsics.areEqual(this.x, ls2Var.x) && Intrinsics.areEqual(this.y, ls2Var.y) && Intrinsics.areEqual(this.z, ls2Var.z) && Intrinsics.areEqual(this.A, ls2Var.A) && Intrinsics.areEqual(this.B, ls2Var.B) && Intrinsics.areEqual(this.C, ls2Var.C) && Intrinsics.areEqual(this.D, ls2Var.D)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.D.hashCode() + m51.a(this.C, m51.a(this.B, m51.a(this.A, m51.a(this.z, m51.a(this.y, m51.a(this.x, m51.a(this.w, m51.a(this.v, m51.a(this.u, m51.a(this.t, m51.a(this.s, m51.a(this.r, m51.a(this.q, m51.a(this.p, m51.a(this.o, m51.a(this.n, m51.a(this.m, m51.a(this.l, m51.a(this.k, m51.a(this.j, m51.a(this.i, m51.a(this.h, m51.a(this.g, m51.a(this.f, m51.a(this.e, m51.a(this.d, m51.a(this.c, m51.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "CUITypography(largeNumber=" + this.a + ", smallNumber=" + this.b + ", smallerNumber=" + this.c + ", largeTitle=" + this.d + ", title1=" + this.e + ", title2=" + this.f + ", title3=" + this.g + ", title4=" + this.h + ", body1=" + this.i + ", body1Strong=" + this.j + ", body2=" + this.k + ", body2Light=" + this.l + ", body2Strong=" + this.m + ", body2Condensed=" + this.n + ", body3=" + this.o + ", body3Strong=" + this.p + ", body4=" + this.q + ", body4Strong=" + this.r + ", caption1=" + this.s + ", caption1Strong=" + this.t + ", caption2=" + this.u + ", caption2Strong=" + this.v + ", caption3Strong=" + this.w + ", tagLabel=" + this.x + ", tagLabelCondensed=" + this.y + ", largeTitleCondensed=" + this.z + ", title1Condensed=" + this.A + ", title2Condensed=" + this.B + ", title3Condensed=" + this.C + ", title4Condensed=" + this.D + ")";
    }
}

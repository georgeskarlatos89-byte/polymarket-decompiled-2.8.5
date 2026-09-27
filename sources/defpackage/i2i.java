package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class i2i {
    public final String A;
    public final String B;
    public final String C;
    public final char D;
    public final char E;
    public final char F;
    public final char G;
    public final char H;
    public final char I;
    public final char J;
    public final char K;
    public final char L;
    public final char M;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public i2i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8, char c9, char c10, int i, int i2) {
        String str30 = (i & 1) != 0 ? "January" : str;
        String str31 = (i & 2) != 0 ? "February" : str2;
        String str32 = (i & 4) != 0 ? "March" : str3;
        String str33 = (i & 8) != 0 ? "April" : str4;
        String str34 = (i & 16) != 0 ? "May" : str5;
        String str35 = (i & 32) != 0 ? "June" : str6;
        String str36 = (i & 64) != 0 ? "July" : str7;
        String str37 = (i & 128) != 0 ? "August" : str8;
        String str38 = (i & 256) != 0 ? "September" : str9;
        String str39 = (i & Barcode.FORMAT_UPC_A) != 0 ? "October" : str10;
        String str40 = (i & Barcode.FORMAT_UPC_E) != 0 ? "November" : str11;
        String str41 = (i & 2048) != 0 ? "December" : str12;
        String str42 = (i & 4096) != 0 ? "Jan" : str13;
        String str43 = (i & 8192) != 0 ? "Feb" : str14;
        String str44 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "Mar" : str15;
        String str45 = (i & 32768) != 0 ? "Apr" : str16;
        String str46 = (i & 65536) != 0 ? "May" : str17;
        String str47 = (i & 131072) != 0 ? "Jun" : str18;
        String str48 = (i & 262144) != 0 ? "Jul" : str19;
        String str49 = (i & 524288) != 0 ? "Aug" : str20;
        String str50 = (i & 1048576) != 0 ? "Sep" : str21;
        String str51 = (i & 2097152) != 0 ? "Oct" : str22;
        String str52 = (i & 4194304) != 0 ? "Nov" : str23;
        String str53 = (i & 8388608) != 0 ? "Dec" : str24;
        String str54 = (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? "AM" : str25;
        String str55 = (i & 33554432) != 0 ? "PM" : str26;
        String str56 = (i & 67108864) != 0 ? "" : str27;
        String str57 = (i & 134217728) != 0 ? "" : str28;
        String str58 = (i & 268435456) != 0 ? "" : str29;
        char c11 = (i & 536870912) != 0 ? '0' : c;
        char c12 = (i & 1073741824) != 0 ? '1' : c2;
        char c13 = (i & Integer.MIN_VALUE) != 0 ? '2' : c3;
        char c14 = (i2 & 1) != 0 ? '3' : c4;
        char c15 = (i2 & 2) != 0 ? '4' : c5;
        char c16 = (i2 & 4) != 0 ? '5' : c6;
        char c17 = (i2 & 8) != 0 ? '6' : c7;
        char c18 = (i2 & 16) != 0 ? '7' : c8;
        char c19 = (i2 & 32) != 0 ? '8' : c9;
        char c20 = (i2 & 64) != 0 ? '9' : c10;
        this.a = str30;
        this.b = str31;
        this.c = str32;
        this.d = str33;
        this.e = str34;
        this.f = str35;
        this.g = str36;
        this.h = str37;
        this.i = str38;
        this.j = str39;
        this.k = str40;
        this.l = str41;
        this.m = str42;
        this.n = str43;
        this.o = str44;
        this.p = str45;
        this.q = str46;
        this.r = str47;
        this.s = str48;
        this.t = str49;
        this.u = str50;
        this.v = str51;
        this.w = str52;
        this.x = str53;
        this.y = str54;
        this.z = str55;
        this.A = str56;
        this.B = str57;
        this.C = str58;
        this.D = c11;
        this.E = c12;
        this.F = c13;
        this.G = c14;
        this.H = c15;
        this.I = c16;
        this.J = c17;
        this.K = c18;
        this.L = c19;
        this.M = c20;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i2i) {
                i2i i2iVar = (i2i) obj;
                if (!Intrinsics.areEqual(this.a, i2iVar.a) || !Intrinsics.areEqual(this.b, i2iVar.b) || !Intrinsics.areEqual(this.c, i2iVar.c) || !Intrinsics.areEqual(this.d, i2iVar.d) || !Intrinsics.areEqual(this.e, i2iVar.e) || !Intrinsics.areEqual(this.f, i2iVar.f) || !Intrinsics.areEqual(this.g, i2iVar.g) || !Intrinsics.areEqual(this.h, i2iVar.h) || !Intrinsics.areEqual(this.i, i2iVar.i) || !Intrinsics.areEqual(this.j, i2iVar.j) || !Intrinsics.areEqual(this.k, i2iVar.k) || !Intrinsics.areEqual(this.l, i2iVar.l) || !Intrinsics.areEqual(this.m, i2iVar.m) || !Intrinsics.areEqual(this.n, i2iVar.n) || !Intrinsics.areEqual(this.o, i2iVar.o) || !Intrinsics.areEqual(this.p, i2iVar.p) || !Intrinsics.areEqual(this.q, i2iVar.q) || !Intrinsics.areEqual(this.r, i2iVar.r) || !Intrinsics.areEqual(this.s, i2iVar.s) || !Intrinsics.areEqual(this.t, i2iVar.t) || !Intrinsics.areEqual(this.u, i2iVar.u) || !Intrinsics.areEqual(this.v, i2iVar.v) || !Intrinsics.areEqual(this.w, i2iVar.w) || !Intrinsics.areEqual(this.x, i2iVar.x) || !Intrinsics.areEqual(this.y, i2iVar.y) || !Intrinsics.areEqual(this.z, i2iVar.z) || !Intrinsics.areEqual(this.A, i2iVar.A) || !Intrinsics.areEqual(this.B, i2iVar.B) || !Intrinsics.areEqual(this.C, i2iVar.C) || this.D != i2iVar.D || this.E != i2iVar.E || this.F != i2iVar.F || this.G != i2iVar.G || this.H != i2iVar.H || this.I != i2iVar.I || this.J != i2iVar.J || this.K != i2iVar.K || this.L != i2iVar.L || this.M != i2iVar.M) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Character.hashCode(this.M) + ((Character.hashCode(this.L) + ((Character.hashCode(this.K) + ((Character.hashCode(this.J) + ((Character.hashCode(this.I) + ((Character.hashCode(this.H) + ((Character.hashCode(this.G) + ((Character.hashCode(this.F) + ((Character.hashCode(this.E) + ((Character.hashCode(this.D) + hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("Strings(monthJanuaryFull=", this.a, ", monthFebruaryFull=", this.b, ", monthMarchFull=");
        k84.q(r, this.c, ", monthAprilFull=", this.d, ", monthMayFull=");
        k84.q(r, this.e, ", monthJuneFull=", this.f, ", monthJulyFull=");
        k84.q(r, this.g, ", monthAugustFull=", this.h, ", monthSeptemberFull=");
        k84.q(r, this.i, ", monthOctoberFull=", this.j, ", monthNovemberFull=");
        k84.q(r, this.k, ", monthDecemberFull=", this.l, ", monthJanuaryShort=");
        k84.q(r, this.m, ", monthFebruaryShort=", this.n, ", monthMarchShort=");
        k84.q(r, this.o, ", monthAprilShort=", this.p, ", monthMayShort=");
        k84.q(r, this.q, ", monthJuneShort=", this.r, ", monthJulyShort=");
        k84.q(r, this.s, ", monthAugustShort=", this.t, ", monthSeptemberShort=");
        k84.q(r, this.u, ", monthOctoberShort=", this.v, ", monthNovemberShort=");
        k84.q(r, this.w, ", monthDecemberShort=", this.x, ", timeAM=");
        k84.q(r, this.y, ", timePM=", this.z, ", yearSuffix=");
        k84.q(r, this.A, ", monthSuffix=", this.B, ", daySuffix=");
        r.append(this.C);
        r.append(", digit0=");
        r.append(this.D);
        r.append(", digit1=");
        r.append(this.E);
        r.append(", digit2=");
        r.append(this.F);
        r.append(", digit3=");
        r.append(this.G);
        r.append(", digit4=");
        r.append(this.H);
        r.append(", digit5=");
        r.append(this.I);
        r.append(", digit6=");
        r.append(this.J);
        r.append(", digit7=");
        r.append(this.K);
        r.append(", digit8=");
        r.append(this.L);
        r.append(", digit9=");
        r.append(this.M);
        r.append(")");
        return r.toString();
    }
}

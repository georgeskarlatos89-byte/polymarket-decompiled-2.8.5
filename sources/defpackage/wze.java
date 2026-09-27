package defpackage;

import com.polymarket.data.EUserPosition;
import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wze {
    public final String a;
    public final EUserPosition b;
    public final String c;
    public final String d;
    public final DesignTokens.PaletteColor e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final DesignTokens.PaletteColor l;
    public final String m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public wze(String str, EUserPosition eUserPosition, String str2, String str3, DesignTokens.PaletteColor paletteColor, String str4, String str5, String str6, String str7, String str8, String str9, DesignTokens.PaletteColor paletteColor2, String str10, String str11, boolean z, boolean z2, boolean z3) {
        k84.p(str, str2, str4, str5, str6);
        str7.getClass();
        str8.getClass();
        str9.getClass();
        paletteColor2.getClass();
        str10.getClass();
        this.a = str;
        this.b = eUserPosition;
        this.c = str2;
        this.d = str3;
        this.e = paletteColor;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = paletteColor2;
        this.m = str10;
        this.n = str11;
        this.o = z;
        this.p = z2;
        this.q = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wze) {
                wze wzeVar = (wze) obj;
                if (!Intrinsics.areEqual(this.a, wzeVar.a) || !Intrinsics.areEqual(this.b, wzeVar.b) || !Intrinsics.areEqual(this.c, wzeVar.c) || !Intrinsics.areEqual(this.d, wzeVar.d) || !Intrinsics.areEqual(this.e, wzeVar.e) || !Intrinsics.areEqual(this.f, wzeVar.f) || !Intrinsics.areEqual(this.g, wzeVar.g) || !Intrinsics.areEqual(this.h, wzeVar.h) || !Intrinsics.areEqual(this.i, wzeVar.i) || !Intrinsics.areEqual(this.j, wzeVar.j) || !Intrinsics.areEqual(this.k, wzeVar.k) || !Intrinsics.areEqual(this.l, wzeVar.l) || !Intrinsics.areEqual(this.m, wzeVar.m) || !Intrinsics.areEqual(this.n, wzeVar.n) || this.o != wzeVar.o || this.p != wzeVar.p || this.q != wzeVar.q) {
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
        int e = hdi.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        int i = 0;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        DesignTokens.PaletteColor paletteColor = this.e;
        if (paletteColor == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = paletteColor.hashCode();
        }
        int e2 = hdi.e((this.l.hashCode() + hdi.e(hdi.e(hdi.e(hdi.e(hdi.e(hdi.e((i2 + hashCode2) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m);
        String str2 = this.n;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Boolean.hashCode(this.q) + hdi.g(hdi.g((e2 + i) * 31, 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PositionStackRowModel(key=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", title=");
        k84.q(sb, this.c, ", sideLabel=", this.d, ", sideLabelColor=");
        sb.append(this.e);
        sb.append(", cost=");
        sb.append(this.f);
        sb.append(", toWin=");
        k84.q(sb, this.g, ", costLabel=", this.h, ", toWinLabel=");
        k84.q(sb, this.i, ", pnlPercent=", this.j, ", pnlCash=");
        sb.append(this.k);
        sb.append(", pnlColor=");
        sb.append(this.l);
        sb.append(", cashOutText=");
        k84.q(sb, this.m, ", liquidityLabel=", this.n, ", showsPnl=");
        hdi.B(sb, this.o, ", blursCashOut=", this.p, ", resolutionPending=");
        return ix2.r(sb, this.q, ")");
    }
}

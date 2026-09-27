package defpackage;

import com.polymarket.data.EAmount;
import com.polymarket.data.EQuantity;
import com.polymarket.data.ESide;
import com.polymarket.usviewmodels.OrderBookViewModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class h6b {
    public final int a;
    public final ESide b;
    public final EAmount c;
    public final EQuantity d;
    public final EAmount e;
    public final double f;
    public final int g;
    public final boolean h;
    public final String i;
    public final OrderBookViewModel.SideColor j;
    public final l78 k;
    public final int l;

    public h6b(int i, ESide eSide, EAmount eAmount, EQuantity eQuantity, EAmount eAmount2, double d, int i2, boolean z, String str, OrderBookViewModel.SideColor sideColor, l78 l78Var, int i3) {
        eSide.getClass();
        eAmount.getClass();
        eQuantity.getClass();
        eAmount2.getClass();
        str.getClass();
        sideColor.getClass();
        l78Var.getClass();
        this.a = i;
        this.b = eSide;
        this.c = eAmount;
        this.d = eQuantity;
        this.e = eAmount2;
        this.f = d;
        this.g = i2;
        this.h = z;
        this.i = str;
        this.j = sideColor;
        this.k = l78Var;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6b)) {
            return false;
        }
        h6b h6bVar = (h6b) obj;
        if (this.a == h6bVar.a && this.b == h6bVar.b && Intrinsics.areEqual(this.c, h6bVar.c) && Intrinsics.areEqual(this.d, h6bVar.d) && Intrinsics.areEqual(this.e, h6bVar.e) && Double.compare(this.f, h6bVar.f) == 0 && this.g == h6bVar.g && this.h == h6bVar.h && Intrinsics.areEqual(this.i, h6bVar.i) && Intrinsics.areEqual(this.j, h6bVar.j) && this.k == h6bVar.k && this.l == h6bVar.l) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + ((this.k.hashCode() + ((this.j.hashCode() + hdi.e(hdi.g(woa.b(this.g, hdi.c((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f), 31), 31, this.h), 31, this.i)) * 31)) * 31);
    }

    public final String toString() {
        return "LevelCellConfiguration(id=" + this.a + ", side=" + this.b + ", price=" + this.c + ", quantity=" + this.d + ", dollarValue=" + this.e + ", depthRatio=" + this.f + ", distanceFromSpread=" + this.g + ", showsSectionLabel=" + this.h + ", sectionLabelText=" + this.i + ", priceColor=" + this.j + ", flashState=" + this.k + ", placesAfterCents=" + this.l + ")";
    }
}
